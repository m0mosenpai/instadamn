package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EaP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32698EaP extends G1U {
    public final FragmentActivity A00;
    public final CharSequence A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC37220GaV
    public final /* bridge */ /* synthetic */ CharSequence Ay2() {
        return null;
    }

    @Override // X.InterfaceC37220GaV
    public final void DAx() {
    }

    @Override // X.InterfaceC37220GaV
    public final void D8n() {
        A03(EnumC33328EoN.A03);
        AbstractC166987dD.A1Z(new D4v(this, null, 33), super.A03);
    }

    @Override // X.InterfaceC37220GaV
    public final void Djb() {
        A04(C32695EaM.A00);
    }

    public C32698EaP(Context context, FragmentActivity fragmentActivity, UserSession userSession, C2EE c2ee) {
        super(context, userSession, c2ee);
        this.A00 = fragmentActivity;
        this.A02 = AbstractC166997dE.A0p(context, 2131954265);
        this.A03 = AbstractC166997dE.A0p(context, 2131954249);
        this.A01 = AbstractC166997dE.A0p(context, 2131974280);
    }

    @Override // X.InterfaceC37220GaV
    public final String Ata() {
        return this.A02;
    }

    @Override // X.InterfaceC37220GaV
    public final CharSequence B7n() {
        return this.A01;
    }

    @Override // X.InterfaceC37220GaV
    public final String BrR() {
        return this.A03;
    }
}
