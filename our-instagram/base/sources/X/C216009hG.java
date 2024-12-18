package X;

/* renamed from: X.9hG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216009hG extends C2AG {
    public final int A00;
    public final Object A01;

    public C216009hG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C88W c88w;
        switch (this.A00) {
            case 0:
                c88w = ((ViewOnFocusChangeListenerC23255ASq) this.A01).A09;
                break;
            case 1:
                c88w = ((ViewOnFocusChangeListenerC23260ASv) this.A01).A0H;
                break;
            default:
                C195208kM c195208kM = ((WP8) this.A01).A09.A03;
                C195208kM.A00(c195208kM, c195208kM.A01);
                return null;
        }
        C195208kM c195208kM2 = c88w.A03;
        C195208kM.A00(c195208kM2, c195208kM2.A01);
        return AbstractC166997dE.A0b();
    }

    @Override // X.C11R
    public final int getRunnableId() {
        switch (this.A00) {
            case 0:
                return 1988238439;
            case 1:
                return 227;
            default:
                return 257;
        }
    }
}
