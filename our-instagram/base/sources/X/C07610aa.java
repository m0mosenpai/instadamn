package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0aa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07610aa {
    public final List A00 = Collections.synchronizedList(new ArrayList());

    public final void A00(Intent intent, String str, String str2, String str3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C07610aa) it.next()).A00(intent, str, str2, str3);
        }
    }
}
