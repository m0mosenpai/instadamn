package X;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class TZE extends AbstractList<C64531TIl> implements RandomAccess {
    public final int[] A00;
    public final C64531TIl[] A01;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.TWX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.TZE A00(X.C64531TIl... r15) {
        /*
            r10 = 0
            java.util.ArrayList r7 = X.AbstractC58319PtB.A12(r15)
            java.util.Collections.sort(r7)
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            r1 = 0
        Ld:
            int r0 = r7.size()
            if (r1 >= r0) goto L1a
            r0 = -1
            X.AbstractC166997dE.A1W(r8, r0)
            int r1 = r1 + 1
            goto Ld
        L1a:
            r2 = 0
        L1b:
            int r0 = r7.size()
            if (r2 >= r0) goto L31
            r0 = r15[r2]
            int r1 = java.util.Collections.binarySearch(r7, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r8.set(r1, r0)
            int r2 = r2 + 1
            goto L1b
        L31:
            java.lang.Object r0 = r7.get(r10)
            X.TIl r0 = (X.C64531TIl) r0
            int r0 = r0.A05()
            if (r0 == 0) goto Lcf
            r5 = 0
        L3e:
            int r0 = r7.size()
            if (r5 >= r0) goto L96
            java.lang.Object r4 = r7.get(r5)
            X.TIl r4 = (X.C64531TIl) r4
            int r6 = r5 + 1
            r3 = r6
        L4d:
            int r0 = r7.size()
            if (r3 >= r0) goto L89
            java.lang.Object r2 = r7.get(r3)
            X.TIl r2 = (X.C64531TIl) r2
            int r0 = r4.A05()
            boolean r0 = r2.A0B(r4, r0)
            if (r0 == 0) goto L89
            int r1 = r2.A05()
            int r0 = r4.A05()
            if (r1 == r0) goto L8b
            java.lang.Object r0 = r8.get(r3)
            int r1 = X.AbstractC166987dD.A0H(r0)
            java.lang.Object r0 = r8.get(r5)
            int r0 = X.AbstractC166987dD.A0H(r0)
            if (r1 <= r0) goto L86
            r7.remove(r3)
            r8.remove(r3)
            goto L4d
        L86:
            int r3 = r3 + 1
            goto L4d
        L89:
            r5 = r6
            goto L3e
        L8b:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "duplicate option: "
            java.lang.IllegalArgumentException r0 = X.AbstractC37303Gc4.A0M(r2, r0, r1)
            throw r0
        L96:
            X.TWX r9 = new X.TWX
            r9.<init>()
            r13 = 0
            int r12 = r7.size()
            r11 = r10
            A01(r7, r8, r9, r10, r11, r12, r13)
            long r2 = r9.A00
            r0 = 4
            long r2 = r2 / r0
            int r1 = (int) r2
            int[] r2 = new int[r1]
        Lad:
            if (r10 >= r1) goto Lb8
            int r0 = r9.readInt()
            r2[r10] = r0
            int r10 = r10 + 1
            goto Lad
        Lb8:
            boolean r0 = r9.ATd()
            if (r0 == 0) goto Lca
            java.lang.Object r1 = r15.clone()
            X.TIl[] r1 = (X.C64531TIl[]) r1
            X.TZE r0 = new X.TZE
            r0.<init>(r2, r1)
            return r0
        Lca:
            java.lang.AssertionError r0 = X.AbstractC58318PtA.A0V()
            throw r0
        Lcf:
            java.lang.String r0 = "the empty byte string is not a supported option"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TZE.A00(X.TIl[]):X.TZE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.TWX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.TWX, java.lang.Object] */
    public static void A01(List list, List list2, TWX twx, int i, int i2, int i3, long j) {
        int i4;
        TWX obj;
        int i5 = i2;
        if (i5 < i3) {
            for (int i6 = i5; i6 < i3; i6++) {
                if (((C64531TIl) list.get(i6)).A05() < i) {
                    throw AbstractC58318PtA.A0V();
                }
            }
            C64531TIl c64531TIl = (C64531TIl) list.get(i5);
            C64531TIl c64531TIl2 = (C64531TIl) list.get(i3 - 1);
            int i7 = -1;
            if (i == c64531TIl.A05()) {
                i7 = AbstractC31176DnK.A01(list2, i5);
                i5 = i2 + 1;
                c64531TIl = (C64531TIl) list.get(i5);
            }
            if (c64531TIl.A04(i) != c64531TIl2.A04(i)) {
                int i8 = 1;
                for (int i9 = i5 + 1; i9 < i3; i9++) {
                    if (((C64531TIl) list.get(i9 - 1)).A04(i) != ((C64531TIl) list.get(i9)).A04(i)) {
                        i8++;
                    }
                }
                long j2 = j + ((int) (twx.A00 / 4)) + 2 + (i8 * 2);
                twx.A0C(i8);
                twx.A0C(i7);
                for (int i10 = i5; i10 < i3; i10++) {
                    int A04 = ((C64531TIl) list.get(i10)).A04(i);
                    if (i10 == i5 || A04 != ((C64531TIl) list.get(i10 - 1)).A04(i)) {
                        twx.A0C(A04 & 255);
                    }
                }
                obj = new Object();
                while (true) {
                    int i11 = i5;
                    if (i5 >= i3) {
                        break;
                    }
                    byte A042 = ((C64531TIl) list.get(i5)).A04(i);
                    int i12 = i5 + 1;
                    i5 = i12;
                    while (true) {
                        if (i5 < i3) {
                            if (A042 != ((C64531TIl) list.get(i5)).A04(i)) {
                                break;
                            } else {
                                i5++;
                            }
                        } else {
                            i5 = i3;
                            break;
                        }
                    }
                    if (i12 == i5 && i + 1 == ((C64531TIl) list.get(i11)).A05()) {
                        twx.A0C(AbstractC31176DnK.A01(list2, i11));
                    } else {
                        twx.A0C((int) (-(((int) (obj.A00 / 4)) + j2)));
                        A01(list, list2, obj, i + 1, i11, i5, j2);
                    }
                }
            } else {
                int i13 = 0;
                int min = Math.min(c64531TIl.A05(), c64531TIl2.A05());
                for (int i14 = i; i14 < min && c64531TIl.A04(i14) == c64531TIl2.A04(i14); i14++) {
                    i13++;
                }
                long j3 = 1 + j + ((int) (twx.A00 / 4)) + 2 + i13;
                twx.A0C(-i13);
                twx.A0C(i7);
                int i15 = i;
                while (true) {
                    i4 = i + i13;
                    if (i15 >= i4) {
                        break;
                    }
                    twx.A0C(c64531TIl.A04(i15) & 255);
                    i15++;
                }
                if (i5 + 1 == i3) {
                    if (i4 == ((C64531TIl) list.get(i5)).A05()) {
                        twx.A0C(AbstractC31176DnK.A01(list2, i5));
                        return;
                    }
                    throw AbstractC58318PtA.A0V();
                }
                obj = new Object();
                twx.A0C((int) (-(((int) (obj.A00 / 4)) + j3)));
                A01(list, list2, obj, i4, i5, i3, j3);
            }
            twx.FEM(obj, obj.A00);
            return;
        }
        throw AbstractC58318PtA.A0V();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A01[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01.length;
    }

    public TZE(int[] iArr, C64531TIl[] c64531TIlArr) {
        this.A01 = c64531TIlArr;
        this.A00 = iArr;
    }
}
