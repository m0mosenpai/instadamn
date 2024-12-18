package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class GJq implements InterfaceC42241xE {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C7IR A01;

    public GJq(Context context, C7IR c7ir) {
        this.A01 = c7ir;
        this.A00 = context;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
        if (interfaceC132965zL instanceof C48496Lcn) {
            C0w9.A07("DirectSendController_sendMediaForSharedAlbum", (Throwable) AbstractC132975zM.A00(interfaceC132965zL));
            this.A01.A06.invoke();
        } else {
            C146106i8 A0K = AbstractC31171DnF.A0K();
            AbstractC25226BEj.A1N(this.A00, A0K, 2131973834);
            A0K.A06();
            AbstractC25233BEq.A1F(A0K);
        }
    }
}
