package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vrt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69590Vrt {
    public final C70076W1t A00;
    public final List A01;
    public final C69529Vqt A02;
    public final C69166Viv A03;

    public C69590Vrt(C70076W1t c70076W1t, List list) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = c70076W1t;
        C69529Vqt c69529Vqt = new C69529Vqt(this);
        this.A02 = c69529Vqt;
        ArrayList A1N = AbstractC16960so.A1N(0);
        int i = 0;
        int i2 = 0;
        for (US9 us9 : this.A01) {
            int i3 = i + 1;
            if (i2 != 0) {
                int length = us9.A06.length() + i2 + 1;
                C70076W1t c70076W1t2 = this.A00;
                if (length > (c70076W1t2 == null ? new C70076W1t(27, 35) : c70076W1t2).A00) {
                    AbstractC166997dE.A1W(A1N, i);
                    i2 = 0;
                }
            }
            i2 += us9.A06.length() + 1;
            i = i3;
        }
        this.A03 = new C69166Viv(c69529Vqt, A1N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a9, code lost:
    
        r12 = r8.A00(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
    
        if (r12 >= r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
    
        r13 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
    
        if (r13 <= r3.nextFloat()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b9, code lost:
    
        r9 = r2;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (r12 >= r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
    
        r16 = r2;
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        r13 = (float) java.lang.Math.exp((-(r12 - r7)) / r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0114, code lost:
    
        if (r12 > r1.size()) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0091, code lost:
    
        if (r12 >= r1.size()) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A00() {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69590Vrt.A00():java.util.List");
    }
}
