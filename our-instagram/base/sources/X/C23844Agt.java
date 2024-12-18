package X;

import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.List;

/* renamed from: X.Agt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23844Agt implements InterfaceC25182BCf {
    public final String A00;
    public final UserSession A01;
    public final AbstractC24481Hr A02;
    public final AbstractC24481Hr A03;
    public final C8r2 A04;
    public final C8MW A05;
    public final ACA A06;
    public final C9ZH A07;
    public final FilterGroupModel A08;
    public final DirectCameraViewModel A09;
    public final C211689Zc A0A;
    public final A8X A0B;
    public final A96 A0C;
    public final C188538Ws A0D;
    public final C195868lW A0E;
    public final Boolean A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;
    public final boolean A0P;

    @Override // X.InterfaceC25182BCf
    public final String BOH() {
        return this.A00;
    }

    @Override // X.InterfaceC25182BCf
    public final A5Y ENf(C26086BgF c26086BgF, String str, boolean z) {
        if (z) {
            C8M0.A00(this.A01).A00(this.A06.A00, this.A09, this.A0A, Integer.valueOf(this.A0E.A0F), C05F.A1I, this.A00);
        }
        C8MW c8mw = this.A05;
        C195868lW c195868lW = this.A0E;
        C8r2 c8r2 = this.A04;
        AbstractC24481Hr abstractC24481Hr = this.A02;
        AbstractC24481Hr abstractC24481Hr2 = this.A03;
        A8X a8x = this.A0B;
        boolean z2 = this.A0P;
        ACA aca = this.A06;
        C211689Zc c211689Zc = this.A0A;
        A96 a96 = this.A0C;
        C188538Ws c188538Ws = this.A0D;
        String str2 = this.A0L;
        String str3 = this.A0K;
        String str4 = this.A0J;
        String str5 = this.A0G;
        List list = this.A0M;
        List list2 = this.A0N;
        String str6 = this.A0H;
        Boolean bool = this.A0F;
        String str7 = this.A0I;
        return c8mw.A02(c26086BgF, abstractC24481Hr, abstractC24481Hr2, c8r2, aca, this.A07, c211689Zc, a8x, a96, c188538Ws, c195868lW, bool, null, str2, str3, str4, str5, str6, str7, this.A00, str, list, list2, z2, this.A0O);
    }

    public C23844Agt(UserSession userSession, AbstractC24481Hr abstractC24481Hr, AbstractC24481Hr abstractC24481Hr2, C8r2 c8r2, C8MW c8mw, ACA aca, C9ZH c9zh, FilterGroupModel filterGroupModel, DirectCameraViewModel directCameraViewModel, C211689Zc c211689Zc, A8X a8x, A96 a96, C188538Ws c188538Ws, C195868lW c195868lW, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, boolean z, boolean z2) {
        AbstractC167017dG.A1P(userSession, c8mw);
        C14360o3.A0B(aca, 9);
        C14360o3.A0B(str7, 25);
        this.A01 = userSession;
        this.A05 = c8mw;
        this.A0E = c195868lW;
        this.A04 = c8r2;
        this.A02 = abstractC24481Hr;
        this.A03 = abstractC24481Hr2;
        this.A0B = a8x;
        this.A0P = z;
        this.A06 = aca;
        this.A0A = c211689Zc;
        this.A0C = a96;
        this.A0D = c188538Ws;
        this.A0L = str;
        this.A0K = str2;
        this.A0J = str3;
        this.A0G = str4;
        this.A08 = filterGroupModel;
        this.A0M = list;
        this.A0N = list2;
        this.A0H = str5;
        this.A0F = bool;
        this.A0I = str6;
        this.A07 = c9zh;
        this.A0O = z2;
        this.A00 = str7;
        this.A09 = directCameraViewModel;
    }
}
