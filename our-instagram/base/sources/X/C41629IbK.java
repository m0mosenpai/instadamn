package X;

import android.os.Parcelable;
import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.api.schemas.BusinessProfileDictImpl;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.user.model.User;

/* renamed from: X.IbK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41629IbK {
    public static final EnumC209229Ne A02;
    public static final EnumC209229Ne A03;
    public static final int[] A04;
    public static final int[] A05;
    public SMBSupportStickerDict A00;
    public boolean A01;

    public C41629IbK(User user, Integer num, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.A00 = new SMBSupportStickerDict(new BusinessProfileDictImpl(user.Bhu(), user.getId(), user.getUsername()), AbstractC81793ku.A00(AbstractC40773I5b.A00(num)), Float.valueOf(i3), str, AbstractC13950nL.A0F(i), null, null, null, AbstractC13950nL.A0F(i2), str2, null, AbstractC13950nL.A0F(i4), AbstractC13950nL.A0G(i5), str3, AbstractC13950nL.A0F(i6));
        this.A01 = z;
    }

    static {
        Object obj = A4H.A01.get(0);
        C14360o3.A07(obj);
        EnumC209229Ne enumC209229Ne = (EnumC209229Ne) obj;
        A02 = enumC209229Ne;
        A04 = AbstractC209259Nh.A02(enumC209229Ne);
        EnumC209229Ne enumC209229Ne2 = EnumC209229Ne.A0O;
        A03 = enumC209229Ne2;
        A05 = AbstractC209259Nh.A02(enumC209229Ne2);
    }

    public final User A00() {
        BusinessProfileDict businessProfileDict = this.A00.A00;
        if (businessProfileDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User user = new User(businessProfileDict.getId(), businessProfileDict.getUsername());
            user.A0i(businessProfileDict.Bhu());
            return user;
        }
        return null;
    }

    public final Integer A01() {
        SMBPartnerType sMBPartnerType = this.A00.A01;
        if (sMBPartnerType != null) {
            String str = sMBPartnerType.A00;
            C14360o3.A0B(str, 0);
            Integer num = C05F.A00;
            if (!str.equals("gift_card")) {
                num = C05F.A01;
                if (!str.equals("food_delivery")) {
                    num = C05F.A0C;
                    if (!str.equals("get_quote")) {
                        return null;
                    }
                }
            }
            return num;
        }
        return null;
    }
}
