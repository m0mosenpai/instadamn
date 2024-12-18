package com.instagram.video.live.mvvm.viewmodel.likes;

import X.AbstractC001800i;
import X.AbstractC07080Za;
import X.AbstractC109224vo;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25229BEm;
import X.AnonymousClass001;
import X.AnonymousClass195;
import X.C06090Tz;
import X.C0w9;
import X.C14360o3;
import X.C145826hf;
import X.C147856lA;
import X.C148286ly;
import X.C18920wW;
import X.C18U;
import X.C24721Ip;
import X.C51018MgQ;
import X.C57164PZi;
import X.EnumC142806cg;
import X.EnumC143276dS;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.JQ0;
import X.MSW;
import X.MSY;
import X.MTU;
import X.NYT;
import X.NYU;
import X.OBC;
import X.OJ4;
import X.OLC;
import X.PZY;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class IgLiveViewerLikesViewModel extends C51018MgQ {
    public static final String[] A0A = {"❤️", "😆", "😭", "🔥", "💯"};
    public static final String[] A0B = {"💯", "😆", "😭", "🔥", "❤️"};
    public AnonymousClass195 A00;
    public boolean A01;
    public final C18920wW A02;
    public final C145826hf A03;
    public final AvatarStickerInteractor A04;
    public final AvatarStickerPreRenderInteractor A05;
    public final OJ4 A06;
    public final OLC A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgLiveViewerLikesViewModel(C18920wW c18920wW, UserSession userSession, C145826hf c145826hf, OBC obc, IgLiveLikesRepository igLiveLikesRepository, OJ4 oj4, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu) {
        super(null, userSession, EnumC142806cg.A05, obc, igLiveLikesRepository, igLiveBroadcastInfoManager, c147856lA, igLiveHeartbeatManager);
        EnumC143276dS enumC143276dS;
        AvatarStickerPreRenderInteractor avatarStickerPreRenderInteractor = new AvatarStickerPreRenderInteractor(null, userSession, 126);
        AvatarStickerInteractor avatarStickerInteractor = new AvatarStickerInteractor(null, userSession, 30);
        JQ0.A1O(igLiveLikesRepository, igLiveBroadcastInfoManager, igLiveHeartbeatManager, c147856lA, oj4);
        AbstractC167017dG.A1U(mtu, userSession);
        C14360o3.A0B(obc, 10);
        C14360o3.A0B(olc, 13);
        this.A06 = oj4;
        this.A02 = c18920wW;
        this.A03 = c145826hf;
        this.A05 = avatarStickerPreRenderInteractor;
        this.A04 = avatarStickerInteractor;
        this.A07 = olc;
        C24721Ip A0s = MSY.A0s();
        this.A08 = A0s;
        this.A09 = AbstractC07080Za.A03(A0s);
        if (AbstractC109224vo.A01(userSession)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36321219868108014L)) {
                if (C18U.A06(c06090Tz, super.A02, 36321219867649256L)) {
                    enumC143276dS = EnumC143276dS.A0O;
                } else {
                    enumC143276dS = EnumC143276dS.A0N;
                }
                PZY.A02(enumC143276dS, this, AbstractC141776au.A00(this), 32);
            }
        }
        PZY.A02(igLiveLikesRepository, this, AbstractC141776au.A00(this), 29);
        PZY.A01(this, mtu.A00, 30);
    }

    private final List A04(String[] strArr) {
        int i;
        ArrayList A17 = AbstractC25225BEi.A17(5);
        int i2 = 0;
        do {
            String str = strArr[i2];
            switch (str.hashCode()) {
                case 377643:
                    if (str.equals("❤️")) {
                        i = 2131965489;
                        break;
                    }
                    break;
                case 1772562:
                    if (str.equals("💯")) {
                        i = 2131965486;
                        break;
                    }
                    break;
                case 1772680:
                    if (str.equals("🔥")) {
                        i = 2131965488;
                        break;
                    }
                    break;
                case 1772905:
                    if (str.equals("😆")) {
                        i = 2131965490;
                        break;
                    }
                    break;
                case 1772944:
                    if (str.equals("😭")) {
                        i = 2131965487;
                        break;
                    }
                    break;
                case 2071717:
                    if (str.equals("1️⃣")) {
                        i = 2131965491;
                        break;
                    }
                    break;
                case 2072678:
                    if (str.equals("2️⃣")) {
                        i = 2131965493;
                        break;
                    }
                    break;
                case 2073639:
                    if (str.equals("3️⃣")) {
                        i = 2131965492;
                        break;
                    }
                    break;
            }
            C0w9.A03("IgLiveViewerLikesViewModel", AnonymousClass001.A0g("emojiToContentDescriptionRes: ", str, " -> Unknown emoji unicode for accessibility"));
            i = 2131965494;
            A17.add(new NYT(null, str, i));
            i2++;
        } while (i2 < 5);
        return A17;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 29
            boolean r0 = X.C57146PWy.A01(r7, r3)
            if (r0 == 0) goto L47
            r5 = r7
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L4d
            java.lang.Object r6 = r5.A01
            com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r6 = (com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel) r6
            X.AbstractC09560e7.A00(r1)
        L29:
            X.OLC r0 = r6.A07
            X.05A r0 = r0.A0P
            X.AbstractC166997dE.A1Y(r0, r3)
            X.0eB r0 = X.C0eB.A00
            return r0
        L33:
            X.AbstractC09560e7.A00(r1)
            r6.A01 = r3
            X.1Iq r1 = r6.A08
            X.NbL r0 = X.C52926NbL.A00
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r0 = r1.EMz(r0, r5)
            if (r0 != r4) goto L29
            return r4
        L47:
            X.PWy r5 = new X.PWy
            r5.<init>(r6, r7, r3)
            goto L16
        L4d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel.A01(com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r9, X.InterfaceC23621Ds r10, boolean r11) {
        /*
            r3 = 8
            boolean r0 = X.MUF.A00(r10, r3)
            if (r0 == 0) goto Lc6
            r4 = r10
            X.MUF r4 = (X.MUF) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc6
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r8 = 1
            if (r0 == 0) goto La9
            if (r0 != r8) goto Lcd
            boolean r11 = r4.A04
            java.lang.Object r9 = r4.A01
            com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r9 = (com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel) r9
            X.AbstractC09560e7.A00(r1)
        L2a:
            if (r11 == 0) goto La3
            A05(r9)
        L2f:
            X.OLC r0 = r9.A07
            X.05A r0 = r0.A0P
            X.AbstractC166997dE.A1Y(r0, r8)
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r9.A05
            X.Mse r0 = X.MSX.A0U(r0)
            if (r0 == 0) goto La0
            X.6hf r6 = r9.A03
            if (r6 == 0) goto La0
            java.lang.String r7 = X.C51709Mse.A00(r0)
            java.lang.String r5 = r0.A09
            java.lang.String r4 = "viewer"
            com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository r0 = r9.A04
            X.0UO r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            boolean r3 = X.MSX.A1X(r0)
            X.C14360o3.A0B(r5, r8)
            X.0wW r1 = r6.A05
            java.lang.String r0 = "ig_live_reaction_picker_impression"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto La0
            java.lang.Long r1 = X.AbstractC25228BEl.A13(r7)
            java.lang.String r0 = "a_pk"
            r2.A9K(r0, r1)
            long r0 = X.AbstractC167027dH.A03(r7)
            X.MSY.A12(r2, r0)
            X.6hg r0 = r6.A0A
            java.lang.String r0 = r0.getModuleName()
            X.AbstractC31171DnF.A1I(r2, r0)
            X.AbstractC37300Gc1.A0l(r2, r5)
            X.MSW.A1T(r2, r4)
            java.lang.String r0 = ""
            X.AbstractC25225BEi.A1P(r2, r0)
            java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
            java.lang.String r0 = "current_guest_ids"
            r2.AAk(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "has_avatar_reactions"
            r2.A7v(r0, r1)
            r2.Cht()
        La0:
            X.0eB r3 = X.C0eB.A00
            return r3
        La3:
            X.195 r0 = r9.A00
            X.AbstractC25229BEm.A1R(r0)
            goto L2f
        La9:
            X.AbstractC09560e7.A00(r1)
            r9.A01 = r8
            X.1Iq r2 = r9.A08
            java.util.List r1 = r9.A07()
            X.NbI r0 = new X.NbI
            r0.<init>(r1)
            r4.A01 = r9
            r4.A04 = r11
            r4.A00 = r8
            java.lang.Object r0 = r2.EMz(r0, r4)
            if (r0 != r3) goto L2a
            return r3
        Lc6:
            X.MUF r4 = new X.MUF
            r4.<init>(r9, r10, r3)
            goto L16
        Lcd:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel.A02(com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel, X.1Ds, boolean):java.lang.Object");
    }

    public static final void A05(IgLiveViewerLikesViewModel igLiveViewerLikesViewModel) {
        AbstractC25229BEm.A1R(igLiveViewerLikesViewModel.A00);
        igLiveViewerLikesViewModel.A00 = AbstractC25226BEj.A1L(new C57164PZi(igLiveViewerLikesViewModel, (InterfaceC23621Ds) null, 30), AbstractC141776au.A00(igLiveViewerLikesViewModel));
    }

    public final List A07() {
        String[] strArr;
        List A04;
        List A03;
        List A1B = MSW.A1B(super.A04.A06);
        if (AbstractC166987dD.A1b(A1B)) {
            UserSession userSession = super.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36321219867387109L)) {
                A04 = A03(A1B);
                A03 = A04(A0B);
            } else if (C18U.A06(c06090Tz, userSession, 36321219867452646L)) {
                A04 = A04(A0B);
                A03 = A03(A1B);
            } else if (C18U.A06(c06090Tz, userSession, 36321219867518183L)) {
                return A03(A1B);
            }
            return AbstractC001800i.A0S(A03, A04);
        }
        if (!AbstractC109224vo.A01(super.A02)) {
            strArr = A0A;
            return A04(strArr);
        }
        strArr = A0B;
        return A04(strArr);
    }

    public static final List A03(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C148286ly c148286ly = (C148286ly) it.next();
            String str = c148286ly.A0a;
            C14360o3.A07(str);
            String str2 = c148286ly.A0S;
            C14360o3.A07(str2);
            ImageUrl imageUrl = c148286ly.A0H;
            C14360o3.A07(imageUrl);
            String str3 = c148286ly.A0h;
            C14360o3.A07(str3);
            String str4 = c148286ly.A0M;
            if (str4 == null) {
                str4 = "";
            }
            A0q.add(new NYU(null, imageUrl, null, str, str2, str3, str4));
        }
        return A0q;
    }
}
