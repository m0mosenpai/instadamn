package com.instagram.debug.devoptions.sandboxselector;

import X.C14360o3;
import X.C1YX;
import X.C1YZ;
import X.C1Ye;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public abstract class DevServerDatabase extends IgRoomDatabase {
    public static final Companion Companion = new Object();

    /* loaded from: classes9.dex */
    public final class Companion implements C1YX {
        public C1Ye config(C1Ye c1Ye) {
            C14360o3.A0B(c1Ye, 0);
            c1Ye.A01();
            c1Ye.A03(DevServerDatabaseKt.MIGRATION_1_2);
            return c1Ye;
        }

        public /* synthetic */ String dbFilename(UserSession userSession) {
            return C1YZ.A00(userSession, this);
        }

        @Override // X.C1YX
        public String dbFilenamePrefix() {
            return "dev_servers";
        }

        public /* synthetic */ boolean deleteDatabase(UserSession userSession) {
            return C1YZ.A01(userSession, this);
        }

        public boolean isWorkAllowedOnStartup() {
            return false;
        }

        public int queryIgRunnableId() {
            return 290966940;
        }

        public int transactionIgRunnableId() {
            return 693276343;
        }

        public /* synthetic */ int workPriority() {
            return 3;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public abstract DevServerDao devServerDao();
}
