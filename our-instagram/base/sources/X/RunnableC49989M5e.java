package X;

import android.text.Layout;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.M5e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49989M5e implements Runnable {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ CharSequence A01;
    public final /* synthetic */ String A02;

    public RunnableC49989M5e(IgTextView igTextView, CharSequence charSequence, String str) {
        this.A02 = str;
        this.A00 = igTextView;
        this.A01 = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        String A1I = AbstractC25226BEj.A1I(new C11L("\\s+").A03(AbstractC25228BEl.A1A(this.A02)), 0);
        IgTextView igTextView = this.A00;
        float measureText = igTextView.getPaint().measureText(A1I);
        Layout layout = igTextView.getLayout();
        if (layout != null) {
            f = layout.getWidth();
        } else {
            f = measureText;
        }
        igTextView.post(new M6M(igTextView, this.A01, measureText, f));
    }
}
