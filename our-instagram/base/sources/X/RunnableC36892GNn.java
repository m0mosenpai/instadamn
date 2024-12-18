package X;

import android.widget.TextView;
import java.util.List;

/* renamed from: X.GNn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36892GNn implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ List A01;

    public RunnableC36892GNn(TextView textView, List list) {
        this.A00 = textView;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        TextView textView = this.A00;
        int width = textView.getWidth();
        int i = 0;
        while (true) {
            list = this.A01;
            if (i >= list.size() || AbstractC31181DnP.A00(textView, list, i) <= width) {
                break;
            } else {
                i++;
            }
        }
        if (i >= list.size()) {
            i = AbstractC31172DnG.A03(list, 1);
        }
        AbstractC31171DnF.A15(textView, list.get(i));
        textView.setVisibility(0);
    }
}
