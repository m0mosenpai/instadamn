package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* loaded from: classes8.dex */
public final class LIi {
    public View A00;
    public MR4 A01;
    public LKK A02;
    public C189478aR A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final FrameLayout A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final IgTextView A0A;
    public final C3o9 A0B;
    public final C47467Kxw A0C;
    public final FrameLayout A0D;
    public final List A0E;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (r0.intValue() != 29) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LIi(android.content.Context r20, android.widget.FrameLayout r21, android.widget.FrameLayout r22, X.InterfaceC11380iw r23, com.instagram.common.session.UserSession r24, com.instagram.common.ui.base.IgTextView r25, X.C3o9 r26, X.C47467Kxw r27, java.util.List r28, int r29, int r30) {
        /*
            r19 = this;
            r13 = 1
            r3 = r23
            r0 = r24
            X.AbstractC25229BEm.A1K(r0, r13, r3)
            r2 = r19
            r2.<init>()
            r2.A09 = r0
            r0 = r20
            r2.A06 = r0
            r1 = r29
            r2.A05 = r1
            r0 = r30
            r2.A04 = r0
            r0 = r27
            r2.A0C = r0
            r0 = r21
            r2.A0D = r0
            r0 = r25
            r2.A0A = r0
            r0 = r22
            r2.A07 = r0
            r8 = r28
            r2.A0E = r8
            r2.A08 = r3
            r0 = r26
            r2.A0B = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r9 = 0
            if (r0 == 0) goto L45
            int r1 = r0.intValue()
            r0 = 29
            r3 = 1
            if (r1 == r0) goto L46
        L45:
            r3 = 0
        L46:
            java.util.ArrayList r7 = X.AbstractC47991LKc.A01()
            com.instagram.common.session.UserSession r15 = r2.A09
            java.util.List r6 = X.AbstractC47991LKc.A02(r15)
            int r0 = r6.size()
            r1 = 6
            if (r0 <= r1) goto L5b
            java.util.List r6 = r6.subList(r9, r1)
        L5b:
            int r0 = r7.size()
            if (r0 <= r1) goto L65
            java.util.List r7 = r7.subList(r9, r1)
        L65:
            if (r3 == 0) goto Lb3
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            java.util.Iterator r4 = r6.iterator()
        L70:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r3 = r4.next()
            com.google.common.collect.ImmutableList r0 = X.C83863oV.A03
            java.lang.String r1 = "❤"
            boolean r0 = X.C14360o3.A0K(r3, r1)
            if (r0 == 0) goto L85
            r3 = r1
        L85:
            r5.add(r3)
            goto L70
        L89:
            com.google.common.collect.ImmutableList r6 = r5.build()
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            java.util.Iterator r4 = r7.iterator()
        L96:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r3 = r4.next()
            com.google.common.collect.ImmutableList r0 = X.C83863oV.A03
            java.lang.String r1 = "❤"
            boolean r0 = X.C14360o3.A0K(r3, r1)
            if (r0 == 0) goto Lab
            r3 = r1
        Lab:
            r5.add(r3)
            goto L96
        Laf:
            com.google.common.collect.ImmutableList r7 = r5.build()
        Lb3:
            X.L54 r5 = new X.L54
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.LqL r0 = new X.LqL
            r0.<init>(r2)
            r2.A01 = r0
            android.content.Context r12 = r2.A06
            android.widget.FrameLayout r13 = r2.A07
            X.0iw r14 = r2.A08
            X.LKK r11 = new X.LKK
            r17 = r5
            r18 = r9
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r2.A02 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LIi.<init>(android.content.Context, android.widget.FrameLayout, android.widget.FrameLayout, X.0iw, com.instagram.common.session.UserSession, com.instagram.common.ui.base.IgTextView, X.3o9, X.Kxw, java.util.List, int, int):void");
    }

    public static final void A00(View view, LIi lIi, int i) {
        view.setOutlineProvider(new C50795McC(lIi.A06.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size), 0));
        view.setElevation(i);
    }

    public static final void A01(LIi lIi) {
        FrameLayout frameLayout;
        IgTextView igTextView = lIi.A0A;
        ViewGroup viewGroup = (ViewGroup) igTextView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(igTextView);
        }
        lIi.A07.addView(igTextView);
        LKK lkk = lIi.A02;
        if (lkk != null && (frameLayout = lkk.A0D) != null) {
            igTextView.post(new M6S(frameLayout, igTextView, lIi, false));
        }
        A00(igTextView, lIi, AbstractC167017dG.A04(lIi.A06));
    }

    public final void A02(boolean z) {
        int height;
        C189478aR c189478aR;
        ViewGroup viewGroup;
        A00(this.A07, this, 0);
        LKK lkk = this.A02;
        if (lkk != null) {
            lkk.A06(0);
        }
        View view = this.A0D;
        if (!z) {
            Object parent = view.getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                height = 0;
                UserSession userSession = this.A09;
                KDS A00 = AbstractC46899Kog.A00(userSession, null, null, AbstractC166987dD.A1E(), ((int) (height * 0.55f)) - C30D.A00, 0, this.A05, 0, true, false);
                C189448aO A0X = AbstractC31177DnL.A0X(userSession, false);
                A0X.A1O = !z;
                A0X.A0k = true;
                A0X.A0q = false;
                A0X.A0X = new C46045KZt(this, 0);
                A0X.A0T = new C49615Lw8(A00, 6);
                Context context = this.A06;
                A0X.A06 = AbstractC53242c7.A0F(context, R.attr.igds_color_elevated_background);
                C189478aR A002 = A0X.A00();
                this.A03 = A002;
                A00.A01 = new C49262LqI(this, 1);
                A002.A03(context, A00);
                c189478aR = this.A03;
                if (c189478aR == null && (viewGroup = c189478aR.A03.bottomSheetContainer) != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                    IgTextView igTextView = this.A0A;
                    ViewGroup viewGroup2 = (ViewGroup) igTextView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(igTextView);
                    }
                    viewGroup.addView(igTextView, 0);
                    igTextView.post(new M6S(viewGroup, igTextView, this, true));
                    return;
                }
            }
        }
        height = view.getHeight();
        UserSession userSession2 = this.A09;
        KDS A003 = AbstractC46899Kog.A00(userSession2, null, null, AbstractC166987dD.A1E(), ((int) (height * 0.55f)) - C30D.A00, 0, this.A05, 0, true, false);
        C189448aO A0X2 = AbstractC31177DnL.A0X(userSession2, false);
        A0X2.A1O = !z;
        A0X2.A0k = true;
        A0X2.A0q = false;
        A0X2.A0X = new C46045KZt(this, 0);
        A0X2.A0T = new C49615Lw8(A003, 6);
        Context context2 = this.A06;
        A0X2.A06 = AbstractC53242c7.A0F(context2, R.attr.igds_color_elevated_background);
        C189478aR A0022 = A0X2.A00();
        this.A03 = A0022;
        A003.A01 = new C49262LqI(this, 1);
        A0022.A03(context2, A003);
        c189478aR = this.A03;
        if (c189478aR == null) {
        }
    }
}
