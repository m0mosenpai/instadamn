package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.LdF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48517LdF implements InterfaceC13000lm {
    public static final long A07;
    public static final LJJ A08 = new Object();
    public static final Map A09;
    public static final long A0A;
    public C2QE A00;
    public boolean A01;
    public final UserSession A02;
    public final File A03;
    public final File A04;
    public final InterfaceC09390do A05;
    public final C11N A06;

    public C48517LdF(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        K55 A00 = EnumC46121KbL.A01.A00(AbstractC25225BEi.A0F(userSession));
        this.A06 = A00;
        C54846OMr c54846OMr = new C54846OMr();
        String A0R = AnonymousClass001.A0R(A00.A00, "/ae-media");
        String str = userSession.userId;
        c54846OMr.A04(A00, new File(A0R, str), AbstractC31175DnJ.A1T(1, A0R, str));
        this.A03 = c54846OMr.A00();
        this.A05 = AbstractC09440dt.A01(MHS.A00(this, 18));
        this.A04 = A00(this, "spans");
        if (AbstractC94034Kn.A00(userSession)) {
            if (AbstractC453326q.A02(userSession)) {
                this.A01 = true;
                AbstractC23881Ey.A00().AXd(A01(), 1307688829);
            } else {
                AbstractC46742Klz.A00(userSession, C05F.A1F).A06(new C30190DRv(this, 15));
            }
        }
    }

    public static final C1MG A01() {
        C1FC c1fc = new C1FC(1209600L, false);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(c1fc.A00(), c1fc);
        long j = A0A;
        C1FB c1fb = new C1FB(j, j, j, -1L, false, false);
        A1G.put(c1fb.A00(), c1fb);
        return new C1MG(null, null, null, A1G);
    }

    public final synchronized C2QE A02() {
        C2QE c2qe;
        c2qe = this.A00;
        if (c2qe == null) {
            c2qe = LJJ.A00(A08, this.A04, this.A01);
            this.A00 = c2qe;
        }
        return c2qe;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LJJ, java.lang.Object] */
    static {
        long j;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C1AD.A06(c06090Tz, 18308715438418951L)) {
            j = C1AD.A01(c06090Tz, 18590190415189085L);
        } else {
            j = 512;
        }
        long j2 = j * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        A07 = j2;
        A0A = j2 + (C1AD.A01(c06090Tz, 18590190415254622L) * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED);
        A09 = AbstractC166987dD.A1I();
    }

    public static final C53086Ndz A00(C48517LdF c48517LdF, String str) {
        File file = c48517LdF.A03;
        if (!file.exists()) {
            file.mkdirs();
        }
        C54846OMr c54846OMr = new C54846OMr();
        C11N c11n = (C11N) c48517LdF.A05.getValue();
        AbstractC167007dF.A1D(str, 1, c11n);
        c54846OMr.A04(c11n, new File(file, str), true);
        return c54846OMr.A00();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        LJJ ljj = A08;
        File file = this.A04;
        synchronized (ljj) {
            String path = file.getPath();
            Map map = A09;
            C64214T4d c64214T4d = (C64214T4d) map.get(path);
            if (c64214T4d != null) {
                c64214T4d.release();
                map.remove(path);
            }
        }
    }
}
