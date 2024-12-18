package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WcO implements InterfaceC71910X9u {
    public final /* synthetic */ AbstractC70175WEx A00;

    public WcO(AbstractC70175WEx abstractC70175WEx) {
        this.A00 = abstractC70175WEx;
    }

    @Override // X.InterfaceC71910X9u
    public final void DAi(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.A00.A07(0);
    }
}
