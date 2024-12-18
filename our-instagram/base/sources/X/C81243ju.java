package X;

import com.facebook.R;
import com.facebook.litho.LithoView;

/* renamed from: X.3ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81243ju extends C78933fz {
    public final LithoView A00;

    public final C42644Iu1 A00() {
        LithoView lithoView = this.A00;
        Object tag = lithoView.getTag(R.id.litho_carousel_activate_index);
        Object tag2 = lithoView.getTag(R.id.litho_media_content);
        if ((tag instanceof Integer) && (tag2 instanceof CP2)) {
            return (C42644Iu1) ((CP2) tag2).A00.get(Integer.valueOf(((Number) tag).intValue()));
        }
        return null;
    }

    public C81243ju(LithoView lithoView) {
        super(lithoView);
        this.A00 = lithoView;
    }
}
