package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Rbq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60936Rbq extends C2AH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C60936Rbq(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A02 = obj3;
        this.A04 = obj2;
        this.A03 = obj5;
        this.A01 = obj;
        this.A05 = obj4;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        if (1 - this.A00 != 0) {
            super.onFail(exc);
            return;
        }
        C55165OdT.A02((DialogInterface.OnDismissListener) this.A04, (AbstractC10360h2) this.A02);
        C9GR.A0A((Context) this.A01, "save_error");
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            File A0Z = AbstractC166997dE.A0Z(obj);
            C55165OdT.A02((DialogInterface.OnDismissListener) this.A04, (AbstractC10360h2) this.A02);
            C38321qM c38321qM = ((C41181vS) this.A03).A0b;
            if (c38321qM != null) {
                JQ0.A1P(AbstractC43592JPx.A0x(A0Z), (UserSession) this.A05, c38321qM);
            }
            Context context = (Context) this.A01;
            AbstractC50633MWu.A09(context, A0Z);
            C9GR.A07(context, 2131972833);
            return;
        }
        AbstractC27461Uz abstractC27461Uz = (AbstractC27461Uz) obj;
        FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
        if (fragmentActivity == null) {
            return;
        }
        abstractC27461Uz.getSmartLockBroker(fragmentActivity, new TGV(this, 1), (AbstractC12990ll) this.A03);
    }
}
