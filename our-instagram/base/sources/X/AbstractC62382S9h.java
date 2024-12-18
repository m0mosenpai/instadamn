package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.S9h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62382S9h {
    public static final C2n2 A00;
    public static final C2n2 A01;
    public static final C2n2 A02;
    public static final Map A03;

    static {
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        A0Z.put(EnumC72408Xcv.A02, EnumC61116RfW.CREDIT_CARD);
        A0Z.put(EnumC72408Xcv.A07, EnumC61116RfW.PAYPAL);
        A0Z.put(EnumC72408Xcv.A03, EnumC61116RfW.DIRECT_DEBIT);
        A0Z.put(EnumC72408Xcv.A08, EnumC61116RfW.SHOP_PAY);
        ImmutableMap buildOrThrow = A0Z.buildOrThrow();
        C14360o3.A07(buildOrThrow);
        A03 = buildOrThrow;
        A01 = C64283T7s.A00;
        A00 = C64282T7r.A00;
        A02 = C64284T7t.A00;
    }
}
