package X;

import androidx.compose.ui.Modifier;
import ca.psiphon.PsiphonTunnel;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Chf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28487Chf {
    public static final Modifier A00(C5Tl c5Tl, Modifier modifier) {
        C14360o3.A0B(modifier, 0);
        if (AbstractC25227BEk.A1U(c5Tl, -1407831292)) {
            C0fH.A01(-12217275, "com.instagram.compose.ui.shimmer.shimmer (Shimmer.kt:45)");
        }
        Modifier A01 = A01(c5Tl, modifier, A03(c5Tl, null, 0.0f, 0.0f, 0, 0, StringTreeSet.MAX_SYMBOL_COUNT, 0L), 0);
        if (C0fH.A02()) {
            C0fH.A00(-833105855);
        }
        AbstractC25225BEi.A1V(c5Tl, false);
        return A01;
    }

    public static final Modifier A01(C5Tl c5Tl, Modifier modifier, CUC cuc, int i) {
        AbstractC167007dF.A1K(modifier, cuc);
        if (AbstractC25227BEk.A1U(c5Tl, 167695156)) {
            C0fH.A01(909477543, "com.instagram.compose.ui.shimmer.shimmer (Shimmer.kt:49)");
        }
        boolean z = false;
        A04(c5Tl, 0);
        c5Tl.Eno(1361958498);
        if ((((i & 112) ^ 48) > 32 && c5Tl.AH4(cuc)) || (i & 48) == 32) {
            z = true;
        }
        Object EEc = c5Tl.EEc();
        if (z || EEc == C5UI.A00) {
            EEc = C30185DRq.A02(cuc, 45);
            c5Tl.FBy(EEc);
        }
        C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
        Modifier A00 = AbstractC119675bQ.A00(modifier, (InterfaceC16660sJ) EEc);
        if (C0fH.A02()) {
            C0fH.A00(660425648);
        }
        C117505Tk.A0L(A0K, false);
        return A00;
    }

    public static final CUC A02(C5Tl c5Tl, List list, float f, float f2, float f3, int i, int i2, int i3) {
        int i4 = i;
        float f4 = f3;
        float f5 = f2;
        float f6 = f;
        C14360o3.A0B(list, 0);
        c5Tl.Eno(309505176);
        if ((i3 & 2) != 0) {
            f6 = 250.0f;
        }
        if ((i3 & 4) != 0) {
            f5 = 750.0f;
        }
        if ((i3 & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i3 & 16) != 0) {
            i4 = PsiphonTunnel.VPN_INTERFACE_MTU;
        }
        if (C0fH.A02()) {
            C0fH.A01(-849324079, "com.instagram.compose.ui.shimmer.rememberShimmerState (Shimmer.kt:86)");
        }
        JTG A01 = BH4.A01(new BH6(C25245BFe.A01(AbstractC25328BIx.A02, i4, 0), C05F.A00), BH4.A02(c5Tl), c5Tl, 0.0f, 1.0f, 4536 | ((i2 >> 3) & 57344));
        Object A0q = AbstractC25227BEk.A0q(c5Tl, 464261022);
        if (A0q == C5UI.A00) {
            A0q = new CUC(A01, list, f6, f5, f4);
            c5Tl.FBy(A0q);
        }
        CUC cuc = (CUC) A0q;
        C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
        cuc.A03 = list;
        cuc.A00 = f6;
        cuc.A02 = f5;
        cuc.A01 = f4;
        if (C0fH.A02()) {
            C0fH.A00(763823760);
        }
        C117505Tk.A0L(A0K, false);
        return cuc;
    }

    public static void A05(C5Tl c5Tl, Modifier modifier) {
        C5XX.A02(c5Tl, A00(c5Tl, modifier), 0);
    }

    public static void A06(C5Tl c5Tl, Modifier modifier, float f) {
        Modifier A08 = AbstractC118185Wd.A08(modifier, f);
        C5XL.A02(c5Tl);
        C5XX.A02(c5Tl, A01(c5Tl, C6L2.A01(A08, C5WE.A02), A02(c5Tl, CNP.A01, 0.0f, 250.0f, 0.0f, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, 24966, 42), 0), 0);
    }

    public static void A07(C5Tl c5Tl, Modifier modifier, C5AH c5ah) {
        C5XX.A02(c5Tl, A00(c5Tl, C6L2.A01(modifier, c5ah)), 0);
    }

    public static final CUC A03(C5Tl c5Tl, List list, float f, float f2, int i, int i2, int i3, long j) {
        long A02;
        int i4 = i;
        float f3 = f2;
        float f4 = f;
        long j2 = j;
        c5Tl.Eno(-1062796575);
        if ((i3 & 1) != 0) {
            j2 = AbstractC25226BEj.A09(c5Tl);
        }
        if ((i3 & 2) != 0) {
            Float valueOf = Float.valueOf(0.3f);
            Float valueOf2 = Float.valueOf(0.6f);
            Float valueOf3 = Float.valueOf(0.9f);
            list = AbstractC16960so.A1Q(valueOf, valueOf2, valueOf3, AbstractC25227BEk.A0m(), valueOf3, valueOf2, valueOf);
        }
        float f5 = 0.0f;
        if ((i3 & 4) != 0) {
            f5 = 250.0f;
        }
        if ((i3 & 8) != 0) {
            f4 = 750.0f;
        }
        if ((i3 & 16) != 0) {
            f3 = 0.0f;
        }
        if ((i3 & 32) != 0) {
            i4 = PsiphonTunnel.VPN_INTERFACE_MTU;
        }
        if (C0fH.A02()) {
            C0fH.A01(828818036, "com.instagram.compose.ui.shimmer.rememberShimmerState (Shimmer.kt:63)");
        }
        c5Tl.Eno(464226447);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j2 & 63)], C1132359l.A03(j2), C1132359l.A02(j2), C1132359l.A01(j2), AbstractC166987dD.A09(it.next()));
            A0q.add(AbstractC25225BEi.A0S(C5AC.A01(A02, C5XL.A00(c5Tl).A0C)));
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C117505Tk.A0L(c117505Tk, false);
        int i5 = i2 >> 3;
        CUC A022 = A02(c5Tl, A0q, f5, f4, f3, i4, AbstractC25233BEq.A01((i5 & 112) | (i5 & 896), i5 & 7168, i5), 0);
        if (C0fH.A02()) {
            C0fH.A00(-1006585481);
        }
        C117505Tk.A0L(c117505Tk, false);
        return A022;
    }

    public static final void A04(C5Tl c5Tl, int i) {
        C5UU ASZ;
        int i2;
        c5Tl.Enr(1532647369);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-677821853, "com.instagram.compose.ui.shimmer.LogShimmerState (Shimmer.kt:108)");
            }
            int A00 = C5X2.A00(c5Tl);
            String A1D = AbstractC25232BEp.A1D(c5Tl);
            Object AJX = c5Tl.AJX(C6LG.A00);
            if (AJX == null) {
                if (C0fH.A02()) {
                    C0fH.A00(-467448482);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i2 = 24;
                C30494Dbd.A01(ASZ, i, i2);
            }
            C0eB c0eB = C0eB.A00;
            boolean A1V = AbstractC25228BEl.A1V(c5Tl, A1D, AbstractC25227BEk.A1Z(c5Tl, AJX, 1377756967), c5Tl.AH2(A00));
            Object EEc = c5Tl.EEc();
            if (A1V || EEc == C5UI.A00) {
                EEc = new C25309BIe(AJX, A1D, A00, 2);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1T(c5Tl);
            C5UX.A03(c5Tl, c0eB, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(-1380009347);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i2 = 23;
            C30494Dbd.A01(ASZ, i, i2);
        }
    }
}
