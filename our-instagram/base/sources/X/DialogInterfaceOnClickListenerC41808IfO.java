package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.IfO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC41808IfO implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC018607g A01;
    public final /* synthetic */ C1P1 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;

    public /* synthetic */ DialogInterfaceOnClickListenerC41808IfO(Context context, AbstractC018607g abstractC018607g, C1P1 c1p1, UserSession userSession, C38321qM c38321qM) {
        this.A03 = userSession;
        this.A04 = c38321qM;
        this.A02 = c1p1;
        this.A00 = context;
        this.A01 = abstractC018607g;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A03;
        C38321qM c38321qM = this.A04;
        C42089Ikw.A01(this.A00, this.A01, this.A02, userSession, c38321qM);
    }
}
