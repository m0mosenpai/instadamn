package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;

/* renamed from: X.72V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C72V {
    public Integer A00;
    public final Context A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final NestableRecyclerView A09;

    public C72V(Context context, View view) {
        C14360o3.A0B(view, 2);
        this.A01 = context;
        View requireViewById = view.requireViewById(R.id.highlights_reel_tray_recycler_view);
        C14360o3.A07(requireViewById);
        NestableRecyclerView nestableRecyclerView = (NestableRecyclerView) requireViewById;
        this.A09 = nestableRecyclerView;
        this.A00 = C05F.A00;
        nestableRecyclerView.setPassThroughToParentOverride(true);
        nestableRecyclerView.setItemAnimator(null);
        View requireViewById2 = view.requireViewById(R.id.tray_header_container);
        C14360o3.A07(requireViewById2);
        this.A04 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.tray_header);
        C14360o3.A07(requireViewById3);
        this.A08 = (TextView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.tray_subtitle);
        C14360o3.A07(requireViewById4);
        this.A07 = (TextView) requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.tray_header_caret);
        C14360o3.A07(requireViewById5);
        this.A02 = requireViewById5;
        View requireViewById6 = view.requireViewById(R.id.tray_remove_suggested_highlights_text);
        C14360o3.A07(requireViewById6);
        this.A06 = (TextView) requireViewById6;
        View requireViewById7 = view.requireViewById(R.id.tray_edit_header_container);
        C14360o3.A07(requireViewById7);
        this.A03 = requireViewById7;
        View requireViewById8 = view.requireViewById(R.id.tray_edit_button);
        C14360o3.A07(requireViewById8);
        this.A05 = (TextView) requireViewById8;
    }
}
