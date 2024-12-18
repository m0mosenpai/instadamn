package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UGm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66418UGm extends C2UU {
    public int A00;
    public final Context A01;
    public final HorizontalRecyclerPager A02;
    public final C685736u A03;
    public final List A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.View] */
    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        View.OnClickListener wnu;
        IgImageView igImageView;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof UJ2) {
            VJR vjr = (VJR) AbstractC001800i.A0O(this.A04, i);
            if (vjr != null) {
                UJ2 uj2 = (UJ2) c3oo;
                uj2.A02.setText(vjr.A02);
                uj2.A01.setText(vjr.A01);
                Integer num = vjr.A00;
                if (num != null) {
                    int intValue = num.intValue();
                    ImageView imageView = uj2.A00;
                    imageView.setImageDrawable(AbstractC56412ia.A00(this.A01.getResources(), intValue));
                    imageView.setVisibility(0);
                }
            }
            UJ2 uj22 = (UJ2) c3oo;
            HorizontalRecyclerPager horizontalRecyclerPager = this.A02;
            ViewGroup.LayoutParams layoutParams = horizontalRecyclerPager.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            Context context = this.A01;
            layoutParams2.setMargins(0, 0, 0, AbstractC167017dG.A06(context));
            int i2 = AbstractC167007dF.A0K(context).widthPixels;
            layoutParams.width = i2;
            layoutParams.height = Math.max(layoutParams.height, (int) (300.0f * AbstractC65702TsY.A00(context)));
            ((ViewGroup.LayoutParams) layoutParams2).width = i2 - (context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_left_right_margin) * 2);
            horizontalRecyclerPager.setLayoutParams(layoutParams);
            this.A00 = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
            uj22.itemView.setLayoutParams(layoutParams2);
            uj22.itemView.setPadding(0, AbstractC167017dG.A09(context), 0, 0);
            uj22.itemView.setBackgroundResource(R.drawable.netego_layout_border);
            TextView textView = uj22.A01;
            int i3 = this.A00;
            textView.setPadding(i3, 0, i3, 0);
            ?? r3 = c3oo.itemView;
            wnu = new WMR(this, i, 2);
            igImageView = r3;
        } else {
            if (!(c3oo instanceof C66455UIf)) {
                return;
            }
            Context context2 = this.A01;
            C685736u c685736u = this.A03;
            C66455UIf c66455UIf = (C66455UIf) c3oo;
            if (c66455UIf == null) {
                return;
            }
            Drawable A00 = AbstractC56412ia.A00(context2.getResources(), R.drawable.instagram_business_images_netego_welcome);
            IgImageView igImageView2 = c66455UIf.A01;
            igImageView2.setAdjustViewBounds(true);
            igImageView2.setImageDrawable(A00);
            IgImageView igImageView3 = c66455UIf.A00;
            if (igImageView3 != null) {
                igImageView3.setImageDrawable(AbstractC56412ia.A00(context2.getResources(), R.drawable.instagram_business_images_netego_arrow));
                VTB.A00(context2, igImageView3);
            }
            int dimensionPixelSize = AbstractC167007dF.A0K(context2).widthPixels - (context2.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_left_right_margin) * 2);
            igImageView2.setMaxWidth(dimensionPixelSize);
            igImageView2.setMinimumWidth(dimensionPixelSize);
            wnu = new WNU(c685736u, 28);
            igImageView = igImageView2;
        }
        C0fQ.A00(wnu, igImageView);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        LayoutInflater from = LayoutInflater.from(this.A01);
        if (i == 0) {
            View inflate = from.inflate(R.layout.slide_card_new_illustrations, viewGroup, false);
            AbstractC31172DnG.A1J(inflate, R.id.placeholder, 0);
            return new UJ2(inflate);
        }
        return new C66455UIf(from.inflate(R.layout.netego_card_image, viewGroup, false));
    }

    @Override // X.C2UU
    public final void onViewAttachedToWindow(C3OO c3oo) {
        IgImageView igImageView;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof C66455UIf) && (igImageView = ((C66455UIf) c3oo).A00) != null) {
            VTB.A00(this.A01, igImageView);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.VJR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.VJR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.VJR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.VJR, java.lang.Object] */
    public C66418UGm(Context context, HorizontalRecyclerPager horizontalRecyclerPager, User user, C685736u c685736u) {
        this.A01 = context;
        ArrayList arrayList = new ArrayList();
        String A0g = AnonymousClass001.A0g(context.getString(2131977057), ", ", user.getUsername());
        String A0p = AbstractC166997dE.A0p(context, 2131956592);
        C14360o3.A0B(A0g, 1);
        ?? obj = new Object();
        obj.A02 = A0g;
        obj.A01 = A0p;
        obj.A00 = null;
        arrayList.add(obj);
        Integer valueOf = Integer.valueOf(R.drawable.instagram_business_images_business_new_props_followers);
        ?? obj2 = new Object();
        obj2.A02 = context.getString(2131963208);
        obj2.A01 = context.getString(2131965049);
        obj2.A00 = valueOf;
        arrayList.add(obj2);
        Integer valueOf2 = Integer.valueOf(R.drawable.ig_illustrations_illo_ads_megaphone_refresh);
        ?? obj3 = new Object();
        obj3.A02 = context.getString(2131971497);
        obj3.A01 = context.getString(2131971496);
        obj3.A00 = valueOf2;
        arrayList.add(obj3);
        Integer valueOf3 = Integer.valueOf(R.drawable.instagram_business_images_business_new_props_contacts);
        ?? obj4 = new Object();
        obj4.A02 = context.getString(2131977180);
        obj4.A01 = context.getString(2131977179);
        obj4.A00 = valueOf3;
        arrayList.add(obj4);
        this.A04 = arrayList;
        this.A03 = c685736u;
        this.A02 = horizontalRecyclerPager;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1005443279);
        int size = this.A04.size();
        C0f9.A0A(6970555, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-1556809062);
        boolean A1N = AbstractC167007dF.A1N(i);
        C0f9.A0A(-423810035, A03);
        return A1N ? 1 : 0;
    }
}
