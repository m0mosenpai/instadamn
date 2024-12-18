package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* loaded from: classes5.dex */
public final class Ch9 {
    public static final Ch9 A00 = new Object();

    public static final void A00(CTJ ctj, InterfaceC30933Din interfaceC30933Din, String str, String str2, List list, int i) {
        C14360o3.A0B(str, 3);
        LinearLayout linearLayout = ctj.A02;
        LayoutInflater A0P = AbstractC25228BEl.A0P(linearLayout);
        int childCount = i - linearLayout.getChildCount();
        if (childCount > 0) {
            list.clear();
            int i2 = 0;
            do {
                View inflate = A0P.inflate(R.layout.comment_poll_consumption_option_row, (ViewGroup) linearLayout, false);
                C14360o3.A0A(inflate);
                list.add(new C28427CgZ(inflate, interfaceC30933Din, str, str2));
                linearLayout.addView(inflate);
                i2++;
            } while (i2 < childCount);
            return;
        }
        int i3 = -childCount;
        for (int i4 = 0; i4 < i3; i4++) {
            linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
            list.remove(AbstractC25226BEj.A05(list));
        }
    }

    public static final void A02(CTJ ctj, UserSession userSession, Integer num, List list, List list2, int[] iArr, boolean z) {
        String str;
        C14360o3.A0B(userSession, 0);
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C28427CgZ c28427CgZ = (C28427CgZ) obj;
            InterfaceC101384gv interfaceC101384gv = (InterfaceC101384gv) AbstractC001800i.A0O(list, i);
            if (interfaceC101384gv != null) {
                str = interfaceC101384gv.getText();
            } else {
                str = null;
            }
            boolean z2 = !z;
            boolean A1W = AbstractC167007dF.A1W(num);
            int i3 = iArr[i];
            if (num != null) {
                num.intValue();
            }
            TextView textView = c28427CgZ.A03;
            textView.setText(str);
            TextView textView2 = c28427CgZ.A02;
            textView2.setText(str);
            Context context = c28427CgZ.A00;
            AbstractC166987dD.A1O(context, textView, AbstractC53242c7.A07(context));
            AbstractC166987dD.A1O(context, textView2, AbstractC53242c7.A0D(context));
            View view = c28427CgZ.A01;
            view.getWidth();
            C28427CgZ.A01(c28427CgZ, 0, context.getColor(AbstractC53242c7.A07(context)));
            view.setEnabled(z2);
            if (A1W) {
                C28427CgZ.A02(c28427CgZ, i3, false);
                if (view.isLaidOut() && !view.isLayoutRequested()) {
                    C28427CgZ.A01(c28427CgZ, (i3 * view.getWidth()) / 100, context.getColor(AbstractC53242c7.A07(context)));
                } else {
                    view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC28672ClK(c28427CgZ, i3, 0));
                }
            }
            C3P9 c3p9 = new C3P9(view);
            c3p9.A04 = new C27075Bwz(ctj, c28427CgZ, i);
            c3p9.A07 = true;
            c3p9.A00();
            i = i2;
        }
    }

    public final void A03(CTJ ctj, UserSession userSession, InterfaceC101404gy interfaceC101404gy, String str, String str2, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, int[] iArr, boolean z, boolean z2) {
        C14360o3.A0B(ctj, 0);
        AbstractC167027dH.A0a(1, str, interfaceC101404gy, userSession, list);
        C14360o3.A0B(str2, 8);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C28427CgZ c28427CgZ = (C28427CgZ) AbstractC001800i.A0O(list, i);
            if (c28427CgZ != null) {
                c28427CgZ.A03(iArr[i]);
            }
        }
        AbstractC140306Wi.A04(userSession, interfaceC101404gy, true);
        A01(ctj, userSession, interfaceC101404gy, null, str2, interfaceC16820sZ, interfaceC16660sJ, interfaceC16620sF, false, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r27 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.CTJ r17, com.instagram.common.session.UserSession r18, X.InterfaceC101404gy r19, java.lang.String r20, java.util.List r21, X.InterfaceC16820sZ r22, X.InterfaceC16660sJ r23, X.InterfaceC16660sJ r24, X.InterfaceC16620sF r25, int r26, boolean r27) {
        /*
            r16 = this;
            r15 = 0
            r6 = r18
            r5 = r21
            X.AbstractC167017dG.A1S(r6, r5)
            r0 = 7
            r9 = r20
            X.C14360o3.A0B(r9, r0)
            r0 = 1
            r7 = r19
            int[] r4 = X.AbstractC140306Wi.A04(r6, r7, r0)
            int r3 = r5.size()
            r2 = 0
        L1a:
            if (r2 >= r3) goto L2c
            java.lang.Object r1 = X.AbstractC001800i.A0O(r5, r2)
            X.CgZ r1 = (X.C28427CgZ) r1
            if (r1 == 0) goto L29
            r0 = r4[r2]
            r1.A04(r0)
        L29:
            int r2 = r2 + 1
            goto L1a
        L2c:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r26)
            r0 = r23
            r0.invoke(r8)
            r14 = r27
            if (r8 != 0) goto L3c
            r0 = 1
            if (r27 != 0) goto L3d
        L3c:
            r0 = 0
        L3d:
            r13 = r0 ^ 1
            r4 = r16
            r5 = r17
            r10 = r22
            r11 = r24
            r12 = r25
            r4.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ch9.A04(X.CTJ, com.instagram.common.session.UserSession, X.4gy, java.lang.String, java.util.List, X.0sZ, X.0sJ, X.0sJ, X.0sF, int, boolean):void");
    }

    public final void A05(CTJ ctj, Integer num, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3) {
        IgTextView igTextView;
        if (z3) {
            ctj.A04.setVisibility(8);
            ctj.A06.setVisibility(8);
            igTextView = ctj.A03;
        } else {
            ctj.A03.setVisibility(8);
            ctj.A05.setVisibility(8);
            igTextView = ctj.A04;
        }
        if (num == null && z2) {
            igTextView.setVisibility(0);
            A07(ctj, z3, z);
            ViewOnClickListenerC28667ClF.A01(igTextView, 18, interfaceC16820sZ);
            return;
        }
        igTextView.setVisibility(8);
    }

    public final void A07(CTJ ctj, boolean z, boolean z2) {
        IgTextView igTextView;
        C14360o3.A0B(ctj, 0);
        if (z) {
            ctj.A04.setVisibility(8);
            ctj.A06.setVisibility(8);
            igTextView = ctj.A03;
        } else {
            ctj.A03.setVisibility(8);
            ctj.A05.setVisibility(8);
            igTextView = ctj.A04;
        }
        Context context = igTextView.getContext();
        int i = 2131976883;
        if (z2) {
            i = 2131963550;
        }
        AbstractC166987dD.A1P(context, igTextView, i);
    }

    private final void A01(CTJ ctj, UserSession userSession, InterfaceC101404gy interfaceC101404gy, Integer num, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2, boolean z3) {
        IgTextView igTextView;
        if (AbstractC167007dF.A1W(interfaceC101404gy.ByI())) {
            ctj.A04.setVisibility(8);
            ctj.A06.setVisibility(8);
            igTextView = ctj.A05;
        } else {
            ctj.A03.setVisibility(8);
            ctj.A05.setVisibility(8);
            igTextView = ctj.A06;
        }
        C28193Cbn.A00.A00(AbstractC166997dE.A0L(igTextView), ctj, userSession, interfaceC101404gy, str, interfaceC16660sJ, interfaceC16620sF, z2);
        igTextView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        A05(ctj, num, interfaceC16820sZ, z3, z2, AbstractC167007dF.A1W(interfaceC101404gy.ByI()));
        if (AbstractC166987dD.A0x(userSession).getInt("comment_poll_consumption_footer_nux_seen_count", 0) < 3) {
            AbstractC23021Ah.A00(userSession).A0T(3);
            ctj.A07.setVisibility(8);
        }
    }

    public final void A06(CTJ ctj, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        IgTextView igTextView;
        if (z2) {
            ctj.A04.setVisibility(8);
            ctj.A06.setVisibility(8);
            igTextView = ctj.A05;
        } else {
            ctj.A03.setVisibility(8);
            ctj.A05.setVisibility(8);
            igTextView = ctj.A06;
        }
        ViewOnClickListenerC28667ClF.A01(igTextView, 19, interfaceC16820sZ);
        igTextView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }
}
