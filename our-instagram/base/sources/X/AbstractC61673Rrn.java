package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.LruCache;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rrn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61673Rrn {
    public static final Boolean A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            boolean z = true;
            Object A02 = c6fw.A02();
            C14360o3.A0C(A02, AbstractC111324zv.A00(8));
            List list = (List) A02;
            String A0e = AbstractC31177DnL.A0e(c6fw, 0);
            if (!AbstractC001900j.A0a(A0e, "://", false)) {
                A0e = AnonymousClass001.A0R(A0e, "://");
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                LruCache lruCache = AbstractC08820cl.A00;
                if (AbstractC167007dF.A1W(AbstractC58318PtA.A0D(android.net.Uri.parse(A0e)).resolveActivity(packageManager))) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (packageManager.getPackageInfo(AbstractC166987dD.A1B(it), 0) != null) {
                                break;
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        throw AbstractC166997dE.A0g();
    }
}
