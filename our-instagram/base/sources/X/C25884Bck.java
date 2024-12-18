package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallImage;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;
import com.instagram.wonderwall.repository.WallPostRepository;
import java.util.List;

/* renamed from: X.Bck, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25884Bck extends AbstractC52922bZ implements InterfaceC31065Dl7, InterfaceC31058Dl0 {
    public final C25671My A00;
    public final UserSession A01;
    public final WallInfo A02;
    public final InterfaceC31042Dkg A03;
    public final WallPostRepository A04;
    public final List A05;
    public final List A06;
    public final InterfaceC09390do A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final C05A A0A;
    public final C0UO A0B;

    @Override // X.InterfaceC31058Dl0
    public final void AE6(User user) {
        C14360o3.A0B(user, 0);
        A02(new C56824PJu(user, C30179DRk.A01(this, 28)), this);
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1Y(WallPostItem wallPostItem) {
        C14360o3.A0B(wallPostItem, 0);
        A02(new C29444CyK(wallPostItem), this);
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1Z(WallPostItem wallPostItem) {
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1c(C51740MtP c51740MtP, WallPostItem wallPostItem) {
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1d(WallPostItem wallPostItem) {
    }

    @Override // X.InterfaceC31058Dl0
    public final void EI2(WallPostItem wallPostItem) {
        C14360o3.A0B(wallPostItem, 0);
        A02(new C29446CyM(wallPostItem, new C57751Pje(38, wallPostItem, this)), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (r6.A0B != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C25884Bck(com.instagram.common.session.UserSession r15, com.instagram.wonderwall.model.WallPostItem r16, boolean r17) {
        /*
            r14 = this;
            r8 = r16
            com.instagram.wonderwall.model.WallPostInfo r6 = r8.Bez()
            com.instagram.wonderwall.model.WallInfo r1 = r6.A04
            X.1My r0 = X.AbstractC25651Mw.A00(r15)
            r2 = 1
            X.AbstractC25233BEq.A0x(r2, r15, r1, r0)
            r14.<init>()
            r14.A01 = r15
            r14.A02 = r1
            r14.A00 = r0
            r3 = 0
            X.1Ip r0 = X.AbstractC25229BEm.A12()
            r14.A08 = r0
            X.05U r0 = X.AbstractC07080Za.A03(r0)
            r14.A09 = r0
            com.instagram.user.model.User r1 = r1.A00
            com.instagram.user.model.User r0 = r6.A03
            com.instagram.user.model.User[] r1 = new com.instagram.user.model.User[]{r1, r0}
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.util.Set r0 = X.AbstractC009903n.A0K(r1)
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r7 = r0.iterator()
        L3e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r5 = r7.next()
            r0 = r5
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = r0.getId()
            com.instagram.common.session.UserSession r0 = r14.A01
            java.lang.String r0 = r0.userId
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L3e
            r4.add(r5)
            goto L3e
        L5d:
            r14.A05 = r4
            X.0dv r1 = X.EnumC09460dv.A02
            r0 = 16
            X.DGg r0 = X.C29892DGg.A00(r14, r0)
            X.0do r0 = X.AbstractC09440dt.A00(r1, r0)
            r14.A07 = r0
            java.util.ArrayList r0 = X.AbstractC001800i.A0U(r4)
            r14.A06 = r0
            com.instagram.wonderwall.model.WallInfo r0 = r14.A02
            com.instagram.user.model.User r0 = r0.A00
            java.lang.String r0 = r0.getUsername()
            com.instagram.wonderwall.model.WallText$Raw r9 = new com.instagram.wonderwall.model.WallText$Raw
            r9.<init>(r0)
            com.instagram.wonderwall.model.WallInfo r0 = r14.A02
            boolean r0 = r0.A03
            if (r0 != 0) goto L8b
            boolean r0 = r6.A0B
            r11 = 0
            if (r0 == 0) goto L8c
        L8b:
            r11 = 1
        L8c:
            com.instagram.common.session.UserSession r7 = r14.A01
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36322297904834680(0x810af0000b2878, double:3.0337056809470627E-306)
            boolean r0 = X.C18U.A06(r5, r7, r0)
            if (r0 == 0) goto La5
            com.instagram.wonderwall.model.WallInfo r0 = r14.A02
            boolean r0 = r0.A03
            if (r0 == 0) goto Le9
            boolean r0 = r6.A0B
            if (r0 == 0) goto Le9
        La5:
            r12 = 0
        La6:
            com.instagram.wonderwall.model.WallText r10 = A01(r14)
            int r0 = r4.size()
            boolean r13 = X.AbstractC25230BEn.A1S(r0, r2)
            X.Bfu r7 = new X.Bfu
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.02u r0 = X.AbstractC25225BEi.A1H(r7)
            r14.A0A = r0
            r14.A0B = r0
            X.Cxw r4 = new X.Cxw
            r4.<init>(r8, r14)
            r14.A03 = r4
            com.instagram.common.session.UserSession r0 = r14.A01
            com.instagram.wonderwall.api.WallApiGraphQLImpl r2 = new com.instagram.wonderwall.api.WallApiGraphQLImpl
            r2.<init>(r0)
            com.instagram.wonderwall.repository.WallPendingPostManager r1 = X.CZ2.A00(r0)
            com.instagram.wonderwall.repository.WallPostRepository r0 = new com.instagram.wonderwall.repository.WallPostRepository
            r0.<init>(r2, r1, r4)
            r14.A04 = r0
            if (r17 == 0) goto Le8
            X.6aw r2 = X.AbstractC141776au.A00(r14)
            r1 = 39
            X.PYu r0 = new X.PYu
            r0.<init>(r14, r3, r1)
            X.AbstractC166987dD.A1Z(r0, r2)
        Le8:
            return
        Le9:
            r12 = 1
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25884Bck.<init>(com.instagram.common.session.UserSession, com.instagram.wonderwall.model.WallPostItem, boolean):void");
    }

    public static final C27916CSb A00(User user, User user2, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        WallText raw;
        if (user2 != null) {
            raw = new WallText.Res(2131976989, new String[]{user2.getUsername(), user.getUsername()});
        } else {
            raw = new WallText.Raw(user.getUsername());
        }
        return new C27916CSb(new WallImage.CircularAvatar(user, user2), raw, interfaceC16820sZ, false, z);
    }

    public static final WallText A01(C25884Bck c25884Bck) {
        int i;
        String[] strArr;
        List list = c25884Bck.A06;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                i = 2131976987;
                strArr = new String[]{((User) list.get(0)).getUsername(), ((User) list.get(1)).getUsername()};
            } else {
                i = 2131976986;
                strArr = new String[]{((User) list.get(0)).getUsername()};
            }
            return new WallText.Res(i, strArr);
        }
        return C28154Cb1.A00;
    }

    public static final void A03(C25884Bck c25884Bck, InterfaceC16660sJ interfaceC16660sJ) {
        Object value;
        C05A c05a = c25884Bck.A0A;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, interfaceC16660sJ.invoke(value)));
    }

    public final void A04(boolean z) {
        A03(this, new C25310BIf(z, 27));
    }

    @Override // X.InterfaceC31058Dl0
    public final void CMV() {
        A03(this, DQ3.A00);
    }

    @Override // X.InterfaceC31065Dl7
    public final void Dxx(String str) {
        A02(new C29442CyI(str), this);
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1b(String str) {
        A02(new C29441CyH(str), this);
    }

    @Override // X.InterfaceC31058Dl0
    public final void Ekl(C27915CSa c27915CSa) {
        A03(this, C30179DRk.A01(c27915CSa, 30));
    }

    @Override // X.InterfaceC31058Dl0
    public final void Eln(WallText wallText) {
        A02(new C29445CyL(wallText), this);
    }

    public static final void A02(InterfaceC30838DhD interfaceC30838DhD, C25884Bck c25884Bck) {
        AbstractC166987dD.A1Z(new C57157PZb(interfaceC30838DhD, c25884Bck, (InterfaceC23621Ds) null, 36), AbstractC141776au.A00(c25884Bck));
    }
}
