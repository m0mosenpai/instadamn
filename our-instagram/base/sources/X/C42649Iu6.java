package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util.MutedWordsApiUtil;
import java.util.List;

/* renamed from: X.Iu6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42649Iu6 implements JG8 {
    public final /* synthetic */ C692539l A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ JG9 A02;
    public final /* synthetic */ C75113Zb A03;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JG8
    public final void D03(java.util.Set set, boolean z) {
        C14360o3.A0B(set, 1);
        if (z) {
            C692539l c692539l = this.A00;
            C1Y1 c1y1 = c692539l.A04;
            if (c1y1 != null) {
                c1y1.AHk();
            }
            C38321qM c38321qM = this.A01;
            List CCN = c692539l.A03.CCN();
            C14360o3.A07(CCN);
            int indexOf = CCN.indexOf(c38321qM);
            if (indexOf == -1) {
                indexOf = 0;
            }
            List subList = CCN.subList(indexOf, CCN.size());
            UserSession userSession = c692539l.A01;
            Fragment fragment = c692539l.A00;
            C1GL c1gl = (C1GL) fragment;
            C37484Gf2 c37484Gf2 = new C37484Gf2(3, subList, c692539l);
            C14360o3.A0B(c1gl, 1);
            C1ON A01 = MutedWordsApiUtil.A01(userSession, AbstractC001800i.A0a(set));
            A01.A00 = c37484Gf2;
            c1gl.schedule(A01);
            AbstractC40648I0g.A00(fragment.requireActivity(), userSession);
            ((C42657IuE) ((C685836v) c692539l.A02).A1V.getValue()).CMs(c38321qM, this.A03, null, null, 0, true, false);
            return;
        }
        JG9 jg9 = this.A02;
        if (jg9 == null) {
            return;
        }
        jg9.DI1(true, false);
    }

    public C42649Iu6(C692539l c692539l, C38321qM c38321qM, JG9 jg9, C75113Zb c75113Zb) {
        this.A00 = c692539l;
        this.A01 = c38321qM;
        this.A03 = c75113Zb;
        this.A02 = jg9;
    }
}
