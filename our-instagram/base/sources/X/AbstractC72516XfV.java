package X;

import android.os.Bundle;
import com.facebook.location.platform.api.Location;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.XfV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72516XfV {
    public static C72802XnP[] A00(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        int length = bundleArr.length;
        C72802XnP[] c72802XnPArr = new C72802XnP[length];
        for (int i = 0; i < length; i++) {
            Bundle bundle = bundleArr[i];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet A1H = AbstractC166987dD.A1H();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    A1H.add(it.next());
                }
            }
            String string = bundle.getString("resultKey");
            c72802XnPArr[i] = new C72802XnP(bundle.getBundle(Location.EXTRAS), bundle.getCharSequence("label"), string, A1H, bundle.getCharSequenceArray("choices"), 0, bundle.getBoolean("allowFreeFormInput"));
        }
        return c72802XnPArr;
    }
}
