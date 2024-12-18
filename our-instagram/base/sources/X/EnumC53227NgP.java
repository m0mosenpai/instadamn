package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53227NgP {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53227NgP[] A02;
    public static final EnumC53227NgP A03;
    public static final EnumC53227NgP A04;
    public static final EnumC53227NgP A05;
    public static final EnumC53227NgP A06;
    public static final EnumC53227NgP A07;
    public final long A00;

    static {
        EnumC53227NgP enumC53227NgP = new EnumC53227NgP("SAVE", 0, 0L);
        A04 = enumC53227NgP;
        EnumC53227NgP enumC53227NgP2 = new EnumC53227NgP("PLAY", 1, 1L);
        A03 = enumC53227NgP2;
        EnumC53227NgP enumC53227NgP3 = new EnumC53227NgP("SAVE_V2", 2, 2L);
        A06 = enumC53227NgP3;
        EnumC53227NgP enumC53227NgP4 = new EnumC53227NgP("SAVE_AND_PLAY", 3, 3L);
        A05 = enumC53227NgP4;
        EnumC53227NgP enumC53227NgP5 = new EnumC53227NgP("SWIPE_TO_SAVE", 4, 4L);
        A07 = enumC53227NgP5;
        EnumC53227NgP[] enumC53227NgPArr = {enumC53227NgP, enumC53227NgP2, enumC53227NgP3, enumC53227NgP4, enumC53227NgP5};
        A02 = enumC53227NgPArr;
        A01 = AbstractC12190kN.A00(enumC53227NgPArr);
    }

    public static EnumC53227NgP valueOf(String str) {
        return (EnumC53227NgP) Enum.valueOf(EnumC53227NgP.class, str);
    }

    public static EnumC53227NgP[] values() {
        return (EnumC53227NgP[]) A02.clone();
    }

    public EnumC53227NgP(String str, int i, long j) {
        this.A00 = j;
    }
}
