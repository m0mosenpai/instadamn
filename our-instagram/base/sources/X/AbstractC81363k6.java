package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.3k6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81363k6 {
    public View A00;
    public ViewStub A01;
    public ViewStub A02;
    public ViewStub A03;
    public RelativeLayout A04;
    public TextView A05;
    public TextView A06;
    public C1I4 A07;
    public RecyclerView A08;
    public C5IV A09;
    public C124115jQ A0A;
    public final InterfaceC56392iX A0B;

    public final void A01(int i) {
        RecyclerView recyclerView = this.A08;
        RectF rectF = AbstractC13880nE.A01;
        if (recyclerView != null) {
            recyclerView.setVisibility(i);
        }
        RelativeLayout relativeLayout = this.A04;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(i);
        }
        TextView textView = this.A06;
        if (textView != null) {
            textView.setVisibility(i);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setVisibility(i);
        }
    }

    public AbstractC81363k6(View view) {
        this.A00 = view;
        this.A08 = (RecyclerView) view.requireViewById(R.id.recycler_view);
        this.A04 = (RelativeLayout) view.requireViewById(R.id.tray_header_row);
        this.A06 = (TextView) view.requireViewById(R.id.tray_title);
        this.A03 = (ViewStub) view.requireViewById(R.id.tray_divider_stub);
        this.A02 = (ViewStub) view.requireViewById(R.id.tray_sub_title_stub);
        this.A01 = (ViewStub) view.requireViewById(R.id.tray_play_all_stub);
        this.A0B = AbstractC56372iV.A01(view.requireViewById(R.id.tray_overflow_menu_button_stub), false, false);
    }
}
