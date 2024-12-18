package X;

import android.content.Context;
import java.util.BitSet;
import java.util.Map;

/* renamed from: X.IMw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41231IMw {
    public final Context A00;
    public final Map A04 = AbstractC166987dD.A1G();
    public final Map A03 = AbstractC166987dD.A1G();
    public final Map A02 = AbstractC166987dD.A1G();
    public final BitSet A01 = new BitSet(3);

    public final void A00(String str) {
        this.A04.put("ad_id", str);
        this.A01.set(0);
    }

    public final void A01(String str) {
        this.A04.put("tracking_token", str);
        this.A01.set(2);
    }

    public C41231IMw(Context context) {
        this.A00 = context;
    }
}
