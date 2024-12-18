package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes8.dex */
public final class LRU implements C03L {
    public final /* synthetic */ double A00;
    public final /* synthetic */ ViewGroup.LayoutParams A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ Fragment A03;

    @Override // X.C03L
    public final C011504d Cx7(View view, C011504d c011504d) {
        C14360o3.A0B(c011504d, 1);
        C02I A05 = c011504d.A00.A05(3);
        C14360o3.A07(A05);
        int i = (AbstractC166997dE.A0N(this.A03).getDisplayMetrics().heightPixels - A05.A03) - A05.A00;
        ViewGroup.LayoutParams layoutParams = this.A01;
        layoutParams.height = (int) (i * this.A00);
        this.A02.setLayoutParams(layoutParams);
        return c011504d;
    }

    public LRU(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup, Fragment fragment, double d) {
        this.A03 = fragment;
        this.A01 = layoutParams;
        this.A00 = d;
        this.A02 = viewGroup;
    }
}
