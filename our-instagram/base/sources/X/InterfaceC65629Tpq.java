package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.Tpq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC65629Tpq extends InterfaceC65466Tki {
    Path Bbd();

    static void A00(Matrix matrix, Path path, List list, int i) {
        path.addPath(((InterfaceC65629Tpq) list.get(i)).Bbd(), matrix);
    }
}
