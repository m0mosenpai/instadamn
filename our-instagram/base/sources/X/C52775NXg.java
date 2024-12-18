package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.NXg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52775NXg extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "NewsfeedFilterSelectorFragment";
    public OI0 A00;
    public MUR A01;
    public final String A03 = "newsfeed_filter_selector";
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.setBackgroundResource(AbstractC53242c7.A02(getContext()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
    
        if (r2 == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A00() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52775NXg.A00():java.util.ArrayList");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-585240065);
        super.onResume();
        setItems(A00());
        C0f9.A09(1706676334, A02);
    }
}
