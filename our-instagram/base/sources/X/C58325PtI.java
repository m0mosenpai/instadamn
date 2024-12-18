package X;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PtI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58325PtI {
    public static int A00;
    public static Intent A01;
    public static boolean A06;
    public static final C58325PtI A07 = new Object();
    public static String A04 = "unknown";
    public static String A03 = "unknown";
    public static String A02 = "unknown";
    public static List A05 = AbstractC166987dD.A1E();
    public static final InterfaceC09390do A08 = AbstractC09440dt.A01(C58326PtJ.A00);

    public static final void A02() {
        A06 = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.PtI, java.lang.Object] */
    static {
        AbstractC58327PtK.A05(JQ3.A00);
    }

    public static final String A00() {
        List<C11Z> list = A05;
        A05 = null;
        if (list == null) {
            return "[]";
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (C11Z c11z : list) {
            A0q.add(new JSONObject().put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c11z.A03).put("className", c11z.A01).put("component", c11z.A02).put("action", c11z.A00));
        }
        return AbstractC166987dD.A19(new JSONArray((Collection) A0q));
    }

    public static final String A01(Bundle bundle) {
        String str;
        if (bundle == null) {
            return "null";
        }
        JSONArray A0p = AbstractC31171DnF.A0p();
        try {
            java.util.Set<String> keySet = bundle.keySet();
            C14360o3.A07(keySet);
            ArrayList A0q = AbstractC167017dG.A0q(keySet);
            for (String str2 : keySet) {
                JSONObject jSONObject = new JSONObject();
                if (C14360o3.A0K(str2, "EXTRAS_SHOULD_WARM_AGAIN")) {
                    str = String.valueOf(bundle.get(str2));
                } else {
                    str = "(filtered)";
                }
                A0q.add(jSONObject.put(str2, str));
            }
            Iterator it = A0q.iterator();
            while (it.hasNext()) {
                A0p.put(it.next());
            }
        } catch (BadParcelableException e) {
            C0K8.A0F("ColdStartIntentLogger", "Can't access keyset", e);
        }
        return AbstractC166987dD.A19(A0p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r15 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        if (r15 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(android.content.Intent r15, java.lang.String r16, java.lang.String r17) {
        /*
            java.lang.String r1 = X.C58325PtI.A04
            java.lang.String r0 = "unknown"
            boolean r3 = X.C14360o3.A0K(r1, r0)
            r2 = r16
            r1 = r17
            r0 = r15
            if (r3 == 0) goto L1c
            X.C58325PtI.A01 = r15
            X.C58325PtI.A04 = r17
            X.C58325PtI.A03 = r16
            boolean r3 = X.C58325PtI.A06
            if (r3 == 0) goto L1c
            X.C08750cd.A00 = r15
        L1c:
            boolean r3 = X.C58325PtI.A06
            if (r3 == 0) goto Ld0
            if (r15 == 0) goto Lcd
            java.lang.String r4 = r15.getAction()
        L26:
            java.lang.String r3 = "android.intent.action.MAIN"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Ld0
            java.lang.String r3 = "android.intent.category.LAUNCHER"
            boolean r3 = r15.hasCategory(r3)
            if (r3 == 0) goto L38
            X.C08750cd.A00 = r15
        L38:
            r15.getComponent()
            r15.getAction()
            r15.getCategories()
            android.os.Bundle r3 = r15.getExtras()
            if (r3 == 0) goto L4a
            A01(r3)
        L4a:
            X.0k4 r11 = X.C0YB.A00
            java.util.concurrent.TimeUnit r16 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r4 = X.C08770cf.A00(r15)
            java.lang.String r3 = "intent"
            X.0e4 r5 = X.AbstractC166987dD.A1L(r3, r4)
            java.lang.String r3 = "type"
            X.0e4 r6 = X.AbstractC166987dD.A1L(r3, r1)
            java.lang.String r3 = "handling_component"
            X.0e4 r7 = X.AbstractC166987dD.A1L(r3, r2)
            java.lang.String r4 = X.C58325PtI.A02
            java.lang.String r3 = "first_activity"
            X.0e4 r8 = X.AbstractC166987dD.A1L(r3, r4)
            int r3 = X.C58325PtI.A00
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "creation_index"
            X.0e4 r9 = X.AbstractC166987dD.A1L(r3, r4)
            if (r15 == 0) goto Lcb
            android.os.Bundle r3 = r15.getExtras()
        L7f:
            java.lang.String r4 = A01(r3)
            java.lang.String r3 = "extras"
            X.0e4 r10 = X.AbstractC166987dD.A1L(r3, r4)
            X.0e4[] r3 = new X.C09530e4[]{r5, r6, r7, r8, r9, r10}
            java.util.LinkedHashMap r17 = X.AbstractC06930Yk.A06(r3)
            r12 = 25102708(0x17f0974, float:4.6842885E-38)
            r13 = 467(0x1d3, float:6.54E-43)
            r14 = 0
            r11.markerGenerateWithAnnotations(r12, r13, r14, r16, r17)
            java.util.List r5 = X.C58325PtI.A05
            if (r5 == 0) goto Lc0
            int r4 = r5.size()
            r3 = 10
            if (r4 >= r3) goto Lc0
            r4 = 0
            if (r0 == 0) goto Lc7
            android.content.ComponentName r3 = r0.getComponent()
            if (r3 == 0) goto Lc7
            java.lang.String r3 = r3.toShortString()
        Lb4:
            java.lang.String r4 = r0.getAction()
        Lb8:
            X.11Z r0 = new X.11Z
            r0.<init>(r1, r2, r3, r4)
            r5.add(r0)
        Lc0:
            int r0 = X.C58325PtI.A00
            int r0 = r0 + 1
            X.C58325PtI.A00 = r0
            return
        Lc7:
            r3 = r4
            if (r0 == 0) goto Lb8
            goto Lb4
        Lcb:
            r3 = 0
            goto L7f
        Lcd:
            r4 = 0
            goto L26
        Ld0:
            if (r15 == 0) goto L4a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58325PtI.A03(android.content.Intent, java.lang.String, java.lang.String):void");
    }

    public final void A04() {
        AbstractC58329PtM.A03 = (C58328PtL) A08.getValue();
    }

    public final void A05(Intent intent, String str) {
        A02 = str;
        A03(intent, str, "activity");
    }

    public final void A06(Intent intent, String str) {
        A03(intent, str, "receiver");
    }

    public final void A07(Intent intent, String str) {
        A03(intent, str, "service");
    }
}
