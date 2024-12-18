package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.widget.search.ImeBackButtonHandlerFrameLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Vnz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69476Vnz {
    public ListView A00;
    public RecyclerView A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final ImageView A09;
    public final C1I4 A0A;
    public final IgSimpleImageView A0B;
    public final IgSimpleImageView A0C;
    public final ColorFilterAlphaImageView A0D;
    public final ImeBackButtonHandlerFrameLayout A0E;
    public final SearchEditText A0F;

    public C69476Vnz(C1I2 c1i2, ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout, VgK vgK, boolean z) {
        this.A0E = imeBackButtonHandlerFrameLayout;
        this.A03 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_background_view);
        this.A08 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_bar_underline);
        this.A07 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_bar_shadow);
        this.A06 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_bar_rounded_background);
        View requireViewById = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_bar_field_container);
        this.A04 = requireViewById;
        SearchEditText searchEditText = (SearchEditText) imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_bar_real_field);
        this.A0F = searchEditText;
        this.A09 = (ImageView) imeBackButtonHandlerFrameLayout.requireViewById(R.id.dismiss_button);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) imeBackButtonHandlerFrameLayout.requireViewById(R.id.back_arrow);
        this.A0D = colorFilterAlphaImageView;
        this.A05 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_results_container);
        this.A02 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_loading_spinner);
        this.A0B = (IgSimpleImageView) imeBackButtonHandlerFrameLayout.requireViewById(R.id.meta_ai_search_btn);
        this.A0C = (IgSimpleImageView) imeBackButtonHandlerFrameLayout.requireViewById(R.id.meta_ai_share_button);
        ViewStub viewStub = (ViewStub) imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_overlay_list_stub);
        if (z) {
            viewStub.setLayoutResource(R.layout.search_recycler_view);
            RecyclerView recyclerView = (RecyclerView) viewStub.inflate();
            this.A01 = recyclerView;
            recyclerView.setNestedScrollingEnabled(false);
            if (c1i2 != null) {
                this.A0A = c1i2;
                this.A01.A14(c1i2);
            }
        } else {
            viewStub.setLayoutResource(R.layout.layout_listview);
            ListView listView = (ListView) viewStub.inflate();
            this.A00 = listView;
            if (c1i2 != null) {
                listView.setOnScrollListener(c1i2);
            }
        }
        if (vgK != null) {
            Integer num = vgK.A00;
            if (num != null) {
                colorFilterAlphaImageView.setVisibility(4);
                requireViewById.setPadding(num.intValue(), 0, 0, 0);
            }
            Integer num2 = vgK.A01;
            if (num2 != null) {
                searchEditText.setHint(num2.intValue());
            }
        }
    }
}
