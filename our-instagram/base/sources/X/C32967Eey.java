package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;

/* renamed from: X.Eey, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32967Eey extends AbstractC31433Drd {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C65682y4 A03;
    public final C38321qM A04;
    public final C75113Zb A05;
    public final InterfaceC75603aR A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32967Eey(androidx.fragment.app.FragmentActivity r13, X.InterfaceC11380iw r14, X.C19260xA r15, com.instagram.common.session.UserSession r16, X.C65682y4 r17, X.C38321qM r18, X.C75113Zb r19, X.InterfaceC75603aR r20, java.lang.Integer r21) {
        /*
            r12 = this;
            r0 = 1
            r6 = r14
            r8 = r16
            r2 = r20
            X.AbstractC25233BEq.A0w(r0, r8, r14, r2)
            java.lang.String r10 = "media"
            r3 = r19
            r1 = r21
            X.AbstractC167017dG.A1U(r3, r1)
            r4 = r18
            java.lang.String r9 = r4.getId()
            java.lang.String r0 = "Required value was null."
            if (r9 == 0) goto L4e
            java.lang.String r11 = X.FCN.A00(r1)
            r5 = r12
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.A02 = r8
            r12.A00 = r13
            r12.A01 = r14
            r12.A06 = r2
            r12.A04 = r4
            r12.A05 = r3
            r1 = r17
            r12.A03 = r1
            X.Dre r3 = r12.A01
            java.lang.String r2 = r4.getId()
            if (r2 == 0) goto L49
            r0 = 131(0x83, float:1.84E-43)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            java.util.Map r0 = r3.A00
            r0.put(r1, r2)
            return
        L49:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L4e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32967Eey.<init>(androidx.fragment.app.FragmentActivity, X.0iw, X.0xA, com.instagram.common.session.UserSession, X.2y4, X.1qM, X.3Zb, X.3aR, java.lang.Integer):void");
    }

    @Override // X.AbstractC31433Drd
    public final void A03() {
        super.A03();
        C75113Zb c75113Zb = this.A05;
        c75113Zb.A2v = false;
        c75113Zb.A3F = false;
        c75113Zb.A3G = false;
        this.A06.DmH(this.A04, c75113Zb);
    }

    @Override // X.AbstractC31433Drd
    public final void A04() {
        super.A04();
        C65682y4 c65682y4 = this.A03;
        if (c65682y4 != null) {
            c65682y4.A01 = true;
        }
    }

    @Override // X.AbstractC31433Drd
    public final void A06(View view, User user, int i) {
        super.A06(view, user, i);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            UserSession userSession = this.A02;
            C31368DqX.A02(AbstractC31173DnH.A0P(fragmentActivity, userSession), userSession, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(userSession, user.getId(), "explore_chaining", this.A01.getModuleName()));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC31433Drd
    public final void A09(User user, int i) {
        String str;
        super.A09(user, i);
        C38321qM c38321qM = this.A04;
        UserSession userSession = this.A02;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            str = A2E.getId();
        } else {
            str = "";
        }
        String id = user.getId();
        Collection collection = (Collection) FCM.A00(userSession).A00.get(str);
        if (collection != null) {
            AbstractC166987dD.A1F(collection).remove(i);
        }
        C1GJ.A03(FY5.A00(userSession, str, id));
    }

    @Override // X.AbstractC31433Drd
    public final void A0G(boolean z, String str) {
        super.A0G(z, str);
        User A2E = this.A04.A2E(this.A02);
        if (A2E != null) {
            this.A06.DmJ(A2E.getId());
        }
    }
}
