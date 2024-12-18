package X;

import android.view.View;

/* renamed from: X.LOp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48043LOp implements View.OnClickListener {
    public final /* synthetic */ C49383LsH A00;
    public final /* synthetic */ View[] A01;

    public ViewOnClickListenerC48043LOp(C49383LsH c49383LsH, View[] viewArr) {
        this.A00 = c49383LsH;
        this.A01 = viewArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1496083806);
        C49383LsH c49383LsH = this.A00;
        boolean z = !c49383LsH.A08;
        c49383LsH.A08 = z;
        View view2 = c49383LsH.A01;
        float f = 0.0f;
        if (z) {
            f = 180.0f;
        }
        view2.setRotation(f);
        for (View view3 : this.A01) {
            if (view3 != null) {
                view3.setVisibility(AbstractC167007dF.A05(c49383LsH.A08 ? 1 : 0));
            }
        }
        C0f9.A0C(-479093038, A05);
    }
}
