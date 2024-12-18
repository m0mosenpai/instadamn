package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NKN extends OX6 {
    public TextureViewSurfaceTextureListenerC55357OiJ A00;
    public C47Z A01;
    public Runnable A02;
    public final UserSession A03;
    public final XCX A04;
    public final OVl A05;
    public final C52457NJb A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;
    public final C54818OKt A09;
    public final boolean A0A;

    public static final void A00(NKN nkn, AbstractC54965OSv abstractC54965OSv, C47Z c47z) {
        C52482NKa c52482NKa;
        if ((abstractC54965OSv instanceof C52482NKa) && (c52482NKa = (C52482NKa) abstractC54965OSv) != null && nkn.A0A) {
            if (c47z.A0r != null) {
                A02(nkn, true);
                ViewGroup viewGroup = c52482NKa.A00;
                Context A0L = AbstractC166997dE.A0L(viewGroup);
                UserSession userSession = nkn.A03;
                float f = 1.0f;
                if (C18U.A06(C06090Tz.A05, userSession, 36324681611358595L)) {
                    f = 0.0f;
                }
                nkn.A00 = new TextureViewSurfaceTextureListenerC55357OiJ(A0L, viewGroup, userSession, c52482NKa.A04, c47z, C57525Pfz.A00(nkn, 45), f, A0L.getResources().getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxxlarge_plus), A0L.getResources().getDimensionPixelSize(R.dimen.before_and_after_media_card_width), true, true);
                A02(nkn, false);
                return;
            }
            A02(nkn, true);
        }
    }

    public static final void A01(NKN nkn, String str) {
        C51754Mtd A00;
        if (str != null) {
            JWd jWd = null;
            if (nkn.A04().A05 != null) {
                JWd jWd2 = nkn.A04().A05;
                if (jWd2 != null) {
                    jWd = new JWd(jWd2.A00, str, 6, jWd2.A02);
                }
            } else {
                jWd = new JWd((Object) null, str, 6, true);
            }
            A00 = C51754Mtd.A00(null, null, null, null, null, jWd, null, null, null, null, null, null, nkn.A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
            nkn.A07(A00);
            Runnable runnable = nkn.A02;
            if (runnable != null) {
                runnable.run();
            }
            C47Z c47z = nkn.A01;
            if (c47z != null) {
                c47z.A33 = str;
            }
            C54818OKt c54818OKt = nkn.A09;
            if (c54818OKt != null) {
                c54818OKt.A00();
            }
        }
    }

    public static final void A02(NKN nkn, boolean z) {
        C05A c05a = nkn.A08;
        C51721Msy c51721Msy = (C51721Msy) c05a.getValue();
        c05a.Egh(new C51721Msy(c51721Msy.A01, 2, c51721Msy.A03, c51721Msy.A02, z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKN(UserSession userSession, OVl oVl, C54818OKt c54818OKt, C52457NJb c52457NJb) {
        super(c52457NJb);
        AbstractC167017dG.A1P(oVl, userSession);
        this.A05 = oVl;
        this.A03 = userSession;
        this.A06 = c52457NJb;
        this.A09 = c54818OKt;
        this.A0A = C18U.A06(C06090Tz.A05, userSession, 36324681611227522L);
        this.A04 = new P0C(this);
        C008002u A1H = AbstractC25225BEi.A1H(new C51721Msy());
        this.A08 = A1H;
        this.A07 = A1H;
    }
}
