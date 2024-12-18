package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.navigation.ttrc.MPLTracker;

/* renamed from: X.Jbo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43939Jbo extends C98O {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C69613Av A04;
    public final C69613Av A05;
    public final C69613Av A06;
    public final C69613Av A07;
    public final C69613Av A08;
    public final C69613Av A09;
    public final C69613Av A0A;
    public final C69613Av A0B;
    public final C69613Av A0C;
    public final C69613Av A0D;
    public final InterfaceC09390do A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    @Override // X.C98O, X.AbstractC69603Au
    public final void A05() {
        if (this.A0F && this.A0G) {
            InterfaceC09390do interfaceC09390do = this.A0E;
            if (((MPLTracker) interfaceC09390do.getValue()).isReady()) {
                ((MPLTracker) interfaceC09390do.getValue()).stopTrackingInteraction(this.A03, ((AbstractC69603Au) this).A00);
            }
        }
        A0K("is_tracking_offline_sync", AbstractC167007dF.A1W(this.A0C));
        super.A05();
    }

    @Override // X.JQS
    public final boolean A0R() {
        return !this.A0H;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43939Jbo(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(userSession, "threads", 1060769838, z, true);
        C69613Av c69613Av;
        C69613Av c69613Av2;
        C14360o3.A0B(userSession, 1);
        this.A0H = z2;
        this.A0G = z3;
        this.A0F = z5;
        this.A08 = A02("on_resume_controller");
        C69613Av c69613Av3 = new C69613Av(this, "on_pause_controller");
        java.util.Set set = ((AbstractC69603Au) this).A06;
        set.add(c69613Av3);
        this.A07 = c69613Av3;
        C69613Av c69613Av4 = new C69613Av(this, "threads_metadata_retrieval");
        set.add(c69613Av4);
        this.A0D = c69613Av4;
        C69613Av c69613Av5 = new C69613Av(this, "open_threads_retrieval");
        set.add(c69613Av5);
        this.A09 = c69613Av5;
        this.A0A = A02("open_threads_view_model_calculation");
        this.A0B = A02("sub_iris");
        C69613Av c69613Av6 = new C69613Av(this, "initial_snapshot");
        set.add(c69613Av6);
        this.A06 = c69613Av6;
        C69613Av c69613Av7 = null;
        if (z3) {
            c69613Av = A02("armadillo_threads_retrieval");
        } else {
            c69613Av = null;
        }
        this.A04 = c69613Av;
        if (z3) {
            c69613Av2 = A02("armadillo_threads_view_model_calculation");
        } else {
            c69613Av2 = null;
        }
        this.A05 = c69613Av2;
        if (z3 && z4) {
            c69613Av7 = A02("tam_sync_group_complete");
        }
        this.A0C = c69613Av7;
        InterfaceC09390do A00 = C1XM.A00(C44009Jcw.A00);
        this.A0E = A00;
        this.A01 = 1;
        this.A00 = 1;
        this.A02 = 10;
        this.A03 = 1060769838;
        if (!C18U.A06(C06090Tz.A05, userSession, 36327486224611945L)) {
            A00.getValue();
        }
    }
}
