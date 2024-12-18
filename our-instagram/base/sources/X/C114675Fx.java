package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5Fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114675Fx extends C0T6 {
    public static final C114675Fx A0F;
    public static final C114675Fx A0G;
    public static final C114675Fx A0H;
    public static final C114675Fx A0I;
    public static final C114675Fx A0J;
    public static final C114675Fx A0K;
    public static final C114675Fx A0L;
    public static final C114675Fx A0M;
    public static final C114675Fx A0N;
    public static final C114675Fx A0O;
    public static final C114675Fx A0P;
    public static final C114675Fx A0Q;
    public static final C114675Fx A0R;
    public static final C114675Fx A0S;
    public static final C114675Fx A0T;
    public static final C114675Fx A0U;
    public static final C114675Fx A0V;
    public static final C114675Fx A0W;
    public static final C114675Fx A0X;
    public static final C114675Fx A0Y;
    public static final C114675Fx A0Z;
    public static final C114675Fx A0a;
    public static final C114675Fx A0b;
    public static final C114675Fx A0c;
    public EnumC81843l3 A00;
    public EnumC46247KdO A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public Map A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public C114675Fx(EnumC81843l3 enumC81843l3, EnumC46247KdO enumC46247KdO, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(enumC46247KdO, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(map, 14);
        this.A01 = enumC46247KdO;
        this.A03 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A0C = z;
        this.A0D = z2;
        this.A07 = str4;
        this.A04 = str5;
        this.A02 = str6;
        this.A0B = z3;
        this.A00 = enumC81843l3;
        this.A0A = z4;
        this.A09 = z5;
        this.A08 = map;
        this.A0E = z6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114675Fx) {
                C114675Fx c114675Fx = (C114675Fx) obj;
                if (this.A01 != c114675Fx.A01 || !C14360o3.A0K(this.A03, c114675Fx.A03) || !C14360o3.A0K(this.A06, c114675Fx.A06) || !C14360o3.A0K(this.A05, c114675Fx.A05) || this.A0C != c114675Fx.A0C || this.A0D != c114675Fx.A0D || !C14360o3.A0K(this.A07, c114675Fx.A07) || !C14360o3.A0K(this.A04, c114675Fx.A04) || !C14360o3.A0K(this.A02, c114675Fx.A02) || this.A0B != c114675Fx.A0B || this.A00 != c114675Fx.A00 || this.A0A != c114675Fx.A0A || this.A09 != c114675Fx.A09 || !C14360o3.A0K(this.A08, c114675Fx.A08) || this.A0E != c114675Fx.A0E) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SendError(failureDomain=");
        sb.append(this.A01);
        sb.append(", errorCode=");
        sb.append(this.A03);
        sb.append(", serverErrorCode=");
        sb.append(this.A06);
        sb.append(", sendAttemptChannel=");
        sb.append(this.A05);
        sb.append(", shouldAllowAutomaticRetry=");
        sb.append(this.A0C);
        sb.append(", shouldAllowManualRetry=");
        sb.append(this.A0D);
        sb.append(MSV.A00(298));
        sb.append(this.A07);
        sb.append(AbstractC58317Pt9.A00(59));
        sb.append(this.A04);
        sb.append(", clientFacingErrorMessage=");
        sb.append(this.A02);
        sb.append(", isEpdError=");
        sb.append(this.A0B);
        sb.append(", throttlingType=");
        sb.append(this.A00);
        sb.append(", canSeeNotes=");
        sb.append(this.A0A);
        sb.append(", canSeeBroadcastChats=");
        sb.append(this.A09);
        sb.append(", mediaIdsToInterventionType=");
        sb.append(this.A08);
        sb.append(", shouldAutomaticRetryImmediately=");
        sb.append(this.A0E);
        sb.append(')');
        return sb.toString();
    }

    static {
        EnumC46247KdO enumC46247KdO = EnumC46247KdO.A0C;
        A0W = new C114675Fx(enumC46247KdO, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "na", "not an error", true, true);
        A0R = new C114675Fx(enumC46247KdO, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "http", "client network", true, true);
        A0U = new C114675Fx(enumC46247KdO, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "mqtt", "client network", false, true);
        A0X = new C114675Fx(enumC46247KdO, "2", "http", "no network detected", true, true);
        A0V = new C114675Fx(enumC46247KdO, "3", "mqtt", "mqtt timeout", true, true);
        A0Q = new C114675Fx(enumC46247KdO, "4", "na", "file not found", false, false);
        A0c = new C114675Fx(enumC46247KdO, "0", "na", "unknown retry failure", false, false);
        A0J = new C114675Fx(EnumC46247KdO.A09, "23", "na", "Not able to translate igid to fbid for receiver during MEM send", false, false);
        A0O = new C114675Fx(enumC46247KdO, "3", "ae", "armadillo express mailbox timeout", true, true);
        A0L = new C114675Fx(enumC46247KdO, "9", "ae", "Send disabled - outdated app version", false, false);
        A0K = new C114675Fx(enumC46247KdO, "9", "ae", "Send disabled - malformed receiver fetch params", false, false);
        A0a = new C114675Fx(EnumC46247KdO.A0F, "10", "http", "TTL exceeded for resolving thread metadata", false, false);
        EnumC46247KdO enumC46247KdO2 = EnumC46247KdO.A05;
        A0N = new C114675Fx(enumC46247KdO2, "9", "ae", "Send disabled - invalid ephemerality params", false, false);
        A0M = new C114675Fx(enumC46247KdO2, "9", "ae", "Send disabled - deprecated client version for DM", false, false);
        A0Y = new C114675Fx(enumC46247KdO, "11", "http", "Attempted to send an open message to a cutover thread", false, false);
        A0Z = new C114675Fx(enumC46247KdO, "13", "ae", "Attempted to send a cutover message to an open thread", false, false);
        A0b = new C114675Fx(enumC46247KdO, "30", "ae", "Unknown ACT Login State.", false, false);
        A0S = new C114675Fx(enumC46247KdO, "31", "ae", "Invalid ACT Login State.", false, false);
        A0G = new C114675Fx(enumC46247KdO, "32", "ae", "ACT Login has not started.", true, false);
        A0F = new C114675Fx(enumC46247KdO, "33", "ae", "ACT Login never started.", false, false);
        A0H = new C114675Fx(enumC46247KdO, "34", "ae", "Waiting on ACT Login.", true, false);
        A0I = new C114675Fx(enumC46247KdO, "35", "ae", "ACT Login timeout.", false, false);
        A0T = new C114675Fx(enumC46247KdO, "40", "ae", "Invalid UserSession for Instamadillo send.", true, true);
        A0P = new C114675Fx(enumC46247KdO, "40", "ae", "Skip background UserSession for Instamadillo send.", true, true);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((this.A01.hashCode() * 31) + this.A03.hashCode()) * 31;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.A05.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0C) {
            i2 = 1231;
        }
        int i3 = (hashCode6 + i2) * 31;
        int i4 = 1237;
        if (this.A0D) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        String str2 = this.A07;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str3 = this.A04;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        String str4 = this.A02;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        int i9 = 1237;
        if (this.A0B) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        EnumC81843l3 enumC81843l3 = this.A00;
        if (enumC81843l3 != null) {
            i = enumC81843l3.hashCode();
        }
        int i11 = (i10 + i) * 31;
        int i12 = 1237;
        if (this.A0A) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A09) {
            i14 = 1231;
        }
        int hashCode7 = (((i13 + i14) * 31) + this.A08.hashCode()) * 31;
        int i15 = 1237;
        if (this.A0E) {
            i15 = 1231;
        }
        return hashCode7 + i15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C114675Fx(EnumC46247KdO enumC46247KdO, String str, String str2, String str3, boolean z, boolean z2) {
        this(null, enumC46247KdO, str, null, str2, null, str3, null, new LinkedHashMap(), z, z2, false, false, false, false);
        C14360o3.A0B(str, 2);
    }
}
