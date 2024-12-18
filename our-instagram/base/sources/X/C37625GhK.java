package X;

import android.os.Handler;
import android.os.SystemClock;
import com.instagram.clips.intf.ClipsViewerConfig;
import java.util.Iterator;

/* renamed from: X.GhK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37625GhK extends AbstractC37623GhI {
    public long A00;
    public boolean A01;
    public final ClipsViewerConfig A04;
    public final InterfaceC16820sZ A08;
    public final Handler A02 = new Handler();
    public final Runnable A06 = new RunnableC43109J3y(this);
    public final Runnable A07 = new RunnableC43110J3z(this);
    public final C37521Gfd A03 = new C37521Gfd(this, 4);
    public final AbstractC116895Qv A05 = new C37781Gjw(this, 1);

    public C37625GhK(ClipsViewerConfig clipsViewerConfig, InterfaceC16820sZ interfaceC16820sZ) {
        this.A04 = clipsViewerConfig;
        this.A08 = interfaceC16820sZ;
    }

    public final void A0B() {
        AbstractC37552Gg8 abstractC37552Gg8;
        int A0B;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A00;
        long j2 = elapsedRealtime - j;
        if ((j == 0 || j2 <= 1000) && !this.A01 && 1 < (A0B = (abstractC37552Gg8 = ((C37546Gg2) this.A08.invoke()).A0A).A0B())) {
            Iterator it = abstractC37552Gg8.A0J().subList(1, A0B).iterator();
            while (it.hasNext()) {
                if (((C120985dq) it.next()).A01 == EnumC129395t1.A0G) {
                    int ordinal = this.A04.A0H.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 0 && ordinal != 3) {
                                throw B4Z.A00();
                            }
                            return;
                        } else {
                            C37556GgC c37556GgC = super.A02;
                            if (c37556GgC != null) {
                                c37556GgC.A0I(false);
                            }
                        }
                    } else {
                        this.A02.postDelayed(this.A06, 500L);
                    }
                    this.A01 = true;
                    return;
                }
            }
        }
    }
}
