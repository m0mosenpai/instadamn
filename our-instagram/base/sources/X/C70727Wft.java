package X;

import android.view.View;

/* renamed from: X.Wft, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70727Wft implements InterfaceC41501vz, XBF, XBH {
    public final /* synthetic */ C68032V7a A00;

    public C70727Wft(C68032V7a c68032V7a) {
        this.A00 = c68032V7a;
    }

    public static final void A00(C70727Wft c70727Wft) {
        C68032V7a c68032V7a = c70727Wft.A00;
        C67921V2l c67921V2l = c68032V7a.A01;
        if (c67921V2l == null) {
            C14360o3.A0F("locationSearchHistoryAdapter");
            throw C00O.createAndThrow();
        }
        c67921V2l.A00 = C68032V7a.A00(c68032V7a);
        c67921V2l.A00();
    }

    @Override // X.XBF
    public final void CMX(String str) {
        A00(this);
    }

    @Override // X.XBH
    public final void CMr(String str) {
        A00(this);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(2024685567);
        int A032 = C0f9.A03(1582103920);
        A00(this);
        View view = this.A00.A00;
        if (view == null) {
            C14360o3.A0F("clearAllButton");
            throw C00O.createAndThrow();
        }
        view.setVisibility(8);
        C0f9.A0A(889989906, A032);
        C0f9.A0A(-319995867, A03);
    }
}
