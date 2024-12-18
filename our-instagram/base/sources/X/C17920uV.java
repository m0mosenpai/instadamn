package X;

import android.text.TextUtils;
import android.view.View;
import com.facebook.R;

/* renamed from: X.0uV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17920uV extends AbstractC008603a {
    @Override // X.AbstractC008603a
    public final /* bridge */ /* synthetic */ void A03(View view, Object obj) {
        AbstractC009603k.A01(view, (CharSequence) obj);
    }

    @Override // X.AbstractC008603a
    public final /* bridge */ /* synthetic */ boolean A04(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }

    public C17920uV() {
        super(CharSequence.class, R.id.tag_state_description, 64, 30);
    }

    @Override // X.AbstractC008603a
    public final /* bridge */ /* synthetic */ Object A01(View view) {
        return AbstractC009603k.A00(view);
    }
}
