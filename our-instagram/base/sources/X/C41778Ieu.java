package X;

import android.animation.Animator;
import android.os.VibrationEffect;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ieu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41778Ieu implements Animator.AnimatorListener {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ InterfaceC60442pS A01;
    public final /* synthetic */ C144506fW A02;
    public final /* synthetic */ boolean A03;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C41778Ieu(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C144506fW c144506fW, boolean z) {
        this.A02 = c144506fW;
        this.A00 = c38321qM;
        this.A01 = interfaceC60442pS;
        this.A03 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        String str;
        Long A0k;
        C144506fW c144506fW = this.A02;
        C38321qM c38321qM = this.A00;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        boolean z = this.A03;
        C2UY.A01.A07(VibrationEffect.createOneShot(150L, 30));
        if (c38321qM != null) {
            UserSession userSession = c144506fW.A02;
            if (z) {
                C25531Mh A0I = C25531Mh.A0I(AbstractC12220kQ.A01(interfaceC60442pS, userSession));
                User A2E = c38321qM.A2E(userSession);
                long j = 0;
                if (A2E != null && (A0k = AbstractC25231BEo.A0k(A2E)) != null) {
                    j = A0k.longValue();
                }
                A0I.A0Q("a_pk", Long.valueOf(j));
                User A2E2 = c38321qM.A2E(userSession);
                if (A2E2 == null || (str = A2E2.B7L().name()) == null) {
                    str = "";
                }
                A0I.A0R("follow_status", str);
                A0I.A0R("is_coming_from", "");
                A0I.A0O(AbstractC111324zv.A00(1037), AbstractC166997dE.A0a());
                String id = c38321qM.getId();
                if (id != null) {
                    A0I.A0l(id);
                    A0I.A0Q("m_t", AbstractC37302Gc3.A0U(c38321qM));
                    A0I.A0R(AbstractC111324zv.A00(495), "");
                    AbstractC37305Gc6.A06(A0I, interfaceC60442pS, 0L);
                    A0I.A0R("sticker_id", AbstractC111324zv.A00(5062));
                    AbstractC37305Gc6.A07(A0I, userSession, 0L, AbstractC111324zv.A00(5061));
                    A0I.A0R("viewer_session_id", "");
                    A0I.Cht();
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, AbstractC111324zv.A00(2570));
            A0F.A7T = "shake_to_reveal";
            XN2.A00(AbstractC12220kQ.A02(userSession), A0F, interfaceC60442pS);
        }
    }
}
