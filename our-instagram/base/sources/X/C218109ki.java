package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9ki, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218109ki extends ACt implements C1NJ, InterfaceC1810781j {
    public int A00;
    public Bitmap A01;
    public Drawable A02;
    public User A03;
    public List A05;
    public boolean A06;
    public final Context A07;
    public final UserSession A09;
    public final TargetViewSizeProvider A0A;
    public final C88Y A0B;
    public final C190588cG A0C;
    public final InterfaceC1810081c A0D;
    public final InterfaceC169517hR A0E;
    public final C8FC A0F;
    public final C8FC A0G;
    public final C8FC A0H;
    public final InterfaceC11380iw A0I;
    public final C23108AGw A0J;
    public final TextWatcher A08 = new C23190APm(true);
    public List A04 = AbstractC166987dD.A1E();

    public static void A01(C218109ki c218109ki, A8Z a8z) {
        c218109ki.A01 = null;
        C1OG A0J = C25821No.A00().A0J(a8z.A00, null);
        A0J.A02(c218109ki);
        A0J.A08 = Integer.valueOf(c218109ki.A00);
        A0J.A01();
        AnonymousClass229.A01(c218109ki.A09).A0v(EnumC223439ta.CARDS, a8z.A02);
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C218109ki(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C88Y c88y, InterfaceC1810081c interfaceC1810081c) {
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A0R = false;
        this.A0J = c23108AGw;
        this.A0G = new C8FC((C8D0) new C183748Cz(0.5f, 0.12f), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, false, false, true, true, false, false, true, true, true, true, true, true, false, false);
        C23108AGw c23108AGw2 = new C23108AGw();
        c23108AGw2.A0H = true;
        c23108AGw2.A06 = new C183748Cz(0.5f, 0.27f);
        this.A0H = new C8FC(c23108AGw2);
        this.A0F = AbstractC23023ADf.A01();
        this.A07 = context;
        this.A0I = interfaceC11380iw;
        this.A0B = c88y;
        this.A09 = userSession;
        this.A0D = interfaceC1810081c;
        this.A0A = targetViewSizeProvider;
        interfaceC1810081c.A82(this);
        C169127gl A00 = AbstractC169097gi.A00(new C208629Kw(this, 1), userSession, new C61972ry(context, abstractC018607g), new C36691GFm(1, this, userSession), "coefficient_besties_list_ranking", Collections.singletonList(AbstractC166987dD.A10(userSession)), true);
        this.A0E = A00;
        C190588cG c190588cG = new C190588cG(interfaceC11380iw, userSession, new C23798Ag9(userSession, this), A00);
        this.A0C = c190588cG;
        c190588cG.setHasStableIds(true);
        A00.EYJ(new C71022Wmd(this, 0));
    }

    public static A8Z A00(C218109ki c218109ki) {
        List list = c218109ki.A05;
        list.getClass();
        return (A8Z) list.get(c218109ki.A00);
    }

    public static void A02(C218109ki c218109ki, User user) {
        C88Y c88y = c218109ki.A0B;
        c88y.A0I(AnonymousClass001.A0R("@", user.getUsername()));
        if (c218109ki.A01 == null) {
            c88y.A0J(c218109ki.A07.getString(2131974056));
            return;
        }
        c218109ki.A0D.E4u(new Object());
        c88y.A04();
        c88y.A00.A01.A05.A02.A01.A0A = user;
        A8Z A00 = A00(c218109ki);
        UserSession userSession = c218109ki.A09;
        String id = user.getId();
        String str = A00.A02;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A06();
        c25621Ms.A0L("creatives/create_mode/card_for_user/%s/", id, str);
        c25621Ms.A9s("card_type", str);
        c25621Ms.A0S(C32190ECl.class, C34764FTj.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C67954V3t(6, c218109ki, user);
        C1GJ.A03(A0N);
    }

    public static void A03(C218109ki c218109ki, User user, List list, int i) {
        C88Y c88y = c218109ki.A0B;
        Drawable drawable = c218109ki.A02;
        C23108AGw c23108AGw = c218109ki.A0J;
        c23108AGw.A0N = false;
        c88y.A0C(drawable, new C8FC(c23108AGw), true);
        if (i == list.size()) {
            c218109ki.A06 = true;
            C88E c88e = c88y.A00;
            c88e.A05();
            List list2 = c218109ki.A04;
            c88y.A0C(AbstractC23023ADf.A00(c218109ki.A07, c218109ki.A09, user, A00(c218109ki).A01), c218109ki.A0G, true);
            c88y.A0G(c88e.A01.A01.A08(), list2);
            return;
        }
        C38321qM c38321qM = (C38321qM) list.get(i);
        if (c38321qM.A63()) {
            C121275eQ A00 = AbstractC50633MWu.A00(c218109ki.A07, c218109ki.A09, c38321qM, "CanvasShoutoutController");
            A00.A00 = new C215989hE(c38321qM, user, c218109ki, list, i, 0);
            C1GJ.A03(A00);
            return;
        }
        C5GJ c5gj = C5GJ.CREATE_MODE_USER_SEARCH;
        C8FC A02 = AMV.A02(c218109ki.A07, c218109ki.A0A, c38321qM);
        C88E c88e2 = c88y.A00;
        c88e2.A01.A00();
        C194808jg A0Q = c88e2.A01.A03.A0Q(c5gj, c38321qM, A02);
        Drawable drawable2 = c218109ki.A02;
        c23108AGw.A0N = false;
        C88Y.A01(drawable2, c88y, c23108AGw, false);
        A0Q.A9I(new C23679AeE(i, 1, c218109ki, list, c38321qM, user, A0Q));
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        if ((obj3 instanceof C8UR) && obj2 == EnumC1810181d.A1F) {
            User user = this.A03;
            if (user != null) {
                A02(this, user);
            } else {
                AbstractC12120kG.A01("Shoutouts", "Done button tapped with no user available");
            }
        }
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Object C4x = interfaceC59502nt.C4x();
        C4x.getClass();
        if (C4x.equals(Integer.valueOf(this.A00))) {
            C88Y c88y = this.A0B;
            if (c88y.A0L(this)) {
                c88y.A07();
                Bitmap bitmap = c73033Pe.A01;
                bitmap.getClass();
                this.A01 = AbstractC226439z0.A00(bitmap, this.A0A);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.A07.getResources(), this.A01);
                this.A02 = bitmapDrawable;
                C23108AGw c23108AGw = this.A0J;
                c23108AGw.A0N = true;
                C88Y.A01(bitmapDrawable, c88y, c23108AGw, true);
            }
        }
    }
}
