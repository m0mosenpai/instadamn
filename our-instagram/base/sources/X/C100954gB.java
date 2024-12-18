package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.4gB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100954gB {
    public InterfaceC56392iX A00;
    public final int A01;
    public final int A02;
    public final View A03;

    public C100954gB(View view) {
        this.A03 = view;
        Context context = view.getContext();
        C14360o3.A07(context);
        this.A01 = (int) AbstractC13880nE.A04(context, 12);
        this.A02 = (int) AbstractC13880nE.A04(context, 25);
        this.A00 = AbstractC56372iV.A01(view.requireViewById(R.id.feed_carousel_screenshots_card_stub), false, false);
    }
}
