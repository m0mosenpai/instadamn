package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60542pd {
    public static void A02(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2) {
        BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) fragmentActivity;
        C56352iT c56352iT = baseFragmentActivity.A02;
        if (c56352iT == null) {
            InterfaceC09390do interfaceC09390do = baseFragmentActivity.A04;
            if (interfaceC09390do == null) {
                C14360o3.A0F("actionBarServiceProvider");
                throw C00O.createAndThrow();
            }
            c56352iT = (C56352iT) interfaceC09390do.getValue();
        }
        C3DM.A00(A00(abstractC10360h2), c56352iT);
    }

    public static Fragment A00(AbstractC10360h2 abstractC10360h2) {
        Fragment A0O = abstractC10360h2.A0O(R.id.layout_container_main);
        if (A0O instanceof C60552pe) {
            return ((C60552pe) A0O).A02(null);
        }
        return A0O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (((X.C3KA) r8).Cdf() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r0 == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(androidx.fragment.app.Fragment r8, final androidx.fragment.app.FragmentActivity r9) {
        /*
            r0 = 2131435248(0x7f0b1ef0, float:1.8492333E38)
            r6 = r9
            android.view.View r3 = r9.requireViewById(r0)
            r0 = 2131444001(0x7f0b4121, float:1.8510086E38)
            android.view.View r4 = r9.findViewById(r0)
            r0 = 2131435317(0x7f0b1f35, float:1.8492473E38)
            android.view.View r5 = r9.findViewById(r0)
            boolean r0 = r8 instanceof X.C3KA
            r1 = 1
            if (r0 == 0) goto L25
            r0 = r8
            X.3KA r0 = (X.C3KA) r0
            boolean r0 = r0.Cdf()
            r7 = 1
            if (r0 != 0) goto L26
        L25:
            r7 = 0
        L26:
            boolean r0 = r8 instanceof X.InterfaceC60172oz
            if (r0 == 0) goto L33
            X.2oz r8 = (X.InterfaceC60172oz) r8
            boolean r0 = r8.Cen()
            r8 = 1
            if (r0 != 0) goto L34
        L33:
            r8 = 0
        L34:
            X.3KB r2 = new X.3KB
            r2.<init>()
            X.C57982lB.A00(r9, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC60542pd.A01(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2) {
        int i;
        Fragment A00 = A00(abstractC10360h2);
        if (A00 != 0 && A00.mView != null) {
            C56352iT AYT = ((BaseFragmentActivity) fragmentActivity).AYT();
            if (AYT != null && ((!(A00 instanceof InterfaceC60112ot) || !((InterfaceC60112ot) A00).CPM()) && AYT.A0A && (A00 instanceof InterfaceC60122ou))) {
                int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                if (!AbstractC60622pl.A01(A00)) {
                    i = C3HB.A00(fragmentActivity);
                    fragmentActivity.requireViewById(R.id.layout_container_main).setPadding(0, i, 0, 0);
                }
            }
            i = 0;
            fragmentActivity.requireViewById(R.id.layout_container_main).setPadding(0, i, 0, 0);
        }
    }

    public static void A04(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, UserSession userSession) {
        A02(fragmentActivity, abstractC10360h2);
        A03(fragmentActivity, abstractC10360h2);
        if (AbstractC56402iY.A09()) {
            Fragment A00 = A00(abstractC10360h2);
            if (A00 instanceof AbstractC59962oe) {
                AbstractC56402iY.A05(fragmentActivity, ((AbstractC59962oe) A00).getStatusBarType());
            }
        }
        Fragment A002 = A00(abstractC10360h2);
        if (A002 != null && A002.mView != null) {
            A01(A002, fragmentActivity);
        }
        A05(fragmentActivity, abstractC10360h2, userSession);
    }

    public static void A05(final FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, final UserSession userSession) {
        C57982lB c57982lB;
        List list;
        final Fragment A0O = abstractC10360h2.A0O(R.id.layout_container_main);
        if (A0O != null && A0O.mView != null) {
            final View requireViewById = fragmentActivity.requireViewById(R.id.layout_container_center_right_coordinator_layout);
            if (true == C57982lB.A09 && (c57982lB = (C57982lB) C57982lB.A0C.get(fragmentActivity)) != null && (list = c57982lB.A01) != null) {
                list.clear();
            }
            C57982lB.A00(fragmentActivity, new InterfaceC59892oW() { // from class: X.3KC
                /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
                
                    if (((X.InterfaceC53712dA) r3).C4u() != 8) goto L14;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC59892oW
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void Dnp(int r10, int r11) {
                    /*
                        r9 = this;
                        androidx.fragment.app.Fragment r2 = r2
                        androidx.fragment.app.FragmentActivity r3 = r3
                        com.instagram.common.session.UserSession r4 = r4
                        android.view.View r7 = r1
                        android.view.View r0 = r2.mView
                        if (r0 == 0) goto Lb0
                        boolean r0 = r2 instanceof X.C72743Nv
                        if (r0 == 0) goto L2f
                        X.3Nv r2 = (X.C72743Nv) r2
                        com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r2.A09
                        boolean r0 = r1.A0f
                        if (r0 != 0) goto L1c
                        boolean r0 = r1.A0g
                        if (r0 == 0) goto L2f
                    L1c:
                        boolean r0 = X.C72743Nv.A06(r2)
                        if (r0 != 0) goto L2f
                        r0 = r3
                        X.2dA r0 = (X.InterfaceC53712dA) r0
                        int r1 = r0.C4u()
                        r0 = 8
                        r8 = 1
                        r6 = 0
                        if (r1 == r0) goto L31
                    L2f:
                        r8 = 0
                        r6 = r11
                    L31:
                        boolean r2 = r3 instanceof com.instagram.base.activity.BaseFragmentActivity
                        if (r2 == 0) goto L69
                        if (r8 == 0) goto L69
                        android.content.res.Resources r1 = r3.getResources()
                        int r0 = X.AbstractC57322k7.A01(r4)
                        int r0 = X.AbstractC53242c7.A0H(r3, r0)
                        int r5 = r1.getDimensionPixelOffset(r0)
                        int r5 = r5 - r11
                        r4 = r3
                        com.instagram.base.activity.BaseFragmentActivity r4 = (com.instagram.base.activity.BaseFragmentActivity) r4
                        r4.A00 = r5
                        X.0xy r0 = X.C17280tP.A4E
                        X.0tP r1 = r0.A00()
                        boolean r0 = r1.A0g()
                        if (r0 == 0) goto L5c
                        r4.DA3(r1)
                    L5c:
                        r0 = 2131444104(0x7f0b4188, float:1.8510295E38)
                        android.view.View r1 = r3.findViewById(r0)
                        if (r1 == 0) goto L69
                        float r0 = (float) r5
                        r1.setTranslationY(r0)
                    L69:
                        X.AbstractC13880nE.A0U(r7, r6)
                        if (r8 != 0) goto L6f
                        r11 = 0
                    L6f:
                        X.3DO r0 = X.C3DN.A00
                        X.3DN r1 = r0.A00(r3)
                        if (r1 == 0) goto L86
                        X.3DP r1 = (X.C3DP) r1
                        boolean r0 = r1.A0h
                        if (r0 == 0) goto L86
                        android.view.View r0 = X.C3DP.A00(r1)
                        if (r0 == 0) goto L86
                        X.AbstractC13880nE.A0U(r0, r11)
                    L86:
                        r0 = 2131440853(0x7f0b34d5, float:1.8503701E38)
                        android.view.View r0 = r3.findViewById(r0)
                        if (r0 == 0) goto L92
                        X.AbstractC13880nE.A0U(r0, r11)
                    L92:
                        if (r2 == 0) goto La4
                        r0 = r3
                        com.instagram.base.activity.BaseFragmentActivity r0 = (com.instagram.base.activity.BaseFragmentActivity) r0
                        X.3O0 r2 = r0.By1()
                        java.lang.Integer r1 = r2.A0B
                        java.lang.Integer r0 = X.C05F.A00
                        if (r1 != r0) goto La4
                        r2.A05(r11)
                    La4:
                        r0 = 2131429052(0x7f0b06bc, float:1.8479766E38)
                        android.view.View r0 = r3.findViewById(r0)
                        if (r0 == 0) goto Lb0
                        X.AbstractC13880nE.A0U(r0, r11)
                    Lb0:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C3KC.Dnp(int, int):void");
                }
            }, false);
        }
    }
}
