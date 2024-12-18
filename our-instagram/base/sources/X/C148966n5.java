package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.6n5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148966n5 implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        User user = c41181vS.A0i;
        user.getClass();
        if (!user.equals(C17060sy.A01.A01(userSession)) || c41181vS.A0b().isEmpty()) {
            return false;
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (((Boolean) A00.A41.CES(A00, C23031Ai.A8c[128])).booleanValue() || !(interfaceC143576dw instanceof C143556du)) {
            return false;
        }
        C143556du c143556du = (C143556du) interfaceC143576dw;
        if (c143556du.A0A == C3G2.A0a || c143556du.A1e.A0S == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return interfaceC143576dw.CGQ();
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        String string;
        boolean A1o = c41181vS.A1o();
        int size = c41181vS.A0b().size();
        if (size != 0) {
            if (size != 1) {
                int i = R.plurals.multi_author_story_view_count_nux_photo_title_plural;
                if (A1o) {
                    i = R.plurals.multi_author_story_view_count_nux_video_title_plural;
                }
                int size2 = c41181vS.A0b().size() - 1;
                string = context.getResources().getQuantityString(i, size2, c41181vS.A0b().get(0), NumberFormat.getInstance(Locale.getDefault()).format(size2));
            } else {
                int i2 = 2131967866;
                if (A1o) {
                    i2 = 2131967867;
                }
                string = context.getString(i2, c41181vS.A0b().get(0));
            }
            return new C149686oL(string);
        }
        throw new UnsupportedOperationException("Not expecting to generate string for reel item with no aggregated views");
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        A00.A41.Egi(A00, true, C23031Ai.A8c[128]);
    }
}
