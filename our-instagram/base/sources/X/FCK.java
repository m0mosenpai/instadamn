package X;

/* loaded from: classes6.dex */
public abstract class FCK {
    public static final Integer A00(String str) {
        String str2;
        if (str != null) {
            for (Integer num : C05F.A00(8)) {
                switch (num.intValue()) {
                    case 1:
                        str2 = AbstractC111324zv.A00(5117);
                        break;
                    case 2:
                        str2 = "edit_profile";
                        break;
                    case 3:
                        str2 = "personal_information";
                        break;
                    case 4:
                        str2 = "profile_qp";
                        break;
                    case 5:
                        str2 = "nux";
                        break;
                    case 6:
                        str2 = AbstractC111324zv.A00(4853);
                        break;
                    case 7:
                        str2 = "2fa_sms";
                        break;
                    default:
                        str2 = AbstractC111324zv.A00(2307);
                        break;
                }
                if (str.equalsIgnoreCase(str2)) {
                    return num;
                }
            }
        }
        return null;
    }
}
