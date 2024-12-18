package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Awr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24710Awr implements Runnable {
    public final /* synthetic */ C2045793r A00;
    public final /* synthetic */ C2NX A01;

    public RunnableC24710Awr(C2045793r c2045793r, C2NX c2nx) {
        this.A01 = c2nx;
        this.A00 = c2045793r;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0bW, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2NX c2nx = this.A01;
            CallerContext callerContext = C2NX.A08;
            UserSession userSession = c2nx.A04;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36324449682731180L)) {
                long A01 = C18U.A01(c06090Tz, userSession, 36605924659500396L);
                Context context = c2nx.A01;
                int i = (int) A01;
                HashMap hashMap = C58331PtP.A06;
                C58331PtP A012 = C58331PtP.A01(context, null, new Object());
                C58331PtP.A03(A012);
                Iterator A0k = AbstractC167007dF.A0k(A012.A03);
                while (A0k.hasNext()) {
                    ((C54807OKb) A0k.next()).A01(i);
                }
                boolean z = C218914p.A04;
                C218914p.A06(this.A00);
            }
        } catch (IOException e) {
            C0w9.A06(AbstractC111324zv.A00(691), "failed to purge temp files", e);
        }
    }
}
