package X;

import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: X.0ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08790ch extends AbstractC018607g {
    public final C07X A00;
    public final C018907j A01;

    private AbstractC019307n A01(InterfaceC018507f interfaceC018507f, AbstractC019307n abstractC019307n, int i) {
        try {
            C018907j c018907j = this.A01;
            c018907j.A01 = true;
            AbstractC019307n D8C = interfaceC018507f.D8C(null, i);
            Class<?> cls = D8C.getClass();
            if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                StringBuilder sb = new StringBuilder();
                sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                sb.append(D8C);
                throw new IllegalArgumentException(sb.toString());
            }
            C08890cs c08890cs = new C08890cs(D8C, abstractC019307n, i);
            c018907j.A00.A07(i, c08890cs);
            c018907j.A01 = false;
            return c08890cs.A0D(this.A00, interfaceC018507f);
        } catch (Throwable th) {
            this.A01.A01 = false;
            throw th;
        }
    }

    @Override // X.AbstractC018607g
    public final AbstractC019307n A02(Bundle bundle, InterfaceC018507f interfaceC018507f, int i) {
        C018907j c018907j = this.A01;
        if (!c018907j.A01) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                C08890cs c08890cs = (C08890cs) AbstractC005201r.A00(c018907j.A00, i);
                if (c08890cs == null) {
                    return A01(interfaceC018507f, null, i);
                }
                return c08890cs.A0D(this.A00, interfaceC018507f);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // X.AbstractC018607g
    public final void A03(int i) {
        C018907j c018907j = this.A01;
        if (!c018907j.A01) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                C005101q c005101q = c018907j.A00;
                C08890cs c08890cs = (C08890cs) AbstractC005201r.A00(c005101q, i);
                if (c08890cs != null) {
                    c08890cs.A0E(true);
                    c005101q.A06(i);
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void A04(InterfaceC018507f interfaceC018507f, int i) {
        C018907j c018907j = this.A01;
        if (!c018907j.A01) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                C08890cs c08890cs = (C08890cs) AbstractC005201r.A00(c018907j.A00, i);
                AbstractC019307n abstractC019307n = null;
                if (c08890cs != null) {
                    abstractC019307n = c08890cs.A0E(false);
                }
                A01(interfaceC018507f, abstractC019307n, i);
                return;
            }
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Deprecated
    public final void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C005101q c005101q = this.A01.A00;
        if (c005101q.A00() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String A0R = AnonymousClass001.A0R(str, "    ");
            for (int i = 0; i < c005101q.A00(); i++) {
                C08890cs c08890cs = (C08890cs) c005101q.A04(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c005101q.A01(i));
                printWriter.print(": ");
                printWriter.println(c08890cs.toString());
                c08890cs.A0G(A0R, fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.A00.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }

    public C08790ch(C07X c07x, C018307d c018307d) {
        this.A00 = c07x;
        this.A01 = (C018907j) new C52942bb(C018907j.A02, c018307d).A00(C018907j.class);
    }
}
