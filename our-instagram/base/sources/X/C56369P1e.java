package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.P1e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56369P1e implements InterfaceC58044PoU {
    public final /* synthetic */ C62m A00;
    public final /* synthetic */ C131965xW A01;
    public final /* synthetic */ String A02;

    public C56369P1e(C62m c62m, C131965xW c131965xW, String str) {
        this.A01 = c131965xW;
        this.A00 = c62m;
        this.A02 = str;
    }

    @Override // X.InterfaceC58044PoU
    public final void DFf() {
        String str;
        boolean z;
        C62m c62m = this.A00;
        if (c62m != null) {
            c62m.DFf();
        }
        C131965xW c131965xW = this.A01;
        C131975xX c131975xX = C131965xW.A05;
        UserSession userSession = c131965xW.A02;
        C130135uJ A04 = c131965xW.A04();
        EnumC130125uI enumC130125uI = null;
        if (A04 != null) {
            str = A04.A04;
        } else {
            str = null;
        }
        String str2 = this.A02;
        C130135uJ A042 = c131965xW.A04();
        if (A042 != null) {
            z = A042.A05;
        } else {
            z = false;
        }
        C130135uJ A043 = c131965xW.A04();
        if (A043 != null) {
            enumC130125uI = A043.A01;
        }
        AbstractC130145uK.A02(userSession, "default_privacy_opt_in_mutation_failure", "", str, str2, String.valueOf(enumC130125uI), false, false, z);
    }

    @Override // X.InterfaceC58044PoU
    public final void onSuccess() {
        EnumC130115uH enumC130115uH;
        String str;
        boolean z;
        C131965xW c131965xW = this.A01;
        if (c131965xW.A04() != null) {
            C130135uJ A04 = c131965xW.A04();
            if (A04 != null) {
                A04.A00 = true;
            }
        } else {
            c131965xW.A0A(new C130135uJ(EnumC130125uI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, EnumC130115uH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "", "", true, false));
        }
        C130135uJ A042 = c131965xW.A04();
        if (A042 == null || (enumC130115uH = A042.A02) == null) {
            enumC130115uH = EnumC130115uH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
        UserSession userSession = c131965xW.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36322950739143438L)) {
            InterfaceC19610xo ARD = AbstractC46542Bs.A00(userSession).A04.ARD();
            ARD.E77("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", true);
            ARD.apply();
        }
        C62m c62m = this.A00;
        if (c62m != null) {
            c62m.onSuccess();
        }
        String obj = enumC130115uH.toString();
        C130135uJ A043 = c131965xW.A04();
        EnumC130125uI enumC130125uI = null;
        if (A043 != null) {
            str = A043.A04;
        } else {
            str = null;
        }
        String str2 = this.A02;
        C130135uJ A044 = c131965xW.A04();
        if (A044 != null) {
            z = A044.A05;
        } else {
            z = false;
        }
        C130135uJ A045 = c131965xW.A04();
        if (A045 != null) {
            enumC130125uI = A045.A01;
        }
        AbstractC130145uK.A02(userSession, "default_privacy_opt_in_mutation_success", obj, str, str2, String.valueOf(enumC130125uI), true, true, z);
    }
}
