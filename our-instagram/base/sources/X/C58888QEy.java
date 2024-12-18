package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.QEy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58888QEy extends AbstractC63955Swf {
    public static final String[] A01 = {"https://apps.samsung.com", "samsungapps://cloudgame/play"};
    public static final ArrayList A00 = AbstractC166987dD.A1F(Collections.singletonList("com.sec.android.app.samsungapps"));

    @Override // X.InterfaceC65539TmB
    public final boolean F8o(Context context, Bundle bundle) {
        String string = bundle.getString("package_name");
        if (string == null) {
            return false;
        }
        return AbstractC63955Swf.A02(context, new Uri.Builder().scheme("samsungapps").authority("ProductDetail").appendPath(string).build(), bundle);
    }

    @Override // X.InterfaceC65539TmB
    public final Bundle ALk(String str, String str2, boolean z) {
        Bundle A0N = AbstractC58321PtD.A0N(str, str2, z);
        A0N.putStringArrayList("package_names", A00);
        return A0N;
    }

    @Override // X.InterfaceC65539TmB
    public final boolean F8p(Context context, Bundle bundle) {
        String string = bundle.getString("url");
        if (string == null) {
            return false;
        }
        String[] strArr = A01;
        int i = 0;
        while (!string.startsWith(strArr[i])) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return AbstractC63955Swf.A02(context, AbstractC08820cl.A03(string), bundle);
    }
}
