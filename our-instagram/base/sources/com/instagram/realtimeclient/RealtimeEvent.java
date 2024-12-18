package com.instagram.realtimeclient;

import X.AbstractC166987dD;
import com.instagram.realtimeclient.DirectRealtimePayload;
import java.util.List;

/* loaded from: classes11.dex */
public final class RealtimeEvent {
    public DirectRealtimePayload.Action action;
    public Integer code;
    public String id;
    public double interval;
    public String message;
    public boolean mustRefresh;
    public List operations;
    public DirectRealtimePayload payload;
    public String sequence;
    public String status;
    public Integer statusCode;
    public String topic;
    public Type type;

    /* loaded from: classes10.dex */
    public enum Type {
        SUBSCRIBED("subscribed"),
        UNSUBSCRIBED("unsubscribed"),
        KEEPALIVE("keepalive"),
        PATCH("patch"),
        ACK("broadcast-ack"),
        ERROR("error");

        public String mServerValue;

        public String getServerValue() {
            return this.mServerValue;
        }

        Type(String str) {
            this.mServerValue = str;
        }

        public static Type fromServerValue(String str) {
            for (Type type : values()) {
                if (type.getServerValue().equals(str)) {
                    return type;
                }
            }
            throw AbstractC166987dD.A12("Unrecognized event type");
        }
    }

    public static int compareSequences(String str, String str2) {
        if (str == null) {
            if (str2 != null) {
                return -1;
            }
            return 0;
        }
        if (str2 == null) {
            return 1;
        }
        int length = str.length() - str2.length();
        if (length != 0) {
            return length;
        }
        return str.compareTo(str2);
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }
}
