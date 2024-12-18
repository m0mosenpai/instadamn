package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.instagram.maps.ui.IgStaticMapView;

/* renamed from: X.OQl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54914OQl {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.MkD] */
    public static final C51228MkD A00(Context context, ViewGroup viewGroup, boolean z) {
        C14360o3.A0B(viewGroup, 1);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.login_activity_map_item, z);
        C14360o3.A0B(A0D, 1);
        ?? c3oo = new C3OO(A0D);
        c3oo.A08 = (IgStaticMapView) AbstractC166997dE.A0R(A0D, R.id.login_activity_map_view);
        c3oo.A03 = AbstractC167007dF.A0N(A0D, R.id.left_button);
        c3oo.A04 = AbstractC167007dF.A0N(A0D, R.id.right_button);
        c3oo.A01 = (LinearLayout) AbstractC166997dE.A0R(A0D, R.id.button_container);
        c3oo.A02 = AbstractC167007dF.A0N(A0D, R.id.confirm_text);
        c3oo.A07 = AbstractC167007dF.A0N(A0D, R.id.title_message);
        c3oo.A06 = AbstractC167007dF.A0N(A0D, R.id.body_message_timestamp);
        c3oo.A05 = AbstractC167007dF.A0N(A0D, R.id.body_message_device);
        c3oo.A00 = AbstractC31176DnK.A0D(A0D, R.id.status_icon);
        return c3oo;
    }

    public static final void A01(Context context, OUX oux, InterfaceC58161PqQ interfaceC58161PqQ, C51228MkD c51228MkD, boolean z) {
        ImageView imageView;
        int i;
        AbstractC167007dF.A1D(c51228MkD, 1, oux);
        if (oux.A0B) {
            ViewGroup.LayoutParams layoutParams = c51228MkD.itemView.getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(17));
            layoutParams.height = (int) context.getResources().getDimension(R.dimen.alt_text_carousel_card_width);
            if (!z) {
                layoutParams.width = (int) context.getResources().getDimension(R.dimen.login_history_map_width);
            }
            c51228MkD.A03.setVisibility(0);
            imageView = c51228MkD.A00;
            i = R.drawable.instagram_error_pano_outline_24;
        } else {
            c51228MkD.A01.setVisibility(8);
            imageView = c51228MkD.A00;
            i = R.drawable.instagram_location_pano_outline_24;
        }
        AbstractC166997dE.A19(context, imageView, i);
        AbstractC31177DnL.A0p(context, imageView, AbstractC53242c7.A08(context));
        IgStaticMapView igStaticMapView = c51228MkD.A08;
        igStaticMapView.setEnabled(true);
        igStaticMapView.A07 = VGB.TOP_RIGHT;
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("review_suspicious_login_map");
        staticMapView$StaticMapOptions.A02(oux.A00, oux.A01);
        staticMapView$StaticMapOptions.A03(11);
        igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
        C0fQ.A00(new ViewOnClickListenerC55417OjS(10, context, interfaceC58161PqQ, c51228MkD, oux), c51228MkD.A03);
        ViewOnClickListenerC55468OkN.A00(c51228MkD.A04, 61, interfaceC58161PqQ, oux);
        String A06 = C23831Eq.A06(context, System.currentTimeMillis());
        String A0p = AbstractC166997dE.A0p(context, 2131965744);
        String A0t = AbstractC31174DnI.A0t(context, A06, A0p, 2131965743);
        C14360o3.A07(A0t);
        AnonymousClass773.A07(new C52782NXq(context, oux, interfaceC58161PqQ, c51228MkD, context.getColor(AbstractC53242c7.A07(context))), c51228MkD.A02, A0p, A0t);
        TextView textView = c51228MkD.A07;
        String str = oux.A07;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        c51228MkD.A06.setText(AbstractC54291NzB.A00(context, oux));
        TextView textView2 = c51228MkD.A05;
        String str2 = oux.A05;
        if (str2 == null) {
            str2 = "";
        }
        textView2.setText(str2);
    }
}
