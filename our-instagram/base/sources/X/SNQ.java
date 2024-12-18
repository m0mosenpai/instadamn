package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.JsonReader;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.StringReader;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SNQ {
    public final UserSession A00;

    public final Dialog A00(Context context, C63198Sf0 c63198Sf0) {
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        EnumC193348hE enumC193348hE;
        C14360o3.A0B(context, 0);
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A0s(c63198Sf0.A0F);
        c193328hC.A05 = c63198Sf0.A0E;
        c193328hC.A0r(c63198Sf0.A0B);
        c193328hC.A0t(false);
        Drawable drawable = c63198Sf0.A0A;
        if (drawable != null) {
            c193328hC.A0j(drawable);
        }
        int i = c63198Sf0.A06;
        if (i != 0) {
            c193328hC.A0A(i);
        }
        int i2 = c63198Sf0.A00;
        if (i2 != 0) {
            c193328hC.A09(i2);
        }
        int i3 = c63198Sf0.A05;
        if (i3 != 0) {
            DialogInterface.OnClickListener onClickListener3 = c63198Sf0.A09;
            int i4 = c63198Sf0.A04;
            if (i4 != 0) {
                if (i4 != 1 && i4 == 2) {
                    enumC193348hE = EnumC193348hE.A03;
                } else {
                    enumC193348hE = EnumC193348hE.A04;
                }
            } else {
                enumC193348hE = EnumC193348hE.A06;
            }
            c193328hC.A0R(onClickListener3, enumC193348hE, i3);
        } else {
            String str = c63198Sf0.A0D;
            if (str != null && (onClickListener = c63198Sf0.A09) != null) {
                c193328hC.A0d(onClickListener, str);
            }
        }
        int i5 = c63198Sf0.A02;
        if (i5 != 0) {
            c193328hC.A0P(c63198Sf0.A08, EnumC193348hE.A04, i5);
        }
        int i6 = c63198Sf0.A01;
        if (i6 != 0) {
            c193328hC.A0Q(c63198Sf0.A07, EnumC193348hE.A04, i6);
        } else {
            String str2 = c63198Sf0.A0C;
            if (str2 != null && (onClickListener2 = c63198Sf0.A07) != null) {
                c193328hC.A0c(onClickListener2, str2);
            }
        }
        return c193328hC.A02();
    }

    public SNQ(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(Context context, ViewGroup viewGroup, FragmentActivity fragmentActivity, XGq xGq, Map map) {
        String optionalStringField;
        AbstractC167027dH.A12(context, viewGroup, fragmentActivity);
        C2JS optionalTreeField = ((C2JS) xGq).getOptionalTreeField(0, "bundle", QSM.class, -947389002);
        if (optionalTreeField != null && (optionalStringField = optionalTreeField.getOptionalStringField(0, "bloks_bundle_tree")) != null) {
            C62862tP A04 = C62862tP.A04(fragmentActivity, new C19270xB("BloksScreenConfigHelperFbImpl"), MSW.A0Q(C2FP.A00()));
            C192928gY c192928gY = new C192928gY(new JsonReader(new StringReader(optionalStringField)));
            c192928gY.Csy();
            C192948ga A00 = C192948ga.A00(c192928gY);
            C14360o3.A07(A00);
            C1338462s A03 = C1338462s.A03(null, A00.A00.A00, null);
            C126545np c126545np = new C126545np(context);
            C6T8 A002 = C6T7.A00(context, A03, A04);
            A002.A01 = map;
            A002.A00().A07(c126545np);
            viewGroup.addView(c126545np);
        }
    }
}
