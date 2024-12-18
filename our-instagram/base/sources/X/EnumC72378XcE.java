package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.XcE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72378XcE {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC72378XcE[] A03;
    public static final EnumC72378XcE A04;
    public static final EnumC72378XcE A05;
    public static final EnumC72378XcE A06;
    public static final EnumC72378XcE A07;
    public static final EnumC72378XcE A08;
    public static final EnumC72378XcE A09;
    public static final EnumC72378XcE A0A;
    public static final EnumC72378XcE A0B;
    public static final EnumC72378XcE A0C;
    public static final EnumC72378XcE A0D;
    public static final EnumC72378XcE A0E;
    public final XPI A00;
    public final String A01;

    static {
        EnumC72378XcE enumC72378XcE = new EnumC72378XcE(XPI.CLIENT_ACTION, "CLIENT_ACTION", "client_action", 0);
        A04 = enumC72378XcE;
        EnumC72378XcE enumC72378XcE2 = new EnumC72378XcE(XPI.EXECUTION_DONE, "EXECUTION_DONE", "execution_done", 1);
        A05 = enumC72378XcE2;
        EnumC72378XcE enumC72378XcE3 = new EnumC72378XcE(XPI.EXECUTION_FAILED, "EXECUTION_FAILED", "execution_failed", 2);
        A06 = enumC72378XcE3;
        EnumC72378XcE enumC72378XcE4 = new EnumC72378XcE(XPI.EXECUTION_START, "EXECUTION_START", "execution_start", 3);
        A07 = enumC72378XcE4;
        EnumC72378XcE enumC72378XcE5 = new EnumC72378XcE(XPI.FETCHING_CANCELLED, "FETCHING_CANCELLED", "fetching_cancelled", 4);
        A08 = enumC72378XcE5;
        EnumC72378XcE enumC72378XcE6 = new EnumC72378XcE(XPI.FETCHING_DONE, "FETCHING_DONE", "fetching_done", 5);
        A09 = enumC72378XcE6;
        EnumC72378XcE enumC72378XcE7 = new EnumC72378XcE(XPI.FETCHING_FAILED, "FETCHING_FAILED", "fetching_failed", 6);
        A0A = enumC72378XcE7;
        EnumC72378XcE enumC72378XcE8 = new EnumC72378XcE(XPI.FETCHING_START, "FETCHING_START", "fetching_start", 7);
        A0B = enumC72378XcE8;
        EnumC72378XcE enumC72378XcE9 = new EnumC72378XcE(XPI.RENDERING_DONE, "RENDERING_DONE", "rendering_done", 8);
        A0C = enumC72378XcE9;
        EnumC72378XcE enumC72378XcE10 = new EnumC72378XcE(XPI.RENDERING_FAILED, "RENDERING_FAILED", "rendering_failed", 9);
        A0D = enumC72378XcE10;
        EnumC72378XcE enumC72378XcE11 = new EnumC72378XcE(XPI.SCREEN_GENERATED, "SCREEN_GENERATED", "screen_generated", 10);
        A0E = enumC72378XcE11;
        EnumC72378XcE[] enumC72378XcEArr = {enumC72378XcE, enumC72378XcE2, enumC72378XcE3, enumC72378XcE4, enumC72378XcE5, enumC72378XcE6, enumC72378XcE7, enumC72378XcE8, enumC72378XcE9, enumC72378XcE10, enumC72378XcE11, new EnumC72378XcE(XPI.SCREEN_LOADED, "SCREEN_LOADED", "screen_loaded", 11)};
        A03 = enumC72378XcEArr;
        A02 = AbstractC12190kN.A00(enumC72378XcEArr);
    }

    public static EnumC72378XcE valueOf(String str) {
        return (EnumC72378XcE) Enum.valueOf(EnumC72378XcE.class, str);
    }

    public static EnumC72378XcE[] values() {
        return (EnumC72378XcE[]) A03.clone();
    }

    public EnumC72378XcE(XPI xpi, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = xpi;
    }
}
