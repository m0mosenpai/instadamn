package X;

import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;

/* renamed from: X.EcO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32820EcO extends DirectSearchInboxFragment {
    public static final String __redex_internal_original_name = "DirectSearchInboxGlobalFragment";
    public boolean A00;

    @Override // com.instagram.direct.inbox.fragment.DirectSearchInboxFragment, X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        super.afterOnResume();
        if (!this.A00) {
            String string = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY");
            if (string != null) {
                C36010Fv8 A02 = A02();
                if (A02 != null) {
                    A02.A04(string);
                }
                C36010Fv8 A022 = A02();
                if (A022 != null) {
                    A022.DjS(string, string);
                }
            }
            this.A00 = true;
        }
    }
}
