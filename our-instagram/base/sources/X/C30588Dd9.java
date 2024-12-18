package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dd9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30588Dd9 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ C26050Bfd A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C83 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30588Dd9(C26050Bfd c26050Bfd, UserSession userSession, C83 c83, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, boolean z, boolean z2, boolean z3) {
        super(3);
        this.A0C = z;
        this.A00 = c26050Bfd;
        this.A01 = userSession;
        this.A03 = str;
        this.A0B = z2;
        this.A08 = interfaceC16660sJ;
        this.A09 = interfaceC16660sJ2;
        this.A0D = z3;
        this.A0A = interfaceC16660sJ3;
        this.A07 = interfaceC16660sJ4;
        this.A02 = c83;
        this.A05 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A04 = interfaceC16820sZ3;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC30801Dgc interfaceC30801Dgc;
        float f;
        float f2;
        InterfaceC30801Dgc interfaceC30801Dgc2;
        InterfaceC30801Dgc interfaceC30801Dgc3;
        String str;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1726028975, "com.instagram.aistudio.editor.AiSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AiSettingsScreen.kt:127)");
            }
            boolean z = this.A0C;
            C26050Bfd c26050Bfd = this.A00;
            UserSession userSession = this.A01;
            String str2 = this.A03;
            boolean z2 = this.A0B;
            InterfaceC16660sJ interfaceC16660sJ = this.A08;
            InterfaceC16660sJ interfaceC16660sJ2 = this.A09;
            boolean z3 = this.A0D;
            InterfaceC16660sJ interfaceC16660sJ3 = this.A0A;
            InterfaceC16660sJ interfaceC16660sJ4 = this.A07;
            C83 c83 = this.A02;
            InterfaceC16820sZ interfaceC16820sZ = this.A05;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A06;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A04;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, C5X8.A00);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (z) {
                c5Tl.Eno(1156270306);
                AbstractC27525CCv.A00(c5Tl, null, C5YD.A00(c5Tl, 2131968148), 0, 1);
                C117505Tk.A0L(c117505Tk, false);
            } else {
                c5Tl.Eno(1156391144);
                String str3 = c26050Bfd.A08;
                String A002 = C5YD.A00(c5Tl, 2131968148);
                int A012 = AbstractC28459ChB.A01(userSession);
                if (str3.length() > AbstractC28459ChB.A01(userSession)) {
                    interfaceC30801Dgc = new C26179Bi4(str2);
                } else if (AbstractC25225BEi.A1Y(str3) && z2) {
                    interfaceC30801Dgc = C29181Ctm.A00;
                } else {
                    interfaceC30801Dgc = C29183Cto.A00;
                }
                InterfaceC30801Dgc interfaceC30801Dgc4 = interfaceC30801Dgc;
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, interfaceC16660sJ, 2115521561);
                Object EEc = c5Tl.EEc();
                if (A1Y || EEc == C5UI.A00) {
                    EEc = new DRW(interfaceC16660sJ, 49);
                    c5Tl.FBy(EEc);
                }
                InterfaceC16660sJ interfaceC16660sJ5 = (InterfaceC16660sJ) EEc;
                Boolean A0k = AbstractC25227BEk.A0k(c117505Tk, true);
                Integer valueOf = Integer.valueOf(A012);
                Integer valueOf2 = Integer.valueOf(R.drawable.instagram_arrow_cw_pano_outline_24);
                boolean A1Y2 = AbstractC25232BEp.A1Y(c5Tl, interfaceC16660sJ2, userSession, 2115535917);
                Object EEc2 = c5Tl.EEc();
                if (A1Y2 || EEc2 == C5UI.A00) {
                    EEc2 = C29898DGm.A00(c5Tl, interfaceC16660sJ2, userSession, 48);
                }
                AbstractC28505Chy.A01(null, null, null, c5Tl, c1130158n, interfaceC30801Dgc4, A0k, valueOf, valueOf2, str3, A002, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), interfaceC16660sJ5, 0, 1, 1575936, 48, 10144, false);
                C117505Tk.A0L(c117505Tk, false);
            }
            if (z3) {
                c5Tl.Eno(1157490497);
                f = 16.0f;
                f2 = 0.0f;
                AbstractC27525CCv.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 16.0f, 0.0f, 0.0f), C5YD.A00(c5Tl, 2131952834), 6, 0);
                C117505Tk.A0L(c117505Tk, false);
            } else {
                c5Tl.Eno(1157700894);
                String str4 = c26050Bfd.A0A;
                String A003 = C5YD.A00(c5Tl, 2131952834);
                f = 16.0f;
                f2 = 0.0f;
                Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 16.0f, 0.0f, 0.0f);
                int A02 = AbstractC28459ChB.A02(userSession);
                if (str4.length() > AbstractC28459ChB.A02(userSession)) {
                    interfaceC30801Dgc2 = new C26179Bi4(str2);
                } else if (AbstractC25225BEi.A1Y(str4) && z2) {
                    interfaceC30801Dgc2 = C29181Ctm.A00;
                } else {
                    interfaceC30801Dgc2 = C29183Cto.A00;
                }
                InterfaceC30801Dgc interfaceC30801Dgc5 = interfaceC30801Dgc2;
                boolean A1Y3 = AbstractC25227BEk.A1Y(c5Tl, interfaceC16660sJ3, 2115565506);
                Object EEc3 = c5Tl.EEc();
                if (A1Y3 || EEc3 == C5UI.A00) {
                    EEc3 = AbstractC25235BEs.A13(c5Tl, interfaceC16660sJ3, 0);
                }
                InterfaceC16660sJ interfaceC16660sJ6 = (InterfaceC16660sJ) EEc3;
                Boolean A0k2 = AbstractC25227BEk.A0k(c117505Tk, true);
                Integer valueOf3 = Integer.valueOf(A02);
                Integer valueOf4 = Integer.valueOf(R.drawable.instagram_arrow_cw_pano_outline_24);
                boolean A1Y4 = AbstractC25227BEk.A1Y(c5Tl, interfaceC16660sJ2, 2115580151);
                Object EEc4 = c5Tl.EEc();
                if (A1Y4 || EEc4 == C5UI.A00) {
                    EEc4 = C29907DGv.A00(c5Tl, interfaceC16660sJ2, 43);
                }
                AbstractC28505Chy.A01(null, null, null, c5Tl, A0E, interfaceC30801Dgc5, A0k2, valueOf3, valueOf4, str4, A003, null, AbstractC25225BEi.A1A(c117505Tk, EEc4, false), interfaceC16660sJ6, 0, 1, 1575936, 48, 10144, false);
                C117505Tk.A0L(c117505Tk, false);
            }
            String str5 = c26050Bfd.A07;
            String A004 = C5YD.A00(c5Tl, 2131952812);
            Modifier A0A = AbstractC118175Wb.A0A(c1130158n, f2, f);
            int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486574015766L);
            int A072 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605486574015766L);
            int A005 = AbstractC28459ChB.A00(userSession);
            if (str5.length() > AbstractC28459ChB.A00(userSession)) {
                interfaceC30801Dgc3 = new C26179Bi4(str2);
            } else {
                AbstractC001900j.A0T(str5);
                interfaceC30801Dgc3 = C29183Cto.A00;
            }
            InterfaceC30801Dgc interfaceC30801Dgc6 = interfaceC30801Dgc3;
            boolean A1Y5 = AbstractC25227BEk.A1Y(c5Tl, interfaceC16660sJ4, 2115601006);
            Object EEc5 = c5Tl.EEc();
            if (A1Y5 || EEc5 == C5UI.A00) {
                EEc5 = AbstractC25235BEs.A13(c5Tl, interfaceC16660sJ4, 1);
            }
            AbstractC28505Chy.A06(c5Tl, A0A, interfaceC30801Dgc6, Integer.valueOf(A005), str5, A004, AbstractC25225BEi.A1B(c117505Tk, EEc5, false), A07, A072, 3072);
            AbstractC28431Cgf.A01(c5Tl, c26050Bfd, c83, interfaceC16820sZ, 0);
            c5Tl.Eno(2115615739);
            if (c26050Bfd.A0M) {
                Context A0K = AbstractC25228BEl.A0K(c5Tl);
                String A006 = C5YD.A00(c5Tl, 2131952731);
                boolean A007 = AbstractC72723Nt.A00(A0K);
                C26069Bfx c26069Bfx = c26050Bfd.A03;
                if (A007) {
                    if (c26069Bfx != null) {
                        str = c26069Bfx.A00;
                        AbstractC27523CCt.A00(c5Tl, AbstractC25225BEi.A0t(str), A006, null, interfaceC16820sZ2, 0, 5, false);
                    }
                    str = null;
                    AbstractC27523CCt.A00(c5Tl, AbstractC25225BEi.A0t(str), A006, null, interfaceC16820sZ2, 0, 5, false);
                } else {
                    if (c26069Bfx != null) {
                        str = c26069Bfx.A02;
                        AbstractC27523CCt.A00(c5Tl, AbstractC25225BEi.A0t(str), A006, null, interfaceC16820sZ2, 0, 5, false);
                    }
                    str = null;
                    AbstractC27523CCt.A00(c5Tl, AbstractC25225BEi.A0t(str), A006, null, interfaceC16820sZ2, 0, 5, false);
                }
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(2115634632);
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36324011599802178L)) {
                AbstractC28431Cgf.A02(c5Tl, c26050Bfd, interfaceC16820sZ3, 0);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-872493961);
            }
        }
        return C0eB.A00;
    }
}
