package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: X.Loa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49157Loa implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final LinearLayout A01;
    public final C49169Lom A02;
    public final C7BF A03;

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A02.A06;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A01;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    public C49157Loa(LinearLayout linearLayout, C49169Lom c49169Lom, C7BF c7bf) {
        this.A01 = linearLayout;
        this.A02 = c49169Lom;
        this.A03 = c7bf;
    }
}
