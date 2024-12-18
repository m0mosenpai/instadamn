package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class Y4A {
    public static Map A04 = AbstractC166987dD.A1G();
    public static final Y4A A05;
    public static final Y4A A06;
    public static final Y4A A07;
    public static final Y4A A08;
    public static final Y4A A09;
    public static final Y4A A0A;
    public static final Y4A A0B;
    public static final Y4A A0C;
    public static final Y4A A0D;
    public final int A00;
    public final EnumC72354Xbq A01;
    public final EnumC72367Xc3 A02;
    public final EnumSet A03;

    public final Y4A A02(EnumC72354Xbq enumC72354Xbq) {
        if (this.A01 == enumC72354Xbq) {
            return this;
        }
        EnumSet enumSet = this.A03;
        if (enumSet.contains(enumC72354Xbq)) {
            return new XZ6(enumC72354Xbq, this, this.A02, enumSet, this.A00);
        }
        throw AbstractC166987dD.A12(String.format("The ASN.1 tag %s does not support encoding as %s", this, enumC72354Xbq));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Y4A y4a = (Y4A) obj;
            if (this.A00 != y4a.A00 || this.A02 != y4a.A02 || this.A01 != y4a.A01) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.XfJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.XfJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.XfJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.XfJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.XfJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.XfJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.XfJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.XfJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.XfJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.XfJ, java.lang.Object] */
    public final AbstractC72504XfJ A01(C72860XpM c72860XpM) {
        if (this instanceof XM7) {
            switch (((XM7) this).A00) {
                case 0:
                    ?? obj = new Object();
                    obj.A00 = c72860XpM;
                    return obj;
                case 1:
                    ?? obj2 = new Object();
                    obj2.A00 = c72860XpM;
                    return obj2;
                case 2:
                    ?? obj3 = new Object();
                    obj3.A00 = c72860XpM;
                    return obj3;
                case 3:
                    ?? obj4 = new Object();
                    obj4.A00 = c72860XpM;
                    return obj4;
                case 4:
                    ?? obj5 = new Object();
                    obj5.A00 = c72860XpM;
                    return obj5;
                case 5:
                    ?? obj6 = new Object();
                    obj6.A00 = c72860XpM;
                    return obj6;
                case 6:
                    ?? obj7 = new Object();
                    obj7.A00 = c72860XpM;
                    return obj7;
                case 7:
                    ?? obj8 = new Object();
                    obj8.A00 = c72860XpM;
                    return obj8;
                case 8:
                    ?? obj9 = new Object();
                    obj9.A00 = c72860XpM;
                    return obj9;
                default:
                    ?? obj10 = new Object();
                    obj10.A00 = c72860XpM;
                    return obj10;
            }
        }
        return ((XZ6) this).A00.A01(c72860XpM);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Integer.valueOf(this.A00), this.A01});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ASN1Tag[");
        sb.append(this.A02);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(this.A01);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }

    static {
        EnumC72367Xc3 enumC72367Xc3 = EnumC72367Xc3.Universal;
        EnumC72354Xbq enumC72354Xbq = EnumC72354Xbq.Primitive;
        XM7 xm7 = new XM7(enumC72354Xbq, enumC72367Xc3, 1);
        A06 = xm7;
        XM7 xm72 = new XM7(enumC72354Xbq, enumC72367Xc3, 2);
        A08 = xm72;
        EnumC72354Xbq enumC72354Xbq2 = EnumC72354Xbq.Constructed;
        XM7 xm73 = new XM7(enumC72354Xbq, enumC72367Xc3, EnumSet.of(enumC72354Xbq, enumC72354Xbq2));
        A05 = xm73;
        XM7 xm74 = new XM7(enumC72367Xc3, EnumSet.of(enumC72354Xbq, enumC72354Xbq2));
        A0B = xm74;
        XM7 xm75 = new XM7(enumC72354Xbq, enumC72367Xc3, 5);
        A09 = xm75;
        XM7 xm76 = new XM7(enumC72354Xbq, enumC72367Xc3, 6);
        A0A = xm76;
        XM7 xm77 = new XM7(enumC72354Xbq, enumC72367Xc3, 7);
        A07 = xm77;
        XM7 xm78 = new XM7(enumC72354Xbq2, enumC72367Xc3, 8);
        A0D = xm78;
        XM7 xm79 = new XM7(enumC72354Xbq2, enumC72367Xc3, 9);
        A0C = xm79;
        AbstractC25227BEk.A1O(xm7, A04, ((Y4A) xm7).A00);
        AbstractC25227BEk.A1O(xm72, A04, ((Y4A) xm72).A00);
        AbstractC25227BEk.A1O(xm73, A04, ((Y4A) xm73).A00);
        AbstractC25227BEk.A1O(xm74, A04, ((Y4A) xm74).A00);
        AbstractC25227BEk.A1O(xm75, A04, ((Y4A) xm75).A00);
        AbstractC25227BEk.A1O(xm76, A04, ((Y4A) xm76).A00);
        AbstractC25227BEk.A1O(xm77, A04, ((Y4A) xm77).A00);
        AbstractC25227BEk.A1O(xm78, A04, ((Y4A) xm78).A00);
        AbstractC25227BEk.A1O(xm79, A04, ((Y4A) xm79).A00);
    }

    public Y4A(EnumC72354Xbq enumC72354Xbq, EnumC72367Xc3 enumC72367Xc3, EnumSet enumSet, int i) {
        this.A02 = enumC72367Xc3;
        this.A00 = i;
        this.A03 = enumSet;
        this.A01 = enumC72354Xbq;
    }

    public static Y4A A00(EnumC72367Xc3 enumC72367Xc3, int i) {
        int ordinal = enumC72367Xc3.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return new XM7(enumC72367Xc3, EnumSet.of(EnumC72354Xbq.Primitive, EnumC72354Xbq.Constructed), i);
            }
        } else {
            Iterator A16 = AbstractC166997dE.A16(A04);
            while (A16.hasNext()) {
                Y4A y4a = (Y4A) A16.next();
                if (y4a.A00 == i && enumC72367Xc3 == y4a.A02) {
                    return y4a;
                }
            }
        }
        throw new RuntimeException(String.format("Unknown ASN.1 tag '%s:%s' found (%s)", enumC72367Xc3, Integer.valueOf(i), A04));
    }
}
