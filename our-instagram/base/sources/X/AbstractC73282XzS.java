package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.XzS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC73282XzS {
    public static final Map A00;
    public static final Map A01;

    static {
        C09530e4 A002 = A00(EnumC72363Xbz.A0A, EnumC72393Xcf.A1G);
        EnumC72393Xcf enumC72393Xcf = EnumC72393Xcf.A1I;
        EnumC72363Xbz enumC72363Xbz = EnumC72363Xbz.A0D;
        C09530e4 A003 = A00(enumC72363Xbz, enumC72393Xcf);
        C09530e4 A004 = A00(enumC72363Xbz, EnumC72393Xcf.A0K);
        C09530e4 A005 = A00(EnumC72363Xbz.A07, EnumC72393Xcf.A0U);
        C09530e4 A006 = A00(EnumC72363Xbz.A02, EnumC72393Xcf.A0a);
        C09530e4 A007 = A00(EnumC72363Xbz.A05, EnumC72393Xcf.A0f);
        C09530e4 A008 = A00(EnumC72363Xbz.A06, EnumC72393Xcf.A0k);
        EnumC72393Xcf enumC72393Xcf2 = EnumC72393Xcf.A1M;
        A00 = AbstractC06930Yk.A06(A002, A003, A004, A005, A006, A007, A008, A00(EnumC72363Xbz.A04, enumC72393Xcf2), A00(EnumC72363Xbz.A0B, EnumC72393Xcf.A1S), A00(EnumC72363Xbz.A03, EnumC72393Xcf.A1T), A00(EnumC72363Xbz.A0C, EnumC72393Xcf.A1V));
        EnumC72393Xcf enumC72393Xcf3 = EnumC72393Xcf.A09;
        EnumC72360Xbw enumC72360Xbw = EnumC72360Xbw.A02;
        A01 = AbstractC06930Yk.A06(A00(enumC72360Xbw, enumC72393Xcf3), A00(enumC72360Xbw, EnumC72393Xcf.A0D), A00(enumC72360Xbw, EnumC72393Xcf.A1W), A00(enumC72360Xbw, EnumC72393Xcf.A0C), A00(EnumC72360Xbw.A03, EnumC72393Xcf.A0H), A00(enumC72360Xbw, EnumC72393Xcf.A0J), A00(enumC72360Xbw, EnumC72393Xcf.A0O), A00(enumC72360Xbw, EnumC72393Xcf.A0P), A00(enumC72360Xbw, EnumC72393Xcf.A0Q), A00(enumC72360Xbw, EnumC72393Xcf.A0R), A00(EnumC72360Xbw.A05, EnumC72393Xcf.A0X), A00(enumC72360Xbw, EnumC72393Xcf.A0e), A00(EnumC72360Xbw.A06, EnumC72393Xcf.A0x), A00(enumC72360Xbw, EnumC72393Xcf.A1E), A00(EnumC72360Xbw.A07, EnumC72393Xcf.A1J), A00(enumC72360Xbw, enumC72393Xcf2));
    }

    public static C09530e4 A00(Object obj, Object obj2) {
        List singletonList = Collections.singletonList(obj);
        C14360o3.A07(singletonList);
        return new C09530e4(obj2, singletonList);
    }
}
