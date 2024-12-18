package X;

import android.os.Bundle;

/* renamed from: X.3Mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72473Mu extends AbstractC72483Mv {
    @Override // X.AbstractC72483Mv
    public final int A0G(AbstractC016706m abstractC016706m, String str, boolean z) {
        C0K8.A0H("IgDialogFragment", "Showing Dialog", new Throwable());
        return super.A0G(abstractC016706m, str, true);
    }

    public final void A0L(AbstractC10360h2 abstractC10360h2, String str) {
        if (!abstractC10360h2.A0G) {
            A0G(new C14240no(abstractC10360h2), str, true);
        }
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
    }
}
