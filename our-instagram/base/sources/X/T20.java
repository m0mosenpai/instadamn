package X;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.common.dextricks.OdexSchemeArtTurbo;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class T20 implements InterfaceC65502TlR {
    public static final String[] A02 = {"base.odex", "base.vdex", "base.art", "base.oat"};
    public static final String[] A03 = {"arm", "arm64", "x86", "x86_64"};
    public final Context A00;
    public final String[] A01;

    @Override // X.InterfaceC65502TlR
    public final String CgW() {
        return IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE;
    }

    public T20(Context context, String[] strArr) {
        AbstractC167017dG.A1P(context, strArr);
        this.A00 = context;
        this.A01 = strArr;
    }

    @Override // X.InterfaceC65502TlR
    public final HashMap E6N() {
        File absoluteFile;
        HashMap A1G = AbstractC166987dD.A1G();
        Context context = this.A00;
        File A11 = AbstractC166987dD.A11(context.getPackageCodePath());
        R7z r7z = new R7z(AbstractC73583Rk.A01(A11));
        A1G.put("apk", r7z);
        File parentFile = A11.getParentFile();
        if (parentFile != null) {
            try {
                absoluteFile = parentFile.getCanonicalFile();
            } catch (IOException unused) {
                absoluteFile = parentFile.getAbsoluteFile();
            }
            C14360o3.A07(absoluteFile);
            R7z r7z2 = new R7z(AbstractC73583Rk.A01(absoluteFile));
            C62673SLl c62673SLl = new C62673SLl(0L, 0L, 0L);
            File A0w = MSW.A0w(absoluteFile, OdexSchemeArtTurbo.OREO_ODEX_DIR);
            String[] strArr = A03;
            for (int i = 0; i < 4; i++) {
                File A0w2 = MSW.A0w(A0w, strArr[i]);
                String[] strArr2 = this.A01;
                for (int i2 = 0; i2 < 4; i2++) {
                    String str = strArr2[i2];
                    try {
                        int length = str.length() - 1;
                        int i3 = 0;
                        boolean z = false;
                        while (i3 <= length) {
                            int i4 = length;
                            if (!z) {
                                i4 = i3;
                            }
                            boolean A1S = AbstractC31175DnJ.A1S(C14360o3.A00(str.charAt(i4), 32));
                            if (!z) {
                                if (!A1S) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            } else {
                                if (!A1S) {
                                    break;
                                }
                                length--;
                            }
                        }
                        C62673SLl A01 = AbstractC73583Rk.A01(MSW.A0w(A0w2, AbstractC31177DnL.A0g(str, length, i3)));
                        if (A01.A02 != 0) {
                            c62673SLl = c62673SLl.A00(A01);
                            A1G.put(AnonymousClass001.A0R("<oat_dir>/", str), new R7z(A01));
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            R7z r7z3 = new R7z(c62673SLl);
            A1G.put("extra", r7z3);
            r7z = new R7z(r7z2.A00(r7z3));
        }
        long j = -1;
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (storageStatsManager != null && applicationInfo != null) {
            try {
                StorageStats queryStatsForUid = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid);
                C14360o3.A07(queryStatsForUid);
                j = queryStatsForUid.getAppBytes();
            } catch (IOException | SecurityException unused3) {
            }
        }
        if (j < 0) {
            A1G.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, r7z);
            return A1G;
        }
        A1G.put("bf_measurement", r7z);
        A1G.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, new C62673SLl(j, j, r7z.A01));
        return A1G;
    }
}
