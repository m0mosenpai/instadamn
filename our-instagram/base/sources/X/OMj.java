package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashSet;

/* loaded from: classes9.dex */
public final class OMj {
    public AnonymousClass195 A00;
    public boolean A01;
    public final C57312k6 A02;
    public final C006802i A03;
    public final HashSet A04;

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        int hashCode = str.hashCode();
        HashSet hashSet = this.A04;
        Integer valueOf = Integer.valueOf(hashCode);
        if (!hashSet.contains(valueOf)) {
            hashSet.add(valueOf);
            this.A03.markerStart(18953813, hashCode);
        }
    }

    public final void A05(String str, Integer num) {
        String str2;
        int hashCode = str.hashCode();
        HashSet hashSet = this.A04;
        Integer valueOf = Integer.valueOf(hashCode);
        if (hashSet.contains(valueOf)) {
            C006802i c006802i = this.A03;
            if (num.intValue() != 0) {
                str2 = "no_media";
            } else {
                str2 = "network";
            }
            c006802i.markerAnnotate(18953813, hashCode, TraceFieldType.FailureReason, str2);
            c006802i.markerEnd(18953813, hashCode, (short) 3);
            hashSet.remove(valueOf);
        }
    }

    public final void A00() {
        if (this.A01) {
            MSY.A1D(this.A03, TraceFieldType.FailureReason, PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, 18945137);
            this.A00 = MSY.A0r(this.A00);
            this.A01 = false;
        }
    }

    public OMj(C57312k6 c57312k6, C006802i c006802i) {
        AbstractC167017dG.A1P(c006802i, c57312k6);
        this.A03 = c006802i;
        this.A02 = c57312k6;
        this.A04 = AbstractC166987dD.A1H();
    }

    public final void A01(String str) {
        int hashCode = str.hashCode();
        HashSet hashSet = this.A04;
        Integer valueOf = Integer.valueOf(hashCode);
        if (hashSet.contains(valueOf)) {
            this.A03.markerEnd(18953813, hashCode, (short) 2);
            hashSet.remove(valueOf);
        }
    }

    public final void A02(String str) {
        int hashCode = str.hashCode();
        if (this.A04.contains(Integer.valueOf(hashCode))) {
            this.A03.markerPoint(18953813, hashCode, "fetch_end");
        }
    }

    public final void A03(String str) {
        int hashCode = str.hashCode();
        if (this.A04.contains(Integer.valueOf(hashCode))) {
            this.A03.markerPoint(18953813, hashCode, "fetch_start");
        }
    }
}
