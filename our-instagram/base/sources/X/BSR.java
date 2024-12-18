package X;

import android.text.TextPaint;
import android.view.View;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class BSR extends AbstractC89933zZ {
    public final /* synthetic */ C57352kA A00;
    public final /* synthetic */ C85163r7 A01;
    public final /* synthetic */ SearchContext A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public BSR(C57352kA c57352kA, C85163r7 c85163r7, SearchContext searchContext, boolean z, boolean z2) {
        this.A00 = c57352kA;
        this.A04 = z;
        this.A01 = c85163r7;
        this.A03 = z2;
        this.A02 = searchContext;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        HashMap hashMap;
        if (view != null) {
            C57352kA c57352kA = this.A00;
            boolean z = this.A04;
            C85163r7 c85163r7 = this.A01;
            C84923qg c84923qg = c85163r7.A01;
            AnonymousClass341 anonymousClass341 = c85163r7.A03;
            boolean z2 = this.A03;
            SearchContext searchContext = this.A02;
            C3AG c3ag = c85163r7.A04;
            C75113Zb c75113Zb = c85163r7.A02;
            if (c75113Zb != null && (hashMap = c75113Zb.A1d) != null) {
                hashMap.put("tap_area", "text_area");
            } else {
                hashMap = null;
            }
            C57352kA.A08(c84923qg, anonymousClass341, c57352kA, c3ag, searchContext, hashMap, z, z2);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.A01.A01.A06 != EnumC84933qh.A09) {
            textPaint.setAlpha(64);
        }
    }
}
