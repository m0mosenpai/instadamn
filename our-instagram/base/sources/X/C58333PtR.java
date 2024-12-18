package X;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.PtR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58333PtR {
    public final InterfaceC08100bW A01;
    public final boolean A03;
    public final Context A04;
    public final HashSet A05;
    public boolean A00 = false;
    public final HashMap A02 = AbstractC166987dD.A1G();

    public C58333PtR(Context context, ProviderInfo providerInfo, InterfaceC08100bW interfaceC08100bW, String str) {
        HashSet A0k;
        StringBuilder A1C;
        this.A04 = context;
        this.A01 = interfaceC08100bW;
        if (providerInfo == null) {
            A1C = AbstractC166987dD.A1C();
            A1C.append("Could not retrieve provider info for ");
            A1C.append(str);
        } else {
            this.A03 = providerInfo.grantUriPermissions;
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "com.facebook.secure.fileprovider.SECURE_FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                A1C = AbstractC166987dD.A1C();
                A1C.append("Could not read ");
                A1C.append("com.facebook.secure.fileprovider.SECURE_FILE_PROVIDER_PATHS");
                A1C.append(" meta-data");
            } else {
                LinkedList A11 = AbstractC58318PtA.A11();
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next != 1) {
                        if (next == 2) {
                            String name = loadXmlMetaData.getName();
                            if ("paths".equals(name)) {
                                continue;
                            } else {
                                EnumC58332PtQ enumC58332PtQ = (EnumC58332PtQ) EnumC58332PtQ.A03.get(name);
                                if (enumC58332PtQ != null) {
                                    A11.add(new C58334PtS(enumC58332PtQ, loadXmlMetaData.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), loadXmlMetaData.getAttributeValue(null, "path")));
                                } else {
                                    throw AbstractC167007dF.A0c("Unrecognized storage root ", name);
                                }
                            }
                        }
                    } else {
                        A0k = AbstractC31171DnF.A0k(A11);
                        break;
                    }
                }
                this.A05 = A0k;
            }
        }
        interfaceC08100bW.EHA("SecureRootPathManager", A1C.toString(), null);
        A0k = AbstractC166987dD.A1H();
        this.A05 = A0k;
    }

    public static void A00(C58333PtR c58333PtR) {
        if (!c58333PtR.A00) {
            HashMap hashMap = c58333PtR.A02;
            synchronized (hashMap) {
                if (!c58333PtR.A00) {
                    Iterator it = c58333PtR.A05.iterator();
                    while (it.hasNext()) {
                        C58334PtS c58334PtS = (C58334PtS) it.next();
                        String str = c58334PtS.A01;
                        File A00 = c58334PtS.A00.A00(c58333PtR.A04);
                        String str2 = new String[]{c58334PtS.A02}[0];
                        if (str2 != null) {
                            String trim = str2.trim();
                            if (trim.trim().length() != 0) {
                                A00 = MSW.A0w(A00, trim);
                            }
                        }
                        if (str != null && str.trim().length() != 0) {
                            hashMap.put(str, A00.getCanonicalFile());
                        } else {
                            c58333PtR.A01.EHA("SecureRootPathManager", "Path names may not be empty", null);
                        }
                    }
                    c58333PtR.A00 = true;
                }
            }
        }
    }
}
