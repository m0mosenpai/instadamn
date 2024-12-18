package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.JxH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45087JxH extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public C45087JxH(String str, String str2, int i, int i2, long j, long j2, boolean z, boolean z2) {
        C14360o3.A0B(str, 2);
        this.A01 = i;
        this.A05 = str;
        this.A03 = j;
        this.A04 = str2;
        this.A00 = i2;
        this.A02 = j2;
        this.A07 = z;
        this.A06 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45087JxH) {
                C45087JxH c45087JxH = (C45087JxH) obj;
                if (this.A01 != c45087JxH.A01 || !C14360o3.A0K(this.A05, c45087JxH.A05) || this.A03 != c45087JxH.A03 || !C14360o3.A0K(this.A04, c45087JxH.A04) || this.A00 != c45087JxH.A00 || this.A02 != c45087JxH.A02 || this.A07 != c45087JxH.A07 || this.A06 != c45087JxH.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A07(this.A02, (((AbstractC167007dF.A07(this.A03, AbstractC166997dE.A0K(this.A05, this.A01 * 31)) + AbstractC167017dG.A0O(this.A04)) * 31) + this.A00) * 31)));
    }

    public final String toString() {
        JSR A00 = JSS.A00(this);
        A00.A02(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A01);
        A00.A01(this.A05, "userId");
        A00.A03("participantUserId", this.A03);
        A00.A01(this.A04, "deviceName");
        A00.A02("deviceChangeType", this.A00);
        A00.A03("deviceChangeTimestampMs", this.A02);
        A00.A04("shouldDisplayDeviceChangeAdminMessage", this.A07);
        A00.A04("isInteropParticipant", this.A06);
        return AbstractC166987dD.A19(A00);
    }
}
