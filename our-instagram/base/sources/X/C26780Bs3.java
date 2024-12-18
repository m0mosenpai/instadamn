package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bs3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26780Bs3 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ThreadDeletionFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    public final void A06(C5Tl c5Tl, ImageUrl imageUrl, ImageUrl imageUrl2, int i) {
        int i2;
        C14360o3.A0B(imageUrl, 0);
        c5Tl.Enr(-1714787105);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, imageUrl2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1239630266, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.DoubleAvatarFacePile (ThreadDeletionFragment.kt:260)");
            }
            BII.A01(c5Tl, null, AbstractC25226BEj.A0w(c5Tl, imageUrl, i2), AbstractC25226BEj.A0w(c5Tl, imageUrl2, i2 >> 3), BI3.A03.A02.AeZ(), 0.0f, 0.75f, 817889280, 340, AbstractC25226BEj.A09(c5Tl), 0L, false, true);
            if (C0fH.A02()) {
                C0fH.A00(1439120722);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(this, imageUrl2, imageUrl, i, 45);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r2 == 0) goto L13;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r7) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.0do r5 = r6.A01
            java.lang.Object r0 = r5.getValue()
            X.JmB r0 = (X.C44505JmB) r0
            X.05A r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Mtj r0 = (X.C51760Mtj) r0
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto La2
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto La2
        L23:
            r4 = 0
            r3 = 1
            if (r2 != 0) goto L96
            android.content.Context r1 = r6.requireContext()
            r0 = 2131960613(0x7f132325, float:1.95579E38)
            java.lang.String r0 = r1.getString(r0)
        L32:
            r7.setTitle(r0)
            r1 = 68
            X.ClF r0 = new X.ClF
            r0.<init>(r6, r1)
            r7.EkT(r0, r3)
            java.lang.Object r0 = r5.getValue()
            X.JmB r0 = (X.C44505JmB) r0
            X.05A r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Mtj r0 = (X.C51760Mtj) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r2) goto L5d
            r4 = 1
            r3 = 2131976214(0x7f136016, float:1.9589542E38)
            if (r2 != 0) goto L60
        L5d:
            r3 = 2131973225(0x7f135469, float:1.958348E38)
        L60:
            if (r0 == 0) goto L95
            java.lang.Object r0 = r5.getValue()
            X.JmB r0 = (X.C44505JmB) r0
            X.05A r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Mtj r0 = (X.C51760Mtj) r0
            java.lang.Object r1 = r0.A01
            java.lang.Integer r0 = X.C05F.A00
            boolean r1 = X.AbstractC167007dF.A1X(r1, r0)
            r2 = 0
            android.content.Context r0 = r6.getContext()
            if (r1 == 0) goto Lc2
            if (r0 == 0) goto L85
            java.lang.String r2 = r0.getString(r3)
        L85:
            X.2iT r7 = (X.C56352iT) r7
            X.C56352iT.A0G(r7)
            if (r2 == 0) goto L95
            int r0 = r2.length()
            if (r0 == 0) goto L95
            r7.AAD(r2)
        L95:
            return
        L96:
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r6)
            r0 = 2131820848(0x7f110130, float:1.9274423E38)
            java.lang.String r0 = X.AbstractC167017dG.A0k(r1, r2, r0)
            goto L32
        La2:
            java.util.Iterator r1 = r1.iterator()
        La6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            X.Bg8 r0 = (X.C26079Bg8) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto La6
            int r2 = r2 + 1
            if (r2 >= 0) goto La6
            X.AbstractC16960so.A1T()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lc2:
            if (r0 == 0) goto Lc8
            java.lang.String r2 = r0.getString(r3)
        Lc8:
            r1 = 2
            X.LOy r0 = new X.LOy
            r0.<init>(r1, r6, r4)
            r7.Ect(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26780Bs3.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_thread_deletion";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 2), C07Y.A00(viewLifecycleOwner));
    }

    public final void A05(LazyListState lazyListState, C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        AbstractC167017dG.A1O(lazyListState, interfaceC16820sZ);
        c5Tl.Enr(1611941838);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, lazyListState) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i5);
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i4 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                i5 = 5;
            }
            if (C0fH.A02()) {
                C0fH.A01(1129782165, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.AutoLoadMore (ThreadDeletionFragment.kt:223)");
            }
            InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, interfaceC16820sZ);
            Integer valueOf = Integer.valueOf(i5);
            c5Tl.Eno(1315617849);
            boolean A1V = AbstractC25228BEl.A1V(c5Tl, A00, AbstractC167007dF.A1P(i4 & 14, 4), AbstractC25228BEl.A1T(i4));
            Object EEc = c5Tl.EEc();
            if (A1V || EEc == C5UI.A00) {
                EEc = new C50530MSj(lazyListState, A00, null, i5, 10);
                c5Tl.FBy(EEc);
            }
            AbstractC25231BEo.A11(c5Tl, EEc, valueOf);
            if (C0fH.A02()) {
                C0fH.A00(856652904);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUH(lazyListState, interfaceC16820sZ, this, i5, i2, i3, 3);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C26780Bs3() {
        C37056GUm c37056GUm = new C37056GUm(this, 1);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new MHJ(new MHJ(this, 48), 49));
        this.A01 = AbstractC25225BEi.A0a(new C37056GUm(A00, 0), c37056GUm, new MHU(32, null, A00), AbstractC25225BEi.A1D(C44505JmB.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    public static final void A00(C5Tl c5Tl, C51760Mtj c51760Mtj, CP1 cp1, C26780Bs3 c26780Bs3, int i) {
        int i2;
        boolean z;
        C5UU ASZ;
        int i3;
        c5Tl.Enr(-2049716940);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, cp1) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c51760Mtj);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c26780Bs3);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-71178211, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.DeleteButton (ThreadDeletionFragment.kt:276)");
            }
            Object obj = c51760Mtj.A02;
            Integer num = C05F.A01;
            if (obj == num && ((List) c51760Mtj.A00).isEmpty()) {
                if (C0fH.A02()) {
                    C0fH.A00(-1138672256);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 41;
                ASZ.A06 = C30509Dbs.A01(c26780Bs3, cp1, c51760Mtj, i, i3);
            }
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A06;
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A01 = AbstractC119595bH.A01(interfaceC118305Ws, c5Tl, interfaceC118245Wl);
            boolean z2 = false;
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A01, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            AbstractC25229BEm.A16(c5Tl, AbstractC118185Wd.A08(AbstractC25226BEj.A0T(c1130158n), 1.0f / AbstractC25228BEl.A0h(c5Tl).Awk()), AbstractC25225BEi.A0D(c5Tl));
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131960611);
            C6N c6n = C6N.A03;
            if (c51760Mtj.A01 == num) {
                List list = (List) c51760Mtj.A00;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((C26079Bg8) it.next()).A05) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c26780Bs3, 1193817932);
            int i4 = i2 & 14;
            if (i4 == 4) {
                z2 = true;
            }
            boolean z3 = z2 | A1Z;
            Object EEc = c5Tl.EEc();
            if (z3 || EEc == C5UI.A00) {
                EEc = new MHU(27, cp1, c26780Bs3);
                c5Tl.FBy(EEc);
            }
            C117505Tk.A0I(c117505Tk);
            CGM.A00(c5Tl, null, c6n, A002, (InterfaceC16820sZ) EEc, 3072, 4, z);
            A01(c5Tl, c51760Mtj, cp1, c26780Bs3, (i2 & 112) | i4 | (i2 & 896));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1494665453);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 42;
            ASZ.A06 = C30509Dbs.A01(c26780Bs3, cp1, c51760Mtj, i, i3);
        }
    }

    public static final void A01(C5Tl c5Tl, C51760Mtj c51760Mtj, CP1 cp1, C26780Bs3 c26780Bs3, int i) {
        int i2;
        int i3;
        C5UU ASZ;
        int i4;
        c5Tl.Enr(1091358381);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, cp1) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c51760Mtj);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c26780Bs3);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1294177820, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.DeletionDialog (ThreadDeletionFragment.kt:310)");
            }
            if (!AbstractC25230BEn.A1X(cp1.A00)) {
                if (C0fH.A02()) {
                    C0fH.A00(192585672);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i4 = 43;
                ASZ.A06 = C30509Dbs.A01(c26780Bs3, cp1, c51760Mtj, i, i4);
            }
            List list = (List) c51760Mtj.A00;
            boolean z = false;
            if ((list instanceof Collection) && list.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it = list.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    if (((C26079Bg8) it.next()).A05 && (i3 = i3 + 1) < 0) {
                        AbstractC16960so.A1T();
                        throw C00O.createAndThrow();
                    }
                }
            }
            AbstractC25228BEl.A0w(c26780Bs3).A02.markerPoint(834879336, "delete_popup_impression");
            c5Tl.Eno(-806572923);
            int i5 = i2 & 14;
            boolean A1P = AbstractC167007dF.A1P(i5, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new MHJ(cp1, 45);
                c5Tl.FBy(EEc);
            }
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            String A02 = AbstractC136736Hc.A02(c5Tl, AbstractC25228BEl.A1Y(i3), R.plurals.direct_thread_deletion_confirmation_dialog_title_with_count, i3);
            String A00 = AbstractC136736Hc.A00(c5Tl, 2131960605);
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131960606);
            Integer num = C05F.A0C;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c26780Bs3, -806552890);
            Object EEc2 = c5Tl.EEc();
            if (A1Z || EEc2 == C5UI.A00) {
                EEc2 = new MHJ(c26780Bs3, 46);
                c5Tl.FBy(EEc2);
            }
            C26079Bg8 c26079Bg8 = new C26079Bg8(num, A002, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 12);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131960607);
            boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, c26780Bs3, -806539408);
            if (i5 == 4) {
                z = true;
            }
            boolean z2 = A1Z2 | z;
            Object EEc3 = c5Tl.EEc();
            if (z2 || EEc3 == C5UI.A00) {
                EEc3 = new MHU(28, cp1, c26780Bs3);
                c5Tl.FBy(EEc3);
            }
            AbstractC28433Cgh.A01(null, c5Tl, c26079Bg8, new C26079Bg8((Integer) null, A003, AbstractC25225BEi.A1A(c117505Tk, EEc3, false), 14), null, A02, A00, interfaceC16820sZ, 100663296, 3808, true);
            if (C0fH.A02()) {
                C0fH.A00(1433921907);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i4 = 44;
            ASZ.A06 = C30509Dbs.A01(c26780Bs3, cp1, c51760Mtj, i, i4);
        }
    }

    public static final void A02(C5Tl c5Tl, C51760Mtj c51760Mtj, C26780Bs3 c26780Bs3, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        c5Tl.Enr(89318171);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c51760Mtj) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1833312871, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.EmptyState (ThreadDeletionFragment.kt:135)");
            }
            if (c51760Mtj.A02 == C05F.A01 && !AbstractC25228BEl.A1X(c51760Mtj.A00)) {
                C2DC A0P = AbstractC25227BEk.A0P(c5Tl, R.drawable.instagram_app_messenger_outline_96);
                C1130158n c1130158n = Modifier.A00;
                C5YS.A01(c5Tl, AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(c1130158n), 0.0f, 32.0f, 0.0f, 0.0f), A0P, 432, 24, 0L);
                C5WR.A0T(c5Tl, AbstractC118175Wb.A0A(c1130158n, 0.0f, 12.0f), AbstractC25226BEj.A0e(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131960609), AbstractC25226BEj.A0G(c5Tl));
                AbstractC25235BEs.A1F(c5Tl, AbstractC25226BEj.A0g(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131960610));
                if (C0fH.A02()) {
                    C0fH.A00(1166499672);
                }
            } else {
                if (C0fH.A02()) {
                    C0fH.A00(-948144769);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 17;
                C30510Dbt.A01(ASZ, c26780Bs3, c51760Mtj, i, i3);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 18;
            C30510Dbt.A01(ASZ, c26780Bs3, c51760Mtj, i, i3);
        }
    }

    public static final void A03(C5Tl c5Tl, C51760Mtj c51760Mtj, C26780Bs3 c26780Bs3, int i) {
        int i2;
        c5Tl.Enr(1612450719);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c51760Mtj) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c26780Bs3);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1703728826, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.ThreadList (ThreadDeletionFragment.kt:158)");
            }
            boolean z = false;
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c26780Bs3, -2071213384);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new MHJ(c26780Bs3, 47);
                c5Tl.FBy(EEc);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            c26780Bs3.A05(A00, c5Tl, (InterfaceC16820sZ) EEc, 0, (i2 << 6) & 7168, 1);
            if (c51760Mtj.A01 == C05F.A01) {
                z = true;
            }
            boolean A1Y = AbstractC25226BEj.A1Y(c5Tl, z, AbstractC25233BEq.A1W(c5Tl, c51760Mtj, c26780Bs3, -2071205746));
            Object EEc2 = c5Tl.EEc();
            if (A1Y || EEc2 == C5UI.A00) {
                EEc2 = new BQB(13, c26780Bs3, c51760Mtj, z);
                c5Tl.FBy(EEc2);
            }
            C6IS.A05(A00, c5Tl, AbstractC25225BEi.A1B(c117505Tk, EEc2, false));
            if (C0fH.A02()) {
                C0fH.A00(-1074129113);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c26780Bs3, c51760Mtj, i, 19);
        }
    }

    public static final void A04(C26079Bg8 c26079Bg8, C26780Bs3 c26780Bs3) {
        C44505JmB A0w = AbstractC25228BEl.A0w(c26780Bs3);
        Object obj = c26079Bg8.A02;
        C14360o3.A0B(obj, 0);
        C05A c05a = A0w.A03.A07;
        List<C26079Bg8> list = (List) ((C51760Mtj) c05a.getValue()).A02;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (C26079Bg8 c26079Bg82 : list) {
            C3o9 c3o9 = (C3o9) c26079Bg82.A02;
            if (C14360o3.A0K(c3o9, obj)) {
                boolean z = !c26079Bg82.A05;
                String str = c26079Bg82.A04;
                String str2 = c26079Bg82.A03;
                AbstractC46437Kgx abstractC46437Kgx = (AbstractC46437Kgx) c26079Bg82.A01;
                C14360o3.A0B(c3o9, 0);
                AbstractC167017dG.A1Q(str, abstractC46437Kgx);
                c26079Bg82 = new C26079Bg8(abstractC46437Kgx, c3o9, str, str2, z);
            }
            A0q.add(c26079Bg82);
        }
        C51760Mtj c51760Mtj = (C51760Mtj) c05a.getValue();
        c05a.Egh(C51760Mtj.A03((Integer) c51760Mtj.A01, (Integer) c51760Mtj.A00, A0q));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-210971665);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 49), 751495226);
        C0f9.A09(-912175092, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(945018081);
        super.onDestroy();
        AbstractC25228BEl.A0w(this).A02.markerEnd(834879336, (short) 2);
        C0f9.A09(524494108, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1248951073);
        super.onDestroyView();
        KZT kzt = AbstractC25228BEl.A0w(this).A03;
        MQ1 mq1 = kzt.A05;
        mq1.BOD().stop();
        mq1.C7c().cancel();
        kzt.A02.A01();
        C0f9.A09(2090971474, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1660604083);
        super.onPause();
        MQ1 mq1 = AbstractC25228BEl.A0w(this).A03.A05;
        mq1.BOD().pause();
        mq1.C7c().EWh(false);
        C0f9.A09(2057857777, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1857234180);
        super.onResume();
        MQ1 mq1 = AbstractC25228BEl.A0w(this).A03.A05;
        mq1.BOD().EKd();
        mq1.C7c().EWh(true);
        C0f9.A09(1271100090, A02);
    }
}
