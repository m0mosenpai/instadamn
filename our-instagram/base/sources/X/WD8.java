package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WD8 {
    public int A00;
    public Map A01;
    public java.util.Set A02;
    public final int A03;
    public final InterfaceC71970XDc A04;
    public final C68671Va7 A05;
    public final C69603Vs6 A06;
    public final AbstractC27691Vx A07;
    public final ConcurrentHashMap A08;
    public final C68670Va6 A09;
    public volatile int A0A;
    public volatile boolean A0B;

    public WD8(InterfaceC71970XDc interfaceC71970XDc, C68670Va6 c68670Va6, C69603Vs6 c69603Vs6, AbstractC27691Vx abstractC27691Vx, int i) {
        this.A07 = abstractC27691Vx;
        this.A06 = c69603Vs6;
        this.A09 = c68670Va6;
        this.A04 = interfaceC71970XDc;
        int A00 = (A00(interfaceC71970XDc) * i) / 1000;
        A00 = A00 < 1 ? 1 : A00;
        this.A03 = A00;
        this.A08 = new ConcurrentHashMap();
        this.A05 = new C68671Va7(this.A04.getFrameCount());
        this.A00 = -1;
        this.A01 = AbstractC06930Yk.A0E();
        this.A02 = C16910sj.A00;
        A02(A00(this.A04));
        this.A0A = (int) (A00 * 0.5f);
    }

    public static final int A00(InterfaceC71970XDc interfaceC71970XDc) {
        long millis = TimeUnit.SECONDS.toMillis(1L) / (interfaceC71970XDc.BPM() / interfaceC71970XDc.getFrameCount());
        if (millis < 1) {
            millis = 1;
        }
        return (int) millis;
    }

    public static final void A01(WD8 wd8, int i, int i2) {
        if (!wd8.A0B) {
            wd8.A0B = true;
            AbstractC62355S8c.A00.execute(new RunnableC71532Wvh(wd8, i, i2));
        }
    }

    public final void A02(int i) {
        InterfaceC71970XDc interfaceC71970XDc = this.A04;
        int BPM = interfaceC71970XDc.BPM();
        int loopCount = interfaceC71970XDc.getLoopCount();
        if (loopCount < 1) {
            loopCount = 1;
        }
        int i2 = BPM * loopCount;
        C68670Va6 c68670Va6 = this.A09;
        int frameCount = interfaceC71970XDc.getFrameCount();
        int A00 = A00(interfaceC71970XDc);
        if (i > A00) {
            i = A00;
        }
        if (i < 1) {
            i = 1;
        }
        int i3 = c68670Va6.A00;
        if (i > i3) {
            i = i3;
        }
        float f = i * (i2 / 1000.0f);
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = frameCount;
        if (f > f2) {
            f = f2;
        }
        float f3 = f2 / f;
        int i4 = 0;
        C17u A0C = C17s.A0C(0, frameCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC50522MSa.A09(A0C));
        for (Object obj : A0C) {
            int intValue = ((Number) obj).intValue();
            if (((int) (intValue % f3)) == 0) {
                i4 = intValue;
            }
            AbstractC37301Gc2.A1T(obj, linkedHashMap, i4);
        }
        this.A01 = linkedHashMap;
        this.A02 = AbstractC001800i.A0k(linkedHashMap.values());
    }
}
