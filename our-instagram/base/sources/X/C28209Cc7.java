package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.Cc7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28209Cc7 {
    public static final C28209Cc7 A03;
    public static final C28209Cc7 A04;
    public final C28221CcR A00;
    public final boolean A01;
    public final C28220CcK A02;

    static {
        C28220CcK c28220CcK = C28220CcK.A00;
        C28221CcR c28221CcR = C28221CcR.A03;
        A03 = new C28209Cc7(c28220CcK, c28221CcR, false);
        A04 = new C28209Cc7(c28220CcK, c28221CcR, true);
    }

    public C28209Cc7(C28220CcK c28220CcK, C28221CcR c28221CcR, boolean z) {
        AbstractC167017dG.A1R(c28220CcK, c28221CcR);
        this.A01 = z;
        this.A02 = c28220CcK;
        this.A00 = c28221CcR;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HexFormat(");
        A1C.append('\n');
        A1C.append("    upperCase = ");
        A1C.append(this.A01);
        A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A1C.append('\n');
        A1C.append("    bytes = BytesHexFormat(");
        A1C.append('\n');
        this.A02.A00(A1C, "        ");
        A1C.append('\n');
        A1C.append("    ),");
        A1C.append('\n');
        A1C.append("    number = NumberHexFormat(");
        A1C.append('\n');
        this.A00.A00(A1C, "        ");
        A1C.append('\n');
        A1C.append("    )");
        A1C.append('\n');
        String A0x = AbstractC166997dE.A0x(")", A1C);
        C14360o3.A07(A0x);
        return A0x;
    }
}
