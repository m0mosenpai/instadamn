package X;

import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.6lt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148236lt extends AbstractC52922bZ {
    public final C149666oJ A00;
    public final C149656oI A01;
    public final C148706mf A02;
    public final AvatarStickerGraphQLRepository A03;
    public final AvatarStore A04;
    public final UserSession A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final C05A A0A;

    public final void A01() {
        C149656oI c149656oI = this.A01;
        if (AbstractC148716mg.A00(c149656oI.A02) && C149656oI.A01(c149656oI.A01) && !c149656oI.A00.A00.A00.getBoolean("key_has_interacted_with_style_2", false)) {
            C141796aw A00 = AbstractC141776au.A00(this);
            AbstractC23641Du.A05(AnonymousClass191.A00, new PZW((Object) this, (InterfaceC23621Ds) null, 9, false), A00);
        }
    }

    public final void A03(EnumC46209Kcl enumC46209Kcl, String str) {
        Integer num;
        C14360o3.A0B(str, 1);
        if (enumC46209Kcl == EnumC46209Kcl.A04) {
            InterfaceC19610xo ARD = this.A00.A00.A00.ARD();
            ARD.E77("key_has_seen_any_avatar_convergence_auto_migration_upsell", true);
            ARD.apply();
        } else if (enumC46209Kcl == EnumC46209Kcl.A05) {
            InterfaceC19610xo ARD2 = this.A00.A00.A00.ARD();
            ARD2.E77("key_has_seen_avatar_convergence_banner", true);
            ARD2.apply();
            A00();
        }
        A01();
        C148706mf c148706mf = this.A02;
        if (enumC46209Kcl == EnumC46209Kcl.A05) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        c148706mf.A01(num, str, "mux_banner", true);
    }

    public final void A04(String str) {
        Integer num;
        C14360o3.A0B(str, 0);
        C148706mf c148706mf = this.A02;
        if (this.A07.getValue() == EnumC46145Kbj.A03) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        c148706mf.A00(num, C05F.A00, str, "mux_banner", true);
    }

    public final void A05(String str) {
        Integer num;
        C14360o3.A0B(str, 0);
        C148706mf c148706mf = this.A02;
        if (this.A07.getValue() == EnumC46145Kbj.A03) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        c148706mf.A00(num, C05F.A01, str, "mux_banner", true);
    }

    public /* synthetic */ C148236lt(UserSession userSession) {
        C149656oI c149656oI = new C149656oI(userSession);
        AvatarStickerGraphQLRepository avatarStickerGraphQLRepository = new AvatarStickerGraphQLRepository(userSession);
        C149666oJ c149666oJ = new C149666oJ(C21B.A00(userSession));
        AvatarStore A00 = C20Y.A00(userSession);
        C148706mf c148706mf = new C148706mf(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A00, 5);
        this.A05 = userSession;
        this.A01 = c149656oI;
        this.A03 = avatarStickerGraphQLRepository;
        this.A00 = c149666oJ;
        this.A04 = A00;
        this.A02 = c148706mf;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C9EI(this, 28));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C9EI(this, 29));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C9EI(this, 26));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C9EI(this, 27));
        this.A0A = C10E.A00(null);
    }

    public final void A00() {
        InterfaceC19630xq interfaceC19630xq = this.A00.A00.A00;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("key_avatar_convergence_launch_upsells_view_count", interfaceC19630xq.getInt("key_avatar_convergence_launch_upsells_view_count", 0) + 1);
        ARD.apply();
        if (interfaceC19630xq.getInt("key_avatar_convergence_launch_upsells_view_count", 0) == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
            ARD2.E7G("key_last_avatar_convergence_launch_upsells_limit_reached_timestamp", currentTimeMillis);
            ARD2.apply();
            InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
            ARD3.E7D("key_avatar_convergence_launch_upsells_view_count", 0);
            ARD3.apply();
        }
    }

    public final void A02(EnumC143276dS enumC143276dS) {
        this.A0A.Egh(KA8.A00);
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MCJ(enumC143276dS, this, null, 6), A00);
    }

    public final boolean A06() {
        return C14360o3.A0K(this.A04.A01.A00, C125535lz.A00);
    }

    public final boolean A07() {
        C149656oI c149656oI = this.A01;
        AvatarStore avatarStore = c149656oI.A01;
        if (C149656oI.A02(avatarStore) && C149656oI.A01(avatarStore) && AbstractC148716mg.A00(c149656oI.A02)) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        C149656oI c149656oI = this.A01;
        if (!C149656oI.A02(c149656oI.A01)) {
            UserSession userSession = c149656oI.A02;
            if (!AbstractC148716mg.A00(userSession) && !c149656oI.A00.A00.A00.getBoolean("key_has_seen_avatar_convergence_snack_bar_in_aqr", false) && !C149656oI.A00(c149656oI)) {
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A05, userSession, 36325278612075484L)) {
                    return true;
                }
            }
        }
        return false;
    }
}
