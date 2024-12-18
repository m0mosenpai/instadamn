package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.HFy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39022HFy extends C1P1 {
    public final /* synthetic */ InterfaceC63862v7 A00;
    public final /* synthetic */ C63822v3 A01;
    public final /* synthetic */ Hashtag A02;

    public C39022HFy(InterfaceC63862v7 interfaceC63862v7, C63822v3 c63822v3, Hashtag hashtag) {
        this.A01 = c63822v3;
        this.A00 = interfaceC63862v7;
        this.A02 = hashtag;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1486997183);
        Hashtag hashtag = this.A02;
        Throwable A01 = abstractC115105If.A01();
        C63822v3 c63822v3 = this.A01;
        AbstractC70136W6n.A02(c63822v3.A02, c63822v3.A03, hashtag, "destroy", A01);
        this.A00.DKC(abstractC115105If, hashtag);
        C0f9.A0A(-170444392, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1604182502);
        int A032 = C0f9.A03(1825763183);
        this.A00.DKD((InterfaceC40821up) obj, this.A02);
        C0f9.A0A(-1295126810, A032);
        C0f9.A0A(1246253292, A03);
    }
}
