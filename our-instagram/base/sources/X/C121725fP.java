package X;

import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.R;

/* renamed from: X.5fP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121725fP implements C57R, InterfaceC09670ek {
    public C07T A00;
    public InterfaceC16620sF A01 = C5fQ.A00;
    public boolean A02;
    public final C57R A03;
    public final AndroidComposeView A04;

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C14360o3.A0B(c07r, 1);
        if (c07r == C07R.ON_DESTROY) {
            dispose();
        } else {
            if (c07r != C07R.ON_CREATE || this.A02) {
                return;
            }
            ES1(this.A01);
        }
    }

    @Override // X.C57R
    public final void ES1(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        AbstractC09790fc.A01("WrappedComposition.setContent", 933645375);
        try {
            this.A04.setOnViewTreeOwnersAvailable(new C9F3(22, this, interfaceC16620sF));
            AbstractC09790fc.A00(533499850);
        } catch (Throwable th) {
            AbstractC09790fc.A00(-1231902874);
            throw th;
        }
    }

    @Override // X.C57R
    public final void dispose() {
        AbstractC09790fc.A01("dispose", -1468631073);
        try {
            if (!this.A02) {
                this.A02 = true;
                this.A04.setTag(R.id.wrapped_composition_tag, null);
                C07T c07t = this.A00;
                if (c07t != null) {
                    c07t.A0A(this);
                }
            }
            this.A03.dispose();
            AbstractC09790fc.A00(1765498205);
        } catch (Throwable th) {
            AbstractC09790fc.A00(-1537367126);
            throw th;
        }
    }

    public C121725fP(C57R c57r, AndroidComposeView androidComposeView) {
        this.A04 = androidComposeView;
        this.A03 = c57r;
    }
}
