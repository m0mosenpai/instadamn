package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.EYf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32631EYf extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final FFT A01;

    public C32631EYf(InterfaceC11380iw interfaceC11380iw, FFT fft) {
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A01 = fft;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(null, 0);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E3H(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_recipient_picker_navigation_row, false), this.A00, this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E8O.class;
    }
}
