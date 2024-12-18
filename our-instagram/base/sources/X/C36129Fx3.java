package X;

import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.Fx3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36129Fx3 implements InterfaceC41501vz {
    public final /* synthetic */ C32271EJg A00;

    public C36129Fx3(C32271EJg c32271EJg) {
        this.A00 = c32271EJg;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1497918525);
        int A032 = C0f9.A03(1774063858);
        C32271EJg c32271EJg = this.A00;
        AbstractC31179DnN.A0v(c32271EJg);
        c32271EJg.A02.setText(((C36042Fve) obj).A00);
        ProgressButton progressButton = c32271EJg.A0F;
        if (progressButton != null && progressButton.isEnabled()) {
            c32271EJg.A0F.performClick();
        }
        C0f9.A0A(798680621, A032);
        C0f9.A0A(1495039326, A03);
    }
}
