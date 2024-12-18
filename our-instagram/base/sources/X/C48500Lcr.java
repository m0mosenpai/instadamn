package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Lcr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48500Lcr implements C3MR {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final G5I A02;
    public final C3o9 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C48500Lcr(UserSession userSession, G5I g5i, C3o9 c3o9, String str, String str2, String str3, boolean z) {
        AbstractC167007dF.A1H(userSession, 1, g5i);
        this.A00 = userSession;
        this.A03 = c3o9;
        this.A04 = str;
        this.A05 = str2;
        this.A07 = z;
        this.A06 = str3;
        this.A02 = g5i;
        this.A01 = AbstractC09440dt.A01(new C37054GUk(this, 0));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [X.1hU, X.1OW] */
    @Override // X.C3MR
    public final void Dih(long j) {
        String str;
        UserSession userSession = this.A00;
        if (!C14360o3.A0K(userSession.userId, this.A06)) {
            C3o9 c3o9 = this.A03;
            DirectThreadKey A02 = JRE.A02(c3o9);
            if (A02 != null) {
                C2DS A00 = AbstractC28761aE.A00(userSession);
                String str2 = this.A04;
                C83403nh BSh = A00.BSh(A02, str2);
                boolean z = false;
                if (BSh != null) {
                    DirectThreadKey A01 = JRE.A01(c3o9);
                    C14360o3.A0B(A01, 0);
                    String str3 = A01.A00;
                    String A0h = BSh.A0h();
                    C14360o3.A0A(A0h);
                    BSh.A0g();
                    C14360o3.A0B(A0h, 2);
                    String A0w = AbstractC43593JPy.A0w();
                    long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
                    C19260xA c19260xA = new C19260xA();
                    "direct_message_mark_waterfall".getClass();
                    C19280xC A012 = C19280xC.A01("direct_message_mark_waterfall", null);
                    A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "visual_item_screenshotted");
                    A012.A0C("client_context", A0w);
                    A012.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
                    A012.A0C("message_id", A0h);
                    A012.A0B("date_created", Long.valueOf(micros));
                    A012.A0C("action", "sent");
                    A012.A04(c19260xA);
                    AbstractC31173DnH.A1S(A012, userSession);
                    if (BSh.A1S()) {
                        LE3 le3 = (LE3) this.A01.getValue();
                        ?? c1ow = new C1OW(AbstractC31277Doz.A04(userSession, LCT.A00(userSession, A02), C33061hU.class, null, null, this.A07));
                        c1ow.A00 = A02;
                        if (str2 != null) {
                            String str4 = this.A05;
                            C45120Jxp c45120Jxp = BSh.A0D;
                            if (c45120Jxp != null && c45120Jxp.A06) {
                                z = true;
                            }
                            LE3.A00(new C49238Lpt(), c1ow, le3, A02, str4, z);
                            return;
                        }
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            if (c3o9 != null) {
                String str5 = this.A04;
                if (str5 != null && !JRE.A0A(c3o9)) {
                    G5I g5i = this.A02;
                    g5i.A00.A02(AbstractC31180DnO.A0I(C6JW.A00(g5i.A01, "MsysThreadActionsManager").A00.A02.A0L(new C48348LaO(Long.parseLong(str5), 5)), "tam_mark_visual_message_screenshotted"), C49790Lyx.A00);
                    return;
                }
                DirectThreadKey A013 = JRE.A01(c3o9);
                if (A013 != null) {
                    str = A013.A00;
                    String str6 = this.A04;
                    String str7 = this.A05;
                    boolean z2 = this.A07;
                    C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
                    A0q.A0R = true;
                    A0q.A05();
                    A0q.A0L("direct_v2/visual_threads/%s/items/%s/screenshot/", str, str6);
                    A0q.A0H("original_message_client_context", str7);
                    A0q.A0J("is_shh_mode", z2);
                    C1GJ.A03(AbstractC31172DnG.A0S(A0q, C40781ul.class, C55702hA.class));
                }
            }
            str = null;
            String str62 = this.A04;
            String str72 = this.A05;
            boolean z22 = this.A07;
            C25621Ms A0q2 = AbstractC25228BEl.A0q(userSession);
            A0q2.A0R = true;
            A0q2.A05();
            A0q2.A0L("direct_v2/visual_threads/%s/items/%s/screenshot/", str, str62);
            A0q2.A0H("original_message_client_context", str72);
            A0q2.A0J("is_shh_mode", z22);
            C1GJ.A03(AbstractC31172DnG.A0S(A0q2, C40781ul.class, C55702hA.class));
        }
    }
}
