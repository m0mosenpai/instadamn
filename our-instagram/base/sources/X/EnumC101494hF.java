package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4hF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC101494hF {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC101494hF[] A01;
    public static final EnumC101494hF A02;
    public static final EnumC101494hF A03;
    public static final EnumC101494hF A04;
    public static final EnumC101494hF A05;
    public static final EnumC101494hF A06;
    public static final EnumC101494hF A07;
    public static final EnumC101494hF A08;
    public static final EnumC101494hF A09;
    public static final EnumC101494hF A0A;
    public static final EnumC101494hF A0B;

    static {
        EnumC101494hF enumC101494hF = new EnumC101494hF(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A05 = enumC101494hF;
        EnumC101494hF enumC101494hF2 = new EnumC101494hF("FRAGMENT_VISIBLE", 1);
        A03 = enumC101494hF2;
        EnumC101494hF enumC101494hF3 = new EnumC101494hF("USER_SCROLL_UP", 2);
        A0B = enumC101494hF3;
        EnumC101494hF enumC101494hF4 = new EnumC101494hF("SERVER_SEEN_CONTENT", 3);
        A07 = enumC101494hF4;
        EnumC101494hF enumC101494hF5 = new EnumC101494hF("LOCAL_STORE_SEEN_CONTENT", 4);
        A04 = enumC101494hF5;
        EnumC101494hF enumC101494hF6 = new EnumC101494hF("PHL_CACHE_SEEN_CONTENT", 5);
        A06 = enumC101494hF6;
        EnumC101494hF enumC101494hF7 = new EnumC101494hF("AD_DO_NOT_TRACK", 6);
        A02 = enumC101494hF7;
        EnumC101494hF enumC101494hF8 = new EnumC101494hF("UNKNOWN_FIRST_TIME_SEEN", 7);
        A08 = enumC101494hF8;
        EnumC101494hF enumC101494hF9 = new EnumC101494hF("UNKNOWN_SEEN_IN_CURRENT_SESSION", 8);
        A09 = enumC101494hF9;
        EnumC101494hF enumC101494hF10 = new EnumC101494hF("UNKNOWN_UNTRACK", 9);
        A0A = enumC101494hF10;
        EnumC101494hF[] enumC101494hFArr = {enumC101494hF, enumC101494hF2, enumC101494hF3, enumC101494hF4, enumC101494hF5, enumC101494hF6, enumC101494hF7, enumC101494hF8, enumC101494hF9, enumC101494hF10};
        A01 = enumC101494hFArr;
        A00 = AbstractC12190kN.A00(enumC101494hFArr);
    }

    public static EnumC101494hF valueOf(String str) {
        return (EnumC101494hF) Enum.valueOf(EnumC101494hF.class, str);
    }

    public static EnumC101494hF[] values() {
        return (EnumC101494hF[]) A01.clone();
    }

    public EnumC101494hF(String str, int i) {
    }
}
