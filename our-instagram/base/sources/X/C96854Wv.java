package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Wv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96854Wv implements C4W9 {
    public long A01;
    public long A02;
    public C92124As A03;
    public final /* synthetic */ C4TS A06;
    public int A00 = 0;
    public List A04 = null;
    public final C96604Vv A05 = new C96604Vv();

    @Override // X.C4W9
    public final void DZJ(boolean z, int i) {
        if (i == 3) {
            C4TS c4ts = this.A06;
            if (c4ts.A02 != null) {
                C4TS.A03(c4ts);
            }
        }
        Iterator it = this.A06.A0R.iterator();
        while (it.hasNext()) {
            ((C96844Wu) it.next()).A00(i, z);
        }
    }

    public C96854Wv(C4TS c4ts) {
        this.A06 = c4ts;
    }

    @Override // X.C4W9
    public final void DZ4(C4TU c4tu) {
        C4TS c4ts = this.A06;
        float f = c4ts.A00;
        float f2 = c4tu.A01;
        if (f != f2) {
            c4ts.A00 = f2;
            c4ts.A0O.A0v.DZ9(f2);
        }
    }

    @Override // X.C4W9
    public final void DZG(C4Y4 c4y4) {
        C4TS c4ts = this.A06;
        EnumC117265Sl enumC117265Sl = null;
        if (c4y4 instanceof C4Y3) {
            int i = ((C4Y3) c4y4).A02;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        enumC117265Sl = EnumC117265Sl.A0F;
                    }
                } else {
                    enumC117265Sl = EnumC117265Sl.A0D;
                }
            } else {
                enumC117265Sl = EnumC117265Sl.A0E;
            }
        }
        c4y4.getCause();
        Iterator it = c4ts.A0R.iterator();
        while (it.hasNext()) {
            ((C96844Wu) it.next()).A00.A0Q(enumC117265Sl, c4y4);
        }
    }

    @Override // X.C4W9
    public final void DZn(int i) {
        C4TS c4ts = this.A06;
        if (c4ts.A02 != null) {
            C4TS.A03(c4ts);
        }
        if (c4ts.A0Q.A2d) {
            Iterator it = c4ts.A0R.iterator();
            while (it.hasNext()) {
                C95794Sn c95794Sn = ((C96844Wu) it.next()).A00;
                if (C95794Sn.A0K(c95794Sn) && (i == 0 || i == 5)) {
                    C95794Sn.A07(c95794Sn.A0G.obtainMessage(38, new Object[]{Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime())}), c95794Sn);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        if (r11.isEmpty() != false) goto L48;
     */
    @Override // X.C4W9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DtJ(com.google.android.exoplayer2.Timeline r31, java.lang.Object r32, int r33) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96854Wv.DtJ(com.google.android.exoplayer2.Timeline, java.lang.Object, int):void");
    }

    @Override // X.C4W9
    public final void Dus(C4WG c4wg) {
        long j;
        long j2;
        Iterator it = this.A06.A0R.iterator();
        while (it.hasNext()) {
            C95794Sn c95794Sn = ((C96844Wu) it.next()).A00;
            AbstractC96044Tn abstractC96044Tn = (AbstractC96044Tn) c95794Sn.A19.A0G[0];
            InterfaceC97394Yz interfaceC97394Yz = abstractC96044Tn.A05;
            if (interfaceC97394Yz != null) {
                j = interfaceC97394Yz.CAC(abstractC96044Tn.A0B);
            } else {
                j = -9223372036854775807L;
            }
            AbstractC96044Tn abstractC96044Tn2 = (AbstractC96044Tn) c95794Sn.A19.A0G[1];
            InterfaceC97394Yz interfaceC97394Yz2 = abstractC96044Tn2.A05;
            if (interfaceC97394Yz2 != null) {
                j2 = interfaceC97394Yz2.CAC(abstractC96044Tn2.A0B);
            } else {
                j2 = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                c95794Sn.A0E = j;
            }
            if (j2 != -9223372036854775807L) {
                c95794Sn.A07 = j2;
            }
        }
    }

    @Override // X.C4W9
    public final void DwG(String str) {
        C4TS c4ts = this.A06;
        C96384Uw c96384Uw = c4ts.A09;
        if (c96384Uw != null && (c96384Uw.A00 instanceof C96364Uu)) {
            StringBuilder sb = new StringBuilder("LoadControl debug info: ");
            sb.append((Object) null);
            sb.append(". Player debug info: ");
            sb.append(str);
            str = sb.toString();
        }
        Iterator it = c4ts.A0R.iterator();
        while (it.hasNext()) {
            ((C96844Wu) it.next()).A00.A0v.E1k("EXOPLAYER2_UNEXPECTED_STOP_LOADING", "UNKNOWN", str);
        }
    }
}
