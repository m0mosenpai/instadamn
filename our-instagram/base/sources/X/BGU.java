package X;

import android.app.Activity;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class BGU {
    public static final void A00(LazyListState lazyListState, C5Tl c5Tl, int i, int i2) {
        int i3;
        C14360o3.A0B(lazyListState, 0);
        c5Tl.Enr(-237543117);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, lazyListState) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(949631811, "com.instagram.compose.perf.scroll.DropFrameWatcher (DropFrameWatcher.kt:34)");
            }
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -165882916, i3);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new BFY(lazyListState);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            A02(c5Tl, (MRC) EEc, i, i3 & 112);
            if (C0fH.A02()) {
                C0fH.A00(1875489736);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, lazyListState, i, i2, 5);
        }
    }

    public static final void A01(LazyGridState lazyGridState, C5Tl c5Tl, int i, int i2) {
        int i3;
        C14360o3.A0B(lazyGridState, 0);
        c5Tl.Enr(-2057742453);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, lazyGridState) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-8074394, "com.instagram.compose.perf.scroll.DropFrameWatcher (DropFrameWatcher.kt:45)");
            }
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -165869156, i3);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new C29200Cu5(lazyGridState);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            A02(c5Tl, (MRC) EEc, i, i3 & 112);
            if (C0fH.A02()) {
                C0fH.A00(-1004385973);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, lazyGridState, i, i2, 6);
        }
    }

    public static final void A02(C5Tl c5Tl, MRC mrc, int i, int i2) {
        int i3;
        boolean z;
        c5Tl.Enr(1461236960);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, mrc, i2) ? 1 : 0) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1519684382, "com.instagram.compose.perf.scroll.DropFrameWatcher (DropFrameWatcher.kt:57)");
            }
            Activity A00 = AbstractC13330mJ.A00(AbstractC25228BEl.A0K(c5Tl));
            UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) c5Tl.AJX(C5VZ.A00);
            boolean A1P = AbstractC167007dF.A1P(i3 & 112, 32) | AbstractC25234BEr.A1b(c5Tl, A00, A0u, interfaceC11380iw, -165848894);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C25325BIu(A00, interfaceC11380iw, A0u, i);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            c5Tl.Eno(-165841916);
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && c5Tl.AH6(mrc))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, EEc, z);
            Object EEc2 = c5Tl.EEc();
            if (A1X || EEc2 == C5UI.A00) {
                EEc2 = new MC7(mrc, EEc, (InterfaceC23621Ds) null, 22);
                c5Tl.FBy(EEc2);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, EEc2, mrc, false);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, EEc, -165807314);
            Object EEc3 = c5Tl.EEc();
            if (A1Z || EEc3 == C5UI.A00) {
                EEc3 = new C30192DRx(EEc, 13);
                c5Tl.FBy(EEc3);
            }
            AbstractC25326BIv.A00(c5Tl, null, AbstractC25225BEi.A1C(A0K, EEc3), 0, 1);
            if (C0fH.A02()) {
                C0fH.A00(-1277989033);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, mrc, i, i2, 7);
        }
    }
}
