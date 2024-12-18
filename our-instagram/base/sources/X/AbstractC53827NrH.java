package X;

import android.os.Parcelable;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NrH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53827NrH {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        c6fw.A03(0);
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, AbstractC111324zv.A00(12));
        List list = (List) A03;
        boolean A01 = C6DZ.A01(c6fw.A00());
        Object A032 = c6fw.A03(3);
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A032;
        String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 4);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (Object obj : list) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
            AbstractMap abstractMap = (AbstractMap) obj;
            Parcelable.Creator creator = User.CREATOR;
            Object obj2 = abstractMap.get("pk");
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = abstractMap.get(AbstractC31581Du9.A01());
            C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.String");
            User user = new User((String) obj2, (String) obj3);
            Object obj4 = abstractMap.get("profile_pic_url");
            C14360o3.A0C(obj4, "null cannot be cast to non-null type kotlin.String");
            user.A0r((String) obj4);
            A0q.add(new BrandedContentTag(user, MSY.A1X(abstractMap.get(AbstractC58317Pt9.A00(703))), MSY.A1X(abstractMap.get("is_pending"))));
        }
        C140966Yy A00 = FT2.A00(C6BQ.A04(c6fq), C6BQ.A0B(c6fq));
        A00.A0B(null, AbstractC55149OdC.A03(null, AbstractC167007dF.A0h(str), A0o, A0q, false, true, A01, false, false));
        A00.A04();
        return null;
    }
}
