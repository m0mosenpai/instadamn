package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.1Th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC27081Th {
    public static String A00(String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -372468771:
                if (str.equals("zh-Hans")) {
                    c = 0;
                    break;
                }
                break;
            case -372468770:
                if (str.equals("zh-Hant")) {
                    c = 1;
                    break;
                }
                break;
            case 96598143:
                if (str.equals("en-GB")) {
                    c = 2;
                    break;
                }
                break;
            case 96747053:
                if (str.equals("es-ES")) {
                    c = 3;
                    break;
                }
                break;
            case 97164344:
                if (str.equals("fb-LS")) {
                    c = 4;
                    break;
                }
                break;
            case 97640703:
                if (str.equals("fr-CA")) {
                    c = 5;
                    break;
                }
                break;
            case 106935917:
                if (str.equals("pt-PT")) {
                    c = 6;
                    break;
                }
                break;
            case 115813226:
                if (str.equals("zh-CN")) {
                    c = 7;
                    break;
                }
                break;
            case 115813378:
                if (str.equals("zh-HK")) {
                    c = '\b';
                    break;
                }
                break;
            case 115813762:
                if (str.equals("zh-TW")) {
                    c = '\t';
                    break;
                }
                break;
            case 1978381403:
                if (str.equals("zh-Hans-CN")) {
                    c = '\n';
                    break;
                }
                break;
            case 1978411346:
                if (str.equals("zh-Hant-HK")) {
                    c = 11;
                    break;
                }
                break;
            case 1978411730:
                if (str.equals("zh-Hant-TW")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 7:
            case '\n':
                return "zh_CN";
            case 1:
            case '\t':
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "zh_TW";
            case 2:
                return "en_GB";
            case 3:
                return "es_ES";
            case 4:
                return "fb_LS";
            case 5:
                return "fr_CA";
            case 6:
                return "pt_PT";
            case '\b':
            case 11:
                return "zh_HK";
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if (r0 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A01(java.util.Locale r6) {
        /*
            Method dump skipped, instructions count: 2350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC27081Th.A01(java.util.Locale):java.lang.String");
    }
}
