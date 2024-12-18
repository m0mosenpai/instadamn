package X;

import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23171Aw implements InterfaceC23181Ax {
    public abstract C23191Ay A01();

    @Override // X.InterfaceC23181Ax
    public File CHo(C1MG c1mg, int i) {
        String str;
        HashMap hashMap = new HashMap();
        if (c1mg != null) {
            Map map = c1mg.A02;
            C14360o3.A06(map);
            hashMap.putAll(map);
        }
        C1B0 A02 = AbstractC23201Az.A02(i);
        if (A02 != null && A02.A00 && !hashMap.containsKey("__scope__")) {
            String Bqg = Bqg();
            if (Bqg != null && !AbstractC001900j.A0T(Bqg)) {
                str = String.valueOf(Bqg());
            } else {
                str = "__out_of_scope__";
            }
            hashMap.put("__scope__", str);
        }
        C23191Ay A01 = A01();
        Pair A00 = C1B3.A00(i);
        String A03 = AbstractC23201Az.A03(i);
        if (TextUtils.isEmpty(A03)) {
            A03 = null;
        } else {
            String[] strArr = C1B3.A00;
            int i2 = 0;
            do {
                String str2 = strArr[i2];
                if (A03.contains(str2)) {
                    String str3 = (String) hashMap.get(str2);
                    if (!TextUtils.isEmpty(str3)) {
                        A03 = A03.replace(str2, str3);
                    }
                }
                i2++;
            } while (i2 < 3);
        }
        Object obj = A00.first;
        Object obj2 = A00.second;
        if (A03 != null) {
            obj2 = AnonymousClass001.A0g((String) obj2, "/", A03);
        }
        File A012 = A01.A01(new Pair(obj, obj2));
        C14360o3.A07(A012);
        return A012;
    }

    @Override // X.InterfaceC23181Ax
    public File AXd(C1MG c1mg, int i) {
        File file;
        File CHo = CHo(c1mg, i);
        if (c1mg != null && (file = c1mg.A01) != null) {
            AbstractC50432Tm.A00(file, CHo, false);
        }
        CHo.mkdirs();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            CHo.setLastModified(currentTimeMillis);
        }
        return CHo;
    }
}
