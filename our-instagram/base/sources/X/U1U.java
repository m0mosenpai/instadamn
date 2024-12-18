package X;

import android.content.Context;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U1U implements JIF {
    public C65956Tx8 A00;
    public C66134U1b A01;
    public Context A02;
    public Parcelable A03;
    public ViewGroup A04;
    public RecyclerView A05;
    public RecyclerView A06;
    public UserSession A07;
    public XB6 A08;
    public C50625MWm A09;
    public final Handler A0A;
    public final C66362zD A0B;
    public final C66362zD A0C;
    public final C2046193v A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (X.C66156U1x.A00.A00(r2) == false) goto L10;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Tx9, X.U2y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r8 = this;
            r5 = 0
            X.U2y r6 = new X.U2y
            r6.<init>(r5)
            com.instagram.common.session.UserSession r2 = r8.A07
            X.U0M r0 = X.U0B.A00(r2)
            int r1 = r0.A01
            r0 = 3
            if (r1 != r0) goto L74
            boolean r0 = r8.A0F
            if (r0 != 0) goto L74
            X.U0M r0 = X.U0B.A00(r2)
            X.8kV r0 = r0.A02
            java.util.List r1 = r0.A04
            boolean r0 = r8.A0E
            if (r0 == 0) goto L2a
            X.U1x r0 = X.C66156U1x.A00
            boolean r0 = r0.A00(r2)
            r7 = 1
            if (r0 != 0) goto L2b
        L2a:
            r7 = 0
        L2b:
            X.C14360o3.A0B(r1, r5)
            java.util.Iterator r4 = r1.iterator()
        L32:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r3 = r4.next()
            X.TwV r3 = (X.AbstractC65924TwV) r3
            boolean r0 = r3 instanceof X.C66130U0o
            if (r0 == 0) goto L53
            r0 = r3
            X.U0o r0 = (X.C66130U0o) r0
            com.instagram.model.keyword.Keyword r0 = r0.A01
            java.lang.String r1 = r0.A07
            java.lang.String r0 = "meta_ai_suggestion"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L53
            if (r7 == 0) goto L32
        L53:
            X.Twz r2 = new X.Twz
            r2.<init>()
            java.lang.String r0 = "null_state_popular_pill"
            r2.A09 = r0
            java.lang.String r1 = "POPULAR"
            r2.A08 = r1
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.C14360o3.A07(r0)
            java.lang.String r0 = r1.toLowerCase(r0)
            X.C14360o3.A07(r0)
            r2.A05 = r0
            r6.A01(r2, r3)
            goto L32
        L74:
            boolean r0 = r8.A0G
            if (r0 == 0) goto Lb1
            X.93v r0 = r8.A0D
            java.util.List r0 = r0.A00()
            java.util.List r0 = X.U12.A01(r0)
            java.util.Iterator r4 = r0.iterator()
        L86:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r3 = r4.next()
            X.Twz r2 = new X.Twz
            r2.<init>()
            java.lang.String r0 = "bootstrap"
            r2.A09 = r0
            java.lang.String r1 = ""
            r2.A08 = r1
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.C14360o3.A07(r0)
            java.lang.String r0 = r1.toLowerCase(r0)
            X.C14360o3.A07(r0)
            r2.A05 = r0
            r6.A01(r2, r3)
            goto L86
        Lb1:
            X.U1W r1 = new X.U1W
            r1.<init>(r6)
            X.U2y r0 = r1.A00
            X.Tx8 r0 = r0.A00()
            X.C14360o3.A0B(r0, r5)
            r8.A00 = r0
            X.MWm r0 = new X.MWm
            r0.<init>(r1, r5)
            r8.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1U.A01():void");
    }

    @Override // X.JIF
    public final void AJJ(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC65252xN interfaceC65252xN, C3FQ c3fq) {
        throw C00O.createAndThrow();
    }

    @Override // X.JIF
    public final void AJK(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, XAp xAp) {
        throw C00O.createAndThrow();
    }

    @Override // X.JIF
    public final void D8R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.search_header, false);
        this.A04 = viewGroup2;
        String str = "headerView";
        if (viewGroup2 != null) {
            RecyclerView recyclerView = (RecyclerView) viewGroup2.requireViewById(R.id.hscroll_rv);
            this.A06 = recyclerView;
            if (recyclerView != null) {
                AbstractC38152GqJ.A01(recyclerView);
                RecyclerView recyclerView2 = this.A06;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(this.A0C);
                    ViewGroup viewGroup3 = this.A04;
                    if (viewGroup3 != null) {
                        RecyclerView recyclerView3 = (RecyclerView) viewGroup3.requireViewById(R.id.pinned_account_hscroll_rv);
                        this.A05 = recyclerView3;
                        str = "pinnedAccountHScrollView";
                        if (recyclerView3 != null) {
                            AbstractC38152GqJ.A01(recyclerView3);
                            RecyclerView recyclerView4 = this.A05;
                            if (recyclerView4 != null) {
                                recyclerView4.setAdapter(this.A0B);
                                A01();
                                Parcelable parcelable = this.A03;
                                if (parcelable != null) {
                                    RecyclerView recyclerView5 = this.A06;
                                    if (recyclerView5 != null) {
                                        AbstractC70663Fe abstractC70663Fe = recyclerView5.A0D;
                                        if (abstractC70663Fe != null) {
                                            abstractC70663Fe.A1P(parcelable);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("popularKeywordHScrollView");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.JIF
    public final void EMG() {
        throw C00O.createAndThrow();
    }

    @Override // X.JIF
    public final void onResume() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if ((!r0.A01().isEmpty()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.U1U r6) {
        /*
            X.XB6 r0 = r6.A08
            boolean r0 = r0.CZT()
            r5 = 0
            if (r0 == 0) goto L24
            X.MWm r0 = r6.A09
            if (r0 != 0) goto L17
            java.lang.String r0 = "recyclerDataSource"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L17:
            java.util.List r0 = r0.A01()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r2 = 1
            if (r0 != 0) goto L25
        L24:
            r2 = 0
        L25:
            boolean r0 = r6.A0G
            if (r0 == 0) goto L68
            X.93v r0 = r6.A0D
            java.util.List r0 = r0.A00()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L68
            android.content.Context r1 = r6.A02
            r0 = 1118830592(0x42b00000, float:88.0)
            float r4 = X.AbstractC13880nE.A00(r1, r0)
        L3f:
            X.U1b r3 = r6.A01
            if (r3 == 0) goto L67
            if (r2 == 0) goto L56
            android.content.Context r2 = r6.A02
            r0 = 26
            float r1 = X.AbstractC13880nE.A04(r2, r0)
            r0 = 1101004800(0x41a00000, float:20.0)
            float r0 = X.AbstractC13880nE.A03(r2, r0)
            float r1 = r1 + r0
            float r1 = r1 + r4
            int r5 = (int) r1
        L56:
            X.TwP r0 = r3.A00
            X.U1T r0 = r0.A0H()
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            if (r1 == 0) goto L67
            int r0 = r1.getPaddingLeft()
            X.AbstractC31177DnL.A0x(r1, r0, r5)
        L67:
            return
        L68:
            r4 = 0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1U.A00(X.U1U):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r11 = this;
            X.XB6 r0 = r11.A08
            boolean r0 = r0.CZT()
            java.lang.String r10 = "pinnedAccountHScrollView"
            java.lang.String r9 = "popularKeywordHScrollView"
            r6 = 8
            if (r0 != 0) goto L20
            androidx.recyclerview.widget.RecyclerView r0 = r11.A06
            if (r0 == 0) goto Lb3
            r0.setVisibility(r6)
        L15:
            androidx.recyclerview.widget.RecyclerView r0 = r11.A05
            if (r0 == 0) goto L26
            r0.setVisibility(r6)
        L1c:
            A00(r11)
            return
        L20:
            X.MWm r0 = r11.A09
            if (r0 != 0) goto L2e
            java.lang.String r10 = "recyclerDataSource"
        L26:
            X.C14360o3.A0F(r10)
        L29:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2e:
            java.util.List r8 = r0.A01()
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r8.iterator()
        L40:
            boolean r0 = r2.hasNext()
            java.lang.String r7 = "null cannot be cast to non-null type com.instagram.search.common.recyclerview.model.SearchItemModel"
            if (r0 == 0) goto L57
            java.lang.Object r1 = r2.next()
            X.C14360o3.A0C(r1, r7)
            boolean r0 = r1 instanceof X.MZR
            if (r0 == 0) goto L40
            r3.add(r1)
            goto L40
        L57:
            r4.A01(r3)
            java.util.List r0 = r4.A00
            boolean r0 = r0.isEmpty()
            r5 = 0
            if (r0 == 0) goto L8d
            androidx.recyclerview.widget.RecyclerView r0 = r11.A06
            if (r0 == 0) goto Lb3
            r0.setVisibility(r6)
        L6a:
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r8.iterator()
        L78:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r2.next()
            X.C14360o3.A0C(r1, r7)
            boolean r0 = r1 instanceof X.C50622MWj
            if (r0 == 0) goto L78
            r3.add(r1)
            goto L78
        L8d:
            X.2zD r0 = r11.A0C
            r0.A05(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A06
            if (r0 == 0) goto Lb3
            r0.setVisibility(r5)
            goto L6a
        L9a:
            r4.A01(r3)
            java.util.List r0 = r4.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15
            X.2zD r0 = r11.A0B
            r0.A05(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A05
            if (r0 == 0) goto L26
            r0.setVisibility(r5)
            goto L1c
        Lb3:
            X.C14360o3.A0F(r9)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1U.A02():void");
    }

    @Override // X.JIF
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            if (viewGroup.getParent() == null) {
                ViewGroup viewGroup2 = this.A04;
                if (viewGroup2 != null) {
                    interfaceC56362iU.A7x(viewGroup2);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("headerView");
        throw C00O.createAndThrow();
    }

    @Override // X.JIF
    public final void onDestroyView() {
    }

    @Override // X.JIF
    public final void onPause() {
        RecyclerView recyclerView = this.A06;
        Parcelable parcelable = null;
        if (recyclerView == null) {
            C14360o3.A0F("popularKeywordHScrollView");
            throw C00O.createAndThrow();
        }
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != null) {
            parcelable = abstractC70663Fe.A1M();
        }
        this.A03 = parcelable;
    }

    public U1U(Context context, C66392zG c66392zG, UserSession userSession, XB6 xb6) {
        AbstractC43594JPz.A1P(userSession, xb6);
        this.A02 = context;
        this.A07 = userSession;
        this.A08 = xb6;
        this.A0C = c66392zG.A00();
        UserSession userSession2 = this.A07;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0G = C18U.A06(c06090Tz, userSession2, 36320970759218207L);
        this.A0B = c66392zG.A00();
        this.A0D = AbstractC2045993t.A00(this.A07);
        this.A0E = AbstractC65702TsY.A1Y(this.A07);
        UserSession userSession3 = this.A07;
        C14360o3.A0B(userSession3, 0);
        this.A0F = C18U.A06(c06090Tz, userSession3, 36327950081080298L);
        this.A0A = AbstractC167007dF.A0J();
    }

    @Override // X.JIF
    public final String Arb() {
        throw C00O.createAndThrow();
    }
}
