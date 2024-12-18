package X;

import java.util.Map;

/* renamed from: X.2F8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2F8 {
    public Long A00;
    public Map A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final C2F1 A05;
    public final C47282Ev A06;
    public final Integer A07;
    public final boolean A08;
    public final C2F7 A09;

    public C2F8(C2F1 c2f1, C47282Ev c47282Ev, C2F7 c2f7, Integer num, Map map, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c47282Ev, 1);
        this.A06 = c47282Ev;
        this.A04 = i;
        this.A09 = c2f7;
        this.A07 = num;
        this.A08 = z;
        this.A00 = null;
        this.A01 = map;
        this.A03 = z2;
        this.A05 = c2f1;
        this.A02 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2F8) {
                C2F8 c2f8 = (C2F8) obj;
                if (!C14360o3.A0K(this.A06, c2f8.A06) || this.A04 != c2f8.A04 || this.A09 != c2f8.A09 || this.A07 != c2f8.A07 || this.A08 != c2f8.A08 || !C14360o3.A0K(this.A00, c2f8.A00) || !C14360o3.A0K(this.A01, c2f8.A01) || this.A03 != c2f8.A03 || !C14360o3.A0K(this.A05, c2f8.A05) || this.A02 != c2f8.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int hashCode2 = ((((this.A06.hashCode() * 31) + this.A04) * 31) + this.A09.hashCode()) * 31;
        int intValue = this.A07.intValue();
        switch (intValue) {
            case 1:
                str = "VIA_BASE_LOGGER";
                break;
            case 2:
                str = "DISABLED";
                break;
            default:
                str = "VIA_QPL";
                break;
        }
        int hashCode3 = (hashCode2 + str.hashCode() + intValue) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = 0;
        int i3 = (hashCode3 + i) * 31 * 31;
        Long l = this.A00;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int hashCode4 = (((i3 + hashCode) * 31) + this.A01.hashCode()) * 31;
        int i4 = 1237;
        if (this.A03) {
            i4 = 1231;
        }
        int i5 = (hashCode4 + i4) * 31;
        C2F1 c2f1 = this.A05;
        if (c2f1 != null) {
            i2 = c2f1.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        int i7 = 1237;
        if (this.A02) {
            i7 = 1231;
        }
        return i6 + i7;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("FOAMessagingPerformanceMarker(identifier=");
        sb.append(this.A06);
        sb.append(", instanceKey=");
        sb.append(this.A04);
        sb.append(", markerType=");
        sb.append(this.A09);
        sb.append(", cancelMarkerIfBackgrounded=");
        switch (this.A07.intValue()) {
            case 1:
                str = "VIA_BASE_LOGGER";
                break;
            case 2:
                str = "DISABLED";
                break;
            default:
                str = "VIA_QPL";
                break;
        }
        sb.append(str);
        sb.append(", backStartOnTouchUp=");
        sb.append(this.A08);
        sb.append(", endPoint=");
        sb.append((String) null);
        sb.append(", startTimestamp=");
        sb.append(this.A00);
        sb.append(", extras=");
        sb.append(this.A01);
        sb.append(", surviveUserSwitch=");
        sb.append(this.A03);
        sb.append(", componentAttributionConfig=");
        sb.append(this.A05);
        sb.append(", enableMsysComponentLogging=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }
}
