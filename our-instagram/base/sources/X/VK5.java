package X;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes11.dex */
public abstract class VK5 {
    public final void A00(int i) {
        if (this instanceof C67767Uxi) {
            C67767Uxi c67767Uxi = (C67767Uxi) this;
            Typeface typeface = c67767Uxi.A01;
            if (!c67767Uxi.A00) {
                c67767Uxi.A02.ABu(typeface);
                return;
            }
            return;
        }
        if (this instanceof C67768Uxj) {
            ((C67768Uxj) this).A02.A00(i);
            return;
        }
        if (!(this instanceof C67766Uxh)) {
            return;
        }
        C69710Vu5 c69710Vu5 = ((C67766Uxh) this).A00;
        c69710Vu5.A02 = true;
        XDC xdc = (XDC) c69710Vu5.A01.get();
        if (xdc == null) {
            return;
        }
        xdc.Dsi();
    }

    public final void A01(Typeface typeface, boolean z) {
        CharSequence text;
        if (this instanceof C67768Uxj) {
            C67768Uxj c67768Uxj = (C67768Uxj) this;
            c67768Uxj.A01.A06(typeface, c67768Uxj.A00);
            c67768Uxj.A02.A01(typeface, z);
            return;
        }
        if (this instanceof C67767Uxi) {
            C67767Uxi c67767Uxi = (C67767Uxi) this;
            if (c67767Uxi.A00) {
                return;
            }
            c67767Uxi.A02.ABu(typeface);
            return;
        }
        if (this instanceof C67766Uxh) {
            C67766Uxh c67766Uxh = (C67766Uxh) this;
            if (z) {
                return;
            }
            C69710Vu5 c69710Vu5 = c67766Uxh.A00;
            c69710Vu5.A02 = true;
            XDC xdc = (XDC) c69710Vu5.A01.get();
            if (xdc == null) {
                return;
            }
            xdc.Dsi();
            return;
        }
        Chip chip = ((C67765Uxg) this).A00;
        C67771Uxm c67771Uxm = chip.A04;
        if (c67771Uxm.A0g) {
            text = c67771Uxm.A0Z;
        } else {
            text = chip.getText();
        }
        chip.setText(text);
        chip.requestLayout();
        chip.invalidate();
    }
}
