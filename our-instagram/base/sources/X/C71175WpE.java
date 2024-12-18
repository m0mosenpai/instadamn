package X;

import android.util.LruCache;

/* renamed from: X.WpE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71175WpE implements XDz, C6Bb {
    public final C68114VBx A00;
    public final InterfaceC09390do A01;
    public final C68112VBv A02;
    public final C68113VBw A03;
    public final /* synthetic */ AbstractC71176WpF A04;

    @Override // X.XDz
    public final boolean BOn() {
        throw C00O.createAndThrow();
    }

    @Override // X.XDz
    public final int BPf() {
        throw C00O.createAndThrow();
    }

    @Override // X.XDz
    public final boolean CDU() {
        throw C00O.createAndThrow();
    }

    @Override // X.XDz
    public final int getMarkerId() {
        throw C00O.createAndThrow();
    }

    public C71175WpE(AbstractC71176WpF abstractC71176WpF) {
        this.A04 = abstractC71176WpF;
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A03, new C29890DGe(abstractC71176WpF, 15));
        this.A01 = A00;
        this.A00 = new C68114VBx((LruCache) A00.getValue(), abstractC71176WpF);
        this.A03 = new C68113VBw((LruCache) this.A01.getValue(), abstractC71176WpF);
        this.A02 = new C68112VBv((LruCache) this.A01.getValue(), abstractC71176WpF);
    }
}
