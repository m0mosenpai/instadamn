package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.6Qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC138926Qy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final EnumC138936Qz A04;

    public int A03() {
        if (this instanceof C138916Qx) {
            return ((C138916Qx) this).A00;
        }
        if (this instanceof C6R3) {
            return ((C6R3) this).A02;
        }
        return this.A00;
    }

    public int A04() {
        if (this instanceof C138916Qx) {
            return ((C138916Qx) this).A01;
        }
        return this.A01;
    }

    public int A05() {
        if (this instanceof C138916Qx) {
            return ((C138916Qx) this).A02;
        }
        if (this instanceof C6R3) {
            return ((C6R3) this).A04;
        }
        return this.A02;
    }

    public int A06() {
        if (this instanceof C138916Qx) {
            return ((C138916Qx) this).A03;
        }
        return this.A03;
    }

    public void A07(C6R2 c6r2) {
        if (this instanceof C138916Qx) {
            C138916Qx c138916Qx = (C138916Qx) this;
            MediaFrameLayout mediaFrameLayout = c138916Qx.A08;
            ViewGroup.LayoutParams layoutParams = mediaFrameLayout.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int i = c6r2.A01;
            layoutParams.width = i;
            int i2 = c6r2.A00;
            layoutParams.height = i2;
            mediaFrameLayout.setLayoutParams(layoutParams);
            int i3 = c6r2.A03;
            mediaFrameLayout.setTranslationY(i3);
            C138896Qv c138896Qv = c138916Qx.A07;
            c138896Qv.A00("media_width", i);
            c138896Qv.A00("media_height", i2);
            c138896Qv.A00("media_position_start_y", i3);
            C38321qM c38321qM = c138916Qx.A05.A0b;
            c38321qM.getClass();
            c138896Qv.A01("background_color_top", String.valueOf(c38321qM.A31()));
            c138896Qv.A01("background_color_bottom", String.valueOf(c38321qM.A30()));
            return;
        }
        if (!(this instanceof C6R3)) {
            return;
        }
        C6R3 c6r3 = (C6R3) this;
        boolean z = c6r2.A04;
        InterfaceC56392iX interfaceC56392iX = c6r3.A0G;
        if (z) {
            interfaceC56392iX.setVisibility(8);
            c6r3.A0F.setVisibility(8);
        } else {
            interfaceC56392iX.setVisibility(0);
            IgTextView igTextView = c6r3.A0E;
            float f = c6r2.A03;
            igTextView.setTranslationY(f);
            C6R3.A01(c6r3, c6r2.A00);
            C6R3.A00(c6r3);
            if (c6r3.A0Q) {
                InterfaceC56392iX interfaceC56392iX2 = c6r3.A0F;
                interfaceC56392iX2.setVisibility(0);
                View view = interfaceC56392iX2.getView();
                String str = c6r3.A0P;
                if (c6r3.A05 == null) {
                    C14360o3.A0F("textLayoutParams");
                    throw C00O.createAndThrow();
                }
                view.setTranslationX(((c6r3.A06() - ((C6RY.A03(r1, str, igTextView.getMaxLines()) + igTextView.getPaddingLeft()) + igTextView.getPaddingRight())) * 0.5f) - AbstractC13880nE.A0C(view));
                view.setTranslationY(f + c6r3.A03 + c6r3.A0M.A0G);
            }
        }
        C6R3.A02(c6r3, c6r2);
    }

    public AbstractC138926Qy(C138866Qr c138866Qr, EnumC138936Qz enumC138936Qz) {
        this.A04 = enumC138936Qz;
        int i = c138866Qr.A0G;
        this.A02 = i;
        this.A00 = i;
        this.A03 = c138866Qr.A0F;
    }
}
