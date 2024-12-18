package X;

import android.view.View;
import android.widget.CompoundButton;
import com.facebook.R;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.MyH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51974MyH extends AbstractC53642Nnn {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C51974MyH(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.AbstractC53642Nnn
    public final void A00() {
        if (this.A00 != 0) {
            ((FPT) this.A01).A00(this.A02);
            return;
        }
        C52173N7d c52173N7d = (C52173N7d) this.A01;
        AbstractC166987dD.A10(c52173N7d.getSession()).A03.EaC(true);
        C52173N7d.A01(c52173N7d, this.A02);
        AbstractC31177DnL.A12(c52173N7d);
    }

    @Override // X.AbstractC53642Nnn
    public final void A01() {
        if (1 - this.A00 == 0) {
            ((FPT) this.A01).A00(this.A02);
        }
    }

    @Override // X.AbstractC53642Nnn
    public final void A02() {
        if (this.A00 != 0) {
            ((FPT) this.A01).A00(this.A02);
            return;
        }
        C52173N7d c52173N7d = (C52173N7d) this.A01;
        AbstractC166987dD.A10(c52173N7d.getSession()).A03.EaC(false);
        Integer num = c52173N7d.A02;
        Integer num2 = C05F.A0C;
        View view = c52173N7d.A00;
        if (num == num2) {
            ((CompoundButton) view.requireViewById(R.id.edit_gender_unspecified)).setChecked(true);
            c52173N7d.A02 = C05F.A0N;
            IgFormField igFormField = c52173N7d.A01;
            if (igFormField == null) {
                return;
            }
            igFormField.setVisibility(8);
            AbstractC13880nE.A0O(igFormField);
            return;
        }
        ((CompoundButton) view.requireViewById(AbstractC54886OPh.A01(num))).setChecked(true);
    }

    @Override // X.AbstractC53642Nnn
    public final void A03() {
        if (1 - this.A00 == 0) {
            ((FPT) this.A01).A00(this.A02);
        }
    }

    @Override // X.AbstractC53642Nnn
    public final void A04(Throwable th) {
        if (1 - this.A00 == 0) {
            ((FPT) this.A01).A00(this.A02);
        }
    }
}
