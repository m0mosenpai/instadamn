package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P1f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56370P1f implements InterfaceC58044PoU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C131965xW A01;
    public final /* synthetic */ String A02;

    public C56370P1f(Context context, C131965xW c131965xW, String str) {
        this.A01 = c131965xW;
        this.A02 = str;
        this.A00 = context;
    }

    @Override // X.InterfaceC58044PoU
    public final void DFf() {
        EnumC130115uH enumC130115uH;
        String str;
        boolean z;
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_error_pano_outline_24);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(context, A0K, 2131962457);
        if (drawable != null) {
            A0K.A02();
            A0K.A08(drawable, AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_grey_03));
        }
        AbstractC31178DnM.A1S(A0K);
        C131965xW c131965xW = this.A01;
        C131975xX c131975xX = C131965xW.A05;
        UserSession userSession = c131965xW.A02;
        C130135uJ A04 = c131965xW.A04();
        EnumC130125uI enumC130125uI = null;
        if (A04 != null) {
            enumC130115uH = A04.A02;
        } else {
            enumC130115uH = null;
        }
        String valueOf = String.valueOf(enumC130115uH);
        C130135uJ A042 = c131965xW.A04();
        if (A042 != null) {
            str = A042.A04;
        } else {
            str = null;
        }
        String str2 = this.A02;
        boolean A00 = C196218mC.A00(userSession);
        C130135uJ A043 = c131965xW.A04();
        if (A043 != null) {
            z = A043.A05;
        } else {
            z = false;
        }
        C130135uJ A044 = c131965xW.A04();
        if (A044 != null) {
            enumC130125uI = A044.A01;
        }
        AbstractC130145uK.A02(userSession, "default_privacy_opt_in_mutation_failure", valueOf, str, str2, String.valueOf(enumC130125uI), false, A00, z);
    }

    @Override // X.InterfaceC58044PoU
    public final void onSuccess() {
        String str;
        EnumC130115uH enumC130115uH;
        boolean z;
        C131965xW c131965xW = this.A01;
        C131975xX c131975xX = C131965xW.A05;
        UserSession userSession = c131965xW.A02;
        C130135uJ A0Q = MSX.A0Q(userSession);
        EnumC130125uI enumC130125uI = null;
        if (A0Q != null) {
            str = A0Q.A04;
        } else {
            str = null;
        }
        String str2 = this.A02;
        boolean z2 = false;
        if ((str2 != null && str2.equals("share_sheet_share_button")) || ((str2 != null && str2.equals("video_feed_share_button")) || (str2 != null && str2.equals("share_later_share_button")))) {
            z2 = AbstractC31176DnK.A1a(C06090Tz.A05, userSession, 36318977894390585L);
        }
        if (!z2) {
            String A0b = AbstractC31177DnL.A0b(this.A00, String.valueOf(str), 2131962452);
            C146106i8 A0K = AbstractC31171DnF.A0K();
            A0K.A0L = false;
            A0K.A0D = A0b;
            C41451vu c41451vu = C41451vu.A01;
            A0K.A0L = false;
            AbstractC31178DnM.A1N(c41451vu, A0K);
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36322950739143438L)) {
            InterfaceC19610xo ARD = AbstractC46542Bs.A00(userSession).A04.ARD();
            ARD.E77("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", true);
            ARD.apply();
        }
        C130135uJ A04 = c131965xW.A04();
        if (A04 != null) {
            enumC130115uH = A04.A02;
        } else {
            enumC130115uH = null;
        }
        String valueOf = String.valueOf(enumC130115uH);
        boolean A00 = C196218mC.A00(userSession);
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
        AbstractC130145uK.A02(userSession, "default_privacy_opt_in_mutation_success", valueOf, str, str2, String.valueOf(enumC130125uI), true, A00, z);
    }
}
