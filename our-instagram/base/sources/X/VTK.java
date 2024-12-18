package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VTK {
    public static void A00(Context context, DialogInterface.OnClickListener onClickListener, UserSession userSession, GXl gXl, Integer num) {
        String text;
        String text2;
        String BGC;
        if (context != null) {
            C193328hC c193328hC = new C193328hC(context);
            int intValue = num.intValue();
            if (intValue != 3) {
                if (intValue != 4) {
                    XIT A05 = AbstractC70201WGq.A05();
                    if (A05.C8p() != null && !AbstractC126965oa.A03(A05.C8p().getText())) {
                        text = A05.C8p().getText();
                    } else {
                        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
                    }
                } else {
                    XIR A02 = AbstractC70201WGq.A02();
                    if (A02.C8n() != null && !AbstractC126965oa.A03(A02.C8n().getText())) {
                        text = A02.C8n().getText();
                    } else {
                        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
                    }
                }
            } else {
                XIS A04 = AbstractC70201WGq.A04();
                if (A04.C8o() != null && !AbstractC126965oa.A03(A04.C8o().getText())) {
                    text = A04.C8o().getText();
                } else {
                    throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
                }
            }
            c193328hC.A05 = text;
            if (intValue != 3) {
                if (intValue != 4) {
                    XIT A052 = AbstractC70201WGq.A05();
                    if (A052.Ago() != null && !AbstractC126965oa.A03(A052.Ago().getText())) {
                        text2 = A052.Ago().getText();
                    } else {
                        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
                    }
                } else {
                    XIR A022 = AbstractC70201WGq.A02();
                    if (A022.Agl() != null && !AbstractC126965oa.A03(A022.Agl().getText())) {
                        text2 = A022.Agl().getText();
                    } else {
                        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
                    }
                }
            } else {
                XIS A042 = AbstractC70201WGq.A04();
                if (A042.Agn() != null && !AbstractC126965oa.A03(A042.Agn().getText())) {
                    text2 = A042.Agn().getText();
                } else {
                    throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
                }
            }
            c193328hC.A0r(text2);
            if (intValue != 3) {
                XK0 A01 = AbstractC70201WGq.A01();
                if (intValue != 4) {
                    if (!AbstractC126965oa.A03(A01.BmR())) {
                        BGC = A01.BmR();
                    } else {
                        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
                    }
                } else if (A01.BW8() != null) {
                    BGC = A01.BW8();
                } else {
                    throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
                }
            } else {
                XK0 A012 = AbstractC70201WGq.A01();
                if (A012.BGC() != null) {
                    BGC = A012.BGC();
                } else {
                    throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
                }
            }
            c193328hC.A0Z(new DialogInterfaceOnClickListenerC35450Fk7(16, gXl, userSession, num), EnumC193348hE.A03, BGC, true);
            XK0 A013 = AbstractC70201WGq.A01();
            if (!AbstractC126965oa.A03(A013.BmQ())) {
                c193328hC.A0c(new DialogInterfaceOnClickListenerC35455FkC(35, num, userSession), A013.BmQ());
                if (context instanceof C2d4) {
                    XK0 A014 = AbstractC70201WGq.A01();
                    if (A014.BmS() != null) {
                        c193328hC.A0b(onClickListener, A014.BmS());
                    } else {
                        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
                    }
                }
                Dialog A023 = c193328hC.A02();
                C35241Fga.A02(FVP.A00(num), userSession, AbstractC111324zv.A00(5210));
                if (num == C05F.A00 || num == C05F.A01) {
                    InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                    ARD.E77("fxim_has_seen_reminder_dialog_on_photo_change", true);
                    ARD.apply();
                }
                if (num == C05F.A0Y) {
                    InterfaceC19610xo ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                    ARD2.E77(AbstractC111324zv.A00(2414), true);
                    ARD2.apply();
                }
                C0fJ.A00(A023);
                return;
            }
            throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
        }
    }
}
