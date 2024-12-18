package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.K2v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45293K2v extends C0T6 implements MNW {
    public final AbstractC47449Kxe A00;
    public final C45102JxW A01;
    public final List A02;
    public final java.util.Set A03;

    public static final C45293K2v A01(AbstractC47449Kxe abstractC47449Kxe, C45102JxW c45102JxW, List list, java.util.Set set) {
        C14360o3.A0B(set, 0);
        AbstractC167027dH.A13(list, c45102JxW, abstractC47449Kxe);
        return new C45293K2v(abstractC47449Kxe, c45102JxW, list, set);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45293K2v) {
                C45293K2v c45293K2v = (C45293K2v) obj;
                if (!C14360o3.A0K(this.A03, c45293K2v.A03) || !C14360o3.A0K(this.A02, c45293K2v.A02) || !C14360o3.A0K(this.A01, c45293K2v.A01) || !C14360o3.A0K(this.A00, c45293K2v.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03))));
    }

    public C45293K2v(AbstractC47449Kxe abstractC47449Kxe, C45102JxW c45102JxW, List list, java.util.Set set) {
        this.A03 = set;
        this.A02 = list;
        this.A01 = c45102JxW;
        this.A00 = abstractC47449Kxe;
    }

    public static AbstractC47449Kxe A00(JQC jqc) {
        return ((C45293K2v) jqc.A0L()).A00;
    }

    public static C45102JxW A02(JQC jqc) {
        return ((C45293K2v) jqc.A0L()).A01;
    }

    public static Iterator A03(JQC jqc) {
        return ((C45293K2v) jqc.A0L()).A03.iterator();
    }

    public static java.util.Set A04(JQC jqc) {
        return ((C45293K2v) jqc.A0L()).A03;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45293K2v() {
        /*
            r23 = this;
            r6 = 0
            X.0sj r2 = X.C16910sj.A00
            X.0sl r1 = X.C16930sl.A00
            r8 = 1
            r7 = 0
            com.instagram.direct.inbox.notes.models.NoteAudience r5 = com.instagram.direct.inbox.notes.models.NoteAudience.A07
            X.JxW r4 = new X.JxW
            r9 = r7
            r10 = r7
            r11 = r8
            r12 = r7
            r13 = r7
            r14 = r8
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r8
            r19 = r7
            r20 = r8
            r21 = r7
            r22 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.KXs r0 = X.C46004KXs.A00
            r3 = r23
            r3.<init>(r0, r4, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45293K2v.<init>():void");
    }
}
