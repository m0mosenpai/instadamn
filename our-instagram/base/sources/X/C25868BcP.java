package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.repository.WallPostComposerRepository;

/* renamed from: X.BcP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25868BcP extends AbstractC52922bZ {
    public AudioOverlayTrack A00;
    public final UserSession A01;
    public final WallInfo A02;
    public final WallPostComposerRepository A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;
    public final C05A A06;
    public final C0UO A07;
    public final boolean A08;

    public static final void A00(InterfaceC30837DhC interfaceC30837DhC, C25868BcP c25868BcP) {
        c25868BcP.A02(false);
        AbstractC166987dD.A1Z(new C57157PZb(interfaceC30837DhC, c25868BcP, (InterfaceC23621Ds) null, 35), AbstractC141776au.A00(c25868BcP));
    }

    public C25868BcP(UserSession userSession, WallInfo wallInfo, WallPostComposerRepository wallPostComposerRepository, boolean z) {
        Object value;
        C5Hc A00;
        boolean z2;
        User user;
        C5C3 c5c3;
        InterfaceC58259Ps3 interfaceC58259Ps3;
        boolean z3;
        String str;
        boolean z4;
        String str2;
        boolean z5;
        C27915CSa c27915CSa;
        boolean z6;
        this.A02 = wallInfo;
        this.A01 = userSession;
        this.A08 = z;
        this.A03 = wallPostComposerRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C26019Bf8(AbstractC25227BEk.A0S(""), AbstractC166997dE.A0Y(userSession), null, null, "0/60", null, C5HZ.A01, false, false, false, true, true));
        this.A06 = A1H;
        this.A07 = A1H;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A04 = A12;
        this.A05 = AbstractC07080Za.A03(A12);
        C05A c05a = this.A06;
        do {
            value = c05a.getValue();
            C26019Bf8 c26019Bf8 = (C26019Bf8) value;
            C51752Mtb c51752Mtb = new C51752Mtb(C29892DGg.A00(this, 10), R.drawable.instagram_photo_pano_outline_24, 2131969575, 15);
            UserSession userSession2 = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession2, 36322297904179311L) && !C18U.A06(c06090Tz, userSession2, 36322297904244848L)) {
                c51752Mtb = null;
            }
            C51752Mtb[] c51752MtbArr = {c51752Mtb, C18U.A06(c06090Tz, userSession2, 36322297904310385L) ? new C51752Mtb(C29892DGg.A00(this, 11), R.drawable.instagram_music_add_pano_outline_24, 2131953293, 15) : null, C18U.A06(c06090Tz, userSession2, 36322297904375922L) ? new C51752Mtb(C29892DGg.A00(this, 12), R.drawable.instagram_gif_pano_outline_24, 2131953293, 15) : null};
            C14360o3.A0B(c51752MtbArr, 0);
            A00 = AbstractC133095zb.A00(AbstractC009903n.A0I(c51752MtbArr));
            z2 = !this.A08;
            user = c26019Bf8.A01;
            c5c3 = c26019Bf8.A00;
            interfaceC58259Ps3 = c26019Bf8.A03;
            z3 = c26019Bf8.A07;
            str = c26019Bf8.A04;
            z4 = c26019Bf8.A0B;
            str2 = c26019Bf8.A05;
            z5 = c26019Bf8.A0A;
            c27915CSa = c26019Bf8.A02;
            z6 = c26019Bf8.A08;
            C14360o3.A0B(user, 0);
            C14360o3.A0B(c5c3, 1);
            AbstractC167007dF.A1G(A00, 3, str);
        } while (!c05a.AIi(value, new C26019Bf8(c5c3, user, c27915CSa, interfaceC58259Ps3, str, str2, A00, z3, z4, z5, z2, z6)));
        WallPostComposerRepository wallPostComposerRepository2 = this.A03;
        AbstractC25232BEp.A1J(this, new C57154PYy(this, null, 30), C10Q.A03(new C25587BTa(this, 2), wallPostComposerRepository2.A09, wallPostComposerRepository2.A08));
        AbstractC166987dD.A1Z(new PYu(this, null, 37), AbstractC141776au.A00(this));
    }

    public final void A01() {
        Object value;
        User user;
        C5C3 c5c3;
        InterfaceC58259Ps3 interfaceC58259Ps3;
        C5Hc c5Hc;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        C27915CSa c27915CSa;
        boolean z4;
        C05A c05a = this.A06;
        do {
            value = c05a.getValue();
            C26019Bf8 c26019Bf8 = (C26019Bf8) value;
            user = c26019Bf8.A01;
            c5c3 = c26019Bf8.A00;
            interfaceC58259Ps3 = c26019Bf8.A03;
            c5Hc = c26019Bf8.A06;
            z = c26019Bf8.A07;
            str = c26019Bf8.A04;
            z2 = c26019Bf8.A0B;
            str2 = c26019Bf8.A05;
            z3 = c26019Bf8.A09;
            c27915CSa = c26019Bf8.A02;
            z4 = c26019Bf8.A08;
            C14360o3.A0B(user, 0);
            AbstractC167017dG.A1Q(c5c3, c5Hc);
            C14360o3.A0B(str, 5);
        } while (!c05a.AIi(value, new C26019Bf8(c5c3, user, c27915CSa, interfaceC58259Ps3, str, str2, c5Hc, z, z2, false, z3, z4)));
    }

    public final void A02(boolean z) {
        Object value;
        User user;
        C5C3 c5c3;
        InterfaceC58259Ps3 interfaceC58259Ps3;
        C5Hc c5Hc;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        boolean z4;
        C27915CSa c27915CSa;
        boolean z5;
        C05A c05a = this.A06;
        do {
            value = c05a.getValue();
            C26019Bf8 c26019Bf8 = (C26019Bf8) value;
            user = c26019Bf8.A01;
            c5c3 = c26019Bf8.A00;
            interfaceC58259Ps3 = c26019Bf8.A03;
            c5Hc = c26019Bf8.A06;
            z2 = c26019Bf8.A07;
            str = c26019Bf8.A04;
            z3 = c26019Bf8.A0B;
            str2 = c26019Bf8.A05;
            z4 = c26019Bf8.A0A;
            c27915CSa = c26019Bf8.A02;
            z5 = c26019Bf8.A08;
            AbstractC167017dG.A1N(user, c5c3);
            AbstractC167007dF.A1G(c5Hc, 3, str);
        } while (!c05a.AIi(value, new C26019Bf8(c5c3, user, c27915CSa, interfaceC58259Ps3, str, str2, c5Hc, z2, z3, z4, z, z5)));
    }
}
