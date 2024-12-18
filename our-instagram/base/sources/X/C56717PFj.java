package X;

import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

/* renamed from: X.PFj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56717PFj implements InterfaceC58068Pot {
    public final /* synthetic */ NAF A00;
    public final /* synthetic */ DirectMessagesInteropOptionsViewModel A01;

    @Override // X.InterfaceC58068Pot
    public final void D71(N3R n3r) {
        DirectMessagesInteropOptionsViewModel A00 = N3R.A00(n3r);
        NAF naf = this.A00;
        String str = naf.A01;
        if (str != null) {
            C55174Odd.A03(naf.A0A, this.A01, A00, naf.A0F, str, naf.A03, naf.A0G, true);
        }
        naf.A00 = A00;
        naf.A02 = false;
        naf.A0E.A00();
        C56142Ow4 c56142Ow4 = naf.A0D;
        c56142Ow4.A00 = C9GR.A01(naf.A05, null, 2131966434, 1);
        String str2 = naf.A01;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = naf.A00;
        if (directMessagesInteropOptionsViewModel != null) {
            c56142Ow4.A02(directMessagesInteropOptionsViewModel, str2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C56717PFj(NAF naf, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel) {
        this.A00 = naf;
        this.A01 = directMessagesInteropOptionsViewModel;
    }

    @Override // X.InterfaceC58068Pot
    public final void D20() {
        NAF naf = this.A00;
        NAF.A01(naf);
        NAF.A00(naf);
    }
}
