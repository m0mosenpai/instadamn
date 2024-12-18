package X;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public final class NS9 extends AbstractC140596Xn {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NS9(Object obj, int i) {
        super(null, null);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC140596Xn
    public final boolean A06() {
        if (2 - this.A00 != 0) {
            return super.A06();
        }
        return true;
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        C6PN A00;
        switch (this.A00) {
            case 0:
                return C6PN.A02();
            case 1:
                C14360o3.A0B(c41181vS, 1);
                Ow3 ow3 = (Ow3) this.A01;
                if (ow3.A00) {
                    RectF rectF = (RectF) ow3.A02.get(c41181vS.A0j);
                    if (rectF != null) {
                        A00 = C6PN.A03(rectF);
                    } else {
                        A00 = C6PN.A02();
                    }
                } else {
                    A00 = C6PN.A00();
                }
                C14360o3.A0A(A00);
                return A00;
            default:
                return C6PN.A03((RectF) this.A01);
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A0A(Reel reel, C41181vS c41181vS) {
        switch (this.A00) {
            case 0:
                FragmentActivity A09 = AbstractC31171DnF.A09(this.A01);
                if (A09 == null) {
                    return;
                }
                C30D.A01(A09);
                return;
            case 1:
                AbstractC167017dG.A1N(reel, c41181vS);
                super.A0A(reel, c41181vS);
                ((Ow3) this.A01).A01(c41181vS.A0j, C05F.A01);
                return;
            default:
                super.A0A(reel, c41181vS);
                return;
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
        if (1 - this.A00 == 0) {
            C14360o3.A0B(c41181vS, 1);
            if (c41181vS.A12()) {
                ((Ow3) this.A01).A02(c41181vS.A0j, C05F.A01);
            }
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
    }
}
