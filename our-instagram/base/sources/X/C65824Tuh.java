package X;

import com.instagram.user.model.User;

/* renamed from: X.Tuh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65824Tuh implements InterfaceC41501vz {
    public final /* synthetic */ C38P A00;

    public C65824Tuh(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1600338065);
        C70073Cr c70073Cr = (C70073Cr) obj;
        int A0N = AbstractC167017dG.A0N(c70073Cr, 1139675442);
        C65823Tug c65823Tug = this.A00.A06;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        User user = c70073Cr.A00;
        c65823Tug.A07(user, user.CQf());
        C0f9.A0A(-1883049103, A0N);
        C0f9.A0A(1601364964, A03);
    }
}
