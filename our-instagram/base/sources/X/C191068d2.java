package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8d2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191068d2 {
    public final Context A00;
    public final TargetViewSizeProvider A01;

    public final int A00() {
        return ((NineSixteenLayoutConfigImpl) this.A01).A06 - (AMo.A00(this.A00, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2);
    }

    public C191068d2(Context context, TargetViewSizeProvider targetViewSizeProvider) {
        this.A00 = context;
        this.A01 = targetViewSizeProvider;
    }
}
