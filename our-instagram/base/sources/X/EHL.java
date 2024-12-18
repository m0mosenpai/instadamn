package X;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class EHL extends AbstractC72473Mu {
    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        Bundle requireArguments = requireArguments();
        Object value = AbstractC60492pY.A01(this).getValue();
        String string = requireArguments.getString(AbstractC111324zv.A00(2380));
        String string2 = requireArguments.getString(AbstractC111324zv.A00(2382));
        String string3 = requireArguments.getString(AbstractC111324zv.A00(2383));
        String string4 = requireArguments.getString(AbstractC111324zv.A00(2378));
        String string5 = requireArguments.getString(AbstractC111324zv.A00(2377));
        String string6 = requireArguments.getString(AbstractC111324zv.A00(2379));
        C193328hC A0P = AbstractC31180DnO.A0P(this);
        A0P.A0r(string);
        if (string2 != null) {
            A0P.A05 = string2;
        }
        if (string3 != null && string3.length() != 0 && string4 != null && string4.length() != 0) {
            A0P.A0d(new DialogInterfaceOnClickListenerC35363Fie(value, this, string5, string4, string3, 2), string4);
        }
        if (string6 == null || string6.length() == 0) {
            string6 = getString(2131960994);
        }
        C14360o3.A0A(string6);
        A0P.A0c(null, string6);
        return A0P.A02();
    }
}
