package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class LF1 {
    public boolean A00;
    public final UserSession A01;
    public final KPU A02;
    public final KPH A03;
    public final LGY A04;
    public final LF2 A05;
    public final C44100JeP A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;

    public static final void A00(Activity activity, LF1 lf1, boolean z) {
        List A1J;
        String str;
        InterfaceC09390do interfaceC09390do = lf1.A0A;
        if (!C6CB.A02(AbstractC43593JPy.A0P(interfaceC09390do), 2342158937684446966L)) {
            C0K8.A0D("EncryptedBackupsRestoreNuxManager", "not attempting restore, restore gating disabled");
            return;
        }
        lf1.A00 = true;
        boolean A02 = C6CB.A02(AbstractC43593JPy.A0P(interfaceC09390do), 36315928477110080L);
        UserSession userSession = lf1.A01;
        if (A02) {
            A1J = AbstractC16960so.A1Q(new C48680LgA(userSession), new C48681LgB(userSession));
        } else {
            A1J = AbstractC166987dD.A1J(new C48681LgB(userSession));
        }
        C47314KvP c47314KvP = new C47314KvP(A1J);
        C41761wQ c41761wQ = (C41761wQ) AbstractC166987dD.A17(lf1.A08);
        KPU kpu = lf1.A02;
        BQB bqb = new BQB(9, lf1, activity, z);
        AbstractC167017dG.A1R(c41761wQ, kpu);
        List list = c47314KvP.A00;
        if (0 >= list.size()) {
            if (list.isEmpty()) {
                str = "No seamless handlers";
            } else {
                str = "Null handler result";
            }
            bqb.invoke(new KPY(str));
            return;
        }
        ((InterfaceC50454MPi) list.get(0)).E4E(activity, c41761wQ, kpu, new MIQ(activity, c41761wQ, kpu, c47314KvP, bqb, 0, z), z);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.98s, X.KPH] */
    public /* synthetic */ LF1(UserSession userSession) {
        LGY A00 = AbstractC46741Kly.A00(userSession);
        LF2 lf2 = new LF2(userSession);
        C44100JeP c44100JeP = new C44100JeP(userSession);
        C006802i A0O = AbstractC43594JPz.A0O(userSession);
        InterfaceC02900Bo A002 = C0BQ.A00(userSession);
        C6CF A003 = C6CE.A00(userSession);
        AbstractC167017dG.A1R(A002, A003);
        ?? abstractC2056898s = new AbstractC2056898s(A0O, A003, A002);
        KPU A004 = AbstractC47844LBm.A00(userSession, C05F.A00);
        AbstractC25229BEm.A1I(A00, 2, A004);
        this.A01 = userSession;
        this.A04 = A00;
        this.A05 = lf2;
        this.A06 = c44100JeP;
        this.A03 = abstractC2056898s;
        this.A02 = A004;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A08 = AbstractC09440dt.A00(enumC09460dv, MFY.A00);
        this.A07 = MHK.A00(this, enumC09460dv, 18);
        this.A09 = MHK.A00(this, enumC09460dv, 19);
        this.A0A = MHK.A00(this, enumC09460dv, 20);
    }
}
