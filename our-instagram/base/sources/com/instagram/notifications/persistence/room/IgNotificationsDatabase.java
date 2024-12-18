package com.instagram.notifications.persistence.room;

import X.C109394wQ;
import X.C109424wU;
import com.instagram.roomdb.IgDeviceScopedRoomDatabase;

/* loaded from: classes2.dex */
public abstract class IgNotificationsDatabase extends IgDeviceScopedRoomDatabase {
    public static final C109394wQ A00 = new Object();

    public final C109424wU A00() {
        C109424wU c109424wU;
        IgNotificationsDatabase_Impl igNotificationsDatabase_Impl = (IgNotificationsDatabase_Impl) this;
        if (igNotificationsDatabase_Impl.A00 != null) {
            return igNotificationsDatabase_Impl.A00;
        }
        synchronized (igNotificationsDatabase_Impl) {
            if (igNotificationsDatabase_Impl.A00 == null) {
                igNotificationsDatabase_Impl.A00 = new C109424wU(igNotificationsDatabase_Impl);
            }
            c109424wU = igNotificationsDatabase_Impl.A00;
        }
        return c109424wU;
    }
}
