package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Vns, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69469Vns {
    public C57012jc A00;
    public final Context A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final IgImageView A0D;
    public final View A0E;

    public C69469Vns(View view) {
        this.A0E = view;
        this.A01 = view.getContext();
        ViewStub viewStub = (ViewStub) view.requireViewById(R.id.fundraiser_sticker_header_avatar_container_top_left_stub);
        viewStub.setLayoutResource(R.layout.profile_header_user_avatar);
        View inflate = viewStub.inflate();
        IgImageView igImageView = (IgImageView) inflate.requireViewById(R.id.row_profile_header_imageview);
        this.A0D = igImageView;
        igImageView.setVisibility(0);
        AbstractC31176DnK.A1D(inflate, R.id.reel_ring);
        this.A0A = (TextView) view.requireViewById(R.id.fundraiser_sticker_header_full_name);
        this.A05 = (TextView) view.requireViewById(R.id.fundraiser_sticker_header_business_category);
        C57012jc A0V = AbstractC31177DnL.A0V(view, R.id.fundraiser_sticker_header_metrics);
        this.A00 = A0V;
        View requireViewById = A0V.A01().requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_post_count_container);
        this.A04 = requireViewById;
        View requireViewById2 = this.A00.A01().requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_followers_container);
        this.A02 = requireViewById2;
        View requireViewById3 = this.A00.A01().requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_following_container);
        this.A03 = requireViewById3;
        this.A0C = (TextView) requireViewById.requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_count);
        this.A0B = (TextView) requireViewById.requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_label);
        this.A07 = (TextView) requireViewById2.requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_count);
        this.A06 = (TextView) requireViewById2.requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_label);
        this.A09 = (TextView) requireViewById3.requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_count);
        this.A08 = (TextView) requireViewById3.requireViewById(R.id.fundraiser_sticker_halfsheet_neue_header_textview_metric_label);
    }
}
