package com.instagram.wellbeing.idverification.fragment;

import X.AbstractC06930Yk;
import X.AbstractC61600RqP;
import X.AbstractC62317S6n;
import X.C63472SlD;
import X.K5B;
import X.K5F;
import X.K5H;
import X.K5R;
import X.K5T;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.smartcapture.ui.IdCaptureUi;
import com.facebook.smartcapture.ui.IgCreditCardUi;
import java.util.Map;

/* loaded from: classes8.dex */
public class IgIdCaptureUi extends AbstractC61600RqP implements IdCaptureUi {
    public static final Parcelable.Creator CREATOR = new C63472SlD(IgIdCaptureUi.class, 0);

    @Override // com.facebook.smartcapture.ui.IdCaptureUi
    public final Class BcX() {
        if (this instanceof XMDSIgIdCaptureUi) {
            return K5R.class;
        }
        if (this instanceof IgCreditCardUi) {
            return K5F.class;
        }
        return K5B.class;
    }

    @Override // com.facebook.smartcapture.ui.IdCaptureUi
    public final Class Bcw() {
        if (this instanceof XMDSIgIdCaptureUi) {
            return K5H.class;
        }
        return K5T.class;
    }

    @Override // com.facebook.smartcapture.ui.IdCaptureUi
    public final Map C2q() {
        if (this instanceof IgCreditCardUi) {
            return AbstractC06930Yk.A0E();
        }
        return AbstractC62317S6n.A00;
    }

    @Override // com.facebook.smartcapture.ui.IdCaptureUi
    public final void AAv(FragmentActivity fragmentActivity) {
        fragmentActivity.getTheme().applyStyle(R.style.IgdsSemanticColors, true);
    }
}
