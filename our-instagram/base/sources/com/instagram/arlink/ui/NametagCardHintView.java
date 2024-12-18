package com.instagram.arlink.ui;

import X.AnonymousClass693;
import X.C0f9;
import X.C210289Rr;
import X.C68U;
import X.C6QW;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes8.dex */
public class NametagCardHintView extends FrameLayout {
    public AnonymousClass693 A00;
    public Drawable A01;

    public NametagCardHintView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        AnonymousClass693 A00 = C68U.A00(getContext(), R.raw.scanmarks);
        this.A00 = A00;
        if (A00 == null) {
            this.A01 = new C210289Rr();
        } else {
            C6QW.A00("scanmarks");
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Drawable drawable;
        int A06 = C0f9.A06(438397667);
        super.onSizeChanged(i, i2, i3, i4);
        AnonymousClass693 anonymousClass693 = this.A00;
        if (anonymousClass693 != null) {
            anonymousClass693.setBounds(0, 0, i, i2);
            drawable = this.A00;
        } else {
            Drawable drawable2 = this.A01;
            if (drawable2 != null) {
                drawable2.mutate().setAlpha(128);
                drawable = this.A01;
            }
            C0f9.A0D(-854731255, A06);
        }
        setBackground(drawable);
        C0f9.A0D(-854731255, A06);
    }

    public NametagCardHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public NametagCardHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
