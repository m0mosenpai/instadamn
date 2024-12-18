package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.9E6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9E6 extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9E6(Object obj, int i) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C59062n7 c59062n7;
        InterfaceC57162jr interfaceC57162jr;
        String str;
        boolean z;
        final Drawable AM6;
        switch (this.A00) {
            case 0:
                Resources resources = (Resources) obj;
                C3QA c3qa = (C3QA) obj2;
                C27771Wf c27771Wf = (C27771Wf) obj3;
                C14360o3.A0B(resources, 0);
                C14360o3.A0B(c3qa, 1);
                C14360o3.A0B(c27771Wf, 2);
                C1WM c1wm = (C1WM) this.A01;
                C1VI.A00();
                String A00 = AbstractC111324zv.A00(2631);
                Boolean bool = true;
                C1WA c1wa = c27771Wf.A0I;
                if (c1wa == null || (AM6 = c1wa.AM6(resources, c27771Wf, c3qa)) == null) {
                    if (c3qa instanceof C3QE) {
                        Bitmap CCP = ((C3QE) c3qa).CCP();
                        C14360o3.A07(CCP);
                        return new C3QM(CCP, bool.equals(c3qa.B3v().get(A00)));
                    }
                    AM6 = c1wm.A01.AM6(resources, c27771Wf, c3qa);
                    if (AM6 == null) {
                        return null;
                    }
                }
                if (AM6 instanceof Animatable) {
                    final Animatable animatable = (Animatable) AM6;
                    final boolean z2 = c27771Wf.A0S;
                    return new C59432nm(animatable, AM6, z2) { // from class: X.9YO
                        public final Animatable A00;
                        public final boolean A01;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(AM6);
                            C14360o3.A0B(animatable, 2);
                            this.A00 = animatable;
                            this.A01 = z2;
                        }

                        @Override // X.AbstractC59442nn
                        public final void A03() {
                            if (this.A01) {
                                this.A00.start();
                            }
                        }

                        @Override // X.AbstractC59442nn
                        public final void A04() {
                            if (this.A01) {
                                this.A00.stop();
                            }
                        }
                    };
                }
                return new C59432nm(AM6);
            case 1:
                Modifier modifier = (Modifier) obj;
                C5Tl c5Tl = (C5Tl) obj2;
                int intValue = ((Number) obj3).intValue();
                C14360o3.A0B(modifier, 0);
                if ((intValue & 6) == 0) {
                    int i = 2;
                    if (c5Tl.AH4(modifier)) {
                        i = 4;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) == 18 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(-1655533909, "com.instagram.feed.adapter.row.ufi.compose.IconRow.<anonymous>.<anonymous>.<anonymous> (ComposeMediaUFIComponent.kt:180)");
                    }
                    C206209Bd c206209Bd = (C206209Bd) this.A01;
                    C2DC c2dc = (C2DC) c206209Bd.A02;
                    c5Tl.Eno(-850852332);
                    boolean AH4 = c5Tl.AH4(c206209Bd);
                    Object EEc = c5Tl.EEc();
                    if (AH4 || EEc == C5UI.A00) {
                        EEc = new DGY(c206209Bd, 31);
                        c5Tl.FBy(EEc);
                    }
                    InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk, false);
                    c5Tl.Eno(-850847551);
                    Object obj4 = c206209Bd.A01;
                    if (obj4 != null) {
                        c5Tl.Eno(-334204616);
                        Object EEc2 = c5Tl.EEc();
                        Object obj5 = C5UI.A00;
                        if (EEc2 == obj5) {
                            C74883Yd A002 = AbstractC74873Yc.A00();
                            InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
                            EEc2 = new ParcelableSnapshotMutableState(A002, null);
                            c5Tl.FBy(EEc2);
                        }
                        C117505Tk.A0L(c117505Tk, false);
                        C1130158n c1130158n = Modifier.A00;
                        c5Tl.Eno(-334198408);
                        Object EEc3 = c5Tl.EEc();
                        if (EEc3 == obj5) {
                            EEc3 = new DRQ(EEc2, 48);
                            c5Tl.FBy(EEc3);
                        }
                        C117505Tk.A0L(c117505Tk, false);
                        Modifier A003 = C5YF.A00(c1130158n, (InterfaceC16660sJ) EEc3);
                        c5Tl.Eno(-334192016);
                        boolean AH42 = c5Tl.AH4(obj4);
                        Object EEc4 = c5Tl.EEc();
                        if (AH42 || EEc4 == obj5) {
                            EEc4 = new D8M(22, EEc2, obj4);
                            c5Tl.FBy(EEc4);
                        }
                        C117505Tk.A0L(c117505Tk, false);
                        modifier = modifier.Eq3(AbstractC118705Yo.A00(A003, (InterfaceC16820sZ) EEc4));
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    AbstractC28056CYk.A01(c5Tl, modifier, c2dc, interfaceC16820sZ, 0, 0);
                    if (C0fH.A02()) {
                        C0fH.A00(1953962583);
                    }
                }
                return C0eB.A00;
            case 2:
                final EnumC77813e7 enumC77813e7 = (EnumC77813e7) obj;
                final Activity activity = (Activity) obj2;
                final View view = (View) obj3;
                C14360o3.A0B(enumC77813e7, 0);
                final C75563aN c75563aN = (C75563aN) this.A01;
                C11T.A04(new Runnable() { // from class: X.4e3
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserSession userSession;
                        C149686oL c149686oL;
                        InterfaceC14020nS A004;
                        AbstractRunnableC14200nk abstractRunnableC14200nk;
                        final C75563aN c75563aN2 = c75563aN;
                        EnumC77813e7 enumC77813e72 = enumC77813e7;
                        Activity activity2 = activity;
                        View view2 = view;
                        if (activity2 != null && view2 != null) {
                            int ordinal = enumC77813e72.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        if (ordinal != 3) {
                                            if (ordinal != 4) {
                                                throw new RuntimeException();
                                            }
                                            return;
                                        }
                                        userSession = c75563aN2.A00;
                                        C23031Ai A005 = AbstractC23021Ah.A00(userSession);
                                        if (!((Boolean) A005.A7d.CES(A005, C23031Ai.A8c[273])).booleanValue()) {
                                            InterfaceC14020nS A006 = C14120nc.A00();
                                            C14360o3.A07(A006);
                                            A006.ATO(new AbstractRunnableC14200nk() { // from class: X.9ia
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C23031Ai A007 = AbstractC23021Ah.A00(C75563aN.this.A00);
                                                    AbstractC167007dF.A1L(A007, A007.A7d, C23031Ai.A8c, 273, true);
                                                }

                                                {
                                                    super(1618983419, 3, false, false);
                                                }
                                            });
                                            c149686oL = new C149686oL(2131973251);
                                            C5SU c5su = new C5SU(activity2, c149686oL);
                                            c5su.A03(view2);
                                            c5su.A06(EnumC58132lV.A03);
                                            c5su.A00 = 5000;
                                            c5su.A00().A07(userSession);
                                            return;
                                        }
                                        return;
                                    }
                                    userSession = c75563aN2.A00;
                                    C23031Ai A007 = AbstractC23021Ah.A00(userSession);
                                    if (!((Boolean) A007.A7X.CES(A007, C23031Ai.A8c[274])).booleanValue()) {
                                        c149686oL = new C149686oL(2131969670);
                                        A004 = C14120nc.A00();
                                        C14360o3.A07(A004);
                                        abstractRunnableC14200nk = new AbstractRunnableC14200nk() { // from class: X.9ic
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C23031Ai A008 = AbstractC23021Ah.A00(C75563aN.this.A00);
                                                AbstractC167007dF.A1L(A008, A008.A7X, C23031Ai.A8c, 274, true);
                                            }

                                            {
                                                super(1618983419, 3, false, false);
                                            }
                                        };
                                    } else {
                                        return;
                                    }
                                } else {
                                    userSession = c75563aN2.A00;
                                    if (AbstractC23021Ah.A00(userSession).A01.getInt("pin_reels_to_grid_for_feed_view_nux", 0) < 3 && !C75563aN.A0E.getAndSet(true)) {
                                        c149686oL = new C149686oL(2131969669);
                                        A004 = C14120nc.A00();
                                        C14360o3.A07(A004);
                                        abstractRunnableC14200nk = new AbstractRunnableC14200nk() { // from class: X.9ib
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                InterfaceC19630xq A0x = AbstractC166987dD.A0x(C75563aN.this.A00);
                                                int i2 = A0x.getInt("pin_reels_to_grid_for_feed_view_nux", 0);
                                                if (i2 < 3) {
                                                    InterfaceC19610xo ARD = A0x.ARD();
                                                    ARD.E7D("pin_reels_to_grid_for_feed_view_nux", i2 + 1);
                                                    ARD.apply();
                                                }
                                            }

                                            {
                                                super(1618983419, 3, false, false);
                                            }
                                        };
                                    } else {
                                        return;
                                    }
                                }
                                A004.ATO(abstractRunnableC14200nk);
                                C5SU c5su2 = new C5SU(activity2, c149686oL);
                                c5su2.A03(view2);
                                c5su2.A06(EnumC58132lV.A03);
                                c5su2.A00 = 5000;
                                c5su2.A00().A07(userSession);
                                return;
                            }
                            C149686oL c149686oL2 = new C149686oL(2131962126);
                            InterfaceC14020nS A008 = C14120nc.A00();
                            C14360o3.A07(A008);
                            A008.ATO(new AbstractRunnableC14200nk() { // from class: X.9iZ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    InterfaceC19610xo ARD = AbstractC149676oK.A00(C75563aN.this.A00).A01.ARD();
                                    ARD.E77("is_content_preview_nux_in_media_header_shown", true);
                                    ARD.apply();
                                }

                                {
                                    super(1618983419, 3, false, false);
                                }
                            });
                            C5SU c5su3 = new C5SU(activity2, c149686oL2);
                            c5su3.A03(view2);
                            c5su3.A01();
                            c5su3.A00 = 5000;
                            c5su3.A00().A07(c75563aN2.A00);
                        }
                    }
                }, 100L);
                return C0eB.A00;
            case 3:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                C3FP c3fp = (C3FP) obj3;
                C14360o3.A0B(c3fp, 2);
                ((C39D) this.A01).EmC(c3fp, intValue2, intValue3);
                return C0eB.A00;
            case 4:
                c59062n7 = (C59062n7) obj;
                interfaceC57162jr = (InterfaceC57162jr) obj2;
                str = (String) obj3;
                z = false;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                C14360o3.A0B(str, 2);
                ((AbstractC64292vo) this.A01).A02(c59062n7, interfaceC57162jr, str, z);
                return C0eB.A00;
            case 5:
                c59062n7 = (C59062n7) obj;
                interfaceC57162jr = (InterfaceC57162jr) obj2;
                str = (String) obj3;
                C14360o3.A0B(c59062n7, 0);
                z = true;
                C14360o3.A0B(interfaceC57162jr, 1);
                C14360o3.A0B(str, 2);
                Map map = C115775Lq.A02;
                C115785Lr c115785Lr = (C115785Lr) map.get(str);
                if (c115785Lr == null) {
                    c115785Lr = new C115785Lr();
                }
                c115785Lr.A02 = true;
                map.put(str, c115785Lr);
                ((AbstractC64292vo) this.A01).A02(c59062n7, interfaceC57162jr, str, z);
                return C0eB.A00;
            case 6:
                EnumC73363Qm enumC73363Qm = (EnumC73363Qm) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                C14360o3.A0B(enumC73363Qm, 1);
                ((C61222qk) this.A01).A22.A0Q(enumC73363Qm, (C5GM) obj, booleanValue);
                return C0eB.A00;
            default:
                return new DRY(47, this.A01, obj2);
        }
    }
}
