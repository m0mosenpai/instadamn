package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes7.dex */
public abstract class I8A {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(5)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "one_click_checkout";
                    break;
                case 2:
                    str2 = "shopping_bag";
                    break;
                case 3:
                    str2 = "view_in_cart";
                    break;
                case 4:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str2 = "external_link";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return C05F.A00;
    }
}
