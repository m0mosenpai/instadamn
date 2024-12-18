package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.VkP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69256VkP {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;

    public C69256VkP(View view) {
        Context context = view.getContext();
        this.A00 = view;
        this.A03 = (TextView) view.requireViewById(R.id.dashboard_section_header_title);
        View requireViewById = view.requireViewById(R.id.dashboard_section_header_cta);
        this.A01 = requireViewById;
        TextView textView = (TextView) requireViewById.requireViewById(R.id.dashboard_cta_text);
        this.A02 = textView;
        AbstractC166987dD.A1O(context, textView, AbstractC53242c7.A0C(context));
        AbstractC31176DnK.A1D(requireViewById, R.id.forward_arrow);
        AbstractC13880nE.A0d(requireViewById, 0);
        AbstractC13880nE.A0Y(requireViewById, 0);
    }
}
