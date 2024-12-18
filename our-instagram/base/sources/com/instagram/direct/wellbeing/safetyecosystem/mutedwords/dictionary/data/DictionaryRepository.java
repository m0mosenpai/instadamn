package com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data;

import X.AbstractC002300n;
import X.AbstractC166987dD;
import X.AbstractC25231BEo;
import X.AbstractC31171DnF;
import X.C14360o3;
import X.C50679MYx;
import X.InterfaceC125665mD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class DictionaryRepository {
    public final InterfaceC125665mD A01;
    public final List A00 = AbstractC166987dD.A1E();
    public final Set A02 = AbstractC31171DnF.A0l();

    public final ArrayList A02(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            Iterator it2 = this.A00.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (AbstractC002300n.A0g(((C50679MYx) next).A01, A1B, true)) {
                    if (next == null) {
                    }
                }
            }
            A1E.add(new C50679MYx(AbstractC25231BEo.A0p(), A1B, 46));
        }
        this.A00.addAll(0, A1E);
        return A1E;
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        List list = this.A00;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C14360o3.A0K(((C50679MYx) it.next()).A00, str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        list.remove(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r9) {
        /*
            r8 = this;
            r3 = 38
            boolean r0 = X.MAT.A03(r9, r3)
            if (r0 == 0) goto L87
            r5 = r9
            X.MAT r5 = (X.MAT) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L38
            if (r0 != r4) goto L8c
            X.AbstractC09560e7.A00(r1)
        L25:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L2f
            r7 = 1
        L2a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L2f:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L2a
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L38:
            X.AbstractC09560e7.A00(r1)
            X.5mD r3 = r8.A01
            if (r3 == 0) goto L2a
            java.util.List r0 = r8.A00
            java.util.HashSet r2 = X.AbstractC166987dD.A1H()
            java.util.Iterator r1 = r0.iterator()
        L49:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r1.next()
            X.MYx r0 = (X.C50679MYx) r0
            java.lang.String r0 = r0.A01
            r2.add(r0)
            goto L49
        L5b:
            java.util.Set r0 = r8.A02
            java.util.Set r1 = X.AnonymousClass090.A02(r0, r2)
            java.util.Set r2 = X.AnonymousClass090.A02(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L76
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L76
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L76:
            java.util.List r1 = X.AbstractC001800i.A0a(r1)
            java.util.List r0 = X.AbstractC001800i.A0a(r2)
            r5.A00 = r4
            java.lang.Object r1 = r3.FBh(r1, r0, r5)
            if (r1 != r6) goto L25
            return r6
        L87:
            X.MAT r5 = X.MAT.A00(r8, r9, r3)
            goto L16
        L8c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository.A00(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r10) {
        /*
            r9 = this;
            r4 = 43
            boolean r0 = X.MAF.A01(r10, r4)
            if (r0 == 0) goto L8d
            r3 = r10
            X.MAF r3 = (X.MAF) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r4 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r8 = 0
            r1 = 1
            if (r0 == 0) goto L79
            if (r0 != r1) goto La2
            java.lang.Object r3 = r3.A01
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository r3 = (com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository) r3
            X.AbstractC09560e7.A00(r4)
        L29:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L93
            java.util.Set r1 = r3.A02
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r2 = r4.A00
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            java.util.List r7 = r3.A00
            r7.clear()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            X.C14360o3.A08(r1)
            X.C14360o3.A0B(r2, r8)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            X.AbstractC001800i.A0r(r2, r0)
            java.util.ArrayList r6 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r5 = r0.iterator()
        L5a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La7
            java.lang.String r4 = X.AbstractC166987dD.A1B(r5)
            int r3 = r8 + 1
            java.lang.String r2 = java.lang.String.valueOf(r8)
            X.C14360o3.A0A(r4)
            r1 = 46
            X.MYx r0 = new X.MYx
            r0.<init>(r2, r4, r1)
            r6.add(r0)
            r8 = r3
            goto L5a
        L79:
            X.AbstractC09560e7.A00(r4)
            X.5mD r0 = r9.A01
            if (r0 == 0) goto Lab
            r3.A01 = r9
            r3.A00 = r1
            java.lang.Object r4 = r0.Bbf(r3, r1)
            if (r4 != r2) goto L8b
            return r2
        L8b:
            r3 = r9
            goto L29
        L8d:
            X.MAF r3 = new X.MAF
            r3.<init>(r9, r10, r4)
            goto L16
        L93:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto L9d
            java.util.List r0 = r3.A00
            r0.clear()
            goto Lab
        L9d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La2:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        La7:
            r7.addAll(r6)
            r8 = 1
        Lab:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository.A01(X.1Ds):java.lang.Object");
    }

    public DictionaryRepository(InterfaceC125665mD interfaceC125665mD) {
        this.A01 = interfaceC125665mD;
    }
}
