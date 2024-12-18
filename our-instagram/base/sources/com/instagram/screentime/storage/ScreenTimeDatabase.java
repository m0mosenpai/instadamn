package com.instagram.screentime.storage;

import X.C99024cO;
import X.C99044cR;
import com.instagram.roomdb.IgRoomDatabase;

/* loaded from: classes2.dex */
public abstract class ScreenTimeDatabase extends IgRoomDatabase {
    public static final C99024cO A00 = new Object();

    public final C99044cR A00() {
        C99044cR c99044cR;
        ScreenTimeDatabase_Impl screenTimeDatabase_Impl = (ScreenTimeDatabase_Impl) this;
        if (screenTimeDatabase_Impl.A00 != null) {
            return screenTimeDatabase_Impl.A00;
        }
        synchronized (screenTimeDatabase_Impl) {
            if (screenTimeDatabase_Impl.A00 == null) {
                screenTimeDatabase_Impl.A00 = new C99044cR(screenTimeDatabase_Impl);
            }
            c99044cR = screenTimeDatabase_Impl.A00;
        }
        return c99044cR;
    }
}
