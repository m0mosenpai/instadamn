package X;

import android.animation.Animator;
import com.instagram.common.session.UserSession;

/* renamed from: X.BQz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25537BQz {
    public static final C25537BQz A00 = new Object();

    public final C51722Yv A01(Animator animator, C206209Bd c206209Bd, C2XI c2xi, UserSession userSession, String str, boolean z) {
        C14360o3.A0B(userSession, 0);
        C75933ay c75933ay = C51722Yv.A02;
        return new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CV(c2xi, C05F.A1F)), new C9CV(c2xi, C05F.A1I)), new C77863eE(C05F.A00, new C43650JSi(animator, c206209Bd, c2xi, str, 12, z), null)), new C77863eE(C05F.A01, new C43650JSi(userSession, c206209Bd, c2xi, str, 13, z), null));
    }

    public final C51722Yv A00(Animator animator, Animator animator2, Animator animator3, C206209Bd c206209Bd, C2XI c2xi, C2XI c2xi2, C2XI c2xi3, C2XI c2xi4, C2XI c2xi5, UserSession userSession, InterfaceC30808Dgj interfaceC30808Dgj, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3, boolean z4) {
        C2XI c2xi6 = c2xi3;
        C2XI c2xi7 = c2xi2;
        C2XI c2xi8 = c2xi4;
        AbstractC167007dF.A1E(userSession, 0, c2xi);
        C14360o3.A0B(c2xi7, 6);
        C14360o3.A0B(c2xi6, 7);
        AbstractC25234BEr.A0l(8, c2xi8, c2xi5, c206209Bd, str);
        AbstractC25234BEr.A1Q(animator, animator2, animator3);
        C75933ay c75933ay = C51722Yv.A02;
        if (z4) {
            if (!z3) {
                c2xi7 = c2xi8;
            }
            C51722Yv A0h = AbstractC25225BEi.A0h(null, new C9CV(c2xi7, C05F.A02));
            if (!z3) {
                c2xi6 = c2xi5;
            }
            return AbstractC25230BEn.A0e(AbstractC25232BEp.A16(AbstractC25234BEr.A0B(AbstractC25231BEo.A0X(c2xi6, A0h, C05F.A03), AbstractC25225BEi.A0m(C05F.A01, 0.0f, 1), 1.0f), C05F.A0D, interfaceC30808Dgj), C05F.A00, new BQB(5, animator3, animator2, z2), null);
        }
        C51722Yv A0A = AbstractC25234BEr.A0A(c2xi, null, new C9CV(c2xi, C05F.A1F));
        if (z3) {
            c2xi8 = c2xi7;
        }
        C51722Yv A0X = AbstractC25231BEo.A0X(c2xi8, A0A, C05F.A02);
        if (!z3) {
            c2xi6 = c2xi5;
        }
        C51722Yv A0X2 = AbstractC25231BEo.A0X(c2xi6, A0X, C05F.A03);
        Integer num = C05F.A01;
        return AbstractC25230BEn.A0e(AbstractC25230BEn.A0e(AbstractC25232BEp.A16(AbstractC25234BEr.A0B(A0X2, AbstractC25225BEi.A0m(num, 0.0f, 1), 1.0f), C05F.A0D, interfaceC30808Dgj), C05F.A00, new BRC(animator, animator2, animator3, c206209Bd, c2xi, str, interfaceC16820sZ, z, z2), null), num, new C43650JSi(userSession, c206209Bd, c2xi, str, 13, z), null);
    }
}
