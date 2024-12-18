package X;

import android.media.MediaMetadataRetriever;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Swp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63964Swp implements BD8 {
    public final /* synthetic */ SN3 A00;

    @Override // X.BD8
    public final void DdW(Exception exc) {
        C14360o3.A0B(exc, 0);
        SNY sny = this.A00.A02;
        if (sny != null) {
            sny.A01(exc);
        }
    }

    @Override // X.BD8
    public final void DdY(ACI aci) {
    }

    public C63964Swp(SN3 sn3) {
        this.A00 = sn3;
    }

    @Override // X.BD8
    public final void DdV(ACI aci) {
        String str;
        String str2;
        String str3;
        String str4;
        SN3 sn3 = this.A00;
        if (sn3.A02 != null) {
            String str5 = sn3.A0D;
            String str6 = sn3.A0E;
            ImmutableList immutableList = sn3.A03;
            Long l = null;
            if (str6 != null) {
                long A06 = MSY.A06(str6);
                Long valueOf = Long.valueOf(A06);
                if (A06 > 0) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str6);
                    str2 = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str4 = mediaMetadataRetriever.extractMetadata(20);
                    str = mediaMetadataRetriever.extractMetadata(9);
                    l = valueOf;
                } else {
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    l = valueOf;
                    str = null;
                }
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            Integer num = null;
            if (str2 != null) {
                try {
                    num = AbstractC58319PtB.A0m(str2);
                } catch (NumberFormatException unused) {
                }
            }
            Integer num2 = null;
            if (str3 != null) {
                try {
                    num2 = AbstractC58319PtB.A0m(str3);
                } catch (NumberFormatException unused2) {
                }
            }
            Integer num3 = null;
            if (str4 != null) {
                try {
                    num3 = AbstractC58319PtB.A0m(str4);
                } catch (NumberFormatException unused3) {
                }
            }
            Float f = null;
            if (str != null) {
                try {
                    f = Float.valueOf(Float.parseFloat(str) * 0.001f);
                } catch (NumberFormatException unused4) {
                }
            }
            sn3.A01 = new SelfieEvidence(immutableList, f, num3, num2, num, l, str5, str6);
            SNY sny = sn3.A02;
            C14360o3.A0A(sny);
            SelfieEvidence selfieEvidence = sn3.A01;
            C14360o3.A0A(selfieEvidence);
            sny.A00(selfieEvidence);
        }
    }
}
