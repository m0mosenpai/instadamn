package X;

import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.R;

/* renamed from: X.5U0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5U0 implements C57R, InterfaceC09670ek {
    public C07T A00;
    public InterfaceC16620sF A01 = C5U1.A00;
    public boolean A02;
    public final C57R A03;
    public final AndroidComposeView A04;

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
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
        this.A04.setOnViewTreeOwnersAvailable(new C9F3(16, this, interfaceC16620sF));
    }

    @Override // X.C57R
    public final void dispose() {
        if (!this.A02) {
            this.A02 = true;
            this.A04.setTag(R.id.wrapped_composition_tag, null);
            C07T c07t = this.A00;
            if (c07t != null) {
                c07t.A0A(this);
            }
        }
        this.A03.dispose();
    }

    public C5U0(C57R c57r, AndroidComposeView androidComposeView) {
        this.A04 = androidComposeView;
        this.A03 = c57r;
    }
}
