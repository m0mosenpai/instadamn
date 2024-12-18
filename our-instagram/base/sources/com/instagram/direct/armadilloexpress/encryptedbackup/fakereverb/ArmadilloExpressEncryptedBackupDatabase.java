package com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb;

import X.AbstractC2059399u;
import X.AbstractC2059499v;
import X.C2057999f;
import X.C2059699y;
import X.KOE;
import X.KOF;
import com.instagram.roomdb.IgRoomDatabase;

/* loaded from: classes4.dex */
public abstract class ArmadilloExpressEncryptedBackupDatabase extends IgRoomDatabase {
    public static final C2057999f A00 = new Object();

    public final MessageDeletesDao A00() {
        MessageDeletesDao messageDeletesDao;
        ArmadilloExpressEncryptedBackupDatabase_Impl armadilloExpressEncryptedBackupDatabase_Impl = (ArmadilloExpressEncryptedBackupDatabase_Impl) this;
        if (armadilloExpressEncryptedBackupDatabase_Impl.A00 != null) {
            return armadilloExpressEncryptedBackupDatabase_Impl.A00;
        }
        synchronized (armadilloExpressEncryptedBackupDatabase_Impl) {
            if (armadilloExpressEncryptedBackupDatabase_Impl.A00 == null) {
                armadilloExpressEncryptedBackupDatabase_Impl.A00 = new KOE(armadilloExpressEncryptedBackupDatabase_Impl);
            }
            messageDeletesDao = armadilloExpressEncryptedBackupDatabase_Impl.A00;
        }
        return messageDeletesDao;
    }

    public final AbstractC2059499v A01() {
        AbstractC2059499v abstractC2059499v;
        ArmadilloExpressEncryptedBackupDatabase_Impl armadilloExpressEncryptedBackupDatabase_Impl = (ArmadilloExpressEncryptedBackupDatabase_Impl) this;
        if (armadilloExpressEncryptedBackupDatabase_Impl.A01 != null) {
            return armadilloExpressEncryptedBackupDatabase_Impl.A01;
        }
        synchronized (armadilloExpressEncryptedBackupDatabase_Impl) {
            if (armadilloExpressEncryptedBackupDatabase_Impl.A01 == null) {
                armadilloExpressEncryptedBackupDatabase_Impl.A01 = new KOF(armadilloExpressEncryptedBackupDatabase_Impl);
            }
            abstractC2059499v = armadilloExpressEncryptedBackupDatabase_Impl.A01;
        }
        return abstractC2059499v;
    }

    public final AbstractC2059399u A02() {
        AbstractC2059399u abstractC2059399u;
        ArmadilloExpressEncryptedBackupDatabase_Impl armadilloExpressEncryptedBackupDatabase_Impl = (ArmadilloExpressEncryptedBackupDatabase_Impl) this;
        if (armadilloExpressEncryptedBackupDatabase_Impl.A02 != null) {
            return armadilloExpressEncryptedBackupDatabase_Impl.A02;
        }
        synchronized (armadilloExpressEncryptedBackupDatabase_Impl) {
            if (armadilloExpressEncryptedBackupDatabase_Impl.A02 == null) {
                armadilloExpressEncryptedBackupDatabase_Impl.A02 = new C2059699y(armadilloExpressEncryptedBackupDatabase_Impl);
            }
            abstractC2059399u = armadilloExpressEncryptedBackupDatabase_Impl.A02;
        }
        return abstractC2059399u;
    }
}
