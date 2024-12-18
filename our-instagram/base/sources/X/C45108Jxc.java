package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;

/* renamed from: X.Jxc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45108Jxc extends C0T6 {
    public Double A00;
    public Double A01;
    public Long A02;
    public boolean A03;
    public Long A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final int A0C;

    public C45108Jxc(Double d, Double d2, Long l, Long l2, String str, String str2, String str3, String str4, int i, int i2, int i3, long j, boolean z) {
        C14360o3.A0B(str, 1);
        this.A08 = str;
        this.A07 = j;
        this.A0C = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A00 = d;
        this.A01 = d2;
        this.A03 = z;
        this.A02 = l;
        this.A04 = l2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(14:5|6|(1:8)(1:33)|9|10|11|(1:(1:14)(1:29))(1:30)|15|(2:17|(1:19))(1:28)|20|21|(1:23)|24|25)(1:34))(1:36)|35|6|(0)(0)|9|10|11|(0)(0)|15|(0)(0)|20|21|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0104, code lost:
    
        r1 = new X.C09540e5(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5HW A01(com.instagram.common.session.UserSession r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45108Jxc.A01(com.instagram.common.session.UserSession):X.5HW");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45108Jxc) {
                C45108Jxc c45108Jxc = (C45108Jxc) obj;
                if (!C14360o3.A0K(this.A08, c45108Jxc.A08) || this.A07 != c45108Jxc.A07 || this.A0C != c45108Jxc.A0C || this.A05 != c45108Jxc.A05 || this.A06 != c45108Jxc.A06 || !C14360o3.A0K(this.A09, c45108Jxc.A09) || !C14360o3.A0K(this.A0A, c45108Jxc.A0A) || !C14360o3.A0K(this.A0B, c45108Jxc.A0B) || !C14360o3.A0K(this.A00, c45108Jxc.A00) || !C14360o3.A0K(this.A01, c45108Jxc.A01) || this.A03 != c45108Jxc.A03 || !C14360o3.A0K(this.A02, c45108Jxc.A02) || !C14360o3.A0K(this.A04, c45108Jxc.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    private final String A00() {
        String string;
        int i = this.A05;
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            String str = this.A09;
            String str2 = this.A0A;
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            if (str != null) {
                if (str2 != null) {
                    string = AbstractC31174DnI.A0t(context, str2, str, 2131975042);
                } else {
                    string = AbstractC167007dF.A0f(context, str, 2131973152);
                }
            } else if (str2 != null) {
                string = AbstractC167007dF.A0f(context, str2, 2131975043);
            } else {
                string = context.getString(2131973149);
            }
        } else {
            String str3 = this.A0A;
            Context context2 = AbstractC12290kX.A00;
            C14360o3.A07(context2);
            if (str3 != null) {
                string = AbstractC167007dF.A0f(context2, str3, 2131964720);
            } else {
                string = context2.getString(2131964721);
            }
        }
        C14360o3.A0A(string);
        return string;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A03, (((((((((((((((AbstractC25236BEt.A01(this.A07, AbstractC166987dD.A0J(this.A08)) + this.A0C) * 31) + this.A05) * 31) + this.A06) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public final String toString() {
        int i;
        String str;
        String A07;
        JSR A00 = JSS.A00(this);
        A00.A01(this.A08, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        A00.A03("createdTimestampMs", this.A07);
        A00.A02("cryptoMailboxType", this.A0C);
        int i2 = this.A05;
        A00.A02("deviceChangeType", i2);
        int i3 = this.A06;
        A00.A02("deviceId", i3);
        A00.A01(this.A09, "location");
        A00.A01(this.A0A, "model");
        A00.A01(this.A0B, "platform");
        A00.A01(this.A00, Location.LATITUDE);
        A00.A01(this.A01, "longitude");
        A00.A04("isConfirmed", this.A03);
        A00.A01(this.A02, "firstReadTimestampMs");
        A00.A01(this.A04, "activityFeedReadTimestampMs");
        A00.A01(A00(), "label");
        if (i2 != 1) {
            i = 1519;
            if (i2 != 2) {
                i = 0;
            }
        } else {
            i = 1520;
        }
        A00.A02("notificationType", i);
        if (i2 != 1) {
            if (i2 != 2) {
                str = "unknown";
            } else {
                str = "local_login_security_alert";
            }
        } else {
            str = "local_key_change_security_alert";
        }
        A00.A01(str, "notificationName");
        if (i2 != 1) {
            if (i2 != 2) {
                A07 = "";
            } else {
                A07 = "security_alert_login_activity";
            }
        } else {
            A07 = AnonymousClass001.A07(i3, "ig://", "security_alert_key_details", "?deviceId=");
        }
        A00.A01(A07, "notificationDestination");
        return AbstractC166987dD.A19(A00);
    }
}
