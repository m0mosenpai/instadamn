package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Map;

/* renamed from: X.55E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55E {
    public final int A00;
    public final C55F[] A01;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r4.equals(r2.A00) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        return r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000e, code lost:
    
        if (r2 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.A04 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        r2 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A00(X.AbstractC910944l r4) {
        /*
            r3 = this;
            X.55F[] r2 = r3.A01
            int r0 = r4.hashCode()
            int r1 = r0 + (-1)
            int r0 = r3.A00
            r1 = r1 & r0
            r2 = r2[r1]
            r1 = 0
            if (r2 != 0) goto L15
        L10:
            return r1
        L11:
            X.55F r2 = r2.A02
            if (r2 == 0) goto L10
        L15:
            boolean r0 = r2.A04
            if (r0 != 0) goto L11
            X.44l r0 = r2.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L11
            com.fasterxml.jackson.databind.JsonSerializer r1 = r2.A01
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55E.A00(X.44l):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r2.A04 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        return r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0010, code lost:
    
        if (r2 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0012, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r2.A03 != r4) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        r2 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A01(java.lang.Class r4) {
        /*
            r3 = this;
            X.55F[] r2 = r3.A01
            java.lang.String r0 = r4.getName()
            int r1 = r0.hashCode()
            int r0 = r3.A00
            r1 = r1 & r0
            r2 = r2[r1]
            r1 = 0
            if (r2 != 0) goto L17
        L12:
            return r1
        L13:
            X.55F r2 = r2.A02
            if (r2 == 0) goto L12
        L17:
            java.lang.Class r0 = r2.A03
            if (r0 != r4) goto L13
            boolean r0 = r2.A04
            if (r0 != 0) goto L13
            com.fasterxml.jackson.databind.JsonSerializer r1 = r2.A01
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55E.A01(java.lang.Class):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public C55E(Map map) {
        int size = map.size();
        int i = 8;
        while (i < (size > 64 ? (size >> 2) + size : size + size)) {
            i += i;
        }
        this.A00 = i - 1;
        C55F[] c55fArr = new C55F[i];
        for (Map.Entry entry : map.entrySet()) {
            C55G c55g = (C55G) entry.getKey();
            int hashCode = c55g.hashCode() & this.A00;
            c55fArr[hashCode] = new C55F((JsonSerializer) entry.getValue(), c55fArr[hashCode], c55g);
        }
        this.A01 = c55fArr;
    }
}
