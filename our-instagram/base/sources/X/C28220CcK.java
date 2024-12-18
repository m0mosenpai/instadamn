package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.CcK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28220CcK {
    public static final C28220CcK A00 = new C28220CcK();

    public C28220CcK() {
        if (!CLW.A00("  ") && !CLW.A00("") && !CLW.A00("")) {
            CLW.A00("");
        }
    }

    public final void A00(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytePrefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BytesHexFormat(");
        A1C.append('\n');
        A00(A1C, "    ");
        A1C.append('\n');
        String A0x = AbstractC166997dE.A0x(")", A1C);
        C14360o3.A07(A0x);
        return A0x;
    }
}
