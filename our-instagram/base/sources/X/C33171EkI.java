package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.user.model.User;

/* renamed from: X.EkI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33171EkI extends AbstractC86353t7 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C33171EkI(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, X.1vN] */
    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DB6() {
        switch (this.A00) {
            case 0:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                C38321qM c38321qM = directShareSheetFragment.A0d;
                if (c38321qM != null) {
                    AbstractC40912IAk.A00((Context) this.A02, new C35933Ftr(this), directShareSheetFragment.A0H, c38321qM);
                    return;
                }
                C0w9.A03("DirectShareSheetFrag", "No media found for save passed through");
                return;
            case 1:
                ((Activity) this.A02).onBackPressed();
                return;
            case 2:
                UserSession userSession = (UserSession) this.A01;
                boolean A01 = C3FU.A01(userSession, AbstractC23021Ah.A00(userSession));
                InterfaceC37144GYf interfaceC37144GYf = (InterfaceC37144GYf) this.A02;
                if (A01) {
                    return;
                }
                interfaceC37144GYf.CyV();
                return;
            default:
                C37608Gh3 c37608Gh3 = (C37608Gh3) this.A02;
                UserSession userSession2 = c37608Gh3.A0B;
                C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                InterfaceC16530ry interfaceC16530ry = A00.A3G;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 375) && !AbstractC167017dG.A1b(A00, A00.A5k, c0yrArr, 374)) {
                    InterfaceC60442pS interfaceC60442pS = c37608Gh3.A0C;
                    C38321qM c38321qM2 = c37608Gh3.A02;
                    String str = null;
                    if (c38321qM2 != null) {
                        String id = c38321qM2.getId();
                        C38321qM c38321qM3 = c37608Gh3.A02;
                        if (c38321qM3 != null) {
                            User A2E = c38321qM3.A2E(userSession2);
                            if (A2E != null) {
                                str = A2E.getId();
                            }
                            AbstractC73317Y7a.A0B(interfaceC60442pS, userSession2, id, str, AbstractC111324zv.A00(4103));
                            AbstractC25651Mw.A00(userSession2).E4s(new Object());
                        }
                    }
                    C14360o3.A0F("media");
                    throw C00O.createAndThrow();
                }
                AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, 375, false);
                A00.A0Q();
                c37608Gh3.A0H.A00();
                AbstractC56932jR.A06((View) this.A01, 1000L);
                return;
        }
    }
}
