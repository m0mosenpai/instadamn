package X;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class SA0 {
    public static final C62500SEc A00;
    public static final C62501SEd A01;
    public static final C62502SEe A02;
    public static final C62503SEf A03;
    public static final Map A04;
    public static final Map A05;
    public static final C58526Pwu A06;

    static {
        C58526Pwu A012 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.AesSivKey");
        A06 = A012;
        A03 = new C62503SEf(new C58365Pu5(8), C58556PxX.class);
        A02 = C58366Pu6.A00(A012, 8);
        A01 = new C62501SEd(new C58363Pu3(8), RT6.class);
        A00 = C58367Pu7.A00(A012, 8);
        HashMap A1G = AbstractC166987dD.A1G();
        SY3 sy3 = SY3.A02;
        PxH pxH = PxH.RAW;
        A1G.put(sy3, pxH);
        SY3 sy32 = SY3.A03;
        PxH pxH2 = PxH.TINK;
        A1G.put(sy32, pxH2);
        SY3 sy33 = SY3.A01;
        PxH pxH3 = PxH.CRUNCHY;
        A1G.put(sy33, pxH3);
        A05 = Collections.unmodifiableMap(A1G);
        EnumMap enumMap = new EnumMap(PxH.class);
        enumMap.put((EnumMap) pxH, (PxH) sy3);
        enumMap.put((EnumMap) pxH2, (PxH) sy32);
        enumMap.put((EnumMap) pxH3, (PxH) sy33);
        enumMap.put((EnumMap) PxH.LEGACY, (PxH) sy33);
        A04 = Collections.unmodifiableMap(enumMap);
    }
}
