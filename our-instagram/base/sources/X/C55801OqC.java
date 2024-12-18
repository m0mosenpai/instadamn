package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.OqC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55801OqC implements InterfaceC28041Xi {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C55801OqC(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        Object A1D;
        File file;
        String path;
        switch (this.A00) {
            case 0:
                return !obj.equals(AbstractC166987dD.A10((UserSession) this.A02));
            case 1:
                File file2 = (File) obj;
                try {
                    File canonicalFile = ((File) this.A01).getCanonicalFile();
                    if (file2 != null) {
                        file = file2.getCanonicalFile();
                    } else {
                        file = null;
                    }
                    A1D = Boolean.valueOf(AbstractC167007dF.A1N(C14360o3.A0K(canonicalFile, file) ? 1 : 0));
                } catch (Throwable th) {
                    A1D = MSW.A1D(th);
                }
                if (A1D instanceof C09540e5) {
                    A1D = true;
                }
                return AbstractC166987dD.A1a(A1D);
            default:
                File file3 = (File) obj;
                if (!C14360o3.A0K(this.A02, file3)) {
                    Iterator it = ((java.util.Set) this.A01).iterator();
                    while (it.hasNext()) {
                        String A1B = AbstractC166987dD.A1B(it);
                        if (file3 == null || (path = file3.getPath()) == null || !AbstractC002300n.A0h(A1B, path, false)) {
                        }
                    }
                    return true;
                }
                return false;
        }
    }
}
