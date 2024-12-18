package X;

import java.util.Map;

/* renamed from: X.DwC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31707DwC extends AbstractC193068gm {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        InterfaceC103384lE interfaceC103384lE = this.A01;
        if (interfaceC103384lE != null) {
            AbstractC31171DnF.A1K(this.A00, interfaceC103384lE);
        }
        AbstractC25241Le.A00(this.A00.A03, AnonymousClass001.A0R("[Bloks] AsyncActionWithDataManifestV2: ", this.A03), "Failed to fetch action on payload", abstractC115105If.A01());
    }

    public C31707DwC(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, String str, Map map) {
        this.A00 = c6fq;
        this.A04 = map;
        this.A02 = interfaceC103384lE;
        this.A01 = interfaceC103384lE2;
        this.A03 = str;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C6FP.A06(AbstractC31175DnJ.A0E(obj), this.A00, this.A02, this.A01, this.A04);
    }
}
