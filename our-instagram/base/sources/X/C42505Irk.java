package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Irk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42505Irk implements InterfaceC75403a7 {
    public final C38018Go6 A00;
    public final UserSession A01;
    public final InterfaceC75403a7 A02;

    @Override // X.InterfaceC75403a7
    public final void A8A(C79233gU c79233gU, int i) {
        C14360o3.A0B(c79233gU, 1);
        this.A02.A8A(c79233gU, i);
    }

    @Override // X.InterfaceC75403a7
    public final void A87(int i) {
        this.A02.A87(i);
    }

    @Override // X.InterfaceC75403a7
    public final void A8C(int i) {
        this.A02.A8C(i);
    }

    @Override // X.InterfaceC75403a7
    public final void A8D(int i) {
        this.A02.A8D(i);
    }

    @Override // X.InterfaceC75403a7
    public final void A8a(int i) {
        this.A02.A8a(i);
    }

    @Override // X.InterfaceC75403a7
    public final void A8n(int i) {
        this.A02.A8n(i);
    }

    @Override // X.InterfaceC75403a7
    public final void AAH(int i) {
        this.A02.AAH(i);
    }

    @Override // X.InterfaceC75403a7
    public final void E5n(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A02.E5n(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75403a7
    public final void E5o(C75113Zb c75113Zb, C40971v4 c40971v4) {
        this.A02.E5o(c75113Zb, c40971v4);
    }

    @Override // X.InterfaceC75403a7
    public final void F9l(View view) {
        this.A02.F9l(view);
    }

    public C42505Irk(UserSession userSession, C38018Go6 c38018Go6, InterfaceC75403a7 interfaceC75403a7) {
        AbstractC167027dH.A13(interfaceC75403a7, c38018Go6, userSession);
        this.A02 = interfaceC75403a7;
        this.A00 = c38018Go6;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC75403a7
    public final void EDq(View view, int i, Object obj, Object obj2) {
        C37469Gen c37469Gen;
        Integer num;
        Integer num2;
        Integer num3;
        String str;
        String str2;
        Integer num4;
        AbstractC167017dG.A1R(obj, obj2);
        C38321qM A02 = C3XH.A02(obj);
        if (A02 != null) {
            if (A02.CdW()) {
                C38018Go6 c38018Go6 = this.A00;
                C75113Zb BRZ = c38018Go6.BRZ(A02);
                int position = BRZ.getPosition();
                C38321qM A022 = C3XH.A02(c38018Go6.A04(position - 1));
                C38321qM A023 = C3XH.A02(c38018Go6.A04(position + 1));
                Integer num5 = null;
                String A0h = AbstractC37301Gc2.A0h(A022);
                String A0h2 = AbstractC37301Gc2.A0h(A023);
                BRZ.A1R = A0h;
                BRZ.A1N = A0h2;
                int position2 = BRZ.getPosition();
                String id = A02.getId();
                Integer num6 = null;
                if (id != null) {
                    Iterator A16 = AbstractC166997dE.A16(c38018Go6.A07);
                    while (A16.hasNext()) {
                        C40950IBx c40950IBx = (C40950IBx) A16.next();
                        if (c40950IBx != null) {
                            C1NI c1ni = c40950IBx.A00;
                            if ((c1ni instanceof C37469Gen) && (c37469Gen = (C37469Gen) c1ni) != null && C14360o3.A0K(c37469Gen.A0K.getId(), id)) {
                                break;
                            }
                        }
                    }
                }
                c37469Gen = null;
                int i2 = position2;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    } else if (c38018Go6.A04(i2) instanceof C40971v4) {
                        num6 = Integer.valueOf(i2);
                        break;
                    }
                }
                int i3 = position2;
                while (true) {
                    i3--;
                    if (-1 < i3) {
                        if (c38018Go6.A04(i3) instanceof InterfaceC73233Pz) {
                            num = Integer.valueOf(i3);
                            break;
                        }
                    } else {
                        num = null;
                        break;
                    }
                }
                if (c37469Gen != null) {
                    BRZ.A0p = c37469Gen.A00;
                }
                if (num6 != null) {
                    BRZ.A08 = (position2 - num6.intValue()) - 1;
                }
                if (num != null) {
                    BRZ.A0P = (position2 - num.intValue()) - 1;
                }
                if (A022 != null) {
                    num2 = A022.A2M();
                } else {
                    num2 = null;
                }
                if (A023 != null) {
                    num3 = A023.A2M();
                } else {
                    num3 = null;
                }
                BRZ.A17 = num2;
                BRZ.A16 = num3;
                if (A022 != null) {
                    str = AbstractC77343dK.A00(A022.A0e);
                } else {
                    str = null;
                }
                if (A023 != null) {
                    str2 = AbstractC77343dK.A00(A023.A0e);
                } else {
                    str2 = null;
                }
                BRZ.A1Q = str;
                BRZ.A1M = str2;
                if (A022 != null) {
                    num4 = A022.CFr();
                } else {
                    num4 = null;
                }
                if (A023 != null) {
                    num5 = A023.CFr();
                }
                BRZ.A0a(num4, num5);
            }
            this.A02.EDq(view, i, obj, obj2);
        }
    }
}
