package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.47R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47R {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C47R[] A03;
    public static final C47R A04;
    public static final C47R A05;
    public static final C47R A06;
    public static final C47R A07;
    public static final C47R A08;
    public static final C47R A09;
    public static final C47R A0A;
    public static final C47R A0B;
    public final String A00;

    static {
        C47R c47r = new C47R("SUGGESTED_USER", 0, "user_card");
        A0A = c47r;
        C47R c47r2 = new C47R("FBC_UPSELL", 1, "upsell_fbc_card");
        A07 = c47r2;
        C47R c47r3 = new C47R("CI_UPSELL", 2, "upsell_ci_card");
        A04 = c47r3;
        C47R c47r4 = new C47R("INVITE_UPSELL", 3, "upsell_invite_card");
        A08 = c47r4;
        C47R c47r5 = new C47R("SEE_ALL_SU_UPSELL", 4, "upsell_see_all_su_card");
        A09 = c47r5;
        C47R c47r6 = new C47R("COMPLETE_PROFILE_UPSELL", 5, "upsell_complete_profile_card");
        A05 = c47r6;
        C47R c47r7 = new C47R("DP_UPSELL", 6, "upsell_dp_card");
        A06 = c47r7;
        C47R c47r8 = new C47R("UNKNOWN", 7, "unknown");
        A0B = c47r8;
        C47R[] c47rArr = {c47r, c47r2, c47r3, c47r4, c47r5, c47r6, c47r7, c47r8};
        A03 = c47rArr;
        A02 = AbstractC12190kN.A00(c47rArr);
        A01 = new HashMap();
        for (C47R c47r9 : values()) {
            A01.put(c47r9.A00, c47r9);
        }
    }

    public static C47R valueOf(String str) {
        return (C47R) Enum.valueOf(C47R.class, str);
    }

    public static C47R[] values() {
        return (C47R[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public C47R(String str, int i, String str2) {
        this.A00 = str2;
    }
}
