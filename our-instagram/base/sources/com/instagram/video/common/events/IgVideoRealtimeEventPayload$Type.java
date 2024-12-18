package com.instagram.video.common.events;

import X.AbstractC12190kN;
import X.C14360o3;
import X.C54251NyW;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class IgVideoRealtimeEventPayload$Type {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ IgVideoRealtimeEventPayload$Type[] $VALUES;
    public static final C54251NyW Companion;
    public static final IgVideoRealtimeEventPayload$Type JOIN = new IgVideoRealtimeEventPayload$Type("JOIN", 0);
    public static final IgVideoRealtimeEventPayload$Type SERVER_MEDIA_UPDATE = new IgVideoRealtimeEventPayload$Type("SERVER_MEDIA_UPDATE", 1);
    public static final IgVideoRealtimeEventPayload$Type HANGUP = new IgVideoRealtimeEventPayload$Type("HANGUP", 2);
    public static final IgVideoRealtimeEventPayload$Type ICE_CANDIDATE = new IgVideoRealtimeEventPayload$Type("ICE_CANDIDATE", 3);
    public static final IgVideoRealtimeEventPayload$Type RING = new IgVideoRealtimeEventPayload$Type("RING", 4);
    public static final IgVideoRealtimeEventPayload$Type DISMISS = new IgVideoRealtimeEventPayload$Type("DISMISS", 5);
    public static final IgVideoRealtimeEventPayload$Type CONFERENCE_STATE = new IgVideoRealtimeEventPayload$Type("CONFERENCE_STATE", 6);
    public static final IgVideoRealtimeEventPayload$Type ADD_PARTICIPANTS = new IgVideoRealtimeEventPayload$Type("ADD_PARTICIPANTS", 7);
    public static final IgVideoRealtimeEventPayload$Type SUBSCRIPTION = new IgVideoRealtimeEventPayload$Type("SUBSCRIPTION", 8);
    public static final IgVideoRealtimeEventPayload$Type CLIENT_MEDIA_UPDATE = new IgVideoRealtimeEventPayload$Type("CLIENT_MEDIA_UPDATE", 9);
    public static final IgVideoRealtimeEventPayload$Type DATA_MESSAGE = new IgVideoRealtimeEventPayload$Type("DATA_MESSAGE", 10);
    public static final IgVideoRealtimeEventPayload$Type REMOVE_PARTICIPANTS = new IgVideoRealtimeEventPayload$Type("REMOVE_PARTICIPANTS", 11);
    public static final IgVideoRealtimeEventPayload$Type EXPERIMENT = new IgVideoRealtimeEventPayload$Type("EXPERIMENT", 12);
    public static final IgVideoRealtimeEventPayload$Type P2P_PROTOCOL = new IgVideoRealtimeEventPayload$Type("P2P_PROTOCOL", 13);
    public static final IgVideoRealtimeEventPayload$Type P2P_ANSWER = new IgVideoRealtimeEventPayload$Type("P2P_ANSWER", 14);
    public static final IgVideoRealtimeEventPayload$Type P2P_ICE_CANDIDATE = new IgVideoRealtimeEventPayload$Type("P2P_ICE_CANDIDATE", 15);
    public static final IgVideoRealtimeEventPayload$Type UNKNOWN = new IgVideoRealtimeEventPayload$Type("UNKNOWN", 16);

    public static final /* synthetic */ IgVideoRealtimeEventPayload$Type[] $values() {
        return new IgVideoRealtimeEventPayload$Type[]{JOIN, SERVER_MEDIA_UPDATE, HANGUP, ICE_CANDIDATE, RING, DISMISS, CONFERENCE_STATE, ADD_PARTICIPANTS, SUBSCRIPTION, CLIENT_MEDIA_UPDATE, DATA_MESSAGE, REMOVE_PARTICIPANTS, EXPERIMENT, P2P_PROTOCOL, P2P_ANSWER, P2P_ICE_CANDIDATE, UNKNOWN};
    }

    public static final IgVideoRealtimeEventPayload$Type fromServerValue(String str) {
        C14360o3.A0B(str, 0);
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return UNKNOWN;
        }
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.NyW, java.lang.Object] */
    static {
        IgVideoRealtimeEventPayload$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
        Companion = new Object();
    }

    public static IgVideoRealtimeEventPayload$Type valueOf(String str) {
        return (IgVideoRealtimeEventPayload$Type) Enum.valueOf(IgVideoRealtimeEventPayload$Type.class, str);
    }

    public static IgVideoRealtimeEventPayload$Type[] values() {
        return (IgVideoRealtimeEventPayload$Type[]) $VALUES.clone();
    }

    public IgVideoRealtimeEventPayload$Type(String str, int i) {
    }
}
