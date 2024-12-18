package X;

import com.facebook.litho.LithoView;

/* renamed from: X.7ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC170917ji extends C3OO {
    public LithoView A00() {
        C169737hn c169737hn = (C169737hn) this;
        if (c169737hn.A01) {
            return (LithoView) c169737hn.itemView;
        }
        return null;
    }

    public void A01(LithoView lithoView, int i, int i2, int i3, int i4, boolean z) {
        lithoView.setLayoutParams(new C169747ho(i, i2, i3, i4));
    }
}
