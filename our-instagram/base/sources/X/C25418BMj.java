package X;

import java.util.List;

/* renamed from: X.BMj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25418BMj implements C33R {
    public final /* synthetic */ C2XI A00;
    public final /* synthetic */ C51762Yz A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C51762Yz A03;
    public final /* synthetic */ C51762Yz A04;
    public final /* synthetic */ BLI A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;

    public C25418BMj(C2XI c2xi, C51762Yz c51762Yz, C51762Yz c51762Yz2, C51762Yz c51762Yz3, C51762Yz c51762Yz4, BLI bli, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A00 = c2xi;
        this.A03 = c51762Yz;
        this.A05 = bli;
        this.A02 = c51762Yz2;
        this.A04 = c51762Yz3;
        this.A01 = c51762Yz4;
        this.A07 = z;
        this.A06 = interfaceC16820sZ;
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        Long l;
        C38321qM c38321qM;
        C14360o3.A0B(c75113Zb, 0);
        if (i == 7) {
            this.A00.A00(Integer.valueOf(c75113Zb.A03));
            C51762Yz c51762Yz = this.A03;
            BLI bli = this.A05;
            List list = bli.A06.A0R;
            if (list != null && (c38321qM = (C38321qM) AbstractC001800i.A0O(list, c75113Zb.A03)) != null) {
                l = Long.valueOf(c38321qM.A1C());
            } else {
                l = null;
            }
            c51762Yz.A01(l);
            C51762Yz c51762Yz2 = this.A02;
            c51762Yz2.A03(new DRY(33, bli, c75113Zb));
            this.A04.A03(new BQB(32, bli, c51762Yz2, this.A07));
            this.A01.A03(new C30180DRl(this.A06, 17));
        }
    }
}
