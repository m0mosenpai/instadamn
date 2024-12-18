package X;

import kotlin.Deprecated;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated(message = "Use other types of abstract values")
/* renamed from: X.Xbw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72360Xbw {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC72360Xbw[] A01;
    public static final EnumC72360Xbw A02;
    public static final EnumC72360Xbw A03;
    public static final EnumC72360Xbw A04;
    public static final EnumC72360Xbw A05;
    public static final EnumC72360Xbw A06;
    public static final EnumC72360Xbw A07;

    static {
        EnumC72360Xbw enumC72360Xbw = new EnumC72360Xbw("ACCOUNT_TYPE", 0);
        A02 = enumC72360Xbw;
        EnumC72360Xbw enumC72360Xbw2 = new EnumC72360Xbw("BLOCKED_ACCOUNTS_COUNT", 1);
        A03 = enumC72360Xbw2;
        EnumC72360Xbw enumC72360Xbw3 = new EnumC72360Xbw("CLOSE_FRIENDS_COUNT", 2);
        A04 = enumC72360Xbw3;
        EnumC72360Xbw enumC72360Xbw4 = new EnumC72360Xbw("FAVORITES_COUNT", 3);
        A05 = enumC72360Xbw4;
        EnumC72360Xbw enumC72360Xbw5 = new EnumC72360Xbw("MUTED_ACCOUNTS_COUNT", 4);
        A06 = enumC72360Xbw5;
        EnumC72360Xbw enumC72360Xbw6 = new EnumC72360Xbw("RESTRICTED_COUNT", 5);
        A07 = enumC72360Xbw6;
        EnumC72360Xbw[] enumC72360XbwArr = {enumC72360Xbw, enumC72360Xbw2, enumC72360Xbw3, enumC72360Xbw4, enumC72360Xbw5, enumC72360Xbw6};
        A01 = enumC72360XbwArr;
        A00 = AbstractC12190kN.A00(enumC72360XbwArr);
    }

    public static EnumC72360Xbw valueOf(String str) {
        return (EnumC72360Xbw) Enum.valueOf(EnumC72360Xbw.class, str);
    }

    public static EnumC72360Xbw[] values() {
        return (EnumC72360Xbw[]) A01.clone();
    }

    public EnumC72360Xbw(String str, int i) {
    }
}
