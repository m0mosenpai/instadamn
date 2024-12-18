package com.facebook.smartcapture.ui.ig;

import X.AbstractC06930Yk;
import X.AbstractC47139KsY;
import X.AbstractC61600RqP;
import X.C63472SlD;
import X.K5C;
import X.K5R;
import X.K5X;
import X.K5Y;
import android.os.Parcelable;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import java.util.Map;

/* loaded from: classes8.dex */
public class IgSelfieCaptureUi extends AbstractC61600RqP implements SelfieCaptureUi {
    public static final Parcelable.Creator CREATOR = new C63472SlD(IgSelfieCaptureUi.class, 0);

    @Override // com.facebook.smartcapture.ui.SelfieCaptureUi
    public final Class BcX() {
        if (this instanceof XMDSIgSelfieCaptureUi) {
            return K5R.class;
        }
        return K5C.class;
    }

    @Override // com.facebook.smartcapture.ui.SelfieCaptureUi
    public final Class BpE() {
        if (this instanceof XMDSIgSelfieCaptureUi) {
            return K5X.class;
        }
        return K5Y.class;
    }

    @Override // com.facebook.smartcapture.ui.SelfieCaptureUi
    public final Map C2q() {
        if (this instanceof XMDSIgSelfieCaptureUi) {
            return AbstractC47139KsY.A00;
        }
        return AbstractC06930Yk.A0E();
    }
}
