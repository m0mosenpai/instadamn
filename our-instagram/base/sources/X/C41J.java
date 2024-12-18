package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.41J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41J {
    public InterfaceC16620sF A00;
    public final UserSession A01;
    public final C41A A02;
    public final C79293ga A03;

    public final C80033hs A00(C41H c41h, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(interfaceC60442pS, 0);
        C41A c41a = this.A02;
        C38321qM c38321qM = c41h.A0C;
        C75113Zb c75113Zb = c41h.A0E;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        return new C80033hs(c41a.A01, null, null, c38321qM, interfaceC60442pS, c75113Zb, c41a.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x010f, code lost:
    
        if (r8 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.content.Context r11, X.C41H r12, int r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41J.A01(android.content.Context, X.41H, int):void");
    }

    public final void A02(Context context, C41H c41h, InterfaceC60442pS interfaceC60442pS, Integer num, int i) {
        ImageUrl simpleImageUrl;
        C14360o3.A0B(c41h, 0);
        C14360o3.A0B(interfaceC60442pS, 2);
        int i2 = i + 1;
        C41A c41a = this.A02;
        C38321qM c38321qM = c41h.A0C;
        C14360o3.A0B(c38321qM, 0);
        if (i2 < c38321qM.A0p()) {
            C38321qM A1e = c38321qM.A1e(i2);
            if (A1e == null || (simpleImageUrl = A1e.A1q(context)) == null) {
                simpleImageUrl = new SimpleImageUrl("");
            }
            c41a.A00.A0J(simpleImageUrl, interfaceC60442pS.getModuleName()).A01();
        }
        if (num != null) {
            int i3 = i - 1;
            if (num != C05F.A00 || i3 < 0) {
                if (num != C05F.A01 || i2 >= c38321qM.A0p()) {
                    return;
                }
                i3 = i2;
                if (i2 < 0) {
                    return;
                }
            }
            C38321qM A1e2 = c38321qM.A1e(i3);
            if (A1e2 != null && A1e2.Cff()) {
                C75363a3 CFR = A1e2.CFR();
                InterfaceC16620sF interfaceC16620sF = this.A00;
                if (interfaceC16620sF != null) {
                    interfaceC16620sF.invoke(CFR, interfaceC60442pS.getModuleName());
                }
            }
        }
    }

    public final void A03(C41H c41h, C3VU c3vu, int i, int i2) {
        C38321qM c38321qM;
        C14360o3.A0B(c3vu, 0);
        C14360o3.A0B(c41h, 3);
        C38321qM c38321qM2 = c41h.A0C;
        C75113Zb c75113Zb = c41h.A0E;
        int i3 = c41h.A03;
        C38321qM A1e = c38321qM2.A1e(i);
        if (A1e == null) {
            C0w9.A03(AbstractC111324zv.A00(1544), AbstractC111324zv.A00(1542));
            return;
        }
        if (i2 >= 0) {
            c38321qM = c38321qM2.A1e(i2);
        } else {
            c38321qM = null;
        }
        c75113Zb.A0B(i);
        c3vu.D2a(c38321qM2, c38321qM, A1e, i3, i2, i);
    }

    public final void A04(C41H c41h, C3VU c3vu, C3Y7 c3y7, int i) {
        C14360o3.A0B(c3vu, 0);
        C14360o3.A0B(c41h, 3);
        C38321qM A1e = c41h.A0C.A1e(i);
        if (A1e != null) {
            c3vu.AmT().AmS().Dmg(A1e, null, c3y7, c41h.A0E, c41h.A03, i);
        }
    }

    public final void A05(C41H c41h, C3Y7 c3y7, C33P c33p) {
        C14360o3.A0B(c33p, 0);
        C14360o3.A0B(c3y7, 1);
        C14360o3.A0B(c41h, 2);
        C38321qM c38321qM = c41h.A0C;
        C75113Zb c75113Zb = c41h.A0E;
        c33p.A09(c38321qM, c3y7, c75113Zb, new C4QP(false, false, false, false), c75113Zb.A31);
    }

    public final void A06(C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 0);
        UserSession userSession = this.A02.A01;
        if (C3FU.A00(userSession)) {
            if (C3FU.A02(userSession, AbstractC43591JPw.A00(1072)) || C3FU.A02(userSession, AbstractC43591JPw.A00(1064))) {
                C1R0 C98 = C26661Qv.A00(userSession).C98();
                C14360o3.A07(C98);
                C5QE A00 = AbstractC47124KsJ.A00(C98, null);
                C30R c30r = C30R.A0A;
                C14360o3.A08(c30r);
                c75113Zb.A0H(A00, c30r, R.drawable.spinsta_data_white);
            }
        }
    }

    public C41J(UserSession userSession, C41A c41a, C79293ga c79293ga) {
        this.A02 = c41a;
        this.A03 = c79293ga;
        this.A01 = userSession;
    }
}
