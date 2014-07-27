package com.github.dockerjava.client.model.metric;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlkioStats {

	@JsonProperty("io_service_bytes_recursive")
	private BlkioStatEntry[] ioServiceBytesRecursive;
	
	@JsonProperty("io_serviced_recusrive")
	private BlkioStatEntry[] ioServicedRecursive;
	
	@JsonProperty("io_queue_recursive")
	private BlkioStatEntry[] ioQueuedRecursive;
	
	@JsonProperty("sectors_recursive")
	private BlkioStatEntry[] SectorsRecursive;

	public BlkioStatEntry[] getIoServiceBytesRecursive() {
		return ioServiceBytesRecursive;
	}

	public BlkioStatEntry[] getIoServicedRecursive() {
		return ioServicedRecursive;
	}

	public BlkioStatEntry[] getIoQueuedRecursive() {
		return ioQueuedRecursive;
	}

	public BlkioStatEntry[] getSectorsRecursive() {
		return SectorsRecursive;
	}

	@Override
	public String toString() {
		return "BlkioStats [ioServiceBytesRecursive="
				+ Arrays.toString(ioServiceBytesRecursive)
				+ ", ioServicedRecursive="
				+ Arrays.toString(ioServicedRecursive) + ", ioQueuedRecursive="
				+ Arrays.toString(ioQueuedRecursive) + ", SectorsRecursive="
				+ Arrays.toString(SectorsRecursive) + "]";
	}
}
