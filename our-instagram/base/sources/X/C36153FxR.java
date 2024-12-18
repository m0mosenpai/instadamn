package X;

import java.util.List;

/* renamed from: X.FxR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36153FxR implements InterfaceC41501vz {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ C25671My A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ List A04;

    public C36153FxR(C6FG c6fg, C6FQ c6fq, C25671My c25671My, InterfaceC103384lE interfaceC103384lE, List list) {
        this.A02 = c25671My;
        this.A01 = c6fq;
        this.A03 = interfaceC103384lE;
        this.A04 = list;
        this.A00 = c6fg;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1319177722);
        C36091FwR c36091FwR = (C36091FwR) obj;
        int A0N = AbstractC167017dG.A0N(c36091FwR, -1265063751);
        this.A02.A02(this, C36091FwR.class);
        C6FQ c6fq = this.A01;
        InterfaceC103384lE interfaceC103384lE = this.A03;
        List list = c36091FwR.A00;
        if (list == null) {
            list = this.A04;
        }
        C6BQ.A0E(c6fq, interfaceC103384lE, list, this.A00);
        C0f9.A0A(-1989333872, A0N);
        C0f9.A0A(-1441469309, A03);
    }
}
