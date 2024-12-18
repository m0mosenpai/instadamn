package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ENI extends C38K implements InterfaceC11380iw, C08V {
    public static final String __redex_internal_original_name = "AccountSwitchFragment";
    public Context A00;
    public Intent A01;
    public UserSession A02;
    public C31770DxR A03;
    public String A04;
    public List A05;
    public boolean A06;
    public InterfaceC37136GXx A07 = GAQ.A00;
    public final InterfaceC41501vz A08 = C31650DvG.A00(this, 52);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_switch_fragment";
    }

    public static void A02(ENI eni, String str, boolean z, boolean z2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(eni.A02), "account_switch_user_tapped");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1G(A0f, eni.A04);
            A0f.A7v("is_logged_in", AbstractC31173DnH.A0d(A0f, Boolean.valueOf(z), "is_current_user_in", z2));
            AbstractC31171DnF.A1D(A0f, "account_switch_fragment");
            A0f.AAP(AbstractC31189DnY.A01(), str);
            A0f.Cht();
        }
        C31514Dsy.A05(eni.A02, "native", eni.A04);
        if (eni.A04 == "direct_inbox") {
            C120005by.A00(eni.A02);
            String str2 = null;
            TraceLogger.broadcastEvent(10000008, 0, null);
            User BOb = C0BQ.A00(eni.A02).BOb(str);
            C71933Kq A00 = AnonymousClass537.A00(BOb);
            C44142Jf7 A002 = C44142Jf7.A00(C006802i.A0p);
            A002.A01();
            A002.A02(A00);
            String str3 = eni.A02.userId;
            if (BOb != null) {
                str2 = BOb.A03.getPkId();
            }
            A002.A03(str3, str2);
        }
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setOnItemClickListener(this.A03);
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setDivider(null);
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        if (C0BQ.A00(userSession).CLL()) {
            AbstractC05560Rg.A00(this);
            ((AbstractC05560Rg) this).A04.setOnItemLongClickListener(this.A03);
        }
        C41451vu.A01.A02(this.A08, C71923Kp.class);
        List list = this.A05;
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1V(A1H, it);
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, this.A02), "account_switcher_impression");
        A0f.AAL("array_accounts_logged_in", A1H);
        A0f.Cht();
        C18720vz c18720vz = AbstractC12960li.A00;
        C19740y2 A00 = AbstractC19730y1.A00(c18720vz);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A00);
        A0P.E7G("account_switcher_impression_last_log_time", currentTimeMillis);
        A0P.apply();
        UserSession userSession2 = this.A02;
        C14360o3.A0B(userSession2, 0);
        long j = AbstractC31172DnG.A0q(c18720vz).getInt("long_press_account_switcher_row_to_create_shortcut_tooltip_impressions", 0);
        long j2 = AbstractC31172DnG.A0q(c18720vz).getLong("long_press_account_switcher_row_to_create_shortcut_tooltip_last_impression_time", -1L);
        long j3 = AbstractC31172DnG.A0q(c18720vz).getLong("dedicated_account_shortcut_last_tap_time", -1L);
        long j4 = AbstractC31172DnG.A0q(c18720vz).getLong("long_press_account_switcher_row_to_create_shortcut_last_timestamp", -1L);
        long currentTimeMillis2 = System.currentTimeMillis();
        boolean z = false;
        if (j < 2) {
            z = true;
        }
        boolean A1S = AbstractC31175DnJ.A1S((604800000L > (currentTimeMillis2 - j2) ? 1 : (604800000L == (currentTimeMillis2 - j2) ? 0 : -1)));
        boolean A1S2 = AbstractC31175DnJ.A1S((604800000L > (currentTimeMillis2 - j3) ? 1 : (604800000L == (currentTimeMillis2 - j3) ? 0 : -1)));
        boolean A1S3 = AbstractC31175DnJ.A1S((604800000L > (currentTimeMillis2 - j4) ? 1 : (604800000L == (currentTimeMillis2 - j4) ? 0 : -1)));
        if (C0BQ.A00(userSession2).CLL() && z && A1S && A1S3 && A1S2) {
            view.postDelayed(new RunnableC36935GPe(Html.fromHtml(this.A00.getResources().getString(2131965782)), view, this), 500L);
        }
        new C66049Tym(view, new C31651DvH(this, 13), false).A00();
    }

    public static void A01(ENI eni) {
        C3DN A0r = AbstractC31172DnG.A0r(eni.requireActivity());
        if (A0r != null) {
            A0r.A0B();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(eni.A02), "account_switch_add_account_sheet_dismissed");
            if (A0f.isSampled()) {
                AbstractC31171DnF.A1G(A0f, eni.A04);
                A0f.A7v("is_short_copy", AbstractC166997dE.A0a());
                A0f.Cht();
            }
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e7, code lost:
    
        if (X.C1AD.A06(r13, 18302419016422065L) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ed, code lost:
    
        r36 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f8, code lost:
    
        if (X.C1AD.A06(r13, 18302419016356528L) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fa, code lost:
    
        r36 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fc, code lost:
    
        if (r20 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x010b, code lost:
    
        r0 = new X.C31770DxR(r37, r37.A02, r37, r29, r37.A05, r31, r32, r5, r34, r35, r36);
        r37.A03 = r0;
        A0U(r0);
        r3 = X.AbstractC166987dD.A0f(X.AbstractC12220kQ.A02(r37.A02), "account_switch_button_tapped");
        r4 = X.AbstractC35181FfY.A00(r37.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x013b, code lost:
    
        if (r3.isSampled() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x013d, code lost:
    
        r3.AAP(com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r37.A04);
        r3.A9K("number_of_accounts", java.lang.Long.valueOf(X.AbstractC166987dD.A0N(r4.get(1))));
        r3.A9K("number_of_logged_in_accounts", java.lang.Long.valueOf(X.AbstractC166987dD.A0N(r4.get(0))));
        X.AbstractC31171DnF.A1D(r3, "account_switch_fragment");
        r3.Cht();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0170, code lost:
    
        r9 = r37.A02;
        r15 = X.AbstractC71963Ku.A01(r9);
        r0 = X.AbstractC71963Ku.A00(r37.A02);
        r3 = r37.A02.userId;
        r11 = X.AbstractC25228BEl.A13(r3);
        r12 = X.AbstractC25228BEl.A13(r3);
        r4 = r37.A04;
        r3 = X.C31514Dsy.A04;
        X.C14360o3.A0B(r4, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0198, code lost:
    
        switch(r4.hashCode()) {
            case -1814342561: goto L55;
            case -657162262: goto L52;
            case -309425751: goto L49;
            case 441111834: goto L46;
            case 660917936: goto L43;
            case 1434631203: goto L40;
            case 2005378358: goto L37;
            default: goto L29;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x019b, code lost:
    
        r8 = X.EnumC31512Dsw.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019d, code lost:
    
        X.C31514Dsy.A02(r8, r9, false, r11, r12, r0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01a1, code lost:
    
        if (r35 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a3, code lost:
    
        if (r6 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01a5, code lost:
    
        X.AbstractC54332en.A00(r37.A02).A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ae, code lost:
    
        r1 = (X.InterfaceC37136GXx) new X.C52942bb((X.InterfaceC52932ba) new java.lang.Object(), (X.InterfaceC018407e) r37).A00(X.C31844DzC.class);
        r37.A07 = r1;
        X.C31470DsE.A00(r37, r1.ADF(r37.A02), 22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01cd, code lost:
    
        X.C0f9.A09(-1142796779, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01d5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01dc, code lost:
    
        if (r4.equals("bookmark") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01de, code lost:
    
        r8 = X.EnumC31512Dsw.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01e7, code lost:
    
        if (r4.equals("settings") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01e9, code lost:
    
        r8 = X.EnumC31512Dsw.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01f2, code lost:
    
        if (r4.equals("direct_inbox") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01f4, code lost:
    
        r8 = X.EnumC31512Dsw.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01fd, code lost:
    
        if (r4.equals("unknown_nt_action") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ff, code lost:
    
        r8 = X.EnumC31512Dsw.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0208, code lost:
    
        if (r4.equals("profile") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x020a, code lost:
    
        r8 = X.EnumC31512Dsw.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0217, code lost:
    
        if (r4.equals(X.AbstractC111324zv.A00(4854)) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0219, code lost:
    
        r8 = X.EnumC31512Dsw.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0222, code lost:
    
        if (r4.equals("double_tap_tab_bar") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0224, code lost:
    
        r8 = X.EnumC31512Dsw.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
    
        if (X.C1AD.A06(r13, 18302419016487602L) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
    
        if (r20 == false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0228  */
    /* JADX WARN: Type inference failed for: r0v94, types: [X.2ba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r37v0, types: [X.0Rg, X.ENI, X.0iw, X.07e, X.07X, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENI.onCreate(android.os.Bundle):void");
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1168770187);
        super.onDestroy();
        C0f9.A09(1247110987, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1849595034);
        super.onDestroyView();
        C41451vu.A01.A03(this.A08, C71923Kp.class);
        C0f9.A09(-2057028173, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-198884373);
        super.onResume();
        AbstractC05560Rg.A00(this);
        AbstractC56932jR.A06(((AbstractC05560Rg) this).A04, 500L);
        C0f9.A09(642859148, A02);
    }
}
