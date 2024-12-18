package X;

import java.util.Locale;

/* renamed from: X.2qG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60922qG {
    public InterfaceC12060kA A00;
    public boolean A01;
    public final C006802i A02;
    public final String A03;

    public C60922qG(C006802i c006802i, String str) {
        C14360o3.A0B(str, 2);
        this.A03 = str;
        this.A02 = c006802i;
        this.A01 = true;
    }

    public static final void A00(C60922qG c60922qG, Integer num) {
        if (c60922qG.A01) {
            String lowerCase = AbstractC60932qH.A00(num).toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            String A0R = AnonymousClass001.A0R(lowerCase, "_end");
            C006802i c006802i = c60922qG.A02;
            if (c006802i != null) {
                c006802i.markerPoint(694561158, A0R);
            }
            InterfaceC12060kA interfaceC12060kA = c60922qG.A00;
            if (interfaceC12060kA != null) {
                interfaceC12060kA.Cna(A0R);
            }
            if (num == C05F.A0Y) {
                if (c006802i != null) {
                    c006802i.markerEnd(694561158, (short) 2);
                }
                c60922qG.A01 = false;
            }
        }
    }

    public static final void A01(C60922qG c60922qG, Integer num) {
        C006802i c006802i;
        if (c60922qG.A01) {
            if (num == C05F.A00 && (c006802i = c60922qG.A02) != null) {
                c006802i.markerStart(694561158);
                c006802i.markerAnnotate(694561158, "fragment", c60922qG.A03);
                c006802i.markerAnnotate(694561158, "version", 1);
            }
            String lowerCase = AbstractC60932qH.A00(num).toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            String A0R = AnonymousClass001.A0R(lowerCase, "_start");
            C006802i c006802i2 = c60922qG.A02;
            if (c006802i2 != null) {
                c006802i2.markerPoint(694561158, A0R);
            }
            InterfaceC12060kA interfaceC12060kA = c60922qG.A00;
            if (interfaceC12060kA != null) {
                interfaceC12060kA.Cna(A0R);
            }
        }
    }
}
