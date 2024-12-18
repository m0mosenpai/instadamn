package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.direct.DirectShareTarget;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes10.dex */
public final class RcR extends AbstractRunnableC14200nk {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C7NM A01;
    public final /* synthetic */ DirectShareTarget A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcR(C7NM c7nm, DirectShareTarget directShareTarget, long j) {
        super(667);
        this.A01 = c7nm;
        this.A02 = directShareTarget;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContentValues contentValues;
        String A09;
        try {
            C7NO A00 = C7NO.A00(this.A01.A01);
            DirectShareTarget directShareTarget = this.A02;
            long j = this.A00;
            SQLiteDatabase A01 = C7NQ.A00().A01();
            if (A01 != null) {
                C0fW.A01(A01, 1671432794);
                try {
                    UserSession userSession = A00.A00;
                    String str = userSession.userId;
                    synchronized (directShareTarget) {
                        contentValues = new ContentValues();
                        contentValues.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                        if (directShareTarget.A08() != null) {
                            A09 = directShareTarget.A08();
                        } else {
                            A09 = directShareTarget.A09();
                        }
                        contentValues.put("target_key", A09);
                        StringWriter stringWriter = new StringWriter();
                        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                        C7NS.A00(A0A, directShareTarget);
                        A0A.close();
                        contentValues.put("target_info", stringWriter.toString());
                        contentValues.put("last_picked_time_ms", Long.valueOf(j));
                    }
                    C0fW.A00(927496240);
                    A01.insertWithOnConflict("recent_searches", null, contentValues, 5);
                    C0fW.A00(-1135647327);
                    String str2 = userSession.userId;
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("delete from recent_searches where last_picked_time_ms in (select last_picked_time_ms from recent_searches where user_id = ");
                    A1C.append(str2);
                    A1C.append(" order by ");
                    A1C.append("last_picked_time_ms");
                    A1C.append(" asc limit MAX(0, (select count(*) from ");
                    A1C.append("recent_searches");
                    A1C.append(" where ");
                    A1C.append(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                    A1C.append(" = ");
                    A1C.append(str2);
                    A1C.append(") - ");
                    A1C.append(50);
                    String A0x = AbstractC166997dE.A0x("));", A1C);
                    C0fW.A00(-2044905883);
                    A01.execSQL(A0x);
                    C0fW.A00(823308306);
                    A01.setTransactionSuccessful();
                    C0fW.A03(A01, 493701575);
                } catch (Throwable th) {
                    C0fW.A03(A01, -379550960);
                    throw th;
                }
            }
        } catch (IOException e) {
            C0K8.A0F(AbstractC111324zv.A00(3723), "Error inserting recent search item in database", e);
        }
    }
}
