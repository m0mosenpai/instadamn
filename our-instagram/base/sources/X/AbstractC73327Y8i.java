package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Y8i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC73327Y8i implements InterfaceC65627Tpn {
    public int A00;
    public C62932SYa A01;
    public final ArrayList A02 = AbstractC25225BEi.A17(1);
    public final boolean A03;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02() {
        C72745XmL c72745XmL;
        float f;
        int i;
        C72745XmL c72745XmL2;
        int i2;
        for (int i3 = 0; i3 < this.A00; i3++) {
            YM6 ym6 = (YM6) this.A02.get(i3);
            boolean z = this.A03;
            C73328Y8j c73328Y8j = (C73328Y8j) ym6;
            synchronized (c73328Y8j) {
                if (z) {
                    WDn.A02(AbstractC167007dF.A1O(c73328Y8j.A01));
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i4 = (int) (elapsedRealtime - c73328Y8j.A04);
                    c73328Y8j.A06 += i4;
                    long j = c73328Y8j.A05;
                    long j2 = c73328Y8j.A03;
                    c73328Y8j.A05 = j + j2;
                    if (i4 > 0) {
                        float f2 = (((float) j2) * 8000.0f) / i4;
                        Y0G y0g = c73328Y8j.A09;
                        int sqrt = (int) Math.sqrt(j2);
                        if (y0g.A00 != 1) {
                            Collections.sort(y0g.A04, Y0G.A06);
                            y0g.A00 = 1;
                        }
                        int i5 = y0g.A02;
                        if (i5 > 0) {
                            C72745XmL[] c72745XmLArr = y0g.A05;
                            i5--;
                            y0g.A02 = i5;
                            c72745XmL = c72745XmLArr[i5];
                        } else {
                            c72745XmL = new Object();
                        }
                        int i6 = y0g.A01;
                        y0g.A01 = i6 + 1;
                        c72745XmL.A01 = i6;
                        c72745XmL.A02 = sqrt;
                        c72745XmL.A00 = f2;
                        ArrayList arrayList = y0g.A04;
                        arrayList.add(c72745XmL);
                        int i7 = y0g.A03 + sqrt;
                        while (true) {
                            y0g.A03 = i7;
                            while (i7 > 2000) {
                                i = i7 - CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
                                c72745XmL2 = (C72745XmL) arrayList.get(0);
                                i2 = c72745XmL2.A02;
                                if (i2 <= i) {
                                    i7 -= i2;
                                    y0g.A03 = i7;
                                    arrayList.remove(0);
                                    int i8 = i5;
                                    if (i5 < 5) {
                                        C72745XmL[] c72745XmLArr2 = y0g.A05;
                                        i5++;
                                        y0g.A02 = i5;
                                        c72745XmLArr2[i8] = c72745XmL2;
                                    }
                                }
                            }
                            c72745XmL2.A02 = i2 - i;
                            i7 -= i;
                        }
                        if (c73328Y8j.A06 >= 2000 || c73328Y8j.A05 >= 524288) {
                            if (y0g.A00 != 0) {
                                Collections.sort(arrayList, Y0G.A07);
                                y0g.A00 = 0;
                            }
                            float f3 = 0.5f * y0g.A03;
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                if (i9 < arrayList.size()) {
                                    C72745XmL c72745XmL3 = (C72745XmL) arrayList.get(i9);
                                    i10 += c72745XmL3.A02;
                                    if (i10 >= f3) {
                                        f = c72745XmL3.A00;
                                        break;
                                    }
                                    i9++;
                                } else if (arrayList.isEmpty()) {
                                    f = Float.NaN;
                                } else {
                                    f = ((C72745XmL) arrayList.get(arrayList.size() - 1)).A00;
                                }
                            }
                            c73328Y8j.A02 = f;
                        }
                        C73328Y8j.A01(c73328Y8j, i4, c73328Y8j.A03, c73328Y8j.A02);
                        c73328Y8j.A04 = elapsedRealtime;
                        c73328Y8j.A03 = 0L;
                    }
                    c73328Y8j.A01--;
                }
            }
        }
        this.A01 = null;
    }

    public final void A03() {
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i);
        }
    }

    public final void A04(int i) {
        for (int i2 = 0; i2 < this.A00; i2++) {
            YM6 ym6 = (YM6) this.A02.get(i2);
            boolean z = this.A03;
            C73328Y8j c73328Y8j = (C73328Y8j) ym6;
            synchronized (c73328Y8j) {
                if (z) {
                    c73328Y8j.A03 += i;
                }
            }
        }
    }

    public final void A05(C62932SYa c62932SYa) {
        this.A01 = c62932SYa;
        for (int i = 0; i < this.A00; i++) {
            YM6 ym6 = (YM6) this.A02.get(i);
            boolean z = this.A03;
            C73328Y8j c73328Y8j = (C73328Y8j) ym6;
            synchronized (c73328Y8j) {
                if (z) {
                    int i2 = c73328Y8j.A01;
                    if (i2 == 0) {
                        c73328Y8j.A04 = SystemClock.elapsedRealtime();
                    }
                    c73328Y8j.A01 = i2 + 1;
                }
            }
        }
    }

    public AbstractC73327Y8i(boolean z) {
        this.A03 = z;
    }

    @Override // X.InterfaceC65627Tpn
    public final void AAg(YM6 ym6) {
        ym6.getClass();
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(ym6)) {
            arrayList.add(ym6);
            this.A00++;
        }
    }
}
