package X;

import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.JYp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43802JYp implements Runnable {
    public final /* synthetic */ JR2 A00;
    public final /* synthetic */ C45085JxF A01;

    public RunnableC43802JYp(JR2 jr2, C45085JxF c45085JxF) {
        this.A00 = jr2;
        this.A01 = c45085JxF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JR2 jr2 = this.A00;
        C45085JxF c45085JxF = this.A01;
        if (c45085JxF != null && c45085JxF.A00 > 0) {
            AbstractC59962oe abstractC59962oe = jr2.A1L;
            if (abstractC59962oe.isResumed()) {
                if (C18U.A06(C06090Tz.A05, jr2.A0p(), 36319660794322503L)) {
                    String str = c45085JxF.A03;
                    UserSession A0p = jr2.A0p();
                    AbstractC167007dF.A1K(str, A0p);
                    String A0R = AnonymousClass001.A0R("education_notice_interstitial_shown_", str);
                    C23031Ai A00 = AbstractC23021Ah.A00(A0p);
                    A00.A0z(A0R, A00.A01.getInt(A0R, 0) + 1);
                    C6XJ A03 = C6XJ.A03(abstractC59962oe.requireActivity(), AbstractC166987dD.A0b(), jr2.A0p(), ModalActivity.class, AbstractC111324zv.A00(2743));
                    A03.A0J = ModalActivity.A08;
                    AbstractC31173DnH.A1I(abstractC59962oe, A03);
                }
            }
        }
    }
}
