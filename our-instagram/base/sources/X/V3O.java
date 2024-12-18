package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes11.dex */
public final class V3O extends AbstractC168697g3 {
    public final Context A00;
    public final LayoutInflater A01;
    public final InterfaceC11380iw A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V3O(Context context, InterfaceC11380iw interfaceC11380iw) {
        this.A02 = interfaceC11380iw;
        this.A00 = context;
        this.A01 = LayoutInflater.from(context);
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        int i3;
        int A03 = C0f9.A03(-970972505);
        if (view == null) {
            LayoutInflater layoutInflater = this.A01;
            C14360o3.A0B(layoutInflater, 0);
            view = layoutInflater.inflate(R.layout.reporting_bottom_sheet_image_row, (ViewGroup) null);
            C14360o3.A0A(view);
            view.setTag(new VgN(view));
        }
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        VgN vgN = (VgN) AbstractC31172DnG.A0x(view);
        C68250VJm c68250VJm = (C68250VJm) obj2;
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A13(interfaceC11380iw, vgN, c68250VJm);
        Resources resources = context.getResources();
        Integer num = c68250VJm.A05;
        Integer num2 = c68250VJm.A01;
        View view2 = vgN.A00;
        if (num != null) {
            i2 = resources.getDimensionPixelSize(num.intValue());
        } else {
            i2 = 0;
        }
        if (num2 != null) {
            i3 = resources.getDimensionPixelSize(num2.intValue());
        } else {
            i3 = 0;
        }
        view2.setPadding(0, i2, 0, i3);
        Integer num3 = c68250VJm.A03;
        ImageUrl imageUrl = c68250VJm.A00;
        if (num3 != null) {
            AbstractC166997dE.A19(context, vgN.A01, num3.intValue());
        } else if (imageUrl != null) {
            vgN.A01.setUrl(imageUrl, interfaceC11380iw);
        }
        Integer num4 = c68250VJm.A04;
        if (num4 != null) {
            AbstractC31173DnH.A11(context, vgN.A01, num4.intValue());
        }
        IgImageView igImageView = vgN.A01;
        ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
        Integer num5 = c68250VJm.A02;
        if (num5 != null) {
            layoutParams.height = resources.getDimensionPixelSize(num5.intValue());
        } else {
            layoutParams.height = -2;
        }
        Integer num6 = c68250VJm.A06;
        if (num6 != null) {
            layoutParams.width = resources.getDimensionPixelSize(num6.intValue());
        } else {
            layoutParams.width = -2;
        }
        igImageView.setLayoutParams(layoutParams);
        view2.requestLayout();
        C0f9.A0A(1522357924, A03);
        return view;
    }
}
