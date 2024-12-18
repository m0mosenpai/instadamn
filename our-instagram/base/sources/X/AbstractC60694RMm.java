package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.RMm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60694RMm extends AbstractC63371Sic {
    public boolean A00;

    public static void A05(String str, Object obj, int i) {
        String str2 = (String) SVM.A0D.A00;
        if (android.util.Log.isLoggable(str2, i)) {
            android.util.Log.println(i, str2, AbstractC63371Sic.A07(str, obj, null, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.RFv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void A0H() {
        int i;
        int i2;
        if (this instanceof C60682RMa) {
            C60682RMa c60682RMa = (C60682RMa) this;
            C63335Shm c63335Shm = ((AbstractC63371Sic) c60682RMa).A00;
            Context context = c63335Shm.A00;
            try {
                ApplicationInfo A0C = AbstractC58320PtC.A0C(context, context.getPackageManager());
                if (A0C != null) {
                    Bundle bundle = ((PackageItemInfo) A0C).metaData;
                    if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0) {
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i3 = -1;
                        ?? r5 = -1;
                        r5 = -1;
                        try {
                            XmlResourceParser xml = c63335Shm.A01.getResources().getXml(i);
                            try {
                                xml.next();
                                int eventType = xml.getEventType();
                                while (eventType != 1) {
                                    if (xml.getEventType() == 2) {
                                        String lowerCase = xml.getName().toLowerCase(Locale.US);
                                        if (!lowerCase.equals("screenname")) {
                                            if (lowerCase.equals(IgNetworkingModule.REQUEST_BODY_KEY_STRING)) {
                                                String attributeValue = xml.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                                String trim = xml.nextText().trim();
                                                if (!TextUtils.isEmpty(attributeValue) && trim != null) {
                                                    if ("ga_appName".equals(attributeValue)) {
                                                        str = trim;
                                                    } else if ("ga_appVersion".equals(attributeValue)) {
                                                        str2 = trim;
                                                    } else if ("ga_logLevel".equals(attributeValue)) {
                                                        str3 = trim;
                                                    } else {
                                                        C60687RMf c60687RMf = c63335Shm.A0C;
                                                        C63335Shm.A02(c60687RMf);
                                                        c60687RMf.A0F("String xml configuration name not recognized", attributeValue);
                                                    }
                                                }
                                            } else if (lowerCase.equals("bool")) {
                                                String attributeValue2 = xml.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                                String trim2 = xml.nextText().trim();
                                                if (!TextUtils.isEmpty(attributeValue2) && !TextUtils.isEmpty(trim2)) {
                                                    try {
                                                        boolean parseBoolean = Boolean.parseBoolean(trim2);
                                                        if ("ga_dryRun".equals(attributeValue2)) {
                                                            r5 = parseBoolean;
                                                        } else {
                                                            C60687RMf c60687RMf2 = c63335Shm.A0C;
                                                            C63335Shm.A02(c60687RMf2);
                                                            c60687RMf2.A0F("Bool xml configuration name not recognized", attributeValue2);
                                                        }
                                                    } catch (NumberFormatException e) {
                                                        C60687RMf c60687RMf3 = c63335Shm.A0C;
                                                        if (c60687RMf3 != null) {
                                                            AbstractC63371Sic.A0B(trim2, e, null, "Error parsing bool configuration value", 5);
                                                            c60687RMf3.A0K(trim2, e, null, "Error parsing bool configuration value", 5);
                                                        } else {
                                                            AbstractC63371Sic.A0B(trim2, e, null, "Error parsing bool configuration value", 5);
                                                        }
                                                    }
                                                }
                                            } else if (lowerCase.equals("integer")) {
                                                String attributeValue3 = xml.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                                String trim3 = xml.nextText().trim();
                                                if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                                                    try {
                                                        int parseInt = Integer.parseInt(trim3);
                                                        if ("ga_dispatchPeriod".equals(attributeValue3)) {
                                                            i3 = parseInt;
                                                        } else {
                                                            C60687RMf c60687RMf4 = c63335Shm.A0C;
                                                            C63335Shm.A02(c60687RMf4);
                                                            c60687RMf4.A0F("Int xml configuration name not recognized", attributeValue3);
                                                        }
                                                    } catch (NumberFormatException e2) {
                                                        C60687RMf c60687RMf5 = c63335Shm.A0C;
                                                        if (c60687RMf5 != null) {
                                                            AbstractC63371Sic.A0B(trim3, e2, null, "Error parsing int configuration value", 5);
                                                            c60687RMf5.A0K(trim3, e2, null, "Error parsing int configuration value", 5);
                                                        } else {
                                                            AbstractC63371Sic.A0B(trim3, e2, null, "Error parsing int configuration value", 5);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            String attributeValue4 = xml.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                            String trim4 = xml.nextText().trim();
                                            if (!TextUtils.isEmpty(attributeValue4)) {
                                                TextUtils.isEmpty(trim4);
                                            }
                                        }
                                    }
                                    eventType = xml.next();
                                    r5 = r5;
                                }
                            } catch (IOException | XmlPullParserException e3) {
                                C60687RMf c60687RMf6 = c63335Shm.A0C;
                                if (c60687RMf6 != null) {
                                    A05("Error parsing tracker configuration file", e3, 6);
                                    c60687RMf6.A0K(e3, null, null, "Error parsing tracker configuration file", 6);
                                } else {
                                    A05("Error parsing tracker configuration file", e3, 6);
                                }
                            }
                            AbstractC63371Sic.A09(c60682RMa, "Loading global XML config values", 2);
                            boolean z = false;
                            if (str != null) {
                                c60682RMa.A01 = str;
                                c60682RMa.A0E("XML config - app name", str);
                            }
                            if (str2 != null) {
                                c60682RMa.A02 = str2;
                                c60682RMa.A0E("XML config - app version", str2);
                            }
                            if (AbstractC167007dF.A1W(str3)) {
                                String lowerCase2 = str3.toLowerCase(Locale.US);
                                if ("verbose".equals(lowerCase2)) {
                                    i2 = 0;
                                } else if ("info".equals(lowerCase2)) {
                                    i2 = 1;
                                } else if ("warning".equals(lowerCase2)) {
                                    i2 = 2;
                                } else if ("error".equals(lowerCase2)) {
                                    i2 = 3;
                                }
                                c60682RMa.A0D("XML config - log level", Integer.valueOf(i2));
                            }
                            if (i3 >= 0) {
                                c60682RMa.A00 = i3;
                                c60682RMa.A03 = true;
                                c60682RMa.A0E("XML config - dispatch period (sec)", Integer.valueOf(i3));
                            }
                            if (r5 != -1) {
                                if (r5 == 1) {
                                    z = true;
                                }
                                c60682RMa.A05 = z;
                                c60682RMa.A04 = true;
                                c60682RMa.A0E("XML config - dry run", Boolean.valueOf(z));
                                return;
                            }
                            return;
                        } catch (Resources.NotFoundException e4) {
                            C60687RMf c60687RMf7 = c63335Shm.A0C;
                            if (c60687RMf7 != null) {
                                A05("inflate() called with unknown resourceId", e4, 5);
                                c60687RMf7.A0K(e4, null, null, "inflate() called with unknown resourceId", 5);
                                return;
                            } else {
                                A05("inflate() called with unknown resourceId", e4, 5);
                                return;
                            }
                        }
                    }
                    return;
                }
            } catch (PackageManager.NameNotFoundException e5) {
                c60682RMa.A0F("PackageManager doesn't know about the app package", e5);
            }
            AbstractC63371Sic.A09(c60682RMa, "Couldn't get ApplicationInfo to load global config", 5);
            return;
        }
        if (this instanceof C60688RMg) {
            C60688RMg c60688RMg = (C60688RMg) this;
            c60688RMg.A00 = AbstractC58318PtA.A0F(((AbstractC63371Sic) c60688RMg).A00.A00, "com.google.android.gms.analytics.prefs");
            return;
        }
        if (this instanceof C60691RMj) {
            C60691RMj c60691RMj = (C60691RMj) this;
            c60691RMj.A0D("Network initialized. User agent", c60691RMj.A01);
            return;
        }
        if (this instanceof C60687RMf) {
            C60687RMf c60687RMf8 = (C60687RMf) this;
            synchronized (C60687RMf.class) {
                C60687RMf.A00 = c60687RMf8;
            }
            return;
        }
        if (this instanceof C60686RMe) {
            C60686RMe c60686RMe = (C60686RMe) this;
            try {
                c60686RMe.A0J();
                if (AbstractC166987dD.A0N(SVM.A0I.A00) > 0) {
                    Context context2 = ((AbstractC63371Sic) c60686RMe).A00.A00;
                    ActivityInfo receiverInfo = context2.getPackageManager().getReceiverInfo(new ComponentName(context2, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                    if (receiverInfo != null && ((ComponentInfo) receiverInfo).enabled) {
                        AbstractC63371Sic.A09(c60686RMe, "Receiver registered for local dispatch.", 2);
                        c60686RMe.A01 = true;
                        return;
                    }
                    return;
                }
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                return;
            }
        }
        if (!(this instanceof RMZ) && !(this instanceof C60685RMd)) {
            if (this instanceof C60692RMk) {
                C60692RMk c60692RMk = (C60692RMk) this;
                C60693RMl c60693RMl = c60692RMk.A04;
                c60693RMl.A0H();
                ((AbstractC60694RMm) c60693RMl).A00 = true;
                C60691RMj c60691RMj2 = c60692RMk.A07;
                c60691RMj2.A0H();
                ((AbstractC60694RMm) c60691RMj2).A00 = true;
                C60689RMh c60689RMh = c60692RMk.A03;
                c60689RMh.A0H();
                ((AbstractC60694RMm) c60689RMh).A00 = true;
                return;
            }
            if (this instanceof C60684RMc) {
                C60684RMc c60684RMc = (C60684RMc) this;
                C63335Shm c63335Shm2 = ((AbstractC63371Sic) c60684RMc).A00;
                SX6 sx6 = c63335Shm2.A03;
                C3U5.A02(sx6);
                if (sx6.A05 == null) {
                    synchronized (sx6) {
                        if (sx6.A05 == null) {
                            ?? obj = new Object();
                            Context context3 = sx6.A01;
                            PackageManager packageManager = context3.getPackageManager();
                            String packageName = context3.getPackageName();
                            obj.A02 = packageName;
                            obj.A03 = packageManager.getInstallerPackageName(packageName);
                            String str4 = null;
                            try {
                                PackageInfo packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                                if (packageInfo != null) {
                                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                    if (!TextUtils.isEmpty(applicationLabel)) {
                                        packageName = applicationLabel.toString();
                                    }
                                    str4 = packageInfo.versionName;
                                }
                            } catch (PackageManager.NameNotFoundException unused2) {
                                android.util.Log.e("GAv4", AbstractC58321PtD.A0v("Error retrieving package info: appName set to ", packageName));
                            }
                            obj.A00 = packageName;
                            obj.A01 = str4;
                            sx6.A05 = obj;
                        }
                    }
                }
                C60645RFv c60645RFv = sx6.A05;
                C60645RFv c60645RFv2 = c60684RMc.A00;
                c60645RFv.A03(c60645RFv2);
                C60682RMa c60682RMa2 = c63335Shm2.A0E;
                C63335Shm.A02(c60682RMa2);
                c60682RMa2.A0I();
                String str5 = c60682RMa2.A01;
                if (str5 != null) {
                    c60645RFv2.A00 = str5;
                }
                c60682RMa2.A0I();
                String str6 = c60682RMa2.A02;
                if (str6 != null) {
                    c60645RFv2.A01 = str6;
                    return;
                }
                return;
            }
            if (!(this instanceof C60693RMl) && !(this instanceof C60689RMh) && (this instanceof C60683RMb)) {
                C60692RMk c60692RMk2 = ((C60683RMb) this).A00;
                c60692RMk2.A0H();
                ((AbstractC60694RMm) c60692RMk2).A00 = true;
            }
        }
    }

    public final void A0I() {
        if (this.A00) {
        } else {
            throw AbstractC166987dD.A14("Not initialized");
        }
    }
}
