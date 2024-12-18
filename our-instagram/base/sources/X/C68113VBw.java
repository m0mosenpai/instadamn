package X;

import android.util.LruCache;
import java.util.concurrent.ExecutorService;

/* renamed from: X.VBw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68113VBw extends AbstractC70425WVd implements XDz, InterfaceC71964XCq {
    public final AbstractC71176WpF A00;
    public final /* synthetic */ AbstractC71176WpF A01;
    public final /* synthetic */ AbstractC71176WpF A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68113VBw(LruCache lruCache, AbstractC71176WpF abstractC71176WpF) {
        super(lruCache, abstractC71176WpF);
        C14360o3.A0B(lruCache, 2);
        this.A01 = abstractC71176WpF;
        this.A02 = abstractC71176WpF;
        this.A00 = abstractC71176WpF;
    }

    @Override // X.XDz
    public final boolean BOn() {
        return this.A01.BOn();
    }

    @Override // X.XDz
    public final int BPf() {
        return this.A01.BPf();
    }

    @Override // X.InterfaceC71964XCq
    public final C68867VdN BjL() {
        return this.A02.BjL();
    }

    @Override // X.InterfaceC71964XCq
    public final ExecutorService BtQ() {
        return this.A02.BtQ();
    }

    @Override // X.XDz
    public final boolean CDU() {
        return this.A01.CDU();
    }

    @Override // X.XDz
    public final int getMarkerId() {
        return this.A01.getMarkerId();
    }
}
