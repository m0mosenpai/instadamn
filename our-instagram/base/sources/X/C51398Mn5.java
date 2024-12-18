package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.Mn5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51398Mn5 extends AbstractC53631Nnc implements InterfaceC57895Plz {
    public Handler A00;
    public InterfaceC58135Ppy A01;
    public OML A02;
    public InterfaceC58013Pnx A03;
    public C2JL A04;
    public C47Z A05;
    public Handler A06;
    public final UserSession A07;
    public final HandlerThread A08;
    public final HandlerThread A09;
    public final C53640Nnl A0A;
    public final Queue A0B = new LinkedList();

    public C51398Mn5(C53640Nnl c53640Nnl, UserSession userSession) {
        this.A07 = userSession;
        this.A0A = c53640Nnl;
        HandlerThread A0A = MSY.A0A("polling_thread_segment_anything");
        this.A08 = A0A;
        HandlerThread A0A2 = MSY.A0A("creation_timeout_segment_anything");
        this.A09 = A0A2;
        A0A.start();
        A0A2.start();
        this.A06 = MSY.A09(A0A2);
        this.A00 = MSY.A09(A0A);
    }

    @Override // X.InterfaceC57895Plz
    public final void DiA(String str, String str2) {
    }
}
