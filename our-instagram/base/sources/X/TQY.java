package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TQY implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C23016ACq A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public TQY(Context context, C23016ACq c23016ACq, Map map, boolean z) {
        this.A02 = map;
        this.A00 = context;
        this.A03 = z;
        this.A01 = c23016ACq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C63940SwF A00 = AbstractC61712RsT.A00();
            Iterator A15 = AbstractC166997dE.A15(this.A02);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                String str = (String) A1K.getKey();
                AbstractCollection abstractCollection = (AbstractCollection) A1K.getValue();
                if (!TextUtils.isEmpty(str) && abstractCollection != null) {
                    Iterator it = abstractCollection.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        A00.ESA(new C62604SIi(this.A00, A00, this.A01, str, str2, this.A03), str, str2);
                    }
                }
            }
            if (this.A03) {
                A00.flush();
            }
        } catch (Exception unused) {
        }
    }
}
