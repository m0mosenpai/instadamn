package com.instagram.common.notifications.push.intf;

import X.AbstractC12190kN;
import X.AbstractC16960so;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.BaseJavaModule;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PushChannelType {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PushChannelType[] A03;
    public static final PushChannelType A04;
    public static final PushChannelType A05;
    public static final PushChannelType A06;
    public static final PushChannelType A07;
    public static final PushChannelType A08;
    public static final PushChannelType A09;
    public static final PushChannelType A0A;
    public static final PushChannelType A0B;
    public static final PushChannelType A0C;
    public static final PushChannelType A0D;
    public static final PushChannelType A0E;

    @Deprecated(message = "multiple sync path sources now exist: IRIS, MEM")
    public static final PushChannelType A0F;
    public final String A00;
    public final String A01;

    static {
        PushChannelType pushChannelType = new PushChannelType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, NetInfoModule.CONNECTION_TYPE_NONE, null, 0);
        A0D = pushChannelType;
        PushChannelType pushChannelType2 = new PushChannelType("AMAZON", "android_adm", null, 1);
        A04 = pushChannelType2;
        PushChannelType pushChannelType3 = new PushChannelType("GCM", "android_gcm", "☁", 2);
        A07 = pushChannelType3;
        PushChannelType pushChannelType4 = new PushChannelType("FBNS", "android_mqtt", "⚡", 3);
        A05 = pushChannelType4;
        PushChannelType pushChannelType5 = new PushChannelType("NOKIA", "android_nokia", null, 4);
        A0C = pushChannelType5;
        PushChannelType pushChannelType6 = new PushChannelType("FCM", "android_fcm", "🔥", 5);
        A06 = pushChannelType6;
        PushChannelType pushChannelType7 = new PushChannelType("MSYS", "msys", "🚀", 6);
        A0B = pushChannelType7;
        PushChannelType pushChannelType8 = new PushChannelType("LOCAL", "local", null, 7);
        A09 = pushChannelType8;
        PushChannelType pushChannelType9 = new PushChannelType("REALTIME_LOCAL_NOTIFICATION", "realtime_local_notification", null, 8);
        A0E = pushChannelType9;
        PushChannelType pushChannelType10 = new PushChannelType("SYNC", BaseJavaModule.METHOD_TYPE_SYNC, null, 9);
        A0F = pushChannelType10;
        PushChannelType pushChannelType11 = new PushChannelType("MEM", "mem", "🌀", 10);
        A0A = pushChannelType11;
        PushChannelType pushChannelType12 = new PushChannelType("IRIS", "iris", "👁️", 11);
        A08 = pushChannelType12;
        PushChannelType[] pushChannelTypeArr = {pushChannelType, pushChannelType2, pushChannelType3, pushChannelType4, pushChannelType5, pushChannelType6, pushChannelType7, pushChannelType8, pushChannelType9, pushChannelType10, pushChannelType11, pushChannelType12};
        A03 = pushChannelTypeArr;
        A02 = AbstractC12190kN.A00(pushChannelTypeArr);
    }

    public static PushChannelType valueOf(String str) {
        return (PushChannelType) Enum.valueOf(PushChannelType.class, str);
    }

    public static PushChannelType[] values() {
        return (PushChannelType[]) A03.clone();
    }

    public final boolean A00() {
        return AbstractC16960so.A1Q(A04, A07, A05, A0C, A06).contains(this);
    }

    public PushChannelType(String str, String str2, String str3, int i) {
        this.A01 = str2;
        this.A00 = str3;
    }
}
