package com.facebook.odin.features.persistence.room.ig4a;

import X.C3S0;
import X.C73703Rx;
import com.instagram.roomdb.IgRoomDatabase;

/* loaded from: classes2.dex */
public abstract class IgRoomExampleDatabase extends IgRoomDatabase {
    public static final C73703Rx A00 = new Object();

    public final C3S0 A00() {
        C3S0 c3s0;
        IgRoomExampleDatabase_Impl igRoomExampleDatabase_Impl = (IgRoomExampleDatabase_Impl) this;
        if (igRoomExampleDatabase_Impl.A00 != null) {
            return igRoomExampleDatabase_Impl.A00;
        }
        synchronized (igRoomExampleDatabase_Impl) {
            if (igRoomExampleDatabase_Impl.A00 == null) {
                igRoomExampleDatabase_Impl.A00 = new C3S0(igRoomExampleDatabase_Impl);
            }
            c3s0 = igRoomExampleDatabase_Impl.A00;
        }
        return c3s0;
    }
}
