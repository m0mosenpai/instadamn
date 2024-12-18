package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lvk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49591Lvk implements C0JG {
    public final C54s A00;
    public final C116155Nu A01;
    public final L85 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final InterfaceC16660sJ A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        boolean A1R = AbstractC167007dF.A1R(0, userSession, interfaceC03960Jm);
        C116155Nu c116155Nu = this.A01;
        C54s c54s = this.A00;
        c54s.A0G("skips_sync", false);
        C60H c60h = (C60H) this.A06.invoke(userSession);
        String str = this.A04;
        String str2 = this.A05;
        String obj = c54s.toString();
        String str3 = c116155Nu.A1G;
        if (str3 == null) {
            str3 = c116155Nu.A1F;
        }
        if (str3 == null) {
            str3 = "";
        }
        Boolean valueOf = Boolean.valueOf(c116155Nu.A1S);
        boolean z = this.A08;
        C60H.A01(c60h, valueOf, Boolean.valueOf(z), "ARMADILLO_NOTIFICATIONS_PUSH_PAYLOAD_RECEIVED", str, str2, obj, str3);
        if (c116155Nu.A1S) {
            String str4 = this.A03;
            if (str4 == null) {
                str4 = LCJ.A00(userSession);
            }
            String str5 = c116155Nu.A0z;
            if (str5 == null) {
                str5 = str4;
            }
            c116155Nu.A0z = str5;
            if (str5 != null) {
                C132515ya A00 = C60J.A00(userSession);
                String str6 = c116155Nu.A0B.A01;
                boolean z2 = this.A09;
                Boolean valueOf2 = Boolean.valueOf(this.A07);
                boolean z3 = c116155Nu.A1S;
                String str7 = str4;
                String str8 = str5;
                A00.A04(valueOf2, c116155Nu.A0I, c116155Nu.A0H, str8, str7, str6, C60J.A02(z, c116155Nu.A1U), c116155Nu.A0T, C50367MLu.A01(userSession, 41), new C30190DRv(userSession, 48), z2, false, z3);
            }
        }
        this.A02.A00(A1R);
        interfaceC03960Jm.AIn(null);
    }

    public C49591Lvk(C54s c54s, C116155Nu c116155Nu, L85 l85, String str, String str2, String str3, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(interfaceC16660sJ, 10);
        this.A01 = c116155Nu;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A09 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A00 = c54s;
        this.A02 = l85;
        this.A06 = interfaceC16660sJ;
    }
}
