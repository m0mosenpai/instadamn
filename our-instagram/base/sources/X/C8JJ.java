package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8JJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JJ extends C8JK {
    public String A00;
    public final C8HI A01;
    public final AnonymousClass880 A02;
    public final C8FG A03;
    public final UserSession A04;
    public final C1813982r A05;

    @Override // X.C8JL
    public final void Dte() {
        this.A00 = null;
        if (A03() && !super.A00) {
            DYJ();
        } else {
            ARa();
        }
    }

    @Override // X.C8JL
    public final void APQ() {
        String str;
        C88X A0D;
        if (this.A00 == null) {
            C8FG c8fg = this.A03;
            if (c8fg != null && (A0D = c8fg.A0D()) != null) {
                str = A0D.getId();
            } else {
                str = null;
            }
            this.A00 = str;
        }
        C176567tE.A00(new RunnableC24363Ar6(this));
    }

    @Override // X.C8JL
    public final void ARa() {
        C176567tE.A00(new RunnableC24364Ar7(this));
    }

    @Override // X.C8JL
    public final void DJZ() {
        C174757qB c174757qB = this.A05.A02;
        if (c174757qB != null) {
            BDp bDp = c174757qB.A04;
            if (bDp != null) {
                bDp.D73();
            }
            super.A00 = false;
        }
    }

    @Override // X.C8JL
    public final void DYJ() {
        C174757qB c174757qB = this.A05.A02;
        if (c174757qB != null) {
            C174757qB.A05(EnumC222819sM.A03, c174757qB);
        }
        super.A00 = true;
        ARa();
    }

    public C8JJ(Context context, UserSession userSession, C8HI c8hi, AnonymousClass880 anonymousClass880, C8FG c8fg, C1813982r c1813982r) {
        super(userSession, context);
        this.A04 = userSession;
        this.A05 = c1813982r;
        this.A03 = c8fg;
        this.A01 = c8hi;
        this.A02 = anonymousClass880;
    }
}
