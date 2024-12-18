package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ijm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42017Ijm implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    public ViewOnClickListenerC42017Ijm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i) {
        this.A00 = i;
        this.A07 = obj;
        this.A06 = obj2;
        this.A05 = obj4;
        this.A01 = obj5;
        this.A03 = obj3;
        this.A02 = obj9;
        this.A04 = obj10;
        this.A08 = obj7;
        this.A09 = obj8;
        this.A0A = obj6;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String Anq;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1277097328);
                C35141Fei c35141Fei = C35141Fei.A00;
                Context context = (Context) this.A03;
                UserSession userSession = (UserSession) this.A0A;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                C32107E9f c32107E9f = (C32107E9f) this.A06;
                E70 e70 = (E70) this.A08;
                c35141Fei.A01(context, fragmentActivity, (AbstractC018607g) this.A05, (InterfaceC11380iw) this.A02, (C18920wW) this.A09, userSession, (C31539DtP) this.A04, e70, c32107E9f, (InterfaceC37213GaO) this.A07);
                i = 930120343;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-372956992);
                Context context2 = (Context) this.A07;
                Drawable drawable = (Drawable) this.A06;
                InterfaceC106354qp interfaceC106354qp = (InterfaceC106354qp) this.A05;
                C38621GyO c38621GyO = (C38621GyO) this.A01;
                JI9 ji9 = (JI9) this.A03;
                C64452w4 c64452w4 = (C64452w4) this.A02;
                Integer num = (Integer) this.A04;
                C38321qM c38321qM = (C38321qM) this.A08;
                C41759Iea.A02(context2, drawable, ji9, interfaceC106354qp, c38621GyO, c38321qM, c64452w4, num);
                C75113Zb c75113Zb = (C75113Zb) this.A09;
                ((C65192xH) c64452w4.A02.getAdapter()).A09();
                ji9.ClL(interfaceC106354qp.Anq());
                C41759Iea.A04((UserSession) this.A0A, c38321qM, c75113Zb, num, interfaceC106354qp.Anq());
                i = 115820976;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(815268304);
                Context context3 = (Context) this.A07;
                Drawable drawable2 = (Drawable) this.A06;
                InterfaceC106354qp interfaceC106354qp2 = (InterfaceC106354qp) this.A05;
                C38621GyO c38621GyO2 = (C38621GyO) this.A01;
                JI9 ji92 = (JI9) this.A03;
                C64452w4 c64452w42 = (C64452w4) this.A02;
                Integer num2 = (Integer) this.A04;
                C38321qM c38321qM2 = (C38321qM) this.A08;
                C41759Iea.A02(context3, drawable2, ji92, interfaceC106354qp2, c38621GyO2, c38321qM2, c64452w42, num2);
                C75113Zb c75113Zb2 = (C75113Zb) this.A09;
                ((C65192xH) c64452w42.A02.getAdapter()).A09();
                if (interfaceC106354qp2 != null && (Anq = interfaceC106354qp2.Anq()) != null) {
                    ji92.ClL(Anq);
                    C41759Iea.A04((UserSession) this.A0A, c38321qM2, c75113Zb2, num2, interfaceC106354qp2.Anq());
                    i = -1057409015;
                    C0f9.A0C(i, A05);
                    return;
                }
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0C(-1322698587, A05);
                throw A0g;
        }
    }
}
