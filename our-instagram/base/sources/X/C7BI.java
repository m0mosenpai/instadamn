package X;

import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;

/* renamed from: X.7BI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BI implements Runnable {
    public boolean A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final /* synthetic */ C7BH A02;

    public C7BI(C7BH c7bh) {
        this.A02 = c7bh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Py8 py8;
        C7BH c7bh = this.A02;
        C78P c78p = c7bh.A01;
        if (c78p != null && c78p.A01 < c78p.A02.size()) {
            int min = Math.min(c78p.A02.size(), c78p.A01 + c78p.A00);
            c78p.A01 = min;
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AbstractC001800i.A0P(" ", "", "", c78p.A02.subList(0, min), null));
            if (c78p.A01 < c78p.A02.size()) {
                int size = c78p.A02.size();
                int i = c78p.A01;
                String A0P = AbstractC001800i.A0P(" ", "", "", c78p.A02.subList(i, Math.min(size, i + 15)), null);
                SpannableStringBuilder append2 = append.append((CharSequence) " ");
                C14360o3.A07(append2);
                int i2 = 0;
                if (((Boolean) c78p.A04.A04.getValue()).booleanValue()) {
                    i2 = -3355444;
                }
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i2);
                int length = append2.length();
                append2.append((CharSequence) A0P);
                append2.setSpan(foregroundColorSpan, length, append2.length(), 17);
            }
            C7BH c7bh2 = c78p.A04;
            if (c7bh2.A02 && (py8 = c7bh2.A00) != null) {
                C14360o3.A0A(append);
                py8.A01(append, false);
            }
            InterfaceC16660sJ interfaceC16660sJ = c7bh2.A05;
            C14360o3.A0A(append);
            interfaceC16660sJ.invoke(append);
        }
        C78P c78p2 = c7bh.A01;
        boolean z = true;
        if (c78p2 == null || c78p2.A01 >= c78p2.A02.size()) {
            z = false;
        }
        this.A00 = z;
        if (z) {
            this.A01.postDelayed(this, 100L);
        }
    }
}
