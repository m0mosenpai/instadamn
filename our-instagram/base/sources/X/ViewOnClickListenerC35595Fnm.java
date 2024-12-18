package X;

import android.content.Context;
import android.view.View;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fnm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35595Fnm implements View.OnClickListener {
    public final /* synthetic */ C36373G2z A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public ViewOnClickListenerC35595Fnm(C36373G2z c36373G2z, List list, boolean z, boolean z2) {
        this.A02 = z;
        this.A00 = c36373G2z;
        this.A01 = list;
        this.A03 = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(722458856);
        if (!this.A02) {
            C193328hC A0I = AbstractC31171DnF.A0I(this.A00.A00);
            A0I.A0A(2131958820);
            A0I.A09(2131958818);
            A0I.A07();
            AbstractC31178DnM.A1R(A0I, true);
        } else {
            Iterator it = this.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!((User) next).A1Z()) {
                    if (next != null) {
                        C36373G2z c36373G2z = this.A00;
                        Context context = c36373G2z.A00;
                        C50168MDv c50168MDv = new C50168MDv(28, c36373G2z, this.A03);
                        C193328hC A0I2 = AbstractC31171DnF.A0I(context);
                        A0I2.A0A(2131958945);
                        A0I2.A09(2131958944);
                        DialogInterfaceOnClickListenerC35452Fk9.A02(A0I2, c50168MDv, 60, 2131956794);
                        A0I2.A06();
                        AbstractC31178DnM.A1R(A0I2, true);
                    }
                }
            }
            C36373G2z c36373G2z2 = this.A00;
            FUC.A00(c36373G2z2.A01, c36373G2z2.A02, c36373G2z2.A03, c36373G2z2.A04, this.A03);
        }
        C0f9.A0C(-558180362, A05);
    }
}
