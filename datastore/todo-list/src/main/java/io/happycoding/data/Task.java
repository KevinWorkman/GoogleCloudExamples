package io.happycoding.data;

public class Task {

  private String id;
  private String title;
  private long timestamp;

  public Task(String id, String title, long timestamp) {
    this.id = id;
    this.title = title;
    this.timestamp = timestamp;
  }
}
