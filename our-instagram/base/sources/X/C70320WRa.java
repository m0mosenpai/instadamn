package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.WRa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70320WRa implements XE1 {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC72026XFo A03;
    public C66402UFn A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final SparseArray A08;
    public final SparseBooleanArray A09;
    public final SparseBooleanArray A0A;
    public final WFa A0B;
    public final C69400Vmk A0C;
    public final InterfaceC71840X6y A0D;
    public final List A0E;
    public final int A0F;
    public final SparseIntArray A0G;
    public final InterfaceC72027XFp A0H;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        C66402UFn c66402UFn;
        long j3;
        List list = this.A0E;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C69793VvZ c69793VvZ = (C69793VvZ) list.get(i);
            synchronized (c69793VvZ) {
                j3 = c69793VvZ.A01;
            }
            if (j3 != -9223372036854775807L) {
                long A00 = c69793VvZ.A00();
                if (A00 != -9223372036854775807L) {
                    if (A00 != 0) {
                        if (A00 == j2) {
                        }
                    }
                }
            }
            c69793VvZ.A04(j2);
        }
        if (j2 != 0 && (c66402UFn = this.A04) != null) {
            c66402UFn.A01(j2);
        }
        this.A0B.A0M(0);
        this.A0G.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.A08;
            if (i2 < sparseArray.size()) {
                ((InterfaceC71967XCx) sparseArray.valueAt(i2)).EMb();
                i2++;
            } else {
                this.A00 = 0;
                return;
            }
        }
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        if ((this.A0F & 1) == 0) {
            interfaceC72026XFo = new C70333WRn(interfaceC72026XFo, this.A0H);
        }
        this.A03 = interfaceC72026XFo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0248, code lost:
    
        if (r6 == false) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.UFn, X.Vtw] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, X.X8j] */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7l(X.XGj r26, X.VZk r27) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70320WRa.E7l(X.XGj, X.VZk):int");
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        byte[] bArr = this.A0B.A02;
        xGj.E3s(bArr, 0, 940);
        int i = 0;
        do {
            int i2 = 0;
            while (bArr[(i2 * 188) + i] == 71) {
                i2++;
                if (i2 >= 5) {
                    xGj.Em8(i);
                    return true;
                }
            }
            i++;
        } while (i < 188);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.WFa, java.lang.Object] */
    public C70320WRa(C69793VvZ c69793VvZ, InterfaceC72027XFp interfaceC72027XFp, InterfaceC71840X6y interfaceC71840X6y, int i) {
        this.A0D = interfaceC71840X6y;
        this.A0F = i;
        this.A0H = interfaceC72027XFp;
        this.A0E = Collections.singletonList(c69793VvZ);
        ?? obj = new Object();
        obj.A02 = new byte[9400];
        obj.A00 = 0;
        this.A0B = obj;
        this.A09 = new SparseBooleanArray();
        this.A0A = new SparseBooleanArray();
        this.A08 = new SparseArray();
        this.A0G = new SparseIntArray();
        this.A0C = new C69400Vmk();
        this.A03 = InterfaceC72026XFo.A00;
        this.A01 = -1;
        this.A09.clear();
        SparseArray sparseArray = this.A08;
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC65702TsY.A10(sparseArray2, sparseArray, i2);
        }
        sparseArray.put(0, new C70360WSo(new C70357WSl(this)));
    }

    @Deprecated
    public C70320WRa() {
        this(new C69793VvZ(), InterfaceC72027XFp.A00, new C70359WSn(ImmutableList.of()), 1);
    }
}
