package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NA3 extends C1P1 {
    public final DialogInterface.OnDismissListener A00;
    public final C52770NXa A01;
    public final C145186gd A02;
    public final /* synthetic */ C54800OJu A03;

    public NA3(DialogInterface.OnDismissListener onDismissListener, C54800OJu c54800OJu, C145186gd c145186gd) {
        this.A03 = c54800OJu;
        this.A00 = onDismissListener;
        C52770NXa c52770NXa = new C52770NXa();
        this.A01 = c52770NXa;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("isUpdating", true);
        c52770NXa.setArguments(A0b);
        this.A02 = c145186gd;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1023681070);
        C14360o3.A0B(abstractC115105If, 0);
        String A01 = AbstractC172137li.A01(abstractC115105If);
        Context context = this.A03.A05;
        if (A01 == null || A01.length() == 0) {
            A01 = AbstractC166997dE.A0q(context.getResources(), 2131972429);
        }
        C9GR.A03(context, A01, "EditMediaCallback_request_error", 0);
        C0f9.A0A(1757829618, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-29263405);
        this.A03.A06.post(new RunnableC56907PNa(this));
        C0f9.A0A(2125980321, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-227190585);
        AbstractC10360h2 abstractC10360h2 = this.A03.A07;
        if (abstractC10360h2.A0Q("ProgressDialog") == null) {
            C52770NXa c52770NXa = this.A01;
            if (!c52770NXa.isAdded()) {
                c52770NXa.A0B(abstractC10360h2, "ProgressDialog");
            }
        }
        C0f9.A0A(-454710188, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1329061200);
        N3N n3n = (N3N) obj;
        int A0N = AbstractC167017dG.A0N(n3n, -717652973);
        C54800OJu c54800OJu = this.A03;
        UserSession userSession = c54800OJu.A08;
        C1DW.A00(userSession).A03(n3n.A00());
        c54800OJu.A09.AEH(userSession);
        C0f9.A0A(-1799793236, A0N);
        C0f9.A0A(-12607110, A03);
    }
}
