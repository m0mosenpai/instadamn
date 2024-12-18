package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8JM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JM extends C8JK {
    public final C8HI A00;
    public final AnonymousClass880 A01;
    public final C8FG A02;
    public final C1813982r A03;

    @Override // X.C8JL
    public final void APQ() {
    }

    @Override // X.C8JL
    public final void ARa() {
        C176567tE.A00(new RunnableC24365Ar8(this));
    }

    @Override // X.C8JL
    public final void DJZ() {
        C174757qB c174757qB = this.A03.A02;
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
        C174757qB c174757qB = this.A03.A02;
        if (c174757qB != null) {
            C174757qB.A05(EnumC222819sM.A03, c174757qB);
        }
        super.A00 = true;
        ARa();
    }

    public C8JM(Context context, UserSession userSession, C8HI c8hi, AnonymousClass880 anonymousClass880, C8FG c8fg, C1813982r c1813982r) {
        super(userSession, context);
        this.A03 = c1813982r;
        this.A02 = c8fg;
        this.A00 = c8hi;
        this.A01 = anonymousClass880;
    }

    @Override // X.C8JL
    public final void Dte() {
        if (A03() && !super.A00) {
            DYJ();
        } else {
            ARa();
        }
    }
}
