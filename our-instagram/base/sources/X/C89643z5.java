package X;

import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import com.instagram.common.session.UserSession;

/* renamed from: X.3z5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89643z5 extends AbstractC51572Yf {
    public final C51760Mtj A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    public C89643z5(C51760Mtj c51760Mtj, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = c51760Mtj;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C77123cy A00 = AbstractC77063cs.A00(c76223bS, C89753zG.A00);
        C51760Mtj c51760Mtj = this.A00;
        if (c51760Mtj != null) {
            CharSequence charSequence = (CharSequence) c51760Mtj.A02;
            if (!AbstractC001900j.A0T(charSequence)) {
                MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
                long A05 = AbstractC77623dm.A05(c76223bS);
                C75933ay c75933ay = C51722Yv.A02;
                C51722Yv c51722Yv = new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(C05F.A04, 0, AbstractC77623dm.A0C(c76223bS))), new C9CU(C05F.A1I, 0, AbstractC77623dm.A06(c76223bS))), new C9CV(C05F.A0E, AbstractC77703du.A00(EnumC77673dr.A0A), 4));
                C76623c7 c76623c7 = (C76623c7) c51760Mtj.A01;
                return new C78003eS(null, linkMovementMethod, AbstractC77853eD.A00(A00, AbstractC77823e9.A00(EnumC71343Hv.A0j, c51722Yv, this.A01, c76623c7, this.A02, null, false, false), "branded-content", new DRQ(this, 18)), new C2Z3(A05), C78003eS.A0C, null, charSequence, null, null, 2, null, null);
            }
        }
        return null;
    }
}
