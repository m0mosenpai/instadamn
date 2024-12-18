package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W2k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70088W2k {
    public final UserSession A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C70088W2k(XCI xci, UserSession userSession, Integer num, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A00 = userSession;
        String str3 = userSession.userId;
        this.A03 = AnonymousClass001.A0R("STORY_GRID", str3);
        this.A01 = C05F.A0Y;
        this.A02 = AbstractC13670mt.A06("{\"count\":%d,\"cursor\":%s,\"timeframe\":\"%s\",\"searchBase\":\"%s\",\"promoteEligibility\":\"%s\",\"trackingCondition\":\"%s\",\"is_user\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}", 15, str != null ? AnonymousClass001.A0E(str, '\"', '\"') : null, AbstractC69889VxG.A01(num), "USER", str2, "CREATED_BEFORE_TRACKING_INCLUDED", true, str3);
        arrayList.add(xci);
    }

    public C70088W2k(XCI xci, UserSession userSession, Integer num, Integer num2, String str, String str2) {
        String str3;
        Object[] objArr;
        String str4;
        String str5;
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A00 = userSession;
        String str6 = userSession.userId;
        this.A03 = AnonymousClass001.A0R("POST_GRID", str6);
        this.A01 = C05F.A0N;
        if (str2 == null) {
            if (str != null) {
                str5 = AnonymousClass001.A0E(str, '\"', '\"');
            } else {
                str5 = null;
            }
            objArr = new Object[]{360, 15, str5, "CREATION_TIME", VRH.A00(num), AbstractC69889VxG.A01(num2), "USER", "CREATED_BEFORE_TRACKING_INCLUDED", true, str6};
            str4 = "{\"IgInsightsGridMediaImage_SIZE\":%d,\"count\":%d,\"cursor\":%s,\"dataOrdering\":\"%s\",\"postType\":\"%s\",\"timeframe\":\"%s\",\"search_base\":\"%s\",\"trackingCondition\":\"%s\",\"is_user\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}";
        } else {
            if (str != null) {
                str3 = AnonymousClass001.A0E(str, '\"', '\"');
            } else {
                str3 = null;
            }
            objArr = new Object[]{360, 15, str3, "CREATION_TIME", VRH.A00(num), AbstractC69889VxG.A01(num2), "USER", str2, "CREATED_BEFORE_TRACKING_INCLUDED", true, str6};
            str4 = "{\"IgInsightsGridMediaImage_SIZE\":%d,\"count\":%d,\"cursor\":%s,\"dataOrdering\":\"%s\",\"postType\":\"%s\",\"timeframe\":\"%s\",\"search_base\":\"%s\",\"promoteEligibility\":\"%s\",\"trackingCondition\":\"%s\",\"is_user\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}";
        }
        this.A02 = AbstractC13670mt.A06(str4, objArr);
        arrayList.add(xci);
    }
}
