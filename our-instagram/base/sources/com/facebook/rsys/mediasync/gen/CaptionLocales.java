package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class CaptionLocales {
    public static C2N9 CONVERTER = C55648OnZ.A00(41);
    public static long sMcfTypeId;
    public final String captionsUrl;
    public final String locale;
    public final String localizedCountry;
    public final String localizedCreationMethod;
    public final String localizedLanguage;

    public static native CaptionLocales createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CaptionLocales)) {
                return false;
            }
            CaptionLocales captionLocales = (CaptionLocales) obj;
            if (this.locale.equals(captionLocales.locale) && this.localizedLanguage.equals(captionLocales.localizedLanguage)) {
                String str = this.localizedCountry;
                String str2 = captionLocales.localizedCountry;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.localizedCreationMethod;
                String str4 = captionLocales.localizedCreationMethod;
                if (str3 != null) {
                    if (!str3.equals(str4)) {
                        return false;
                    }
                } else if (str4 != null) {
                    return false;
                }
                if (!this.captionsUrl.equals(captionLocales.captionsUrl)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.captionsUrl, (((AbstractC166997dE.A0K(this.localizedLanguage, AbstractC50523MSb.A02(this.locale)) + AbstractC167017dG.A0O(this.localizedCountry)) * 31) + AbstractC25227BEk.A07(this.localizedCreationMethod)) * 31);
    }

    public CaptionLocales(String str, String str2, String str3, String str4, String str5) {
        AbstractC31180DnO.A1U(str, str2, str5);
        this.locale = str;
        this.localizedLanguage = str2;
        this.localizedCountry = str3;
        this.localizedCreationMethod = str4;
        this.captionsUrl = str5;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CaptionLocales{locale=");
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
