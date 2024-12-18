package com.facebook.fbreact.i18n;

import X.AbstractC166987dD;
import X.AbstractC27081Th;
import X.AbstractC31174DnI;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.C217113x;
import X.InterfaceC217213y;
import X.R3M;
import X.RhX;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.facebook.fbreact.specs.NativeI18nSpec;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.module.annotations.ReactModule;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = "I18n")
/* loaded from: classes10.dex */
public class FbReactI18nModule extends NativeI18nSpec {
    public static final String NAME = "I18n";
    public final InterfaceC217213y mLocales;

    @Override // com.facebook.fbreact.specs.NativeI18nSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "I18n";
    }

    @Override // com.facebook.fbreact.specs.NativeI18nSpec
    public String getOverrideContent(String str) {
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeI18nSpec
    public Map getTypedExportedConstants() {
        ReactMarker.logMarker(RhX.A0H);
        InterfaceC217213y interfaceC217213y = this.mLocales;
        HashMap A11 = AbstractC31174DnI.A11(interfaceC217213y, 0);
        Locale AcP = interfaceC217213y.AcP();
        A11.put("localeIdentifier", AcP.toString());
        A11.put("localeCountryCode", AcP.getCountry());
        C217113x c217113x = (C217113x) interfaceC217213y;
        Locale locale = (Locale) c217113x.A01.get();
        if (locale == null) {
            locale = c217113x.C4D(c217113x.AcP());
        }
        A11.put("fbLocaleIdentifier", AbstractC27081Th.A01(locale));
        HashMap A1G = AbstractC166987dD.A1G();
        NumberFormat numberFormat = NumberFormat.getInstance(AcP);
        C14360o3.A0C(numberFormat, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(AcP);
        A1G.put("decimalSeparator", String.valueOf(decimalFormatSymbols.getDecimalSeparator()));
        A1G.put("numberDelimiter", String.valueOf(decimalFormatSymbols.getGroupingSeparator()));
        A1G.put("minDigitsForThousandsSeparator", Integer.valueOf(((DecimalFormat) numberFormat).getGroupingSize()));
        A11.put("FallbackNumberFormatConfig", A1G);
        ReactMarker.logMarker(RhX.A0G);
        return A11;
    }

    public FbReactI18nModule(R3M r3m, InterfaceC217213y interfaceC217213y) {
        super(r3m);
        this.mLocales = interfaceC217213y;
    }

    @Override // com.facebook.fbreact.specs.NativeI18nSpec
    public void setLocale(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C217113x c217113x = (C217113x) this.mLocales;
        synchronized (c217113x) {
            c217113x.A01.set(forLanguageTag);
        }
        Locale.setDefault(forLanguageTag);
        Resources resources = AbstractC58321PtD.A0b(this).getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(forLanguageTag);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
