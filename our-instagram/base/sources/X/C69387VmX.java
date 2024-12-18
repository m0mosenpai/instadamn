package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.Deque;
import java.util.LinkedList;

/* renamed from: X.VmX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69387VmX {
    public boolean A00;
    public final Handler A01;
    public final UserSession A02;
    public final C1GL A03;
    public final C69619VsM A04;
    public final C69786VvR A05;
    public final Deque A06;

    public C69387VmX(UserSession userSession, C1GL c1gl, C69619VsM c69619VsM, C69786VvR c69786VvR) {
        AbstractC167027dH.A0a(1, userSession, c1gl, c69619VsM, c69786VvR);
        this.A02 = userSession;
        this.A03 = c1gl;
        this.A04 = c69619VsM;
        this.A05 = c69786VvR;
        this.A06 = new LinkedList();
        this.A01 = new HandlerC65967TxK(Looper.getMainLooper(), this, 7);
    }
}
