package X;

import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.Date;

/* renamed from: X.EwI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33792EwI {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        String A0i = AbstractC31180DnO.A0i(c6fw, 1);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, AbstractC58317Pt9.A00(3));
        C07270a1 c07270a1 = (C07270a1) A0B;
        Fragment A01 = C6BQ.A01(c6fq);
        C14360o3.A0C(A01, AbstractC43591JPw.A00(0));
        Date date = AccessToken.A0A;
        AccessToken accessToken = new AccessToken(C05F.A1F, A0e, C1L4.A02, A0i, EnumC61160RgL.A04.A00, null, null, new Date());
        CallerContext callerContext = EVQ.A0B;
        EVQ evq = new EVQ((AbstractC59962oe) A01, C6BQ.A08(c6fq), c07270a1, null, EnumC31713DwI.A0z, null);
        if (AbstractC31171DnF.A1b(accessToken.A06)) {
            AbstractC34349FCr.A00(c07270a1, "bloks_action_caa_complete_login_with_fb", "bloks_action_caa_complete_login_with_fb");
            return null;
        }
        double A00 = AbstractC31174DnI.A00(c07270a1, 0);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "facebook_auth_succeeded");
        A0f.A7v("fb4a_installed", Boolean.valueOf(AbstractC23851Es.A03()));
        A0f.AAP("referrer", "bloks_action_caa_complete_login_with_fb");
        AbstractC31177DnL.A1B(A0f, A00, A002);
        AbstractC31177DnL.A1G(A0f, "waterfall_id", C1Q9.A01(), A002);
        AbstractC31176DnK.A1K(A0f, A00);
        AbstractC31172DnG.A1N(A0f);
        AbstractC35274Fh9.A0C(A0f, c07270a1, OptSvcAnalyticsStore.LOGGING_KEY_STEP, "bloks_action_caa_complete_login_with_fb");
        AbstractC31178DnM.A13(A0f);
        AbstractC31171DnF.A19(A0f, "facebook");
        A0f.Cht();
        evq.A0B(c07270a1, A0i, A0e, false);
        return null;
    }
}
