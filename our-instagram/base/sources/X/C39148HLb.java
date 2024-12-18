package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.EnumSet;

/* renamed from: X.HLb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39148HLb extends AnonymousClass346 {
    public int A00;
    public final double A01;
    public final double A02;
    public final long A03;
    public final long A04;
    public final FragmentActivity A05;
    public final UserSession A06;
    public final C61382r1 A07;
    public final java.util.Set A09;
    public final java.util.Set A0A;
    public final String A0D;
    public final java.util.Set A0E;
    public final String A08 = AbstractC167017dG.A0j();
    public final InterfaceC09390do A0B = AbstractC09440dt.A01(new C57248PbW(this, 32));
    public final C42393Ipu A0C = new C42393Ipu(this);

    public C39148HLb(FragmentActivity fragmentActivity, UserSession userSession, C61382r1 c61382r1, String str) {
        this.A05 = fragmentActivity;
        this.A06 = userSession;
        this.A07 = c61382r1;
        this.A0D = str;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = C18U.A00(c06090Tz, userSession, 37174019983868522L);
        this.A04 = C18U.A01(c06090Tz, userSession, 36611070030321914L);
        this.A03 = C18U.A01(c06090Tz, userSession, 36611070030715131L);
        this.A02 = C18U.A00(c06090Tz, userSession, 37174019983934059L);
        this.A0E = AbstractC16830sb.A07(EnumC86843tw.A0B, EnumC86843tw.A05);
        this.A0A = AbstractC16830sb.A05(AnonymousClass317.A08, AnonymousClass317.A09);
        this.A09 = AbstractC16830sb.A05(AnonymousClass317.A0D, AnonymousClass317.A0E, AnonymousClass317.A0J, AnonymousClass317.A0K, AnonymousClass317.A07, AnonymousClass317.A06);
    }

    private final boolean A00(C38321qM c38321qM) {
        UserSession userSession;
        String A07;
        EnumC906041v enumC906041v;
        if (c38321qM.CdW() && (A07 = AbstractC41071vF.A07((userSession = this.A06), c38321qM)) != null && A07.length() != 0 && this.A00 < this.A03 && Math.abs(AnonymousClass001.A0R(A07, this.A08).hashCode()) / 2.147483647E9d <= this.A02) {
            AndroidLink A02 = AbstractC905941u.A02(this.A05, userSession, c38321qM, 0, false);
            if (A02 != null) {
                enumC906041v = AbstractC114965Hm.A01(A02);
            } else {
                enumC906041v = null;
            }
            if (enumC906041v == EnumC906041v.AD_DESTINATION_WEB && !c38321qM.A4j() && !AbstractC41071vF.A0P(userSession, c38321qM)) {
                EnumSet enumSet = AbstractC75103Za.A00;
                C14360o3.A0B(userSession, 0);
                if (!C76253bV.A03(userSession, c38321qM) && !c38321qM.A67() && !c38321qM.A5w() && !c38321qM.A5m()) {
                    String A0D = AbstractC41071vF.A0D(userSession, c38321qM);
                    if ((A0D == null || A0D.length() == 0) && this.A0E.contains(C86833tv.A00(userSession, c38321qM, this.A0D, false))) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Ctt(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c59072n8, c38321qM);
        if (A00(c38321qM)) {
            c59072n8.A00(this.A0C);
        }
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Ctx(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c59072n8, c38321qM);
        if (A00(c38321qM)) {
            c59072n8.A00(this.A0C);
        }
    }
}
