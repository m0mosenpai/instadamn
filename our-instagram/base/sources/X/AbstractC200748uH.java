package X;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.8uH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC200748uH {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.8yX] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, X.8yX] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, X.8yY] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, X.8yY] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, X.8yX] */
    @Deprecated
    public static C203158yX A00(Context context, AbstractC12990ll abstractC12990ll, Boolean bool, String str) {
        boolean z;
        ?? r2;
        List unmodifiableList;
        EnumC200798uM enumC200798uM;
        int i;
        String obj = C0HM.A00().toString();
        if (bool.booleanValue()) {
            LinkedHashSet<EnumC23861Et> linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(EnumC23861Et.A05);
            linkedHashSet.add(EnumC23861Et.A06);
            r2 = 0;
            for (EnumC23861Et enumC23861Et : linkedHashSet) {
                ArrayList arrayList = new ArrayList();
                int ordinal = enumC23861Et.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    throw new IllegalStateException("SsoApplication not supported.");
                }
                arrayList.add(new AK5(EnumC200808uN.A03, EnumC200938ua.ACTIVE_ACCOUNT));
                ArrayList A00 = A3F.A00(obj, "InstagramSsoLoginUtil", arrayList, new C200908uX(abstractC12990ll));
                if (!A00.isEmpty() && A00.get(0) != null && ((ACJ) A00.get(0)).A01 != null) {
                    ACJ acj = (ACJ) A00.get(0);
                    r2 = new Object();
                    r2.A02 = acj.A01;
                    ?? obj2 = new Object();
                    obj2.A01 = acj.A02;
                    Map map = acj.A03;
                    if (!map.isEmpty()) {
                        String str2 = "";
                        if (map.containsKey("profile_photo_url")) {
                            map.get("profile_photo_url");
                        }
                        if (map.containsKey("user_name")) {
                            str2 = (String) map.get("user_name");
                        }
                        obj2.A00 = str2;
                    }
                    r2.A00 = obj2;
                    r2.A01 = enumC23861Et;
                }
            }
            if (r2 == 0) {
                z = true;
            }
            return r2;
        }
        z = false;
        C200758uI c200758uI = new C200758uI();
        c200758uI.A03 = new C200898uW(abstractC12990ll, str);
        c200758uI.A04 = new C200908uX(abstractC12990ll);
        C200918uY c200918uY = new C200918uY(c200758uI);
        Iterator it = AbstractC23851Es.A02().iterator();
        r2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EnumC23861Et enumC23861Et2 = (EnumC23861Et) it.next();
            try {
                Context applicationContext = context.getApplicationContext();
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC200848uR abstractC200848uR : c200918uY.A06.A00(EnumSet.allOf(EnumC200798uM.class))) {
                    EnumC200798uM enumC200798uM2 = abstractC200848uR.A04;
                    int ordinal2 = enumC23861Et2.ordinal();
                    if (ordinal2 != 0 && ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            enumC200798uM = EnumC200798uM.FACEBOOK_LITE;
                        } else {
                            throw new IllegalStateException("SsoApplication not supported.");
                        }
                    } else {
                        enumC200798uM = EnumC200798uM.FACEBOOK;
                    }
                    if (enumC200798uM2 == enumC200798uM) {
                        String str3 = abstractC200848uR.A02;
                        String str4 = enumC23861Et2.A01;
                        if (str3.equals(str4)) {
                            try {
                                PackageManager packageManager = context.getPackageManager();
                                C14360o3.A0A(str4);
                                i = packageManager.getPackageInfo(str4, 0).versionCode;
                            } catch (PackageManager.NameNotFoundException unused) {
                                i = -1;
                            }
                            if (i >= enumC23861Et2.A00) {
                                C200918uY.A02(applicationContext, obj, "InstagramSsoLoginUtil", arrayList2, abstractC200848uR, c200918uY);
                            }
                        }
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                C0K8.A0L("InstagramSsoLoginUtil", "Exception occurred while resolving sso session from %s", th, enumC23861Et2.A01);
            }
            if (!unmodifiableList.isEmpty()) {
                C203148yW c203148yW = (C203148yW) unmodifiableList.get(0);
                ?? obj3 = new Object();
                C203128yU c203128yU = c203148yW.A01;
                obj3.A02 = c203128yU.A00;
                ?? obj4 = new Object();
                C203118yT c203118yT = c203128yU.A01;
                obj4.A01 = c203118yT.A02;
                obj4.A00 = c203118yT.A00;
                obj3.A00 = obj4;
                obj3.A01 = enumC23861Et2;
                r2 = obj3;
                break;
            }
        }
        if (z && r2 != 0) {
            C200908uX c200908uX = new C200908uX(abstractC12990ll);
            List<String> asList = Arrays.asList("FACEBOOK");
            List asList2 = Arrays.asList("ACTIVE_ACCOUNT");
            C25012B4m c25012B4m = new C25012B4m(obj);
            if (asList != null && !asList.isEmpty() && asList2 != null && !asList2.isEmpty()) {
                for (String str5 : asList) {
                    Iterator it2 = asList2.iterator();
                    while (it2.hasNext()) {
                        AbstractC200888uV.A00(EnumC200948ub.A03, str5, (String) it2.next(), "NO_ACCOUNT_FOUND", c25012B4m.get("waterfall_id"), c25012B4m, c200908uX);
                    }
                }
            }
        }
        return r2;
    }
}
