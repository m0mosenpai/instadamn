package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.G7u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36496G7u implements GZ9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC37215GaQ A01;

    public C36496G7u(InterfaceC37215GaQ interfaceC37215GaQ, int i) {
        this.A01 = interfaceC37215GaQ;
        this.A00 = i;
    }

    @Override // X.GZ9
    public final void D3r(Hashtag hashtag) {
        this.A01.D3s(hashtag, this.A00);
    }

    @Override // X.GZ9
    public final void D4c(Hashtag hashtag) {
        this.A01.D4d(hashtag, this.A00);
    }
}
