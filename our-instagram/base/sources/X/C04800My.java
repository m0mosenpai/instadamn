package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.0My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04800My {
    public static java.util.Set A05;
    public static final Charset A06 = StandardCharsets.US_ASCII;
    public final C07920bC A01;
    public final Object A02 = new Object();
    public int A00 = 0;
    public final Map A04 = new HashMap();
    public final Map A03 = new HashMap();

    public final boolean A01(String str) {
        boolean contains;
        synchronized (this.A02) {
            if (A05 == null) {
                A05 = new HashSet();
                for (EnumC04790Mx enumC04790Mx : EnumC04790Mx.values()) {
                    A05.add(enumC04790Mx.name());
                }
            }
            contains = A05.contains(str);
        }
        return contains;
    }

    public C04800My(C07920bC c07920bC) {
        this.A01 = c07920bC;
    }

    public static void A00(EnumC04790Mx enumC04790Mx, String str, MappedByteBuffer mappedByteBuffer, int i) {
        mappedByteBuffer.position(i);
        String A00 = C10760hk.A00(enumC04790Mx.A01, true);
        Charset charset = A06;
        mappedByteBuffer.put(A00.getBytes(charset));
        mappedByteBuffer.put(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR.getBytes(charset));
        mappedByteBuffer.put(C10760hk.A00(str, false).getBytes(charset));
        mappedByteBuffer.put("\n#".getBytes(charset));
        for (int length = str.length(); length < enumC04790Mx.A00; length++) {
            mappedByteBuffer.put("#".getBytes(charset));
        }
        mappedByteBuffer.put("\n".getBytes(charset));
    }
}
