package X;

import java.util.Iterator;

/* renamed from: X.TeB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65136TeB extends C58474Pvz implements Iterator, C0s1 {
    public int A00;
    public Object A01;
    public boolean A02;
    public final C58479Pw5 A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65136TeB(X.C58479Pw5 r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r3.A00
            X.Pw1 r0 = r3.A03
            r2.<init>(r1, r0)
            r2.A03 = r3
            int r0 = r0.A00
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65136TeB.<init>(X.Pw5):void");
    }

    @Override // X.C58474Pvz, java.util.Iterator
    public final Object next() {
        if (this.A03.A03.A00 == this.A00) {
            Object next = super.next();
            this.A01 = next;
            this.A02 = true;
            return next;
        }
        throw AbstractC58318PtA.A0z();
    }
}
