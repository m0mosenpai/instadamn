package X;

import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Fh5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35270Fh5 {
    public static final C35270Fh5 A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
    
        if (r1 == 0) goto L30;
     */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, X.EtY, X.Eo3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C33308Eo3 A00(android.content.Context r13, X.AbstractC12990ll r14, X.EnumC33395EpS r15, X.EnumC31713DwI r16) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35270Fh5.A00(android.content.Context, X.0ll, X.EpS, X.DwI):X.Eo3");
    }

    public static final String A01(Activity activity, AbstractC12990ll abstractC12990ll, EnumC31713DwI enumC31713DwI, Integer num) {
        AbstractC167017dG.A1P(activity, abstractC12990ll);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HashMap A1G = AbstractC166987dD.A1G();
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(activity);
        Object systemService = activity.getSystemService("phone");
        C14360o3.A0C(systemService, AbstractC111324zv.A00(478));
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String country = Locale.getDefault().getCountry();
        C35270Fh5 c35270Fh5 = A00;
        String simCountryIso = telephonyManager.getSimCountryIso();
        C14360o3.A0A(A01);
        c35270Fh5.A06(A01, abstractC12990ll, simCountryIso, "sim", A1G);
        c35270Fh5.A06(A01, abstractC12990ll, telephonyManager.getNetworkCountryIso(), AbstractC111324zv.A00(2749), A1G);
        c35270Fh5.A06(A01, abstractC12990ll, country, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, A1G);
        Iterator it = A04(activity, abstractC12990ll, enumC31713DwI, A05(num)).iterator();
        while (it.hasNext()) {
            AbstractC33622EtY abstractC33622EtY = (AbstractC33622EtY) it.next();
            String str = abstractC33622EtY.A02;
            C14360o3.A0A(country);
            try {
                A07(String.valueOf(A01.A0F(str, country).A00), A1G, abstractC33622EtY.A01);
            } catch (C40f unused) {
                "failed_country_code".getClass();
                C19280xC A012 = C19280xC.A01("failed_country_code", null);
                A012.A0C("uuid", AbstractC31174DnI.A0s());
                AbstractC31173DnH.A1S(A012, abstractC12990ll);
            }
        }
        ArrayList A1F = AbstractC166987dD.A1F(A1G.values());
        C120295cS A08 = AbstractC221915u.A00.A08(byteArrayOutputStream);
        A08.A0c();
        Iterator it2 = A1F.iterator();
        while (it2.hasNext()) {
            FR1 fr1 = (FR1) it2.next();
            A08.A0d();
            String str2 = fr1.A00;
            if (str2 != null) {
                A08.A0S("country_code", str2);
            }
            List list = fr1.A01;
            if (list != null) {
                C16V.A03(A08, CacheBehaviorLogger.SOURCE);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    AbstractC167017dG.A1F(A08, it3);
                }
                A08.A0Z();
            }
            A08.A0a();
        }
        A08.A0Z();
        A08.close();
        byteArrayOutputStream.close();
        String byteArrayOutputStream2 = byteArrayOutputStream.toString(ReactWebViewManager.HTML_ENCODING);
        C14360o3.A07(byteArrayOutputStream2);
        return byteArrayOutputStream2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x012f, code lost:
    
        if (r1 == false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35270Fh5.A03(android.content.Context):java.lang.String");
    }

    public static final EnumSet A05(Integer num) {
        EnumSet of;
        if (num != C05F.A0C && num != C05F.A0N) {
            of = EnumSet.of(EnumC33395EpS.A05);
        } else {
            of = EnumSet.of(EnumC33395EpS.A05, EnumC33395EpS.A03, EnumC33395EpS.A07);
        }
        EnumSet complementOf = EnumSet.complementOf(of);
        C14360o3.A07(complementOf);
        return complementOf;
    }

    private final void A06(PhoneNumberUtil phoneNumberUtil, AbstractC12990ll abstractC12990ll, String str, String str2, Map map) {
        if (str != null) {
            try {
                int A0A = phoneNumberUtil.A0A(str);
                if (A0A > 0) {
                    A07(String.valueOf(A0A), map, str2);
                }
            } catch (IllegalArgumentException unused) {
                "failed_country_code".getClass();
                C19280xC A01 = C19280xC.A01("failed_country_code", null);
                A01.A0C("failed_country", str);
                A01.A0C("uuid", AbstractC31174DnI.A0s());
                AbstractC31173DnH.A1S(A01, abstractC12990ll);
            }
        }
    }

    public static final String A02(Context context) {
        if (AbstractC23451Ch.A06(context)) {
            Object systemService = context.getSystemService("phone");
            C14360o3.A0C(systemService, AbstractC111324zv.A00(478));
            try {
                return ((TelephonyManager) systemService).getLine1Number();
            } catch (SecurityException unused) {
                return null;
            }
        }
        return null;
    }

    public static final ArrayList A04(Context context, AbstractC12990ll abstractC12990ll, EnumC31713DwI enumC31713DwI, EnumSet enumSet) {
        AbstractC167027dH.A12(context, abstractC12990ll, enumC31713DwI);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A13 = AbstractC166997dE.A13(enumSet);
        while (A13.hasNext()) {
            EnumC33395EpS enumC33395EpS = (EnumC33395EpS) A13.next();
            C14360o3.A0A(enumC33395EpS);
            C33308Eo3 A002 = A00(context, abstractC12990ll, enumC33395EpS, enumC31713DwI);
            if (A002 != null) {
                A1E.add(A002);
            }
        }
        Collections.sort(A1E, new C31460Ds4((InterfaceC16620sF) GWN.A00, 18));
        return A1E;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.FR1, java.lang.Object] */
    public static final void A07(String str, Map map, String str2) {
        FR1 fr1 = (FR1) map.get(str);
        if (fr1 != null) {
            C14360o3.A0B(str2, 0);
            List list = fr1.A01;
            if (list != null) {
                list.add(str2);
                return;
            }
            return;
        }
        C14360o3.A0B(str2, 2);
        ?? obj = new Object();
        obj.A00 = str;
        ArrayList A1E = AbstractC166987dD.A1E();
        obj.A01 = A1E;
        A1E.add(str2);
        map.put(str, obj);
    }
}
