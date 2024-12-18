package X;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class SL6 {
    public final int A00;
    public final File A01;

    public SL6(SHM shm, int i) {
        C14360o3.A0B(shm, 1);
        String str = File.separator;
        String A0o = AnonymousClass001.A0o("updates", str, str, shm.A00, i);
        C14360o3.A07(A0o);
        this.A01 = MSW.A0w(shm.A01, A0o);
        this.A00 = i;
    }

    public final boolean A00(java.util.Set set) {
        C14360o3.A0B(set, 0);
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                C14360o3.A0B(A1B, 0);
                if (!MSW.A0w(this.A01, A1B).isFile()) {
                    return false;
                }
            }
        }
        return true;
    }
}
