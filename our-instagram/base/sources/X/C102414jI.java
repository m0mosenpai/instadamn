package X;

/* renamed from: X.4jI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102414jI extends C911644s {
    public final AbstractC910944l A00;
    public final AbstractC910944l A01;

    @Override // X.C911644s, X.AbstractC910944l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            C102414jI c102414jI = (C102414jI) obj;
            if (((AbstractC910944l) c102414jI).A00 == ((AbstractC910944l) this).A00) {
                return this.A01.equals(c102414jI.A01);
            }
        }
        return false;
    }

    @Override // X.C911644s, X.AbstractC910944l
    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[reference type, class ");
        sb.append(A0R());
        sb.append('<');
        sb.append(this.A01);
        sb.append('>');
        sb.append(']');
        return sb.toString();
    }

    public C102414jI(AbstractC910944l abstractC910944l, AbstractC911744t abstractC911744t) {
        super(abstractC911744t);
        this.A01 = abstractC910944l;
        this.A00 = this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C102414jI(X.AbstractC910944l r10, X.AbstractC910944l r11, X.AbstractC910944l r12, X.C911244o r13, java.lang.Class r14, java.lang.Object r15, java.lang.Object r16, X.AbstractC910944l[] r17, boolean r18) {
        /*
            r9 = this;
            if (r11 != 0) goto L19
            r7 = 0
        L3:
            r0 = r9
            r1 = r10
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.A01 = r11
            if (r12 != 0) goto L16
            r12 = r9
        L16:
            r9.A00 = r12
            return
        L19:
            int r7 = r11.hashCode()
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102414jI.<init>(X.44l, X.44l, X.44l, X.44o, java.lang.Class, java.lang.Object, java.lang.Object, X.44l[], boolean):void");
    }
}
