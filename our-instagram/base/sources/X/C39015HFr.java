package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.HFr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39015HFr extends C1P1 {
    public final /* synthetic */ C41141IJg A00;

    public C39015HFr(C41141IJg c41141IJg) {
        this.A00 = c41141IJg;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int i;
        int A03 = C0f9.A03(809539108);
        C14360o3.A0B(abstractC115105If, 0);
        C41141IJg c41141IJg = this.A00;
        C147156jr c147156jr = c41141IJg.A04;
        C147166js c147166js = c147156jr.A03;
        EnumC77173d3 enumC77173d3 = c41141IJg.A00;
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            str = A01.getMessage();
        } else {
            str = null;
        }
        C14360o3.A0B(enumC77173d3, 0);
        C1QT c1qt = c147166js.A00;
        EnumC77173d3 enumC77173d32 = EnumC77173d3.A02;
        if (enumC77173d3 == enumC77173d32) {
            i = 1629;
        } else {
            i = 1631;
        }
        c1qt.flowEndFail(18943093L, MSV.A00(i), str);
        if (abstractC115105If instanceof C115115Ig) {
            C38321qM c38321qM = c41141IJg.A01;
            if (enumC77173d3 == enumC77173d32) {
                enumC77173d32 = EnumC77173d3.A03;
            }
            c38321qM.A4C(enumC77173d32);
            C25671My A00 = AbstractC25651Mw.A00(c147156jr.A01);
            String id = c38321qM.getId();
            if (id != null) {
                A00.E4s(new C141936bC(enumC77173d3, id, true));
                c147156jr.A05.A0L(c41141IJg.A05);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C0f9.A0A(1214901866, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C145826hf c145826hf;
        String str;
        int A03 = C0f9.A03(-970890178);
        int A032 = C0f9.A03(327620507);
        C41141IJg c41141IJg = this.A00;
        C147156jr c147156jr = c41141IJg.A04;
        c147156jr.A05.A0L(c41141IJg.A05);
        c147156jr.A03.A00.flowEndSuccess(18943093L);
        if (c41141IJg.A01.CdW() && (c145826hf = c147156jr.A02) != null) {
            Reel reel = c41141IJg.A02;
            C41181vS c41181vS = c41141IJg.A03;
            EnumC77173d3 enumC77173d3 = c41141IJg.A00;
            C14360o3.A0B(enumC77173d3, 2);
            if (c41181vS.CdW()) {
                if (enumC77173d3 == EnumC77173d3.A02) {
                    str = "like";
                } else {
                    str = "unlike";
                }
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    UserSession userSession = c145826hf.A06;
                    C145836hg c145836hg = c145826hf.A0A;
                    c145836hg.A00 = reel;
                    C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, c145836hg, str);
                    C145826hf.A04(A0F, (C37948Gmq) c145826hf.A0I.get(c41181vS.CGe()), c145826hf);
                    C32U.A0C(userSession, A0F, c38321qM, c145836hg, null);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C0f9.A0A(-1891643108, A032);
        C0f9.A0A(-1122953468, A03);
    }
}
