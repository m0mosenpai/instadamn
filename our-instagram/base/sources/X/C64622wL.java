package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2wL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64622wL implements InterfaceC64632wM {
    public final UserSession A00;
    public final C60862qA A01;
    public final C61222qk A02;
    public final InterfaceC09390do A03 = C1XM.A00(new C9E5(this, 6));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C9E5(this, 7));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ac, code lost:
    
        if (r3.equals("dismiss") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
    @Override // X.InterfaceC64652wO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSV(X.C69393Vmd r10, X.C5GM r11) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64622wL.DSV(X.Vmd, X.5GM):void");
    }

    @Override // X.InterfaceC64642wN
    public final void DSW(C5GM c5gm) {
        C34949FaZ c34949FaZ = (C34949FaZ) this.A04.getValue();
        Integer num = C05F.A0N;
        if (c5gm.A06.intValue() == 3) {
            UserSession userSession = c34949FaZ.A02;
            new C35233FgQ(c34949FaZ.A00, c34949FaZ.A01, userSession, null, null).A07(EnumC33444EqG.A0I);
        }
        AbstractC34898FZk.A00(c34949FaZ.A02, c5gm, C05F.A01, num);
    }

    @Override // X.InterfaceC64642wN
    public final void DSX(C5GM c5gm) {
        C34949FaZ c34949FaZ = (C34949FaZ) this.A04.getValue();
        AbstractC34898FZk.A00(c34949FaZ.A02, c5gm, C05F.A0C, C05F.A0N);
        ((C65192xH) this.A03.getValue()).A0D(null);
    }

    public C64622wL(UserSession userSession, C60862qA c60862qA, C61222qk c61222qk) {
        this.A00 = userSession;
        this.A02 = c61222qk;
        this.A01 = c60862qA;
    }
}
