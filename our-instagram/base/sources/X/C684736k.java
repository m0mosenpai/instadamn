package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.Collections;

/* renamed from: X.36k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C684736k {
    public final UserSession A00;
    public final C64842wi A01;
    public final C64742wY A02;

    public C684736k(UserSession userSession, C64842wi c64842wi, C64742wY c64742wY) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c64842wi, 2);
        this.A00 = userSession;
        this.A01 = c64842wi;
        this.A02 = c64742wY;
    }

    public final void A00(final View view, C57112jm c57112jm, C38321qM c38321qM, final QPTooltipAnchor qPTooltipAnchor, final Trigger trigger) {
        String A0T = AnonymousClass001.A0T(qPTooltipAnchor.name(), c38321qM.getId(), '_');
        C0eB c0eB = C0eB.A00;
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(c38321qM, c0eB, A0T);
        final UserSession userSession = this.A00;
        final C64842wi c64842wi = this.A01;
        final C64742wY c64742wY = this.A02;
        c59072n8.A00(new InterfaceC43071ya(view, userSession, qPTooltipAnchor, trigger, c64842wi, c64742wY) { // from class: X.3hj
            public final View A00;
            public final UserSession A01;
            public final QPTooltipAnchor A02;
            public final Trigger A03;
            public final C64842wi A04;
            public final C64742wY A05;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n72, InterfaceC57162jr interfaceC57162jr) {
                Trigger trigger2;
                Trigger trigger3;
                C14360o3.A0B(c59062n72, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                int intValue = interfaceC57162jr.CFq(c59062n72).intValue();
                if (intValue != 0) {
                    if (intValue == 2) {
                        C64742wY c64742wY2 = this.A05;
                        QPTooltipAnchor qPTooltipAnchor2 = this.A02;
                        C14360o3.A0B(qPTooltipAnchor2, 0);
                        c64742wY2.A07.remove(qPTooltipAnchor2);
                        return;
                    }
                    return;
                }
                C64742wY c64742wY3 = this.A05;
                C64842wi c64842wi2 = this.A04;
                QPTooltipAnchor qPTooltipAnchor3 = this.A02;
                c64742wY3.A00(this.A00, qPTooltipAnchor3, c64842wi2);
                QPTooltipAnchor qPTooltipAnchor4 = QPTooltipAnchor.A0p;
                if (qPTooltipAnchor3 == qPTooltipAnchor4 && (trigger2 = this.A03) == Trigger.A0S) {
                    UserSession userSession2 = this.A01;
                    Object obj = c59062n72.A03;
                    C14360o3.A06(obj);
                    if (!AbstractC82393m2.A02(userSession2, (C38321qM) obj)) {
                        return;
                    }
                } else {
                    if (qPTooltipAnchor3 == QPTooltipAnchor.A12) {
                        trigger2 = this.A03;
                        trigger3 = Trigger.A0Y;
                    } else {
                        if (qPTooltipAnchor3 != qPTooltipAnchor4) {
                            return;
                        }
                        trigger2 = this.A03;
                        trigger3 = Trigger.A1A;
                    }
                    if (trigger2 != trigger3) {
                        return;
                    }
                }
                java.util.Set singleton = Collections.singleton(trigger2);
                C14360o3.A07(singleton);
                c64842wi2.AVs(null, singleton);
            }

            {
                this.A00 = view;
                this.A01 = userSession;
                this.A04 = c64842wi;
                this.A05 = c64742wY;
                this.A02 = qPTooltipAnchor;
                this.A03 = trigger;
            }
        });
        c57112jm.A05(view, c59072n8.A01());
    }
}
