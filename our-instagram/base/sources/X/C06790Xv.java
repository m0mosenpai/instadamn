package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06790Xv {
    public final InterfaceC08830cm A00;

    public static void A05(C06790Xv c06790Xv, C0Y0 c0y0) {
        AbstractC02600Aj abstractC02600Aj = (AbstractC02600Aj) c06790Xv.A00.get();
        if (abstractC02600Aj.A00.isSampled()) {
            ArrayList arrayList = new ArrayList();
            for (C0Y1 c0y1 : c0y0.A01) {
                C104074mU A00 = AbstractC104064mT.A00();
                ArrayList arrayList2 = new ArrayList();
                A09(c0y1, arrayList2);
                A07(c0y1, arrayList2);
                A00.A07("dimensions", arrayList2);
                ArrayList arrayList3 = new ArrayList();
                A0A(c0y1, arrayList3);
                A08(c0y1, arrayList3);
                A06(c0y1, arrayList3);
                A00.A07("aggregations", arrayList3);
                A00.A05("count", Long.valueOf(c0y1.A00));
                arrayList.add(A00);
            }
            abstractC02600Aj.A0R("scenario", c0y0.A00);
            abstractC02600Aj.A0S("summaries", arrayList);
            abstractC02600Aj.Cht();
        }
    }

    public static void A06(C0Y1 c0y1, List list) {
        String[] strArr = c0y1.A04;
        double[] dArr = c0y1.A01;
        for (int i = 0; i < strArr.length; i++) {
            C104124ma A00 = AbstractC104114mZ.A00();
            A00.A06("metric", strArr[i]);
            A00.A02(A00(dArr[i]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            list.add(A00);
        }
    }

    public static void A07(C0Y1 c0y1, List list) {
        String[] strArr = c0y1.A06;
        long[] jArr = c0y1.A02;
        for (int i = 0; i < strArr.length; i++) {
            C104084mW A00 = C4mV.A00();
            A00.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, strArr[i]);
            A00.A02(A03(jArr[i]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            list.add(A00);
        }
    }

    public static void A08(C0Y1 c0y1, List list) {
        String[] strArr = c0y1.A05;
        long[] jArr = c0y1.A03;
        for (int i = 0; i < strArr.length; i++) {
            C104124ma A00 = AbstractC104114mZ.A00();
            A00.A06("metric", strArr[i]);
            A00.A02(A01(jArr[i]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            list.add(A00);
        }
    }

    public static void A09(C0Y1 c0y1, List list) {
        String[] strArr = c0y1.A09;
        String[] strArr2 = c0y1.A08;
        for (int i = 0; i < strArr.length; i++) {
            C104084mW A00 = C4mV.A00();
            A00.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, strArr[i]);
            A00.A02(A04(strArr2[i]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            list.add(A00);
        }
    }

    public static void A0A(C0Y1 c0y1, List list) {
        String[] strArr = c0y1.A07;
        String[] strArr2 = c0y1.A0A;
        for (int i = 0; i < strArr.length; i++) {
            C104124ma A00 = AbstractC104114mZ.A00();
            A00.A06("metric", strArr[i]);
            A00.A02(A02(strArr2[i]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            list.add(A00);
        }
    }

    public C06790Xv(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }

    public static C104144mc A00(double d) {
        C104144mc A00 = AbstractC104134mb.A00();
        A00.A04("double_value", Double.valueOf(d));
        return A00;
    }

    public static C104144mc A01(long j) {
        C104144mc A00 = AbstractC104134mb.A00();
        A00.A05("int_value", Long.valueOf(j));
        return A00;
    }

    public static C104144mc A02(String str) {
        C104144mc A00 = AbstractC104134mb.A00();
        A00.A06("string_value", str);
        return A00;
    }

    public static C104104mY A03(long j) {
        C104104mY A00 = AbstractC104094mX.A00();
        A00.A05("int_value", Long.valueOf(j));
        return A00;
    }

    public static C104104mY A04(String str) {
        C104104mY A00 = AbstractC104094mX.A00();
        A00.A06("string_value", str);
        return A00;
    }
}
