package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.UwE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC67687UwE extends AbstractC69335Vlh {
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Uw3, X.Vjc] */
    public static C67695UwM A00(View.OnClickListener onClickListener, C69753Vuo c69753Vuo, W4A w4a, boolean z) {
        boolean z2;
        C70514WZv c70514WZv;
        C67689UwG c67689UwG = new C67689UwG(14);
        ((AbstractC69335Vlh) c67689UwG).A02 = w4a;
        ?? abstractC69209Vjc = new AbstractC69209Vjc();
        abstractC69209Vjc.A00 = new C70514WZv(null, 15, R.drawable.radio_button_background, R.dimen.account_recs_header_image_margin);
        if (z) {
            z2 = false;
            c70514WZv = new C70514WZv(16, null, R.drawable.radio_button_center, 0);
        } else {
            z2 = false;
            c70514WZv = new C70514WZv(null, null, 0, 0);
        }
        abstractC69209Vjc.A02 = c70514WZv;
        Uw5 A00 = Uw5.A00(abstractC69209Vjc, c67689UwG);
        A00.A04 = c69753Vuo;
        ((AbstractC69209Vjc) A00).A03 = z2;
        c67689UwG.A00(new C67684UwB(A00), 1);
        c67689UwG.A03 = onClickListener;
        return new C67695UwM(c67689UwG);
    }
}
