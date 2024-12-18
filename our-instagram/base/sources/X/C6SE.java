package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AnimationSet;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6SE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SE {
    public int A00 = -1;
    public View A01;
    public AnimationSet A02;
    public TextView A03;
    public TextView A04;
    public InterfaceC11380iw A05;
    public UserSession A06;
    public C6SZ A07;
    public C41181vS A08;
    public C141596ac A09;
    public InterfaceC144936gD A0A;
    public boolean A0B;
    public boolean A0C;
    public C6SY[] A0D;
    public final ViewStub A0E;

    public final void A03(C6SY c6sy, int i) {
        C104294ms c104294ms;
        int A0H;
        C104294ms c104294ms2;
        C14360o3.A0B(c6sy, 0);
        C41181vS c41181vS = this.A08;
        if (c41181vS != null && (c104294ms = c41181vS.A09) != null && c6sy.A01) {
            boolean z = false;
            c6sy.A01 = false;
            FollowButton followButton = c6sy.A0E;
            followButton.A0B = false;
            C141596ac c141596ac = this.A09;
            if (c141596ac != null && c141596ac.A13) {
                z = true;
            }
            String str = null;
            if (z) {
                if (!C1QI.A0E().A00) {
                    ((FollowButtonBase) followButton).A09 = true;
                }
                Context context = followButton.getContext();
                C14360o3.A07(context);
                A0H = C1QI.A08(context, C1QI.A0E());
            } else {
                A0H = AbstractC53242c7.A0H(followButton.getContext(), R.attr.igds_color_secondary_text);
            }
            followButton.setCustomForegroundColor(A0H);
            ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
            InterfaceC139206Sb interfaceC139206Sb = (InterfaceC139206Sb) c104294ms.A01().get(i);
            User A00 = AbstractC139226Sd.A00(interfaceC139206Sb);
            int A002 = C6SW.A00(this.A09, A00.getId(), i);
            C19260xA c19260xA = new C19260xA();
            C19260xA.A00(c19260xA, Integer.valueOf(A002), "position");
            UserSession userSession = this.A06;
            if (userSession != null) {
                FollowStatus A0N = C57582kX.A00(userSession).A0N(A00);
                InterfaceC11380iw interfaceC11380iw = this.A05;
                if (interfaceC11380iw != null) {
                    viewOnAttachStateChangeListenerC110564yT.A05(c19260xA, userSession, null, null, null, null, A00, null, null, interfaceC11380iw.getModuleName());
                    String id = A00.getId();
                    C139196Sa c139196Sa = (C139196Sa) interfaceC139206Sb;
                    String str2 = c139196Sa.A09;
                    String str3 = c139196Sa.A0E;
                    C41181vS c41181vS2 = this.A08;
                    if (c41181vS2 != null && (c104294ms2 = c41181vS2.A09) != null) {
                        str = c104294ms2.getId();
                    }
                    AbstractC139216Sc.A02(interfaceC11380iw, userSession, A0N, id, str2, str3, str, A002);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A00() {
        int i;
        C41181vS c41181vS = this.A08;
        if (c41181vS != null) {
            if (!c41181vS.A1V() && (!c41181vS.A1C() || c41181vS.A0e != EnumC41231vY.A06)) {
                return;
            }
            C141596ac c141596ac = this.A09;
            if (c141596ac != null) {
                int i2 = c141596ac.A0M;
                C104294ms c104294ms = c41181vS.A09;
                if (c104294ms != null) {
                    i = c104294ms.A01().size();
                } else {
                    i = 0;
                }
                int length = A04().length;
                for (int i3 = 0; i3 < length; i3++) {
                    A03(A04()[i3], (i2 + i3) % i);
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (X.C6SW.A03(r10, r25, 579) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.view.View r24, X.C41551w4 r25, X.C141596ac r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6SE.A01(android.view.View, X.1w4, X.6ac, boolean, boolean):void");
    }

    public final C6SY[] A04() {
        C6SY[] c6syArr = this.A0D;
        if (c6syArr != null) {
            return c6syArr;
        }
        C14360o3.A0F("cardViewHolders");
        throw C00O.createAndThrow();
    }

    public C6SE(ViewStub viewStub) {
        this.A0E = viewStub;
    }

    public final void A02(C41551w4 c41551w4) {
        C104294ms c104294ms;
        A00();
        C141596ac c141596ac = this.A09;
        if (c141596ac != null) {
            C41181vS c41181vS = this.A08;
            if (c41181vS != null && (c104294ms = c41181vS.A09) != null) {
                c141596ac.A0M = (c141596ac.A0M + C6SX.A00(c141596ac.A10).length) % c104294ms.A01().size();
                C6SW.A01.A04(c41551w4, this, true);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
