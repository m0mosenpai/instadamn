package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Fo9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35618Fo9 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public ViewOnClickListenerC35618Fo9(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A00 = i2;
        this.A04 = obj3;
        this.A05 = str;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(620411045);
                C31972E3a c31972E3a = (C31972E3a) this.A03;
                c31972E3a.A00.setEnabled(false);
                ((C35210Fg2) this.A02).A04(c31972E3a, (C34710FQv) this.A04, this.A01);
                i = 1701396839;
                break;
            case 1:
                A05 = C0f9.A05(-2009707771);
                C31972E3a c31972E3a2 = (C31972E3a) this.A03;
                c31972E3a2.A02.setEnabled(false);
                ((C35210Fg2) this.A02).A04(c31972E3a2, (C34710FQv) this.A04, this.A01);
                i = 1943473480;
                break;
            case 2:
                A05 = C0f9.A05(-951456063);
                InterfaceC37216GaR interfaceC37216GaR = (InterfaceC37216GaR) this.A02;
                Integer AvK = interfaceC37216GaR.AvK(AbstractC31171DnF.A0g(this.A04));
                C47P c47p = (C47P) this.A03;
                if (AvK != null) {
                    i2 = AvK.intValue();
                } else {
                    i2 = this.A01;
                }
                interfaceC37216GaR.DAw(c47p, this.A05, i2);
                i = 25095678;
                break;
            case 3:
                A05 = C0f9.A05(76085466);
                AbstractC27401Ut.getInstance();
                C64501TGn A01 = new C64501TGn((AbstractC12990ll) this.A04).A01(this.A05);
                Context context = (Context) this.A02;
                A01.A07 = context.getResources().getString(this.A01);
                A01.A00((Bundle) this.A03);
                A01.A08 = true;
                A01.A02(context);
                i = 1605113420;
                break;
            default:
                A05 = C0f9.A05(1330732209);
                ((InterfaceC37182GZt) this.A02).DDE(AbstractC166997dE.A0L(((FOZ) this.A03).A01), (User) this.A04, this.A05, this.A01);
                i = 1693703445;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
