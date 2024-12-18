package X;

import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public final class WjQ implements BC5 {
    public final /* synthetic */ C7S5 A00;
    public final /* synthetic */ C7XW A01;

    public WjQ(C7S5 c7s5, C7XW c7xw) {
        this.A01 = c7xw;
        this.A00 = c7s5;
    }

    @Override // X.BC5
    public final XAY ALo(Bitmap bitmap) {
        AbstractC59962oe abstractC59962oe = this.A01.A03;
        if (abstractC59962oe.isResumed()) {
            AbstractC70049W0j.A00(AbstractC31177DnL.A09(abstractC59962oe), bitmap, this.A00);
            return null;
        }
        return null;
    }
}
