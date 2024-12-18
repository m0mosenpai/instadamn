package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.Ex6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33842Ex6 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserMonetizationProductType userMonetizationProductType;
        Object A01 = c6fw.A01();
        String A0f = AbstractC31171DnF.A0f(A01);
        String str = (String) A01;
        EnumC53244Ngh enumC53244Ngh = (EnumC53244Ngh) EnumC53244Ngh.A01.get(str);
        if (enumC53244Ngh != null) {
            String A0Z = AbstractC31175DnJ.A0Z(c6fw, A0f);
            List list = c6fw.A00;
            String A0s = AbstractC31173DnH.A0s(list, 2);
            String A0l = AbstractC31180DnO.A0l(list);
            switch (enumC53244Ngh.ordinal()) {
                case 0:
                    userMonetizationProductType = UserMonetizationProductType.A0D;
                    break;
                case 1:
                case 2:
                    userMonetizationProductType = UserMonetizationProductType.A0J;
                    break;
                case 3:
                    userMonetizationProductType = UserMonetizationProductType.A04;
                    break;
                case 4:
                case 5:
                    userMonetizationProductType = UserMonetizationProductType.A0E;
                    break;
                case 6:
                    userMonetizationProductType = UserMonetizationProductType.A0C;
                    break;
                case 7:
                    userMonetizationProductType = UserMonetizationProductType.A08;
                    break;
                case 8:
                    userMonetizationProductType = UserMonetizationProductType.A07;
                    break;
                case 9:
                case 10:
                    userMonetizationProductType = UserMonetizationProductType.A0G;
                    break;
                case 11:
                    userMonetizationProductType = UserMonetizationProductType.A0A;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    userMonetizationProductType = UserMonetizationProductType.A0F;
                    break;
                default:
                    throw B4Z.A00();
            }
            EnumC33407Epe A00 = AbstractC34279F9z.A00(A0Z);
            return AbstractC31180DnO.A0X(AbstractC53973Ntk.A00(userMonetizationProductType, A00, A0s, A0l), AbstractC25225BEi.A0r(C6BQ.A04(c6fq), AbstractC31175DnJ.A0J(c6fq)));
        }
        throw AbstractC167007dF.A0c(AbstractC111324zv.A00(95), str);
    }
}
