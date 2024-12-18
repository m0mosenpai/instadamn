package X;

import android.content.Context;

/* renamed from: X.1Yc, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Yc {
    public static final C1Ye A00(Context context, Class cls, String str) {
        if (str != null && !AbstractC001900j.A0T(str)) {
            return new C1Ye(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
