package X;

import android.view.View;
import android.widget.VideoView;

/* loaded from: classes8.dex */
public final class JYI implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C106144qU A00;
    public final /* synthetic */ C4FE A01;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public JYI(C106144qU c106144qU, C4FE c4fe) {
        this.A01 = c4fe;
        this.A00 = c106144qU;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (C18U.A06(C06090Tz.A05, this.A01.A02, 36325952921417246L)) {
            C14120nc.A00().ATO(new KLV(this.A00));
            return;
        }
        C106144qU c106144qU = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        ((VideoView) c106144qU.A08.A0F.getView()).pause();
    }
}
