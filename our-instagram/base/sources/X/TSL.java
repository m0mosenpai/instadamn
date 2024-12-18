package X;

import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final /* synthetic */ class TSL implements Comparator {
    public static final /* synthetic */ TSL A00 = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        String str = feature.A00;
        String str2 = feature2.A00;
        if (!str.equals(str2)) {
            return str.compareTo(str2);
        }
        return (feature.A00() > feature2.A00() ? 1 : (feature.A00() == feature2.A00() ? 0 : -1));
    }
}
