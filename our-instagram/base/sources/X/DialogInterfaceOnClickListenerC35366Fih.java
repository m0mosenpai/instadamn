package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fih, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35366Fih implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ FragmentActivity A03;
    public final /* synthetic */ FK8 A04;
    public final /* synthetic */ UserSession A05;

    public DialogInterfaceOnClickListenerC35366Fih(FragmentActivity fragmentActivity, FK8 fk8, UserSession userSession, int i, int i2, int i3) {
        this.A05 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = fk8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A05;
        FragmentActivity fragmentActivity = this.A03;
        C08790ch A00 = AbstractC018607g.A00(fragmentActivity);
        int i2 = this.A02;
        int i3 = this.A01;
        int i4 = this.A00;
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        A0C.A9s("day", AbstractC31181DnP.A0G(A0C, "age_platform/age_verification/start/", i2, i3, i4));
        A0C.A9s("product_surface", String.valueOf(1));
        C1GJ.A00(fragmentActivity, A00, AbstractC31178DnM.A0J(A0C, C40781ul.class, C55702hA.class));
        FK8 fk8 = this.A04;
        InterfaceC103384lE interfaceC103384lE = fk8.A02;
        C131845xK.A00(fk8.A00, fk8.A01, interfaceC103384lE);
    }
}
