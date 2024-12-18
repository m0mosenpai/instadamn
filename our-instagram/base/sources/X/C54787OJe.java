package X;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* renamed from: X.OJe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54787OJe {
    public float A00;
    public int A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final TextView A06;
    public final TextView A07;

    public final void A00(String str, boolean z) {
        ViewPropertyAnimator scaleX;
        int i;
        long j;
        if (!C14360o3.A0K(this.A02, str)) {
            if (!this.A04) {
                this.A03 = str;
                this.A05 = z;
                return;
            }
            this.A02 = str;
            boolean equals = str.equals("top");
            TextView textView = this.A06;
            if (equals) {
                scaleX = textView.animate().translationY(this.A01).scaleY(this.A00).scaleX(this.A00);
                i = 3;
            } else {
                textView.setTranslationY(this.A01);
                textView.setScaleY(this.A00);
                textView.setScaleX(this.A00);
                scaleX = textView.animate().translationY(0.0f).scaleY(1.0f).scaleX(1.0f);
                i = 2;
            }
            ViewPropertyAnimator listener = scaleX.setListener(new C50730MaX(this, i));
            C14360o3.A07(listener);
            if (z) {
                j = 200;
            } else {
                j = 0;
            }
            listener.setDuration(j);
            listener.start();
        }
    }

    public C54787OJe(TextView textView, TextView textView2) {
        this.A06 = textView;
        this.A07 = textView2;
    }
}
