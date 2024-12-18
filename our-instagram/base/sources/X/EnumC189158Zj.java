package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC189158Zj {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC189158Zj[] A01;
    public static final EnumC189158Zj A02;
    public static final EnumC189158Zj A03;
    public static final EnumC189158Zj A04;
    public static final EnumC189158Zj A05;
    public static final EnumC189158Zj A06;
    public static final EnumC189158Zj A07;

    static {
        EnumC189158Zj enumC189158Zj = new EnumC189158Zj("LANDING_PAGE", 0);
        A05 = enumC189158Zj;
        EnumC189158Zj enumC189158Zj2 = new EnumC189158Zj("EMPTY_TIMELINE", 1);
        A03 = enumC189158Zj2;
        EnumC189158Zj enumC189158Zj3 = new EnumC189158Zj("GALLERY", 2);
        A04 = enumC189158Zj3;
        EnumC189158Zj enumC189158Zj4 = new EnumC189158Zj("SELECTED_SEGMENTS_TIMELINE", 3);
        A07 = enumC189158Zj4;
        EnumC189158Zj enumC189158Zj5 = new EnumC189158Zj("PENDING_CAMERA_CLOSE", 4);
        A06 = enumC189158Zj5;
        EnumC189158Zj enumC189158Zj6 = new EnumC189158Zj("CLOSING", 5);
        A02 = enumC189158Zj6;
        EnumC189158Zj[] enumC189158ZjArr = {enumC189158Zj, enumC189158Zj2, enumC189158Zj3, enumC189158Zj4, enumC189158Zj5, enumC189158Zj6};
        A01 = enumC189158ZjArr;
        A00 = AbstractC12190kN.A00(enumC189158ZjArr);
    }

    public static EnumC189158Zj valueOf(String str) {
        return (EnumC189158Zj) Enum.valueOf(EnumC189158Zj.class, str);
    }

    public static EnumC189158Zj[] values() {
        return (EnumC189158Zj[]) A01.clone();
    }

    public EnumC189158Zj(String str, int i) {
    }
}
