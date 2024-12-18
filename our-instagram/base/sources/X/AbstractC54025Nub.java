package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.Nub, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54025Nub {
    public static final C193328hC A00(Context context, OEQ oeq) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(oeq.A01);
        CharSequence charSequence = oeq.A06;
        if (charSequence != null && charSequence.length() != 0) {
            A0I.A0r(charSequence);
        } else {
            A0I.A09(oeq.A00);
        }
        Boolean bool = oeq.A05;
        if (bool != null) {
            A0I.A0t(bool.booleanValue());
        }
        OAI oai = oeq.A04;
        if (oai != null) {
            EnumC193348hE enumC193348hE = oai.A02;
            int i = oai.A00;
            DialogInterface.OnClickListener onClickListener = oai.A01;
            if (enumC193348hE != null) {
                A0I.A0R(onClickListener, enumC193348hE, i);
            } else {
                A0I.A0J(onClickListener, i);
            }
        }
        OAI oai2 = oeq.A02;
        if (oai2 != null) {
            EnumC193348hE enumC193348hE2 = oai2.A02;
            int i2 = oai2.A00;
            DialogInterface.OnClickListener onClickListener2 = oai2.A01;
            if (enumC193348hE2 != null) {
                A0I.A0P(onClickListener2, enumC193348hE2, i2);
            } else {
                A0I.A0H(onClickListener2, i2);
            }
        }
        OAI oai3 = oeq.A03;
        if (oai3 != null) {
            EnumC193348hE enumC193348hE3 = oai3.A02;
            int i3 = oai3.A00;
            DialogInterface.OnClickListener onClickListener3 = oai3.A01;
            if (enumC193348hE3 != null) {
                A0I.A0Q(onClickListener3, enumC193348hE3, i3);
            } else {
                A0I.A0I(onClickListener3, i3);
                return A0I;
            }
        }
        return A0I;
    }
}
