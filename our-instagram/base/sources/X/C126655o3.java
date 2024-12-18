package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* renamed from: X.5o3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126655o3 implements C4Z0, InterfaceC96664Wb {
    public InterfaceC96664Wb A00;
    public C4WU A02;
    public final C4Z0[] A04;
    public final C4XQ A05;
    public final ArrayList A06 = new ArrayList();
    public final HashMap A07 = new HashMap();
    public C4Z1 A01 = new C4YZ(new C4Z1[0]);
    public final IdentityHashMap A08 = new IdentityHashMap();
    public C4Z0[] A03 = new C4Z0[0];

    @Override // X.C4Z0
    public final long E53(long j) {
        return 0L;
    }

    @Override // X.C4Z1
    public final void AGb(long j) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4Z1) arrayList.get(i)).AGb(j);
            }
            return;
        }
        this.A01.AGb(j);
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean AJq(long j, long j2) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4Z0) arrayList.get(i)).AJq(j, j2);
            }
            return false;
        }
        return this.A01.AJq(j, j2);
    }

    @Override // X.C4Z0, X.C4Z1
    public final /* synthetic */ boolean AJr(C69080VhW c69080VhW) {
        return AJq(c69080VhW.A01, -9223372036854775807L);
    }

    @Override // X.C4Z0
    public final void APa(long j, boolean z) {
        for (C4Z0 c4z0 : this.A03) {
            c4z0.APa(j, z);
        }
    }

    @Override // X.C4Z0
    public final long AZz(C4TT c4tt, long j) {
        C4Z0[] c4z0Arr = this.A03;
        if (c4z0Arr.length <= 0) {
            c4z0Arr = this.A04;
        }
        return c4z0Arr[0].AZz(c4tt, j);
    }

    @Override // X.C4Z1
    public final long Aii(long j) {
        return this.A01.Aii(j);
    }

    @Override // X.C4Z0, X.C4Z1
    public final long Aik() {
        return this.A01.Aik();
    }

    @Override // X.C4Z0, X.C4Z1
    public final long BWx() {
        return this.A01.BWx();
    }

    @Override // X.C4Z0
    public final C4WU CAF() {
        C4WU c4wu = this.A02;
        c4wu.getClass();
        return c4wu;
    }

    @Override // X.C4Z0
    public final void Coz() {
        for (C4Z0 c4z0 : this.A04) {
            c4z0.Coz();
        }
    }

    @Override // X.InterfaceC96674Wc
    public final /* bridge */ /* synthetic */ void D7l(C4Z1 c4z1) {
        InterfaceC96664Wb interfaceC96664Wb = this.A00;
        interfaceC96664Wb.getClass();
        interfaceC96664Wb.D7l(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC96664Wb
    public final void DaW(C4Z0 c4z0) {
        ArrayList arrayList = this.A06;
        arrayList.remove(c4z0);
        if (arrayList.isEmpty()) {
            C4Z0[] c4z0Arr = this.A04;
            int length = c4z0Arr.length;
            int i = 0;
            for (C4Z0 c4z02 : c4z0Arr) {
                i += c4z02.CAF().A01;
            }
            C4WV[] c4wvArr = new C4WV[i];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                C4WU CAF = c4z0Arr[i3].CAF();
                int i4 = CAF.A01;
                int i5 = 0;
                while (i5 < i4) {
                    C4WV c4wv = (C4WV) CAF.A02.get(i5);
                    C4WV c4wv2 = new C4WV(AnonymousClass001.A04(i3, ":", c4wv.A03), c4wv.A04);
                    this.A07.put(c4wv2, c4wv);
                    c4wvArr[i2] = c4wv2;
                    i5++;
                    i2++;
                }
            }
            this.A02 = new C4WU(c4wvArr);
            InterfaceC96664Wb interfaceC96664Wb = this.A00;
            interfaceC96664Wb.getClass();
            interfaceC96664Wb.DaW(this);
        }
    }

    @Override // X.C4Z0
    public final void E5S(InterfaceC96664Wb interfaceC96664Wb, long j) {
        this.A00 = interfaceC96664Wb;
        ArrayList arrayList = this.A06;
        C4Z0[] c4z0Arr = this.A04;
        Collections.addAll(arrayList, c4z0Arr);
        for (C4Z0 c4z0 : c4z0Arr) {
            c4z0.E5S(this, j);
        }
    }

    @Override // X.C4Z0
    public final long E7z() {
        long j = -9223372036854775807L;
        for (C4Z0 c4z0 : this.A03) {
            long E7z = c4z0.E7z();
            if (E7z != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (C4Z0 c4z02 : this.A03) {
                        if (c4z02 == c4z0) {
                            break;
                        }
                        if (c4z02.EMn(E7z, false) != E7z) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = E7z;
                } else if (E7z != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && c4z0.EMn(j, false) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // X.C4Z0, X.C4Z1
    public final void ECm(long j) {
        this.A01.ECm(j);
    }

    @Override // X.C4Z0
    public final long EMn(long j, boolean z) {
        long EMn = this.A03[0].EMn(j, z);
        int i = 1;
        while (true) {
            C4Z0[] c4z0Arr = this.A03;
            if (i < c4z0Arr.length) {
                if (c4z0Arr[i].EMn(EMn, z) == EMn) {
                    i++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return EMn;
            }
        }
    }

    @Override // X.C4Z0
    public final long EMx(InterfaceC97394Yz[] interfaceC97394YzArr, C4WE[] c4weArr, boolean[] zArr, boolean[] zArr2, long j) {
        InterfaceC97394Yz interfaceC97394Yz;
        int intValue;
        long j2 = j;
        int length = c4weArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            Number number = null;
            if (i >= length) {
                break;
            }
            InterfaceC97394Yz interfaceC97394Yz2 = interfaceC97394YzArr[i];
            if (interfaceC97394Yz2 != null) {
                number = (Number) this.A08.get(interfaceC97394Yz2);
            }
            int i2 = -1;
            if (number == null) {
                intValue = -1;
            } else {
                intValue = number.intValue();
            }
            iArr[i] = intValue;
            C4WE c4we = c4weArr[i];
            if (c4we != null) {
                String str = c4we.CAE().A03;
                i2 = Integer.parseInt(str.substring(0, str.indexOf(":")));
            }
            iArr2[i] = i2;
            i++;
        }
        IdentityHashMap identityHashMap = this.A08;
        identityHashMap.clear();
        InterfaceC97394Yz[] interfaceC97394YzArr2 = new InterfaceC97394Yz[length];
        InterfaceC97394Yz[] interfaceC97394YzArr3 = new InterfaceC97394Yz[length];
        C4WE[] c4weArr2 = new C4WE[length];
        C4Z0[] c4z0Arr = this.A04;
        int length2 = c4z0Arr.length;
        ArrayList arrayList = new ArrayList(length2);
        for (int i3 = 0; i3 < length2; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                if (iArr[i4] == i3) {
                    interfaceC97394Yz = interfaceC97394YzArr[i4];
                } else {
                    interfaceC97394Yz = null;
                }
                interfaceC97394YzArr3[i4] = interfaceC97394Yz;
                if (iArr2[i4] == i3) {
                    final C4WE c4we2 = c4weArr[i4];
                    c4we2.getClass();
                    Object obj = this.A07.get(c4we2.CAE());
                    obj.getClass();
                    final C4WV c4wv = (C4WV) obj;
                    c4weArr2[i4] = new C4WE(c4wv, c4we2) { // from class: X.5o6
                        public final C4WV A00;
                        public final C4WE A01;

                        @Override // X.C4WF
                        public final long BUB(C4TG c4tg, InterfaceC97914aW interfaceC97914aW, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, boolean z, boolean z2, boolean z3) {
                            return 0L;
                        }

                        public final boolean equals(Object obj2) {
                            if (this == obj2) {
                                return true;
                            }
                            if (!(obj2 instanceof C126685o6)) {
                                return false;
                            }
                            C126685o6 c126685o6 = (C126685o6) obj2;
                            return this.A01.equals(c126685o6.A01) && this.A00.equals(c126685o6.A00);
                        }

                        @Override // X.C4WE
                        public final boolean AE3(int i5, long j3) {
                            return this.A01.AE3(i5, j3);
                        }

                        @Override // X.C4WE
                        public final int AT9(List list, long j3) {
                            return this.A01.AT9(list, j3);
                        }

                        @Override // X.C4WF
                        public final C4B6 B7x(int i5) {
                            return this.A01.B7x(i5);
                        }

                        @Override // X.C4WF
                        public final int BHT(int i5) {
                            return this.A01.BHT(i5);
                        }

                        @Override // X.C4WE
                        public final C4B6 Bsc() {
                            return this.A01.Bsc();
                        }

                        @Override // X.C4WE
                        public final int Bsd() {
                            return this.A01.Bsd();
                        }

                        @Override // X.C4WE
                        public final Object Bst() {
                            return this.A01.Bst();
                        }

                        @Override // X.C4WE
                        public final int Bsv() {
                            return this.A01.Bsv();
                        }

                        @Override // X.C4WF
                        public final C4WV CAE() {
                            return this.A00;
                        }

                        @Override // X.C4WF
                        public final int CNI(int i5) {
                            return this.A01.CNI(i5);
                        }

                        @Override // X.C4WF
                        public final int CNJ(C4B6 c4b6) {
                            return this.A01.CNJ(c4b6);
                        }

                        @Override // X.C4WE
                        public final boolean CQd(int i5, long j3) {
                            return this.A01.CQd(i5, j3);
                        }

                        @Override // X.C4WE
                        public final void DYy(boolean z) {
                            this.A01.DYy(z);
                        }

                        @Override // X.C4WE
                        public final void DZ8(float f) {
                            this.A01.DZ8(f);
                        }

                        @Override // X.C4WE
                        public final boolean EiE(AbstractC98234b2 abstractC98234b2, List list, long j3) {
                            return this.A01.EiE(abstractC98234b2, list, j3);
                        }

                        @Override // X.C4WE
                        public final void FC5(InterfaceC97914aW interfaceC97914aW, AbstractC98474bQ abstractC98474bQ, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
                            this.A01.FC5(interfaceC97914aW, abstractC98474bQ, j3, j4, j5, j6, z, z2);
                        }

                        public final int hashCode() {
                            return ((527 + this.A00.hashCode()) * 31) + this.A01.hashCode();
                        }

                        @Override // X.C4WF
                        public final int length() {
                            return this.A01.length();
                        }

                        {
                            this.A01 = c4we2;
                            this.A00 = c4wv;
                        }
                    };
                } else {
                    c4weArr2[i4] = null;
                }
            }
            long EMx = c4z0Arr[i3].EMx(interfaceC97394YzArr3, c4weArr2, zArr, zArr2, j2);
            if (i3 == 0) {
                j2 = EMx;
            } else if (EMx != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < length; i5++) {
                boolean z2 = true;
                if (iArr2[i5] == i3) {
                    InterfaceC97394Yz interfaceC97394Yz3 = interfaceC97394YzArr3[i5];
                    interfaceC97394Yz3.getClass();
                    interfaceC97394YzArr2[i5] = interfaceC97394YzArr3[i5];
                    identityHashMap.put(interfaceC97394Yz3, Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    if (interfaceC97394YzArr3[i5] != null) {
                        z2 = false;
                    }
                    C4B8.A04(z2);
                }
            }
            if (z) {
                arrayList.add(c4z0Arr[i3]);
            }
        }
        System.arraycopy(interfaceC97394YzArr2, 0, interfaceC97394YzArr, 0, length);
        C4Z0[] c4z0Arr2 = (C4Z0[]) arrayList.toArray(new C4Z0[0]);
        this.A03 = c4z0Arr2;
        this.A01 = new C4YZ(c4z0Arr2);
        return j2;
    }

    @Override // X.C4Z1
    public final void Eax(boolean z) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4Z1) arrayList.get(i)).Eax(z);
            }
            return;
        }
        this.A01.Eax(z);
    }

    @Override // X.C4Z1
    public final void FBK(byte b, boolean z) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4Z1) arrayList.get(i)).FBK(b, z);
            }
            return;
        }
        this.A01.FBK(b, z);
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean isLoading() {
        return this.A01.isLoading();
    }

    public C126655o3(C4XQ c4xq, long[] jArr, C4Z0... c4z0Arr) {
        this.A05 = c4xq;
        this.A04 = c4z0Arr;
        for (int i = 0; i < c4z0Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.A04[i] = new C133185zk(c4z0Arr[i], j);
            }
        }
    }
}
