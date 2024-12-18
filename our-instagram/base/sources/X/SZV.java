package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class SZV {
    public final boolean A00;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        if (r2.A01 == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r2.A01 == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        if (r2.A01 == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        if (r2.A01 == r4) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0042. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A00(java.lang.Class r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.RCB
            if (r0 == 0) goto Le
            r1 = r3
            X.RCB r1 = (X.RCB) r1
            java.lang.Class r0 = r1.A01
            if (r4 != r0) goto L45
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A00
            return r0
        Le:
            boolean r0 = r3 instanceof X.RCC
            if (r0 == 0) goto L23
            r1 = r3
            X.RCC r1 = (X.RCC) r1
            java.lang.Class r0 = r1.A02
            if (r4 != r0) goto L1c
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A00
            return r0
        L1c:
            java.lang.Class r0 = r1.A03
            if (r4 != r0) goto L45
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A01
            return r0
        L23:
            boolean r0 = r3 instanceof X.RC9
            if (r0 != 0) goto L45
            r0 = r3
            X.RCA r0 = (X.RCA) r0
            X.SE1[] r1 = r0.A00
            r0 = 0
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 == r4) goto L4e
            r0 = 1
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 == r4) goto L4e
            r0 = 2
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 == r4) goto L4e
            int r0 = r1.length
            switch(r0) {
                case 4: goto L69;
                case 5: goto L61;
                case 6: goto L59;
                case 7: goto L51;
                case 8: goto L47;
                default: goto L45;
            }
        L45:
            r0 = 0
            return r0
        L47:
            r0 = 7
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 != r4) goto L51
        L4e:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A00
            return r0
        L51:
            r0 = 6
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 != r4) goto L59
            goto L4e
        L59:
            r0 = 5
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 != r4) goto L61
            goto L4e
        L61:
            r0 = 4
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 != r4) goto L69
            goto L4e
        L69:
            r0 = 3
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 != r4) goto L45
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SZV.A00(java.lang.Class):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final SZV A01(JsonSerializer jsonSerializer, Class cls) {
        if (this instanceof RC9) {
            return new RCB(jsonSerializer, this, cls);
        }
        if (this instanceof RCB) {
            RCB rcb = (RCB) this;
            return new RCC(rcb.A00, jsonSerializer, rcb, rcb.A01, cls);
        }
        if (this instanceof RCC) {
            RCC rcc = (RCC) this;
            return new RCA(rcc, new SE1[]{new SE1(rcc.A00, rcc.A02), new SE1(rcc.A01, rcc.A03), new SE1(jsonSerializer, cls)});
        }
        RCA rca = (RCA) this;
        SE1[] se1Arr = rca.A00;
        int length = se1Arr.length;
        if (length == 8) {
            if (((SZV) rca).A00) {
                return new RCB(jsonSerializer, rca, cls);
            }
            return rca;
        }
        SE1[] se1Arr2 = (SE1[]) Arrays.copyOf(se1Arr, length + 1);
        se1Arr2[length] = new SE1(jsonSerializer, cls);
        return new RCA(rca, se1Arr2);
    }

    public SZV(SZV szv) {
        this.A00 = szv.A00;
    }

    public SZV() {
        this.A00 = false;
    }
}
