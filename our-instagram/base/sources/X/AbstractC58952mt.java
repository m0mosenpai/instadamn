package X;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: X.2mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58952mt {
    public static final C58962mu A00(View view) {
        WeakHashMap weakHashMap = C58962mu.A01;
        Object obj = weakHashMap.get(view);
        if (obj == null) {
            obj = new C58962mu(view);
            weakHashMap.put(view, obj);
        }
        return (C58962mu) obj;
    }
}
