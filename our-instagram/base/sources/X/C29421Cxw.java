package X;

import com.instagram.wonderwall.model.WallPostItem;

/* renamed from: X.Cxw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29421Cxw implements InterfaceC31042Dkg {
    public final /* synthetic */ WallPostItem A00;
    public final /* synthetic */ C25884Bck A01;

    public C29421Cxw(WallPostItem wallPostItem, C25884Bck c25884Bck) {
        this.A01 = c25884Bck;
        this.A00 = wallPostItem;
    }

    @Override // X.InterfaceC31042Dkg
    public final void DYj() {
        C25884Bck c25884Bck = this.A01;
        c25884Bck.A00.E4s(new C56016Otn(C29423Cxy.A00, c25884Bck.A02.A01));
    }

    @Override // X.InterfaceC31042Dkg
    public final void E1a(String str) {
        C25884Bck c25884Bck = this.A01;
        c25884Bck.A00.E4s(new C56016Otn(new C56816PJm(this.A00), c25884Bck.A02.A01));
        C25884Bck.A02(C29447CyN.A00, c25884Bck);
    }

    @Override // X.InterfaceC31042Dkg
    public final void E1e(WallPostItem wallPostItem) {
        C25884Bck c25884Bck = this.A01;
        C25884Bck.A03(c25884Bck, C30179DRk.A01(wallPostItem, 32));
        c25884Bck.A00.E4s(new C56016Otn(new C29422Cxx(wallPostItem), c25884Bck.A02.A01));
    }
}
