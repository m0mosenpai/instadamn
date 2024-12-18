package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.WZg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70499WZg implements XCB {
    public AtomicReference A00;
    public final W63 A01;
    public final W62 A02;
    public final Integer A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.VIs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.VIs, java.lang.Object] */
    @Override // X.XCB
    public final void D6j(String str, int i, Map map) {
        AtomicReference atomicReference = this.A00;
        WGC wgc = (WGC) atomicReference.get();
        if (wgc != null) {
            int intValue = this.A03.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue == 1) {
                        C69275Vkj c69275Vkj = wgc.A0C.A03;
                        long j = c69275Vkj.A01;
                        XC1 xc1 = c69275Vkj.A03;
                        AbstractC68335VMv.A00(xc1, null, "media_upload_chunk_receive_reqeust_success", c69275Vkj.A04, xc1.now() - j);
                        W62 w62 = this.A02;
                        if (w62 != null) {
                            W63 w63 = this.A01;
                            if (w63 != null) {
                                WGC.A01(w63, w62, wgc);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    ?? obj = new Object();
                    obj.A00 = str;
                    WGC.A02(obj, wgc);
                }
            } else {
                ?? obj2 = new Object();
                obj2.A00 = str;
                WGC.A03(obj2, wgc);
            }
            atomicReference.set(null);
        }
    }

    @Override // X.XCB
    public final void DGA(Exception exc, Map map, int i, boolean z) {
        AtomicReference atomicReference = this.A00;
        Object obj = atomicReference.get();
        WGC wgc = (WGC) obj;
        if (wgc != null) {
            int intValue = this.A03.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue == 1) {
                        C69275Vkj c69275Vkj = wgc.A0C.A03;
                        long j = c69275Vkj.A01;
                        XC1 xc1 = c69275Vkj.A03;
                        AbstractC68335VMv.A00(xc1, exc, "media_upload_chunk_receive_request_failure", c69275Vkj.A04, xc1.now() - j);
                        W62 w62 = this.A02;
                        if (w62 != null) {
                            WGC.A04(w62, wgc, exc, map, i);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    atomicReference.set(null);
                }
                synchronized (obj) {
                    C69275Vkj c69275Vkj2 = wgc.A0C.A03;
                    long j2 = c69275Vkj2.A00;
                    XC1 xc12 = c69275Vkj2.A03;
                    AbstractC68335VMv.A00(xc12, exc, "media_post_failure", c69275Vkj2.A04, xc12.now() - j2);
                }
                atomicReference.set(null);
            }
            synchronized (obj) {
                C69275Vkj c69275Vkj3 = wgc.A0C.A03;
                long j3 = c69275Vkj3.A02;
                XC1 xc13 = c69275Vkj3.A03;
                AbstractC68335VMv.A00(xc13, exc, "media_upload_init_failure", c69275Vkj3.A04, xc13.now() - j3);
            }
            WGC.A05(wgc, exc, map, i);
            atomicReference.set(null);
        }
    }

    public C70499WZg(W63 w63, W62 w62, WGC wgc, Integer num) {
        this.A03 = num;
        this.A02 = w62;
        this.A01 = w63;
        this.A00 = new AtomicReference(wgc);
    }
}
