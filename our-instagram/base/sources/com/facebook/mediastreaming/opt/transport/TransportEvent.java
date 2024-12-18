package com.facebook.mediastreaming.opt.transport;

import X.AbstractC12190kN;
import X.C62629SJm;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class TransportEvent {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ TransportEvent[] $VALUES;
    public static final TransportEvent CLOSED;
    public static final TransportEvent CONNECTED;
    public static final C62629SJm Companion;
    public static final TransportEvent FAILED;
    public static final TransportEvent LAGGING;
    public static final TransportEvent LIVE_DATA_SENT;
    public static final TransportEvent NONE;
    public static final TransportEvent RECONNECTING;
    public static final TransportEvent SLOW;
    public static final TransportEvent STREAMING;

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.SJm] */
    static {
        TransportEvent transportEvent = new TransportEvent("CONNECTED", 0);
        CONNECTED = transportEvent;
        TransportEvent transportEvent2 = new TransportEvent("STREAMING", 1);
        STREAMING = transportEvent2;
        TransportEvent transportEvent3 = new TransportEvent("LIVE_DATA_SENT", 2);
        LIVE_DATA_SENT = transportEvent3;
        TransportEvent transportEvent4 = new TransportEvent("SLOW", 3);
        SLOW = transportEvent4;
        TransportEvent transportEvent5 = new TransportEvent("LAGGING", 4);
        LAGGING = transportEvent5;
        TransportEvent transportEvent6 = new TransportEvent("RECONNECTING", 5);
        RECONNECTING = transportEvent6;
        TransportEvent transportEvent7 = new TransportEvent("FAILED", 6);
        FAILED = transportEvent7;
        TransportEvent transportEvent8 = new TransportEvent("CLOSED", 7);
        CLOSED = transportEvent8;
        TransportEvent transportEvent9 = new TransportEvent(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 8);
        NONE = transportEvent9;
        TransportEvent[] transportEventArr = {transportEvent, transportEvent2, transportEvent3, transportEvent4, transportEvent5, transportEvent6, transportEvent7, transportEvent8, transportEvent9};
        $VALUES = transportEventArr;
        $ENTRIES = AbstractC12190kN.A00(transportEventArr);
        Companion = new Object();
    }

    public static TransportEvent valueOf(String str) {
        return (TransportEvent) Enum.valueOf(TransportEvent.class, str);
    }

    public static TransportEvent[] values() {
        return (TransportEvent[]) $VALUES.clone();
    }

    public static final TransportEvent fromInt(int i) {
        return values()[i];
    }

    public TransportEvent(String str, int i) {
    }
}
