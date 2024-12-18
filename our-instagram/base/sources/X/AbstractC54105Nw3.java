package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.Nw3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54105Nw3 {
    public static final C54993OUc A00(UserSession userSession, String str, String str2, String str3, int i, boolean z) {
        EnumC53327Ni6 enumC53327Ni6;
        C14360o3.A0B(str, 0);
        AbstractC167007dF.A1F(str2, 1, str3);
        C14360o3.A0B(userSession, 6);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        LinkedHashMap A1I2 = AbstractC166987dD.A1I();
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36609287619680126L);
        if (A07 == 0) {
            A07 = C55187Ods.A00(i);
        }
        EnumC40111tc enumC40111tc = EnumC40111tc.A0Q;
        A1I2.put("image_compression", C55230Of1.A07(userSession, null, null, AbstractC13570mj.A00(str3), 0, 0, A07));
        A1I2.put("upload_id", str);
        A1I2.put("media_type", String.valueOf(enumC40111tc.A00));
        A1I.put("X-Auth-Type", "instagram");
        A1I.put("X_FB_PHOTO_WATERFALL_ID", C6WI.A02());
        int i2 = 0;
        EnumC53327Ni6[] enumC53327Ni6Arr = (EnumC53327Ni6[]) EnumC53327Ni6.A02.toArray(new EnumC53327Ni6[0]);
        int length = enumC53327Ni6Arr.length;
        while (true) {
            if (i2 < length) {
                enumC53327Ni6 = enumC53327Ni6Arr[i2];
                if (C14360o3.A0K(enumC53327Ni6.A01, str2)) {
                    break;
                }
                i2++;
            } else {
                enumC53327Ni6 = EnumC53327Ni6.A0L;
                break;
            }
        }
        C55086Oai c55086Oai = new C55086Oai(enumC53327Ni6);
        c55086Oai.A07 = A1I;
        c55086Oai.A02(new W2I(2));
        c55086Oai.A01(new W2H(1024, z));
        c55086Oai.A06 = "rupload.facebook.com";
        c55086Oai.A09 = true;
        return new C54993OUc(c55086Oai);
    }
}
