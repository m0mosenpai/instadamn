package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Jmq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44546Jmq extends AbstractC52922bZ {
    public final C2GT A00;
    public final C140966Yy A01;
    public final C42221xC A02;
    public final C42221xC A03;
    public final C41761wQ A04;
    public final UserSession A05;
    public final C25804BbL A06;
    public final C48519LdH A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C23031Ai A0E;

    public C44546Jmq(C140966Yy c140966Yy, C12N c12n, C42221xC c42221xC, C42221xC c42221xC2, UserSession userSession, C25804BbL c25804BbL, C48519LdH c48519LdH, C23031Ai c23031Ai) {
        boolean z;
        C14360o3.A0B(userSession, 1);
        AbstractC167007dF.A1F(c23031Ai, 3, c48519LdH);
        AbstractC167007dF.A1I(c25804BbL, 7, c12n);
        this.A05 = userSession;
        this.A01 = c140966Yy;
        this.A0E = c23031Ai;
        this.A07 = c48519LdH;
        this.A02 = c42221xC;
        this.A03 = c42221xC2;
        this.A06 = c25804BbL;
        this.A04 = new C41761wQ(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        C24721Ip c24721Ip = new C24721Ip(C3JM.A00);
        this.A08 = c24721Ip;
        this.A09 = AbstractC07080Za.A03(c24721Ip);
        C008002u A1H = AbstractC25225BEi.A1H(EnumC46149Kbn.A04);
        this.A0D = A1H;
        C44100JeP c44100JeP = new C44100JeP(userSession);
        if (!C44100JeP.A04(c44100JeP)) {
            z = false;
        } else {
            z = c44100JeP.A00.getBoolean("EB_SHOW_DEBUG_TOASTS", false);
        }
        C008002u A00 = C10E.A00(Boolean.valueOf(z));
        this.A0C = A00;
        C008002u A002 = C10E.A00(null);
        this.A0B = A002;
        EnumC46171Kc9 enumC46171Kc9 = EnumC46171Kc9.A07;
        C008002u A1H2 = AbstractC25225BEi.A1H(enumC46171Kc9);
        this.A0A = A1H2;
        Integer num = C05F.A0Y;
        C48519LdH.A03(c48519LdH, num);
        C0UO c0uo = c48519LdH.A0P;
        C48519LdH.A03(c48519LdH, num);
        InterfaceC19390xP interfaceC19390xP = c48519LdH.A0I;
        C48519LdH.A03(c48519LdH, num);
        InterfaceC19390xP interfaceC19390xP2 = c48519LdH.A0H;
        C48519LdH.A03(c48519LdH, num);
        C0UO c0uo2 = c48519LdH.A0T;
        C14360o3.A0B(num, 0);
        C48519LdH.A03(c48519LdH, num);
        InterfaceC19390xP A15 = AbstractC43593JPy.A15(c12n, new C43817JZf(new InterfaceC19390xP[]{c0uo, interfaceC19390xP, interfaceC19390xP2, A002, c0uo2, A1H, A00, A1H2, c48519LdH.A0O}, 13), 1705805791);
        this.A00 = AbstractC43594JPz.A0J(new C45075Jx4(null, enumC46171Kc9, EnumC46172KcA.A07, EnumC46165Kc3.A06, false, false, true, true, false, false, false, false, false), AbstractC141776au.A00(this), A15, C10I.A00);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A04.A01();
    }

    public static final void A00(C44546Jmq c44546Jmq, File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                C14360o3.A0A(file2);
                A00(c44546Jmq, file2);
            }
        }
        String name = file.getName();
        C14360o3.A07(name);
        if (AbstractC001900j.A0a(name, AbstractC111324zv.A00(4937), false)) {
            file.delete();
        }
    }

    public static final void A01(C44546Jmq c44546Jmq, String str) {
        GSS.A02(MVZ.A00(str), c44546Jmq, AbstractC141776au.A00(c44546Jmq), 3);
    }
}
