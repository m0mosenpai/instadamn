package com.facebook.msys.mci;

import X.AnonymousClass001;
import X.AnonymousClass612;
import X.C0K8;
import X.C1335260x;
import X.C1335360y;
import X.C53882dS;
import android.content.Context;
import com.facebook.R;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Localization {
    public static C1335360y sLocalizedStringProvider;
    public static AnonymousClass612 sLocalizedStringResolver;

    public static native void nativeInitialize();

    public static String getLocalizedString(String str, String str2, String[] strArr) {
        Map map;
        C1335360y c1335360y = sLocalizedStringProvider;
        if (c1335360y == null) {
            return null;
        }
        try {
            Context context = c1335360y.A00;
            C1335260x c1335260x = c1335360y.A01;
            String[] strArr2 = {str, str2};
            StringBuilder sb = new StringBuilder();
            sb.append(strArr2[0]);
            for (char c = 1; c < 2; c = 2) {
                sb.append("|");
                sb.append(strArr2[c]);
            }
            int length = sb.toString().replace("%s", "%@").getBytes(Charset.forName(ReactWebViewManager.HTML_ENCODING)).length;
            long j = 0;
            for (int i = 0; i < length; i++) {
                long j2 = (j + (r6[i] & 255)) & 4294967295L;
                long j3 = (j2 + (j2 << 10)) & 4294967295L;
                j = j3 ^ (j3 >> 6);
            }
            long j4 = (j + (j << 3)) & 4294967295L;
            long j5 = j4 ^ (j4 >> 11);
            StringBuffer stringBuffer = new StringBuffer();
            for (long j6 = (j5 + (j5 << 15)) & 4294967295L; j6 > 0; j6 /= 62) {
                stringBuffer.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((int) (j6 % 62)));
            }
            stringBuffer.reverse();
            String A0R = AnonymousClass001.A0R("msys_", stringBuffer.toString());
            synchronized (c1335260x) {
                try {
                    map = c1335260x.A00;
                    if (map == null) {
                        map = new HashMap();
                        c1335260x.A00 = map;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map.containsKey(A0R)) {
                return context.getString(((Integer) map.get(A0R)).intValue(), strArr);
            }
            throw new RuntimeException(AnonymousClass001.A0R(A0R, " is not found in DirectMsysLocalizationIdentifier."));
        } catch (Exception e) {
            C0K8.A0N("DefaultLocalizedStringProvider", "Failed to get localized string for key {%s} and description {%s} with {%s} args", e, str, str2, Integer.valueOf(strArr.length));
            return null;
        }
    }

    static {
        C53882dS.A00();
    }

    public static String getLocalizedStringV2(long j, Object[] objArr) {
        C1335360y c1335360y;
        int i;
        C1335360y c1335360y2;
        int i2;
        Object obj;
        AnonymousClass612 anonymousClass612 = sLocalizedStringResolver;
        if (anonymousClass612 != null) {
            try {
                if (j == 2312420685L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966913;
                } else if (j == 2903444008L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966914;
                } else if (j == 1944565770) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966915;
                } else if (j == 3959647533L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966916;
                } else if (j == 3230002203L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966917;
                } else if (j == 736177029) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966918;
                } else if (j == 945450141) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966919;
                } else if (j == 3193710281L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966920;
                } else if (j == 2272409045L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966921;
                } else if (j == 2232575596L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966922;
                } else if (j == 1866082526) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966923;
                } else if (j == 2418276693L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966924;
                } else if (j == 236855188) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966925;
                } else if (j == 1117517260) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966926;
                } else if (j == 1841309763) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966927;
                } else if (j == 634596127) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966928;
                } else if (j == 964820678) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966929;
                } else if (j == 1433344940) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966930;
                } else if (j == 1648226325) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966931;
                } else if (j == 2532208025L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966932;
                } else if (j == 1090357653) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966933;
                } else if (j == 874369118) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966934;
                } else if (j == 1508719385) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966935;
                } else if (j == 4192447857L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966936;
                } else if (j == 1694369638) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966937;
                } else if (j == 1335819486) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966938;
                } else if (j == 1344417455) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966939;
                } else if (j == 3582120297L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966940;
                } else if (j == 3672777929L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966941;
                } else if (j == 1322289691) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966942;
                } else if (j == 888250857) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966943;
                } else if (j == 2189327216L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966944;
                } else if (j == 3796806531L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966945;
                } else if (j == 378170872) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966946;
                } else if (j == 371572938) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966947;
                } else if (j == 2705705137L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966948;
                } else if (j == 1738534957) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966949;
                } else if (j == 3798026344L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966950;
                } else if (j == 3681221657L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966951;
                } else if (j == 783525065) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966952;
                } else if (j == 2096762549) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966953;
                } else if (j == 2125922880) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966954;
                } else if (j == 3369831832L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966955;
                } else if (j == 416765527) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966956;
                } else if (j == 400348563) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966957;
                } else if (j == 3268876718L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966958;
                } else if (j == 2517079271L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966959;
                } else if (j == 509847269) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966960;
                } else if (j == 1028612258) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966961;
                } else if (j == 2802203954L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966962;
                } else if (j == 497865424) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966963;
                } else if (j == 757935517) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966964;
                } else if (j == 429969424) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966965;
                } else if (j == 1849261722) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966966;
                } else if (j == 2432069424L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966967;
                } else if (j == 748667077) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966968;
                } else if (j == 2408961696L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966969;
                } else if (j == 615176531) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966970;
                } else if (j == 1654759712) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966971;
                } else if (j == 2783117178L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966972;
                } else if (j == 994498212) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966973;
                } else if (j == 295059532) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966974;
                } else if (j == 4031642997L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966975;
                } else if (j == 1773570910) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966976;
                } else if (j == 927403793) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966977;
                } else if (j == 1629395542) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966978;
                } else if (j == 1134382458) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966979;
                } else if (j == 49547041) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966980;
                } else if (j == 2741892702L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966981;
                } else if (j == 3994294699L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966982;
                } else if (j == 1672729595) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966983;
                } else if (j == 1548199926) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966984;
                } else if (j == 853133439) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966985;
                } else if (j == 1794151558) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966986;
                } else if (j == 829937231) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966987;
                } else if (j == 1369684690) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966988;
                } else if (j == 2828950337L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966989;
                } else if (j == 1493124745) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966990;
                } else if (j == 4044918467L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966991;
                } else if (j == 2297676819L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966992;
                } else if (j == 3177156796L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966993;
                } else if (j == 969455725) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966994;
                } else if (j == 546931205) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966995;
                } else if (j == 3891335163L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966996;
                } else if (j == 2706603945L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966997;
                } else if (j == 1234514422) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966998;
                } else if (j == 4176276435L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131966999;
                } else if (j == 3358330234L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967000;
                } else if (j == 1814481429) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967001;
                } else if (j == 3321606771L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967002;
                } else if (j == 569613457) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967003;
                } else if (j == 2797823458L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967004;
                } else if (j == 935584176) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967005;
                } else if (j == 1047866027) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967006;
                } else if (j == 4054416004L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967007;
                } else if (j == 1023751824) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967008;
                } else if (j == 404458481) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967009;
                } else if (j == 3559124134L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967010;
                } else if (j == 3832884806L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967011;
                } else if (j == 3551985823L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967012;
                } else if (j == 3995632194L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967013;
                } else if (j == 3416538688L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967014;
                } else if (j == 1166521977) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967015;
                } else if (j == 616521862) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967016;
                } else if (j == 3160782282L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967017;
                } else if (j == 2673716941L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967018;
                } else if (j == 1250299695) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967019;
                } else if (j == 2307964186L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967020;
                } else if (j == 1014894367) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967021;
                } else if (j == 3176123863L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967022;
                } else if (j == 3799390575L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967023;
                } else if (j == 775401924) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967024;
                } else if (j == 2390664904L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967025;
                } else if (j == 2194058794L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967026;
                } else if (j == 330258077) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967027;
                } else if (j == 2345331581L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967028;
                } else if (j == 4274249582L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967029;
                } else if (j == 2206265325L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967030;
                } else if (j == 2566932822L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967031;
                } else if (j == 1920267105) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967032;
                } else if (j == 1499293210) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967033;
                } else if (j == 3410682794L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967034;
                } else if (j == 988855920) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967035;
                } else if (j == 1314788967) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967036;
                } else if (j == 385590061) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967037;
                } else if (j == 935820401) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967038;
                } else if (j == 3039845412L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967039;
                } else if (j == 1185742925) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967040;
                } else if (j == 1662294060) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967041;
                } else if (j == 3258638607L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967042;
                } else if (j == 2899214573L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967043;
                } else if (j == 2750798478L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967044;
                } else if (j == 1297166177) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967045;
                } else if (j == 780349717) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967046;
                } else if (j == 4144363436L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967047;
                } else if (j == 2200131588L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967048;
                } else if (j == 3415660633L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967049;
                } else if (j == 3323277873L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967050;
                } else if (j == 1377982097) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967051;
                } else if (j == 4068673106L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967052;
                } else if (j == 2190608321L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967053;
                } else if (j == 3751240526L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967054;
                } else if (j == 3355351223L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967055;
                } else if (j == 2371832473L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967056;
                } else if (j == 1115460445) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967057;
                } else if (j == 297023016) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967058;
                } else if (j == 2118592942) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967059;
                } else if (j == 987116211) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967060;
                } else if (j == 3433104336L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967061;
                } else if (j == 1154967086) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967062;
                } else if (j == 3877200931L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967063;
                } else if (j == 1074377286) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967064;
                } else if (j == 2082210233) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967065;
                } else if (j == 2375021985L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967066;
                } else if (j == 932653101) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967067;
                } else if (j == 934891613) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967068;
                } else if (j == 957872680) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967069;
                } else if (j == 967111183) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967070;
                } else if (j == 996546480) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967071;
                } else if (j == 1017768491) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967072;
                } else if (j == 1020403750) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967073;
                } else if (j == 1048416038) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967074;
                } else if (j == 1053082947) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967075;
                } else if (j == 1457788290) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967076;
                } else if (j == 1465602608) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967077;
                } else if (j == 390522) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967078;
                } else if (j == 1497282779) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967079;
                } else if (j == 1519844164) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967080;
                } else if (j == 1565547673) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967081;
                } else if (j == 1568802912) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967082;
                } else if (j == 1637153033) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967083;
                } else if (j == 1642951227) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967084;
                } else if (j == 1681736754) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967085;
                } else if (j == 1739628560) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967086;
                } else if (j == 1739999037) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967087;
                } else if (j == 1753754551) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967088;
                } else if (j == 1804355325) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967089;
                } else if (j == 1099878966) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967090;
                } else if (j == 1112375422) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967091;
                } else if (j == 1145314138) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967092;
                } else if (j == 1163460788) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967093;
                } else if (j == 1161062175) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967094;
                } else if (j == 1281880625) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967095;
                } else if (j == 1306024833) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967096;
                } else if (j == 1338912959) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967097;
                } else if (j == 1339607284) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967098;
                } else if (j == 1346982727) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967099;
                } else if (j == 1388813467) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967100;
                } else if (j == 1399226743) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967101;
                } else if (j == 1416259530) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967102;
                } else if (j == 1409335992) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967103;
                } else if (j == 1420387436) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967104;
                } else if (j == 1907280305) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967105;
                } else if (j == 1919524925) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967106;
                } else if (j == 2388504361L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967107;
                } else if (j == 2421884758L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967108;
                } else if (j == 2481880758L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967109;
                } else if (j == 2470414797L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967110;
                } else if (j == 2491945614L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967111;
                } else if (j == 2486550278L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967112;
                } else if (j == 2521278234L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967113;
                } else if (j == 2557582581L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967114;
                } else if (j == 2611673238L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967115;
                } else if (j == 2616853333L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967116;
                } else if (j == 2663996736L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967117;
                } else if (j == 2688620547L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967118;
                } else if (j == 2676961947L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967119;
                } else if (j == 2708321463L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967120;
                } else if (j == 1996811713) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967121;
                } else if (j == 2188146423L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967122;
                } else if (j == 35480537) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967123;
                } else if (j == 2213485461L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967124;
                } else if (j == 2271904206L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967125;
                } else if (j == 2285622730L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967126;
                } else if (j == 2288577995L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967127;
                } else if (j == 2299620241L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967128;
                } else if (j == 2292918601L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967129;
                } else if (j == 2334611748L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967130;
                } else if (j == 2352696798L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967131;
                } else if (j == 2353844300L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967132;
                } else if (j == 2779070802L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967133;
                } else if (j == 2856734260L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967134;
                } else if (j == 2868699317L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967135;
                } else if (j == 2888307154L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967136;
                } else if (j == 3298086032L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967137;
                } else if (j == 3321340421L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967138;
                } else if (j == 3322002377L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967139;
                } else if (j == 3383365613L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967140;
                } else if (j == 3373597599L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967141;
                } else if (j == 3387070852L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967142;
                } else if (j == 3429104262L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967143;
                } else if (j == 3443511435L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967144;
                } else if (j == 3443782102L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967145;
                } else if (j == 3531058914L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967146;
                } else if (j == 3544071775L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967147;
                } else if (j == 3562062450L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967148;
                } else if (j == 3575257287L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967149;
                } else if (j == 3591208999L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967150;
                } else if (j == 3630987208L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967151;
                } else if (j == 3652820148L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967152;
                } else if (j == 2974432075L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967153;
                } else if (j == 3021406781L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967154;
                } else if (j == 3129760773L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967155;
                } else if (j == 3194542174L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967156;
                } else if (j == 3206762867L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967157;
                } else if (j == 3218929001L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967158;
                } else if (j == 3688076717L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967159;
                } else if (j == 3700752106L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967160;
                } else if (j == 3748497596L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967161;
                } else if (j == 3772112781L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967162;
                } else if (j == 3802288555L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967163;
                } else if (j == 4202164190L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967164;
                } else if (j == 4222306186L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967165;
                } else if (j == 4242652336L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967166;
                } else if (j == 4246145925L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967167;
                } else if (j == 71445789) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967168;
                } else if (j == 3851722904L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967169;
                } else if (j == 3871761130L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967170;
                } else if (j == 3873263038L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967171;
                } else if (j == 3921131020L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967172;
                } else if (j == 3924258270L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967173;
                } else if (j == 64035029) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967174;
                } else if (j == 3963704988L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967175;
                } else if (j == 4002265907L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967176;
                } else if (j == 4009613475L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967177;
                } else if (j == 4048267500L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967178;
                } else if (j == 4071254446L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967179;
                } else if (j == 4080025102L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967180;
                } else if (j == 4098143759L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967181;
                } else if (j == 4146515869L) {
                    c1335360y = anonymousClass612.A00;
                    i = 2131967182;
                } else {
                    if (j == 4159302263L) {
                        c1335360y2 = anonymousClass612.A00;
                        i2 = R.plurals.msys_ds_4xu0wn;
                    } else if (j == 4171205986L) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967183;
                    } else if (j == 4185231469L) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967184;
                    } else if (j == 110169397) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967185;
                    } else if (j == 127998422) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967186;
                    } else if (j == 544564569) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967187;
                    } else if (j == 594804677) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967188;
                    } else if (j == 618905030) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967189;
                    } else if (j == 623999261) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967190;
                    } else if (j == 721065526) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967191;
                    } else if (j == 749954423) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967192;
                    } else if (j == 812940701) {
                        c1335360y = anonymousClass612.A00;
                        i = 2131967193;
                    } else {
                        if (j == 816165934) {
                            c1335360y2 = anonymousClass612.A00;
                            i2 = R.plurals.msys_ds_Tey2G;
                        } else if (j == 900120217) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967194;
                        } else if (j == 14617150) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967195;
                        } else if (j == 150184608) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967196;
                        } else if (j == 214758505) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967197;
                        } else if (j == 225742210) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967198;
                        } else if (j == 259473449) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967199;
                        } else if (j == 312214665) {
                            c1335360y2 = anonymousClass612.A00;
                            i2 = R.plurals.msys_ds_l81ip;
                        } else if (j == 314510112) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967200;
                        } else if (j == 355042138) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967201;
                        } else if (j == 392258040) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967202;
                        } else if (j == 444324519) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967203;
                        } else if (j == 456002683) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967204;
                        } else if (j == 460740012) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967205;
                        } else if (j == 527347143) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967206;
                        } else if (j == 2701286271L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967207;
                        } else if (j == 4253565189L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967208;
                        } else if (j == 3730866951L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967209;
                        } else if (j == 1239867972) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967210;
                        } else if (j == 1143706806) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967211;
                        } else if (j == 1480315177) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967212;
                        } else if (j == 3258760568L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967213;
                        } else if (j == 3781471674L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967214;
                        } else if (j == 450571839) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967215;
                        } else if (j == 445717572) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967216;
                        } else if (j == 2663791924L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967217;
                        } else if (j == 552460711) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967218;
                        } else if (j == 3309267607L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967219;
                        } else if (j == 3392928934L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967220;
                        } else if (j == 1476730334) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967221;
                        } else if (j == 2787414090L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967222;
                        } else if (j == 1842238165) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967223;
                        } else if (j == 1409168701) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967224;
                        } else if (j == 4202722125L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967225;
                        } else if (j == 3777303324L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967226;
                        } else if (j == 3036058638L) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967227;
                        } else if (j == 1838858770) {
                            c1335360y = anonymousClass612.A00;
                            i = 2131967228;
                        } else {
                            if (j == 2687447524L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_frx_report_confirmation_title_multiple_participants;
                            } else if (j == 3703512788L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967229;
                            } else if (j == 2946060451L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_gcu_countdown_banner_duration_in_days;
                            } else if (j == 302578079) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_gcu_countdown_banner_duration_in_hours;
                            } else if (j == 395269442) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967230;
                            } else if (j == 2328607153L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967231;
                            } else if (j == 2421404052L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967232;
                            } else if (j == 3556004296L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967233;
                            } else if (j == 419452941) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967234;
                            } else if (j == 332067790) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967235;
                            } else if (j == 2825963945L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967236;
                            } else if (j == 2738377270L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967237;
                            } else if (j == 4104801443L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967238;
                            } else if (j == 106753124) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967239;
                            } else if (j == 1632438790) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967240;
                            } else if (j == 252453639) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967241;
                            } else if (j == 2873794299L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_group_invite_unconnected_members_context_line;
                            } else if (j == 97659463) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967242;
                            } else if (j == 4188755900L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967243;
                            } else if (j == 1180028459) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967244;
                            } else if (j == 976964098) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967245;
                            } else if (j == 2454063523L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967246;
                            } else if (j == 1169722123) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967247;
                            } else if (j == 3172565491L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967248;
                            } else if (j == 1408407859) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967249;
                            } else if (j == 3571858562L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967250;
                            } else if (j == 2502955356L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967251;
                            } else if (j == 566447157) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967252;
                            } else if (j == 3081488691L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967253;
                            } else if (j == 3189788435L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967254;
                            } else if (j == 1001161756) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967255;
                            } else if (j == 1152489407) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_local_user_added_many_participants_to_group;
                            } else if (j == 1312597606) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967256;
                            } else if (j == 4100124491L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967257;
                            } else if (j == 3021408534L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967258;
                            } else if (j == 1441104711) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967259;
                            } else if (j == 2932234044L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967260;
                            } else if (j == 3793069769L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967261;
                            } else if (j == 2206534318L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967262;
                            } else if (j == 1341486158) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967263;
                            } else if (j == 3871280423L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967264;
                            } else if (j == 2263224952L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967265;
                            } else if (j == 2520537482L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967266;
                            } else if (j == 3081154596L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967267;
                            } else if (j == 1678327890) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_local_user_removed_many_patricipants_from_group;
                            } else if (j == 1269777591) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967268;
                            } else if (j == 2619176165L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967269;
                            } else if (j == 3578293948L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967270;
                            } else if (j == 1996174156) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967271;
                            } else if (j == 2123025586) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967272;
                            } else if (j == 3175510165L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967273;
                            } else if (j == 2481946419L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967274;
                            } else if (j == 3228772439L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967275;
                            } else if (j == 583735121) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967276;
                            } else if (j == 3213390103L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967277;
                            } else if (j == 2752926330L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967278;
                            } else if (j == 818718202) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967279;
                            } else if (j == 3214566093L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967280;
                            } else if (j == 4218973055L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967281;
                            } else if (j == 1504978072) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967282;
                            } else if (j == 2823590666L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_lsrtc__call__unnamed_raised_hands;
                            } else if (j == 855861863) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967283;
                            } else if (j == 1959788660) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967284;
                            } else if (j == 960401405) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967285;
                            } else if (j == 2406111723L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_lsrtc__rooms__pending_join_requests;
                            } else if (j == 1377039397) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967286;
                            } else if (j == 2188537665L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967287;
                            } else if (j == 2271753583L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967288;
                            } else if (j == 4202375146L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967289;
                            } else if (j == 3759961657L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967290;
                            } else if (j == 619834630) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967291;
                            } else if (j == 2470519185L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967292;
                            } else if (j == 1829358194) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967293;
                            } else if (j == 22497873) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967294;
                            } else if (j == 54010343) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967295;
                            } else if (j == 1558833931) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967296;
                            } else if (j == 2893323338L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967297;
                            } else if (j == 794702564) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967298;
                            } else if (j == 4195016252L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967299;
                            } else if (j == 2134054378) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_magic_word_changed_by_theme_multiple;
                            } else if (j == 4234158573L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967300;
                            } else if (j == 1261030047) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_magic_word_changed_with_adding_and_removing_by_local_user;
                            } else if (j == 3556159534L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_magic_word_changed_with_adding_and_removing_by_other_user;
                            } else if (j == 1172511062) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_magic_word_changed_with_multiple_adding_by_local_user;
                            } else if (j == 151595051) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_magic_word_changed_with_multiple_adding_by_other_user;
                            } else if (j == 3509041542L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_magic_word_changed_with_multiple_removing_by_local_user;
                            } else if (j == 1668446465) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_magic_word_changed_with_multiple_removing_by_other_user;
                            } else if (j == 1410061658) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967301;
                            } else if (j == 1288670617) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967302;
                            } else if (j == 1585354106) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967303;
                            } else if (j == 691093777) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967304;
                            } else if (j == 1916220348) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967305;
                            } else if (j == 148977309) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967306;
                            } else if (j == 3028538686L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967307;
                            } else if (j == 4190155546L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967308;
                            } else if (j == 2387600182L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967309;
                            } else if (j == 2825646739L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967310;
                            } else if (j == 10896653) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967311;
                            } else if (j == 3077264699L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967312;
                            } else if (j == 963365967) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967313;
                            } else if (j == 3895537852L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967314;
                            } else if (j == 1953053104) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967315;
                            } else if (j == 1096046650) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967316;
                            } else if (j == 2959154545L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967317;
                            } else if (j == 2423804492L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967318;
                            } else if (j == 3587182302L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967319;
                            } else if (j == 906858223) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967320;
                            } else if (j == 712418821) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967321;
                            } else if (j == 3060138080L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967322;
                            } else if (j == 3832121515L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967323;
                            } else if (j == 2223833534L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967324;
                            } else if (j == 3573370838L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967325;
                            } else if (j == 3898872493L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967326;
                            } else if (j == 906694522) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967327;
                            } else if (j == 613491113) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967328;
                            } else if (j == 1731484330) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967329;
                            } else if (j == 264626090) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967330;
                            } else if (j == 890039137) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967331;
                            } else if (j == 1763930604) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967332;
                            } else if (j == 570947457) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967333;
                            } else if (j == 4193465337L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967334;
                            } else if (j == 39495439) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967335;
                            } else if (j == 1597506124) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967336;
                            } else if (j == 2473010911L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967337;
                            } else if (j == 3534772424L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967338;
                            } else if (j == 266425436) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967339;
                            } else if (j == 3715750199L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967340;
                            } else if (j == 2223812864L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967341;
                            } else if (j == 2939935300L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967342;
                            } else if (j == 3127126159L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967343;
                            } else if (j == 2030547800) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967344;
                            } else if (j == 1190499107) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967345;
                            } else if (j == 845860829) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967346;
                            } else if (j == 1760158542) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967347;
                            } else if (j == 91291525) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967348;
                            } else if (j == 1204825892) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967349;
                            } else if (j == 922230987) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967350;
                            } else if (j == 3102379514L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967351;
                            } else if (j == 1654117501) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967352;
                            } else if (j == 1117367749) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967353;
                            } else if (j == 96627672) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967354;
                            } else if (j == 3973170726L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967355;
                            } else if (j == 3398073665L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967356;
                            } else if (j == 4067567053L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_n_days;
                            } else if (j == 3788712889L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_n_hours;
                            } else if (j == 4025264410L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_n_minutes;
                            } else if (j == 810811342) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_n_seconds;
                            } else if (j == 2498963106L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967357;
                            } else if (j == 3266705860L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967358;
                            } else if (j == 3269811118L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967359;
                            } else if (j == 2124909174) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967360;
                            } else if (j == 1464200535) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967361;
                            } else if (j == 3079484196L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967362;
                            } else if (j == 3401319426L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967363;
                            } else if (j == 3179998692L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967364;
                            } else if (j == 3293732175L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967365;
                            } else if (j == 2263971700L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967366;
                            } else if (j == 1814475144) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967367;
                            } else if (j == 2942046773L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967368;
                            } else if (j == 768618958) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967369;
                            } else if (j == 2243064067L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967370;
                            } else if (j == 1157266475) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967371;
                            } else if (j == 4038125980L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967372;
                            } else if (j == 1568185147) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967373;
                            } else if (j == 238479749) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967374;
                            } else if (j == 2299955549L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967375;
                            } else if (j == 2731102939L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967376;
                            } else if (j == 2218338055L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967377;
                            } else if (j == 2725180311L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967378;
                            } else if (j == 1580555081) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967379;
                            } else if (j == 4254858706L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967380;
                            } else if (j == 3961386439L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967381;
                            } else if (j == 3183244485L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967382;
                            } else if (j == 588731307) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967383;
                            } else if (j == 721009237) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967384;
                            } else if (j == 3794504906L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967385;
                            } else if (j == 2217743655L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967386;
                            } else if (j == 3754199748L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967387;
                            } else if (j == 1704678812) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967388;
                            } else if (j == 3677389036L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967389;
                            } else if (j == 2778175347L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967390;
                            } else if (j == 1205945207) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967391;
                            } else if (j == 2378809549L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967392;
                            } else if (j == 2959234265L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967393;
                            } else if (j == 2165121155L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_notification_n_days_ago;
                            } else if (j == 2187725322L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_notification_n_hours_ago;
                            } else if (j == 3254807950L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_notification_n_minutes_ago;
                            } else if (j == 2022527333) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_notification_n_seconds_ago;
                            } else if (j == 2829373624L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967394;
                            } else if (j == 3328988243L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967395;
                            } else if (j == 906255711) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967396;
                            } else if (j == 2210062533L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967397;
                            } else if (j == 759182273) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967398;
                            } else if (j == 2868890429L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967399;
                            } else if (j == 1345860780) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967400;
                            } else if (j == 2857760904L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967401;
                            } else if (j == 71937184) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967402;
                            } else if (j == 3683746314L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967403;
                            } else if (j == 512578997) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967404;
                            } else if (j == 334614503) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967405;
                            } else if (j == 2542877376L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967406;
                            } else if (j == 410137364) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967407;
                            } else if (j == 418466398) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967408;
                            } else if (j == 2603066606L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967409;
                            } else if (j == 3865223613L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967410;
                            } else if (j == 2212255629L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967411;
                            } else if (j == 498252820) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967412;
                            } else if (j == 708131126) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967413;
                            } else if (j == 575803395) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967414;
                            } else if (j == 553536715) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967415;
                            } else if (j == 782199112) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967416;
                            } else if (j == 3976651468L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967417;
                            } else if (j == 3044601981L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967418;
                            } else if (j == 3410015091L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967419;
                            } else if (j == 727406735) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967420;
                            } else if (j == 407606055) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967421;
                            } else if (j == 2314749655L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967422;
                            } else if (j == 1142710288) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967423;
                            } else if (j == 3754288851L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967424;
                            } else if (j == 148051335) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967425;
                            } else if (j == 674724978) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967426;
                            } else if (j == 1024083856) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967427;
                            } else if (j == 3630388621L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967428;
                            } else if (j == 432609685) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967429;
                            } else if (j == 2846073024L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967430;
                            } else if (j == 1046050032) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967431;
                            } else if (j == 544469748) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967432;
                            } else if (j == 305686682) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967433;
                            } else if (j == 87045299) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967434;
                            } else if (j == 2075736077) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967435;
                            } else if (j == 776100014) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967436;
                            } else if (j == 324102699) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967437;
                            } else if (j == 3727951216L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967438;
                            } else if (j == 1436392316) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967439;
                            } else if (j == 1573147645) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967440;
                            } else if (j == 2986112681L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967441;
                            } else if (j == 1282190956) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967442;
                            } else if (j == 136327083) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967443;
                            } else if (j == 4110284045L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967444;
                            } else if (j == 2917825324L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_participant_added_local_user_and_many_participants_to_group;
                            } else if (j == 1459772704) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967445;
                            } else if (j == 3359225509L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967446;
                            } else if (j == 967717348) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_participant_added_many_other_participants_to_group;
                            } else if (j == 1112602528) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967447;
                            } else if (j == 304226694) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967448;
                            } else if (j == 1485917345) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967449;
                            } else if (j == 4054132672L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967450;
                            } else if (j == 2843712043L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967451;
                            } else if (j == 2558891077L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967452;
                            } else if (j == 3996581125L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967453;
                            } else if (j == 2854620577L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967454;
                            } else if (j == 3635413283L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967455;
                            } else if (j == 3188441761L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967456;
                            } else if (j == 127408036) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967457;
                            } else if (j == 64954188) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967458;
                            } else if (j == 1237974538) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967459;
                            } else if (j == 2354792333L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967460;
                            } else if (j == 2848576077L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_participant_removed_local_user_and_many_users_from_group;
                            } else if (j == 4281513968L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967461;
                            } else if (j == 3219096565L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967462;
                            } else if (j == 125446723) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_participant_removed_many_other_participants_from_group;
                            } else if (j == 3741039842L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967463;
                            } else if (j == 2258463339L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967464;
                            } else if (j == 417320452) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967465;
                            } else if (j == 3248415388L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967466;
                            } else if (j == 30231110) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967467;
                            } else if (j == 2495152934L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967468;
                            } else if (j == 460690791) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967469;
                            } else if (j == 2274308318L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967470;
                            } else if (j == 177780697) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967471;
                            } else if (j == 808887409) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_people_will_see_chat_history;
                            } else if (j == 225272337) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967473;
                            } else if (j == 3846122487L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967474;
                            } else if (j == 1895134698) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967475;
                            } else if (j == 3946882025L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967476;
                            } else if (j == 1007904881) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967477;
                            } else if (j == 4076429478L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967478;
                            } else if (j == 1746841661) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967479;
                            } else if (j == 3851512428L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967480;
                            } else if (j == 4128523729L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967481;
                            } else if (j == 332428431) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967482;
                            } else if (j == 728287340) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967483;
                            } else if (j == 935065572) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967484;
                            } else if (j == 2931301705L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967485;
                            } else if (j == 1803981242) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967486;
                            } else if (j == 546453035) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967487;
                            } else if (j == 1953285645) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967488;
                            } else if (j == 2032219441) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967489;
                            } else if (j == 946141610) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967490;
                            } else if (j == 74031375) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967491;
                            } else if (j == 671671985) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967492;
                            } else if (j == 2326001928L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967493;
                            } else if (j == 3615088715L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967494;
                            } else if (j == 2985817569L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967495;
                            } else if (j == 4088630271L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967496;
                            } else if (j == 1977723727) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967497;
                            } else if (j == 3755450448L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967498;
                            } else if (j == 4017109280L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967499;
                            } else if (j == 1471939380) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967500;
                            } else if (j == 788837313) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967501;
                            } else if (j == 3956961021L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967502;
                            } else if (j == 1061619618) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967503;
                            } else if (j == 3198532380L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967504;
                            } else if (j == 2986094529L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967505;
                            } else if (j == 3189716382L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967506;
                            } else if (j == 2621910546L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967507;
                            } else if (j == 4131388766L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967508;
                            } else if (j == 2228806553L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967509;
                            } else if (j == 1976551188) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967510;
                            } else if (j == 909763584) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967511;
                            } else if (j == 3808927156L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967512;
                            } else if (j == 1074050822) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967513;
                            } else if (j == 2299736172L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967514;
                            } else if (j == 3718206836L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967515;
                            } else if (j == 1071176509) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967516;
                            } else if (j == 2388272378L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967517;
                            } else if (j == 1718738941) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967518;
                            } else if (j == 267928829) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967519;
                            } else if (j == 654647807) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967520;
                            } else if (j == 229328461) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967521;
                            } else if (j == 1028212486) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967522;
                            } else if (j == 2222715283L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967523;
                            } else if (j == 637772287) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967524;
                            } else if (j == 2403787513L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967525;
                            } else if (j == 1763279325) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967526;
                            } else if (j == 881530159) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967527;
                            } else if (j == 86954382) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967528;
                            } else if (j == 3851469264L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967529;
                            } else if (j == 637491914) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967530;
                            } else if (j == 3884069348L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967531;
                            } else if (j == 1827274265) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967532;
                            } else if (j == 2716311659L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967533;
                            } else if (j == 1724302672) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967534;
                            } else if (j == 2180676819L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967535;
                            } else if (j == 4042714435L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967536;
                            } else if (j == 2856257764L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967537;
                            } else if (j == 422318626) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967538;
                            } else if (j == 3249529577L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967539;
                            } else if (j == 977668107) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967540;
                            } else if (j == 29992306) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967541;
                            } else if (j == 1241683361) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967542;
                            } else if (j == 3278006617L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967543;
                            } else if (j == 802303421) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967544;
                            } else if (j == 3657653495L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967545;
                            } else if (j == 2279683494L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967546;
                            } else if (j == 4101599893L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967547;
                            } else if (j == 2062953892) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967548;
                            } else if (j == 3821927880L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967549;
                            } else if (j == 564667047) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967550;
                            } else if (j == 1909196141) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967551;
                            } else if (j == 1377989441) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967552;
                            } else if (j == 2243204720L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967553;
                            } else if (j == 2492840579L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967554;
                            } else if (j == 1331517244) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967555;
                            } else if (j == 2483539837L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967556;
                            } else if (j == 4268313975L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967557;
                            } else if (j == 57631969) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967558;
                            } else if (j == 905279400) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967559;
                            } else if (j == 2141524349) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967560;
                            } else if (j == 1972925828) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967561;
                            } else if (j == 2496075789L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967562;
                            } else if (j == 3616753588L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967563;
                            } else if (j == 2049487664) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967564;
                            } else if (j == 2137074491) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967565;
                            } else if (j == 4290072867L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967566;
                            } else if (j == 1411114110) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967567;
                            } else if (j == 1914710727) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967568;
                            } else if (j == 2306513885L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967569;
                            } else if (j == 3482297405L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967570;
                            } else if (j == 1570791548) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967571;
                            } else if (j == 2018100702) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967572;
                            } else if (j == 2424015732L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967573;
                            } else if (j == 526939029) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967574;
                            } else if (j == 596508569) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967575;
                            } else if (j == 1277525008) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967576;
                            } else if (j == 1489795951) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967577;
                            } else if (j == 412666748) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967578;
                            } else if (j == 1781797647) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967579;
                            } else if (j == 1396722712) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967580;
                            } else if (j == 3724109297L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967581;
                            } else if (j == 3205632920L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967582;
                            } else if (j == 1224692235) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967583;
                            } else if (j == 166747943) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967584;
                            } else if (j == 2095143145) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967585;
                            } else if (j == 4289154007L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967586;
                            } else if (j == 2500308431L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967587;
                            } else if (j == 3465887178L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967588;
                            } else if (j == 3478278933L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967589;
                            } else if (j == 3663074273L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967590;
                            } else if (j == 3110112854L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967591;
                            } else if (j == 3896948676L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967592;
                            } else if (j == 927156205) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967593;
                            } else if (j == 4053718283L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967594;
                            } else if (j == 2153482366L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967595;
                            } else if (j == 2859297558L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967596;
                            } else if (j == 2575554539L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967597;
                            } else if (j == 1866265772) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967598;
                            } else if (j == 237641126) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967599;
                            } else if (j == 2263254657L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967600;
                            } else if (j == 252861704) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967601;
                            } else if (j == 4021472212L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967602;
                            } else if (j == 4109027418L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967603;
                            } else if (j == 3204298403L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967604;
                            } else if (j == 180771875) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967605;
                            } else if (j == 3674292925L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967606;
                            } else if (j == 3864221936L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967607;
                            } else if (j == 3598027334L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967608;
                            } else if (j == 2440362539L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967609;
                            } else if (j == 3851917726L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967610;
                            } else if (j == 4239043732L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967611;
                            } else if (j == 4084221829L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967612;
                            } else if (j == 630258326) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967613;
                            } else if (j == 1586015033) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967614;
                            } else if (j == 3037506538L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967615;
                            } else if (j == 48494299) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967616;
                            } else if (j == 565177455) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967617;
                            } else if (j == 1962145663) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967618;
                            } else if (j == 3638187679L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967619;
                            } else if (j == 1215255207) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967620;
                            } else if (j == 1049750609) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967621;
                            } else if (j == 1380593436) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967622;
                            } else if (j == 487562157) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967623;
                            } else if (j == 385618594) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967624;
                            } else if (j == 3629301213L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967625;
                            } else if (j == 1343624602) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967626;
                            } else if (j == 944277706) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967627;
                            } else if (j == 50086692) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967628;
                            } else if (j == 2805491663L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967629;
                            } else if (j == 1400535582) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967630;
                            } else if (j == 1264659379) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967631;
                            } else if (j == 3296895666L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967632;
                            } else if (j == 900653449) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967633;
                            } else if (j == 2505366314L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967634;
                            } else if (j == 41556880) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967635;
                            } else if (j == 4293565063L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967636;
                            } else if (j == 926441317) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967637;
                            } else if (j == 2155977331L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967638;
                            } else if (j == 2667611744L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967639;
                            } else if (j == 1040630339) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967640;
                            } else if (j == 2619032001L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967641;
                            } else if (j == 3481046031L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967642;
                            } else if (j == 2085328875) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967643;
                            } else if (j == 3679446279L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967644;
                            } else if (j == 41055787) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967645;
                            } else if (j == 772521413) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967646;
                            } else if (j == 1806333491) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967647;
                            } else if (j == 1919617780) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967648;
                            } else if (j == 3526783449L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967649;
                            } else if (j == 720008247) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967650;
                            } else if (j == 14433707) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967651;
                            } else if (j == 2438195531L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967652;
                            } else if (j == 3357184854L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967653;
                            } else if (j == 1516729027) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967654;
                            } else if (j == 1783097751) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967655;
                            } else if (j == 2821664890L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967656;
                            } else if (j == 2733774082L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967657;
                            } else if (j == 2443136511L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967658;
                            } else if (j == 2315082726L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967659;
                            } else if (j == 907320839) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967660;
                            } else if (j == 2822242551L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967661;
                            } else if (j == 3523893327L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967662;
                            } else if (j == 1906747636) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967663;
                            } else if (j == 3650637732L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967664;
                            } else if (j == 2214161459L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967665;
                            } else if (j == 773312660) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967666;
                            } else if (j == 660474612) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967667;
                            } else if (j == 2358418220L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967668;
                            } else if (j == 4101382174L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967669;
                            } else if (j == 2864814710L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967670;
                            } else if (j == 115122045) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967671;
                            } else if (j == 215294274) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967672;
                            } else if (j == 3278843845L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967673;
                            } else if (j == 229390669) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967674;
                            } else if (j == 1039912268) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_shared_album_local_user_added_to_album;
                            } else if (j == 1513277045) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967675;
                            } else if (j == 3997856729L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967676;
                            } else if (j == 3893286985L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_shared_album_local_user_removed_album_content;
                            } else if (j == 3681487790L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967677;
                            } else if (j == 1501290624) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_shared_album_participant_added_to_album;
                            } else if (j == 3319356260L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967678;
                            } else if (j == 2776440796L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967679;
                            } else if (j == 3469148161L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_shared_album_participant_removed_album_content;
                            } else if (j == 314162080) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967680;
                            } else if (j == 2856782249L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967681;
                            } else if (j == 213871160) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967682;
                            } else if (j == 2599036082L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967683;
                            } else if (j == 1345525915) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967684;
                            } else if (j == 3922846965L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967685;
                            } else if (j == 4287928985L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967686;
                            } else if (j == 2811825300L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967687;
                            } else if (j == 3477295087L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967688;
                            } else if (j == 3777445034L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967689;
                            } else if (j == 221865409) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967690;
                            } else if (j == 1830104689) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967691;
                            } else if (j == 4118902177L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967692;
                            } else if (j == 276268293) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967693;
                            } else if (j == 114720726) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967694;
                            } else if (j == 1757299125) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967695;
                            } else if (j == 325019219) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967696;
                            } else if (j == 2626683841L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967697;
                            } else if (j == 620055318) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967698;
                            } else if (j == 876189232) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967699;
                            } else if (j == 3803861325L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967700;
                            } else if (j == 209841928) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967701;
                            } else if (j == 3356038564L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967702;
                            } else if (j == 1698351782) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967703;
                            } else if (j == 4264863726L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967704;
                            } else if (j == 3195804830L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967705;
                            } else if (j == 213055887) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967706;
                            } else if (j == 1165428923) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967707;
                            } else if (j == 1256635784) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967708;
                            } else if (j == 235496580) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967709;
                            } else if (j == 2124284689) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967710;
                            } else if (j == 2917209849L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967711;
                            } else if (j == 1783972021) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967712;
                            } else if (j == 890894404) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967713;
                            } else if (j == 4243895902L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967714;
                            } else if (j == 214079381) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967715;
                            } else if (j == 808362462) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967716;
                            } else if (j == 1756948113) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967717;
                            } else if (j == 3881264387L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967718;
                            } else if (j == 835176016) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967719;
                            } else if (j == 2539936785L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967720;
                            } else if (j == 1802438484) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967721;
                            } else if (j == 2857598707L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967722;
                            } else if (j == 2309437854L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967723;
                            } else if (j == 2785659263L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967724;
                            } else if (j == 143639053) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967725;
                            } else if (j == 2290504156L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967726;
                            } else if (j == 4174533562L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_unknown_user_add_local_user_and_many_participants_to_group;
                            } else if (j == 3023910424L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967727;
                            } else if (j == 3227134857L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_unknown_user_added_many_participants_to_group;
                            } else if (j == 2866037131L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967728;
                            } else if (j == 1515334293) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967729;
                            } else if (j == 2599008821L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967730;
                            } else if (j == 4159639329L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967731;
                            } else if (j == 3351234003L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967732;
                            } else if (j == 3912654967L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967733;
                            } else if (j == 719269197) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967734;
                            } else if (j == 943306484) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_unknown_user_removed_local_user_and_many_participants_from_group;
                            } else if (j == 1967989484) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967735;
                            } else if (j == 90286844) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_unknown_user_removed_many_participants_from_group;
                            } else if (j == 2998535335L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967736;
                            } else if (j == 3413410473L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967737;
                            } else if (j == 319705603) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967738;
                            } else if (j == 2469553621L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967739;
                            } else if (j == 2136235345) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967740;
                            } else if (j == 2685479226L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967741;
                            } else if (j == 1013247498) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967742;
                            } else if (j == 3809705863L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967743;
                            } else if (j == 592307011) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967744;
                            } else if (j == 117632813) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967745;
                            } else if (j == 2629978221L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967746;
                            } else if (j == 334235334) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967747;
                            } else if (j == 2810268827L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967748;
                            } else if (j == 1674028593) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967749;
                            } else if (j == 3850606650L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967750;
                            } else if (j == 992095692) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967751;
                            } else if (j == 1119941646) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967752;
                            } else if (j == 2237798011L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967753;
                            } else if (j == 244838164) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967754;
                            } else if (j == 1175793565) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967755;
                            } else if (j == 4284538956L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967756;
                            } else if (j == 1987804615) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967757;
                            } else if (j == 3718640992L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967758;
                            } else if (j == 1025663101) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967759;
                            } else if (j == 478685604) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967760;
                            } else if (j == 340369936) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967761;
                            } else if (j == 2105821834) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967762;
                            } else if (j == 1076145369) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967763;
                            } else if (j == 1595203710) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967764;
                            } else if (j == 2423716972L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967765;
                            } else if (j == 931917891) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967766;
                            } else if (j == 658188734) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967767;
                            } else if (j == 2016726514) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967768;
                            } else if (j == 2979227796L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967769;
                            } else if (j == 2788217335L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967770;
                            } else if (j == 3634598954L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967771;
                            } else if (j == 1035154490) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967772;
                            } else if (j == 2466321802L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967773;
                            } else if (j == 425002059) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967774;
                            } else if (j == 2843305756L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967775;
                            } else if (j == 114694394) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967776;
                            } else if (j == 345045875) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967777;
                            } else if (j == 2581158466L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967778;
                            } else if (j == 657401777) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967779;
                            } else if (j == 2484568741L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967780;
                            } else if (j == 1630467632) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967781;
                            } else if (j == 346318205) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967782;
                            } else if (j == 4200624961L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967783;
                            } else if (j == 909027286) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967784;
                            } else if (j == 64465657) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967785;
                            } else if (j == 3895093443L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967786;
                            } else if (j == 764894553) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967787;
                            } else if (j == 726145923) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967788;
                            } else if (j == 3919350638L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967789;
                            } else if (j == 2292948504L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967790;
                            } else if (j == 3330125856L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967791;
                            } else if (j == 3884280695L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967792;
                            } else if (j == 3217301887L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967793;
                            } else if (j == 2921274388L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967794;
                            } else if (j == 3526051098L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967795;
                            } else if (j == 3989800917L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967796;
                            } else if (j == 2150735179L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967797;
                            } else if (j == 4184708537L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967798;
                            } else if (j == 2300438242L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967799;
                            } else if (j == 1060295494) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967800;
                            } else if (j == 3508856445L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967801;
                            } else if (j == 3983245924L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967802;
                            } else if (j == 411922494) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967803;
                            } else if (j == 3981976272L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967804;
                            } else if (j == 3538868075L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967805;
                            } else if (j == 1679247044) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967806;
                            } else if (j == 2232381352L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967807;
                            } else if (j == 2542579599L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967808;
                            } else if (j == 282291176) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967809;
                            } else if (j == 2015407045) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967810;
                            } else if (j == 479219708) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967811;
                            } else if (j == 1970280488) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967812;
                            } else if (j == 1020259582) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967813;
                            } else if (j == 3223052417L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967814;
                            } else if (j == 2011930659) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967815;
                            } else if (j == 3367842883L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967816;
                            } else if (j == 3491864225L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967817;
                            } else if (j == 381988415) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967818;
                            } else if (j == 381879385) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967819;
                            } else if (j == 2639796515L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967820;
                            } else if (j == 2062139944) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967821;
                            } else if (j == 1546683385) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967822;
                            } else if (j == 373070950) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967823;
                            } else if (j == 1890485478) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967824;
                            } else if (j == 1275938431) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_you_added_people;
                            } else if (j == 3610657384L) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_you_added_people_with_names;
                            } else if (j == 3278050495L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967825;
                            } else if (j == 2209219973L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967826;
                            } else if (j == 1232510560) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967827;
                            } else if (j == 2524258025L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967828;
                            } else if (j == 1731572808) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967829;
                            } else if (j == 2675603132L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967830;
                            } else if (j == 653882427) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967831;
                            } else if (j == 1485384827) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967832;
                            } else if (j == 1556712457) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967833;
                            } else if (j == 119793430) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967834;
                            } else if (j == 1122736512) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967835;
                            } else if (j == 705614308) {
                                c1335360y2 = anonymousClass612.A00;
                                i2 = R.plurals.msys_you_sent_photos;
                            } else if (j == 3759817031L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967836;
                            } else if (j == 392493418) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967837;
                            } else if (j == 3627704327L) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967838;
                            } else if (j == 925623791) {
                                c1335360y = anonymousClass612.A00;
                                i = 2131967839;
                            } else {
                                return null;
                            }
                            obj = objArr[2];
                            return c1335360y2.A00.getResources().getQuantityString(i2, ((Number) obj).intValue(), objArr);
                        }
                        obj = objArr[1];
                        return c1335360y2.A00.getResources().getQuantityString(i2, ((Number) obj).intValue(), objArr);
                    }
                    obj = objArr[0];
                    return c1335360y2.A00.getResources().getQuantityString(i2, ((Number) obj).intValue(), objArr);
                }
                return c1335360y.A00.getResources().getString(i, objArr);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("Failed to resolve localized string with strResource ");
                sb.append(j);
                sb.append(", with arg count ");
                sb.append(objArr.length);
                sb.append(", and arg types: ");
                for (Object obj2 : objArr) {
                    sb.append(obj2.getClass().getName());
                    sb.append(" ");
                }
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }
        return null;
    }
}
