package X;

import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6NM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NM implements C59C {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C57I A04;
    public SubcomposeSlotReusePolicy A05;
    public final AnonymousClass599 A09;
    public final HashMap A0A = new HashMap();
    public final HashMap A0C = new HashMap();
    public final C6NN A08 = new C6NN(this);
    public final C6NP A07 = new C6NP(this);
    public final HashMap A0B = new HashMap();
    public final C6NQ A0E = new C6NQ(null, null, 1);
    public final Map A0D = new LinkedHashMap();
    public final C57S A06 = new C57S(new Object[16]);

    public static final void A01(C6NM c6nm, int i, int i2) {
        AnonymousClass599 anonymousClass599 = c6nm.A09;
        anonymousClass599.A0J = true;
        anonymousClass599.A0U(i, i2, 1);
        anonymousClass599.A0J = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if ((!r5.A0E.isEmpty()) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C6NM r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6NM.A03(X.6NM, boolean):void");
    }

    public final void A06(int i) {
        InterfaceC16660sJ interfaceC16660sJ;
        this.A03 = 0;
        AnonymousClass599 anonymousClass599 = this.A09;
        int size = (anonymousClass599.A0G().size() - this.A02) - 1;
        if (i <= size) {
            C6NQ c6nq = this.A0E;
            c6nq.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    Object obj = this.A0A.get(anonymousClass599.A0G().get(i2));
                    C14360o3.A0A(obj);
                    c6nq.A00.add(((C6O9) obj).A02);
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.A05.Bxp(c6nq);
            Snapshot A02 = C3Z5.A02();
            if (A02 != null) {
                interfaceC16660sJ = A02.A03();
            } else {
                interfaceC16660sJ = null;
            }
            Snapshot A03 = C3Z5.A03(A02);
            boolean z = false;
            while (size >= i) {
                try {
                    AnonymousClass599 anonymousClass5992 = (AnonymousClass599) anonymousClass599.A0G().get(size);
                    HashMap hashMap = this.A0A;
                    Object obj2 = hashMap.get(anonymousClass5992);
                    C14360o3.A0A(obj2);
                    C6O9 c6o9 = (C6O9) obj2;
                    Object obj3 = c6o9.A02;
                    if (c6nq.contains(obj3)) {
                        this.A03++;
                        if (((Boolean) c6o9.A00.getValue()).booleanValue()) {
                            C5AZ c5az = anonymousClass5992.A0U;
                            C113385Aa c113385Aa = c5az.A0J;
                            Integer num = C05F.A0C;
                            c113385Aa.A09 = num;
                            C121665fI c121665fI = c5az.A05;
                            if (c121665fI != null) {
                                c121665fI.A05 = num;
                            }
                            c6o9.A00.Egh(false);
                            z = true;
                        }
                    } else {
                        anonymousClass599.A0J = true;
                        hashMap.remove(anonymousClass5992);
                        InterfaceC117435Tc interfaceC117435Tc = c6o9.A01;
                        if (interfaceC117435Tc != null) {
                            interfaceC117435Tc.dispose();
                        }
                        anonymousClass599.A0T(size, 1);
                        anonymousClass599.A0J = false;
                    }
                    this.A0C.remove(obj3);
                    size--;
                } finally {
                    C3Z5.A06(A02, A03, interfaceC16660sJ);
                }
            }
            if (z) {
                C3Z5.A05();
            }
        }
        A05();
    }

    @Override // X.C59C
    public final void D9L() {
        A03(this, true);
    }

    @Override // X.C59C
    public final void DhJ() {
        A03(this, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r1 == (-1)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AnonymousClass599 A00(X.C6NM r10, java.lang.Object r11) {
        /*
            int r0 = r10.A03
            r4 = 0
            if (r0 == 0) goto L9a
            X.599 r7 = r10.A09
            java.util.List r0 = r7.A0G()
            int r9 = r0.size()
            int r0 = r10.A02
            int r9 = r9 - r0
            int r0 = r10.A03
            int r6 = r9 - r0
            r5 = 1
            int r9 = r9 - r5
            r1 = r9
        L19:
            r8 = -1
            if (r1 < r6) goto L39
            java.util.List r0 = r7.A0G()
            java.lang.Object r0 = r0.get(r1)
            java.util.HashMap r3 = r10.A0A
            java.lang.Object r0 = r3.get(r0)
            X.C14360o3.A0A(r0)
            X.6O9 r0 = (X.C6O9) r0
            java.lang.Object r0 = r0.A02
            boolean r0 = X.C14360o3.A0K(r0, r11)
            if (r0 == 0) goto L5f
            if (r1 != r8) goto L65
        L39:
            if (r9 < r6) goto L9a
            java.util.List r0 = r7.A0G()
            java.lang.Object r0 = r0.get(r9)
            java.util.HashMap r3 = r10.A0A
            java.lang.Object r2 = r3.get(r0)
            X.C14360o3.A0A(r2)
            X.6O9 r2 = (X.C6O9) r2
            java.lang.Object r1 = r2.A02
            X.6NI r0 = X.C6NH.A00
            if (r1 == r0) goto L62
            androidx.compose.ui.layout.SubcomposeSlotReusePolicy r0 = r10.A05
            boolean r0 = r0.ACN(r11, r1)
            if (r0 != 0) goto L62
            int r9 = r9 + (-1)
            goto L39
        L5f:
            int r1 = r1 + (-1)
            goto L19
        L62:
            r2.A02 = r11
            r1 = r9
        L65:
            if (r1 == r8) goto L9a
            if (r1 == r6) goto L6c
            A01(r10, r1, r6)
        L6c:
            int r0 = r10.A03
            int r0 = r0 + (-1)
            r10.A03 = r0
            java.util.List r0 = r7.A0G()
            java.lang.Object r4 = r0.get(r6)
            X.599 r4 = (X.AnonymousClass599) r4
            java.lang.Object r3 = r3.get(r4)
            X.C14360o3.A0A(r3)
            X.6O9 r3 = (X.C6O9) r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            X.3Yd r1 = X.AbstractC74873Yc.A00()
            X.0do r0 = X.AbstractC74903Yf.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r0.<init>(r1, r2)
            r3.A00 = r0
            r3.A05 = r5
            r3.A04 = r5
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6NM.A00(X.6NM, java.lang.Object):X.599");
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [X.6O9, java.lang.Object] */
    public static final void A02(C6NM c6nm, AnonymousClass599 anonymousClass599, Object obj, InterfaceC16620sF interfaceC16620sF) {
        boolean z;
        InterfaceC16660sJ interfaceC16660sJ;
        HashMap hashMap = c6nm.A0A;
        Object obj2 = hashMap.get(anonymousClass599);
        Object obj3 = obj2;
        if (obj2 == null) {
            InterfaceC16620sF interfaceC16620sF2 = C6O7.A00;
            ?? obj4 = new Object();
            obj4.A02 = obj;
            obj4.A03 = interfaceC16620sF2;
            obj4.A01 = null;
            C74883Yd A00 = AbstractC74873Yc.A00();
            InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
            obj4.A00 = new ParcelableSnapshotMutableState(A00, true);
            hashMap.put(anonymousClass599, obj4);
            obj3 = obj4;
        }
        C6O9 c6o9 = (C6O9) obj3;
        InterfaceC117435Tc interfaceC117435Tc = c6o9.A01;
        if (interfaceC117435Tc != null) {
            C117415Ta c117415Ta = (C117415Ta) interfaceC117435Tc;
            synchronized (c117415Ta.A0D) {
                z = false;
                if (c117415Ta.A00.A00.A01 > 0) {
                    z = true;
                }
            }
        } else {
            z = true;
        }
        if (c6o9.A03 != interfaceC16620sF || z || c6o9.A04) {
            c6o9.A03 = interfaceC16620sF;
            Snapshot A02 = C3Z5.A02();
            if (A02 != null) {
                interfaceC16660sJ = A02.A03();
            } else {
                interfaceC16660sJ = null;
            }
            Snapshot A03 = C3Z5.A03(A02);
            try {
                AnonymousClass599 anonymousClass5992 = c6nm.A09;
                anonymousClass5992.A0J = true;
                InterfaceC16620sF interfaceC16620sF3 = c6o9.A03;
                InterfaceC117435Tc interfaceC117435Tc2 = c6o9.A01;
                C57I c57i = c6nm.A04;
                if (c57i != null) {
                    boolean z2 = c6o9.A05;
                    C5TR c5tr = new C5TR(-1750409193, true, new C207169Ev(2, interfaceC16620sF3, c6o9));
                    if (interfaceC117435Tc2 == null || ((C117415Ta) interfaceC117435Tc2).A02) {
                        ViewGroup.LayoutParams layoutParams = C5TT.A00;
                        interfaceC117435Tc2 = new C117415Ta(new C5TY(anonymousClass599), c57i);
                    }
                    if (z2) {
                        C117415Ta c117415Ta2 = (C117415Ta) interfaceC117435Tc2;
                        C117505Tk c117505Tk = c117415Ta2.A05;
                        c117505Tk.A06 = 100;
                        c117505Tk.A0O = true;
                        if (!(!c117415Ta2.A02)) {
                            SQP.A01("The composition is disposed");
                        } else {
                            c117415Ta2.A01 = c5tr;
                            c117415Ta2.A06.A0C(c117415Ta2, c5tr);
                            if (!c117505Tk.A0L && c117505Tk.A06 == 100) {
                                c117505Tk.A06 = -1;
                                c117505Tk.A0O = false;
                            } else {
                                SQP.A00("Cannot disable reuse from root if it was caused by other groups");
                            }
                        }
                        throw C00O.createAndThrow();
                    }
                    interfaceC117435Tc2.ES1(c5tr);
                    c6o9.A01 = interfaceC117435Tc2;
                    c6o9.A05 = false;
                    anonymousClass5992.A0J = false;
                    C3Z5.A06(A02, A03, interfaceC16660sJ);
                    c6o9.A04 = false;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set");
            } catch (Throwable th) {
                C3Z5.A06(A02, A03, interfaceC16660sJ);
                throw th;
            }
        }
    }

    public final InterfaceC31050Dko A04(Object obj, InterfaceC16620sF interfaceC16620sF) {
        AnonymousClass599 anonymousClass599;
        AnonymousClass599 anonymousClass5992 = this.A09;
        if (anonymousClass5992.A0A != null) {
            A05();
            if (!this.A0C.containsKey(obj)) {
                this.A0D.remove(obj);
                HashMap hashMap = this.A0B;
                Object obj2 = hashMap.get(obj);
                Object obj3 = obj2;
                if (obj2 == null) {
                    AnonymousClass599 A00 = A00(this, obj);
                    List A0G = anonymousClass5992.A0G();
                    if (A00 != null) {
                        A01(this, A0G.indexOf(A00), anonymousClass5992.A0G().size());
                        anonymousClass599 = A00;
                    } else {
                        int size = A0G.size();
                        AnonymousClass599 anonymousClass5993 = new AnonymousClass599(true, AnonymousClass598.A00.addAndGet(1));
                        anonymousClass5992.A0J = true;
                        anonymousClass5992.A0V(anonymousClass5993, size);
                        anonymousClass5992.A0J = false;
                        anonymousClass599 = anonymousClass5993;
                    }
                    this.A02++;
                    hashMap.put(obj, anonymousClass599);
                    obj3 = anonymousClass599;
                }
                A02(this, (AnonymousClass599) obj3, obj, interfaceC16620sF);
            }
            return new C25278BGs(this, obj);
        }
        return new C28840CoA();
    }

    public final void A05() {
        int size = this.A09.A0G().size();
        HashMap hashMap = this.A0A;
        if (hashMap.size() == size) {
            int i = this.A03;
            int i2 = this.A02;
            if ((size - i) - i2 >= 0) {
                HashMap hashMap2 = this.A0B;
                if (hashMap2.size() == i2) {
                    return;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A02(i2, hashMap2.size(), "Incorrect state. Precomposed children ", ". Map size "));
                }
            }
            throw new IllegalArgumentException(AnonymousClass001.A0p("Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ", size, i, i2));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0n("Inconsistency between the count of nodes tracked by the state (", ") and the children count on the SubcomposeLayout (", "). Are you trying to use the state of the disposed SubcomposeLayout?", hashMap.size(), size));
    }

    @Override // X.C59C
    public final void DeW() {
        AnonymousClass599 anonymousClass599 = this.A09;
        anonymousClass599.A0J = true;
        HashMap hashMap = this.A0A;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            InterfaceC117435Tc interfaceC117435Tc = ((C6O9) it.next()).A01;
            if (interfaceC117435Tc != null) {
                interfaceC117435Tc.dispose();
            }
        }
        anonymousClass599.A0P();
        anonymousClass599.A0J = false;
        hashMap.clear();
        this.A0C.clear();
        this.A02 = 0;
        this.A03 = 0;
        this.A0B.clear();
        A05();
    }

    public C6NM(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy, AnonymousClass599 anonymousClass599) {
        this.A09 = anonymousClass599;
        this.A05 = subcomposeSlotReusePolicy;
    }
}
