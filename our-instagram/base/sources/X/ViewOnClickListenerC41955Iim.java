package X;

import android.view.View;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.Iim, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41955Iim implements View.OnClickListener {
    public final /* synthetic */ ContextualFeedFragment A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;

    public ViewOnClickListenerC41955Iim(ContextualFeedFragment contextualFeedFragment, Integer num, String str) {
        this.A02 = str;
        this.A00 = contextualFeedFragment;
        this.A01 = num;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(426651283);
        String str = this.A02;
        ContextualFeedFragment contextualFeedFragment = this.A00;
        if (C14360o3.A0K(str, contextualFeedFragment.A0O)) {
            contextualFeedFragment.EMT();
        } else {
            Integer num = this.A01;
            String A01 = C3Z6.A01(num);
            String string = contextualFeedFragment.getString(C3Z6.A00(num));
            String A02 = C3Z6.A02(num);
            String A00 = C1EP.A00();
            C140966Yy A0r = AbstractC25225BEi.A0r(contextualFeedFragment.requireActivity(), ContextualFeedFragment.A00(contextualFeedFragment));
            ContextualFeedFragment contextualFeedFragment2 = new ContextualFeedFragment();
            contextualFeedFragment2.setArguments(C31569Dtv.A05(null, str, string, null, A01, A02, A00, null, true, false, true, false));
            AbstractC31175DnJ.A0s(null, contextualFeedFragment2, A0r);
        }
        C0f9.A0C(-2120595996, A05);
    }
}
