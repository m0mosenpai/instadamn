package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.2A9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2A9 {
    public static final Comparator A06 = new Comparator() { // from class: X.2AA
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C2AD) obj).A01 - ((C2AD) obj2).A01;
        }
    };
    public static final Comparator A07 = new Comparator() { // from class: X.2AB
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C2AD) obj).A00, ((C2AD) obj2).A00);
        }
    };
    public int A01;
    public int A02;
    public int A03;
    public final C2AD[] A05 = new C2AD[5];
    public final ArrayList A04 = new ArrayList();
    public int A00 = -1;

    public final float A00() {
        if (this.A00 != 0) {
            Collections.sort(this.A04, A07);
            this.A00 = 0;
        }
        float f = 0.5f * this.A02;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A04;
            if (i < arrayList.size()) {
                C2AD c2ad = (C2AD) arrayList.get(i);
                i2 += c2ad.A02;
                if (i2 >= f) {
                    return c2ad.A00;
                }
                i++;
            } else {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((C2AD) arrayList.get(arrayList.size() - 1)).A00;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(int i, float f) {
        C2AD c2ad;
        int i2;
        C2AD c2ad2;
        int i3;
        if (this.A00 != 1) {
            Collections.sort(this.A04, A06);
            this.A00 = 1;
        }
        int i4 = this.A03;
        if (i4 > 0) {
            C2AD[] c2adArr = this.A05;
            i4--;
            this.A03 = i4;
            c2ad = c2adArr[i4];
        } else {
            c2ad = new Object();
        }
        int i5 = this.A01;
        this.A01 = i5 + 1;
        c2ad.A01 = i5;
        c2ad.A02 = i;
        c2ad.A00 = f;
        ArrayList arrayList = this.A04;
        arrayList.add(c2ad);
        int i6 = this.A02 + i;
        while (true) {
            this.A02 = i6;
            while (i6 > 2000 && !arrayList.isEmpty()) {
                i2 = i6 - CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
                c2ad2 = (C2AD) arrayList.get(0);
                i3 = c2ad2.A02;
                if (i3 <= i2) {
                    i6 -= i3;
                    this.A02 = i6;
                    arrayList.remove(0);
                    int i7 = i4;
                    if (i4 < 5) {
                        C2AD[] c2adArr2 = this.A05;
                        i4++;
                        this.A03 = i4;
                        c2adArr2[i7] = c2ad2;
                    }
                }
            }
            return;
            c2ad2.A02 = i3 - i2;
            i6 -= i2;
        }
    }
}
