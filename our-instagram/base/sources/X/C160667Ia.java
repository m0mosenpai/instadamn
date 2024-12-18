package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160667Ia {
    public C163547Tr A00;
    public C7MW A01;
    public C7IZ A02;
    public AnonymousClass988 A03;
    public C7IM A04;
    public C79S A05;
    public final AbstractC59962oe A06;
    public final UserSession A07;
    public final C7WA A08;
    public final C160687Ic A09;
    public final C98K A0A;
    public final C160677Ib A0B;
    public final C7ZX A0C;
    public final InterfaceC163837Ux A0D;
    public final String A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final Activity A0I;
    public final Context A0J;
    public final C55952hg A0K;
    public final InterfaceC11380iw A0L;
    public final C7IV A0M;
    public final C98N A0N;
    public final C7DK A0O;
    public final C7IN A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public C160667Ia(Activity activity, Context context, C55952hg c55952hg, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7WA c7wa, C7IZ c7iz, C98K c98k, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IV c7iv, C7IM c7im, InterfaceC163837Ux interfaceC163837Ux, C98N c98n, C7DK c7dk, C7IN c7in, String str, boolean z, boolean z2) {
        InterfaceC09390do c28111Xp;
        C14360o3.A0B(c7iz, 21);
        this.A0I = activity;
        this.A0J = context;
        this.A06 = abstractC59962oe;
        this.A07 = userSession;
        this.A0C = c7zx;
        this.A0L = interfaceC11380iw;
        this.A0D = interfaceC163837Ux;
        this.A08 = c7wa;
        this.A0K = c55952hg;
        this.A0E = str;
        this.A0P = c7in;
        this.A0O = c7dk;
        this.A0M = c7iv;
        this.A0N = c98n;
        this.A0R = z;
        this.A0Q = z2;
        this.A03 = anonymousClass988;
        this.A04 = c7im;
        this.A02 = c7iz;
        this.A0A = c98k;
        this.A0B = new C160677Ib(userSession);
        this.A09 = new C160687Ic(context, c55952hg, interfaceC11380iw, userSession, c98k, c7zx, this.A03, this.A04);
        EnumC09460dv enumC09460dv = EnumC09460dv.A03;
        this.A0H = AbstractC09440dt.A00(enumC09460dv, new C9EZ(this, 44));
        C9EZ c9ez = new C9EZ(this, 42);
        if (C7W0.A00(userSession)) {
            c28111Xp = AbstractC09440dt.A00(enumC09460dv, c9ez);
        } else {
            c28111Xp = new C28111Xp(c9ez.invoke());
        }
        this.A0F = c28111Xp;
        this.A0G = AbstractC09440dt.A01(new C9EZ(this, 43));
    }

    public static final C79S A00(C160667Ia c160667Ia) {
        C79S c79s = c160667Ia.A05;
        if (c79s == null) {
            UserSession userSession = c160667Ia.A07;
            AnonymousClass988 anonymousClass988 = c160667Ia.A03;
            C79S c79s2 = new C79S(userSession, (AnonymousClass795) c160667Ia.A0F.getValue(), c160667Ia.A0C, anonymousClass988);
            c160667Ia.A05 = c79s2;
            return c79s2;
        }
        return c79s;
    }

    public static final C7MW A01(C160667Ia c160667Ia) {
        Activity activity = c160667Ia.A0I;
        AbstractC59962oe abstractC59962oe = c160667Ia.A06;
        Context context = c160667Ia.A0J;
        UserSession userSession = c160667Ia.A07;
        C7ZX c7zx = c160667Ia.A0C;
        AnonymousClass988 anonymousClass988 = c160667Ia.A03;
        InterfaceC11380iw interfaceC11380iw = c160667Ia.A0L;
        C98N c98n = c160667Ia.A0N;
        boolean z = c160667Ia.A0Q;
        C55952hg c55952hg = c160667Ia.A0K;
        C7IN c7in = c160667Ia.A0P;
        C7DK c7dk = c160667Ia.A0O;
        boolean z2 = c160667Ia.A0R;
        C7IV c7iv = c160667Ia.A0M;
        C163547Tr c163547Tr = c160667Ia.A00;
        if (c163547Tr != null) {
            return new C7MW(activity, context, c55952hg, abstractC59962oe, interfaceC11380iw, userSession, c163547Tr, c7zx, anonymousClass988, c7iv, c160667Ia.A04, c98n, c7dk, c7in, z, z2);
        }
        C14360o3.A0F("messageStore");
        throw C00O.createAndThrow();
    }

    public static final C7MW A02(C160667Ia c160667Ia) {
        C7MW c7mw = c160667Ia.A01;
        if (c7mw == null) {
            C7MW A01 = A01(c160667Ia);
            c160667Ia.A01 = A01;
            return A01;
        }
        return c7mw;
    }
}
