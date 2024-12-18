package X;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.Sp1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63534Sp1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ CompoundButton A01;
    public final /* synthetic */ C2GT A02;
    public final /* synthetic */ C58764Q7t A03;

    public C63534Sp1(View.OnClickListener onClickListener, CompoundButton compoundButton, C2GT c2gt, C58764Q7t c58764Q7t) {
        this.A03 = c58764Q7t;
        this.A02 = c2gt;
        this.A01 = compoundButton;
        this.A00 = onClickListener;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton compoundButton2;
        boolean z2;
        C63406Sjd A0S = AbstractC58318PtA.A0S(this.A02);
        if (C63406Sjd.A0J(A0S)) {
            compoundButton2 = this.A01;
            z2 = AbstractC166997dE.A0b().equals(A0S.A01);
        } else {
            if (C63406Sjd.A0G(A0S)) {
                compoundButton2 = this.A01;
                z2 = false;
            }
            this.A00.onClick(compoundButton);
        }
        compoundButton2.setChecked(z2);
        this.A00.onClick(compoundButton);
    }
}
