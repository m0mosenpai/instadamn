package X;

import android.view.View;

/* renamed from: X.Faq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34966Faq {
    public float A00;
    public int A01;
    public View.OnClickListener A02;
    public CharSequence A03;
    public CharSequence A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = false;

    public C34966Faq(View.OnClickListener onClickListener, int i) {
        this.A01 = i;
        this.A02 = onClickListener;
    }

    public C34966Faq(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.A04 = charSequence;
        this.A02 = onClickListener;
    }
}
