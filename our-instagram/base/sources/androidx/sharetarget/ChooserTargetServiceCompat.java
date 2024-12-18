package androidx.sharetarget;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC43591JPw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58497PwQ;
import X.C58495PwN;
import X.C64524TIa;
import X.C72080XMy;
import X.CallableC58499PwS;
import X.CallableC64789TUd;
import X.SAE;
import X.SFL;
import X.SUP;
import X.TUH;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.direct.realtime.armadilloexpress.plugins.backupupdategenerator.IGBackupUpdateGeneratorPluginImplPostmailbox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class ChooserTargetServiceCompat extends ChooserTargetService {
    @Override // android.service.chooser.ChooserTargetService
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        List<C72080XMy> A1E;
        IconCompat iconCompat;
        Bitmap bitmap;
        SFL sfl;
        Context applicationContext = getApplicationContext();
        if (SUP.A01 == null) {
            synchronized (SUP.A00) {
                if (SUP.A01 == null) {
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Intent A0E = AbstractC58318PtA.A0E("android.intent.action.MAIN");
                    A0E.addCategory("android.intent.category.LAUNCHER");
                    A0E.setPackage(applicationContext.getPackageName());
                    List<ResolveInfo> queryIntentActivities = applicationContext.getPackageManager().queryIntentActivities(A0E, 128);
                    if (queryIntentActivities != null) {
                        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                        while (it.hasNext()) {
                            ActivityInfo activityInfo = it.next().activityInfo;
                            Bundle bundle = ((PackageItemInfo) activityInfo).metaData;
                            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                                ArrayList A1E3 = AbstractC166987dD.A1E();
                                XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(applicationContext.getPackageManager(), "android.app.shortcuts");
                                if (loadXmlMetaData == null) {
                                    throw AbstractC167007dF.A0c("Failed to open android.app.shortcuts meta-data resource of ", ((PackageItemInfo) activityInfo).name);
                                }
                                while (true) {
                                    try {
                                        int next = loadXmlMetaData.next();
                                        if (next == 1) {
                                            break;
                                        }
                                        if (next == 2 && loadXmlMetaData.getName().equals("share-target")) {
                                            String A00 = SUP.A00(loadXmlMetaData, "targetClass");
                                            ArrayList A1E4 = AbstractC166987dD.A1E();
                                            ArrayList A1E5 = AbstractC166987dD.A1E();
                                            while (true) {
                                                int next2 = loadXmlMetaData.next();
                                                if (next2 == 1) {
                                                    break;
                                                }
                                                if (next2 == 2) {
                                                    String name = loadXmlMetaData.getName();
                                                    if (!name.equals("data")) {
                                                        if (name.equals("category")) {
                                                            A1E5.add(SUP.A00(loadXmlMetaData, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                                                        }
                                                    } else {
                                                        SUP.A00(loadXmlMetaData, "scheme");
                                                        SUP.A00(loadXmlMetaData, "host");
                                                        SUP.A00(loadXmlMetaData, TraceFieldType.Port);
                                                        SUP.A00(loadXmlMetaData, "path");
                                                        SUP.A00(loadXmlMetaData, "pathPattern");
                                                        SUP.A00(loadXmlMetaData, "pathPrefix");
                                                        A1E4.add(new SAE(SUP.A00(loadXmlMetaData, IGBackupUpdateGeneratorPluginImplPostmailbox.KEY_MIME_TYPE)));
                                                    }
                                                } else if (next2 == 3 && loadXmlMetaData.getName().equals("share-target")) {
                                                    break;
                                                }
                                            }
                                            if (!A1E4.isEmpty() && A00 != null && !A1E5.isEmpty()) {
                                                sfl = new SFL(A00, (SAE[]) A1E4.toArray(new SAE[A1E4.size()]), AbstractC58319PtB.A1b(A1E5, A1E5.size()));
                                            } else {
                                                sfl = null;
                                            }
                                            if (sfl != null) {
                                                A1E3.add(sfl);
                                            }
                                        }
                                    } catch (Exception e) {
                                        Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
                                    }
                                }
                                loadXmlMetaData.close();
                                A1E2.addAll(A1E3);
                            }
                        }
                    }
                    SUP.A01 = A1E2;
                }
            }
        }
        ArrayList arrayList = SUP.A01;
        ArrayList A1E6 = AbstractC166987dD.A1E();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SFL sfl2 = (SFL) it2.next();
            if (sfl2.A00.equals(componentName.getClassName())) {
                SAE[] saeArr = sfl2.A01;
                int length = saeArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(saeArr[i].A00)) {
                        A1E6.add(sfl2);
                        break;
                    }
                    i++;
                }
            }
        }
        if (!A1E6.isEmpty()) {
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.getInstance(applicationContext);
            try {
                if (shortcutInfoCompatSaverImpl != null) {
                    A1E = (List) shortcutInfoCompatSaverImpl.A05.submit(new CallableC58499PwS(shortcutInfoCompatSaverImpl, 0)).get();
                } else {
                    A1E = AbstractC166987dD.A1E();
                }
                if (A1E != null && !A1E.isEmpty()) {
                    ArrayList A1E7 = AbstractC166987dD.A1E();
                    for (C72080XMy c72080XMy : A1E) {
                        Iterator it3 = A1E6.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                SFL sfl3 = (SFL) it3.next();
                                if (c72080XMy.A0F.containsAll(Arrays.asList(sfl3.A02))) {
                                    A1E7.add(new C64524TIa(new ComponentName(applicationContext.getPackageName(), sfl3.A00), c72080XMy));
                                    break;
                                }
                            }
                        }
                    }
                    if (A1E7.isEmpty()) {
                        return AbstractC166987dD.A1E();
                    }
                    Collections.sort(A1E7);
                    ArrayList A1E8 = AbstractC166987dD.A1E();
                    float f = 1.0f;
                    int i2 = ((C64524TIa) A1E7.get(0)).A01.A02;
                    Iterator it4 = A1E7.iterator();
                    while (it4.hasNext()) {
                        C64524TIa c64524TIa = (C64524TIa) it4.next();
                        C72080XMy c72080XMy2 = c64524TIa.A01;
                        Icon icon = null;
                        try {
                            C58495PwN c58495PwN = (C58495PwN) shortcutInfoCompatSaverImpl.A05.submit(new TUH(c72080XMy2.A0D, shortcutInfoCompatSaverImpl, 0)).get();
                            iconCompat = null;
                            if (c58495PwN != null) {
                                String str = c58495PwN.A02;
                                if (!TextUtils.isEmpty(str)) {
                                    int i3 = 0;
                                    try {
                                        i3 = shortcutInfoCompatSaverImpl.A00.getResources().getIdentifier(str, null, null);
                                    } catch (Exception unused) {
                                    }
                                    if (i3 != 0) {
                                        iconCompat = IconCompat.A00(shortcutInfoCompatSaverImpl.A00, i3);
                                    }
                                }
                                if (!TextUtils.isEmpty(c58495PwN.A01) && (bitmap = (Bitmap) shortcutInfoCompatSaverImpl.A06.submit(new CallableC64789TUd(0, shortcutInfoCompatSaverImpl, c58495PwN)).get()) != null) {
                                    iconCompat = IconCompat.A02(bitmap);
                                }
                            }
                        } catch (Exception e2) {
                            Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e2);
                            iconCompat = null;
                        }
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString(AbstractC43591JPw.A00(752), c72080XMy2.A0D);
                        int i4 = c72080XMy2.A02;
                        if (i2 != i4) {
                            f -= 0.01f;
                            i2 = i4;
                        }
                        CharSequence charSequence = c72080XMy2.A0B;
                        if (iconCompat != null) {
                            icon = AbstractC58497PwQ.A00(null, iconCompat);
                        }
                        A1E8.add(new ChooserTarget(charSequence, icon, f, c64524TIa.A00, A0b));
                    }
                    return A1E8;
                }
            } catch (Exception e3) {
                Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e3);
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }
}
