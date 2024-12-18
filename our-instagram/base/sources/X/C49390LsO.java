package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.LsO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49390LsO implements InterfaceC86743tm {
    public final /* synthetic */ C49340LrY A00;
    public final /* synthetic */ C49038LmQ A01;
    public final /* synthetic */ C7IN A02;
    public final /* synthetic */ DirectMessageIdentifier A03;

    public C49390LsO(C49340LrY c49340LrY, C49038LmQ c49038LmQ, C7IN c7in, DirectMessageIdentifier directMessageIdentifier) {
        this.A01 = c49038LmQ;
        this.A03 = directMessageIdentifier;
        this.A02 = c7in;
        this.A00 = c49340LrY;
    }

    @Override // X.InterfaceC86743tm
    public final void D4E() {
        if (!this.A01.A01.A00(this.A03).A02) {
            this.A02.A01(null, this.A00);
        }
    }
}
