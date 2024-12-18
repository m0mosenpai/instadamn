package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7DI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DI {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7DI[] A01;
    public static final C7DI A02;
    public static final C7DI A03;
    public static final C7DI A04;
    public static final C7DI A05;
    public static final C7DI A06;
    public static final C7DI A07;
    public static final C7DI A08;
    public static final C7DI A09;
    public static final C7DI A0A;
    public static final C7DI A0B;
    public static final C7DI A0C;
    public static final C7DI A0D;
    public static final C7DI A0E;
    public static final C7DI A0F;
    public static final C7DI A0G;
    public static final C7DI A0H;
    public static final C7DI A0I;
    public static final C7DI A0J;
    public static final C7DI A0K;
    public static final C7DI A0L;

    static {
        C7DI c7di = new C7DI("PERMISSIONS", 0);
        A0E = c7di;
        C7DI c7di2 = new C7DI("PERMISSIONS_THREAD", 1);
        A0F = c7di2;
        C7DI c7di3 = new C7DI("DISABLED", 2);
        A06 = c7di3;
        C7DI c7di4 = new C7DI("THREAD", 3);
        A0K = c7di4;
        C7DI c7di5 = new C7DI("BLOCKED", 4);
        A03 = c7di5;
        C7DI c7di6 = new C7DI("FEATURE_LIMITED", 5);
        A0A = c7di6;
        C7DI c7di7 = new C7DI("ENFORCEMENT_NOTICE", 6);
        A08 = c7di7;
        C7DI c7di8 = new C7DI("ARMADILLO_PROFESSIONAL_FEATURE_LIMITED", 7);
        A02 = c7di8;
        C7DI c7di9 = new C7DI("PROFESSIONAL_HMPS_LIMITED", 8);
        A0G = c7di9;
        C7DI c7di10 = new C7DI("BROADCAST_CHAT_LIMITED", 9);
        A04 = c7di10;
        C7DI c7di11 = new C7DI("SOCIAL_CHAT_LIMITED", 10);
        A0J = c7di11;
        C7DI c7di12 = new C7DI("NULL_THREAD_LIMITED", 11);
        A0D = c7di12;
        C7DI c7di13 = new C7DI("DISABLED_OLD_BUILDS", 12);
        A07 = c7di13;
        C7DI c7di14 = new C7DI("XAC_READ_ONLY", 13);
        A0L = c7di14;
        C7DI c7di15 = new C7DI("EPHEMERAL_MODE_DISABLED_COMPOSER", 14);
        A09 = c7di15;
        C7DI c7di16 = new C7DI("DELETE_MESSAGE", 15);
        A05 = c7di16;
        C7DI c7di17 = new C7DI("REACHABILITY_COMPOSER_BLOCK", 16);
        A0H = c7di17;
        C7DI c7di18 = new C7DI("META_AI_NUX_COMPOSER_BLOCK", 17);
        A0C = c7di18;
        C7DI c7di19 = new C7DI("LIGHTWEIGHT_INTERVENTION_AND_APPEAL_COMPOSER_BLOCK", 18);
        A0B = c7di19;
        C7DI c7di20 = new C7DI("REACHABLE_USER_COMPOSER_BLOCK", 19);
        A0I = c7di20;
        C7DI[] c7diArr = {c7di, c7di2, c7di3, c7di4, c7di5, c7di6, c7di7, c7di8, c7di9, c7di10, c7di11, c7di12, c7di13, c7di14, c7di15, c7di16, c7di17, c7di18, c7di19, c7di20};
        A01 = c7diArr;
        A00 = AbstractC12190kN.A00(c7diArr);
    }

    public static C7DI valueOf(String str) {
        return (C7DI) Enum.valueOf(C7DI.class, str);
    }

    public static C7DI[] values() {
        return (C7DI[]) A01.clone();
    }

    public C7DI(String str, int i) {
    }
}
