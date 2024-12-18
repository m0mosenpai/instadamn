package X;

import java.util.Map;

/* renamed from: X.4Fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93124Fo {
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C93134Fp.A00);

    public final C09530e4 A00(C3ZQ c3zq) {
        C3ZR c3zr;
        if ((c3zq instanceof C3ZR) && (c3zr = (C3ZR) c3zq) != null) {
            return new C09530e4(Integer.valueOf(c3zr.A06), Integer.valueOf(c3zr.A05));
        }
        return (C09530e4) ((Map) this.A00.getValue()).get(c3zq);
    }
}
