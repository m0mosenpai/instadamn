package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.1FF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FF {
    public final Context A00;
    public final String A01;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1GN] */
    public final C1FE A00() {
        final C1FE c1fe;
        String str = this.A01;
        Map map = C1FE.A09;
        synchronized (map) {
            Reference reference = (Reference) map.get(str);
            if (reference == null || (c1fe = (C1FE) reference.get()) == null) {
                c1fe = new C1FE(this.A00, str);
                InterfaceC23931Fd interfaceC23931Fd = c1fe.A05;
                ?? obj = new Object();
                obj.A00 = interfaceC23931Fd;
                c1fe.A00 = obj;
                c1fe.A01 = C1GO.A00;
                if (C20150ym.A07(AbstractC20100yh.A00(36317650750477770L))) {
                    C1FE.A02(c1fe);
                } else {
                    c1fe.A04.schedule(new C11R() { // from class: X.1GQ
                        @Override // X.C11R
                        public final String getName() {
                            return "EncryptedSharedPrefs_readFromDiskAsync";
                        }

                        @Override // X.C11R
                        public final int getRunnableId() {
                            return 232;
                        }

                        @Override // X.C11R
                        public final void onCancel() {
                        }

                        @Override // X.C11R
                        public final void onFinish() {
                        }

                        @Override // X.C11R
                        public final void onStart() {
                        }

                        @Override // X.C11R
                        public final void run() {
                            C1FE.A02(C1FE.this);
                        }
                    }, 232, 1, false, true);
                }
                c1fe.getClass();
                map.put(str, new WeakReference(c1fe));
            }
        }
        return c1fe;
    }

    public C1FF(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }
}
