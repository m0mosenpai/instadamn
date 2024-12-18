package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.4EA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EA {
    public final C63572ue A00;
    public final C4EF A01;
    public final WeakReference A02;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, X.2uY] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.4ED, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.2ua, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.2ud, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.2uX, java.lang.Object] */
    public C4EA(String str, WeakReference weakReference) {
        this.A02 = weakReference;
        ?? obj = new Object();
        ?? obj2 = new Object();
        C63522uZ c63522uZ = new C63522uZ(weakReference);
        this.A00 = new C63572ue(new Object(), new Object(), obj, c63522uZ, obj2);
        ArrayList arrayList = new ArrayList();
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) weakReference.get();
        if (abstractC12990ll != null) {
            arrayList.add(new C4EE(new Object(), new C4EC(abstractC12990ll), str));
        }
        this.A01 = new C4EF(arrayList, true);
    }
}
