package X;

/* renamed from: X.Go4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38017Go4 extends AbstractC37585Ggg {
    public C25377BKu A00;
    public C40971v4 A01;

    public static boolean A06(AbstractC38017Go4 abstractC38017Go4) {
        return abstractC38017Go4.A07().A0N != null;
    }

    public static void A05(InterfaceC02590Ai interfaceC02590Ai, AbstractC38017Go4 abstractC38017Go4, String str) {
        interfaceC02590Ai.AAP("afi_type", str);
        interfaceC02590Ai.AAP("ad_tracking_token", abstractC38017Go4.A07().A0j);
    }

    public final C40971v4 A07() {
        C40971v4 c40971v4 = this.A01;
        if (c40971v4 != null) {
            return c40971v4;
        }
        C14360o3.A0F("ad");
        throw C00O.createAndThrow();
    }

    public static long A04(AbstractC38017Go4 abstractC38017Go4) {
        if (abstractC38017Go4.A07().A0P != null) {
            return r0.intValue();
        }
        return 0L;
    }
}
