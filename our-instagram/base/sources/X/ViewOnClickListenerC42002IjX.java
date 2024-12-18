package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.IjX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42002IjX implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC60442pS A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ C41551w4 A03;
    public final /* synthetic */ C6UN A04;
    public final /* synthetic */ String A05;

    public ViewOnClickListenerC42002IjX(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, C41551w4 c41551w4, C6UN c6un, String str) {
        this.A05 = str;
        this.A04 = c6un;
        this.A03 = c41551w4;
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A02 = c41181vS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-2110042303);
        C6WP.A06.add(this.A05);
        IgdsButton igdsButton = this.A04.A03;
        if (igdsButton != null) {
            igdsButton.setEnabled(false);
            C38541qi c38541qi = this.A03.A0H.A0I;
            if (c38541qi == null || (str = c38541qi.A06) == null) {
                str = "";
            }
            C6WP.A01(this.A00, this.A01, c38541qi, str);
            C0f9.A0C(-533594488, A05);
            return;
        }
        C14360o3.A0F("submitButton");
        throw C00O.createAndThrow();
    }
}
