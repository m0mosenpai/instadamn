package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* loaded from: classes8.dex */
public final class LI2 {
    public C47226Ktz A01;
    public C45083JxD A02;
    public InterfaceC16820sZ A03 = C50181MEi.A00;
    public final LinkedList A04 = new LinkedList();
    public L96 A00 = new L96();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 != true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.LI2 r13) {
        /*
            X.L96 r6 = r13.A00
            X.JxD r0 = r6.A00
            if (r0 == 0) goto Le8
            X.Ktz r0 = r13.A01
            if (r0 == 0) goto Le8
            java.util.LinkedList r5 = r13.A04
            boolean r0 = X.AbstractC166987dD.A1b(r5)
            if (r0 == 0) goto Le8
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r5)
            java.util.Iterator r12 = r0.iterator()
        L1b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Le8
            java.lang.Object r4 = r12.next()
            X.KyP r4 = (X.C47496KyP) r4
            X.C14360o3.A0A(r4)
            java.lang.String r10 = r4.A01
            int r7 = r10.length()
            r11 = 1
            if (r7 == 0) goto Le3
            X.JxD r0 = r13.A02
            if (r0 == 0) goto L3c
            boolean r1 = r0.A05
            r0 = 1
            if (r1 == r11) goto L3d
        L3c:
            r0 = 0
        L3d:
            java.util.Collection r3 = r6.A01(r10, r0)
            X.JxD r0 = r13.A02
            if (r0 == 0) goto Le0
            java.lang.Integer r1 = r0.A03
        L47:
            java.lang.Integer r9 = X.C05F.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r9) goto L58
            int r1 = r7 - r11
            char r2 = r10.charAt(r1)
            r1 = 32
            if (r2 != r1) goto Le3
        L58:
            int r1 = r3.size()
            X.JxD r3 = r13.A02
            if (r3 == 0) goto L62
            int r0 = r3.A00
        L62:
            if (r1 < r0) goto Le3
            r8 = 0
            if (r3 == 0) goto Lde
            java.lang.Integer r0 = r3.A02
        L69:
            r2 = 1
            boolean r1 = X.AbstractC167007dF.A1X(r0, r9)
            if (r3 == 0) goto Ldc
            boolean r0 = r3.A05
            if (r0 != r11) goto Ldc
        L74:
            X.0ps r3 = X.AbstractC25225BEi.A1F()
            java.lang.Integer r0 = X.C05F.A00
            X.LTT r0 = r6.A00(r0, r10, r2)
            r3.A00 = r0
            if (r1 == 0) goto La6
            X.LTT r1 = r6.A00(r9, r10, r2)
            java.lang.Object r0 = r3.A00
            X.MPS r0 = (X.MPS) r0
            if (r0 == 0) goto Lda
            java.lang.String r0 = r0.B8z()
        L90:
            if (r1 == 0) goto L96
            java.lang.String r8 = r1.B8z()
        L96:
            boolean r0 = X.C14360o3.A0K(r0, r8)
            if (r0 != 0) goto La6
            X.0sZ r0 = r13.A03
            boolean r0 = X.AbstractC25231BEo.A1b(r0)
            if (r0 == 0) goto La6
            r3.A00 = r1
        La6:
            java.lang.Object r0 = r3.A00
            if (r0 == 0) goto Le3
            X.0ps r2 = X.AbstractC25225BEi.A1F()
            X.MPS r0 = (X.MPS) r0
            java.lang.String r1 = r0.B8z()
            r2.A00 = r1
            int r0 = r1.length()
            if (r7 <= r0) goto Lbd
            r7 = r0
        Lbd:
            java.lang.String r0 = r1.substring(r7)
            X.C14360o3.A07(r0)
            X.LTU r0 = new X.LTU
            r0.<init>(r3, r2)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r0)
        Lcd:
            X.C14360o3.A07(r1)
            com.google.common.util.concurrent.SettableFuture r0 = r4.A00
            r0.set(r1)
            r5.remove(r4)
            goto L1b
        Lda:
            r0 = r8
            goto L90
        Ldc:
            r2 = 0
            goto L74
        Lde:
            r0 = r8
            goto L69
        Le0:
            r1 = 0
            goto L47
        Le3:
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            goto Lcd
        Le8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LI2.A00(X.LI2):void");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.Kb6, X.L5u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.Kb6, X.L5u, java.lang.Object] */
    public static final void A01(LI2 li2) {
        AbstractC47733L5u[] abstractC47733L5uArr;
        C45083JxD c45083JxD = li2.A02;
        if (c45083JxD != null && li2.A01 != null) {
            L96 l96 = li2.A00;
            List<C45038JwT> list = c45083JxD.A04;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (C45038JwT c45038JwT : list) {
                Integer num = c45038JwT.A02;
                String str = c45038JwT.A03;
                if (str != null) {
                    synchronized (li2) {
                        C47226Ktz c47226Ktz = li2.A01;
                        if (c47226Ktz != null) {
                            str = AbstractC002300n.A0d(str, "$USER_FNAME$", c47226Ktz.A00, false);
                        }
                        if (li2.A01 != null) {
                            str = AbstractC002300n.A0d(str, "$USER_LNAME$", "", false);
                        }
                    }
                    A0q.add(new C45038JwT(num, str, c45038JwT.A04, c45038JwT.A00, c45038JwT.A01));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            C45083JxD c45083JxD2 = new C45083JxD(c45083JxD.A03, c45083JxD.A02, A0q, c45083JxD.A01, c45083JxD.A00, c45083JxD.A05);
            l96.A00 = c45083JxD2;
            Lock lock = l96.A04;
            lock.lock();
            Integer num2 = c45083JxD2.A03;
            Integer num3 = C05F.A01;
            if (num2 == num3) {
                abstractC47733L5uArr = new AbstractC47733L5u[]{new C46109Kb9(), new C46108Kb8()};
            } else {
                abstractC47733L5uArr = new AbstractC47733L5u[]{new C46109Kb9(), new C46108Kb8(), new C46107Kb7()};
            }
            ?? obj = new Object();
            obj.A00 = Arrays.asList(abstractC47733L5uArr);
            l96.A01 = obj;
            List list2 = c45083JxD2.A04;
            if (list2 != null) {
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    C45038JwT c45038JwT2 = (C45038JwT) list2.get(i);
                    if (c45038JwT2 != null) {
                        AbstractC47733L5u abstractC47733L5u = l96.A01;
                        if (abstractC47733L5u == null) {
                            C14360o3.A0F("analyzer");
                            throw C00O.createAndThrow();
                        }
                        Collection A00 = AbstractC47733L5u.A00(abstractC47733L5u, c45038JwT2.A03);
                        C47737L5y c47737L5y = l96.A02;
                        C14360o3.A0A(A00);
                        c47737L5y.A00(c45038JwT2, A00, false);
                        if (num2 == C05F.A00 && c45083JxD2.A02 == num3) {
                            AbstractC47733L5u[] abstractC47733L5uArr2 = {new C46109Kb9(), new C46108Kb8()};
                            ?? obj2 = new Object();
                            obj2.A00 = Arrays.asList(abstractC47733L5uArr2);
                            Collection A002 = AbstractC47733L5u.A00(obj2, c45038JwT2.A03);
                            C14360o3.A0A(A002);
                            List A0a = AbstractC001800i.A0a(A002);
                            C46107Kb7 c46107Kb7 = new C46107Kb7();
                            int size2 = A0a.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                Collection A003 = AbstractC47733L5u.A00(c46107Kb7, AbstractC25226BEj.A1I(A0a, i2));
                                C14360o3.A0A(A003);
                                c47737L5y.A00(c45038JwT2, A003, true);
                            }
                        }
                    }
                }
            }
            lock.unlock();
            A00(li2);
        }
    }
}
