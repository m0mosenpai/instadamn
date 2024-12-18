package com.instagram.wonderwall.repository;

import X.B4Z;
import X.C14360o3;
import X.InterfaceC16660sJ;
import X.InterfaceC31042Dkg;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallMusicPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallRepostItem;
import com.instagram.wonderwall.model.WallTextPostItem;

/* loaded from: classes5.dex */
public final class WallPostRepository {
    public final WallPendingPostManager A00;
    public final InterfaceC31042Dkg A01;
    public final WallApiGraphQLImpl A02;

    public WallPostRepository(WallApiGraphQLImpl wallApiGraphQLImpl, WallPendingPostManager wallPendingPostManager, InterfaceC31042Dkg interfaceC31042Dkg) {
        C14360o3.A0B(wallPendingPostManager, 3);
        this.A02 = wallApiGraphQLImpl;
        this.A01 = interfaceC31042Dkg;
        this.A00 = wallPendingPostManager;
    }

    public static final WallPostItem A00(WallPostItem wallPostItem, InterfaceC16660sJ interfaceC16660sJ) {
        WallPostItem wallRepostItem;
        if (wallPostItem instanceof WallTextPostItem) {
            wallRepostItem = new WallTextPostItem((WallPostInfo) interfaceC16660sJ.invoke(((WallTextPostItem) wallPostItem).A00));
        } else if (wallPostItem instanceof WallMediaPostItem) {
            WallMediaPostItem wallMediaPostItem = (WallMediaPostItem) wallPostItem;
            wallRepostItem = new WallMediaPostItem(wallMediaPostItem.A01, (WallPostInfo) interfaceC16660sJ.invoke(wallMediaPostItem.A02));
        } else if (wallPostItem instanceof WallMusicPostItem) {
            WallMusicPostItem wallMusicPostItem = (WallMusicPostItem) wallPostItem;
            wallRepostItem = new WallMusicPostItem(wallMusicPostItem.A00, (WallPostInfo) interfaceC16660sJ.invoke(wallMusicPostItem.A01), wallMusicPostItem.A02);
        } else if (wallPostItem instanceof WallGifPostItem) {
            WallGifPostItem wallGifPostItem = (WallGifPostItem) wallPostItem;
            wallRepostItem = new WallGifPostItem(wallGifPostItem.A00, (WallPostInfo) interfaceC16660sJ.invoke(wallGifPostItem.A01), wallGifPostItem.A02);
        } else if (wallPostItem instanceof WallRepostItem) {
            WallRepostItem wallRepostItem2 = (WallRepostItem) wallPostItem;
            wallRepostItem = new WallRepostItem((WallPostInfo) interfaceC16660sJ.invoke(wallRepostItem2.A00), wallRepostItem2.A01);
        } else {
            throw B4Z.A00();
        }
        return wallRepostItem;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C51740MtP r11, com.instagram.wonderwall.model.WallPostItem r12, X.InterfaceC23621Ds r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C29629D3e
            if (r0 == 0) goto L76
            r7 = r13
            X.D3e r7 = (X.C29629D3e) r7
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r7.A01 = r2
        L12:
            java.lang.Object r0 = r7.A05
            X.1JX r8 = X.C1JX.A02
            int r1 = r7.A01
            r6 = 1
            if (r1 == 0) goto L43
            if (r1 != r6) goto L7c
            boolean r5 = r7.A04
            int r4 = r7.A00
            java.lang.Object r12 = r7.A03
            com.instagram.wonderwall.model.WallPostItem r12 = (com.instagram.wonderwall.model.WallPostItem) r12
            java.lang.Object r1 = r7.A02
            com.instagram.wonderwall.repository.WallPostRepository r1 = (com.instagram.wonderwall.repository.WallPostRepository) r1
            X.AbstractC09560e7.A00(r0)
        L2c:
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            if (r0 != 0) goto L40
            X.Dkg r1 = r1.A01
            X.DHF r0 = new X.DHF
            r0.<init>(r5, r4)
            com.instagram.wonderwall.model.WallPostItem r0 = A00(r12, r0)
            r1.E1e(r0)
        L40:
            X.0eB r8 = X.C0eB.A00
        L42:
            return r8
        L43:
            X.AbstractC09560e7.A00(r0)
            com.instagram.wonderwall.model.WallPostInfo r9 = r12.Bez()
            int r4 = r9.A01
            boolean r5 = r9.A0A
            boolean r3 = r11.A01
            X.Dkg r2 = r10.A01
            r1 = 26
            X.BIf r0 = new X.BIf
            r0.<init>(r3, r1)
            com.instagram.wonderwall.model.WallPostItem r0 = A00(r12, r0)
            r2.E1e(r0)
            com.instagram.wonderwall.api.WallApiGraphQLImpl r1 = r10.A02
            java.lang.String r0 = r9.A06
            r7.A02 = r10
            r7.A03 = r12
            r7.A00 = r4
            r7.A04 = r5
            r7.A01 = r6
            java.lang.Object r0 = r1.A01(r11, r0, r7)
            if (r0 == r8) goto L42
            r1 = r10
            goto L2c
        L76:
            X.D3e r7 = new X.D3e
            r7.<init>(r10, r13)
            goto L12
        L7c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallPostRepository.A01(X.MtP, com.instagram.wonderwall.model.WallPostItem, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.wonderwall.model.WallPostItem r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 15
            boolean r0 = X.C57147PWz.A02(r8, r3)
            if (r0 == 0) goto L7c
            r5 = r8
            X.PWz r5 = (X.C57147PWz) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L53
            if (r0 != r2) goto L82
            java.lang.Object r7 = r5.A02
            com.instagram.wonderwall.model.WallPostItem r7 = (com.instagram.wonderwall.model.WallPostItem) r7
            java.lang.Object r1 = r5.A01
            com.instagram.wonderwall.repository.WallPostRepository r1 = (com.instagram.wonderwall.repository.WallPostRepository) r1
            X.AbstractC09560e7.A00(r4)
        L2c:
            boolean r0 = X.AbstractC166987dD.A1a(r4)
            if (r0 == 0) goto L42
            X.Dkg r1 = r1.A01
            com.instagram.wonderwall.model.WallPostInfo r0 = r7.Bez()
            java.lang.String r0 = r0.A06
            r1.E1a(r0)
        L3d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L42:
            X.C7B r0 = X.C7B.A03
            X.Dkg r1 = r1.A01
            X.DRk r0 = X.C30179DRk.A01(r0, r2)
            com.instagram.wonderwall.model.WallPostItem r0 = A00(r7, r0)
            r1.E1e(r0)
            r2 = 0
            goto L3d
        L53:
            X.AbstractC09560e7.A00(r4)
            X.C7B r0 = X.C7B.A02
            X.Dkg r1 = r6.A01
            X.DRk r0 = X.C30179DRk.A01(r0, r2)
            com.instagram.wonderwall.model.WallPostItem r0 = A00(r7, r0)
            r1.E1e(r0)
            com.instagram.wonderwall.api.WallApiGraphQLImpl r1 = r6.A02
            com.instagram.wonderwall.model.WallPostInfo r0 = r7.Bez()
            java.lang.String r0 = r0.A06
            r5.A01 = r6
            r5.A02 = r7
            r5.A00 = r2
            java.lang.Object r4 = r1.A03(r0, r5)
            if (r4 != r3) goto L7a
            return r3
        L7a:
            r1 = r6
            goto L2c
        L7c:
            X.PWz r5 = new X.PWz
            r5.<init>(r6, r8, r3)
            goto L16
        L82:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallPostRepository.A02(com.instagram.wonderwall.model.WallPostItem, X.1Ds):java.lang.Object");
    }
}
