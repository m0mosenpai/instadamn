package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KLb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45698KLb extends AbstractRunnableC14200nk {
    public final /* synthetic */ C28741aC A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45698KLb(C28741aC c28741aC) {
        super(356635853, 4, false, false);
        this.A00 = c28741aC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC09800fd.A01("DirectSQLiteDiskIO.savePendingInboxToDiskAsync", 609459013);
        C28741aC c28741aC = this.A00;
        SystemClock.uptimeMillis();
        SQLiteDatabase A00 = C28741aC.A00(c28741aC);
        if (A00 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C0fW.A01(A00, 1269875669);
            try {
                try {
                    try {
                        UserSession userSession = c28741aC.A01;
                        C2S3 A002 = C2S2.A00(userSession);
                        List A07 = A002.A07(C2SA.A00(A002.A04(), AnonymousClass001.A0R("is_permitted==", "0")));
                        C2S3 A003 = C2S2.A00(userSession);
                        A003.A03(C2SA.A00(A003.A04(), AnonymousClass001.A0R("is_permitted==", "0")));
                        C2SP.A00(userSession).A0N(A07);
                        List A1J = AbstractC166987dD.A1J(EnumC46982Dm.A06);
                        C2DU c2du = c28741aC.A04;
                        Iterator it = c2du.A0R(AbstractC31172DnG.A19(A1J)).iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            C81663kb c81663kb = (C81663kb) it.next();
                            if (i >= AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36598614626143480L)) {
                                break;
                            }
                            C4GV A0P = c2du.A0P(c81663kb.BKb());
                            if (A0P != null) {
                                C28741aC.A03(A0P, c28741aC, byteArrayOutputStream, 20);
                                i++;
                            }
                        }
                        A00.setTransactionSuccessful();
                        C23031Ai A004 = AbstractC23021Ah.A00(userSession);
                        long currentTimeMillis = System.currentTimeMillis();
                        InterfaceC19610xo A0w = AbstractC166987dD.A0w(A004);
                        A0w.E7G("last_pending_inbox_cache_update_timestamp", currentTimeMillis);
                        A0w.apply();
                    } catch (SQLiteException e) {
                        C49682Qb.A06.A02(e);
                    }
                } catch (IllegalStateException e2) {
                    C49682Qb.A06.A02(e2);
                }
                C4GN.A00(A00);
                SystemClock.uptimeMillis();
            } catch (Throwable th) {
                C4GN.A00(A00);
                throw th;
            }
        }
        AbstractC09800fd.A00(2126831576);
    }
}
