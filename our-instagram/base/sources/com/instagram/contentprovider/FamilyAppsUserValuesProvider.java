package com.instagram.contentprovider;

import X.A3G;
import X.A3Q;
import X.A3S;
import X.ACJ;
import X.AK5;
import X.AbstractC001900j;
import X.AbstractC009903n;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC19750y3;
import X.AbstractC200888uV;
import X.AbstractC201198v1;
import X.AnonymousClass001;
import X.C00O;
import X.C023409i;
import X.C03190Dc;
import X.C05F;
import X.C06090Tz;
import X.C08610cP;
import X.C0BQ;
import X.C0K8;
import X.C14360o3;
import X.C16030qx;
import X.C17320tT;
import X.C1F8;
import X.C1FA;
import X.C1U4;
import X.C1UM;
import X.C200908uX;
import X.C200958uc;
import X.C224169v0;
import X.C2ZO;
import X.C83743oJ;
import X.C83803oP;
import X.EnumC200808uN;
import X.EnumC200938ua;
import X.EnumC200948ub;
import X.InterfaceC02900Bo;
import X.InterfaceC19610xo;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FamilyAppsUserValuesProvider extends ContentProvider {
    public AbstractC12990ll A00;
    public UserSession A01;
    public User A02;
    public String A03;
    public C224169v0 A04;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    private final MatrixCursor A00() {
        String string;
        String str;
        User user = this.A02;
        if (user != null) {
            String username = user.getUsername();
            User user2 = this.A02;
            if (user2 != null) {
                String id = user2.getId();
                User user3 = this.A02;
                if (user3 != null) {
                    String fullName = user3.getFullName();
                    User user4 = this.A02;
                    if (user4 != null) {
                        String valueOf = String.valueOf(user4.CQw());
                        User user5 = this.A02;
                        if (user5 != null) {
                            ImageUrl Bhu = user5.Bhu();
                            UserSession userSession = this.A01;
                            if (userSession != null) {
                                String str2 = C1F8.A00(userSession).A04;
                                UserSession userSession2 = this.A01;
                                if (userSession2 != null) {
                                    boolean booleanValue = AbstractC166997dE.A0c(C06090Tz.A05, userSession2, 36322598551824752L).booleanValue();
                                    if (str2 != null) {
                                        String url = Bhu.getUrl();
                                        Context context = getContext();
                                        if (context == null) {
                                            string = "";
                                        } else {
                                            C1UM A00 = C1U4.A00(context).A00("XE_ACCESS_LIBRARY_DATA");
                                            C14360o3.A07(A00);
                                            string = A00.getString("sso_settings_v2", null);
                                        }
                                        if (booleanValue) {
                                            str = "2";
                                        } else {
                                            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                                        }
                                        MatrixCursor matrixCursor = new MatrixCursor(A3Q.A00);
                                        matrixCursor.addRow(new String[]{username, fullName, str2, url, valueOf, null, null, string, str, id});
                                        UserSession userSession3 = this.A01;
                                        if (userSession3 != null) {
                                            C200908uX c200908uX = new C200908uX(userSession3);
                                            String obj = EnumC200808uN.A06.toString();
                                            String obj2 = EnumC200938ua.ACTIVE_ACCOUNT.toString();
                                            String str3 = this.A03;
                                            if (str3 != null) {
                                                HashMap A0r = AbstractC167017dG.A0r("waterfall_id", str3);
                                                A0r.put("target_app_fetch_result", "SUCCESS");
                                                AbstractC200888uV.A00(EnumC200948ub.A0J, obj, obj2, null, (String) A0r.get("instance_key"), A0r, c200908uX);
                                                if (c200908uX.A02() != null) {
                                                    C200958uc.A01(A0r, c200908uX.A02(), C200958uc.A00(A0r));
                                                }
                                                return matrixCursor;
                                            }
                                            C14360o3.A0F("waterfallId");
                                        }
                                    } else {
                                        UserSession userSession4 = this.A01;
                                        if (userSession4 != null) {
                                            C200908uX c200908uX2 = new C200908uX(userSession4);
                                            String obj3 = EnumC200808uN.A06.toString();
                                            String obj4 = EnumC200938ua.ACTIVE_ACCOUNT.toString();
                                            String str4 = this.A03;
                                            if (str4 != null) {
                                                HashMap A0r2 = AbstractC167017dG.A0r("waterfall_id", str4);
                                                A0r2.put("target_app_fetch_result", "FAILURE");
                                                AbstractC200888uV.A00(EnumC200948ub.A0I, obj3, obj4, "NO_ACCOUNT_FOUND", (String) A0r2.get("instance_key"), A0r2, c200908uX2);
                                                if (c200908uX2.A02() != null) {
                                                    C200958uc.A01(A0r2, c200908uX2.A02(), C200958uc.A00(A0r2));
                                                }
                                                return null;
                                            }
                                            C14360o3.A0F("waterfallId");
                                        }
                                    }
                                    throw C00O.createAndThrow();
                                }
                            }
                            C14360o3.A0F("userSession");
                            throw C00O.createAndThrow();
                        }
                    }
                }
            }
        }
        C14360o3.A0F("currentUser");
        throw C00O.createAndThrow();
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        C2ZO.A01.A01();
        return AbstractC166987dD.A0b();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.A1D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.9v0, java.lang.Object] */
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        AbstractC200888uV abstractC200888uV;
        Integer num;
        String[] strArr2;
        if (getContext() != null) {
            try {
                Context context = getContext();
                if (context != null) {
                    ((C08610cP) AbstractC166987dD.A17(A3S.A00)).A02(context, null, null);
                    return 0;
                }
                throw AbstractC166997dE.A0g();
            } catch (SecurityException e) {
                throw new SecurityException(AbstractC111324zv.A00(82), e);
            }
        }
        if (str == null) {
            return 0;
        }
        ?? obj = new Object();
        UserSession userSession = this.A01;
        String str2 = null;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        C200908uX c200908uX = new C200908uX(userSession);
        ?? obj2 = new Object();
        obj2.A00 = obj;
        obj2.A01 = c200908uX;
        this.A04 = obj2;
        if (strArr != null && 0 < strArr.length) {
            str2 = strArr[0];
        }
        if (str2 == null) {
            str2 = "null";
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        try {
            ArrayList A1E3 = AbstractC166987dD.A1E();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                AK5.A00(A1E3, jSONArray, i);
            }
            ArrayList<AK5> A1E4 = AbstractC166987dD.A1E();
            A1E4.addAll(A1E3);
            for (AK5 ak5 : A1E4) {
                AbstractC166997dE.A1S(ak5.A01, A1E);
                AbstractC166997dE.A1S(ak5.A02, A1E2);
            }
            AbstractC200888uV abstractC200888uV2 = obj2.A01;
            HashMap A01 = abstractC200888uV2.A01("waterfall_id", str2);
            if (!A1E2.isEmpty() && !A1E.isEmpty()) {
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    Iterator it2 = A1E2.iterator();
                    while (it2.hasNext()) {
                        AbstractC200888uV.A00(EnumC200948ub.A0D, A1B, (String) it2.next(), null, (String) A01.get("waterfall_id"), A01, abstractC200888uV2);
                    }
                }
            }
            if (obj2.A00 != null) {
                ArrayList A1E5 = AbstractC166987dD.A1E();
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    AK5.A00(A1E5, jSONArray2, i2);
                }
                ArrayList<AK5> A1E6 = AbstractC166987dD.A1E();
                A1E6.addAll(A1E5);
                ArrayList A1E7 = AbstractC166987dD.A1E();
                for (AK5 ak52 : A1E6) {
                    A1E7.add(AnonymousClass001.A0g(ak52.A01.A01, ak52.A02.A00, ak52.A00));
                }
                C17320tT A012 = AbstractC19750y3.A01("access_library_shared_storage");
                Iterator it3 = A1E7.iterator();
                while (it3.hasNext()) {
                    String A1B2 = AbstractC166987dD.A1B(it3);
                    Iterator it4 = A012.getAll().keySet().iterator();
                    while (it4.hasNext()) {
                        String A1B3 = AbstractC166987dD.A1B(it4);
                        C14360o3.A0A(A1B3);
                        if (AbstractC001900j.A0a(A1B3, A1B2, false)) {
                            InterfaceC19610xo ARD = A012.ARD();
                            ARD.EEj(A1B3);
                            ARD.apply();
                        }
                    }
                }
                HashMap A013 = abstractC200888uV2.A01("waterfall_id", str2);
                if (!A1E2.isEmpty() && !A1E.isEmpty()) {
                    Iterator it5 = A1E.iterator();
                    while (it5.hasNext()) {
                        String A1B4 = AbstractC166987dD.A1B(it5);
                        Iterator it6 = A1E2.iterator();
                        while (it6.hasNext()) {
                            AbstractC200888uV.A00(EnumC200948ub.A0E, A1B4, (String) it6.next(), null, (String) A013.get("waterfall_id"), A013, abstractC200888uV2);
                        }
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        } catch (JSONException unused) {
            abstractC200888uV = obj2.A01;
            num = C05F.A0C;
            strArr2 = new String[]{"waterfall_id", str2};
            HashMap A014 = abstractC200888uV.A01(strArr2);
            if (A1E2.isEmpty() && !A1E.isEmpty()) {
                Iterator it7 = A1E.iterator();
                while (it7.hasNext()) {
                    String A1B5 = AbstractC166987dD.A1B(it7);
                    Iterator it8 = A1E2.iterator();
                    while (it8.hasNext()) {
                        AbstractC200888uV.A00(EnumC200948ub.A0C, A1B5, (String) it8.next(), AbstractC201198v1.A00(num), (String) A014.get("waterfall_id"), A014, abstractC200888uV);
                    }
                }
                return 0;
            }
        } catch (Exception e2) {
            abstractC200888uV = obj2.A01;
            num = C05F.A05;
            strArr2 = new String[]{"errors", e2.getMessage(), "waterfall_id", str2};
            HashMap A0142 = abstractC200888uV.A01(strArr2);
            return A1E2.isEmpty() ? 0 : 0;
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        C0K8.A02(FamilyAppsUserValuesProvider.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        C0K8.A02(FamilyAppsUserValuesProvider.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        String str4;
        String str5;
        MatrixCursor A00;
        char c;
        String[] strArr3;
        String str6;
        C2ZO.A01.A01();
        if (!C03190Dc.A01(getContext())) {
            if (!((C08610cP) AbstractC166987dD.A17(A3S.A00)).A03(getContext(), null, null)) {
                String A002 = AbstractC111324zv.A00(82);
                C0K8.A02(FamilyAppsUserValuesProvider.class, A002);
                throw new SecurityException(A002);
            }
        }
        this.A00 = C023409i.A0A.A05(this);
        if (strArr2 != null) {
            if (0 < strArr2.length) {
                str3 = strArr2[0];
            } else {
                str3 = null;
            }
        } else {
            str3 = null;
        }
        this.A03 = String.valueOf(str3);
        if (strArr2 != null) {
            if (1 < strArr2.length) {
                str4 = strArr2[1];
            } else {
                str4 = null;
            }
        } else {
            str4 = null;
        }
        if (String.valueOf(str4) == null) {
            str5 = "instanceKey";
        } else {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -875409851) {
                    if (hashCode != 928732438) {
                        if (hashCode == 1063606563 && str.equals("name='saved_session_info'")) {
                            C83743oJ.A00();
                            List<C83803oP> A03 = C83743oJ.A03();
                            if (A03 != null && !A03.isEmpty()) {
                                A00 = new MatrixCursor(A3Q.A00);
                                for (C83803oP c83803oP : A03) {
                                    A00.addRow(new Object[]{c83803oP.A07, "", c83803oP.A05, c83803oP.A02, null, null, null, null, c83803oP.A06});
                                }
                                return A00;
                            }
                            return null;
                        }
                    } else if (str.equals("device_id_value")) {
                        c = 0;
                        A00 = new MatrixCursor(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID});
                        strArr3 = new String[1];
                        str6 = C16030qx.A00(getContext());
                        strArr3[c] = str6;
                        A00.addRow(strArr3);
                        return A00;
                    }
                } else if (str.equals("machine_id_value")) {
                    c = 0;
                    A00 = new MatrixCursor(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID});
                    strArr3 = new String[1];
                    AbstractC12990ll abstractC12990ll = this.A00;
                    if (abstractC12990ll != null) {
                        str6 = C1F8.A00(abstractC12990ll).A01.A00;
                        strArr3[c] = str6;
                        A00.addRow(strArr3);
                        return A00;
                    }
                    str5 = "session";
                }
            }
            AbstractC12990ll abstractC12990ll2 = this.A00;
            if (abstractC12990ll2 != null) {
                if (!(abstractC12990ll2 instanceof UserSession)) {
                    C0K8.A03(FamilyAppsUserValuesProvider.class, "No logged-in user");
                    return null;
                }
                UserSession userSession = (UserSession) abstractC12990ll2;
                this.A01 = userSession;
                if (userSession == null) {
                    str5 = "userSession";
                } else {
                    this.A02 = AbstractC166997dE.A0Y(userSession);
                    if (C14360o3.A0K(str, "all_session_info")) {
                        UserSession userSession2 = this.A01;
                        str5 = "userSession";
                        if (userSession2 != null) {
                            InterfaceC02900Bo A003 = C0BQ.A00(userSession2);
                            User user = this.A02;
                            if (user == null) {
                                str5 = "currentUser";
                            } else {
                                List BOf = A003.BOf(user);
                                if (BOf != null && AbstractC166987dD.A1b(BOf)) {
                                    A00 = A00();
                                    UserSession userSession3 = this.A01;
                                    if (userSession3 != null) {
                                        C1FA A004 = C1F8.A00(userSession3);
                                        ArrayList A0q = AbstractC167017dG.A0q(BOf);
                                        Iterator it = BOf.iterator();
                                        while (it.hasNext()) {
                                            AbstractC167017dG.A1V(A0q, it);
                                        }
                                        List A01 = A004.A01(A0q);
                                        if (A00 != null) {
                                            int size = BOf.size();
                                            for (int i = 0; i < size; i++) {
                                                User user2 = (User) BOf.get(i);
                                                String username = user2.getUsername();
                                                String id = user2.getId();
                                                String fullName = user2.getFullName();
                                                String valueOf = String.valueOf(user2.CQw());
                                                ImageUrl Bhu = user2.Bhu();
                                                String str7 = (String) A01.get(i);
                                                if (str7 != null && str7.length() != 0) {
                                                    A00.addRow(new String[]{username, fullName, str7, Bhu.getUrl(), valueOf, null, null, null, null, id});
                                                }
                                            }
                                        }
                                        return A00;
                                    }
                                } else {
                                    return null;
                                }
                            }
                        }
                    } else {
                        return A00();
                    }
                }
            }
            str5 = "session";
        }
        C14360o3.A0F(str5);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.9v0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.A1D, java.lang.Object] */
    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String str2;
        String str3;
        if (getContext() != null) {
            try {
                Context context = getContext();
                if (context != null) {
                    ((C08610cP) AbstractC166987dD.A17(A3S.A00)).A02(context, null, null);
                    return 0;
                }
                throw AbstractC166997dE.A0g();
            } catch (SecurityException e) {
                throw new SecurityException(AbstractC111324zv.A00(82), e);
            }
        }
        if (contentValues == null) {
            return 0;
        }
        ?? obj = new Object();
        UserSession userSession = this.A01;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        C200908uX c200908uX = new C200908uX(userSession);
        ?? obj2 = new Object();
        obj2.A00 = obj;
        obj2.A01 = c200908uX;
        this.A04 = obj2;
        if (strArr == null || 0 >= strArr.length || (str2 = strArr[0]) == null) {
            str2 = "null";
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        try {
            Set<String> keySet = contentValues.keySet();
            if (keySet != null) {
                Iterator<String> it = keySet.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    if (contentValues.getAsString(A1B) != null) {
                        ACJ A00 = A3G.A00(contentValues.getAsString(A1B));
                        A1E.add(A3G.A00(contentValues.getAsString(A1B)));
                        AbstractC166997dE.A1S(A00.A04, A1E2);
                        AbstractC166997dE.A1S(A00.A05, A1E3);
                    }
                }
            }
            ACJ[] acjArr = new ACJ[A1E.size()];
            AbstractC200888uV abstractC200888uV = obj2.A01;
            HashMap A01 = abstractC200888uV.A01("waterfall_id", str2);
            if (!A1E3.isEmpty() && !A1E2.isEmpty()) {
                Iterator it2 = A1E2.iterator();
                while (it2.hasNext()) {
                    String A1B2 = AbstractC166987dD.A1B(it2);
                    Iterator it3 = A1E3.iterator();
                    while (it3.hasNext()) {
                        AbstractC200888uV.A00(EnumC200948ub.A0G, A1B2, (String) it3.next(), null, (String) A01.get("waterfall_id"), A01, abstractC200888uV);
                    }
                }
            }
            if (obj2.A00 != null) {
                ACJ[] acjArr2 = (ACJ[]) A1E.toArray(acjArr);
                C14360o3.A0B(acjArr2, 0);
                for (ACJ acj : AbstractC009903n.A0I(acjArr2)) {
                    C14360o3.A0B(acj, 0);
                    InterfaceC19610xo ARD = AbstractC19750y3.A01("access_library_shared_storage").ARD();
                    EnumC200808uN enumC200808uN = acj.A04;
                    EnumC200938ua enumC200938ua = acj.A05;
                    String str4 = acj.A02;
                    if (enumC200808uN == null || enumC200938ua == null || str4 == null) {
                        str3 = "";
                    } else {
                        str3 = AnonymousClass001.A0g(enumC200808uN.A01, enumC200938ua.A00, str4);
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4);
                    jSONObject.put("auth_token", acj.A01);
                    jSONObject.put("account_type", acj.A00);
                    jSONObject.put("app_source", enumC200808uN);
                    jSONObject.put("credential_source", enumC200938ua);
                    JSONObject jSONObject2 = new JSONObject();
                    Map map = acj.A03;
                    Iterator it4 = map.keySet().iterator();
                    while (it4.hasNext()) {
                        String A1B3 = AbstractC166987dD.A1B(it4);
                        jSONObject2.put(A1B3, map.get(A1B3));
                    }
                    jSONObject.put("generic_data", jSONObject2);
                    ARD.E7K(str3, jSONObject.toString());
                    ARD.apply();
                }
                if (acjArr2.length == 0) {
                    abstractC200888uV.A06(C05F.A06, A1E2, A1E3, abstractC200888uV.A01("waterfall_id", str2));
                    return 0;
                }
                HashMap A012 = abstractC200888uV.A01("waterfall_id", str2);
                if (!A1E3.isEmpty() && !A1E2.isEmpty()) {
                    Iterator it5 = A1E2.iterator();
                    while (it5.hasNext()) {
                        String A1B4 = AbstractC166987dD.A1B(it5);
                        Iterator it6 = A1E3.iterator();
                        while (it6.hasNext()) {
                            AbstractC200888uV.A00(EnumC200948ub.A0H, A1B4, (String) it6.next(), null, (String) A012.get("waterfall_id"), A012, abstractC200888uV);
                        }
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        } catch (JSONException unused) {
            AbstractC200888uV abstractC200888uV2 = obj2.A01;
            abstractC200888uV2.A06(C05F.A0C, A1E2, A1E3, abstractC200888uV2.A01("waterfall_id", str2));
            return -1;
        } catch (Exception e2) {
            AbstractC200888uV abstractC200888uV3 = obj2.A01;
            abstractC200888uV3.A06(C05F.A05, A1E2, A1E3, abstractC200888uV3.A01("errors", e2.getMessage(), "waterfall_id", str2));
            return 0;
        }
    }
}
