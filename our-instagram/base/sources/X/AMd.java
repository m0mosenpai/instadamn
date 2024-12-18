package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated(message = "")
/* loaded from: classes4.dex */
public final class AMd {
    public static final AMd A00 = new Object();

    @Deprecated(message = "")
    public static final List A01(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        C14360o3.A0B(abstractC12990ll, 1);
        return A03(context, abstractC12990ll, str, str2, str3, AbstractC16830sb.A06(EnumC200798uM.FACEBOOK));
    }

    @Deprecated(message = "")
    public static final ArrayList A00(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, EnumC200798uM enumC200798uM) {
        Integer num;
        Integer num2;
        C200898uW c200898uW = new C200898uW(abstractC12990ll, str3);
        C200908uX c200908uX = new C200908uX(abstractC12990ll);
        C200758uI c200758uI = new C200758uI();
        c200758uI.A03 = c200898uW;
        c200758uI.A04 = c200908uX;
        C200918uY c200918uY = new C200918uY(c200758uI);
        if (!A04(str, str2, c200898uW)) {
            String name = enumC200798uM.name();
            String A03 = C20150ym.A03(AbstractC20070ye.A00(18861898636197981L));
            if (A03 != null && !AbstractC001900j.A0T(A03)) {
                num = C05F.A03;
            } else {
                num = C05F.A04;
            }
            c200908uX.A07(name, num, "ACTIVE_ACCOUNT");
            String A032 = C20150ym.A03(AbstractC20070ye.A00(18861898636197981L));
            if (A032 != null && !AbstractC001900j.A0T(A032)) {
                num2 = C05F.A03;
            } else {
                num2 = C05F.A04;
            }
            c200908uX.A07(name, num2, "SAVED_ACCOUNT");
            c200918uY.A04.CuT(str);
            return AbstractC166987dD.A1E();
        }
        return C200918uY.A01(context, str, Collections.singletonList(enumC200798uM), c200918uY);
    }

    @Deprecated(message = "")
    public static final List A02(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        return A03(context, abstractC12990ll, str, str2, str3, AbstractC16830sb.A06(EnumC200798uM.MESSENGER));
    }

    @Deprecated(message = "")
    public static final List A03(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, java.util.Set set) {
        Integer num;
        C200898uW c200898uW = new C200898uW(abstractC12990ll, str3);
        C200908uX c200908uX = new C200908uX(abstractC12990ll);
        C200758uI c200758uI = new C200758uI();
        c200758uI.A03 = c200898uW;
        c200758uI.A04 = c200908uX;
        C200918uY c200918uY = new C200918uY(c200758uI);
        if (!A04(str, str2, c200898uW)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String name = ((EnumC200798uM) it.next()).name();
                String A03 = C20150ym.A03(AbstractC20070ye.A00(18861898636197981L));
                if (A03 != null && !AbstractC001900j.A0T(A03)) {
                    num = C05F.A03;
                } else {
                    num = C05F.A04;
                }
                c200908uX.A07(name, num, "ACTIVE_ACCOUNT");
            }
            c200918uY.A04.CuT(str);
            return C16930sl.A00;
        }
        String A0o = AbstractC166997dE.A0o();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it2 = c200918uY.A06.A00(set).iterator();
        while (it2.hasNext()) {
            C200918uY.A02(context, A0o, str, A1E, (AbstractC200848uR) it2.next(), c200918uY);
        }
        List unmodifiableList = Collections.unmodifiableList(A1E);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public static final boolean A04(String str, String str2, C200898uW c200898uW) {
        String A002;
        if (C20150ym.A07(AbstractC20070ye.A00(18298948682844062L))) {
            if (AbstractC001900j.A0T(str)) {
                return false;
            }
            if (C20150ym.A07(AbstractC20070ye.A00(18298948683237280L))) {
                String A03 = C20150ym.A03(AbstractC20070ye.A00(18861898636722274L));
                Integer num = C05F.A00;
                C14360o3.A0B(A03, 1);
                try {
                    JSONObject jSONObject = C105934q4.A01.A00(null, num, A03, str, str2).getJSONObject(String.valueOf(0));
                    Comparable comparable = (Enum) EnumC105944q5.A02.A00.get(str);
                    if (comparable == null) {
                        comparable = EnumC105944q5.A3q;
                    }
                    if (jSONObject.has(String.valueOf(((EnumC105944q5) comparable).A00))) {
                        return true;
                    }
                } catch (NullPointerException e) {
                    e = e;
                    A002 = "NullPointerException";
                    C0K8.A0F("AccessControlRuleV2", A002, e);
                    c200898uW.CuT(str);
                    return false;
                } catch (JSONException e2) {
                    e = e2;
                    A002 = AbstractC43591JPw.A00(651);
                    C0K8.A0F("AccessControlRuleV2", A002, e);
                    c200898uW.CuT(str);
                    return false;
                } catch (Exception e3) {
                    e = e3;
                    A002 = MSV.A00(343);
                    C0K8.A0F("AccessControlRuleV2", A002, e);
                    c200898uW.CuT(str);
                    return false;
                }
                c200898uW.CuT(str);
                return false;
            }
            String A032 = C20150ym.A03(AbstractC20070ye.A00(18861898636197981L));
            if (A032 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(A032);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        if (!str.equals(jSONArray.getString(i))) {
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            c200898uW.CuT(str);
            return false;
        }
        return true;
    }
}
