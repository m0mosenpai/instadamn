package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import java.util.List;

/* renamed from: X.Aoq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24224Aoq implements BE4 {
    public DeviceConfig A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public String A07;

    @Override // X.BE4
    public final List Epn() {
        return null;
    }

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
    }

    @Override // X.BE4
    public final Bundle BHd() {
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC167007dF.A0o("serviceType", 101), AbstractC166987dD.A1L("trackerPatchSize", this.A05), AbstractC166987dD.A1L("trackerScales", this.A06), AbstractC166987dD.A1L("useSimilarityTracker", this.A03), AbstractC166987dD.A1L("setScaleByARClass", this.A01), AbstractC166987dD.A1L("executionMode", this.A04), AbstractC166987dD.A1L("deviceType", this.A07), AbstractC166987dD.A1L("startPlaneTrackingOnLoad", this.A02));
        A00.putParcelable("deviceConfig", this.A00);
        return A00;
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        C2040490t c2040490t;
        int i;
        if (anonymousClass904 != null && (c2040490t = anonymousClass904.A04) != null) {
            this.A05 = Integer.valueOf(c2040490t.A02);
            this.A06 = Integer.valueOf(c2040490t.A03);
            this.A03 = Boolean.valueOf(c2040490t.A08);
            this.A01 = Boolean.valueOf(c2040490t.A07);
            if (c2040490t.A06.intValue() != 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.A04 = Integer.valueOf(i);
            this.A00 = c2040490t.A04;
            this.A02 = Boolean.valueOf(c2040490t.A01);
            this.A07 = c2040490t.A00;
        }
    }
}
