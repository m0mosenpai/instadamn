package X;

import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* loaded from: classes11.dex */
public final class VCD extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelVotingShareFragment";
    public RectF A00;
    public RectF A01;
    public PendingRecipient A02;
    public File A03;
    public final InterfaceC25214BDm A04 = new C23765Afc(this, 14);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(2991);
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2103484699);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = (RectF) requireArguments.getParcelable(AbstractC111324zv.A00(92));
        this.A01 = (RectF) requireArguments.getParcelable(AbstractC111324zv.A00(93));
        String string = requireArguments.getString(AbstractC111324zv.A00(91));
        if (string != null) {
            this.A03 = new File(string);
            this.A02 = (PendingRecipient) requireArguments.getParcelable(AbstractC111324zv.A00(90));
            C0f9.A09(-1762615566, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(624399825, A02);
            throw A0g;
        }
    }

    @Override // X.AbstractC67881V0m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(682511445);
        super.onResume();
        File file = this.A03;
        if (file == null || !file.exists()) {
            A3A.A00(this);
        }
        C0f9.A09(-1132333968, A02);
    }
}
