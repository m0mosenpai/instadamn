package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Lr1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49307Lr1 implements MQ4 {
    public final C41761wQ A00;
    public final UserSession A01;
    public final InterfaceC08830cm A02;
    public final InterfaceC08830cm A03;

    @Override // X.MQ4
    public final void EOH(C47669L3c c47669L3c) {
        C14360o3.A0B(c47669L3c, 0);
        LGP lgp = (LGP) AbstractC31172DnG.A0y(this.A02);
        UserSession userSession = this.A01;
        C2EY c2ey = c47669L3c.A01;
        Object obj = c47669L3c.A02;
        MHL mhl = new MHL(userSession, 4);
        AbstractC167007dF.A1D(lgp, 0, c2ey);
        String A00 = LBk.A00(userSession, lgp, new C47308KvJ(false), c2ey, obj, mhl);
        C7TH c7th = (C7TH) this.A03.get();
        Object obj2 = c47669L3c.A03;
        if (obj2 instanceof String) {
            AbstractC25225BEi.A1S(obj2);
            String str = (String) obj2;
            C45001Jvr c45001Jvr = c47669L3c.A00;
            InterfaceC83713oG A01 = c45001Jvr.A01.A01();
            C14360o3.A0A(c7th);
            C41761wQ c41761wQ = this.A00;
            LLU.A05(c41761wQ, c7th, null, c2ey, A01, A00, c47669L3c.A04);
            if (!AbstractC001900j.A0T(str)) {
                LLU.A05(c41761wQ, c7th, new C49308Lr2(this, c45001Jvr), c2ey, A01, str, null);
                return;
            }
            return;
        }
        if (obj2 instanceof DirectAnimatedMedia) {
            C14360o3.A0A(c7th);
            DirectShareTarget directShareTarget = c47669L3c.A00.A01;
            InterfaceC83713oG A012 = directShareTarget.A01();
            C41761wQ c41761wQ2 = this.A00;
            String str2 = c47669L3c.A04;
            LLU.A05(c41761wQ2, c7th, null, c2ey, A012, A00, str2);
            List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
            if (unmodifiableList == null) {
                unmodifiableList = null;
            }
            InterfaceC83713oG A013 = directShareTarget.A01();
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.model.direct.gifs.DirectAnimatedMedia");
            c7th.EN3(null, userSession, null, (DirectAnimatedMedia) obj2, A013, str2, null, unmodifiableList, false);
            return;
        }
        throw AbstractC166987dD.A12("Unrecognized sendReplyParams.reply type");
    }

    @Override // X.MQ4
    public final void EOO(L4I l4i) {
        C14360o3.A0B(l4i, 0);
        InterfaceC83713oG A01 = l4i.A00.A01();
        LGP lgp = (LGP) AbstractC31172DnG.A0y(this.A02);
        UserSession userSession = this.A01;
        C2EY c2ey = l4i.A01;
        Object obj = l4i.A02;
        MHL mhl = new MHL(userSession, 4);
        C14360o3.A0B(lgp, 0);
        String A00 = LBk.A00(userSession, lgp, new C47308KvJ(false), c2ey, obj, mhl);
        C7TH c7th = (C7TH) this.A03.get();
        C14360o3.A0A(c7th);
        C41761wQ c41761wQ = this.A00;
        String str = l4i.A04;
        LLU.A05(c41761wQ, c7th, null, c2ey, A01, A00, str);
        String str2 = l4i.A03;
        if (str2 != null && !AbstractC001900j.A0T(str2)) {
            LLU.A05(c41761wQ, c7th, null, c2ey, A01, str2, str);
        }
    }

    public C49307Lr1(UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        M8T m8t = new M8T(new JQK(LGP.A01, 8), 12);
        this.A01 = userSession;
        this.A03 = interfaceC08830cm;
        this.A02 = m8t;
        this.A00 = AbstractC31174DnI.A0S();
    }
}
