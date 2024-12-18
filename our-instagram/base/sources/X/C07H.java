package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.07H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07H extends AbstractC09260db {
    public final /* synthetic */ C0QD A00;

    public C07H(C0QD c0qd) {
        this.A00 = c0qd;
    }

    @Override // X.AbstractC09260db
    public final void A01(File file) {
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            C0QB c0qb = (C0QB) it.next();
            C00Z c00z = new C00Z(c0qb, c0qb);
            try {
                c00z.A01(file);
                c00z.close();
            } catch (Throwable th) {
                try {
                    c00z.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
    }

    @Override // X.AbstractC09260db
    public final C09240dZ[] A02() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            C0QB c0qb = (C0QB) it.next();
            C00Z c00z = new C00Z(c0qb, c0qb);
            try {
                arrayList.addAll(Arrays.asList(c00z.A02()));
                c00z.close();
            } catch (Throwable th) {
                try {
                    c00z.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
        return (C09240dZ[]) arrayList.toArray(new C09240dZ[arrayList.size()]);
    }
}
