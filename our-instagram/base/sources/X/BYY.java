package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class BYY extends ClickableSpan {
    public final /* synthetic */ C57352kA A00;
    public final /* synthetic */ C85163r7 A01;
    public final /* synthetic */ SearchContext A02;

    public BYY(C57352kA c57352kA, C85163r7 c85163r7, SearchContext searchContext) {
        this.A00 = c57352kA;
        this.A01 = c85163r7;
        this.A02 = searchContext;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        HashMap hashMap;
        C57352kA c57352kA = this.A00;
        C85163r7 c85163r7 = this.A01;
        C84923qg c84923qg = c85163r7.A01;
        boolean A02 = c84923qg.A02();
        AnonymousClass341 anonymousClass341 = c85163r7.A03;
        SearchContext searchContext = this.A02;
        C3AG c3ag = c85163r7.A04;
        C75113Zb c75113Zb = c85163r7.A02;
        if (c75113Zb != null && (hashMap = c75113Zb.A1d) != null) {
            hashMap.put("tap_area", "icon_area");
        } else {
            hashMap = null;
        }
        C57352kA.A08(c84923qg, anonymousClass341, c57352kA, c3ag, searchContext, hashMap, A02, false);
    }
}
