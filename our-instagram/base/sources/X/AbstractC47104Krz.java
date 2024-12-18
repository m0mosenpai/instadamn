package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Krz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47104Krz {
    public static final Long A00(ImageUrl imageUrl) {
        String str;
        C117315Sq A06 = new C11L("oe=[0-9A-Za-z]+").A06(AbstractC43592JPx.A0w(imageUrl), 0);
        if (A06 != null) {
            String group = A06.A01.group();
            C14360o3.A07(group);
            str = AbstractC002300n.A0d(group, "oe=", "", false);
        } else {
            str = "";
        }
        return AbstractC003100w.A0k(16, str);
    }
}
