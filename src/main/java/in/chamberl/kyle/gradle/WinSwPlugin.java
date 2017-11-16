package in.chamberl.kyle.gradle;

import org.gradle.api.NamedDomainObjectFactory;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class WinSwPlugin implements Plugin<Project> {
    private Project project;
    private NamedDomainObjectFactory<WinSwDefinition> extension;

    @Override
    public void apply(Project project) {
        this.project = project;

        this.extension = s -> new WinSwDefinition();

        this.project.container(WinSwDefinition.class, extension);
    }

}
