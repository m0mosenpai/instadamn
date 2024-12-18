package X;

import java.util.List;

/* renamed from: X.8Is, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8Is {
    public final float A00;
    public final float A01;

    public final int[] A01(List list, float f, float f2) {
        double ceil;
        int i;
        int[] iArr = new int[3];
        if (!list.isEmpty()) {
            float f3 = this.A01;
            float f4 = this.A00;
            boolean z = false;
            if (f3 > f4) {
                z = true;
            }
            if (f != -1.0f) {
                f3 = (Math.abs(f - f2) * f3) + f;
            }
            double size = (list.size() - 1) * f3;
            if (z) {
                ceil = Math.floor(size);
            } else {
                ceil = Math.ceil(size);
            }
            iArr[0] = (int) ceil;
            if (f2 != -1.0f) {
                f4 = f + (Math.abs(f - f2) * f4);
            }
            double size2 = (list.size() - 1) * f4;
            if (z) {
                int ceil2 = (int) Math.ceil(size2);
                iArr[1] = ceil2;
                i = ceil2 + 1;
            } else {
                int floor = (int) Math.floor(size2);
                iArr[1] = floor;
                i = floor - 1;
            }
            iArr[1] = i;
            iArr[2] = Math.abs(iArr[0] - i) + 1;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r11.add(r10.get(java.lang.Math.round(r1)));
        r0 = java.lang.Math.abs(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r3 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r1 = r1 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r1 = r1 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r1 < r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r7 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r6 <= r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r11.add(r10.get(java.lang.Math.round(r6)));
        r0 = java.lang.Math.abs((((r6 - r2) / r3) * r4) + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        if (r7 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r6 = r6 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
    
        r6 = r6 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (r6 < r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r3 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r1 <= r2) goto L14;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004b -> B:8:0x002d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0036 -> B:12:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d4 -> B:28:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b9 -> B:31:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.util.List r10, java.util.List r11, float r12, float r13, float r14) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Is.A00(java.util.List, java.util.List, float, float, float):void");
    }

    public C8Is(float f, float f2) {
        if (f >= 0.0f && f <= 1.0f) {
            if (f2 >= 0.0f && f2 <= 1.0f) {
                this.A01 = f;
                this.A00 = f2;
                return;
            }
            throw new IllegalArgumentException("start must be 0.0f-1.0f");
        }
        throw new IllegalArgumentException("start must be 0.0f-1.0f");
    }
}
