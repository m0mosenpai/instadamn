package X;

import android.content.Context;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;

/* renamed from: X.EZx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32673EZx extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32673EZx(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        super(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        C18240vB c18240vB = AbstractC55762hH.A01;
        C18720vz c18720vz = AbstractC12960li.A00;
        String string = AbstractC31172DnG.A0q(c18720vz).getString("fb_attribution_id", null);
        String string2 = AbstractC31172DnG.A0q(c18720vz).getString("google_ad_id", null);
        if (string == null || string2 == null) {
            C62910SWr A00 = C62910SWr.A00(context);
            if (A00 == null) {
                C0w9.A03("family-bridges", "failed to fetch AttributionIdentifiers");
            } else {
                if (A00.A02 != null) {
                    C19740y2 A002 = AbstractC19730y1.A00(c18720vz);
                    AbstractC31176DnK.A1X(A002.A00, "fb_attribution_id", A00.A02);
                }
                if (A00.A01 != null) {
                    C19740y2 A003 = AbstractC19730y1.A00(c18720vz);
                    AbstractC31176DnK.A1X(A003.A00, "google_ad_id", A00.A01);
                }
                C19740y2 A004 = AbstractC19730y1.A00(c18720vz);
                boolean z = A00.A03;
                InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A004);
                A0P.E77("opt_out_ads", z);
                A0P.apply();
            }
        }
        C19280xC A005 = C19280xC.A00(this.A01, "open_family_app");
        A005.A0C("source_surface", this.A07);
        A005.A0C(AbstractC111324zv.A00(870), "fb_homepage");
        A005.A0C(AbstractC111324zv.A00(2238), this.A03);
        A005.A0C(AbstractC111324zv.A00(957), this.A04);
        A005.A0C("fb_attribution_id", AbstractC31172DnG.A0q(c18720vz).getString("fb_attribution_id", null));
        A005.A0C("google_ad_id", AbstractC31172DnG.A0q(c18720vz).getString("google_ad_id", null));
        A005.A09("opt_out_ads", Boolean.valueOf(AbstractC31172DnG.A1a(AbstractC31172DnG.A0q(c18720vz), "opt_out_ads")));
        String str = this.A05;
        String A006 = AbstractC111324zv.A00(2748);
        if (str != null) {
            A005.A0C(A006, str);
        }
        String str2 = this.A06;
        if (str2 != null) {
            A005.A0C("netego_tracking_token", str2);
        }
        AbstractC31173DnH.A1S(A005, this.A02);
    }
}
