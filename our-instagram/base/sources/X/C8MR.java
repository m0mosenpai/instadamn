package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.8MR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MR {
    public C210749Tw A00;
    public C85L A01;
    public final Context A02;
    public final UserSession A03;
    public final C8DL A04;
    public final C183608Cl A05;
    public final Queue A06;
    public final InterfaceC16660sJ A07;
    public final C19L A08;
    public final boolean A09;

    public final void A00() {
        Runnable runnable;
        Queue queue = this.A06;
        if (!queue.isEmpty() && (runnable = (Runnable) queue.poll()) != null) {
            runnable.run();
        }
    }

    public C8MR(Context context, UserSession userSession, C8DL c8dl, C183608Cl c183608Cl) {
        C19K A00 = AbstractC24771Iv.A00();
        C14360o3.A0B(A00, 5);
        this.A03 = userSession;
        this.A02 = context;
        this.A04 = c8dl;
        this.A05 = c183608Cl;
        this.A08 = A00;
        this.A06 = new LinkedList();
        C06090Tz c06090Tz = C06090Tz.A06;
        this.A09 = C18U.A06(c06090Tz, userSession, 36329410370093382L);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36329410370158919L);
        if (c183608Cl != null) {
            c183608Cl.A02 = A06;
        }
        this.A07 = C8MS.A00;
    }
}
