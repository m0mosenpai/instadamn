package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2Dm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC46982Dm {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46982Dm[] A03;
    public static final EnumC46982Dm A04;
    public static final EnumC46982Dm A05;
    public static final EnumC46982Dm A06;
    public static final EnumC46982Dm A07;
    public final int A00;
    public final boolean A01;

    static {
        EnumC46982Dm enumC46982Dm = new EnumC46982Dm("INBOX", 0, 0, true);
        A05 = enumC46982Dm;
        EnumC46982Dm enumC46982Dm2 = new EnumC46982Dm("PENDING", 1, 1, false);
        A06 = enumC46982Dm2;
        EnumC46982Dm enumC46982Dm3 = new EnumC46982Dm("SPAM", 2, 3, false);
        A07 = enumC46982Dm3;
        EnumC46982Dm enumC46982Dm4 = new EnumC46982Dm("BC_PARTNERSHIP", 3, 16, true);
        A04 = enumC46982Dm4;
        EnumC46982Dm[] enumC46982DmArr = {enumC46982Dm, enumC46982Dm2, enumC46982Dm3, enumC46982Dm4};
        A03 = enumC46982DmArr;
        A02 = AbstractC12190kN.A00(enumC46982DmArr);
    }

    public static EnumC46982Dm valueOf(String str) {
        return (EnumC46982Dm) Enum.valueOf(EnumC46982Dm.class, str);
    }

    public static EnumC46982Dm[] values() {
        return (EnumC46982Dm[]) A03.clone();
    }

    public EnumC46982Dm(String str, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A01 = z;
    }
}
