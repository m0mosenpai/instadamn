package com.instagram.ui.widget.bannertoast;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC70163Da;
import X.C138376Ot;
import X.C3OO;
import X.C52828NZl;
import X.C55942hf;
import X.C55982hj;
import X.InterfaceC55932he;
import X.InterfaceC57883Pln;
import X.PI8;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes9.dex */
public class BannerToast extends TextView implements InterfaceC55932he {
    public C55982hj A00;
    public InterfaceC57883Pln A01;
    public boolean A02;

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    public static void A00(BannerToast bannerToast) {
        if (!bannerToast.A02) {
            C55982hj A0R = AbstractC167007dF.A0R();
            A0R.A09(C55942hf.A04(1.0d, 3.0d));
            A0R.A08(0.0d, true);
            A0R.A06 = true;
            bannerToast.A00 = A0R;
            A0R.A0A(bannerToast);
            bannerToast.A02 = true;
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        if (c55982hj.A01 == 1.0d) {
            setVisibility(0);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        if (c55982hj.A09.A00 == 0.0d) {
            setVisibility(8);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float A02 = (float) AbstractC70163Da.A02(c55982hj.A09.A00, -getHeight());
        setTranslationY(A02);
        InterfaceC57883Pln interfaceC57883Pln = this.A01;
        if (interfaceC57883Pln != null) {
            float A08 = A02 + AbstractC166987dD.A08(this);
            C138376Ot c138376Ot = ((PI8) interfaceC57883Pln).A00;
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            C52828NZl c52828NZl = c138376Ot.A0B;
            if (c52828NZl != null) {
                c52828NZl.A03.setTranslationY(A08);
            }
        }
    }

    public void setListener(InterfaceC57883Pln interfaceC57883Pln) {
        this.A01 = interfaceC57883Pln;
    }

    public BannerToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BannerToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerToast(Context context) {
        this(context, null, 0);
    }
}
