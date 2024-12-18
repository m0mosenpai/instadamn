package X;

import java.util.Map;

/* renamed from: X.9BQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BQ extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public C9BQ(int i, Integer num, int i2, int i3) {
        this.A00 = 2;
        C14360o3.A0B(num, 2);
        this.A01 = i;
        this.A03 = num;
        this.A02 = i2;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    if (obj instanceof C9BQ) {
                        C9BQ c9bq = (C9BQ) obj;
                        if (c9bq.A00 != 2 || this.A01 != c9bq.A01 || this.A03 != c9bq.A03 || this.A02 != c9bq.A02) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
        if (obj instanceof C9BQ) {
            C9BQ c9bq2 = (C9BQ) obj;
            if (c9bq2.A00 != i || this.A01 != c9bq2.A01 || this.A02 != c9bq2.A02 || this.A03 != c9bq2.A03) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int i;
        int intValue;
        String str;
        int hashCode;
        String str2;
        switch (this.A00) {
            case 0:
                i = ((this.A01 * 31) + this.A02) * 31;
                intValue = ((Number) this.A03).intValue();
                if (1 != intValue) {
                    str = "CURRENT";
                } else {
                    str = "DURATION";
                }
                hashCode = str.hashCode() + intValue;
                return i + hashCode;
            case 1:
                i = ((this.A01 * 31) + this.A02) * 31;
                intValue = ((Number) this.A03).intValue();
                if (1 != intValue) {
                    str = "INBOX";
                } else {
                    str = "THREAD_VIEW";
                }
                hashCode = str.hashCode() + intValue;
                return i + hashCode;
            case 2:
                int i2 = this.A01 * 31;
                int intValue2 = ((Number) this.A03).intValue();
                switch (intValue2) {
                    case 1:
                        str2 = "HIGH";
                        break;
                    case 2:
                        str2 = "NORMAL";
                        break;
                    case 3:
                        str2 = "LOW";
                        break;
                    default:
                        str2 = MSV.A00(321);
                        break;
                }
                i = (i2 + str2.hashCode() + intValue2) * 31;
                hashCode = this.A02;
                return i + hashCode;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A00) {
            case 0:
                sb = new StringBuilder();
                sb.append("ClipsTimelineEditorTimeViewState(currentTime=");
                sb.append(this.A01);
                sb.append(MSV.A00(37));
                sb.append(this.A02);
                sb.append(", activeTimeEntry=");
                Number number = (Number) this.A03;
                if (number != null) {
                    if (1 - number.intValue() != 0) {
                        str = "CURRENT";
                    } else {
                        str = "DURATION";
                    }
                } else {
                    str = "null";
                }
                sb.append(str);
                break;
            case 1:
            case 2:
            default:
                return super.toString();
            case 3:
                sb = new StringBuilder();
                sb.append("SignalsMetadataInPayload(signalsCount=");
                sb.append(this.A01);
                sb.append(", signalCountMap=");
                sb.append(this.A03);
                sb.append(", signalsSizeInBytes=");
                sb.append(this.A02);
                break;
        }
        sb.append(')');
        return sb.toString();
    }

    public C9BQ(Integer num, int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = num;
    }

    public C9BQ(int i, int i2, Map map) {
        this.A00 = 3;
        this.A01 = i;
        this.A03 = map;
        this.A02 = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9BQ(Integer num, int i, int i2) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? C05F.A0N : num, 0, 2);
        this.A00 = 2;
    }
}
