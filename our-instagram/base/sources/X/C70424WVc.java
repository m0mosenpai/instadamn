package X;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WVc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70424WVc implements InterfaceC71971XDd {
    public int A00;
    public WD8 A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05 = String.valueOf(hashCode());
    public final boolean A06;
    public final InterfaceC71970XDc A07;
    public final C68903Ve2 A08;
    public final W2P A09;
    public final C69603Vs6 A0A;

    public static final WD8 A00(C70424WVc c70424WVc) {
        WD8 wd8 = c70424WVc.A01;
        if (wd8 == null) {
            W2P w2p = c70424WVc.A09;
            String str = c70424WVc.A05;
            C69603Vs6 c69603Vs6 = c70424WVc.A0A;
            InterfaceC71970XDc interfaceC71970XDc = c70424WVc.A07;
            AbstractC167017dG.A1O(str, interfaceC71970XDc);
            ConcurrentHashMap concurrentHashMap = W2P.A03;
            synchronized (concurrentHashMap) {
                C68905Ve5 c68905Ve5 = (C68905Ve5) concurrentHashMap.get(str);
                if (c68905Ve5 != null) {
                    concurrentHashMap.remove(str);
                    wd8 = c68905Ve5.A00;
                } else {
                    wd8 = new WD8(interfaceC71970XDc, new C68670Va6(w2p.A01), c69603Vs6, w2p.A02, w2p.A00);
                }
            }
            c70424WVc.A01 = wd8;
        }
        return wd8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r3 <= r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r9 > r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        if (r9 >= 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    @Override // X.InterfaceC71971XDd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1VO AgA(int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70424WVc.AgA(int, int, int):X.1VO");
    }

    @Override // X.InterfaceC71971XDd
    public final void E5i(InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        int i4;
        if (i > 0 && i2 > 0 && (i3 = this.A03) > 0 && (i4 = this.A02) > 0) {
            if (this.A06 && (i < i3 || i2 < i4)) {
                double d = i3 / i4;
                if (i2 > i) {
                    if (i2 > i4) {
                        i2 = i4;
                    }
                    i3 = (int) (i2 * d);
                } else {
                    if (i > i3) {
                        i = i3;
                    }
                    i3 = i;
                }
            }
            WD8 A00 = A00(this);
            C14360o3.A0B(X3d.A00, 2);
            WD8.A01(A00, i3, i3);
        }
    }

    public C70424WVc(InterfaceC71970XDc interfaceC71970XDc, W2P w2p, C69603Vs6 c69603Vs6, boolean z) {
        this.A07 = interfaceC71970XDc;
        this.A0A = c69603Vs6;
        this.A09 = w2p;
        this.A06 = z;
        InterfaceC71992XEf interfaceC71992XEf = ((WVX) interfaceC71970XDc).A00.A06;
        this.A03 = interfaceC71992XEf.getWidth();
        this.A02 = interfaceC71992XEf.getHeight();
        long millis = TimeUnit.SECONDS.toMillis(1L) / (interfaceC71970XDc.BPM() / interfaceC71970XDc.getFrameCount());
        int i = (int) (millis < 1 ? 1L : millis);
        this.A04 = i;
        this.A00 = i;
        this.A08 = new C68903Ve2(this);
    }

    @Override // X.InterfaceC71971XDd
    public final void onStop() {
        A00(this);
        WD8 A00 = A00(this);
        String str = this.A05;
        C14360o3.A0B(str, 0);
        W2P.A03.put(str, new C68905Ve5(A00, new Date()));
        this.A01 = null;
    }

    @Override // X.InterfaceC71971XDd
    public final void E5j(XGp xGp, XEQ xeq, C69269Vkd c69269Vkd, InterfaceC16820sZ interfaceC16820sZ, int i) {
    }
}
