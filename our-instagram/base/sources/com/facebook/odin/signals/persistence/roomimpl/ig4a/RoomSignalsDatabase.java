package com.facebook.odin.signals.persistence.roomimpl.ig4a;

import X.C3SS;
import X.C3SV;
import com.instagram.roomdb.IgRoomDatabase;

/* loaded from: classes2.dex */
public abstract class RoomSignalsDatabase extends IgRoomDatabase {
    public static final C3SS A00 = new Object();

    public final C3SV A00() {
        C3SV c3sv;
        RoomSignalsDatabase_Impl roomSignalsDatabase_Impl = (RoomSignalsDatabase_Impl) this;
        if (roomSignalsDatabase_Impl.A00 != null) {
            return roomSignalsDatabase_Impl.A00;
        }
        synchronized (roomSignalsDatabase_Impl) {
            if (roomSignalsDatabase_Impl.A00 == null) {
                roomSignalsDatabase_Impl.A00 = new C3SV(roomSignalsDatabase_Impl);
            }
            c3sv = roomSignalsDatabase_Impl.A00;
        }
        return c3sv;
    }
}
