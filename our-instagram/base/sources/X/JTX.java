package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class JTX extends AbstractRunnableC14200nk {
    public final /* synthetic */ C28741aC A00;
    public final /* synthetic */ List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTX(C28741aC c28741aC, List list) {
        super(522, 4, false, false);
        this.A00 = c28741aC;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C28741aC c28741aC = this.A00;
        List list = this.A01;
        SystemClock.uptimeMillis();
        SQLiteDatabase A00 = C28741aC.A00(c28741aC);
        if (A00 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C0fW.A01(A00, -1761473994);
            try {
                try {
                    UserSession userSession = c28741aC.A01;
                    C4I0 c4i0 = (C4I0) userSession.A01(C4I0.class, new MHI(userSession, 41));
                    c4i0.A03(c4i0.A04());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c4i0.A09(byteArrayOutputStream, (C1OW) it.next());
                    }
                    A00.setTransactionSuccessful();
                } catch (SQLiteException e) {
                    C49682Qb.A06.A02(e);
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
    }
}
