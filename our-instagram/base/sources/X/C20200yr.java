package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20200yr extends AbstractC001600g {
    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        C14360o3.A0B(obj, 1);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
        C14360o3.A07(putExtra);
        return putExtra;
    }

    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        int[] intArrayExtra;
        boolean z = false;
        if (intent != null && i == -1 && (intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS")) != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ C00f A01(Context context, Object obj) {
        String str = (String) obj;
        C14360o3.A0B(str, 1);
        if (C02G.A00(context, str) == 0) {
            return new C00f(true);
        }
        return null;
    }
}
