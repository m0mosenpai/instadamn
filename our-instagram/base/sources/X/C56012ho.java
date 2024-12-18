package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.2ho, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56012ho implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float z = ((View) obj).getZ();
        float z2 = ((View) obj2).getZ();
        if (z > z2) {
            return -1;
        }
        if (z >= z2) {
            return 0;
        }
        return 1;
    }
}
