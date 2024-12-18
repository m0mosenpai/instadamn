package X;

import android.os.Bundle;

/* renamed from: X.PPn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56972PPn implements Runnable {
    public final /* synthetic */ N6L A00;
    public final /* synthetic */ N32 A01;

    public RunnableC56972PPn(N6L n6l, N32 n32) {
        this.A00 = n6l;
        this.A01 = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N6L n6l = this.A00;
        InterfaceC09390do interfaceC09390do = n6l.A0B;
        C1DX A0Z = AbstractC31176DnK.A0Z(interfaceC09390do);
        N32 n32 = this.A01;
        C38321qM c38321qM = n32.A00;
        if (c38321qM != null) {
            String str = null;
            A0Z.A01(c38321qM, true, false).AEH(AbstractC166987dD.A0o(interfaceC09390do));
            C140966Yy A0j = AbstractC25233BEq.A0j(n6l, interfaceC09390do);
            C52141N5q c52141N5q = new C52141N5q();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_MESSAGE", n32.A01);
            A0b.putString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_TITLE", n32.A02);
            N3D n3d = n6l.A01;
            if (n3d != null) {
                str = n3d.A04;
            }
            A0b.putString("ConfirmationFragment.ARGUMENT_KEY_MEDIA_ID", str);
            String str2 = n6l.A05;
            if (str2 == null) {
                C14360o3.A0F("notifSource");
                throw C00O.createAndThrow();
            }
            A0b.putString("ConfirmationFragment.ARGUMENT_KEY_NOTIF_SOURCE", str2);
            A0b.putString("ConfirmationFragment.ARGUMENT_KEY_MEDIA_TYPE", n6l.A04);
            AbstractC31175DnJ.A0v(A0b, c52141N5q, A0j);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
