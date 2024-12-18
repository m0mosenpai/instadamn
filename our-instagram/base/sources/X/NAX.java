package X;

import android.content.Context;
import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class NAX extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new IgdsButton(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        EnumC99714dp enumC99714dp;
        EnumC99704do enumC99704do;
        EnumC99704do enumC99704do2;
        IgdsButton igdsButton = (IgdsButton) view;
        AbstractC167007dF.A1K(igdsButton, c6fg);
        C14360o3.A0B(c102884kP, 2);
        if (C14360o3.A0K(c102884kP.A0F(), "large")) {
            enumC99714dp = EnumC99714dp.A03;
        } else {
            enumC99714dp = EnumC99714dp.A04;
        }
        igdsButton.setSize(enumC99714dp);
        igdsButton.setText(c102884kP.A0J());
        String A0H = c102884kP.A0H();
        if (A0H != null) {
            switch (A0H.hashCode()) {
                case -1170620443:
                    if (A0H.equals("secondary_link")) {
                        enumC99704do2 = EnumC99704do.A07;
                        igdsButton.setStyle(enumC99704do2);
                        break;
                    }
                    break;
                case -1114452969:
                    if (A0H.equals("primary_link")) {
                        enumC99704do2 = EnumC99704do.A04;
                        igdsButton.setStyle(enumC99704do2);
                        break;
                    }
                    break;
                case -817598092:
                    if (A0H.equals("secondary")) {
                        enumC99704do = EnumC99704do.A06;
                        igdsButton.setStyle(enumC99704do);
                        igdsButton.setLoading(c102884kP.A0U(false));
                        break;
                    }
                    break;
                case -314765822:
                    if (A0H.equals("primary")) {
                        enumC99704do = EnumC99704do.A03;
                        igdsButton.setStyle(enumC99704do);
                        igdsButton.setLoading(c102884kP.A0U(false));
                        break;
                    }
                    break;
            }
        }
        igdsButton.setEnabled(!c102884kP.A0S(36, false));
        igdsButton.setActive(c102884kP.A0S(35, false));
        InterfaceC103384lE A0B = c102884kP.A0B(44);
        if (A0B != null) {
            C0fQ.A00(new ViewOnClickListenerC28665ClD(2, c6fg, c102884kP, A0B), igdsButton);
            return null;
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        IgdsButton igdsButton = (IgdsButton) view;
        C14360o3.A0B(igdsButton, 0);
        igdsButton.setOnClickListener(null);
        igdsButton.A04 = null;
        igdsButton.setActive(false);
        igdsButton.setStyle(EnumC99704do.A03);
        igdsButton.setLoading(false);
        igdsButton.setEnabled(true);
        igdsButton.setSize(EnumC99714dp.A04);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public NAX(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
