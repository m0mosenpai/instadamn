package X;

import android.view.View;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class GPI implements Runnable {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ C32711Eac A01;
    public final /* synthetic */ Integer A02;

    public GPI(IgTextView igTextView, C32711Eac c32711Eac, Integer num) {
        this.A02 = num;
        this.A01 = c32711Eac;
        this.A00 = igTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num = this.A02;
        View view = this.A01.A02.A03.getView();
        if (num != null) {
            view.setVisibility(0);
            IgTextView igTextView = this.A00;
            igTextView.setVisibility(0);
            igTextView.setText(AbstractC189358aC.A01(num.intValue() * 1000));
            return;
        }
        view.setVisibility(8);
        this.A00.setVisibility(8);
    }
}
