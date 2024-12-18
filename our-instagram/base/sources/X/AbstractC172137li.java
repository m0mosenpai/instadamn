package X;

import android.app.Activity;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.7li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC172137li {
    public static final BrandedContentGatingInfo A00(BrandedContentGatingInfo brandedContentGatingInfo, InterfaceC11380iw interfaceC11380iw, UserSession userSession, BrandedContentTag brandedContentTag, HashMap hashMap) {
        Integer num;
        C14360o3.A0B(userSession, 0);
        if (hashMap == null) {
            return brandedContentGatingInfo;
        }
        String A00 = AbstractC111324zv.A00(4189);
        String str = null;
        if (hashMap.containsKey(A00)) {
            if (brandedContentTag != null) {
                str = brandedContentTag.A01;
            }
            String obj = hashMap.toString();
            C14360o3.A07(obj);
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            InterfaceC02590Ai A002 = A01.A00(A01.A00, "ig_media_country_block_gating_values_selected");
            A002.AAP("gating_rules", obj);
            A002.AAP("source_of_action", interfaceC11380iw.getModuleName());
            A002.AAP("sponsor_id", str);
            A002.Cht();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray((String) hashMap.get(A00));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    C14360o3.A07(string);
                    arrayList.add(string);
                }
                HashMap hashMap2 = brandedContentGatingInfo.A02;
                return AbstractC39781Hkr.A00(brandedContentGatingInfo.A00, brandedContentGatingInfo.A01, brandedContentGatingInfo.A03, arrayList, hashMap2);
            } catch (JSONException unused) {
                throw new IllegalArgumentException("Illegal Json string passed from Bloks");
            }
        }
        if (brandedContentTag != null) {
            str = brandedContentTag.A01;
        }
        String obj2 = hashMap.toString();
        C14360o3.A07(obj2);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A003 = A012.A00(A012.A00, "ig_media_age_geo_gating_values_selected");
        A003.AAP("gating_rules", obj2);
        A003.AAP("source_of_action", interfaceC11380iw.getModuleName());
        A003.AAP("sponsor_id", str);
        A003.Cht();
        String str2 = (String) hashMap.get("default_age");
        HashMap hashMap3 = brandedContentGatingInfo.A02;
        List list = brandedContentGatingInfo.A03;
        List list2 = brandedContentGatingInfo.A04;
        String str3 = brandedContentGatingInfo.A01;
        if (str2 != null && str2.length() != 0) {
            num = Integer.valueOf(Integer.parseInt(str2));
        } else {
            num = null;
        }
        BrandedContentGatingInfo A004 = AbstractC39781Hkr.A00(num, str3, list, list2, hashMap3);
        hashMap.remove("default_age");
        List list3 = A004.A03;
        List list4 = A004.A04;
        Integer num2 = A004.A00;
        String str4 = A004.A01;
        HashMap hashMap4 = null;
        if (!hashMap.isEmpty()) {
            HashMap hashMap5 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                String str5 = (String) entry.getValue();
                if (str5 != null) {
                    hashMap5.put(key, Integer.valueOf(Integer.parseInt(str5)));
                }
            }
            if (!hashMap5.isEmpty()) {
                hashMap4 = hashMap5;
            }
        }
        return AbstractC39781Hkr.A00(num2, str4, list3, list4, hashMap4);
    }

    public static final String A01(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
        if (c40781ul != null) {
            String str = c40781ul.mErrorType;
            if ("SPONSOR_CAN_NOT_BE_TAGGED".equals(str) || "CREATOR_CAN_NOT_TAG_BRAND_ONCE_POST_BEEN_PROMOTED".equals(str)) {
                return c40781ul.getErrorMessage();
            }
            return null;
        }
        return null;
    }

    public static final void A03(Activity activity, UserSession userSession, C38321qM c38321qM, User user, Class cls, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(activity, 2);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B(AnonymousClass001.A0g("media/", c38321qM.getId(), "/edit_media/"));
        c25621Ms.A0R(N3N.class, C41349IRu.class);
        c25621Ms.A9s(AbstractC31581Du9.A02(0, 9, 107), C16030qx.A00(activity));
        c25621Ms.A9s("container_module", str);
        c25621Ms.A0R = true;
        try {
            String id = user.getId();
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            A0A.A0M("removed");
            A0A.A0u(id);
            A0A.A0Z();
            A0A.A0a();
            A0A.close();
            String obj = stringWriter.toString();
            C14360o3.A07(obj);
            c25621Ms.A9s(MSV.A00(1614), obj);
        } catch (IOException e) {
            C0K8.A05(cls, "Unable to parse branded content tag", e);
        }
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new N9W(activity, userSession);
        C1GJ.A01().schedule(A0N);
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        Object CES = A00.A0L.CES(A00, C23031Ai.A8c[139]);
        if (!C08730cb.A00(userSession).A00().A1L() && !"eligible".equals(CES)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        Object CES = A00.A0L.CES(A00, C23031Ai.A8c[139]);
        if (!C08730cb.A00(userSession).A00().A1L() && !"eligible".equals(CES) && !MSV.A00(199).equals(CES)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession, String str, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        if (("story".equals(str) && z && z2) || !C08730cb.A00(userSession).A00().A2H() || !C18U.A06(C06090Tz.A05, userSession, 36311539011027536L)) {
            return false;
        }
        return true;
    }

    public static final String A02(List list, List list2) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((BrandedContentTag) it.next()).A01;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        for (Object obj : arrayList2) {
            String str2 = (String) obj;
            if (str2 != null && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (str2.equals(((BrandedContentTag) it2.next()).A01)) {
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        A0A.A0M("removed");
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            A0A.A0u((String) it3.next());
        }
        A0A.A0Z();
        A0A.A0M("in");
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            BrandedContentTag brandedContentTag = (BrandedContentTag) it4.next();
            A0A.A0d();
            String str3 = brandedContentTag.A01;
            if (str3 != null) {
                A0A.A0S("sponsor_id", str3);
            }
            A0A.A0S("permission", String.valueOf(brandedContentTag.A04));
            A0A.A0T(AbstractC43591JPw.A00(402), brandedContentTag.A03);
            A0A.A0a();
        }
        A0A.A0Z();
        A0A.A0a();
        A0A.close();
        String obj2 = stringWriter.toString();
        C14360o3.A07(obj2);
        return obj2;
    }
}
