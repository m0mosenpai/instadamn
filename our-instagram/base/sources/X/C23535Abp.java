package X;

import java.io.File;
import java.util.Iterator;

/* renamed from: X.Abp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23535Abp implements InterfaceC28041Xi {
    public final /* synthetic */ java.util.Set A00;

    public C23535Abp(java.util.Set set) {
        this.A00 = set;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        String path;
        File file = (File) obj;
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            if (file != null && (path = file.getPath()) != null && AbstractC002300n.A0h(A1B, path, false)) {
                return false;
            }
        }
        return true;
    }
}
