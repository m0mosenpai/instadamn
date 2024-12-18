package X;

import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* loaded from: classes11.dex */
public final class VCE extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelInfoCenterFactShareFragment";
    public RectF A00;
    public RectF A01;
    public InfoCenterFactShareInfoIntf A02;
    public PendingRecipient A03;
    public File A04;
    public final InterfaceC25214BDm A05 = new C23765Afc(this, 8);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(2969);
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(922301527);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = (RectF) requireArguments.getParcelable(AbstractC111324zv.A00(92));
        this.A01 = (RectF) requireArguments.getParcelable(AbstractC111324zv.A00(93));
        String string = requireArguments.getString(AbstractC111324zv.A00(91));
        if (string != null) {
            this.A04 = new File(string);
        }
        this.A02 = (InfoCenterFactShareInfoIntf) requireArguments.getParcelable(AbstractC111324zv.A00(1751));
        this.A03 = (PendingRecipient) requireArguments.getParcelable(AbstractC111324zv.A00(90));
        C0f9.A09(1419237486, A02);
    }

    @Override // X.AbstractC67881V0m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1847166393);
        super.onResume();
        File file = this.A04;
        if (file == null || !file.exists() || this.A02 == null) {
            A3A.A00(this);
        }
        C0f9.A09(-2133543872, A02);
    }
}
