package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GnW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37986GnW extends C2US implements InterfaceC65242xM, GZD, CallerContextable {
    public static final CallerContext A11 = CallerContext.A00(C37986GnW.class);
    public static final String __redex_internal_original_name = "ReelDashboardViewersAdapter";
    public int A00;
    public C38321qM A01;
    public Reel A02;
    public C41181vS A03;
    public C41551w4 A04;
    public ReelViewerConfig A05;
    public C3G2 A06;
    public C69448VnX A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public int A0B;
    public int A0C;
    public String A0D;
    public boolean A0E;
    public final Context A0F;
    public final C65662y2 A0G;
    public final InterfaceC11380iw A0H;
    public final C18920wW A0I;
    public final UserSession A0J;
    public final N95 A0K;
    public final C66266U6k A0L;
    public final HF0 A0M;
    public final C31544DtU A0N;
    public final C31545DtV A0O;
    public final InterfaceC62602sz A0P;
    public final C65842yM A0Q;
    public final C38986HEo A0R;
    public final V3F A0S;
    public final HF5 A0T;
    public final ReelDashboardFragment A0U;
    public final HashMap A0V;
    public final List A0W;
    public final List A0X;
    public final List A0Y;
    public final List A0Z;
    public final java.util.Set A0a;
    public final boolean A0b;
    public final AbstractC59962oe A0c;
    public final C41951wl A0d;
    public final C41891wf A0e;
    public final N98 A0f;
    public final C149766oT A0g;
    public final IF3 A0h;
    public final HFT A0i;
    public final ES3 A0j;
    public final HF4 A0k;
    public final C32451ERd A0l;
    public final HFN A0m;
    public final HFW A0n;
    public final C38998HFa A0o;
    public final HFP A0p;
    public final C32452ERe A0q;
    public final HFV A0r;
    public final HFQ A0s;
    public final ES7 A0t;
    public final U6o A0u;
    public final HFO A0v;
    public final IE7 A0w;
    public final FIC A0x;
    public final V3G A0y;
    public final boolean A0z;
    public final boolean A10;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r67 == false) goto L6;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r16v1, types: [X.HEo, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.2y2, java.lang.Object, X.2y0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C37986GnW(android.content.Context r58, X.AbstractC59962oe r59, X.InterfaceC11380iw r60, com.instagram.common.session.UserSession r61, X.C57112jm r62, X.C148426mC r63, X.InterfaceC62602sz r64, instagram.features.stories.dashboard.fragment.ReelDashboardFragment r65, boolean r66, boolean r67) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37986GnW.<init>(android.content.Context, X.2oe, X.0iw, com.instagram.common.session.UserSession, X.2jm, X.6mC, X.2sz, instagram.features.stories.dashboard.fragment.ReelDashboardFragment, boolean, boolean):void");
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
    }

    private int A00(C69179Vj8 c69179Vj8, int i, int i2, boolean z) {
        String str;
        Context context = this.A0F;
        String string = context.getResources().getString(i);
        C124385ju c124385ju = null;
        if (i2 != -1) {
            str = context.getResources().getString(i2);
        } else {
            str = null;
        }
        if (z) {
            int A03 = AbstractC167017dG.A03(context);
            c124385ju = new C124385ju(context, 1.0f, AbstractC53242c7.A0H(context, R.attr.dividerColor), 48);
            c124385ju.A00(A03, 0, A03, 0);
        }
        return addModel(new C66270U6p(c124385ju, c69179Vj8, string, str), null, this.A0u);
    }

    private void A02(C41181vS c41181vS) {
        UserSession userSession = this.A0J;
        InterfaceC11380iw interfaceC11380iw = this.A0H;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "reel_viewer_dashboard_fb_anon_viewers_impression");
        AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
        Long l = null;
        A0f.A9K("target_user_id", null);
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            String A38 = c38321qM.A38();
            A38.getClass();
            l = AbstractC25228BEl.A13(A38);
        }
        AbstractC37300Gc1.A0h(A0f, l);
        A0f.Cht();
    }

    public static void A03(C37986GnW c37986GnW, boolean z) {
        c37986GnW.removeModel(c37986GnW.A0C);
        c37986GnW.A0E = true;
        c37986GnW.A0B = c37986GnW.A00(null, 2131974479, 2131974478, z);
        c37986GnW.A04(c37986GnW.A0Z, false, true);
        c37986GnW.notifyDataSetChangedSmart();
        ReelDashboardFragment reelDashboardFragment = c37986GnW.A0U;
        C41181vS c41181vS = c37986GnW.A03;
        c41181vS.getClass();
        reelDashboardFragment.A0L(c41181vS, c37986GnW.A0B);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r6 > r3.length()) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(boolean r8) {
        /*
            r7 = this;
            java.util.List r0 = r7.A0Z
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L80
            java.lang.String r0 = r7.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L80
            X.2sz r0 = r7.A0P
            boolean r0 = r0.CLJ()
            if (r0 != 0) goto L80
            X.IF3 r0 = r7.A0h
            boolean r0 = r0.A00
            if (r0 == 0) goto L80
            android.content.Context r2 = r7.A0F
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131974480(0x7f135950, float:1.9586025E38)
            java.lang.String r3 = r1.getString(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131974482(0x7f135952, float:1.958603E38)
            java.lang.String r0 = r1.getString(r0)
            int r6 = r3.indexOf(r0)
            if (r0 == 0) goto L81
            int r5 = r0.length()
        L40:
            int r5 = r5 + r6
            r4 = 0
            if (r6 < 0) goto L4b
            int r0 = r3.length()
            r2 = 1
            if (r6 <= r0) goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r5 < 0) goto L55
            int r0 = r3.length()
            if (r5 > r0) goto L55
            r4 = 1
        L55:
            android.text.SpannableStringBuilder r3 = X.AbstractC25225BEi.A0H(r3)
            X.Gsj r1 = new X.Gsj
            r1.<init>(r7, r8)
            if (r2 == 0) goto L80
            if (r4 == 0) goto L80
            r0 = 33
            r3.setSpan(r1, r6, r5, r0)
            X.Fgf r2 = new X.Fgf
            r2.<init>(r3)
            r0 = 1
            r2.A06 = r0
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            r2.A03 = r0
            boolean r0 = r7.A0E
            if (r0 != 0) goto L83
            X.DtU r1 = r7.A0N
            r0 = 0
            int r0 = r7.addModel(r2, r0, r1)
            r7.A0C = r0
        L80:
            return
        L81:
            r5 = 0
            goto L40
        L83:
            A03(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37986GnW.A05(boolean):void");
    }

    private boolean A06(User user) {
        if (this.A0z && this.A0e.A0C(this.A0d, user)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:370:0x09fc, code lost:
    
        if ((!r6.A04(com.facebook.common.callercontext.CallerContext.A00(X.C48520LdI.class), r7)) != false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0a18, code lost:
    
        if (r6 == false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0a86, code lost:
    
        if (r11.CLJ() != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0ab1, code lost:
    
        if (r11.CLJ() != false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0182, code lost:
    
        if (r1.equals(r8.A0j) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a3  */
    /* JADX WARN: Type inference failed for: r1v113, types: [X.VnX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v115, types: [X.VnX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            Method dump skipped, instructions count: 3070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37986GnW.A07():void");
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        if (this.A03 != null) {
            this.A09 = str;
            A07();
            this.A0U.A0L(this.A03, this.A00);
            this.A0E = false;
        }
    }

    public static C69179Vj8 A01(Context context, C37986GnW c37986GnW, Integer num) {
        String string = context.getResources().getString(2131973168);
        C41181vS c41181vS = c37986GnW.A03;
        c41181vS.getClass();
        return new C69179Vj8(c41181vS, num, string);
    }

    private void A04(List list, boolean z, boolean z2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9C8 c9c8 = (C9C8) it.next();
            Reel reel = this.A02;
            C41181vS c41181vS = this.A03;
            User user = (User) c9c8.A05;
            C38266GsB c38266GsB = new C38266GsB(reel, c41181vS, user, A06(user));
            C31200Dnj c31200Dnj = (C31200Dnj) c9c8.A02;
            if (c31200Dnj != null && !c31200Dnj.A00.isEmpty()) {
                c38266GsB.A00 = c31200Dnj;
            }
            XFR xfr = (XFR) c9c8.A01;
            if (xfr != null) {
                c38266GsB.A01 = xfr;
            }
            String str = c9c8.A06;
            if (str != null && !str.equals("")) {
                c38266GsB.A09 = str;
            }
            UserSession userSession = this.A0J;
            C06090Tz c06090Tz = C06090Tz.A06;
            boolean z3 = false;
            if ((C18U.A06(c06090Tz, userSession, 36313016479975018L) || C18U.A06(c06090Tz, userSession, 36313016480040555L)) && this.A09.isEmpty()) {
                c38266GsB.A0H = true;
            }
            if (user.isRestricted() && C18U.A06(C06090Tz.A05, userSession, 36324312244039779L)) {
                c38266GsB.A0G = true;
                c38266GsB.A0D = true;
            } else {
                c38266GsB.A0G = false;
                c38266GsB.A0D = false;
            }
            Boolean bool = (Boolean) c9c8.A04;
            if (bool != null && bool.booleanValue()) {
                z3 = true;
            }
            c38266GsB.A0B = z3;
            c38266GsB.A0C = z;
            c38266GsB.A0E = z2;
            addModel(c38266GsB, this.A0L);
        }
    }

    @Override // X.C2UU
    public final void unregisterAdapterDataObserver(AbstractC65392xb abstractC65392xb) {
        super.unregisterAdapterDataObserver(abstractC65392xb);
        if (this.A0K != null) {
            UserSession userSession = this.A0J;
            C14360o3.A0B(userSession, 0);
            if (AbstractC50624MWl.A00 != null) {
                AbstractC25651Mw.A00(userSession).A02(AbstractC50624MWl.A00, C211849aB.class);
                AbstractC50624MWl.A00 = null;
            }
        }
    }
}
