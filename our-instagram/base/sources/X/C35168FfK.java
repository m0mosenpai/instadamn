package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.FfK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35168FfK {
    public static final InterfaceC28041Xi A03 = C35886Ft0.A00;
    public final InterfaceC37120GXf A01;
    public final Map A02 = AbstractC166987dD.A1I();
    public final Handler A00 = AbstractC167007dF.A0J();

    public final InterfaceC37292Gbt A02(C51690MsL c51690MsL) {
        C11T.A06("This operation must be run on UI thread.");
        RunnableC36981GQy runnableC36981GQy = (RunnableC36981GQy) this.A02.get(c51690MsL);
        if (runnableC36981GQy == null) {
            return null;
        }
        Integer num = runnableC36981GQy.A02;
        if (num == C05F.A0N || num == C05F.A0C) {
            return runnableC36981GQy.A05;
        }
        return null;
    }

    public final void A06(InterfaceC37292Gbt interfaceC37292Gbt, C51690MsL c51690MsL) {
        C14360o3.A0B(c51690MsL, 0);
        A00(new RunnableC36981GQy(this.A00, this.A01, interfaceC37292Gbt, C05F.A01), c51690MsL);
    }

    public final void A08(C51690MsL c51690MsL) {
        C14360o3.A0B(c51690MsL, 0);
        C11T.A06("This operation must be run on UI thread.");
        RunnableC36981GQy runnableC36981GQy = (RunnableC36981GQy) this.A02.get(c51690MsL);
        if (runnableC36981GQy != null) {
            runnableC36981GQy.A02 = C05F.A01;
            runnableC36981GQy.A01 = -1L;
        }
    }

    public final boolean A09() {
        Integer num;
        C11T.A06("This operation must be run on UI thread.");
        Collection<RunnableC36981GQy> values = this.A02.values();
        if (values == null || !values.isEmpty()) {
            for (RunnableC36981GQy runnableC36981GQy : values) {
                if (runnableC36981GQy != null && ((num = runnableC36981GQy.A02) == C05F.A0N || num == C05F.A0C)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void A00(RunnableC36981GQy runnableC36981GQy, C51690MsL c51690MsL) {
        C11T.A06("This operation must be run on UI thread.");
        A08(c51690MsL);
        this.A02.put(c51690MsL, runnableC36981GQy);
        runnableC36981GQy.A02 = C05F.A0C;
        runnableC36981GQy.A01 = SystemClock.elapsedRealtime();
        runnableC36981GQy.A03.postDelayed(runnableC36981GQy, runnableC36981GQy.A00);
    }

    public final C34942FaS A01(C51690MsL c51690MsL) {
        C11T.A06("This operation must be run on UI thread.");
        RunnableC36981GQy runnableC36981GQy = (RunnableC36981GQy) this.A02.get(c51690MsL);
        if (runnableC36981GQy == null) {
            return C34942FaS.A05;
        }
        return new C34942FaS(SystemClock.elapsedRealtime() - runnableC36981GQy.A01, runnableC36981GQy.A02);
    }

    public final ArrayList A03(InterfaceC28041Xi interfaceC28041Xi, Class cls) {
        C11T.A06("This operation must be run on UI thread.");
        Map map = this.A02;
        ArrayList A17 = AbstractC25225BEi.A17(map.size());
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            RunnableC36981GQy runnableC36981GQy = (RunnableC36981GQy) A16.next();
            InterfaceC37292Gbt interfaceC37292Gbt = runnableC36981GQy.A05;
            if (cls.isAssignableFrom(interfaceC37292Gbt.getClass()) && interfaceC28041Xi.apply(runnableC36981GQy)) {
                A17.add(interfaceC37292Gbt);
            }
        }
        return A17;
    }

    public final ArrayList A04(Class cls) {
        List Axe;
        ArrayList A032 = A03(A03, cls);
        LinkedHashSet linkedHashSet = new LinkedHashSet(A032.size());
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            InterfaceC37292Gbt interfaceC37292Gbt = (InterfaceC37292Gbt) it.next();
            if (interfaceC37292Gbt != null && (Axe = interfaceC37292Gbt.Axe()) != null) {
                linkedHashSet.addAll(Axe);
            }
        }
        return AbstractC166987dD.A1F(linkedHashSet);
    }

    public final void A05() {
        C11T.A06("This operation must be run on UI thread.");
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            ((RunnableC36981GQy) A16.next()).run();
        }
    }

    public final void A07(InterfaceC37292Gbt interfaceC37292Gbt, C51690MsL c51690MsL) {
        RunnableC36981GQy runnableC36981GQy = new RunnableC36981GQy(this.A00, this.A01, interfaceC37292Gbt, C05F.A01);
        runnableC36981GQy.A00 = 0L;
        A00(runnableC36981GQy, c51690MsL);
    }

    public C35168FfK(InterfaceC37120GXf interfaceC37120GXf) {
        this.A01 = interfaceC37120GXf;
    }
}
