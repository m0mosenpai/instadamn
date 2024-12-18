package X;

import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
public final class AYE implements InterfaceC170287ih {
    public final /* synthetic */ C124005jE A00;
    public final /* synthetic */ C2Z5 A01;

    public AYE(C124005jE c124005jE, C2Z5 c2z5) {
        this.A01 = c2z5;
        this.A00 = c124005jE;
    }

    @Override // X.InterfaceC170287ih
    public final void Dl3(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        int i7;
        C124005jE c124005jE = this.A00;
        synchronized (c124005jE) {
            i4 = c124005jE.A00;
        }
        if (i4 != i3) {
            synchronized (c124005jE) {
                c124005jE.A00 = i3;
            }
            C2Z5 c2z5 = this.A01;
            if (c2z5.A16 != null) {
                int Bqz = c2z5.A0T.Bqz();
                C2Vj c2Vj = c2z5.A16;
                if (Bqz == 0) {
                    i6 = c2Vj.A00;
                } else {
                    i6 = c2Vj.A01;
                }
                if (i6 != -1) {
                    synchronized (c124005jE) {
                        i7 = c124005jE.A00;
                    }
                    if (i7 <= i6) {
                        return;
                    }
                }
            }
            synchronized (c2z5) {
                if (c2z5.A16 != null && !c2z5.A0n) {
                    List list = c2z5.A0i;
                    int size = list.size();
                    int i8 = 0;
                    for (int i9 = 0; i9 < size; i9++) {
                        C124005jE c124005jE2 = (C124005jE) list.get(i9);
                        synchronized (c124005jE2) {
                            i5 = c124005jE2.A00;
                        }
                        if (i5 > i8) {
                            i8 = i5;
                        }
                    }
                    if (i8 != c2z5.A16.A00) {
                        int max = Math.max(c2z5.A0T.ACM(View.MeasureSpec.getSize(c2z5.A06), View.MeasureSpec.getSize(c2z5.A05), i2, i8), 1);
                        c2z5.A16.A00 = i8;
                        c2z5.A04 = max;
                    }
                }
                C2Z5.A0M(c2z5);
            }
        }
    }
}
