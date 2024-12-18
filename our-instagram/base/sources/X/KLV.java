package X;

import android.widget.VideoView;

/* loaded from: classes8.dex */
public final class KLV extends AbstractRunnableC14200nk {
    public final /* synthetic */ C106144qU A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLV(C106144qU c106144qU) {
        super(1184495253, 3, false, false);
        this.A00 = c106144qU;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C106144qU c106144qU = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        ((VideoView) c106144qU.A08.A0F.getView()).pause();
    }
}
