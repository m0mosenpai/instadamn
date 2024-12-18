package X;

import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class M0X implements Runnable {
    public final /* synthetic */ C45499KCo A00;

    public M0X(C45499KCo c45499KCo) {
        this.A00 = c45499KCo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45499KCo c45499KCo = this.A00;
        ViewGroup viewGroup = c45499KCo.A03;
        if (viewGroup != null) {
            viewGroup.setBottom(viewGroup.getBottom() + C30D.A00);
            AbstractC13880nE.A0s(c45499KCo.A03, this);
        }
    }
}
