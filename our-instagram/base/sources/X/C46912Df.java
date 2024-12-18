package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* renamed from: X.2Df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46912Df {
    public final UserSession A00;
    public final InterfaceC19630xq A01;
    public final String A02;

    public C46912Df(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = AnonymousClass001.A0R("DatabaseCreated_", userSession.userId);
        this.A01 = C1AT.A01(userSession).A03(C1AV.A14);
    }

    public final Boolean hasDbCreatedFlag() {
        SQLiteDatabase sQLiteDatabase;
        int i;
        C49692Qc c49692Qc = C49682Qb.A06;
        C49682Qb A00 = c49692Qc.A00();
        Boolean bool = null;
        if (A00 != null) {
            sQLiteDatabase = A00.A01();
        } else {
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            C0K8.A0C("DatabaseDropDetectionCallback", "Database was null when checking db created config");
            return null;
        }
        C0fW.A01(sQLiteDatabase, 2004397150);
        try {
            try {
                try {
                    C220189o4 A002 = AbstractC46999KqI.A00(this.A00);
                    ArrayList A05 = A002.A05(A002.A04());
                    if (A05.size() > 1) {
                        C0w9.A03("DirectDatabaseCreatedConfigSQLiteTable", AnonymousClass001.A0O("Config table can only contain one row per user. size: ", A05.size()));
                    }
                    bool = Boolean.valueOf(!A05.isEmpty());
                    sQLiteDatabase.setTransactionSuccessful();
                    i = 670482141;
                } catch (IllegalStateException e) {
                    c49692Qc.A02(e);
                    C0K8.A0F("DatabaseDropDetectionCallback", "Db created config check failed.", e);
                    i = 1793031071;
                }
            } catch (SQLiteException e2) {
                c49692Qc.A02(e2);
                C0K8.A0F("DatabaseDropDetectionCallback", "Db created config check failed.", e2);
                i = -361017384;
            }
            C0fW.A03(sQLiteDatabase, i);
            return bool;
        } catch (Throwable th) {
            C0fW.A03(sQLiteDatabase, 1839386826);
            throw th;
        }
    }

    public final boolean saveConfigToDatabase() {
        SQLiteDatabase sQLiteDatabase;
        int i;
        SQLiteDatabase A00;
        C49692Qc c49692Qc = C49682Qb.A06;
        C49682Qb A002 = c49692Qc.A00();
        if (A002 != null) {
            sQLiteDatabase = A002.A01();
        } else {
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            C0K8.A0C("DatabaseDropDetectionCallback", "Database was null when saving db created config");
            return false;
        }
        C0fW.A01(sQLiteDatabase, 165247982);
        try {
            try {
                C220189o4 A003 = AbstractC46999KqI.A00(this.A00);
                C49682Qb A004 = c49692Qc.A00();
                if (A004 != null && (A00 = A004.A00()) != null) {
                    synchronized (A003.A01) {
                        Long valueOf = Long.valueOf(System.currentTimeMillis());
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        ContentValues contentValues = new ContentValues(2);
                        contentValues.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A003.A00.userId);
                        contentValues.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A003.A0A(byteArrayOutputStream, valueOf));
                        C0fW.A00(-793964948);
                        A00.replace("db_created_config", null, contentValues);
                        C0fW.A00(1503706563);
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                C0fW.A03(sQLiteDatabase, -1793391850);
                return true;
            } catch (SQLiteException e) {
                C0K8.A0F("DatabaseDropDetectionCallback", "Failed to save config to database", e);
                c49692Qc.A02(e);
                i = -2004051487;
                C0fW.A03(sQLiteDatabase, i);
                return false;
            } catch (IllegalStateException e2) {
                C0K8.A0F("DatabaseDropDetectionCallback", "Failed to save config to database", e2);
                c49692Qc.A02(e2);
                i = 1758275108;
                C0fW.A03(sQLiteDatabase, i);
                return false;
            }
        } catch (Throwable th) {
            C0fW.A03(sQLiteDatabase, 1354759173);
            throw th;
        }
    }
}
