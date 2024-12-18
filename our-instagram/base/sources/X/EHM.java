package X;

import android.app.Dialog;
import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes6.dex */
public final class EHM extends AbstractC72473Mu {
    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        C193328hC A0P = AbstractC31180DnO.A0P(this);
        A0P.A05 = requireArguments().getString(DialogModule.KEY_TITLE);
        A0P.A0r(requireArguments().getString("body"));
        A0P.A0F(new DialogInterfaceOnClickListenerC35301Fha(15));
        return A0P.A02();
    }
}
