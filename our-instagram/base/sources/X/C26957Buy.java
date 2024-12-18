package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Buy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26957Buy extends AbstractC65632xz {
    public final Context A00;
    public final C31535DtK A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
    }

    public C26957Buy(Context context, C31535DtK c31535DtK) {
        this.A00 = context;
        this.A01 = c31535DtK;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(934573693);
        AbstractC167017dG.A1P(view, obj);
        C14360o3.A0B(obj2, 3);
        Context context = this.A00;
        Object tag = view.getTag();
        if (tag != null) {
            C27937CSw c27937CSw = (C27937CSw) tag;
            int A0H = AbstractC166987dD.A0H(obj2);
            BJF bjf = (BJF) obj;
            C31535DtK c31535DtK = this.A01;
            AbstractC167007dF.A1K(context, c27937CSw);
            AbstractC167007dF.A1F(bjf, 3, c31535DtK);
            Resources resources = context.getResources();
            int i2 = R.dimen.abc_button_padding_horizontal_material;
            if (A0H == 0) {
                i2 = R.dimen.account_discovery_bottom_gap;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i2);
            View view2 = c27937CSw.A00;
            AbstractC13880nE.A0d(view2, dimensionPixelSize);
            view2.setBackgroundColor(0);
            LinearLayout linearLayout = c27937CSw.A01;
            AbstractC13880nE.A0a(linearLayout, linearLayout.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap));
            CircularImageView circularImageView = c27937CSw.A04;
            boolean z = bjf.A03;
            int i3 = R.drawable.profile_anonymous_user;
            if (z) {
                i3 = R.drawable.instagram_contacts_pano_outline_24;
            }
            AbstractC166997dE.A19(context, circularImageView, i3);
            circularImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ViewGroup.LayoutParams layoutParams = circularImageView.getLayoutParams();
            Resources resources2 = circularImageView.getResources();
            layoutParams.height = (int) resources2.getDimension(R.dimen.action_button_settings_height);
            layoutParams.width = (int) resources2.getDimension(R.dimen.action_button_settings_height);
            c27937CSw.A02.setText(bjf.A01);
            c27937CSw.A03.setText(bjf.A02);
            IgdsButton igdsButton = c27937CSw.A05;
            igdsButton.setText(C02G.A01(context).getString(2131964642));
            C0fQ.A00(new ViewOnClickListenerC31591DuJ(17, bjf, c31535DtK), igdsButton);
            C0f9.A0A(709817587, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(766078463, A03);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1553835630);
        Context context = this.A00;
        C14360o3.A0B(context, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_invite_contact, viewGroup, false);
        C14360o3.A0A(inflate);
        inflate.setTag(new C27937CSw(inflate));
        inflate.setId(R.id.recommended_user_row_content_identifier);
        C0f9.A0A(778158211, A0G);
        return inflate;
    }
}
