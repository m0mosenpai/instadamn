package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class CowatchCaptionLocale {
    public static C2N9 CONVERTER = C55648OnZ.A00(23);
    public static long sMcfTypeId;
    public final String captionsUrl;
    public final String locale;
    public final String localizedCountry;
    public final String localizedCreationMethod;
    public final String localizedLanguage;

    public static native CowatchCaptionLocale createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchCaptionLocale)) {
                return false;
            }
            CowatchCaptionLocale cowatchCaptionLocale = (CowatchCaptionLocale) obj;
            if (this.locale.equals(cowatchCaptionLocale.locale)) {
                String str = this.localizedLanguage;
                String str2 = cowatchCaptionLocale.localizedLanguage;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.localizedCountry;
                String str4 = cowatchCaptionLocale.localizedCountry;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.localizedCreationMethod;
                String str6 = cowatchCaptionLocale.localizedCreationMethod;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                String str7 = this.captionsUrl;
                String str8 = cowatchCaptionLocale.captionsUrl;
                if (str7 != null) {
                    if (!str7.equals(str8)) {
                        return false;
                    }
                } else if (str8 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AbstractC50523MSb.A02(this.locale) + AbstractC167017dG.A0O(this.localizedLanguage)) * 31) + AbstractC167017dG.A0O(this.localizedCountry)) * 31) + AbstractC167017dG.A0O(this.localizedCreationMethod)) * 31) + AbstractC25227BEk.A07(this.captionsUrl);
    }

    public CowatchCaptionLocale(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.locale = str;
        this.localizedLanguage = str2;
        this.localizedCountry = str3;
        this.localizedCreationMethod = str4;
        this.captionsUrl = str5;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchCaptionLocale{locale=");
        A1C.append(this.locale);
        A1C.append(",localizedLanguage=");
        A1C.append(this.localizedLanguage);
        A1C.append(",localizedCountry=");
        A1C.append(this.localizedCountry);
        A1C.append(",localizedCreationMethod=");
        A1C.append(this.localizedCreationMethod);
        A1C.append(",captionsUrl=");
        return AbstractC50523MSb.A0W(this.captionsUrl, A1C);
    }
}
