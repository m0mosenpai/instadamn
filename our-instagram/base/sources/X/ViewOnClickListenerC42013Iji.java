package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Iji, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42013Iji implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC63932vE A02;
    public final /* synthetic */ C38497GwI A03;
    public final /* synthetic */ C42666IuN A04;
    public final /* synthetic */ C41232IMx A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public ViewOnClickListenerC42013Iji(Context context, InterfaceC63932vE interfaceC63932vE, C38497GwI c38497GwI, C42666IuN c42666IuN, C41232IMx c41232IMx, Object obj, int i, boolean z, boolean z2) {
        this.A03 = c38497GwI;
        this.A05 = c41232IMx;
        this.A00 = i;
        this.A08 = z;
        this.A01 = context;
        this.A06 = obj;
        this.A04 = c42666IuN;
        this.A02 = interfaceC63932vE;
        this.A07 = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        C41232IMx A01;
        String str;
        Boolean CU1;
        int A05 = C0f9.A05(-1440732857);
        if (AbstractC41752IeR.A00) {
            C38497GwI c38497GwI = this.A03;
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            String str2 = c38497GwI.A01;
            if (str2 == "v2" || str2 == "v3") {
                i = -1780153897;
                C0f9.A0C(i, A05);
            }
        }
        C41232IMx c41232IMx = this.A05;
        InterfaceC09390do interfaceC09390do = c41232IMx.A04;
        C41009IEe c41009IEe = (C41009IEe) AbstractC31171DnF.A0n(interfaceC09390do).get(this.A00);
        c41009IEe.A00 = !c41009IEe.A00;
        InterfaceC43563JLx interfaceC43563JLx = c41009IEe.A01;
        if (interfaceC43563JLx.getId() != null) {
            Boolean CU12 = interfaceC43563JLx.CU1();
            if (CU12 != null && CU12.booleanValue()) {
                if (c41009IEe.A00) {
                    for (C41009IEe c41009IEe2 : AbstractC31171DnF.A0n(interfaceC09390do)) {
                        if (!interfaceC43563JLx.getId().equals(c41009IEe2.A01.getId())) {
                            c41009IEe2.A00 = false;
                        }
                    }
                }
            } else {
                for (C41009IEe c41009IEe3 : AbstractC31171DnF.A0n(interfaceC09390do)) {
                    String id = interfaceC43563JLx.getId();
                    InterfaceC43563JLx interfaceC43563JLx2 = c41009IEe3.A01;
                    if (!id.equals(interfaceC43563JLx2.getId()) && c41009IEe3.A00 && (CU1 = interfaceC43563JLx2.CU1()) != null && CU1.booleanValue()) {
                        c41009IEe3.A00 = false;
                    }
                }
            }
        }
        boolean z = this.A08;
        boolean z2 = true;
        C38497GwI c38497GwI2 = this.A03;
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        String str3 = c38497GwI2.A01;
        boolean equals = str3.equals("v2");
        if (z) {
            if (!equals && !str3.equals("v3")) {
                View A012 = c38497GwI2.A03.A01();
                if (!c41009IEe.A00 && !c41232IMx.A01()) {
                    z2 = false;
                }
                A012.setActivated(z2);
            } else {
                IgdsButton igdsButton = c38497GwI2.A06;
                if (!c41009IEe.A00 && !c41232IMx.A01()) {
                    z2 = false;
                }
                igdsButton.setEnabled(z2);
            }
            AbstractC41752IeR.A02(this.A01, this.A02, c38497GwI2, this.A04, c41232IMx, this.A06, this.A07);
        } else {
            if (equals || str3.equals("v3")) {
                AbstractC41752IeR.A02(this.A01, this.A02, c38497GwI2, this.A04, c41232IMx, this.A06, this.A07);
            }
            InterfaceC63932vE interfaceC63932vE = this.A02;
            Object obj = this.A06;
            C42666IuN c42666IuN = this.A04;
            interfaceC63932vE.DHF(obj, c42666IuN);
            if (!c41232IMx.A01 && (obj instanceof C41222IMn)) {
                C41222IMn c41222IMn = (C41222IMn) obj;
                if (c42666IuN.A00 < c41222IMn.A00() - 1) {
                    int A00 = AbstractC41752IeR.A00(c41222IMn, c41009IEe, c42666IuN.A00 + 1);
                    if (A00 != c42666IuN.A00) {
                        c42666IuN.A00 = A00;
                        for (C38526Gwm c38526Gwm : c42666IuN.A03) {
                            C41222IMn c41222IMn2 = c38526Gwm.A01;
                            if (c41222IMn2 != null && (A01 = c41222IMn2.A01(c42666IuN.A00)) != null && (str = A01.A03.A07) != null) {
                                TextView textView = c38526Gwm.A07;
                                SpannableString spannableString = new SpannableString(str);
                                spannableString.setSpan(new C77373dN(), 0, spannableString.length(), 0);
                                textView.setText(spannableString);
                            }
                        }
                    }
                    AbstractC41752IeR.A02(this.A01, interfaceC63932vE, c38497GwI2, c42666IuN, c41222IMn.A01(A00), obj, this.A07);
                    i = -701079563;
                    C0f9.A0C(i, A05);
                }
            }
            AbstractC41752IeR.A00 = true;
            interfaceC63932vE.DHH(obj, c42666IuN);
        }
        i = 141063994;
        C0f9.A0C(i, A05);
    }
}
