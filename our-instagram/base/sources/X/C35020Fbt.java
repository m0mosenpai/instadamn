package X;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fbt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35020Fbt {
    public final ComponentActivity A00;
    public final AbstractC12990ll A01;
    public final boolean A02;

    public C35020Fbt(ComponentActivity componentActivity, AbstractC12990ll abstractC12990ll, boolean z) {
        C14360o3.A0B(abstractC12990ll, 2);
        this.A00 = componentActivity;
        this.A01 = abstractC12990ll;
        this.A02 = z;
        if (componentActivity.getApplication() != null) {
            AbstractC31176DnK.A0v(componentActivity);
        }
    }

    public static final ArrayList A00(List list) {
        C14360o3.A0B(list, 0);
        C58579Pxx c58579Pxx = new C58579Pxx();
        Object obj = new Object();
        C2I6.A00(true);
        c58579Pxx.A0A.add(new C58578Pxw(null, E6N.class, obj, false));
        Gson A00 = c58579Pxx.A00();
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(A00.A0B(it.next()));
        }
        return AbstractC166987dD.A1F(A0q);
    }

    public final ArrayList A01(Bundle bundle) {
        ArrayList<String> A1E;
        if (bundle == null || (A1E = bundle.getStringArrayList("ig_sso_accounts_array")) == null) {
            A1E = AbstractC166987dD.A1E();
        }
        C58579Pxx c58579Pxx = new C58579Pxx();
        Object obj = new Object();
        C2I6.A00(true);
        c58579Pxx.A0A.add(new C58578Pxw(null, E6N.class, obj, false));
        Gson A00 = c58579Pxx.A00();
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator<String> it = A1E.iterator();
        while (it.hasNext()) {
            A0q.add(A00.A09(AbstractC166987dD.A1B(it), E6N.class));
        }
        return A0q;
    }

    public final boolean A02() {
        C06090Tz c06090Tz;
        boolean z = this.A02;
        AbstractC12990ll abstractC12990ll = this.A01;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        return C18U.A06(c06090Tz, abstractC12990ll, 36312977825072711L);
    }
}
