package X;

import java.util.Iterator;

/* renamed from: X.2U1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2U1 {
    public static C2U1 A03;
    public C105584pV A00;
    public volatile boolean A02 = false;
    public final C0JO A01 = new C0E1(new C49882Qy());

    public static void A00(C2U1 c2u1, C006802i c006802i, String str, String str2) {
        c006802i.markerAnnotate(25952257, 0, str, str2);
        C105584pV c105584pV = c2u1.A00;
        if (c105584pV != null) {
            for (int i : c105584pV.A04) {
                c105584pV.A00.markerAnnotate(i, 0, str, str2);
            }
            Iterator it = c105584pV.A02.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                ((C105594pW) it.next()).A00.A02(str, str2);
            }
        }
    }
}
