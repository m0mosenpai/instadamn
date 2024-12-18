package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Anl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24162Anl implements InterfaceC188988Yo {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C1810981l A03;
    public final /* synthetic */ InterfaceC188988Yo A04;

    @Override // X.InterfaceC188988Yo
    public final void DEP(Exception exc) {
        C14360o3.A0B(exc, 0);
        this.A04.DEP(exc);
    }

    @Override // X.InterfaceC188988Yo
    public final void DS1(C189058Yv c189058Yv, List list, List list2, int i) {
        int i2;
        C14360o3.A0B(c189058Yv, 0);
        AbstractC167007dF.A1D(list, 1, list2);
        InterfaceC188988Yo interfaceC188988Yo = this.A04;
        C1811981v c1811981v = this.A03.A08;
        Object obj = c1811981v.A00;
        C193968iH c193968iH = (C193968iH) interfaceC188988Yo;
        C14360o3.A0B(obj, 0);
        if (obj instanceof C81V) {
            i2 = c193968iH.A03.A00;
        } else if (obj instanceof C208509Kk) {
            i2 = c193968iH.A03.A01;
        } else {
            i2 = 0;
        }
        if (c1811981v.A00 instanceof C81V) {
            if (C18U.A06(C06090Tz.A05, this.A02, 36330295133225762L) && !this.A00) {
                if (i2 == 0) {
                    i2 = -3;
                }
                c189058Yv.A0C(i2);
                this.A00 = true;
                this.A01 = false;
                interfaceC188988Yo.DS1(c189058Yv, C15500q5.A02(list), C15500q5.A02(list2), i);
            }
        }
        if (c1811981v.A00 instanceof C208509Kk) {
            if (C18U.A06(C06090Tz.A06, this.A02, 36330295133225762L) && !this.A01) {
                if (i2 == 0) {
                    i2 = -1;
                }
                c189058Yv.A0C(i2);
                this.A00 = false;
                this.A01 = true;
                interfaceC188988Yo.DS1(c189058Yv, C15500q5.A02(list), C15500q5.A02(list2), i);
            }
        }
        if (c189058Yv.A01.A05.isEmpty()) {
            c189058Yv.A0C(-1);
        }
        interfaceC188988Yo.DS1(c189058Yv, C15500q5.A02(list), C15500q5.A02(list2), i);
    }

    public C24162Anl(UserSession userSession, C1810981l c1810981l, InterfaceC188988Yo interfaceC188988Yo) {
        this.A04 = interfaceC188988Yo;
        this.A03 = c1810981l;
        this.A02 = userSession;
    }
}
