package X;

import android.app.Activity;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.LSw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48147LSw implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C48147LSw(C47812L9u c47812L9u, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i) {
        this.A00 = i;
        this.A03 = c47812L9u;
        if (4 - i != 0) {
            this.A01 = interfaceC16660sJ;
            this.A02 = interfaceC16820sZ;
        } else {
            this.A02 = interfaceC16820sZ;
            this.A01 = interfaceC16660sJ;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        Handler A0J;
        Runnable m5w;
        InterfaceC16820sZ interfaceC16820sZ;
        switch (this.A00) {
            case 0:
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("GraphQL error for event ");
                Object obj = this.A02;
                C0w9.A06("attribution_sdk:GraphQLAttributionEventsClient", AbstractC166997dE.A0v(obj, A1C), th);
                ((MQN) this.A01).DG5(AbstractC167017dG.A0n(obj, "GraphQL error for event ", AbstractC166987dD.A1C()), th);
                return;
            case 1:
                C70399WUb c70399WUb = (C70399WUb) this.A01;
                VG4 vg4 = (VG4) this.A02;
                C2n2 c2n2 = (C2n2) this.A03;
                c70399WUb.A0J(vg4, "whatapp_link_detection_fetch", "Fail to fetch WA link detection");
                c2n2.apply(AbstractC166997dE.A0a());
                return;
            case 2:
                LH3.A01((Activity) this.A01, "Sticker save failed", "Error saving sticker", null, 2131968948);
                interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
                if (interfaceC16820sZ == null) {
                    return;
                }
                interfaceC16820sZ.invoke();
                return;
            case 3:
                LH3.A01((Activity) this.A01, "Sticker save failed", "Error saving sticker", null, 2131968948);
                interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
                interfaceC16820sZ.invoke();
                return;
            case 4:
                C47812L9u c47812L9u = (C47812L9u) this.A03;
                c47812L9u.A00.A03(false);
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A02;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                A0J = AbstractC167007dF.A0J();
                m5w = new M5W(c47812L9u, interfaceC16820sZ2, interfaceC16660sJ);
                A0J.post(m5w);
                return;
            case 5:
                C47812L9u c47812L9u2 = (C47812L9u) this.A03;
                c47812L9u2.A00.A03(false);
                A0J = AbstractC167007dF.A0J();
                m5w = new M5V(c47812L9u2, (InterfaceC16820sZ) this.A02, (InterfaceC16660sJ) this.A01);
                A0J.post(m5w);
                return;
            default:
                AbstractC41669Ic1.A02((FragmentActivity) this.A01, (UserSession) this.A02, (String) ((C15370ps) this.A03).A00);
                return;
        }
    }

    public C48147LSw(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }
}
