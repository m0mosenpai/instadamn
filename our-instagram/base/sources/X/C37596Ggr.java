package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ggr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37596Ggr {
    public final String A00;
    public final String A01;
    public final FragmentActivity A02;
    public final ClipsViewerConfig A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final MVO A06;
    public final InterfaceC43589JPu A07;
    public final C37716Gir A08;
    public final JI8 A09;
    public final IG5 A0A;
    public final C37671Gi4 A0B;
    public final C37560GgG A0C;

    public C37596Ggr(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, InterfaceC60442pS interfaceC60442pS, MVO mvo, InterfaceC43589JPu interfaceC43589JPu, C37716Gir c37716Gir, JI8 ji8, IG5 ig5, C37671Gi4 c37671Gi4, C37560GgG c37560GgG, String str, String str2) {
        C14360o3.A0B(interfaceC60442pS, 3);
        AbstractC167017dG.A1U(interfaceC43589JPu, c37671Gi4);
        AbstractC25234BEr.A0l(8, mvo, c37716Gir, ig5, userSession);
        AbstractC25229BEm.A1M(c37560GgG, 12, clipsViewerConfig);
        this.A02 = fragmentActivity;
        this.A09 = ji8;
        this.A05 = interfaceC60442pS;
        this.A00 = str;
        this.A01 = str2;
        this.A07 = interfaceC43589JPu;
        this.A0B = c37671Gi4;
        this.A06 = mvo;
        this.A08 = c37716Gir;
        this.A0A = ig5;
        this.A04 = userSession;
        this.A0C = c37560GgG;
        this.A03 = clipsViewerConfig;
    }

    public final void A00(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        InterfaceC84063oq interfaceC84063oq;
        String str;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C37716Gir c37716Gir = this.A08;
            UserSession userSession = this.A04;
            if (!AbstractC40917IAp.A00(userSession, c38321qM, c37716Gir)) {
                C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
                String A0j = AbstractC167017dG.A0j();
                String A0j2 = AbstractC167017dG.A0j();
                String str2 = null;
                if (A0u != null) {
                    interfaceC84063oq = A0u.Adx();
                    Long A04 = AbstractC117245Sj.A04(A0u);
                    if (A04 != null) {
                        InterfaceC60442pS interfaceC60442pS = this.A05;
                        EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0G;
                        long longValue = A04.longValue();
                        C38321qM c38321qM2 = c120985dq.A02;
                        long A06 = c37644Ghd.A06();
                        String CGJ = this.A07.CGJ();
                        String str3 = this.A0A.A00;
                        C8JW c8jw = C8JW.A09;
                        if (interfaceC84063oq != null) {
                            str = interfaceC84063oq.getBestAudioClusterId();
                        } else {
                            str = null;
                        }
                        AbstractC37670Gi3.A0K(enumC39652Hih, c8jw, interfaceC60442pS, userSession, c38321qM2, this.A03.A0S, null, Boolean.valueOf(AbstractC76643c9.A0K(c38321qM)), Boolean.valueOf(AbstractC37302Gc3.A1b(c38321qM)), null, A0j, CGJ, str3, A0j2, str, null, longValue, A06);
                    }
                } else {
                    interfaceC84063oq = null;
                }
                C37671Gi4.A00(this.A0B, C05F.A01);
                this.A06.A02();
                boolean z = !this.A0C.A0c(c120985dq);
                String str4 = c120985dq.A0Q;
                FragmentActivity fragmentActivity = this.A02;
                String str5 = this.A00;
                if (str5 == null) {
                    str5 = c120985dq.A0D();
                }
                String str6 = this.A01;
                if (str6 == null) {
                    str6 = str4;
                }
                if (interfaceC84063oq != null) {
                    str2 = interfaceC84063oq.getBestAudioClusterId();
                }
                AbstractC37834Gko.A00(fragmentActivity, null, c120985dq, userSession, c38321qM, A0j, str5, str6, str4, str2, A0j2, z);
                this.A09.AGM(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A04);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
