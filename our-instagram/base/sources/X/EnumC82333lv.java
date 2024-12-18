package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC82333lv implements InterfaceC82343lw {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC82333lv[] A03;
    public static final EnumC82333lv A04;
    public static final EnumC82333lv A05;
    public static final EnumC82333lv A06;
    public static final EnumC82333lv A07;
    public static final EnumC82333lv A08;
    public static final EnumC82333lv A09;
    public final int A00;
    public final String A01;

    static {
        EnumC82333lv enumC82333lv = new EnumC82333lv(0, 0, "UNKNOWN", "unknown");
        A09 = enumC82333lv;
        EnumC82333lv enumC82333lv2 = new EnumC82333lv(1, 2131960380, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, NetInfoModule.CONNECTION_TYPE_NONE);
        A06 = enumC82333lv2;
        EnumC82333lv enumC82333lv3 = new EnumC82333lv(2, 2131960383, "SAVED_REPLY", "saved_reply");
        A08 = enumC82333lv3;
        EnumC82333lv enumC82333lv4 = new EnumC82333lv(3, 2131960378, "CATALOG", "catalog");
        A04 = enumC82333lv4;
        EnumC82333lv enumC82333lv5 = new EnumC82333lv(4, 2131960381, "PREVIOUS_REPLIES", "previous_messages");
        A07 = enumC82333lv5;
        EnumC82333lv enumC82333lv6 = new EnumC82333lv(5, 2131960379, "GENERAL", "general");
        A05 = enumC82333lv6;
        EnumC82333lv[] enumC82333lvArr = {enumC82333lv, enumC82333lv2, enumC82333lv3, enumC82333lv4, enumC82333lv5, enumC82333lv6, new EnumC82333lv(6, 2131960382, "SAVED_GREETING", "saved_greeting")};
        A03 = enumC82333lvArr;
        A02 = AbstractC12190kN.A00(enumC82333lvArr);
    }

    public static EnumC82333lv valueOf(String str) {
        return (EnumC82333lv) Enum.valueOf(EnumC82333lv.class, str);
    }

    public static EnumC82333lv[] values() {
        return (EnumC82333lv[]) A03.clone();
    }

    public EnumC82333lv(int i, int i2, String str, String str2) {
        this.A01 = str2;
        this.A00 = i2;
    }
}
