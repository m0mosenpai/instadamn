package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import java.util.List;

/* renamed from: X.V2x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67932V2x extends AbstractC65632xz {
    public final Context A00;
    public final View.OnClickListener A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String string;
        int A03 = C0f9.A03(-894465484);
        VJG vjg = (VJG) obj;
        Context context = this.A00;
        C69303VlB c69303VlB = (C69303VlB) AbstractC31172DnG.A0x(view);
        View.OnClickListener onClickListener = this.A01;
        AbstractC166987dD.A1P(context, c69303VlB.A03, 2131963654);
        TextView textView = c69303VlB.A04;
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = vjg.A00;
        textView.setText(locationPageInfoPageOperationHourResponse.A01);
        c69303VlB.A02.setText(locationPageInfoPageOperationHourResponse.A02);
        ImageView imageView = c69303VlB.A00;
        C0fQ.A00(onClickListener, imageView);
        LinearLayout linearLayout = c69303VlB.A01;
        linearLayout.setVisibility(AbstractC167007dF.A05(vjg.A01 ? 1 : 0));
        List<LocationPageInfoPageOperationHour> list = locationPageInfoPageOperationHourResponse.A04;
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        for (LocationPageInfoPageOperationHour locationPageInfoPageOperationHour : list) {
            String str = locationPageInfoPageOperationHour.A00;
            C14360o3.A0B(str, 1);
            Number number = (Number) AbstractC68638VYt.DAYS_IN_A_WEEK.get(AbstractC167007dF.A0h(str));
            if (number != null && (string = context.getString(number.intValue())) != null) {
                str = string;
            }
            List<String> list2 = locationPageInfoPageOperationHour.A01;
            if (!list2.isEmpty()) {
                String str2 = str;
                for (String str3 : list2) {
                    View inflate = LayoutInflater.from(context).inflate(R.layout.location_page_info_page_business_hour_row, (ViewGroup) linearLayout, false);
                    if (str2 != null) {
                        AbstractC31176DnK.A1F(inflate, str, R.id.left_title);
                        str2 = null;
                    }
                    AbstractC31176DnK.A1F(inflate, str3, R.id.right_title);
                    linearLayout.addView(inflate);
                }
            } else {
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.location_page_info_page_business_hour_row, (ViewGroup) linearLayout, false);
                AbstractC31176DnK.A1F(inflate2, str, R.id.left_title);
                AbstractC166987dD.A1P(context, (TextView) inflate2.requireViewById(R.id.right_title), 2131956277);
                linearLayout.addView(inflate2);
            }
        }
        if (list.isEmpty()) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            boolean z = vjg.A01;
            int i2 = R.drawable.down_chevron;
            if (z) {
                i2 = R.drawable.up_chevron;
            }
            AbstractC166997dE.A19(context, imageView, i2);
        }
        C0f9.A0A(-460603277, A03);
    }

    public C67932V2x(Context context, View.OnClickListener onClickListener) {
        this.A00 = context;
        this.A01 = onClickListener;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(133869633);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.location_page_info_page_business_hours_expandable_row);
        A0A.setTag(new C69303VlB(A0A));
        C0f9.A0A(631400218, A03);
        return A0A;
    }
}
