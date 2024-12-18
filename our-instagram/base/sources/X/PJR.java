package X;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class PJR implements InterfaceC58090PpF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ OF8 A02;

    @Override // X.InterfaceC58090PpF
    public final void APx(Bitmap bitmap, int i, int i2) {
        C14360o3.A0B(bitmap, 0);
        this.A02.A05.A00(i, bitmap);
    }

    public PJR(OF8 of8, int i, int i2) {
        this.A02 = of8;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [X.NnR, java.lang.Object] */
    @Override // X.InterfaceC58090PpF
    public final void Drf(double[] dArr) {
        OF8 of8 = this.A02;
        int length = dArr.length;
        double[] dArr2 = new double[length];
        of8.A01 = dArr2;
        for (int i = 0; i < length; i++) {
            dArr2[i] = 1000.0d * dArr[i];
        }
        int i2 = this.A01;
        int i3 = this.A00;
        long j = of8.A04.A01;
        List list = of8.A08;
        double size = (j / list.size()) / 2.0d;
        double[] dArr3 = new double[list.size()];
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            dArr3[i4] = MSW.A00(list.get(i4));
        }
        OXC oxc = of8.A00;
        if (oxc != null) {
            oxc.A04 = dArr3;
            oxc.A00();
        }
        HashMap A1G = AbstractC166987dD.A1G();
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            double A00 = MSW.A00(list.get(i5));
            double[] dArr4 = of8.A01;
            if (dArr4 == null) {
                C14360o3.A0F("syncFrameTimesMs");
                throw C00O.createAndThrow();
            }
            int length2 = dArr4.length;
            int i6 = 0;
            while (true) {
                if (i6 < length2) {
                    double d = dArr4[i6];
                    double d2 = A00 + size;
                    if (A00 - size <= d && d <= d2) {
                        OXC oxc2 = of8.A00;
                        if (oxc2 != null) {
                            int A05 = AbstractC25226BEj.A05(list);
                            ?? obj = new Object();
                            obj.A04 = 0;
                            obj.A02 = A05;
                            obj.A01 = i2;
                            obj.A00 = i3;
                            obj.A03 = 0;
                            oxc2.A0B.ATO(new C52384NGf(obj, oxc2, i5));
                        }
                    } else {
                        i6++;
                    }
                } else {
                    double d3 = 0.0d;
                    for (double d4 : dArr4) {
                        if (A00 - d4 >= 0.0d && d4 > d3) {
                            d3 = d4;
                        }
                    }
                    Double valueOf = Double.valueOf(d3);
                    if (!A1G.containsKey(valueOf)) {
                        A1G.put(valueOf, AbstractC166987dD.A1E());
                    }
                    List A18 = MSW.A18(valueOf, A1G);
                    if (A18 != null) {
                        MSX.A0u(i5, A18);
                    }
                }
            }
        }
        HandlerThread handlerThread = new HandlerThread("BitmapTimelineFramesGenerator.NonSyncThumbnailThread", 9);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        MSY.A09(handlerThread).post(new PTB(handlerThread, of8, A1G, i2));
    }
}
