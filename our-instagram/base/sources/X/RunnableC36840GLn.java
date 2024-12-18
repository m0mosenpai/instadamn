package X;

import android.os.Bundle;

/* renamed from: X.GLn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36840GLn implements Runnable {
    public final /* synthetic */ C33230ElN A00;

    public RunnableC36840GLn(C33230ElN c33230ElN) {
        this.A00 = c33230ElN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FRQ A00 = AbstractC35179FfW.A00();
        C33230ElN c33230ElN = this.A00;
        Bundle bundle = c33230ElN.A00;
        if (bundle == null) {
            C14360o3.A0F("twoFacResponseBundle");
            throw C00O.createAndThrow();
        }
        AbstractC31179DnN.A0y(A00.A00(bundle.getStringArrayList("backup_codes"), c33230ElN.A01), c33230ElN.requireActivity(), c33230ElN.A05);
    }
}
