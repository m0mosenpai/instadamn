package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DvV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31665DvV {
    public TextView A00;
    public C44137Jf2 A01;
    public C2DS A02;
    public boolean A03;
    public View A04;
    public ViewStub A05;
    public TextView A06;
    public TextView A07;
    public final FragmentActivity A08;
    public final InterfaceC11380iw A09;
    public final UserSession A0A;
    public final C31663DvT A0B;
    public final C31660DvQ A0C;
    public final HashMap A0D = AbstractC166987dD.A1G();
    public final HashSet A0E = AbstractC166987dD.A1H();
    public final HashSet A0F = AbstractC166987dD.A1H();
    public final C31664DvU A0G;
    public final C193328hC A0H;

    public static final void A02(C31665DvV c31665DvV) {
        FragmentActivity fragmentActivity = c31665DvV.A08;
        UserSession userSession = c31665DvV.A0A;
        if (!C35244Fgd.A03(fragmentActivity, fragmentActivity, c31665DvV.A09, userSession, c31665DvV.A0C.A00(), -1, false)) {
            ArrayList A1E = AbstractC166987dD.A1E();
            HashMap hashMap = c31665DvV.A0D;
            java.util.Set<C3o9> keySet = hashMap.keySet();
            C14360o3.A07(keySet);
            boolean z = false;
            boolean z2 = false;
            for (C3o9 c3o9 : keySet) {
                if (c3o9 instanceof DirectThreadKey) {
                    C2DS c2ds = c31665DvV.A02;
                    if (c2ds == null) {
                        C14360o3.A0F("threadStore");
                        throw C00O.createAndThrow();
                    }
                    C81663kb B3U = c2ds.B3U(JRE.A01(c3o9));
                    if (B3U != null && B3U.CbK()) {
                        if (B3U.C7g() == 29) {
                            A1E.add(B3U);
                            z = true;
                            z2 = true;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            if (AbstractC25226BEj.A1b(A1E)) {
                C142846ck A00 = AbstractC147806l5.A00(userSession);
                ArrayList A0q = AbstractC167017dG.A0q(A1E);
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    AbstractC166997dE.A1W(A0q, ((C2EE) it.next()).AdZ());
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    String C7I = ((C2ED) it2.next()).C7I();
                    if (C7I != null) {
                        A1E2.add(C7I);
                    }
                }
                ArrayList A1E3 = AbstractC166987dD.A1E();
                Iterator it3 = A1E.iterator();
                while (it3.hasNext()) {
                    String C7q = ((C2ED) it3.next()).C7q();
                    if (C7q != null) {
                        A1E3.add(C7q);
                    }
                }
                C25531Mh A0I = AbstractC31172DnG.A0I(A00);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put(MSV.A00(215), AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A1E2, null));
                    A1G.put("consistent_thread_fbid", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A1E3, null));
                    AbstractC31175DnJ.A1B(A0I, A00);
                    AbstractC31174DnI.A1I(A0I, "bulk_delete_broadcast_chat_dialog_rendered");
                    A0I.A0o("inbox_multiselect_thread_options");
                    A0I.A0p("inbox");
                    A0I.A0n(C142846ck.A06(A0q));
                    A0I.A0v(A1G);
                    A0I.Cht();
                }
            }
            C193328hC c193328hC = c31665DvV.A0H;
            Resources resources = fragmentActivity.getResources();
            int i = R.plurals.multi_select_dialog_delete_chat_title;
            if (z) {
                i = R.plurals.multi_select_dialog_delete_channel_title;
            }
            c193328hC.A05 = resources.getQuantityString(i, hashMap.size(), AbstractC25228BEl.A1Y(hashMap.size()));
            int i2 = 2131967900;
            if (z2) {
                i2 = 2131967899;
            }
            c193328hC.A09(i2);
            c193328hC.A0G(DialogInterfaceOnClickListenerC35455FkC.A00(A1E, c31665DvV, 20));
            c193328hC.A0D(DialogInterfaceOnClickListenerC35455FkC.A00(A1E, c31665DvV, 21));
            AbstractC31178DnM.A1R(c193328hC, true);
            return;
        }
        A07(c31665DvV, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r3 = r5.A0A
            com.instagram.api.schemas.BizUserInboxState r4 = X.AbstractC31179DnN.A0E(r3)
            java.util.HashMap r0 = r5.A0D
            java.util.Set r0 = r0.entrySet()
            X.C14360o3.A07(r0)
            java.util.Iterator r2 = r0.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.util.Map$Entry r1 = X.AbstractC166987dD.A1K(r2)
            java.lang.Object r0 = r1.getKey()
            boolean r0 = r0 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.getValue()
            X.DoB r0 = (X.C31228DoB) r0
            int r1 = r0.A01
            r0 = 29
            if (r1 != r0) goto L13
            android.widget.TextView r0 = r5.A00
            X.AbstractC167007dF.A0x(r0)
        L36:
            return
        L37:
            X.DvQ r0 = r5.A0C
            X.2Dl r1 = r0.A00()
            X.2Dr r0 = X.C47032Dr.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L6c
            com.instagram.api.schemas.BizUserInboxState r0 = com.instagram.api.schemas.BizUserInboxState.A04
            if (r4 != r0) goto L6c
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36312694357230808(0x810234000004d8, double:3.027632358771992E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L6c
            android.widget.TextView r2 = r5.A00
            if (r2 == 0) goto L62
            androidx.fragment.app.FragmentActivity r1 = r5.A08
            r0 = 2130970313(0x7f0406c9, float:1.7549333E38)
        L5f:
            X.AbstractC31177DnL.A0q(r1, r2, r0)
        L62:
            android.widget.TextView r1 = r5.A00
            if (r1 == 0) goto L36
            r0 = 62
            X.ViewOnClickListenerC35680FpF.A00(r1, r0, r5)
            return
        L6c:
            android.widget.TextView r2 = r5.A00
            if (r2 == 0) goto L62
            androidx.fragment.app.FragmentActivity r1 = r5.A08
            r0 = 2130970280(0x7f0406a8, float:1.7549266E38)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31665DvV.A00():void");
    }

    public static final void A01(C31665DvV c31665DvV) {
        Boolean bool;
        DirectShareTarget directShareTarget;
        C31664DvU c31664DvU = c31665DvV.A0G;
        HashMap hashMap = c31665DvV.A0D;
        C37013GSs c37013GSs = new C37013GSs(c31665DvV, 28);
        C14360o3.A0B(hashMap, 0);
        C31228DoB c31228DoB = (C31228DoB) hashMap.get(AbstractC001800i.A09(hashMap.keySet()));
        String str = null;
        if (c31228DoB != null) {
            bool = Boolean.valueOf(c31228DoB.A08);
        } else {
            bool = null;
        }
        C31228DoB c31228DoB2 = (C31228DoB) hashMap.get(AbstractC001800i.A09(hashMap.keySet()));
        if (c31228DoB2 != null && (directShareTarget = c31228DoB2.A03) != null) {
            str = AbstractC31172DnG.A14(directShareTarget);
        }
        AbstractC35214Fg7.A02(c31664DvU.A00, new C36471G6v(c31664DvU, hashMap, c37013GSs, 0), bool, str, hashMap.size());
    }

    public static final void A03(C31665DvV c31665DvV) {
        int i;
        C31664DvU c31664DvU = c31665DvV.A0G;
        Map A0B = AbstractC06930Yk.A0B(c31665DvV.A0D);
        UserSession userSession = c31665DvV.A0A;
        InterfaceC11380iw interfaceC11380iw = c31665DvV.A09;
        AbstractC46972Dl A00 = c31665DvV.A0C.A00();
        C37013GSs c37013GSs = new C37013GSs(c31665DvV, 29);
        ArrayList A0n = AbstractC31180DnO.A0n(A0B);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0n.iterator();
        int i2 = 11;
        int i3 = 13;
        int i4 = 31;
        int i5 = 15;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        while (it.hasNext()) {
            C31228DoB c31228DoB = (C31228DoB) it.next();
            if (!c31228DoB.A0F) {
                z2 = true;
            }
            if (c31228DoB.A00 != 1) {
                i2 = 3;
            }
            if (!c31228DoB.A0B) {
                i3 = 8;
            }
            if (!c31228DoB.A0G) {
                i5 = 10;
            }
            int i6 = c31228DoB.A01;
            if (C4GR.A04(i6)) {
                z = true;
            }
            if (i6 == 29 && C14360o3.A0K(userSession.userId, c31228DoB.A06)) {
                if (!c31228DoB.A0E) {
                    i4 = 30;
                }
                z3 = true;
            } else {
                z4 = false;
            }
        }
        if (!z) {
            if (C2E8.A03(userSession)) {
                i = 45;
            } else {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36316289244860639L) && A00.equals(C47032Dr.A00)) {
                    i = 5;
                } else if (C18U.A06(c06090Tz, userSession, 36316289244860639L) && A00.equals(C46962Dk.A00)) {
                    i = 6;
                }
            }
            AbstractC166997dE.A1W(A1E, i);
        }
        if (z2) {
            AbstractC166997dE.A1W(A1E, 4);
        }
        AbstractC166997dE.A1W(A1E, i2);
        if (!z3) {
            AbstractC166997dE.A1W(A1E, i3);
        }
        if (z4) {
            AbstractC166997dE.A1W(A1E, i4);
        }
        if (!z) {
            AbstractC166997dE.A1W(A1E, i5);
        }
        Context context = c31664DvU.A00;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0f(new DialogInterfaceOnClickListenerC35449Fk6(0, A00, A0B, A1E, interfaceC11380iw, userSession, c37013GSs, c31664DvU), C31659DvP.A08.A00(context, userSession, A1E));
        AbstractC31178DnM.A1R(A0I, true);
    }

    public static final void A04(C31665DvV c31665DvV) {
        TextView textView;
        TextView textView2;
        if (c31665DvV.A04 == null) {
            ViewStub viewStub = c31665DvV.A05;
            TextView textView3 = null;
            if (viewStub == null) {
                C14360o3.A0F("multiSelectFooterViewStub");
                throw C00O.createAndThrow();
            }
            View inflate = viewStub.inflate();
            c31665DvV.A04 = inflate;
            AbstractC167007dF.A0x(inflate);
            View view = c31665DvV.A04;
            if (view != null) {
                textView = AbstractC166987dD.A0e(view, R.id.inbox_footer_button_left);
            } else {
                textView = null;
            }
            c31665DvV.A07 = textView;
            if (textView != null) {
                ViewOnClickListenerC35680FpF.A00(textView, 59, c31665DvV);
            }
            View view2 = c31665DvV.A04;
            if (view2 != null) {
                textView2 = AbstractC166987dD.A0e(view2, R.id.inbox_footer_button_mid);
            } else {
                textView2 = null;
            }
            c31665DvV.A00 = textView2;
            View view3 = c31665DvV.A04;
            if (view3 != null) {
                textView3 = (TextView) view3.findViewById(R.id.inbox_footer_button_right);
            }
            c31665DvV.A06 = textView3;
            if (textView3 != null) {
                ViewOnClickListenerC35680FpF.A00(textView3, 60, c31665DvV);
            }
            if (A08(c31665DvV)) {
                TextView textView4 = c31665DvV.A00;
                if (textView4 != null) {
                    ViewOnClickListenerC35680FpF.A00(textView4, 61, c31665DvV);
                    return;
                }
                return;
            }
            c31665DvV.A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C31665DvV r10) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31665DvV.A05(X.DvV):void");
    }

    public static final void A07(C31665DvV c31665DvV, boolean z) {
        c31665DvV.A03 = z;
        c31665DvV.A0D.clear();
        c31665DvV.A0E.clear();
        c31665DvV.A0F.clear();
        A05(c31665DvV);
        C31660DvQ c31660DvQ = c31665DvV.A0C;
        boolean z2 = c31665DvV.A03;
        JR3 jr3 = c31660DvQ.A00;
        JR2 jr2 = jr3.A05;
        if (jr2 != null) {
            ((InterfaceC50519MRw) jr2.A1j.getValue()).C7c().EWg(z2);
        }
        boolean z3 = !c31665DvV.A03;
        JR2 jr22 = jr3.A05;
        if (jr22 != null) {
            if (C2E8.A02(jr22.A0p())) {
                ((InterfaceC50519MRw) jr22.A1j.getValue()).B7D().setEnabled(z3);
            } else {
                JR2.A0a(jr22, JR2.A06(jr22), jr22.A0o(), z3);
            }
        }
        c31660DvQ.A01();
        C44137Jf2 c44137Jf2 = c31665DvV.A01;
        if (c44137Jf2 != null) {
            c44137Jf2.A04.clear();
            c44137Jf2.A0D.clear();
            c44137Jf2.A00 = null;
            c44137Jf2.A03 = "";
        }
        if (!z) {
            JR2 jr23 = jr3.A05;
            if (jr23 != null) {
                AbstractC167007dF.A0w(jr23.A0D);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        UserSession userSession = c31665DvV.A0A;
        if (!C18U.A06(C06090Tz.A05, userSession, 36316289245122787L)) {
            return;
        }
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A0H;
        C0YR[] c0yrArr = C2056398n.A0d;
        if (AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 30)) {
            return;
        }
        AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, 30, true);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        FragmentActivity fragmentActivity = c31665DvV.A08;
        A0y.A0g = fragmentActivity.getString(2131968948);
        A0y.A0v = true;
        A0y.A00().A02(fragmentActivity, new C26701Bqi());
    }

    public static final boolean A08(C31665DvV c31665DvV) {
        UserSession userSession = c31665DvV.A0A;
        if (!C18U.A06(C06090Tz.A06, userSession, 36316289244860639L)) {
            return false;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36313153919321907L)) {
            return C2E7.A00(AbstractC166987dD.A10(userSession));
        }
        return true;
    }

    public final void A09(View view) {
        TextView textView;
        TextView textView2;
        UserSession userSession = this.A0A;
        if (!C18U.A06(C06090Tz.A05, userSession, 36328332333170130L) && !C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36328332333694422L)) {
            View findViewById = view.findViewById(R.id.direct_inbox_multi_select_footer);
            if (findViewById != null) {
                this.A04 = findViewById;
            } else {
                View inflate = AbstractC31171DnF.A07(view, R.id.direct_inbox_multi_select_footer_stub).inflate();
                this.A04 = inflate;
                AbstractC167007dF.A0x(inflate);
            }
            View view2 = this.A04;
            TextView textView3 = null;
            if (view2 != null) {
                textView = AbstractC166987dD.A0e(view2, R.id.inbox_footer_button_left);
            } else {
                textView = null;
            }
            this.A07 = textView;
            if (textView != null) {
                ViewOnClickListenerC35680FpF.A00(textView, 63, this);
            }
            View view3 = this.A04;
            if (view3 != null) {
                textView2 = AbstractC166987dD.A0e(view3, R.id.inbox_footer_button_mid);
            } else {
                textView2 = null;
            }
            this.A00 = textView2;
            View view4 = this.A04;
            if (view4 != null) {
                textView3 = (TextView) view4.findViewById(R.id.inbox_footer_button_right);
            }
            this.A06 = textView3;
            if (textView3 != null) {
                ViewOnClickListenerC35680FpF.A00(textView3, 64, this);
            }
            if (A08(this)) {
                TextView textView4 = this.A00;
                if (textView4 != null) {
                    ViewOnClickListenerC35680FpF.A00(textView4, 61, this);
                    return;
                }
                return;
            }
            A00();
            return;
        }
        this.A05 = AbstractC31171DnF.A07(view, R.id.direct_inbox_multi_select_footer_stub);
    }

    public C31665DvV(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C31663DvT c31663DvT, C31664DvU c31664DvU, C31660DvQ c31660DvQ, C193328hC c193328hC) {
        this.A08 = fragmentActivity;
        this.A0C = c31660DvQ;
        this.A0G = c31664DvU;
        this.A0B = c31663DvT;
        this.A0A = userSession;
        this.A09 = interfaceC11380iw;
        this.A0H = c193328hC;
    }

    public static final void A06(C31665DvV c31665DvV, List list, boolean z) {
        int i;
        if (AbstractC166987dD.A1b(list)) {
            C142846ck A00 = AbstractC147806l5.A00(c31665DvV.A0A);
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1W(A0q, ((C2EE) it.next()).AdZ());
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String C7I = ((C2ED) it2.next()).C7I();
                if (C7I != null) {
                    A1E.add(C7I);
                }
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                String C7q = ((C2ED) it3.next()).C7q();
                if (C7q != null) {
                    A1E2.add(C7q);
                }
            }
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put(MSV.A00(215), AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A1E, null));
                A1G.put("consistent_thread_fbid", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A1E2, null));
                AbstractC31175DnJ.A1B(A0I, A00);
                if (z) {
                    i = 5482;
                } else {
                    i = 5483;
                }
                AbstractC31174DnI.A1I(A0I, AbstractC111324zv.A00(i));
                A0I.A0o("bulk_delete_with_broadcast_chat_dialog");
                A0I.A0p("inbox");
                A0I.A0n(C142846ck.A06(A0q));
                A0I.A0v(A1G);
                A0I.Cht();
            }
        }
    }
}
