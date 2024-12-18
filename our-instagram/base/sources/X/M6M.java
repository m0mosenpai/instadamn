package X;

import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class M6M implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ IgTextView A02;
    public final /* synthetic */ CharSequence A03;

    public M6M(IgTextView igTextView, CharSequence charSequence, float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = igTextView;
        this.A03 = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A01 > this.A00) {
            this.A02.setMaxLines(1);
        }
        CharSequence charSequence = this.A03;
        int length = charSequence.length();
        int i = 0;
        IgTextView igTextView = this.A02;
        if (length > 0) {
            igTextView.setText(charSequence);
            if (igTextView.getLineCount() > 1) {
                igTextView.setMaxLines(2);
            }
        } else {
            i = 8;
        }
        igTextView.setVisibility(i);
    }
}
