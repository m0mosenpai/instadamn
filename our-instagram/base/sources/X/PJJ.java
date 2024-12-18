package X;

import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class PJJ implements InterfaceC58173Pqd {
    public static final long A02 = TimeUnit.MILLISECONDS.toMicros(15);
    public int A00;
    public final List A01;

    @Override // X.InterfaceC58173Pqd
    public final boolean Cs9() {
        return true;
    }

    @Override // X.InterfaceC58173Pqd
    public final void DMF(long j) {
    }

    @Override // X.InterfaceC58173Pqd
    public final void CzY(long j, int i, Bitmap bitmap) {
        Object obj;
        Object A1D;
        this.A00++;
        Iterator it = this.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Math.abs(((C51580MqY) obj).A04 - j) < A02) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C51580MqY c51580MqY = (C51580MqY) obj;
        if (c51580MqY != null) {
            String A0R = AnonymousClass001.A0R(c51580MqY.A06, "compare.png");
            try {
                FileOutputStream A0x = MSW.A0x(AbstractC166987dD.A11(A0R));
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    C0fK.A01(compressFormat, bitmap, 100);
                    if (!bitmap.compress(compressFormat, 100, A0x)) {
                        AbstractC31173DnH.A1Z("path:", A0R, "bitmap_compress_error");
                    }
                    A1D = C0eB.A00;
                    A0x.close();
                } finally {
                }
            } catch (Throwable th) {
                A1D = MSW.A1D(th);
            }
            if (!(A1D instanceof C09540e5)) {
                c51580MqY.A05 = A0R;
                c51580MqY.A01 = i;
                c51580MqY.A03 = j;
            }
            Throwable A00 = C09550e6.A00(A1D);
            if (A00 != null) {
                C0K8.A0G("PtsCaptureDecision", "bitmap io error", A00);
                C0w9.A07("compare_img_save_err", A00);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        return false;
     */
    @Override // X.InterfaceC58173Pqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ehv(int r8, long r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.A01
            java.util.Iterator r6 = r0.iterator()
        L6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r5 = r6.next()
            r0 = r5
            X.MqY r0 = (X.C51580MqY) r0
            long r0 = r0.A04
            long r0 = r0 - r9
            long r3 = java.lang.Math.abs(r0)
            long r1 = X.PJJ.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6
            r0 = 1
            if (r5 != 0) goto L24
        L23:
            r0 = 0
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PJJ.Ehv(int, long):boolean");
    }

    public PJJ(List list) {
        this.A01 = list;
    }

    @Override // X.InterfaceC58173Pqd
    public final /* synthetic */ Long AVb(List list) {
        return null;
    }
}
