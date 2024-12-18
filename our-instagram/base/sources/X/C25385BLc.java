package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

/* renamed from: X.BLc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25385BLc implements InterfaceC31018DkH, InterfaceC31066Dl8, InterfaceC30982Djd, InterfaceC31160Dn4 {
    public final /* synthetic */ InterfaceC31160Dn4 A00;
    public final /* synthetic */ D0N A01;
    public final /* synthetic */ InterfaceC31018DkH A02;
    public final /* synthetic */ InterfaceC31066Dl8 A03;

    public static InterfaceC31160Dn4 A00(C25385BLc c25385BLc, Object obj) {
        C14360o3.A0B(obj, 0);
        return c25385BLc.A00;
    }

    @Override // X.InterfaceC31166DnA
    public final CUJ As5() {
        return this.A00.As5();
    }

    @Override // X.InterfaceC31165Dn9
    public final void CJJ(C8JW c8jw, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C14360o3.A0B(c120985dq, 0);
        AbstractC167027dH.A13(c37644Ghd, clipsViewerConfig, c8jw);
        this.A00.CJJ(c8jw, clipsViewerConfig, c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31014DkD
    public final void CJM() {
        this.A00.CJM();
    }

    @Override // X.InterfaceC31054Dku
    public final void CJc(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        this.A03.CJc(c120985dq, c37644Ghd, null, false);
    }

    @Override // X.InterfaceC31046Dkk
    public final void CJy(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, int i) {
        AbstractC167027dH.A12(c120985dq, c37644Ghd, c38321qM);
        this.A03.CJy(view, c120985dq, c37644Ghd, c38321qM, i);
    }

    @Override // X.InterfaceC31018DkH
    public final void CK5(C50559MTq c50559MTq, int i, boolean z, boolean z2) {
        C14360o3.A0B(c50559MTq, 1);
        this.A02.CK5(c50559MTq, i, z, z2);
    }

    @Override // X.InterfaceC31014DkD
    public final void CK7(View view) {
        this.A00.CK7(view);
    }

    @Override // X.InterfaceC31162Dn6
    public final void CKA(C120985dq c120985dq, BPP bpp, InterfaceC30862Dhb interfaceC30862Dhb, int i) {
        AbstractC25233BEq.A0v(0, bpp, c120985dq, interfaceC30862Dhb);
        this.A00.CKA(c120985dq, bpp, interfaceC30862Dhb, i);
    }

    @Override // X.InterfaceC31166DnA
    public final void CKZ(Context context, C120985dq c120985dq, String str, String str2, String str3) {
        C14360o3.A0B(c120985dq, 1);
        this.A00.CKZ(context, c120985dq, "sponsored_label", "sponsored_label_waist_tap", "primary");
    }

    @Override // X.InterfaceC31018DkH
    public final void Ckq(BLC blc, Integer num, int i, boolean z, boolean z2) {
        AbstractC167017dG.A1P(blc, num);
        this.A02.Ckq(blc, num, i, z, z2);
    }

    @Override // X.InterfaceC31060Dl2
    public final void CyM(View view, C26053Bfg c26053Bfg, C37644Ghd c37644Ghd, C38321qM c38321qM, User user, C57 c57, Integer num, InterfaceC16620sF interfaceC16620sF) {
        AbstractC167007dF.A1E(c38321qM, 0, c37644Ghd);
        C14360o3.A0B(interfaceC16620sF, 7);
        this.A00.CyM(view, c26053Bfg, c37644Ghd, c38321qM, user, c57, num, interfaceC16620sF);
    }

    @Override // X.InterfaceC30980Djb
    public final void D9A(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31137Dmc interfaceC31137Dmc, int i, int i2) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C14360o3.A0B(interfaceC31137Dmc, 4);
        this.A00.D9A(c120985dq, c37644Ghd, interfaceC31137Dmc, i, i2);
    }

    @Override // X.InterfaceC31052Dks
    public final void DGH() {
        this.A00.DGH();
    }

    @Override // X.InterfaceC31074DlG
    public final void DR8(C75113Zb c75113Zb, BL0 bl0) {
        this.A00.DR8(c75113Zb, bl0);
    }

    @Override // X.C39H
    public final void DWK(EnumC85043qs enumC85043qs, C38321qM c38321qM, Integer num, WeakReference weakReference, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167027dH.A0a(0, weakReference, c38321qM, enumC85043qs, interfaceC16820sZ);
        C14360o3.A0B(interfaceC16660sJ, 5);
        this.A03.DWK(enumC85043qs, c38321qM, num, weakReference, interfaceC16820sZ, interfaceC16660sJ);
    }

    @Override // X.InterfaceC31074DlG
    public final void DX4(C75113Zb c75113Zb, BL0 bl0) {
        this.A00.DX4(c75113Zb, bl0);
    }

    @Override // X.InterfaceC31043Dkh
    public final void DXD(C50559MTq c50559MTq, C120985dq c120985dq, C37644Ghd c37644Ghd, int i, int i2, boolean z) {
        AbstractC167027dH.A12(c120985dq, c37644Ghd, c50559MTq);
        this.A00.DXD(c50559MTq, c120985dq, c37644Ghd, i, i2, z);
    }

    @Override // X.InterfaceC31061Dl3
    public final void DlJ(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z, boolean z2) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A03.DlJ(view, c120985dq, c37644Ghd, z, z2);
    }

    @Override // X.InterfaceC31017DkG
    public final void DvZ(View view) {
        this.A00.DvZ(view);
    }

    @Override // X.InterfaceC31074DlG
    public final void DwY(C75113Zb c75113Zb, BL0 bl0) {
        this.A00.DwY(c75113Zb, bl0);
    }

    @Override // X.InterfaceC31021DkK
    public final void E1N(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A03.E1N(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC31022DkL
    public final void ER9(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A00.ER9(interfaceC16610sE);
    }

    @Override // X.InterfaceC30983Dje
    public final void ET8(C9BW c9bw) {
        this.A00.ET8(c9bw);
    }

    @Override // X.InterfaceC31066Dl8
    public final void EX7(InterfaceC16570sA interfaceC16570sA) {
        this.A03.EX7(interfaceC16570sA);
    }

    @Override // X.InterfaceC31020DkJ
    public final void EX8(InterfaceC16660sJ interfaceC16660sJ) {
        this.A03.EX8(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31070DlC
    public final void EX9(C0s7 c0s7) {
        this.A00.EX9(c0s7);
    }

    @Override // X.InterfaceC30981Djc
    public final void EXA(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00.EXA(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31165Dn9
    public final void EXB(InterfaceC16610sE interfaceC16610sE) {
        this.A00.EXB(interfaceC16610sE);
    }

    @Override // X.InterfaceC31165Dn9
    public final void EXE(BKS bks) {
        this.A00.EXE(bks);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXF(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXF(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31070DlC
    public final void EXG(InterfaceC16740sR interfaceC16740sR) {
        this.A00.EXG(interfaceC16740sR);
    }

    @Override // X.InterfaceC31070DlC
    public final void EXH(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXH(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31044Dki
    public final void EXJ(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        this.A00.EXJ(interfaceC16620sF);
    }

    @Override // X.InterfaceC31061Dl3
    public final void EXN(InterfaceC16660sJ interfaceC16660sJ) {
        this.A03.EXN(interfaceC16660sJ);
    }

    @Override // X.C39H
    public final void EXO(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A03.EXO(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXP(InterfaceC16620sF interfaceC16620sF) {
        this.A00.EXP(interfaceC16620sF);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXQ(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00.EXQ(interfaceC16820sZ);
    }

    @Override // X.InterfaceC31052Dks
    public final void EXR(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXR(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXS(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXS(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31045Dkj
    public final void EXT(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXT(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31052Dks
    public final void EXU(InterfaceC16620sF interfaceC16620sF) {
        this.A00.EXU(interfaceC16620sF);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXV(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXV(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXW(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXW(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXX(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXX(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXY(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00.EXY(interfaceC16820sZ);
    }

    @Override // X.InterfaceC31046Dkk
    public final void EXZ(InterfaceC16590sC interfaceC16590sC) {
        this.A03.EXZ(interfaceC16590sC);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXa(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00.EXa(interfaceC16820sZ);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXb(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXb(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31074DlG
    public final void EXc(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXc(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31074DlG
    public final void EXd(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXd(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31074DlG
    public final void EXe(InterfaceC16610sE interfaceC16610sE) {
        this.A00.EXe(interfaceC16610sE);
    }

    @Override // X.InterfaceC31060Dl2
    public final void EXf(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXf(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31060Dl2
    public final void EXg(InterfaceC16610sE interfaceC16610sE) {
        this.A00.EXg(interfaceC16610sE);
    }

    @Override // X.InterfaceC31054Dku
    public final void EXh(InterfaceC16660sJ interfaceC16660sJ) {
        this.A03.EXh(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31054Dku
    public final void EXi(InterfaceC16660sJ interfaceC16660sJ) {
        this.A03.EXi(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31043Dkh
    public final void EXj(BKS bks) {
        this.A00.EXj(bks);
    }

    @Override // X.InterfaceC31066Dl8
    public final void EXk(InterfaceC16610sE interfaceC16610sE) {
        this.A03.EXk(interfaceC16610sE);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXl(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXl(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXn(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00.EXn(interfaceC16820sZ);
    }

    @Override // X.InterfaceC31061Dl3
    public final void EXo(InterfaceC16660sJ interfaceC16660sJ) {
        this.A03.EXo(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31053Dkt
    public final void EXp(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXp(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31015DkE
    public final void EXq(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00.EXq(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31015DkE
    public final void EXr(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00.EXr(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXs(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00.EXs(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXu(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXu(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXv(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00.EXv(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXw(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A00.EXw(interfaceC16610sE);
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXx(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        this.A00.EXx(interfaceC16620sF);
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXy(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00.EXy(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXz(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EXz(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31044Dki
    public final void EY0(InterfaceC16590sC interfaceC16590sC) {
        C14360o3.A0B(interfaceC16590sC, 0);
        this.A00.EY0(interfaceC16590sC);
    }

    @Override // X.InterfaceC31044Dki
    public final void EY1(C0s8 c0s8) {
        C14360o3.A0B(c0s8, 0);
        this.A00.EY1(c0s8);
    }

    @Override // X.InterfaceC31162Dn6
    public final void EY2(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.EY2(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31067Dl9
    public final void EYZ(InterfaceC16620sF interfaceC16620sF) {
        this.A03.EYZ(interfaceC16620sF);
    }

    @Override // X.InterfaceC31074DlG
    public final void EZq(InterfaceC16620sF interfaceC16620sF) {
        this.A00.EZq(interfaceC16620sF);
    }

    @Override // X.InterfaceC31071DlD
    public final void EZz(InterfaceC16610sE interfaceC16610sE) {
        this.A00.EZz(interfaceC16610sE);
    }

    @Override // X.InterfaceC31017DkG
    public final void Ea2(View.OnClickListener onClickListener) {
        this.A00.Ea2(onClickListener);
    }

    @Override // X.InterfaceC31071DlD
    public final void EaZ(InterfaceC16610sE interfaceC16610sE) {
        this.A00.EaZ(interfaceC16610sE);
    }

    @Override // X.InterfaceC31071DlD
    public final void Eaa(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.Eaa(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31071DlD
    public final void Ebh(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.Ebh(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31071DlD
    public final void EcM(InterfaceC16610sE interfaceC16610sE) {
        this.A00.EcM(interfaceC16610sE);
    }

    @Override // X.InterfaceC31067Dl9
    public final void Ed0(InterfaceC16620sF interfaceC16620sF) {
        this.A03.Ed0(interfaceC16620sF);
    }

    @Override // X.InterfaceC31061Dl3
    public final void Eds(InterfaceC16660sJ interfaceC16660sJ) {
        this.A03.Eds(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31053Dkt
    public final void EeE(InterfaceC16620sF interfaceC16620sF) {
        this.A00.EeE(interfaceC16620sF);
    }

    @Override // X.InterfaceC31019DkI
    public final void EfN(InterfaceC16610sE interfaceC16610sE) {
        this.A03.EfN(interfaceC16610sE);
    }

    @Override // X.InterfaceC31067Dl9
    public final void EfO(InterfaceC16620sF interfaceC16620sF) {
        this.A03.EfO(interfaceC16620sF);
    }

    @Override // X.InterfaceC31021DkK
    public final void EfP(InterfaceC16660sJ interfaceC16660sJ) {
        this.A03.EfP(interfaceC16660sJ);
    }

    @Override // X.InterfaceC31071DlD
    public final void EhM(InterfaceC16620sF interfaceC16620sF) {
        this.A00.EhM(interfaceC16620sF);
    }

    @Override // X.InterfaceC31071DlD
    public final void Dbj(Context context, View view, C45103JxX c45103JxX, MVN mvn, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, User user, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC25232BEp.A1P(user, interfaceC60442pS);
        this.A00.Dbj(context, view, c45103JxX, mvn, interfaceC60442pS, c75113Zb, user, interfaceC16820sZ, z, z2, z3, z4);
    }

    public C25385BLc(InterfaceC31160Dn4 interfaceC31160Dn4, InterfaceC31018DkH interfaceC31018DkH, InterfaceC31066Dl8 interfaceC31066Dl8, D0N d0n) {
        this.A00 = interfaceC31160Dn4;
        this.A02 = interfaceC31018DkH;
        this.A01 = d0n;
        this.A03 = interfaceC31066Dl8;
    }

    @Override // X.InterfaceC31165Dn9
    public final View.OnTouchListener Adj(Context context, C120985dq c120985dq) {
        return A00(this, c120985dq).Adj(context, c120985dq);
    }

    @Override // X.InterfaceC31070DlC
    public final void CJI(C120985dq c120985dq, C37644Ghd c37644Ghd, C2Fb c2Fb) {
        AbstractC167027dH.A12(c120985dq, c37644Ghd, c2Fb);
        this.A00.CJI(c120985dq, c37644Ghd, c2Fb);
    }

    @Override // X.InterfaceC31165Dn9
    public final void CJK(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        AbstractC167017dG.A1P(c120985dq, c37644Ghd);
        this.A00.CJK(c120985dq, c37644Ghd, z);
    }

    @Override // X.InterfaceC31070DlC
    public final void CJU(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A00.CJU(c120985dq, c37644Ghd, z);
    }

    @Override // X.InterfaceC31070DlC
    public final void CJV(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A00.CJV(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31022DkL
    public final void CJZ(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        AbstractC167017dG.A1O(enumC37860GlF, enumC37861GlG);
        this.A00.CJZ(c120985dq, enumC37860GlF, enumC37861GlG);
    }

    @Override // X.InterfaceC31054Dku
    public final void CJd(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A03.CJd(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC30982Djd
    public final void CJj(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A01.CJj(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31046Dkk
    public final void CJx(C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, boolean z) {
        AbstractC167027dH.A12(c120985dq, c37644Ghd, c38321qM);
        this.A03.CJx(c120985dq, c37644Ghd, c38321qM, z);
    }

    @Override // X.InterfaceC31066Dl8
    public final void CK1(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A03.CK1(view, c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31070DlC
    public final void CK2(BQL bql, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167027dH.A12(c120985dq, c37644Ghd, bql);
        this.A00.CK2(bql, c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31162Dn6
    public final void CK8(C120985dq c120985dq, BPP bpp, int i) {
        AbstractC167017dG.A1N(c120985dq, bpp);
        this.A00.CK8(c120985dq, bpp, i);
    }

    @Override // X.InterfaceC31067Dl9
    public final void CKG(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A03.CKG(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31067Dl9
    public final void CKH(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A03.CKH(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31067Dl9
    public final void CKI(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A03.CKI(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31165Dn9
    public final void CKP(C120985dq c120985dq, C37644Ghd c37644Ghd, int i, boolean z) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A00.CKP(c120985dq, c37644Ghd, i, z);
    }

    @Override // X.InterfaceC31060Dl2
    public final void Cgu(C38321qM c38321qM) {
        A00(this, c38321qM).Cgu(c38321qM);
    }

    @Override // X.InterfaceC31060Dl2
    public final void Cgv(C37644Ghd c37644Ghd, C38321qM c38321qM) {
        AbstractC167017dG.A1N(c38321qM, c37644Ghd);
        this.A00.Cgv(c37644Ghd, c38321qM);
    }

    @Override // X.InterfaceC31020DkJ
    public final void Cxt(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        AbstractC167017dG.A1P(c120985dq, c37644Ghd);
        this.A03.Cxt(c120985dq, c37644Ghd, z);
    }

    @Override // X.InterfaceC31053Dkt
    public final void D5a(BL5 bl5, InterfaceC16820sZ interfaceC16820sZ) {
        A00(this, bl5).D5a(bl5, interfaceC16820sZ);
    }

    @Override // X.InterfaceC31053Dkt
    public final void D5c(C38321qM c38321qM) {
        A00(this, c38321qM).D5c(c38321qM);
    }

    @Override // X.InterfaceC31074DlG
    public final void DFG(BL0 bl0) {
        A00(this, bl0).DFG(bl0);
    }

    @Override // X.InterfaceC31052Dks
    public final void DGG(C26246BjF c26246BjF) {
        A00(this, c26246BjF).DGG(c26246BjF);
    }

    @Override // X.InterfaceC31074DlG
    public final void DHw(BL0 bl0) {
        A00(this, bl0).DHw(bl0);
    }

    @Override // X.InterfaceC31045Dkj
    public final void DIY(BL4 bl4) {
        A00(this, bl4).DIY(bl4);
    }

    @Override // X.InterfaceC31019DkI
    public final void DL9(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A03.DL9(view, c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31043Dkh
    public final void DXE(BLC blc, C120985dq c120985dq, int i) {
        AbstractC167017dG.A1N(c120985dq, blc);
        this.A00.DXE(blc, c120985dq, i);
    }

    @Override // X.InterfaceC31061Dl3
    public final void DlN(MotionEvent motionEvent, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1P(c120985dq, c37644Ghd);
        this.A03.DlN(motionEvent, c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31045Dkj
    public final void Dpf(BL4 bl4) {
        A00(this, bl4).Dpf(bl4);
    }

    @Override // X.InterfaceC31162Dn6
    public final void E5h(C38321qM c38321qM) {
        A00(this, c38321qM).E5h(c38321qM);
    }
}
