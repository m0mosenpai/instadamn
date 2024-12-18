package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G77 implements InterfaceC37121GXg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public G77(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A04 = obj;
        this.A01 = obj2;
        this.A03 = obj5;
    }

    @Override // X.InterfaceC37121GXg
    public final void D7j() {
        switch (this.A00) {
            case 0:
                RectF rectF = (RectF) this.A04;
                if (rectF == null) {
                    return;
                }
                JR2.A0D(rectF, (JR2) this.A05, (C7TT) this.A01, null, (DirectShareTarget) this.A02, (C3o9) this.A03);
                return;
            case 1:
                JR2 jr2 = (JR2) this.A05;
                UserSession A0p = jr2.A0p();
                DirectShareTarget directShareTarget = (DirectShareTarget) this.A02;
                if (directShareTarget != null) {
                    JR2.A0B((RectF) this.A04, (C22P) this.A01, jr2, LKW.A04(A0p, directShareTarget), (C3o9) this.A03);
                    return;
                }
                throw AbstractC166997dE.A0g();
            default:
                C31606DuY.A00((C31446Drq) this.A03, (C31606DuY) this.A02, (DirectThreadKey) this.A01, (Integer) this.A05, (Integer) this.A04, "inbox");
                return;
        }
    }
}
