package com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database;

import X.C164427Xg;
import X.C164447Xj;
import com.instagram.roomdb.IgRoomDatabase;

/* loaded from: classes3.dex */
public abstract class SafetyInterventionsDatabase extends IgRoomDatabase {
    public static final C164427Xg A00 = new Object();

    public final C164447Xj A00() {
        C164447Xj c164447Xj;
        SafetyInterventionsDatabase_Impl safetyInterventionsDatabase_Impl = (SafetyInterventionsDatabase_Impl) this;
        if (safetyInterventionsDatabase_Impl.A01 != null) {
            return safetyInterventionsDatabase_Impl.A01;
        }
        synchronized (safetyInterventionsDatabase_Impl) {
            if (safetyInterventionsDatabase_Impl.A01 == null) {
                safetyInterventionsDatabase_Impl.A01 = new C164447Xj(safetyInterventionsDatabase_Impl);
            }
            c164447Xj = safetyInterventionsDatabase_Impl.A01;
        }
        return c164447Xj;
    }
}
