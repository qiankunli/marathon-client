package mesosphere.marathon.client.model.v2;

import java.util.Collection;

import mesosphere.client.common.ModelUtils;

public class Container {
	private String type;
	private Docker docker;
	private Collection<Port> portMappings;
	private Collection<Volume> volumes;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Docker getDocker() {
		return docker;
	}

	public void setDocker(Docker docker) {
		this.docker = docker;
	}

	public Collection<Port> getPortMappings() {
		return portMappings;
	}

	public void setPortMappings(Collection<port> portMappings) {
		this.portMappings = portMappings;
	}

	public Collection<Volume> getVolumes() {
		return volumes;
	}

	public void setVolumes(Collection<Volume> volumes) {
		this.volumes = volumes;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
