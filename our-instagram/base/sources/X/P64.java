package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.search.MusicOverlayResultsListController;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P64 implements InterfaceC58055Pog {
    public boolean A00;
    public final AbstractC59962oe A01;
    public final MusicOverlayResultsListController A02;
    public final InterfaceC58053Poe A03;
    public final InterfaceC58309Pt1 A04;
    public final ImmutableList A05;
    public final UserSession A06;

    public final void A01(C52096N2w c52096N2w) {
        C14360o3.A0B(c52096N2w, 0);
        MusicOverlayResultsListController musicOverlayResultsListController = this.A02;
        List list = c52096N2w.A01;
        C50979Mfm c50979Mfm = musicOverlayResultsListController.A0F;
        List list2 = c50979Mfm.A08;
        list2.clear();
        list2.addAll(list);
        boolean isEmpty = list.isEmpty();
        boolean z = true;
        if (!(!isEmpty) || !AbstractC167007dF.A1Z(c50979Mfm.A0A)) {
            z = false;
        }
        c50979Mfm.A05 = z;
        c50979Mfm.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r11.A00() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r7.isEmpty() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C38071Gp0 r11, X.OKv r12, boolean r13) {
        /*
            r10 = this;
            r0 = 1
            X.C14360o3.A0B(r12, r0)
            java.util.List r1 = r11.A05
            com.google.common.collect.ImmutableList r0 = r10.A05
            java.util.ArrayList r7 = X.AbstractC41656Ibo.A01(r1, r0)
            r8 = r13
            if (r13 == 0) goto L23
            java.lang.String r0 = r12.A01
            if (r0 == 0) goto L20
            int r0 = r0.length()
            if (r0 == 0) goto L20
            boolean r0 = r7.isEmpty()
            r1 = 1
            if (r0 != 0) goto L21
        L20:
            r1 = 0
        L21:
            r10.A00 = r1
        L23:
            com.instagram.music.search.MusicOverlayResultsListController r3 = r10.A02
            X.2oe r1 = r10.A01
            r0 = 2131973027(0x7f1353a3, float:1.9583078E38)
            java.lang.String r2 = X.AbstractC25227BEk.A0v(r1, r0)
            r4 = 0
            java.lang.String r1 = "search"
            java.lang.String r0 = "5928524597172606"
            com.instagram.music.common.model.MusicBrowseCategory r0 = X.C50535MSo.A03(r1, r0, r2)
            r3.A02 = r0
            java.lang.String r5 = r12.A01
            boolean r0 = r12.A04
            if (r0 == 0) goto L4c
            boolean r0 = r11.CR4()
            if (r0 != 0) goto L4c
            boolean r0 = r11.A00()
            r9 = 1
            if (r0 != 0) goto L4d
        L4c:
            r9 = 0
        L4d:
            r6 = r4
            r3.A09(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P64.A02(X.Gp0, X.OKv, boolean):void");
    }

    public final void A00() {
        C50979Mfm c50979Mfm = this.A02.A0F;
        c50979Mfm.A08.clear();
        c50979Mfm.A00();
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToBottom() {
        return this.A02.A0A();
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToTop() {
        return this.A02.A0B();
    }

    public P64(C8BN c8bn, EnumC50631MWs enumC50631MWs, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, AbstractC59962oe abstractC59962oe, UserSession userSession, C50858Mdp c50858Mdp, ClipsCreationViewModel clipsCreationViewModel, C677733r c677733r, InterfaceC58053Poe interfaceC58053Poe, InterfaceC57964PnA interfaceC57964PnA, InterfaceC58309Pt1 interfaceC58309Pt1, C50664MYh c50664MYh, C50979Mfm c50979Mfm, C50669MYn c50669MYn, EnumC1810381f enumC1810381f, String str, String str2, Map map, int i, boolean z) {
        AbstractC167007dF.A1G(userSession, 2, c50664MYh);
        AbstractC25233BEq.A0y(6, musicProduct, str, str2);
        AbstractC25229BEm.A1L(enumC1810381f, 11, enumC50631MWs);
        C14360o3.A0B(c50858Mdp, 17);
        C14360o3.A0B(c50669MYn, 18);
        C14360o3.A0B(c50979Mfm, 19);
        C14360o3.A0B(clipsCreationViewModel, 20);
        this.A06 = userSession;
        this.A01 = abstractC59962oe;
        MusicOverlayResultsListController musicOverlayResultsListController = new MusicOverlayResultsListController(c8bn, enumC50631MWs, immutableList, immutableList2, musicProduct, abstractC59962oe, userSession, c50858Mdp, clipsCreationViewModel, new P2N(this, 3), null, C50535MSo.A03("search", "5928524597172606", AbstractC25227BEk.A0v(abstractC59962oe, 2131973027)), c677733r, interfaceC57964PnA, c50664MYh, c50979Mfm, c50669MYn, interfaceC58309Pt1, enumC1810381f, str, abstractC59962oe.getModuleName(), null, "full_list", map, i, false, z);
        this.A02 = musicOverlayResultsListController;
        this.A04 = interfaceC58309Pt1;
        this.A03 = interfaceC58053Poe;
        this.A05 = immutableList;
        abstractC59962oe.registerLifecycleListener(musicOverlayResultsListController);
        musicOverlayResultsListController.A03 = new C54430O3k(interfaceC58053Poe);
    }
}
