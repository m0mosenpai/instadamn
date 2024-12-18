package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.4Ea, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92844Ea {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final HorizontalRecyclerPager A03;

    public C92844Ea(View view) {
        View findViewById = view.findViewById(R.id.channels_header_title);
        C14360o3.A07(findViewById);
        this.A02 = (IgTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.channels_header_subtitle);
        C14360o3.A07(findViewById2);
        this.A01 = (IgTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.channels_carousel_view);
        C14360o3.A07(findViewById3);
        HorizontalRecyclerPager horizontalRecyclerPager = (HorizontalRecyclerPager) findViewById3;
        this.A03 = horizontalRecyclerPager;
        View findViewById4 = view.findViewById(R.id.channels_see_all_button);
        C14360o3.A07(findViewById4);
        this.A00 = (IgTextView) findViewById4;
        Resources resources = view.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        horizontalRecyclerPager.A10(new C3YB(dimensionPixelSize, dimensionPixelSize));
        horizontalRecyclerPager.A01 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        horizontalRecyclerPager.A0S = false;
    }
}
