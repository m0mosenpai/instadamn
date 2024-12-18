package X;

import android.app.Dialog;

/* renamed from: X.8Kg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C185408Kg implements InterfaceC14180ni, InterfaceC58362lv {
    public final /* synthetic */ C8JT A00;

    public C185408Kg(C8JT c8jt) {
        this.A00 = c8jt;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC58362lv) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C8JT.class, "showFailedToSaveDraftDialog", "showFailedToSaveDraftDialog(Lcom/instagram/creation/capture/quickcapture/sundial/viewmodel/drafts/models/ClipsDraft;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C128175qm c128175qm = (C128175qm) obj;
        C14360o3.A0B(c128175qm, 0);
        C8JT c8jt = this.A00;
        C8JT.A0c(c8jt);
        boolean z = false;
        if (c128175qm.A0F.A01 != -1) {
            z = true;
        }
        DialogInterfaceOnDismissListenerC23177AOq dialogInterfaceOnDismissListenerC23177AOq = new DialogInterfaceOnDismissListenerC23177AOq(c8jt);
        c8jt.A0d = true;
        AbstractC59962oe abstractC59962oe = c8jt.A1B;
        C193328hC A00 = AbstractC54025Nub.A00(abstractC59962oe.requireActivity(), A0K.A00(z));
        A00.A0g(dialogInterfaceOnDismissListenerC23177AOq);
        Dialog A02 = A00.A02();
        c8jt.A04 = A02;
        if (A02 != null) {
            C0fJ.A00(A02);
        }
        c8jt.A1s.A0D(abstractC59962oe.requireActivity(), c8jt.A16, new C57523Pfx(c8jt, 5));
    }
}
