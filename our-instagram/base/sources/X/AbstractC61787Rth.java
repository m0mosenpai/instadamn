package X;

import com.facebook.locationsharing.core.models.LiveLocationSharer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.Rth, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61787Rth {
    public static ImmutableMap A00(ImmutableList immutableList) {
        int size = immutableList.size();
        AbstractC24841Jd.A00(size, "expectedSize");
        ImmutableMap.Builder builder = new ImmutableMap.Builder(size);
        C1LC it = immutableList.iterator();
        while (it.hasNext()) {
            LiveLocationSharer liveLocationSharer = (LiveLocationSharer) it.next();
            builder.put(liveLocationSharer.A04, liveLocationSharer);
        }
        return builder.buildOrThrow();
    }
}
