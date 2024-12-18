package X;

import android.content.Context;
import com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AVj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23324AVj implements InterfaceC180087yy, BEP, BBO {
    public BB1 A00;
    public BB2 A01;
    public InterfaceC178207vu A02;
    public AnonymousClass818 A03;
    public C214129eC A04;
    public C214129eC A05;
    public final C150486px A06;
    public final InterfaceC142616cN A07;
    public final AKM A08;
    public final Context A09;
    public final UserSession A0A;
    public final List A0B = new ArrayList(2);

    @Override // X.InterfaceC178077vg
    public final void APM() {
    }

    @Override // X.InterfaceC178077vg
    public final void ARQ() {
    }

    @Override // X.InterfaceC178077vg
    public final void CNu() {
    }

    @Override // X.InterfaceC178077vg
    public final void E50() {
    }

    @Override // X.InterfaceC178077vg
    public final void ECK() {
    }

    @Override // X.InterfaceC178077vg
    public final void EKd() {
    }

    @Override // X.InterfaceC178077vg
    public final void connect() {
    }

    @Override // X.InterfaceC178077vg
    public final void disconnect() {
    }

    @Override // X.InterfaceC178077vg
    public final void pause() {
    }

    @Override // X.InterfaceC178077vg
    public final void release() {
    }

    @Override // X.BBO
    public final C177797vD AJy(C203678zW c203678zW) {
        C9Y5 c9y5;
        C150156pL A00 = this.A06.A00(this.A07);
        C203708zZ c203708zZ = c203678zW.A04.A00;
        if (c203708zZ != null) {
            UserSession userSession = this.A0A;
            String str = C1F8.A00(userSession).A04;
            if (str != null) {
                if (str.startsWith("Bearer")) {
                    str = str.substring(6);
                }
                String trim = str.trim();
                c9y5 = new C9Y5(new C23338AWh(c203708zZ.A00, c203708zZ, this), null, C05F.A01, userSession.userId, trim);
                return this.A08.A01(c203678zW, A00, c9y5, this.A00, this.A01, null);
            }
        }
        c9y5 = null;
        return this.A08.A01(c203678zW, A00, c9y5, this.A00, this.A01, null);
    }

    @Override // X.BEP
    public final C150486px B4B() {
        return this.A06;
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return BEP.A00;
    }

    @Override // X.InterfaceC180087yy
    public final List Bmt() {
        if (this.A05 == null) {
            C214129eC c214129eC = new C214129eC(this.A09, C18U.A06(C06090Tz.A05, this.A0A, 36316233410285758L));
            this.A05 = c214129eC;
            this.A0B.add(c214129eC);
        }
        if (this.A03 == null) {
            Context context = this.A09;
            UserSession userSession = this.A0A;
            AnonymousClass818 A00 = AbstractC201288vC.A00(context, new C83U() { // from class: X.AWd
                @Override // X.C83U
                public final void CuF(String str) {
                }
            }, null, null, AbstractC149806oZ.A00(userSession), userSession, 0);
            this.A03 = A00;
            this.A0B.add(A00);
        }
        if (this.A04 == null) {
            C214129eC c214129eC2 = new C214129eC(this.A09, C18U.A06(C06090Tz.A05, this.A0A, 36316233410285758L));
            this.A04 = c214129eC2;
            this.A0B.add(c214129eC2);
        }
        return this.A0B;
    }

    @Override // X.InterfaceC178077vg
    public final void CNZ() {
        AKM akm = this.A08;
        InterfaceC178207vu interfaceC178207vu = this.A02;
        interfaceC178207vu.getClass();
        akm.A00 = (InterfaceC179927yi) interfaceC178207vu.Aq0(InterfaceC179927yi.A00);
    }

    public C23324AVj(Context context, InterfaceC142616cN interfaceC142616cN, UserSession userSession, String str) {
        this.A09 = context;
        this.A0A = userSession;
        this.A07 = interfaceC142616cN;
        this.A08 = new AKM(context, userSession, str);
        this.A06 = C150476pw.A00(context, new QPLUserFlowImpl(C18U.A06(C06090Tz.A05, userSession, 36330720336036851L)), userSession);
    }
}
