package X;

/* renamed from: X.6Kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC137336Kc {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.5Xe, X.5Xc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.5Xf, X.5Xc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.5Xb, X.5Xc, java.lang.Object] */
    public static final AbstractC118405Xc A01(AbstractC118405Xc abstractC118405Xc) {
        if (abstractC118405Xc instanceof C118415Xd) {
            return new C118415Xd(0.0f, 0.0f);
        }
        if (abstractC118405Xc instanceof C118395Xb) {
            ?? obj = new Object();
            obj.A00 = 0.0f;
            return obj;
        }
        if (abstractC118405Xc instanceof C118435Xf) {
            ?? obj2 = new Object();
            obj2.A00 = 0.0f;
            obj2.A01 = 0.0f;
            obj2.A02 = 0.0f;
            obj2.A03 = 0.0f;
            return obj2;
        }
        ?? obj3 = new Object();
        obj3.A00 = 0.0f;
        obj3.A01 = 0.0f;
        obj3.A02 = 0.0f;
        return obj3;
    }

    public static final AbstractC118405Xc A00(AbstractC118405Xc abstractC118405Xc) {
        AbstractC118405Xc A01 = A01(abstractC118405Xc);
        int A012 = A01.A01();
        for (int i = 0; i < A012; i++) {
            A01.A03(i, abstractC118405Xc.A00(i));
        }
        return A01;
    }
}
