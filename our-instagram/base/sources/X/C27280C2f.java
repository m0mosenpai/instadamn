package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.HashMap;

/* renamed from: X.C2f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27280C2f extends AnonymousClass522 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27280C2f(InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                AbstractC41776Ies.A03(((Fragment) this.A01).requireContext(), "https://help.instagram.com/503708446705527/?helpref=uf_share");
                return;
            case 1:
                HEO heo = (HEO) this.A01;
                AbstractC25225BEi.A0y(heo.A02).A00().A02(heo.A01, new C26702Bqj());
                return;
            case 2:
                HEO heo2 = (HEO) this.A01;
                AbstractC35094Fd5.A02(heo2.A01, C22P.A5S, heo2.A02, null, false, false);
                return;
            case 3:
            case 4:
            default:
                ((InterfaceC16660sJ) this.A01).invoke(C1V.A00);
                return;
            case 5:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 6:
                C26718Bqz c26718Bqz = (C26718Bqz) this.A01;
                C63397SjR A0y = AbstractC25228BEl.A0y(c26718Bqz.requireActivity(), AbstractC166987dD.A0r(c26718Bqz.A01), C2Fb.A2X, "https://help.instagram.com/231764660354188");
                A0y.A0S = "memorialization_info";
                A0y.A0A();
                return;
            case 7:
                C26785Bs9 c26785Bs9 = (C26785Bs9) this.A01;
                Bundle bundle = c26785Bs9.mArguments;
                if (bundle != null) {
                    String string = bundle.getString("action_source");
                    if (string != null) {
                        C18920wW A01 = AbstractC12220kQ.A01(c26785Bs9, AbstractC166987dD.A0o(c26785Bs9.A03));
                        String A00 = MSV.A00(122);
                        String string2 = bundle.getString(A00);
                        HashMap A1G = AbstractC166987dD.A1G();
                        A1G.put("nav_chain", AbstractC25225BEi.A14());
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "instagram_wellbeing_warning_system_let_us_know");
                        A0f.AAP("source_of_action", string);
                        A0f.AAP(A00, string2);
                        A0f.A7v(MSV.A00(104), true);
                        A0f.A9M("extra_values", A1G);
                        A0f.Cht();
                    }
                    C3DN A012 = C3DN.A00.A01(c26785Bs9.getContext());
                    C189478aR A002 = F86.A00(A012);
                    if (AbstractC167007dF.A1Z(c26785Bs9.A02) && A002 != null) {
                        A002.A0T();
                    } else if (A012 != null) {
                        A012.A0B();
                    }
                    C9GR.A09(c26785Bs9.requireContext(), c26785Bs9.getString(2131968938));
                    return;
                }
                throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27280C2f(InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = interfaceC16660sJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27280C2f(HEO heo, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = heo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27280C2f(C26699Bqg c26699Bqg, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = c26699Bqg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27280C2f(C26718Bqz c26718Bqz, int i) {
        super(Integer.valueOf(i));
        this.A00 = 6;
        this.A01 = c26718Bqz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27280C2f(C26785Bs9 c26785Bs9, int i) {
        super(Integer.valueOf(i));
        this.A00 = 7;
        this.A01 = c26785Bs9;
    }
}
