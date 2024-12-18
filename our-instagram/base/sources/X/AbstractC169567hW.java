package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.7hW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC169567hW {
    public static final C51722Yv A00(C51722Yv c51722Yv, final AbstractC166097bd abstractC166097bd, final C166587cU c166587cU) {
        C14360o3.A0B(c51722Yv, 0);
        C14360o3.A0B(abstractC166097bd, 1);
        C14360o3.A0B(c166587cU, 2);
        C9CV c9cv = new C9CV(C05F.A00, AbstractC78283eu.A00(new InterfaceC77833eB(abstractC166097bd, c166587cU) { // from class: X.4qT
            public final AbstractC166097bd A00;
            public final C166587cU A01;

            @Override // X.InterfaceC77833eB
            public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
                View view = (View) obj;
                C14360o3.A0B(view, 1);
                C166587cU c166587cU2 = this.A01;
                AbstractC166097bd abstractC166097bd2 = this.A00;
                if (abstractC166097bd2 instanceof C167297di) {
                    C06 c06 = new C06(c166587cU2);
                    C0eB c0eB = C0eB.A00;
                    String A0R = AnonymousClass001.A0R(AbstractC111324zv.A00(832), abstractC166097bd2.A00);
                    C59062n7 c59062n7 = C59062n7.A07;
                    C59072n8 c59072n8 = new C59072n8(abstractC166097bd2, c0eB, A0R);
                    c59072n8.A00(c06);
                    c166587cU2.A04.A05(view, c59072n8.A01());
                    return null;
                }
                return null;
            }

            @Override // X.InterfaceC77833eB
            public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
                C14360o3.A0B((AbstractC166097bd) obj, 0);
                C14360o3.A0B((AbstractC166097bd) obj2, 1);
                return !C14360o3.A0K(r3.A00, r4.A00);
            }

            @Override // X.InterfaceC77833eB
            public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
                View view = (View) obj;
                C14360o3.A0B(view, 1);
                this.A01.A04.A04(view);
            }

            {
                this.A00 = abstractC166097bd;
                this.A01 = c166587cU;
            }

            @Override // X.InterfaceC77833eB
            public final /* synthetic */ Class CBk() {
                return getClass();
            }

            @Override // X.InterfaceC77833eB
            public final /* synthetic */ String getDescription() {
                return AbstractC75733ae.A00(getClass());
            }
        }, abstractC166097bd), 2);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        return new C51722Yv(c51722Yv, c9cv);
    }
}
