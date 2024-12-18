package X;

import android.text.TextUtils;
import android.util.Base64;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rtj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61789Rtj {
    public static final String A00(long j, List list) {
        C14360o3.A0B(list, 1);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(j);
        A1C.append(';');
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] address = ((InetAddress) it.next()).getAddress();
            C14360o3.A07(address);
            String encodeToString = Base64.encodeToString(address, 3);
            C14360o3.A07(encodeToString);
            A0q.add(encodeToString);
        }
        String join = TextUtils.join(";", A0q);
        C14360o3.A07(join);
        return AbstractC166997dE.A0x(join, A1C);
    }
}
