package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.BbK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25803BbK extends C193578hc {
    public final UserSession A00;
    public final C28174CbM A01;
    public final C28374Cfc A02;
    public final EnumC193878i8 A03;
    public final C23031Ai A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final C05A A07;
    public final C0UO A08;
    public final C0UO A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25803BbK(Application application, UserSession userSession, C28374Cfc c28374Cfc, EnumC193878i8 enumC193878i8, String str, boolean z, boolean z2) {
        super(application);
        EnumC27379C6i enumC27379C6i;
        C8CW c8cw = new C8CW(userSession);
        C27272C1x c27272C1x = new C27272C1x(userSession);
        C14360o3.A0B(userSession, 0);
        C28174CbM A00 = DH4.A00(userSession);
        AbstractC167017dG.A1P(application, userSession);
        AbstractC167017dG.A1T(enumC193878i8, c28374Cfc);
        C14360o3.A0B(A00, 8);
        this.A00 = userSession;
        this.A03 = enumC193878i8;
        this.A02 = c28374Cfc;
        this.A01 = A00;
        this.A0B = z;
        this.A0A = z2;
        this.A05 = DH0.A00(c8cw, new C8CY(c8cw.A00), 15);
        this.A06 = DH0.A00(c27272C1x, new C8CY(c27272C1x.A00), 16);
        this.A04 = AbstractC23021Ah.A00(userSession);
        this.A08 = ((C27270C1s) this.A05.getValue()).A05;
        C28174CbM c28174CbM = this.A01;
        EnumC193878i8 enumC193878i82 = this.A03;
        CUe cUe = c28174CbM.A02;
        C23031Ai c23031Ai = cUe.A00;
        InterfaceC16530ry interfaceC16530ry = c23031Ai.A3t;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 460) && !AbstractC167017dG.A1b(c23031Ai, c23031Ai.A3u, c0yrArr, 461) && !cUe.A01(enumC193878i82)) {
            enumC27379C6i = EnumC27379C6i.A02;
        } else {
            EnumC193878i8 enumC193878i83 = this.A03;
            if (enumC193878i83 != EnumC193878i8.A0A) {
                C23031Ai c23031Ai2 = this.A04;
                if (c23031Ai2.A01.getInt(C23031Ai.A00(enumC193878i83), 0) < 3 && (enumC193878i83 != EnumC193878i8.A09 || !this.A0A)) {
                    enumC27379C6i = EnumC27379C6i.A04;
                }
            }
            if (this.A0B) {
                enumC27379C6i = EnumC27379C6i.A05;
            } else {
                enumC27379C6i = EnumC27379C6i.A03;
            }
        }
        C008002u A1H = AbstractC25225BEi.A1H(new MUG(enumC193878i8, enumC27379C6i, C18U.A06(C06090Tz.A05, userSession, 36319888430210823L)));
        this.A07 = A1H;
        this.A09 = A1H;
        C27270C1s c27270C1s = (C27270C1s) this.A05.getValue();
        c27270C1s.A00 = enumC193878i8;
        C28224CcU c28224CcU = C27270C1s.A00(c27270C1s).A01;
        if (c28224CcU != null) {
            c27270C1s.A05(c28224CcU);
        }
        ((C27263C1g) this.A06.getValue()).A00.Egh(str);
    }

    public final void A0E(String str, boolean z) {
        Object value;
        EnumC27379C6i enumC27379C6i;
        EnumC193878i8 enumC193878i8;
        boolean z2;
        this.A02.A00.A04 = str;
        ((C27263C1g) this.A06.getValue()).A00.Egh(str);
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
            MUG mug = (MUG) value;
            if (z) {
                enumC27379C6i = EnumC27379C6i.A03;
            } else {
                enumC27379C6i = (EnumC27379C6i) mug.A03;
            }
            enumC193878i8 = (EnumC193878i8) mug.A00;
            z2 = mug.A01;
            AbstractC167017dG.A1N(enumC193878i8, enumC27379C6i);
        } while (!c05a.AIi(value, new MUG(enumC193878i8, enumC27379C6i, z2)));
    }
}
