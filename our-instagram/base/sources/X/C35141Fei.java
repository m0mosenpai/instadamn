package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

/* renamed from: X.Fei, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35141Fei {
    public static final C35141Fei A00 = new Object();

    public final void A01(Context context, FragmentActivity fragmentActivity, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, C31539DtP c31539DtP, E70 e70, C32107E9f c32107E9f, InterfaceC37213GaO interfaceC37213GaO) {
        AbstractC167017dG.A1Q(userSession, c32107E9f);
        C14360o3.A0B(abstractC018607g, 6);
        User user = c32107E9f.A00;
        C3o9 A08 = e70.A08();
        boolean A04 = E70.A04(e70);
        InterfaceC83733oI interfaceC83733oI = e70.A0L;
        C14360o3.A0B(interfaceC83733oI, 0);
        A00(context, fragmentActivity, abstractC018607g, interfaceC11380iw, c18920wW, userSession, c31539DtP, A08, user, interfaceC37213GaO, A04, interfaceC83733oI instanceof MsysThreadId, e70.A0n);
    }

    public static final void A00(Context context, FragmentActivity fragmentActivity, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, C31539DtP c31539DtP, C3o9 c3o9, User user, InterfaceC37213GaO interfaceC37213GaO, boolean z, boolean z2, boolean z3) {
        EnumC33464Eqz enumC33464Eqz;
        C35015Fbo A002;
        String A03 = C7KH.A03(c3o9);
        EnumC1579076z A003 = AbstractC1578976y.A00(z2, z);
        if (z3 && z) {
            enumC33464Eqz = EnumC33464Eqz.GXAC;
        } else {
            enumC33464Eqz = EnumC33464Eqz.DEFAULT;
        }
        boolean isRestricted = user.isRestricted();
        String id = user.getId();
        if (isRestricted) {
            C75R.A05(c18920wW, A003, enumC33464Eqz, "unrestrict_option", A03, id, AbstractC166987dD.A1E());
            C28151Xt c28151Xt = C28151Xt.A02;
            if (c28151Xt != null) {
                c28151Xt.A02(context, abstractC018607g, userSession, new GJ8(context, fragmentActivity, c31539DtP), user.getId(), interfaceC11380iw.getModuleName());
                return;
            }
            return;
        }
        C75R.A05(c18920wW, A003, enumC33464Eqz, "restrict_option", A03, id, AbstractC166987dD.A1E());
        C28151Xt c28151Xt2 = C28151Xt.A02;
        if (c28151Xt2 == null || (A002 = c28151Xt2.A00()) == null) {
            return;
        }
        A002.A00(context, A003, enumC33464Eqz, c18920wW, userSession, user, interfaceC37213GaO, EnumC33371Ep4.A08, new GJJ(0, fragmentActivity, c31539DtP), interfaceC11380iw.getModuleName(), null);
    }
}
