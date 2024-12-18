package X;

import android.view.ViewStub;
import com.instagram.ui.widget.bubblespinner.BubbleSpinner;

/* renamed from: X.Afj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23772Afj implements InterfaceC1821285w {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC1821285w
    public final void CMh() {
        ((BubbleSpinner) this.A02.getValue()).setLoadingStatus(C8ZZ.DONE);
        AbstractC166987dD.A0d(this.A01).setVisibility(8);
    }

    public C23772Afj(ViewStub viewStub) {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A00 = B8T.A01(viewStub, enumC09460dv, 3);
        this.A02 = B8T.A01(this, enumC09460dv, 5);
        this.A01 = B8T.A01(this, enumC09460dv, 4);
    }
}
