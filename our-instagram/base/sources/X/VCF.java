package X;

import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* loaded from: classes11.dex */
public final class VCF extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelInfoCenterShareFragment";
    public RectF A00;
    public RectF A01;
    public InfoCenterShareInfoIntf A02;
    public PendingRecipient A03;
    public File A04;
    public final InterfaceC25214BDm A05 = new C23765Afc(this, 9);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(2970);
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(44518247);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = (RectF) requireArguments.getParcelable(AbstractC111324zv.A00(92));
        this.A01 = (RectF) requireArguments.getParcelable(AbstractC111324zv.A00(93));
        String A00 = AbstractC111324zv.A00(91);
        String string = requireArguments.getString(A00);
        AbstractC153636vY.A03(requireArguments, string, A00);
        this.A04 = new File(string);
        this.A02 = (InfoCenterShareInfoIntf) requireArguments.getParcelable(AbstractC111324zv.A00(1752));
        this.A03 = (PendingRecipient) requireArguments.getParcelable(AbstractC111324zv.A00(90));
        C0f9.A09(-137575550, A02);
    }

    @Override // X.AbstractC67881V0m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1566145195);
        super.onResume();
        File file = this.A04;
        if (file == null || !file.exists()) {
            A3A.A00(this);
        }
        C0f9.A09(608322278, A02);
    }
}
