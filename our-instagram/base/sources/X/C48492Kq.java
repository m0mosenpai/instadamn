package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.2Kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48492Kq {
    public static final C2KQ A02 = new C2KQ("SplitInstallInfoProvider");
    public final Context A00;
    public final String A01;

    public final C62646SKf A02(Bundle bundle) {
        C2KQ c2kq;
        Object[] objArr;
        String str;
        String str2;
        String str3;
        C62646SKf c62646SKf = null;
        if (bundle == null) {
            c2kq = A02;
            objArr = new Object[0];
            str = "No metadata found in Context.";
        } else {
            int i = bundle.getInt("com.android.vending.splits");
            if (i == 0) {
                c2kq = A02;
                objArr = new Object[0];
                str = "No metadata found in AndroidManifest.";
            } else {
                try {
                    XmlResourceParser xml = this.A00.getResources().getXml(i);
                    HashMap hashMap = new HashMap();
                    while (xml.next() != 1) {
                        try {
                            if (xml.getEventType() == 2) {
                                if (!xml.getName().equals("splits")) {
                                    int i2 = 1;
                                    while (true) {
                                        int next = xml.next();
                                        if (next != 2) {
                                            if (next == 3) {
                                                i2--;
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            i2++;
                                        }
                                        if (i2 != 0) {
                                        }
                                    }
                                } else {
                                    while (xml.next() != 3) {
                                        if (xml.getEventType() == 2) {
                                            if (xml.getName().equals("module")) {
                                                int i3 = 0;
                                                while (true) {
                                                    if (i3 >= xml.getAttributeCount()) {
                                                        break;
                                                    }
                                                    if (xml.getAttributeName(i3).equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                                                        String attributeValue = xml.getAttributeValue(i3);
                                                        if (attributeValue != null) {
                                                            while (xml.next() != 3) {
                                                                if (xml.getEventType() == 2) {
                                                                    if (!xml.getName().equals("language")) {
                                                                        int i4 = 1;
                                                                        while (true) {
                                                                            int next2 = xml.next();
                                                                            if (next2 != 2) {
                                                                                if (next2 == 3) {
                                                                                    i4--;
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            } else {
                                                                                i4++;
                                                                            }
                                                                            if (i4 != 0) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        while (xml.next() != 3) {
                                                                            if (xml.getEventType() == 2) {
                                                                                if (xml.getName().equals("entry")) {
                                                                                    int i5 = 0;
                                                                                    while (true) {
                                                                                        if (i5 < xml.getAttributeCount()) {
                                                                                            if (xml.getAttributeName(i5).equals("key")) {
                                                                                                str2 = xml.getAttributeValue(i5);
                                                                                                break;
                                                                                            }
                                                                                            i5++;
                                                                                        } else {
                                                                                            str2 = null;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int i6 = 0;
                                                                                    while (true) {
                                                                                        if (i6 < xml.getAttributeCount()) {
                                                                                            if (xml.getAttributeName(i6).equals("split")) {
                                                                                                str3 = xml.getAttributeValue(i6);
                                                                                                break;
                                                                                            }
                                                                                            i6++;
                                                                                        } else {
                                                                                            str3 = null;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int i7 = 1;
                                                                                    while (true) {
                                                                                        int next3 = xml.next();
                                                                                        if (next3 != 2) {
                                                                                            if (next3 == 3) {
                                                                                                i7--;
                                                                                            } else {
                                                                                                continue;
                                                                                            }
                                                                                        } else {
                                                                                            i7++;
                                                                                        }
                                                                                        if (i7 == 0) {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (str2 != null && str3 != null) {
                                                                                        if (!hashMap.containsKey(str2)) {
                                                                                            hashMap.put(str2, new HashMap());
                                                                                        }
                                                                                        ((Map) hashMap.get(str2)).put(attributeValue, str3);
                                                                                    }
                                                                                } else {
                                                                                    int i8 = 1;
                                                                                    while (true) {
                                                                                        int next4 = xml.next();
                                                                                        if (next4 != 2) {
                                                                                            if (next4 == 3) {
                                                                                                i8--;
                                                                                            } else {
                                                                                                continue;
                                                                                            }
                                                                                        } else {
                                                                                            i8++;
                                                                                        }
                                                                                        if (i8 != 0) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            }
                                            int i9 = 1;
                                            while (true) {
                                                int next5 = xml.next();
                                                if (next5 != 2) {
                                                    if (next5 == 3) {
                                                        i9--;
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    i9++;
                                                }
                                                if (i9 != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (IOException | IllegalStateException | XmlPullParserException e) {
                            android.util.Log.e("SplitInstall", "Error while parsing splits.xml", e);
                            c62646SKf = null;
                        }
                    }
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        hashMap2.put(entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
                    }
                    c62646SKf = new C62646SKf(Collections.unmodifiableMap(hashMap2));
                    if (c62646SKf == null) {
                        c2kq = A02;
                        objArr = new Object[0];
                        str = "Can't parse languages metadata.";
                    }
                    return c62646SKf;
                } catch (Resources.NotFoundException unused) {
                    A02.A04("Resource with languages metadata doesn't exist.", new Object[0]);
                    return null;
                }
            }
        }
        c2kq.A04(str, objArr);
        return c62646SKf;
    }

    public static final HashSet A00(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        Iterator it = A01(packageInfo).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.startsWith("config.") && !str.contains(".config.")) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final HashSet A01(PackageInfo packageInfo) {
        Bundle bundle = ((PackageItemInfo) packageInfo.applicationInfo).metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string != null && !string.isEmpty()) {
                Collections.addAll(hashSet, string.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, -1));
                hashSet.remove("");
                hashSet.remove("base");
            } else {
                A02.A01("App has no fused modules.", new Object[0]);
            }
        }
        String[] strArr = packageInfo.splitNames;
        C2KQ c2kq = A02;
        if (strArr != null) {
            c2kq.A01("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
            return hashSet;
        }
        c2kq.A01("No splits are found or app cannot be found in package manager.", new Object[0]);
        return hashSet;
    }

    public final HashSet A03() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.A00.getPackageManager().getPackageInfo(this.A01, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            A02.A02("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        if (packageInfo != null && packageInfo.applicationInfo != null) {
            return A00(packageInfo);
        }
        return new HashSet();
    }

    public C48492Kq(Context context) {
        this.A00 = context;
        this.A01 = context.getPackageName();
    }
}
