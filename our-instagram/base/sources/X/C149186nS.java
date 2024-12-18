package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.6nS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149186nS implements C33I {
    public C5SW A00;
    public InterfaceC145156ga A01;
    public boolean A02;
    public final Activity A03;
    public final UserSession A04;
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C9E7(this, 31));

    @Override // X.C33I
    public final boolean Dtk(C5SW c5sw) {
        return true;
    }

    @Override // X.C33I
    public final void Dtq(C5SW c5sw) {
    }

    @Override // X.C33I
    public final void Dto(C5SW c5sw) {
        InterfaceC145156ga interfaceC145156ga = this.A01;
        if (interfaceC145156ga != null) {
            interfaceC145156ga.Dtn();
        }
    }

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        C23031Ai c23031Ai = (C23031Ai) this.A05.getValue();
        c23031Ai.A2K.Egi(c23031Ai, true, C23031Ai.A8c[170]);
        this.A02 = false;
    }

    public C149186nS(Activity activity, UserSession userSession) {
        this.A03 = activity;
        this.A04 = userSession;
    }
}
