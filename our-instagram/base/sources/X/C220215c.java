package X;

import com.facebook.mobileboost.framework.os.jni.lite.MobileBoostNativeLite;
import com.facebook.systrace.Systrace;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.15c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C220215c implements InterfaceC12870lZ, InterfaceC220315d {
    public final long A00;
    public final int A01;
    public final C212211z A02;
    public final Map A03;
    public final boolean A04;

    public C220215c(C212211z c212211z, int i, int i2, long j, boolean z, boolean z2) {
        C14360o3.A0B(c212211z, 1);
        this.A02 = c212211z;
        this.A01 = i;
        this.A04 = z2;
        this.A00 = j;
        LinkedHashMap A06 = AbstractC06930Yk.A06(new C09530e4(-100, -100), new C09530e4(-50, -50), new C09530e4(0, 0), new C09530e4(50, 50), new C09530e4(100, 100));
        this.A03 = A06;
        if (i != 0) {
            C1KH A00 = AbstractC25061Kk.A00();
            Number number = (Number) A06.get(Integer.valueOf(i2));
            A00.A0A(this, number != null ? number.intValue() : 0);
        }
        if (z) {
            C218914p.A04(EnumC220415e.A02, this, false, false);
        } else {
            C218914p.A03(EnumC220415e.A03, this);
        }
    }

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        C14360o3.A0B(c1kj, 0);
        if ((this.A01 & (1 << c1kj.ordinal())) != 0) {
            A00(false);
        }
    }

    public final void A00(final boolean z) {
        C1KJ A06;
        int ordinal;
        if (((Boolean) AbstractC220515f.A01.getValue()).booleanValue()) {
            final C212211z c212211z = this.A02;
            if ((c212211z.A00 & 255) != 0 && z != AbstractC220515f.A00) {
                if (z && this.A04) {
                    if (!AbstractC25061Kk.A00().A0E() && !AbstractC25061Kk.A00().A0D()) {
                        long j = this.A00;
                        if (j >= 0 && (A06 = AbstractC25061Kk.A00().A06()) != null && (ordinal = A06.ordinal()) >= 0 && ((1 << ordinal) & ((int) j)) > 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                AbstractC220515f.A00 = z;
                C14120nc.A00().ATO(new AbstractRunnableC14200nk(c212211z, z) { // from class: X.15i
                    public final C212211z A00;
                    public final boolean A01;

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("MBNL.mlockPages", -1827186050);
                        }
                        try {
                            C212211z c212211z2 = this.A00;
                            String str = c212211z2.A01;
                            int i = c212211z2.A00;
                            MobileBoostNativeLite.mlockPages(str, i & 255, (i >> 14) & 65535, (i >> 30) & 3, this.A01);
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-815044629);
                            }
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(40470079);
                            }
                            throw th;
                        }
                    }

                    {
                        super(402130881, 3, false, false);
                        this.A00 = c212211z;
                        this.A01 = z;
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-2066075032);
        A00(false);
        C0f9.A0A(1882044476, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1235594338);
        A00(true);
        C0f9.A0A(-1707061885, A03);
    }
}
