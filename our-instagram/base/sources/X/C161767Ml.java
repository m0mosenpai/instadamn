package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.7Ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161767Ml extends C3OO {
    public final LinearLayout A00;
    public final TextView A01;
    public final TextView A02;
    public final ArrayList A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C161767Ml(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.seen_state_text);
        C14360o3.A07(requireViewById);
        TextView textView = (TextView) requireViewById;
        this.A02 = textView;
        View requireViewById2 = view.requireViewById(R.id.seen_state_bubble_group_layout);
        C14360o3.A07(requireViewById2);
        LinearLayout linearLayout = (LinearLayout) requireViewById2;
        this.A00 = linearLayout;
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        View requireViewById3 = view.requireViewById(R.id.seen_state_overflow);
        C14360o3.A07(requireViewById3);
        this.A01 = (TextView) requireViewById3;
        Context context = textView.getContext();
        C14360o3.A07(context);
        textView.setMaxWidth(C7N9.A00(context, false));
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        textView.setPaddingRelative(dimensionPixelSize2, 0, dimensionPixelSize, 0);
        linearLayout.setPaddingRelative(dimensionPixelSize2, 0, dimensionPixelSize, 0);
        arrayList.add(AbstractC56372iV.A01(view.requireViewById(R.id.seen_head_1), false, false));
        arrayList.add(AbstractC56372iV.A01(view.requireViewById(R.id.seen_head_2), false, false));
        arrayList.add(AbstractC56372iV.A01(view.requireViewById(R.id.seen_head_3), false, false));
        arrayList.add(AbstractC56372iV.A01(view.requireViewById(R.id.seen_head_4), false, false));
        arrayList.add(AbstractC56372iV.A01(view.requireViewById(R.id.seen_head_5), false, false));
        arrayList.add(AbstractC56372iV.A01(view.requireViewById(R.id.seen_head_6), false, false));
        arrayList.add(AbstractC56372iV.A01(view.requireViewById(R.id.seen_head_7), false, false));
        arrayList.add(AbstractC56372iV.A01(view.requireViewById(R.id.seen_head_8), false, false));
        arrayList.add(AbstractC56372iV.A01(view.requireViewById(R.id.seen_head_9), false, false));
        arrayList.add(AbstractC56372iV.A01(view.requireViewById(R.id.seen_head_10), false, false));
    }
}
