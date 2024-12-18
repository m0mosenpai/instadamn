package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase;
import com.instagram.roomdb.IgRoomDatabase;

/* renamed from: X.99c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2057799c {
    public final UserSession A00;
    public final C2059599x A01;
    public final ArmadilloExpressEncryptedBackupDatabase A02;
    public final C2057699b A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.99x] */
    public C2057799c(UserSession userSession, C2057699b c2057699b) {
        this.A00 = userSession;
        this.A03 = c2057699b;
        C2057999f c2057999f = ArmadilloExpressEncryptedBackupDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(ArmadilloExpressEncryptedBackupDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (c2057999f) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(ArmadilloExpressEncryptedBackupDatabase.class);
                if (igRoomDatabase == null) {
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    C1Ye A00 = C1Yc.A00(context, ArmadilloExpressEncryptedBackupDatabase.class, C1YZ.A00(userSession, c2057999f));
                    AbstractC28241Yh.A00(A00, 484173884, 297777620, true);
                    A00.A02(5, 6, 7, 8, 9, 10, 11);
                    A00.A03(AbstractC2058099g.A00, AbstractC2058099g.A01, AbstractC2058099g.A02, AbstractC2058099g.A03, AbstractC2058099g.A04, AbstractC2058099g.A05, AbstractC2058099g.A06, AbstractC2058099g.A07, AbstractC2058099g.A08, AbstractC2058099g.A09);
                    A00.A05 = true;
                    A00.A03 = true;
                    igRoomDatabase = (IgRoomDatabase) A00.A00();
                    userSession.A04(ArmadilloExpressEncryptedBackupDatabase.class, igRoomDatabase);
                }
            }
        }
        final ArmadilloExpressEncryptedBackupDatabase armadilloExpressEncryptedBackupDatabase = (ArmadilloExpressEncryptedBackupDatabase) igRoomDatabase;
        this.A02 = armadilloExpressEncryptedBackupDatabase;
        this.A01 = new Object(armadilloExpressEncryptedBackupDatabase) { // from class: X.99x
            public final ArmadilloExpressEncryptedBackupDatabase A00;

            {
                C14360o3.A0B(armadilloExpressEncryptedBackupDatabase, 1);
                this.A00 = armadilloExpressEncryptedBackupDatabase;
            }
        };
    }
}
