package X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6sX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151876sX {
    public static String A00(AbstractC115105If abstractC115105If) {
        Throwable A01;
        InterfaceC65563Tmj interfaceC65563Tmj;
        if (abstractC115105If != null && (A01 = abstractC115105If.A01()) != null && (A01 instanceof VI9)) {
            ImmutableList immutableList = ((VI9) A01).A00;
            if (immutableList != null) {
                interfaceC65563Tmj = (InterfaceC65563Tmj) AbstractC001800i.A0J(immutableList);
            } else {
                interfaceC65563Tmj = null;
            }
            interfaceC65563Tmj.getClass();
            return interfaceC65563Tmj.getDescription();
        }
        return null;
    }

    public static String A01(AbstractC115105If abstractC115105If) {
        if (abstractC115105If instanceof C115115Ig) {
            return ((InterfaceC40821up) abstractC115105If.A00()).getErrorType();
        }
        return null;
    }

    public static String A02(AbstractC115105If abstractC115105If) {
        if (abstractC115105If instanceof C115115Ig) {
            InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
            if (!TextUtils.isEmpty(interfaceC40821up.getErrorMessage())) {
                return interfaceC40821up.getErrorMessage();
            }
        }
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null && !TextUtils.isEmpty(A01.getMessage())) {
            return A01.getMessage();
        }
        return "";
    }

    public static String A03(AbstractC115105If abstractC115105If, String str) {
        String str2;
        Throwable A01;
        ImmutableList immutableList;
        InterfaceC65563Tmj interfaceC65563Tmj;
        if (abstractC115105If != null && (A01 = abstractC115105If.A01()) != null && (A01 instanceof VI9) && (immutableList = ((VI9) A01).A00) != null && (interfaceC65563Tmj = (InterfaceC65563Tmj) AbstractC001800i.A0J(immutableList)) != null) {
            str2 = interfaceC65563Tmj.getDescription();
        } else {
            str2 = str;
        }
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            return str2;
        }
        return str;
    }

    public static String A04(AbstractC115105If abstractC115105If, String str) {
        if (abstractC115105If instanceof C115115Ig) {
            InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
            if (!TextUtils.isEmpty(interfaceC40821up.getErrorMessage())) {
                return interfaceC40821up.getErrorMessage();
            }
            return str;
        }
        return str;
    }

    public static boolean A05(AbstractC12990ll abstractC12990ll) {
        if (AbstractC08690cX.A00(abstractC12990ll) != null && AbstractC08690cX.A00(abstractC12990ll).A0I() == EnumC222416a.A05) {
            return true;
        }
        return false;
    }

    public static boolean A06(AbstractC12990ll abstractC12990ll) {
        if (AbstractC08690cX.A00(abstractC12990ll) != null && AbstractC08690cX.A00(abstractC12990ll).A0I() == EnumC222416a.A06) {
            return true;
        }
        return false;
    }

    public static boolean A07(AbstractC12990ll abstractC12990ll) {
        if (!A05(abstractC12990ll) && !A06(abstractC12990ll)) {
            return false;
        }
        return true;
    }
}
