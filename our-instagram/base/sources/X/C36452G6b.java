package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.G6b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36452G6b implements GZ4 {
    public final /* synthetic */ SettableFuture A00;

    public C36452G6b(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    @Override // X.GZ4
    public final void D7S(Throwable th) {
        this.A00.set(null);
    }

    @Override // X.GZ4
    public final void D7T(List list) {
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                A0p.put(((FQI) it.next()).A00());
            } catch (JSONException e) {
                C0K8.A0F("InstagramContactHelper", "Skip one contact serialization due to error", e);
            }
        }
        this.A00.set(A0p);
    }
}
