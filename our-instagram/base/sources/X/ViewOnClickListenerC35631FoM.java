package X;

import android.view.View;
import android.widget.CheckBox;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FoM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35631FoM implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public ViewOnClickListenerC35631FoM(InterfaceC37224GaZ interfaceC37224GaZ, E40 e40, DirectShareTarget directShareTarget, int i, int i2, int i3, int i4) {
        this.A00 = i4;
        if (i4 != 0) {
            this.A05 = e40;
            this.A06 = directShareTarget;
            this.A04 = interfaceC37224GaZ;
            this.A03 = i;
            this.A01 = i2;
            this.A02 = i3;
            return;
        }
        this.A04 = e40;
        this.A05 = directShareTarget;
        this.A06 = interfaceC37224GaZ;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.A00 != 0) {
            int A05 = C0f9.A05(1847205991);
            E40 e40 = (E40) this.A05;
            DirectShareTarget directShareTarget = (DirectShareTarget) this.A06;
            InterfaceC37224GaZ interfaceC37224GaZ = (InterfaceC37224GaZ) this.A04;
            int i = this.A03;
            int i2 = this.A01;
            int i3 = this.A02;
            interfaceC37224GaZ.DdP();
            if (interfaceC37224GaZ.DdH(directShareTarget, i, i2, i3)) {
                CheckBox checkBox = e40.A02;
                if (checkBox.getVisibility() == 0) {
                    checkBox.setChecked(!checkBox.isChecked());
                }
            }
            C0f9.A0C(1953688973, A05);
            return;
        }
        E40 e402 = (E40) this.A04;
        DirectShareTarget directShareTarget2 = (DirectShareTarget) this.A05;
        InterfaceC37224GaZ interfaceC37224GaZ2 = (InterfaceC37224GaZ) this.A06;
        int i4 = this.A01;
        int i5 = this.A02;
        int i6 = this.A03;
        interfaceC37224GaZ2.DdP();
        if (!interfaceC37224GaZ2.DdH(directShareTarget2, i4, i5, i6)) {
            return;
        }
        CheckBox checkBox2 = e402.A02;
        if (checkBox2.getVisibility() != 0) {
            return;
        }
        checkBox2.setChecked(!checkBox2.isChecked());
    }
}
