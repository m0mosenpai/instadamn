package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IiE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41921IiE implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C905641r A01;
    public final /* synthetic */ C38321qM A02;

    public ViewOnClickListenerC41921IiE(UserSession userSession, C905641r c905641r, C38321qM c38321qM) {
        this.A01 = c905641r;
        this.A00 = userSession;
        this.A02 = c38321qM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        int A05 = C0f9.A05(1152306196);
        IL2 il2 = new IL2(AbstractC166997dE.A0L(AbstractC167007dF.A0L(this.A01.A03)));
        UserSession userSession = this.A00;
        C38321qM c38321qM = this.A02;
        if (c38321qM.A6Z(userSession)) {
            num = C05F.A0N;
        } else {
            Integer A00 = C41D.A00(c38321qM);
            if (A00 != null && A00.intValue() >= C41754IeU.A00(userSession)) {
                num = C05F.A0Y;
            } else {
                num = C05F.A0u;
            }
        }
        il2.A00(null, userSession, c38321qM, num);
        C0f9.A0C(-1901129909, A05);
    }
}
