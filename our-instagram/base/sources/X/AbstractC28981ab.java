package X;

import android.content.Context;

/* renamed from: X.1ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC28981ab {
    public static C29051ai A00(Context context, AbstractC28901aT abstractC28901aT, String str, boolean z, boolean z2) {
        if (z2 && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C29051ai(context, abstractC28901aT, str, z2, z);
    }
}
