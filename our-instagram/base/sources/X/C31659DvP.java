package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DvP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31659DvP {
    public static final C34655FOo A08 = new Object();
    public static final List A09 = AbstractC166987dD.A1F(AbstractC16960so.A1Q(18, 19, 20, 21));
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final InterfaceC37234Gaj A03;
    public final C43929Jbe A04;
    public final InterfaceC11380iw A05;
    public final InterfaceC37171GZi A06;
    public final C58655PzS A07;

    public C31659DvP(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37171GZi interfaceC37171GZi, InterfaceC37234Gaj interfaceC37234Gaj, C43929Jbe c43929Jbe, C58655PzS c58655PzS) {
        C14360o3.A0B(userSession, 3);
        AbstractC167017dG.A1U(c43929Jbe, c58655PzS);
        this.A00 = context;
        this.A01 = fragment;
        this.A02 = userSession;
        this.A05 = interfaceC11380iw;
        this.A03 = interfaceC37234Gaj;
        this.A04 = c43929Jbe;
        this.A07 = c58655PzS;
        this.A06 = interfaceC37171GZi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r42.A02, 36319278542822533L) != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e7  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.8sw] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.UQ7] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v24, types: [X.FOo] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.graphics.RectF r39, android.view.View r40, X.C31446Drq r41, X.C31659DvP r42, X.InterfaceC37158GYv r43, X.AbstractC46972Dl r44, X.C2EC r45, com.instagram.model.direct.DirectShareTarget r46, X.C3o9 r47, java.lang.String r48, java.lang.String r49, java.util.List r50, boolean r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31659DvP.A00(android.graphics.RectF, android.view.View, X.Drq, X.DvP, X.GYv, X.2Dl, X.2EC, com.instagram.model.direct.DirectShareTarget, X.3o9, java.lang.String, java.lang.String, java.util.List, boolean, boolean):void");
    }

    public static final void A01(C31659DvP c31659DvP, C2EC c2ec, boolean z) {
        UserSession userSession = c31659DvP.A02;
        C34432FFw c34432FFw = new C34432FFw(userSession);
        if (z) {
            InterfaceC19630xq interfaceC19630xq = c34432FFw.A00;
            if (interfaceC19630xq.getBoolean("key_should_show_locked_chat_nux", true)) {
                C15370ps A1F = AbstractC25225BEi.A1F();
                C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                A0y.A1J = true;
                Fragment fragment = c31659DvP.A01;
                A0y.A0g = fragment.getString(2131956794);
                A0y.A0v = true;
                A0y.A0K = new ViewOnClickListenerC35609Fo0(1, A1F, c31659DvP, c2ec, z);
                A0y.A0h = fragment.getString(2131954754);
                A0y.A1N = true;
                A0y.A0w = true;
                C32332EMe c32332EMe = new C32332EMe();
                C189478aR A00 = A0y.A00();
                A1F.A00 = A00;
                AbstractC31173DnH.A1G(fragment, c32332EMe, A00);
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E77("key_should_show_locked_chat_nux", false);
                ARD.apply();
                String C7I = c2ec.C7I();
                InterfaceC02590Ai A092 = AbstractC31179DnN.A09(userSession);
                if (A092.isSampled()) {
                    AbstractC31181DnP.A0i(A092, "show_locked_chat_NUX", "inbox", C7I);
                    return;
                }
                return;
            }
        }
        C35030Fc3.A00.A00(userSession, "inbox", c2ec.C7I());
        C58655PzS c58655PzS = c31659DvP.A07;
        if (c58655PzS.A01()) {
            c58655PzS.A00(c31659DvP.A01, new C36398G3z(c31659DvP, c2ec, z), z);
            return;
        }
        C193328hC A0b = AbstractC31176DnK.A0b(c31659DvP.A01);
        A0b.A0A(2131963962);
        A0b.A09(2131963960);
        AbstractC31176DnK.A17(DialogInterfaceOnClickListenerC35452Fk9.A00(c31659DvP, 66), A0b, 2131963961);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r23 == 6) goto L9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.graphics.RectF r16, X.C31446Drq r17, X.InterfaceC37158GYv r18, X.AbstractC46972Dl r19, X.C2EC r20, com.instagram.model.direct.DirectShareTarget r21, X.C3o9 r22, int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31659DvP.A02(android.graphics.RectF, X.Drq, X.GYv, X.2Dl, X.2EC, com.instagram.model.direct.DirectShareTarget, X.3o9, int, boolean, boolean):void");
    }
}
