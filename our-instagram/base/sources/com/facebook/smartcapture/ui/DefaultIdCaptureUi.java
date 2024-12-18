package com.facebook.smartcapture.ui;

import X.AbstractC61600RqP;
import X.AbstractC62317S6n;
import X.C63472SlD;
import X.K5A;
import X.K5E;
import X.K5S;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;

/* loaded from: classes8.dex */
public class DefaultIdCaptureUi extends AbstractC61600RqP implements IdCaptureUi {
    public static final Parcelable.Creator CREATOR = new C63472SlD(DefaultIdCaptureUi.class, 0);

    @Override // com.facebook.smartcapture.ui.IdCaptureUi
    public final void AAv(FragmentActivity fragmentActivity) {
    }

    @Override // com.facebook.smartcapture.ui.IdCaptureUi
    public final Class BcX() {
        if (this instanceof FbCreditCardUi) {
            return K5E.class;
        }
        return K5A.class;
    }

    @Override // com.facebook.smartcapture.ui.IdCaptureUi
    public final Class Bcw() {
        return K5S.class;
    }

    @Override // com.facebook.smartcapture.ui.IdCaptureUi
    public final Map C2q() {
        return AbstractC62317S6n.A00;
    }
}
