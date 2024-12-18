package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;

/* renamed from: X.JxL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45091JxL extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Double A03;
    public final Double A04;
    public final Long A05;
    public final Long A06;
    public final Long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45091JxL) {
                C45091JxL c45091JxL = (C45091JxL) obj;
                if (!C14360o3.A0K(this.A08, c45091JxL.A08) || !C14360o3.A0K(this.A0C, c45091JxL.A0C) || this.A00 != c45091JxL.A00 || this.A01 != c45091JxL.A01 || this.A02 != c45091JxL.A02 || !C14360o3.A0K(this.A06, c45091JxL.A06) || !C14360o3.A0K(this.A07, c45091JxL.A07) || !C14360o3.A0K(this.A0A, c45091JxL.A0A) || !C14360o3.A0K(this.A0B, c45091JxL.A0B) || !C14360o3.A0K(this.A09, c45091JxL.A09) || !C14360o3.A0K(this.A05, c45091JxL.A05) || !C14360o3.A0K(this.A03, c45091JxL.A03) || !C14360o3.A0K(this.A04, c45091JxL.A04) || this.A0D != c45091JxL.A0D) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0D, (((((((((((((((((((((AbstractC166997dE.A0K(this.A0C, AbstractC166987dD.A0J(this.A08)) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31);
    }

    public C45091JxL(Double d, Double d2, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        this.A08 = str;
        this.A0C = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A06 = l;
        this.A07 = l2;
        this.A0A = str3;
        this.A0B = str4;
        this.A09 = str5;
        this.A05 = l3;
        this.A03 = d;
        this.A04 = d2;
        this.A0D = z;
    }

    public final String toString() {
        JSR A00 = JSS.A00(this);
        A00.A01(this.A08, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        A00.A01(this.A0C, "userId");
        A00.A02("cryptoMailboxType", this.A00);
        A00.A02("deviceChangeType", this.A01);
        A00.A02("deviceId", this.A02);
        A00.A01(this.A06, "createdTimestampMs");
        A00.A01(this.A07, "firstReadTimestampMs");
        A00.A01(this.A0A, "model");
        A00.A01(this.A0B, "platform");
        A00.A01(this.A09, "location");
        A00.A01(this.A05, "activityFeedReadTimestampMs");
        A00.A01(this.A03, Location.LATITUDE);
        A00.A01(this.A04, "longitude");
        A00.A04("isConfirmed", this.A0D);
        return AbstractC166987dD.A19(A00);
    }
}
