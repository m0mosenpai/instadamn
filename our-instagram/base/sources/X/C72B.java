package X;

import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.72B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C72B implements InterfaceC13050lr {
    public SearchContext A00;

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A00 = null;
    }

    public final void A00(C11520jB c11520jB) {
        SearchContext searchContext = this.A00;
        if (searchContext != null) {
            c11520jB.A00.put("search_context", searchContext.A00());
        }
    }
}
