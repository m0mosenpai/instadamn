package X;

import android.content.DialogInterface;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fi8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35331Fi8 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public DialogInterfaceOnClickListenerC35331Fi8(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                FO9 fo9 = (FO9) this.A01;
                int i2 = !this.A02 ? 1 : 0;
                C28261Yl c28261Yl = C28261Yl.A00;
                UserSession userSession = fo9.A02;
                c28261Yl.A01(fo9.A00, fo9.A01, userSession, fo9.A03, fo9.A04, fo9.A05, fo9.A06, i2);
                return;
            case 1:
                boolean z = true;
                if (!this.A02 || AbstractC40751ui.A00(((C33229ElM) this.A01).A00).A03(CallerContext.A01(C33229ElM.__redex_internal_original_name), "ig_native_linking_cache_logout_linked_accounts", "INSTAGRAM").size() <= 1) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                C33229ElM c33229ElM = (C33229ElM) this.A01;
                C83743oJ A01 = C83743oJ.A01(c33229ElM.A00);
                UserSession userSession2 = c33229ElM.A00;
                A01.A0A(c33229ElM, userSession2, C05F.A0N, userSession2.userId);
                if (valueOf.booleanValue()) {
                    FBG.A00(c33229ElM.getContext(), c33229ElM, c33229ElM.A00, false, true, true, false);
                }
                C33229ElM.A01(c33229ElM);
                return;
            default:
                C35272Fh7 c35272Fh7 = (C35272Fh7) this.A01;
                AbstractC35076Fcn.A00(c35272Fh7.A03, c35272Fh7.A04, "logout_d2_logout_tapped");
                c35272Fh7.A0D(EnumC33353Eom.A05, this.A02);
                return;
        }
    }
}
