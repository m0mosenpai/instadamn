package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172107lf {
    public final WeakReference A00;

    public static final C18920wW A00(C172107lf c172107lf, String str, boolean z) {
        C12180kM c12180kM;
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) c172107lf.A00.get();
        C19270xB c19270xB = null;
        if (abstractC12990ll == null) {
            return null;
        }
        if (str != null) {
            c19270xB = new C19270xB(str);
        }
        if (z) {
            c12180kM = C12180kM.A05;
        } else {
            c12180kM = C12180kM.A02;
        }
        return AbstractC12220kQ.A00(c19270xB, c12180kM, abstractC12990ll);
    }

    public C172107lf(AbstractC12990ll abstractC12990ll) {
        this.A00 = new WeakReference(abstractC12990ll);
    }
}
