package X;

import android.widget.CompoundButton;

/* renamed from: X.FqG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35733FqG implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FRc A01;
    public final /* synthetic */ Integer A02;

    public C35733FqG(FRc fRc, Integer num, int i) {
        this.A00 = i;
        this.A02 = num;
        this.A01 = fRc;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A01.A03.FAn(new FKM(this.A02, this.A00, z));
    }
}
