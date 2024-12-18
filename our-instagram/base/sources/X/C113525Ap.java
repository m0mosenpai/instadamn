package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Ap, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113525Ap {
    public C113525Ap A00;
    public boolean A01;
    public final int A02;
    public final C58J A03;
    public final AnonymousClass599 A04;
    public final C113505An A05;
    public final boolean A06;

    private final void A02(List list) {
        List arrayList;
        if (this.A01) {
            arrayList = C16930sl.A00;
        } else {
            arrayList = new ArrayList();
            A00(this.A04, arrayList);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C113525Ap c113525Ap = (C113525Ap) arrayList.get(i);
            if (c113525Ap.A06 && c113525Ap.A05.A01) {
                list.add(c113525Ap);
            } else if (!c113525Ap.A05.A00) {
                c113525Ap.A02(list);
            }
        }
    }

    private final void A01(C113505An c113505An) {
        List arrayList;
        if (!this.A05.A00) {
            if (this.A01) {
                arrayList = C16930sl.A00;
            } else {
                arrayList = new ArrayList();
                A00(this.A04, arrayList);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C113525Ap c113525Ap = (C113525Ap) arrayList.get(i);
                if (!c113525Ap.A06 || !c113525Ap.A05.A01) {
                    for (Map.Entry entry : c113525Ap.A05.A02.entrySet()) {
                        C113565At c113565At = (C113565At) entry.getKey();
                        Object value = entry.getValue();
                        Map map = c113505An.A02;
                        Object obj = map.get(c113565At);
                        C14360o3.A0C(c113565At, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object invoke = c113565At.A02.invoke(obj, value);
                        if (invoke != null) {
                            map.put(c113565At, invoke);
                        }
                    }
                    c113525Ap.A01(c113505An);
                }
            }
        }
    }

    public final C59U A05() {
        if (this.A01) {
            C113525Ap A07 = A07();
            if (A07 != null) {
                return A07.A05();
            }
            return null;
        }
        C58K A01 = AbstractC120835da.A01(this.A04);
        if (A01 == null) {
            A01 = this.A03;
        }
        return AbstractC114335Dx.A04(A01, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r4.A05.A01 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C113505An A06() {
        /*
            r4 = this;
            boolean r0 = r4.A06
            if (r0 == 0) goto Lb
            X.5An r0 = r4.A05
            boolean r1 = r0.A01
            r0 = 1
            if (r1 != 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            X.5An r3 = r4.A05
            if (r0 == 0) goto L28
            X.5An r2 = new X.5An
            r2.<init>()
            boolean r0 = r3.A01
            r2.A01 = r0
            boolean r0 = r3.A00
            r2.A00 = r0
            java.util.Map r1 = r2.A02
            java.util.Map r0 = r3.A02
            r1.putAll(r0)
            r3 = r2
            r4.A01(r2)
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113525Ap.A06():X.5An");
    }

    public final C113525Ap A07() {
        AnonymousClass599 A00;
        C113525Ap c113525Ap = this.A00;
        if (c113525Ap == null) {
            boolean z = this.A06;
            if ((!z || (A00 = AbstractC120835da.A00(this.A04, C29981DJt.A00)) == null) && (A00 = AbstractC120835da.A00(this.A04, C120825dZ.A00)) == null) {
                return null;
            }
            return AbstractC120835da.A02(A00, z);
        }
        return c113525Ap;
    }

    public final List A08(boolean z, boolean z2) {
        List list;
        String str;
        if (z || !this.A05.A00) {
            if (this.A06 && this.A05.A01) {
                List arrayList = new ArrayList();
                A02(arrayList);
                return arrayList;
            }
            if (!this.A01) {
                ArrayList arrayList2 = new ArrayList();
                A00(this.A04, arrayList2);
                if (!z2) {
                    return arrayList2;
                }
                C113505An c113505An = this.A05;
                Object A00 = C5B6.A00(c113505An, AbstractC113545Ar.A0M);
                if (A00 != null && c113505An.A01 && (!arrayList2.isEmpty())) {
                    C206999Ee c206999Ee = new C206999Ee(A00, 11);
                    C113505An c113505An2 = new C113505An();
                    c113505An2.A01 = false;
                    c113505An2.A00 = false;
                    c206999Ee.invoke(c113505An2);
                    C113525Ap c113525Ap = new C113525Ap(new C137426Kn(c206999Ee), new AnonymousClass599(true, this.A02 + 1000000000), c113505An2, false);
                    c113525Ap.A01 = true;
                    c113525Ap.A00 = this;
                    arrayList2.add(c113525Ap);
                }
                C113565At c113565At = AbstractC113545Ar.A02;
                if (!c113505An.A02.containsKey(c113565At) || !(!arrayList2.isEmpty()) || !c113505An.A01 || (list = (List) C5B6.A00(c113505An, c113565At)) == null || (str = (String) AbstractC001800i.A0J(list)) == null) {
                    return arrayList2;
                }
                C207399Fs c207399Fs = new C207399Fs(str, 1);
                C113505An c113505An3 = new C113505An();
                c113505An3.A01 = false;
                c113505An3.A00 = false;
                c207399Fs.invoke(c113505An3);
                C113525Ap c113525Ap2 = new C113525Ap(new C137426Kn(c207399Fs), new AnonymousClass599(true, this.A02 + 2000000000), c113505An3, false);
                c113525Ap2.A01 = true;
                c113525Ap2.A00 = this;
                arrayList2.add(0, c113525Ap2);
                return arrayList2;
            }
        }
        return C16930sl.A00;
    }

    public C113525Ap(C58J c58j, AnonymousClass599 anonymousClass599, C113505An c113505An, boolean z) {
        this.A03 = c58j;
        this.A06 = z;
        this.A04 = anonymousClass599;
        this.A05 = c113505An;
        this.A02 = anonymousClass599.A01;
    }

    private final void A00(AnonymousClass599 anonymousClass599, List list) {
        C57S A09 = anonymousClass599.A09();
        int i = A09.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A09.A02;
            do {
                AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                if (anonymousClass5992.A0A != null && !anonymousClass5992.A0L) {
                    if ((anonymousClass5992.A0W.A02.A00 & 8) != 0) {
                        list.add(AbstractC120835da.A02(anonymousClass5992, this.A06));
                    } else {
                        A00(anonymousClass5992, list);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final C114205Dh A03() {
        C59U A05 = A05();
        if (A05 != null && A05.A0T().A08) {
            return AbstractC119495b6.A02(A05).Chk(A05, true);
        }
        return C114205Dh.A04;
    }

    public final C114205Dh A04() {
        C59U A05 = A05();
        if (A05 != null && A05.A0T().A08) {
            return AbstractC119495b6.A01(A05);
        }
        return C114205Dh.A04;
    }
}
