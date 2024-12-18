package X;

import android.content.pm.PackageItemInfo;
import java.util.Comparator;

/* renamed from: X.0UV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UV implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((PackageItemInfo) obj).name.compareTo(((PackageItemInfo) obj2).name);
    }
}
