package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.VPx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68415VPx {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        Locale locale = Locale.ROOT;
        String upperCase = ((String) A00).toUpperCase(locale);
        C14360o3.A07(upperCase);
        AdsAPIInstagramPosition A002 = AbstractC68362VNw.A00(upperCase);
        Object A03 = c6fw.A03(1);
        String A003 = AbstractC111324zv.A00(12);
        C14360o3.A0C(A03, A003);
        for (Object obj : (List) A03) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModelBuilder");
            C102884kP c102884kP = (C102884kP) obj;
            c102884kP.A0P();
            c102884kP.A0L(38);
            c102884kP.A0L(36);
            c102884kP.A0L(35);
            c102884kP.A0L(40);
        }
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, A003);
        List list = (List) A032;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (Object obj2 : list) {
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
            C102884kP c102884kP2 = (C102884kP) obj2;
            String A0I = c102884kP2.A0I();
            if (A0I == null) {
                A0I = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            }
            String upperCase2 = A0I.toUpperCase(locale);
            C14360o3.A07(upperCase2);
            A0q.add(new C45126Jxv(EnumHelper.A00(upperCase2, EnumC68192VFk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), c102884kP2.A0E(), c102884kP2.A0F(), c102884kP2.A0G(), 6));
        }
        LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b(A002, new LEI(A002, A0q)));
        A07.get(A002);
        C70170WEm.A00(A04, (LEI) A07.get(A002), userSession);
        return null;
    }
}
