package X;

import android.text.TextUtils;
import android.view.View;
import com.facebook.R;

/* renamed from: X.0uW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17930uW extends AbstractC008603a {
    @Override // X.AbstractC008603a
    public final /* bridge */ /* synthetic */ void A03(View view, Object obj) {
        view.setAccessibilityPaneTitle((CharSequence) obj);
    }

    @Override // X.AbstractC008603a
    public final /* bridge */ /* synthetic */ boolean A04(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }

    public C17930uW() {
        super(CharSequence.class, R.id.tag_accessibility_pane_title, 8, 28);
    }

    @Override // X.AbstractC008603a
    public final /* bridge */ /* synthetic */ Object A01(View view) {
        return view.getAccessibilityPaneTitle();
    }
}
