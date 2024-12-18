package X;

import android.content.Context;
import android.content.Intent;
import java.io.File;

/* renamed from: X.G0s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36323G0s implements InterfaceC69913Ca {
    public final /* synthetic */ C36325G0u A00;
    public final /* synthetic */ ELT A01;

    @Override // X.InterfaceC69913Ca
    public final void CKE(Intent intent) {
        C14360o3.A0B(intent, 0);
        String action = intent.getAction();
        if (action != null) {
            android.net.Uri A0B = AbstractC25227BEk.A0B(action);
            if (A0B.getScheme() == null) {
                A0B = AbstractC25227BEk.A0B(AnonymousClass001.A0R("file://", action));
            }
            new AsyncTaskC31737Dwq(A0B, this.A00, 1).execute(new Void[0]);
        }
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        ELT elt = this.A01;
        Context context = elt.getContext();
        if (context != null && AbstractC86593tX.A0o(context, intent)) {
            C12260kU.A06(elt, intent, i);
        }
    }

    public C36323G0s(C36325G0u c36325G0u, ELT elt) {
        this.A01 = elt;
        this.A00 = c36325G0u;
    }

    @Override // X.InterfaceC69913Ca
    public final void En7(File file, int i) {
        C36325G0u c36325G0u = this.A00;
        Context requireContext = this.A01.requireContext();
        ELT elt = c36325G0u.A02;
        if (elt != null) {
            File A04 = AbstractC13530mf.A04(requireContext);
            c36325G0u.A03 = A04;
            LJR.A03(elt, A04, 2);
        }
    }
}
