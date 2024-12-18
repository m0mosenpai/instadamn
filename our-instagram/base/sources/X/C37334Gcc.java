package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Gcc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37334Gcc implements InterfaceC41501vz {
    public final /* synthetic */ C141956bE A00;

    public C37334Gcc(C141956bE c141956bE) {
        this.A00 = c141956bE;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(930261663);
        int A032 = C0f9.A03(-1972852903);
        C141956bE c141956bE = this.A00;
        Fragment fragment = (Fragment) c141956bE.A08.get();
        if (fragment != null && fragment.getContext() != null) {
            if (c141956bE.A00 == null) {
                AbstractC31171DnF.A0y();
                throw C00O.createAndThrow();
            }
            throw AbstractC166987dD.A15("getArchivePendingUpload");
        }
        C0f9.A0A(397184172, A032);
        C0f9.A0A(-1464654058, A03);
    }
}
