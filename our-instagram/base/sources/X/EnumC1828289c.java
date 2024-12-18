package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.89c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1828289c {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC1828289c[] A01;
    public static final EnumC1828289c A02;
    public static final EnumC1828289c A03;
    public static final EnumC1828289c A04;
    public static final EnumC1828289c A05;
    public static final EnumC1828289c A06;
    public static final EnumC1828289c A07;

    static {
        EnumC1828289c enumC1828289c = new EnumC1828289c("INIT", 0);
        A03 = enumC1828289c;
        EnumC1828289c enumC1828289c2 = new EnumC1828289c("LANDING_PAGE_PLAYBACK", 1);
        A04 = enumC1828289c2;
        EnumC1828289c enumC1828289c3 = new EnumC1828289c("BUILDER_PLAYBACK", 2);
        A02 = enumC1828289c3;
        EnumC1828289c enumC1828289c4 = new EnumC1828289c("PAUSED", 3);
        A06 = enumC1828289c4;
        EnumC1828289c enumC1828289c5 = new EnumC1828289c("LOADING", 4);
        A05 = enumC1828289c5;
        EnumC1828289c enumC1828289c6 = new EnumC1828289c("UNINITIALIZED", 5);
        A07 = enumC1828289c6;
        EnumC1828289c[] enumC1828289cArr = {enumC1828289c, enumC1828289c2, enumC1828289c3, enumC1828289c4, enumC1828289c5, enumC1828289c6};
        A01 = enumC1828289cArr;
        A00 = AbstractC12190kN.A00(enumC1828289cArr);
    }

    public static EnumC1828289c valueOf(String str) {
        return (EnumC1828289c) Enum.valueOf(EnumC1828289c.class, str);
    }

    public static EnumC1828289c[] values() {
        return (EnumC1828289c[]) A01.clone();
    }

    public EnumC1828289c(String str, int i) {
    }
}
