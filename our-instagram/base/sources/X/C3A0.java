package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.user.model.User;

/* renamed from: X.3A0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3A0 extends C3A1 {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final AnonymousClass386 A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3A0(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, AnonymousClass386 anonymousClass386, boolean z) {
        super(C3A2.A00);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = anonymousClass386;
        this.A04 = z;
    }

    public static final void A00(C5Tl c5Tl, C5yI c5yI, InterfaceC132365yF interfaceC132365yF, C132345yD c132345yD, C3A0 c3a0, TifuViewModel tifuViewModel, User user, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        c5Tl.Enr(24926339);
        if ((i & 6) == 0) {
            i2 = (c5Tl.AH4(tifuViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5Tl.AH4(interfaceC132365yF) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5Tl.AH4(c5yI) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5Tl.AH6(c132345yD) ? C3OO.FLAG_MOVED : 1024;
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= c5Tl.AH6(interfaceC16660sJ) ? Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET : 8192;
        }
        if ((196608 & i) == 0) {
            boolean AH6 = c5Tl.AH6(user);
            int i3 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
            if (AH6) {
                i3 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            i2 |= i3;
        }
        if ((1572864 & i) == 0) {
            boolean AH5 = c5Tl.AH5(z);
            int i4 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (AH5) {
                i4 = 1048576;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            i2 |= c5Tl.AH6(c3a0) ? DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE : 4194304;
        }
        if ((4793491 & i2) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-832714336, "com.instagram.feed.tifu.TifuNetegoComposeBinder.TifuRoot (TifuNetegoComposeBinder.kt:221)");
            }
            Object EEc = c5Tl.EEc();
            Object obj = C5UI.A00;
            if (EEc == obj) {
                EEc = new C137536Kz(C5UX.A00(c5Tl, AnonymousClass191.A00));
                c5Tl.FBy(EEc);
            }
            C19L c19l = ((C137536Kz) EEc).A00;
            c5Tl.Eno(1651427444);
            int i5 = i2 & 14;
            boolean z2 = i5 == 4;
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == obj) {
                EEc2 = new C206649Cv(tifuViewModel, null, 20);
                c5Tl.FBy(EEc2);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            Integer num = C05F.A00;
            AbstractC23641Du.A03(num, anonymousClass191, (InterfaceC16620sF) EEc2, c19l);
            c5Tl.Eno(1651429046);
            if (c3a0.A04) {
                if (C18U.A06(C06090Tz.A05, c3a0.A02, 36326266455013161L)) {
                    c5Tl.Eno(1651434268);
                    boolean z3 = i5 == 4;
                    Object EEc3 = c5Tl.EEc();
                    if (z3 || EEc3 == obj) {
                        EEc3 = new C206649Cv(tifuViewModel, null, 21);
                        c5Tl.FBy(EEc3);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    AbstractC23641Du.A03(num, anonymousClass191, (InterfaceC16620sF) EEc3, c19l);
                    c5Tl.Eno(1651436635);
                    boolean z4 = i5 == 4;
                    Object EEc4 = c5Tl.EEc();
                    if (z4 || EEc4 == obj) {
                        EEc4 = new C206649Cv(tifuViewModel, null, 22);
                        c5Tl.FBy(EEc4);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    AbstractC23641Du.A03(num, anonymousClass191, (InterfaceC16620sF) EEc4, c19l);
                }
            }
            C117505Tk.A0L(c117505Tk, false);
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, tifuViewModel.A0G, 0);
            Context context = (Context) c5Tl.AJX(AndroidCompositionLocals_androidKt.A01);
            c5Tl.Eno(1651443223);
            boolean AH62 = c5Tl.AH6(c3a0) | (i5 == 4);
            Object EEc5 = c5Tl.EEc();
            if (AH62 || EEc5 == obj) {
                EEc5 = new C9F4(16, tifuViewModel, c3a0);
                c5Tl.FBy(EEc5);
            }
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc5;
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(1651452671);
            boolean AH63 = c5Tl.AH6(c19l) | (i5 == 4) | c5Tl.AH6(c3a0);
            Object EEc6 = c5Tl.EEc();
            if (AH63 || EEc6 == obj) {
                EEc6 = new C9FO(22, c3a0, c19l, tifuViewModel);
                c5Tl.FBy(EEc6);
            }
            InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) EEc6;
            C117505Tk.A0L(c117505Tk, false);
            C14360o3.A0B(interfaceC16660sJ2, 0);
            c132345yD.A00 = interfaceC16660sJ2;
            c5Tl.Eno(1651457697);
            boolean AH64 = c5Tl.AH6(c19l) | (i5 == 4);
            Object EEc7 = c5Tl.EEc();
            if (AH64 || EEc7 == obj) {
                EEc7 = new C207169Ev(12, c19l, tifuViewModel);
                c5Tl.FBy(EEc7);
            }
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) EEc7;
            C117505Tk.A0L(c117505Tk, false);
            C14360o3.A0B(interfaceC16620sF, 0);
            c132345yD.A01 = interfaceC16620sF;
            C5VW.A03(c5Tl, c3a0.A02, c3a0.A01.getModuleName(), C5UA.A01(c5Tl, new C136436Fw(context, A02, c5yI, interfaceC132365yF, c3a0, tifuViewModel, user, interfaceC16820sZ, interfaceC16660sJ, c19l, z), -1060022731), 196608, 28, false, false, false);
            if (C0fH.A02()) {
                C0fH.A00(-1419730718);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWP(c3a0, tifuViewModel, interfaceC132365yF, c5yI, c132345yD, interfaceC16660sJ, user, i, 0, z);
        }
    }
}
