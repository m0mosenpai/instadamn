package X;

import java.util.Iterator;

/* renamed from: X.Pv8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58429Pv8 implements InterfaceC65376Tj9 {
    public final /* synthetic */ C58424Pv2 A00;
    public final /* synthetic */ C58422Pv0 A01;
    public final /* synthetic */ C58427Pv6 A02;
    public final /* synthetic */ Iterator A03;

    public C58429Pv8(C58424Pv2 c58424Pv2, C58422Pv0 c58422Pv0, C58427Pv6 c58427Pv6, Iterator it) {
        this.A01 = c58422Pv0;
        this.A02 = c58427Pv6;
        this.A03 = it;
        this.A00 = c58424Pv2;
    }

    @Override // X.InterfaceC65376Tj9
    public final void D6g(C58428Pv7 c58428Pv7) {
        C129605tP c129605tP = (C129605tP) c58428Pv7.A04();
        if (c129605tP == null) {
            C0K8.A0E("AppModuleActionQueryV2", "No action result provided - use ActionResult to pass exceptions.");
            C58427Pv6 c58427Pv6 = this.A02;
            if (c58427Pv6 != null) {
                c58427Pv6.A00(AbstractC166987dD.A14("No action result provided - use ActionResult to pass exceptions."));
                return;
            }
            return;
        }
        C124725kd c124725kd = c129605tP.A00;
        C58427Pv6 c58427Pv62 = this.A02;
        if (c58427Pv62 != null && c124725kd != null) {
            c58427Pv62.A01(c124725kd);
            this.A01.A00 = c129605tP.A01;
        }
        Iterator it = this.A03;
        if (!it.hasNext() && c58427Pv62 != null && !c58427Pv62.A00.A06()) {
            C0K8.A0Q("AppModuleActionQueryV2", "All actions executed, but task is incomplete %s", this.A00.A03.toString());
            c58427Pv62.A00(AbstractC166987dD.A14("All actions executed, but task is incomplete"));
        } else {
            if (!c129605tP.A02 || !it.hasNext()) {
                return;
            }
            C58422Pv0 c58422Pv0 = this.A01;
            if (c58427Pv62 == null || c58427Pv62.A00.A06()) {
                c58427Pv62 = null;
            }
            C58422Pv0.A00(this.A00, c58422Pv0, c58427Pv62, it);
        }
    }
}
