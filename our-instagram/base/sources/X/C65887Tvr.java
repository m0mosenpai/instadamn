package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Tvr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65887Tvr {
    public int A00;
    public Rect A01;
    public final Bitmap A02;
    public final List A03;
    public final List A04;

    public final void A01(int i, int i2, int i3) {
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            Rect rect = this.A01;
            if (rect == null) {
                rect = new Rect();
                this.A01 = rect;
            }
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            if (!this.A01.intersect(0, i, i2, i3)) {
                throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        if (r2 != 0.0f) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010a, code lost:
    
        r1 = r11[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010e, code lost:
    
        if (r1 <= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        r11[r4] = r1 / r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0113, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0115, code lost:
    
        if (r4 >= 3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
    
        r4 = r8.A04;
        r12 = r8.A02;
        r11 = r12.size();
        r22 = 0.0f;
        r3 = null;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
    
        if (r10 >= r11) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
    
        r2 = (X.C65890Tvu) r12.get(r10);
        r15 = r2.A01();
        r14 = r15[1];
        r0 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013b, code lost:
    
        if (r14 < r0[0]) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0142, code lost:
    
        if (r14 > r0[2]) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0144, code lost:
    
        r13 = r15[2];
        r15 = r5.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        if (r13 < r15[0]) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0154, code lost:
    
        if (r13 > r15[2]) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015e, code lost:
    
        if (r8.A00.get(r2.A05) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0160, code lost:
    
        r20 = r2.A01();
        r1 = r8.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0166, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0168, code lost:
    
        r14 = r1.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016a, code lost:
    
        r1 = r5.A02;
        r19 = r1[0];
        r17 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0175, code lost:
    
        if (r19 <= 0.0f) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0177, code lost:
    
        r19 = r19 * (1.0f - java.lang.Math.abs(r20[1] - r0[1]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0184, code lost:
    
        r16 = r1[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0188, code lost:
    
        if (r16 <= 0.0f) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018a, code lost:
    
        r16 = r16 * (1.0f - java.lang.Math.abs(r20[2] - r15[1]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0198, code lost:
    
        r13 = r1[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019d, code lost:
    
        if (r13 <= 0.0f) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019f, code lost:
    
        r17 = r13 * (r2.A04 / r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a6, code lost:
    
        r19 = (r19 + r16) + r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01aa, code lost:
    
        if (r3 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ae, code lost:
    
        if (r19 <= r22) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b3, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b0, code lost:
    
        r3 = r2;
        r22 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b7, code lost:
    
        r16 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ba, code lost:
    
        r19 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bd, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (r3 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        r8.A00.append(r3.A05, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
    
        r4.put(r5, r3);
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C65888Tvs A00() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65887Tvr.A00():X.Tvs");
    }

    public C65887Tvr(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A00 = 16;
        ArrayList arrayList2 = new ArrayList();
        this.A03 = arrayList2;
        if (bitmap != null && !bitmap.isRecycled()) {
            arrayList2.add(C65888Tvs.A05);
            this.A02 = bitmap;
            arrayList.add(C65902Tw7.A06);
            arrayList.add(C65902Tw7.A08);
            arrayList.add(C65902Tw7.A04);
            arrayList.add(C65902Tw7.A05);
            arrayList.add(C65902Tw7.A07);
            arrayList.add(C65902Tw7.A03);
            return;
        }
        throw new IllegalArgumentException("Bitmap is not valid");
    }
}
