package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6n1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148926n1 implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A03;
    }

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C101394gx A00 = AbstractC140306Wi.A00(c41181vS);
        if (A00 == null) {
            return null;
        }
        InterfaceC143616e0 interfaceC143616e0 = (InterfaceC143616e0) interfaceC143576dw;
        if (AbstractC37865GlK.A02(A00)) {
            return interfaceC143616e0.Blm();
        }
        return interfaceC143616e0.Bln();
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        String string = context.getString(2131969743);
        int i = 2131969741;
        if (c41181vS.CdW()) {
            i = 2131969742;
        }
        User user = c41181vS.A0i;
        user.getClass();
        return new C23964Ajy(string, context.getString(i, user.getUsername()));
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C101394gx A00 = AbstractC140306Wi.A00(c41181vS);
        if (A00 != null) {
            AbstractC37865GlK.A02(A00);
            InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
            int i = interfaceC19630xq.getInt("story_poll_tooltip_impression_count", 0) + 1;
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7D("story_poll_tooltip_impression_count", i);
            ARD.apply();
        }
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        Boolean CG3;
        String str;
        C101394gx A00 = AbstractC140306Wi.A00(c41181vS);
        if (A00 == null || (CG3 = A00.CG3()) == null || !CG3.booleanValue() || A00.A0A != null) {
            return false;
        }
        boolean A02 = AbstractC37865GlK.A02(A00);
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        if (A02) {
            str = "has_ever_voted_on_story_poll_v2";
        } else {
            str = "has_ever_voted_on_story_poll";
        }
        if (interfaceC19630xq.getBoolean(str, false) || AbstractC23021Ah.A00(userSession).A01.getInt("story_poll_tooltip_impression_count", 0) >= 2) {
            return false;
        }
        return true;
    }
}
