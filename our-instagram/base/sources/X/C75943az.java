package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75943az extends AbstractC51572Yf {
    public final FragmentActivity A00;
    public final C51722Yv A01;
    public final UserSession A02;
    public final InterfaceC75403a7 A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC75453aC A05;
    public final InterfaceC75543aL A06;
    public final String A07;
    public final String A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC16820sZ A0A;
    public final boolean A0B;

    public C75943az(FragmentActivity fragmentActivity, C51722Yv c51722Yv, UserSession userSession, InterfaceC75403a7 interfaceC75403a7, InterfaceC60442pS interfaceC60442pS, InterfaceC75453aC interfaceC75453aC, InterfaceC75543aL interfaceC75543aL, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(interfaceC60442pS, 5);
        C14360o3.A0B(interfaceC75453aC, 6);
        C14360o3.A0B(interfaceC75543aL, 7);
        C14360o3.A0B(interfaceC75403a7, 8);
        C14360o3.A0B(str2, 11);
        C14360o3.A0B(c51722Yv, 12);
        this.A0A = interfaceC16820sZ;
        this.A09 = interfaceC16820sZ2;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = interfaceC60442pS;
        this.A05 = interfaceC75453aC;
        this.A06 = interfaceC75543aL;
        this.A03 = interfaceC75403a7;
        this.A0B = z;
        this.A07 = str;
        this.A08 = str2;
        this.A01 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C206209Bd c206209Bd = (C206209Bd) this.A0A.invoke();
        Object obj = c206209Bd.A01;
        Object obj2 = c206209Bd.A02;
        C76893cb c76893cb = (C76893cb) c206209Bd.A00;
        if (obj == null && obj2 == null) {
            return new AbstractC50812Vc();
        }
        C51722Yv c51722Yv = this.A01;
        C2XE c2xe = c76223bS.A05;
        C76933cf c76933cf = new C76933cf(c2xe, EnumC76913cd.GLOBAL, "follow_chaining_bound");
        C75933ay c75933ay = C51722Yv.A02;
        if (c51722Yv == c75933ay) {
            c51722Yv = null;
        }
        C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, c76933cf);
        C2Z0 c2z0 = new C2Z0(c2xe, new ArrayList());
        if (obj2 != null) {
            c2z0.A00(new C26315BkM(this.A06, new C206939Dy(obj2, 12)));
        }
        if (obj != null) {
            C206939Dy c206939Dy = new C206939Dy(obj, 13);
            InterfaceC16820sZ interfaceC16820sZ = this.A09;
            c2z0.A00(new C76943cg(c75933ay, this.A02, this.A03, this.A04, this.A05, this.A07, this.A08, c206939Dy, interfaceC16820sZ, this.A0B));
        }
        if (c76893cb != null) {
            c2z0.A00(new C26390BlZ(this.A00, this.A02, c76893cb, this.A04));
        }
        return AbstractC76963ci.A06(c2z0, c76223bS, c51722Yv2, null, null, null, false);
    }
}
