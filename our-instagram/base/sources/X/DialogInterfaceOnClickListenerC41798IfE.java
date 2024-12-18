package X;

import android.content.DialogInterface;

/* renamed from: X.IfE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41798IfE implements DialogInterface.OnClickListener {
    public final /* synthetic */ C3MB A00;
    public final /* synthetic */ C69703Be A01;

    public DialogInterfaceOnClickListenerC41798IfE(C3MB c3mb, C69703Be c69703Be) {
        this.A00 = c3mb;
        this.A01 = c69703Be;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C65192xH c65192xH;
        C3MB c3mb = this.A00;
        C38321qM c38321qM = c3mb.A01;
        C69703Be c69703Be = this.A01;
        AbstractC60672pq abstractC60672pq = (AbstractC60672pq) c69703Be.A0b.get();
        if (abstractC60672pq != null && (c65192xH = (C65192xH) abstractC60672pq.getAdapter()) != null) {
            C75113Zb BRZ = c65192xH.BRZ(c38321qM);
            String str = c3mb.A00.A0e;
            C14360o3.A0B(str, 0);
            BRZ.A1I = str;
            C63352uI c63352uI = c69703Be.A0V;
            String id = c38321qM.getId();
            if (id != null) {
                c63352uI.DMD(BRZ, id);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
