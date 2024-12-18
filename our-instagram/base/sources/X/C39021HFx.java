package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.HFx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39021HFx extends C1P1 {
    public final /* synthetic */ InterfaceC63862v7 A00;
    public final /* synthetic */ C63822v3 A01;
    public final /* synthetic */ Hashtag A02;

    public C39021HFx(InterfaceC63862v7 interfaceC63862v7, C63822v3 c63822v3, Hashtag hashtag) {
        this.A01 = c63822v3;
        this.A00 = interfaceC63862v7;
        this.A02 = hashtag;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1273218457);
        Hashtag hashtag = this.A02;
        Throwable A01 = abstractC115105If.A01();
        C63822v3 c63822v3 = this.A01;
        AbstractC70136W6n.A02(c63822v3.A02, c63822v3.A03, hashtag, "create", A01);
        this.A00.DK9(abstractC115105If, hashtag);
        C0f9.A0A(872435098, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1485382630);
        int A032 = C0f9.A03(-1056873453);
        this.A00.DKA((InterfaceC40821up) obj, this.A02);
        C0f9.A0A(2041244388, A032);
        C0f9.A0A(651420072, A03);
    }
}
