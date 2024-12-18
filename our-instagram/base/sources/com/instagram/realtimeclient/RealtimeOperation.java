package com.instagram.realtimeclient;

/* loaded from: classes11.dex */
public final class RealtimeOperation {
    public Type op;
    public String path;
    public String timestamp;
    public String value;

    /* loaded from: classes11.dex */
    public enum Type {
        add,
        remove,
        replace,
        notify
    }
}
