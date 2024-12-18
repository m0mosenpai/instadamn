package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.IiZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41942IiZ implements View.OnClickListener {
    public final /* synthetic */ C63972vI A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;

    public ViewOnClickListenerC41942IiZ(C63972vI c63972vI, Object obj, Object obj2) {
        this.A00 = c63972vI;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String obj;
        InterfaceC65282xQ interfaceC65282xQ;
        int A05 = C0f9.A05(-449361029);
        C63972vI c63972vI = this.A00;
        C1121854m c1121854m = (C1121854m) this.A02;
        C5IV c5iv = (C5IV) this.A01;
        boolean A1R = AbstractC167007dF.A1R(0, c1121854m, c5iv);
        c5iv.A08 = false;
        Integer num = c1121854m.A08;
        if (num != null) {
            int intValue = num.intValue();
            InterfaceC65242xM adapter = c63972vI.A03.getAdapter();
            if ((adapter instanceof InterfaceC65282xQ) && (interfaceC65282xQ = (InterfaceC65282xQ) adapter) != null) {
                interfaceC65282xQ.EFR(intValue);
            }
        }
        C101274gj c101274gj = c1121854m.A00;
        String id = c101274gj.getId();
        C101264gi c101264gi = c101274gj.A00;
        Integer num2 = c101264gi.A05;
        if (num2 == null || (obj = num2.toString()) == null) {
            obj = c101274gj.A01.toString();
        }
        String str = c101264gi.A0A;
        C14360o3.A0B(id, 0);
        C14360o3.A0B(obj, A1R ? 1 : 0);
        C64012vM c64012vM = c63972vI.A07;
        AbstractC60672pq abstractC60672pq = c63972vI.A03;
        C14360o3.A0B(abstractC60672pq, 3);
        c64012vM.A05.add(id);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(abstractC60672pq, c64012vM.A02), AbstractC111324zv.A00(1022));
        if (A0f.isSampled()) {
            A0f.AAP("netego_id", id);
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj);
            AbstractC37300Gc1.A0o(A0f, str);
            A0f.Cht();
        }
        C0f9.A0C(-2048584245, A05);
    }
}
