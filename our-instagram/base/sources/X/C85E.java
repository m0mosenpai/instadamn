package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.85E, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85E implements C85F, C85G, InterfaceC1810781j, AnonymousClass851, C85H {
    public float A00;
    public int A01;
    public ImageView A02;
    public C47957LGt A03;
    public C210639Tc A04;
    public C66305U8d A05;
    public C8HI A06;
    public WXc A07;
    public final Activity A08;
    public final View A09;
    public final ViewGroup A0A;
    public final AbstractC59962oe A0B;
    public final InterfaceC11380iw A0C;
    public final UserSession A0D;
    public final Runnable A0E = new Runnable() { // from class: X.85I
        @Override // java.lang.Runnable
        public final void run() {
            C85E.this.A01();
        }
    };
    public final AnonymousClass858 A0F;
    public final InterfaceC1810081c A0G;
    public final C85J A0H;
    public final boolean A0I;

    @Override // X.C85F
    public final void D1R(String str) {
        if (str != null && this.A0I) {
            AnonymousClass858 anonymousClass858 = this.A0F;
            if (!anonymousClass858.A02(str)) {
                anonymousClass858.A00.Egh(new C189118Zc(C85B.A0C, str, "name_tag", null, null, null, null, -1, false));
            }
        }
    }

    @Override // X.AnonymousClass851
    public final void DJ2(float f, float f2) {
        this.A00 = (float) Math.min(Math.max(f, 0.0d), 1.0d);
    }

    @Override // X.C85F
    public final void DLZ() {
    }

    @Override // X.C85F
    public final void Dxn(User user, boolean z) {
        InterfaceC1810081c interfaceC1810081c;
        Object c187768Tt;
        this.A01 = 0;
        if (z) {
            A01();
            if (this.A00 < 0.01d) {
                interfaceC1810081c = this.A0G;
                c187768Tt = new C187738Tq(user);
            } else {
                return;
            }
        } else {
            if (C2TN.A04(this.A0D, user)) {
                return;
            }
            interfaceC1810081c = this.A0G;
            c187768Tt = new C187768Tt(user);
        }
        interfaceC1810081c.E4u(c187768Tt);
    }

    public final void A00() {
        C1QE.A01("instagram_nametag").A08();
        C47957LGt c47957LGt = this.A03;
        if (c47957LGt != null) {
            c47957LGt.A01();
        }
        WXc wXc = this.A07;
        if (wXc != null && !wXc.A03()) {
            AbstractC25651Mw.A00(wXc.A0G).A02(wXc.A0F, C70073Cr.class);
        }
    }

    public final void A01() {
        this.A0A.removeCallbacks(this.A0E);
        C210639Tc c210639Tc = this.A04;
        if (c210639Tc != null) {
            View view = c210639Tc.A00;
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
            A01.A0I(0.0f);
            AbstractC125325le A0F = A01.A0F(true);
            A0F.A05 = new AmE(c210639Tc);
            A0F.A0H();
            C150956qv.A08(new View[]{c210639Tc.A01}, true);
        }
    }

    @Override // X.C85H
    public final /* bridge */ /* synthetic */ boolean A7D(Object obj, Object obj2) {
        if (((EnumC1810181d) obj).ordinal() == 45) {
            if (this.A00 == 0.0f) {
                return true;
            }
            return false;
        }
        throw new UnsupportedOperationException("Unexpected filtered state");
    }

    @Override // X.C85F
    public final void DFD(String str) {
        this.A0H.A00(str, true, false);
    }

    @Override // X.C85F
    public final void DMy(String str) {
        this.A0H.A00(str, false, false);
    }

    @Override // X.C85G
    public final void Dh6(boolean z) {
        this.A0G.E4u(new Object());
    }

    @Override // X.C85G
    public final void Dh7(float f) {
        C8HI c8hi = this.A06;
        InterfaceC1810081c interfaceC1810081c = this.A0G;
        if (interfaceC1810081c.CRB(EnumC1810181d.A0p) && c8hi != null) {
            C8HI.A0C(c8hi, (int) AbstractC70163Da.A00(f));
            return;
        }
        if (!interfaceC1810081c.CRB(EnumC1810181d.A0q)) {
            return;
        }
        if (this.A02 == null) {
            ViewGroup viewGroup = this.A0A;
            ImageView imageView = (ImageView) ((ViewStub) viewGroup.requireViewById(R.id.nametag_photo_blur_overlay_stub)).inflate();
            this.A02 = imageView;
            C69422Vn7 c69422Vn7 = new C69422Vn7(imageView, "NametagFacade", this.A09);
            c69422Vn7.A02 = 15;
            c69422Vn7.A00 = 6;
            c69422Vn7.A03 = viewGroup.getContext().getColor(R.color.primary_text_disabled_material_dark);
            C66305U8d c66305U8d = new C66305U8d(c69422Vn7);
            this.A05 = c66305U8d;
            c66305U8d.setVisible(false, false);
        }
        int A00 = (int) AbstractC70163Da.A00(f);
        ImageView imageView2 = this.A02;
        C66305U8d c66305U8d2 = this.A05;
        if (c66305U8d2 == null || imageView2 == null) {
            return;
        }
        int i = 0;
        boolean z = false;
        if (A00 > 0) {
            z = true;
        }
        c66305U8d2.setVisible(z, false);
        if (A00 <= 0) {
            i = 4;
        }
        imageView2.setVisibility(i);
        imageView2.setImageDrawable(c66305U8d2);
        imageView2.setImageAlpha(A00);
    }

    @Override // X.C85G
    public final void Dlz(String str, int i, String str2) {
        this.A0G.E4u(new C187758Ts(str2, str, i));
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        User user;
        int ordinal = ((EnumC1810181d) obj2).ordinal();
        if (ordinal != 45) {
            if (ordinal == 46) {
                user = ((C187768Tt) obj3).A00;
            } else {
                return;
            }
        } else {
            user = ((C187738Tq) obj3).A00;
        }
        WXc wXc = this.A07;
        if (wXc != null) {
            wXc.A02(user);
        }
    }

    @Override // X.C85F
    public final void Dxw(String str, boolean z) {
        C8HI c8hi = this.A06;
        if (z && c8hi != null) {
            int i = this.A01 + 1;
            this.A01 = i;
            if (i >= 10) {
                UserSession userSession = this.A0D;
                C19280xC A04 = C1QE.A01("instagram_nametag").A04(AbstractC43591JPw.A00(1061));
                A04.A08(Integer.valueOf(i), AbstractC58317Pt9.A00(276));
                AbstractC11060iN.A00(userSession).EHW(A04);
                C8HI.A07(c8hi);
                C9GR.A07(this.A08, 2131968158);
            }
        }
    }

    public C85E(ViewGroup viewGroup, AnonymousClass858 anonymousClass858, InterfaceC11380iw interfaceC11380iw, C81J c81j, InterfaceC1810081c interfaceC1810081c) {
        Activity activity = c81j.A05;
        this.A08 = activity;
        c81j.A0M.getClass();
        this.A0B = c81j.A0M;
        this.A0A = viewGroup;
        this.A09 = viewGroup.requireViewById(R.id.camera_photo_texture_view);
        this.A0D = c81j.A0S;
        this.A0G = interfaceC1810081c;
        this.A0H = new C85J(activity);
        this.A0F = anonymousClass858;
        this.A0I = c81j.A36;
        this.A0C = interfaceC11380iw;
    }
}
