package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.List;

/* loaded from: classes7.dex */
public final class HDJ extends C38K implements InterfaceC62602sz, InterfaceC60442pS, InterfaceC60072op, InterfaceC62612t0, InterfaceC60092or, InterfaceC11480j6, AbsListView.OnScrollListener, InterfaceC60122ou, JH9, InterfaceC114785Gl {
    public static final String __redex_internal_original_name = "ManageTaggedMediaFragment";
    public C56352iT A00;
    public InterfaceC11380iw A01;
    public C41761wQ A02;
    public UserSession A03;
    public HEI A04;
    public ILN A05;
    public C41698IdR A07;
    public JIA A08;
    public EmptyStateView A0A;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public InterfaceC41501vz A0F;
    public InterfaceC41501vz A0G;
    public C39702HjY A0H;
    public InterfaceC70513Em A0I;
    public boolean A0J;
    public boolean A0K;
    public final C61372qz A0L = new C61372qz();
    public EnumC33341Eoa A06 = EnumC33341Eoa.A04;
    public IN6 A09 = new Object();
    public final List A0M = AbstractC166987dD.A1E();
    public final C37330GcY A0N = new C37330GcY();
    public Integer A0B = null;

    @Override // X.JH9
    public final /* synthetic */ void DkP(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_photos_of_you";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HDJ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void A01(HDJ hdj) {
        if (hdj.A0A != null) {
            ListView A0W = hdj.A0W();
            JIA jia = hdj.A08;
            if (jia.isLoading()) {
                hdj.A0A.A0L();
                if (A0W != null) {
                    ((RefreshableListView) A0W).setIsLoading(true);
                    return;
                }
                return;
            }
            boolean CUG = jia.CUG();
            EmptyStateView emptyStateView = hdj.A0A;
            if (CUG) {
                emptyStateView.A0J();
            } else {
                emptyStateView.A0P(EnumC153216up.A02);
                emptyStateView.A0I();
            }
            InterfaceC70513Em interfaceC70513Em = hdj.A0I;
            if (interfaceC70513Em == null) {
                return;
            }
            interfaceC70513Em.setIsLoading(false);
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A03;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        this.A08.AD5(new C38290GsZ(4, this, false));
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return !this.A04.isEmpty();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A08.CLJ();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return this.A08.CUG();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (this.A08.isLoading() && this.A04.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        this.A08.Cmo(new C38290GsZ(4, this, false), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0101 A[LOOP:0: B:34:0x00fb->B:36:0x0101, LOOP_END] */
    @Override // X.JH9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DJi(X.C38321qM r13) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HDJ.DJi(X.1qM):void");
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        if (this.A0C != null) {
            C11520jB A0B = AbstractC37300Gc1.A0B();
            A0B.A0A("ManageTaggedMediaFragment.USERNAME", this.A0D);
            A0B.A0A("ManageTaggedMediaFragment.USER_ID", this.A0C);
            return A0B;
        }
        return null;
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        if (this.mView != null) {
            AbstractC47119KsE.A00(AbstractC37300Gc1.A02(this), this);
        }
    }

    @Override // X.InterfaceC114785Gl
    public final void FAY(android.net.Uri uri) {
        this.A00.A0T();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        if (r0 == false) goto L22;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r6) {
        /*
            r5 = this;
            X.HEI r0 = r5.A04
            java.util.Set r0 = r0.A0G
            int r4 = r0.size()
            r3 = 1
            r2 = 0
            if (r4 == 0) goto Lbf
            boolean r0 = r5.A0E
            if (r0 != 0) goto Lbf
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r5)
            r0 = 2131821040(0x7f1101f0, float:1.9274812E38)
            java.lang.String r0 = X.AbstractC167017dG.A0k(r1, r4, r0)
        L1b:
            r6.setTitle(r0)
            r6.EkS(r3)
            boolean r0 = r5.A0E
            r2 = 8
            X.Eoa r1 = r5.A06
            if (r0 == 0) goto L7c
            X.Eoa r0 = X.EnumC33341Eoa.A02
            if (r1 == r0) goto L31
            X.Eoa r0 = X.EnumC33341Eoa.A03
            if (r1 != r0) goto L7b
        L31:
            X.HEI r0 = r5.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7b
            X.3LO r3 = X.AbstractC31171DnF.A0B()
            X.HEI r0 = r5.A04
            boolean r1 = r0.A03
            r0 = 2131973219(0x7f135463, float:1.9583468E38)
            if (r1 == 0) goto L49
            r0 = 2131954754(0x7f130c42, float:1.9546016E38)
        L49:
            java.lang.String r0 = r5.getString(r0)
            r3.A0K = r0
            r0 = 62
            X.Ik1 r0 = X.ViewOnClickListenerC42032Ik1.A00(r5, r0)
            X.AbstractC31176DnK.A1B(r0, r3, r6)
            X.IN6 r1 = r5.A09
            X.HEI r0 = r5.A04
            java.util.Set r0 = r0.A0G
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L65
            r2 = 0
        L65:
            r1.A00(r2)
            java.lang.Integer r0 = X.C05F.A00
            X.Fbz r2 = new X.Fbz
            r2.<init>(r0)
        L6f:
            r1 = 2131237967(0x7f081c4f, float:1.80922E38)
        L72:
            r2.A02 = r1
            X.5Gm r0 = r2.A01()
            r6.Ehg(r0)
        L7b:
            return
        L7c:
            X.Eoa r0 = X.EnumC33341Eoa.A02
            if (r1 != r0) goto L9e
            X.HEI r0 = r5.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9e
            X.3LO r1 = X.AbstractC31171DnF.A0B()
            r0 = 2131961561(0x7f1326d9, float:1.9559822E38)
            java.lang.String r0 = r5.getString(r0)
            r1.A0K = r0
            r0 = 63
            X.Ik1 r0 = X.ViewOnClickListenerC42032Ik1.A00(r5, r0)
            X.AbstractC31176DnK.A1B(r0, r1, r6)
        L9e:
            X.IN6 r1 = r5.A09
            X.HEI r0 = r5.A04
            java.util.Set r0 = r0.A0G
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lab
            r2 = 0
        Lab:
            r1.A00(r2)
            java.lang.Integer r0 = X.C05F.A00
            X.Fbz r2 = new X.Fbz
            r2.<init>(r0)
            X.HEI r0 = r5.A04
            boolean r0 = r0.A03
            r1 = 2131239093(0x7f0820b5, float:1.8094483E38)
            if (r0 != 0) goto L72
            goto L6f
        Lbf:
            X.Eoa r0 = r5.A06
            int r1 = r0.ordinal()
            if (r1 == r2) goto Ldb
            if (r1 == r3) goto Ld7
            r0 = 2
            if (r1 == r0) goto Ldf
            java.lang.String r1 = "mTaggedMediaMode not set correctly"
            java.lang.String r0 = "mTaggedMediaMode should be of type TAGGED, PENDING, or SPAM"
            X.C0w9.A03(r1, r0)
            java.lang.String r0 = ""
            goto L1b
        Ld7:
            r0 = 2131975137(0x7f135be1, float:1.9587358E38)
            goto Le2
        Ldb:
            r0 = 2131969528(0x7f1345f8, float:1.9575981E38)
            goto Le2
        Ldf:
            r0 = 2131974316(0x7f1358ac, float:1.9585693E38)
        Le2:
            java.lang.String r0 = r5.getString(r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HDJ.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return this.A08.isLoading();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        HEI hei = this.A04;
        if (hei.A03) {
            hei.A0C();
            if (!(!this.A04.A03)) {
                this.A09.A00(8);
            }
            this.A00.A0T();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        r0 = (X.EnumC33341Eoa) r7.getSerializable("ManageTaggedMediaFragment.MODE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        r22.A06 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        r22.A01 = r22;
        r12 = requireContext();
        r10 = r22.A03;
        r9 = X.AbstractC018607g.A00(r22);
        r0 = r22.A06;
        X.C14360o3.A0B(r10, 1);
        r0 = X.AbstractC25227BEk.A05(r0, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        if (r0 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (r0 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r0 != 2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        r2 = 0;
        r1 = new X.C42764Iw2(r12, r9, new X.C61972ry(r12, r9, null), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r22.A08 = r1;
        r13 = r22.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        monitor-enter(X.C41698IdR.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        r10 = X.C41698IdR.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        X.C14360o3.A0B(r13, 0);
        r0 = new X.C41698IdR(r13, new java.lang.Object(), X.AnonymousClass189.A00(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        monitor-exit(X.C41698IdR.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        r22.A07 = r0;
        r22.A02 = X.C41761wQ.A00();
        r10 = r22.A03;
        X.C14360o3.A0B(r10, 0);
        r0 = X.C18U.A06(X.C06090Tz.A06, r10, 36321198392485070L);
        r22.A0E = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        if (r0 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        if (r22.A06 != X.EnumC33341Eoa.A03) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        r22.A0K = r11;
        r11 = X.C42411xV.A00(r22.A03);
        r0 = r22.A03;
        X.AbstractC167007dF.A1D(r0, 1, "feed_photos_of_you");
        r11.A07(new X.C3AR(r22.A03, "feed_photos_of_you"), new X.C3AX(r0, r2, "feed_photos_of_you"), "feed_photos_of_you");
        requireContext();
        X.C11T.A00();
        X.C11T.A00();
        r22.A0F = X.C37816GkW.A00(r22, 10);
        r22.A0G = X.C37816GkW.A00(r22, 11);
        r22.A05 = new X.ILN(r22.A01, r22.A03);
        X.AbstractC25651Mw.A00(r22.A03).A01(r22.A0F, X.C42231InH.class);
        X.AbstractC25651Mw.A00(r22.A03).A01(r22.A0G, X.C42232InI.class);
        r12 = requireContext();
        r14 = new X.C155376yQ(r22.A03);
        r0 = r2;
        r11 = new X.HEI(r12, r22.A03, r14, r22, r22, r22, r22.A06, X.C38U.A00, r22, r22.A0E);
        r22.A04 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0168, code lost:
    
        if (r11.A03 == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016a, code lost:
    
        r11.A03 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016c, code lost:
    
        if (r6 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016e, code lost:
    
        r11.A0G.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0173, code lost:
    
        X.C0fA.A00(r11, -347549398);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
    
        r3 = new X.C3CO(r22.A03, new X.C38287GsW(r22, 3));
        r1 = new X.C60462pV();
        r1.A0E(r3);
        A0a(r1);
        A0U(r22.A04);
        r10 = new X.C42600ItJ();
        r6 = r22.A04;
        r1 = X.C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        r1 = new X.C153096ud(r22, r10, r6, X.AbstractC166987dD.A1H());
        r11 = r22.A0L;
        r11.A01(r1);
        r10 = r22.A03;
        r3 = X.C05F.A01;
        r11.A01(new X.C65953Twy(r10, r22, r3, 6));
        r22.A08.Cmo(new X.C38290GsZ(4, r22, true), true);
        r6 = r22.A06;
        r1 = X.EnumC33341Eoa.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c8, code lost:
    
        if (r6 != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ca, code lost:
    
        r22.A02.A02(X.AbstractC42021ws.A01(new X.C132955zK(X.C41698IdR.A00(r22.A07))), new X.GKL(r22, 0));
        r11 = r22.A02;
        r12 = r22.A07;
        r5 = r12.A03;
        r10 = X.AbstractC31173DnH.A0N(r5);
        r10.A0L("usertags/%s/get_pending_review_count/", r5.userId);
        r11.A02(X.AbstractC34046F0z.A00(X.AbstractC31172DnG.A0S(r10, X.HA6.class, X.C41332IRd.class)).A0K(new X.C36226Fyf(r12, 5)), new X.GKL(r22, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0216, code lost:
    
        r6 = r22.A03;
        r5 = requireContext();
        r4 = new java.lang.Object();
        r4.A00 = r5;
        r4.A01 = r6;
        r4.A02 = "feed_photos_of_you";
        r22.A0H = r4;
        r22.A00 = X.C56352iT.A0t.A03(getActivity());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0235, code lost:
    
        if (r7 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0237, code lost:
    
        r4 = r7.getString("ManageTaggedMediaFragment.ARGUMENT_ENTRYPOINT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x023d, code lost:
    
        if (r4 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0245, code lost:
    
        if (r4.equals("PENDING_TAGS_NOTIFICATION") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0247, code lost:
    
        r0 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0281, code lost:
    
        if (r4.equals("TAGGED_POSTS_BLOKS_SETTINGS") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if (r7.getBoolean("ManageTaggedMediaFragment.IS_EDIT_ONLY_MODE", false) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0283, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x028b, code lost:
    
        if (r4.equals("EDIT_TAG_PROFILE") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028d, code lost:
    
        r0 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0296, code lost:
    
        if (r4.equals("PHOTOS_OF_YOU") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0298, code lost:
    
        r0 = X.C05F.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a1, code lost:
    
        if (r4.equals("TAGGED_POSTS_NATIVE_SETTINGS") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a3, code lost:
    
        r0 = X.C05F.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0046, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02ac, code lost:
    
        if (r4.equals("YOUR_ACTIVITY_TAGS_MENU") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02ae, code lost:
    
        r0 = X.C05F.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02c6, code lost:
    
        throw X.AbstractC166987dD.A12(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0249, code lost:
    
        r22.A0B = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x024b, code lost:
    
        r5 = r22.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x024d, code lost:
    
        if (r5 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024f, code lost:
    
        r4 = r22.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (r7.getBoolean("ManageTaggedMediaFragment.ARGUMENT_SHOULD_SHOW_PTE_TAGGED_SELLER_NUX", false) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0251, code lost:
    
        if (r4 != r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0253, code lost:
    
        r3 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0255, code lost:
    
        X.AbstractC35091Fd2.A00(r22.A01, r22.A03, r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0272, code lost:
    
        if (r4 == X.EnumC33341Eoa.A02) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0276, code lost:
    
        if (r4 != X.EnumC33341Eoa.A03) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0278, code lost:
    
        r3 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02b1, code lost:
    
        r1 = X.AbstractC37303Gc4.A0M(r4, "Unknown manage tagged media mode: ", X.AbstractC166987dD.A1C());
        X.C0f9.A09(75272837, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c1, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025c, code lost:
    
        r22.A05.A00(r22.A06, X.C05F.A00, r2, java.util.Collections.emptyList());
        X.C0f9.A09(-1832871159, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x026f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d3, code lost:
    
        throw X.AbstractC166987dD.A12("Can not create TaggedMediaRepository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
    
        r22.A0J = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0094, code lost:
    
        r2 = 0;
        r1 = new X.C42763Iw1(r12, r9, new X.C61972ry(r12, r9, null), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a0, code lost:
    
        r2 = 0;
        r1 = new X.C42765Iw3(r12, r9, new X.C61972ry(r12, r9, null), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0044, code lost:
    
        if (r7 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String, X.3AW] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, X.HjY] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.I50, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HDJ.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1018868140);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_hide_photos_of_you);
        C0f9.A09(918017503, A02);
        return A0A;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(157682158);
        AbstractC25651Mw.A00(this.A03).A02(this.A0F, C42231InH.class);
        AbstractC25651Mw.A00(this.A03).A02(this.A0G, C42232InI.class);
        C42411xV A00 = C42411xV.A00(this.A03);
        C11T.A00();
        C11T.A00();
        A00.A08("feed_photos_of_you");
        this.A02.A01();
        super.onDestroy();
        C0f9.A09(1974054763, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-438223977);
        super.onDestroyView();
        this.A0A = null;
        C0f9.A09(-1673596269, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(649598013);
        super.onResume();
        C0fA.A00(this.A04, 456692056);
        AbstractC54612fJ.A00(this.A03).A01.E4s(new C71883Kl(0));
        C0f9.A09(242629432, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(-1864918382);
        this.A0L.onScroll(absListView, i, i2, i3);
        C0f9.A0A(-791549411, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C0f9.A03(-2121921386);
        this.A0L.onScrollStateChanged(absListView, i);
        C0f9.A0A(1559968210, A03);
    }
}
