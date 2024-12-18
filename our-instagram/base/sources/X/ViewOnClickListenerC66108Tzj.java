package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Tzj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnClickListenerC66108Tzj implements View.OnClickListener, View.OnTouchListener {
    public C65911TwI A00;
    public SearchEditText A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final AccessibilityManager A05;
    public final BaseFragmentActivity A06;
    public final InterfaceC11380iw A07;
    public final C18920wW A08;
    public final UserSession A09;
    public final C66087TzO A0A;
    public final InterfaceC55362gb A0B;
    public final C64742wY A0C;
    public final String A0D;
    public final InterfaceC09390do A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final String A0M;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r26.A0G != false) goto L25;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r27, android.view.MotionEvent r28) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC66108Tzj.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.U29, java.lang.Object] */
    private final void A00() {
        if (C37011ny.A00 != null) {
            BaseFragmentActivity baseFragmentActivity = this.A06;
            UserSession userSession = this.A09;
            C140966Yy c140966Yy = new C140966Yy(baseFragmentActivity, userSession);
            U04.A00();
            c140966Yy.A0D(new Object().A02(userSession));
            c140966Yy.A0A = "composite_search_back_stack";
            c140966Yy.A04();
        }
    }

    public final SearchEditText A01(SearchEditText searchEditText) {
        Drawable[] compoundDrawablesRelative;
        Drawable drawable;
        this.A01 = searchEditText;
        if (this.A0F) {
            if (searchEditText != null) {
                C59072n8 A00 = C59062n7.A00(0, 0, this.A0M);
                A00.A00((AbstractC64162vb) this.A0E.getValue());
                C59062n7 A01 = A00.A01();
                C57112jm CGS = this.A06.CGS();
                if (CGS != null) {
                    CGS.A05(searchEditText, A01);
                }
                UserSession userSession = this.A09;
                searchEditText.setHint(AbstractC66179U2u.A00(userSession));
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                C14360o3.A0B("has_initiated_chat_with_agent", 0);
                if (!A002.A01.getBoolean("has_initiated_chat_with_agent", false)) {
                    C66087TzO c66087TzO = this.A0A;
                    c66087TzO.A01 = searchEditText;
                    if (this.A0H) {
                        c66087TzO.A00 = 2500L;
                    }
                    this.A0C.A00(searchEditText, QPTooltipAnchor.A0Q, this.A0B);
                }
            }
        } else if (searchEditText != null) {
            searchEditText.setHint(2131972993);
        }
        SearchEditText searchEditText2 = this.A01;
        if (searchEditText2 != null && (compoundDrawablesRelative = searchEditText2.getCompoundDrawablesRelative()) != null && (drawable = compoundDrawablesRelative[0]) != null) {
            drawable.mutate().setAlpha(255);
        }
        SearchEditText searchEditText3 = this.A01;
        if (searchEditText3 != null) {
            searchEditText3.clearFocus();
        }
        SearchEditText searchEditText4 = this.A01;
        if (searchEditText4 != null) {
            searchEditText4.setCursorVisible(false);
        }
        SearchEditText searchEditText5 = this.A01;
        if (searchEditText5 != null) {
            AccessibilityManager accessibilityManager = this.A05;
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                C0fQ.A00(this, searchEditText5);
            } else {
                searchEditText5.setOnTouchListener(this);
            }
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0075, code lost:
    
        if (X.C18U.A06(r3, r8, 36327357376182811L) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnClickListenerC66108Tzj(android.content.Context r5, com.instagram.base.activity.BaseFragmentActivity r6, X.InterfaceC11380iw r7, com.instagram.common.session.UserSession r8, X.C66087TzO r9, X.InterfaceC55362gb r10, X.C64742wY r11) {
        /*
            r4 = this;
            X.AbstractC167017dG.A1R(r6, r8)
            r4.<init>()
            r4.A04 = r5
            r4.A06 = r6
            r4.A09 = r8
            r4.A07 = r7
            r4.A0C = r11
            r4.A0B = r10
            r4.A0A = r9
            java.lang.String r0 = X.AbstractC31271Dot.A00(r8)
            r4.A0D = r0
            boolean r0 = X.AbstractC65702TsY.A1Y(r8)
            r4.A0F = r0
            boolean r0 = X.AbstractC65702TsY.A1Y(r8)
            r4.A0L = r0
            boolean r0 = X.AbstractC65702TsY.A1Y(r8)
            r4.A0H = r0
            boolean r0 = X.AbstractC65702TsY.A1Y(r8)
            r4.A02 = r0
            boolean r1 = X.AbstractC65702TsY.A1Y(r8)
            r0 = 0
            if (r1 == 0) goto L3a
            r0 = -1
        L3a:
            r4.A03 = r0
            boolean r0 = X.AbstractC65702TsY.A1Y(r8)
            r4.A0J = r0
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36328207779183950(0x81105000013d4e, double:3.037443109282695E-306)
            boolean r0 = X.C18U.A06(r3, r8, r0)
            r4.A0G = r0
            r0 = 36330462636950394(0x81125d0000437a, double:3.0388690904137775E-306)
            boolean r0 = X.C18U.A06(r3, r8, r0)
            r0 = r0 ^ 1
            r4.A0I = r0
            X.0Tz r2 = X.AbstractC166997dE.A0U(r8)
            r0 = 36324767511163335(0x810d2f000d31c7, double:3.0352674699336106E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            if (r0 == 0) goto L77
            r0 = 36327357376182811(0x810f8a00093a1b, double:3.0369053110004766E-306)
            boolean r1 = X.C18U.A06(r3, r8, r0)
            r0 = 1
            if (r1 != 0) goto L78
        L77:
            r0 = 0
        L78:
            r4.A0K = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r1 = r5.getSystemService(r0)
            boolean r0 = r1 instanceof android.view.accessibility.AccessibilityManager
            if (r0 == 0) goto La2
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
        L86:
            r4.A05 = r1
            X.0wW r0 = X.AbstractC12220kQ.A01(r7, r8)
            r4.A08 = r0
            java.lang.String r0 = X.AbstractC167017dG.A0j()
            r4.A0M = r0
            r1 = 41
            X.MDm r0 = new X.MDm
            r0.<init>(r4, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r4.A0E = r0
            return
        La2:
            r1 = 0
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC66108Tzj.<init>(android.content.Context, com.instagram.base.activity.BaseFragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.TzO, X.2gb, X.2wY):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1645471266);
        C14360o3.A0B(view, 0);
        A00();
        view.setOnClickListener(null);
        C0f9.A0C(2111085878, A05);
    }
}
