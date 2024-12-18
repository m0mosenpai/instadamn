package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KM1 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C28741aC A00;
    public final /* synthetic */ DirectThreadKey A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KM1(C28741aC c28741aC, DirectThreadKey directThreadKey) {
        super(520, 4, false, false);
        this.A00 = c28741aC;
        this.A01 = directThreadKey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase A00;
        C28741aC c28741aC = this.A00;
        DirectThreadKey directThreadKey = this.A01;
        C49692Qc c49692Qc = C49682Qb.A06;
        if (!c49692Qc.A03()) {
            SystemClock.uptimeMillis();
            C4GV A0P = c28741aC.A04.A0P(directThreadKey);
            if (A0P != null && (A00 = C28741aC.A00(c28741aC)) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                List list = null;
                C0fW.A01(A00, 950116071);
                try {
                    try {
                        UserSession userSession = c28741aC.A01;
                        C2S2.A00(userSession).A0L(directThreadKey);
                        C2SP.A00(userSession).A0L(directThreadKey);
                        list = C28741aC.A03(A0P, c28741aC, byteArrayOutputStream, AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36609991993530368L));
                        A00.setTransactionSuccessful();
                    } catch (SQLiteException | IllegalStateException e) {
                        c49692Qc.A02(e);
                    }
                    C4GN.A00(A00);
                    if (!c49692Qc.A03() && list != null) {
                        HashSet hashSet = new HashSet(list.size());
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String A0g = AbstractC43592JPx.A0e(it).A0g();
                            if (A0g != null) {
                                hashSet.add(A0g);
                            }
                        }
                        LAB A002 = AbstractC47001KqK.A00(c28741aC.A01);
                        Iterator it2 = AbstractC001800i.A0l(hashSet, A002.A04).iterator();
                        while (it2.hasNext()) {
                            String A1B = AbstractC166987dD.A1B(it2);
                            LJA lja = A002.A01;
                            lja.A03(A1B, "persist_end");
                            lja.A07(A1B, (short) 2);
                        }
                    }
                    SystemClock.uptimeMillis();
                } catch (Throwable th) {
                    C4GN.A00(A00);
                    throw th;
                }
            }
        }
    }
}
