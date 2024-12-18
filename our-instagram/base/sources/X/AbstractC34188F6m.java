package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.F6m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34188F6m {
    public static final void A00(Context context, UserSession userSession, GZ2 gz2, C3o9 c3o9, Integer num) {
        C81663kb c81663kb;
        AbstractC34928FaE c32876EdI;
        C09530e4 A1L;
        C14360o3.A0B(c3o9, 2);
        boolean z = c3o9 instanceof MsysThreadId;
        if (!z) {
            switch (num.intValue()) {
                case 0:
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case 14:
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                default:
                    gz2.D9X();
                    return;
            }
        }
        if (JRE.A0A(c3o9)) {
            c81663kb = AbstractC28761aE.A00(userSession).B3U(JRE.A01(c3o9));
        } else {
            c81663kb = null;
        }
        if (z) {
            c32876EdI = new AbstractC34928FaE(context);
        } else {
            if (c81663kb != null) {
                if (c81663kb.C7g() == 29) {
                    c32876EdI = new C32877EdJ(context, userSession, c81663kb);
                } else if (c81663kb.C7g() == 32 || c81663kb.C7g() == 62) {
                    c32876EdI = new AbstractC34928FaE(context);
                }
            }
            c32876EdI = new C32876EdI(context, num);
        }
        if (c32876EdI instanceof C32876EdI) {
            C32876EdI c32876EdI2 = (C32876EdI) c32876EdI;
            int intValue = c32876EdI2.A00.intValue();
            if (intValue != 1 && intValue != 7 && intValue != 13 && intValue != 9) {
                Context context2 = ((AbstractC34928FaE) c32876EdI2).A00;
                A1L = AbstractC166987dD.A1L(AbstractC34928FaE.A00(context2, 2131960603), AbstractC34928FaE.A00(context2, 2131960604));
            } else {
                String quantityString = ((AbstractC34928FaE) c32876EdI2).A00.getResources().getQuantityString(R.plurals.direct_permissions_choice_delete_x_chats, 1);
                C14360o3.A0A(quantityString);
                A1L = AbstractC166987dD.A1L(quantityString, null);
            }
        } else if (c32876EdI instanceof C32875EdH) {
            Context context3 = c32876EdI.A00;
            A1L = AbstractC166987dD.A1L(AbstractC34928FaE.A00(context3, 2131960602), AbstractC34928FaE.A00(context3, 2131960604));
        } else if (c32876EdI instanceof C32874EdG) {
            Context context4 = c32876EdI.A00;
            A1L = AbstractC166987dD.A1L(AbstractC34928FaE.A00(context4, 2131959955), AbstractC34928FaE.A00(context4, 2131959954));
        } else {
            C32877EdJ c32877EdJ = (C32877EdJ) c32876EdI;
            int i = 2131960602;
            int i2 = 2131972194;
            C2EC c2ec = c32877EdJ.A01;
            C81543kP A0g = AbstractC31172DnG.A0g(c2ec);
            List list = null;
            if (A0g != null) {
                list = A0g.A0D;
            }
            UserSession userSession2 = c32877EdJ.A00;
            if (userSession2.userId.equals(c2ec.Asv())) {
                i = 2131957649;
                i2 = 2131957648;
            } else if (list != null && list.contains(userSession2.userId)) {
                i2 = 2131972188;
            }
            Context context5 = ((AbstractC34928FaE) c32877EdJ).A00;
            A1L = AbstractC166987dD.A1L(AbstractC34928FaE.A00(context5, i), AbstractC34928FaE.A00(context5, i2));
        }
        String str = (String) A1L.A00;
        String str2 = (String) A1L.A01;
        DialogInterfaceOnClickListenerC35453FkA A00 = DialogInterfaceOnClickListenerC35453FkA.A00(gz2, 3);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A05 = str;
        A0I.A0G(A00);
        DialogInterfaceOnClickListenerC35453FkA.A01(A0I, gz2, 2);
        AbstractC31175DnJ.A1O(A0I);
        if (str2 != null) {
            A0I.A0r(str2);
        }
        AbstractC166987dD.A1W(A0I);
    }
}
