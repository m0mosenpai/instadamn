package X;

import android.view.View;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class D23 implements Runnable {
    public AbstractC89933zZ A00;
    public View A01;
    public final /* synthetic */ C79793hU A02;

    public D23(View view, AbstractC89933zZ abstractC89933zZ, C79793hU c79793hU) {
        this.A02 = c79793hU;
        this.A00 = abstractC89933zZ;
        this.A01 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        C79793hU c79793hU = this.A02;
        BSR bsr = (BSR) this.A00;
        C57352kA c57352kA = bsr.A00;
        boolean z = bsr.A04;
        C85163r7 c85163r7 = bsr.A01;
        C84923qg c84923qg = c85163r7.A01;
        AnonymousClass341 anonymousClass341 = c85163r7.A03;
        boolean z2 = bsr.A03;
        SearchContext searchContext = bsr.A02;
        C3AG c3ag = c85163r7.A04;
        C75113Zb c75113Zb = c85163r7.A02;
        if (c75113Zb != null && (hashMap = c75113Zb.A1d) != null) {
            hashMap.put("tap_area", "text_area");
        } else {
            hashMap = null;
        }
        C57352kA.A08(c84923qg, anonymousClass341, c57352kA, c3ag, searchContext, hashMap, z, z2);
        c79793hU.A0F = true;
    }
}
