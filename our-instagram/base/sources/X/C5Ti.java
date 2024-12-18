package X;

import java.util.Map;

/* renamed from: X.5Ti, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5Ti {
    public final int A00;
    public final int A01;

    public String A00(int i) {
        return AnonymousClass001.A0I("IntParameter(", ')', i);
    }

    public String A01(int i) {
        return AnonymousClass001.A0I("ObjectParameter(", ')', i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x034d, code lost:
    
        if ((r9[r1 + 1] & 201326592) == 0) goto L150;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.AbstractCollection, java.util.Collection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A02(X.C5TZ r24, X.C5Z3 r25, X.C117565Tr r26, X.C5Z5 r27) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Ti.A02(X.5TZ, X.5Z3, X.5Tr, X.5Z5):void");
    }

    public C5Ti(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final String toString() {
        Class<?> cls = getClass();
        Map map = C0YZ.A03;
        C14360o3.A0B(cls, 1);
        String A01 = AbstractC13230m9.A01(cls);
        if (A01 == null) {
            return "";
        }
        return A01;
    }
}
