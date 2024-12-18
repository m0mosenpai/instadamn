package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GIf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36757GIf implements InterfaceC37287Gbo {
    public final /* synthetic */ InterfaceC169407hE A00;

    public C36757GIf(InterfaceC169407hE interfaceC169407hE) {
        this.A00 = interfaceC169407hE;
    }

    @Override // X.InterfaceC37287Gbo
    public final String Bho() {
        ImageUrl Bhn = this.A00.Bhn();
        if (Bhn != null) {
            return Bhn.getUrl();
        }
        return null;
    }

    @Override // X.InterfaceC37287Gbo
    public final int Bo4() {
        return AbstractC167017dG.A0K(this.A00.Bo5());
    }
}
