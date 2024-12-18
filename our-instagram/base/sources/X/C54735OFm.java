package X;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;

/* renamed from: X.OFm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54735OFm {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final EditText A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final ActionButton A0D;
    public final View A0E;
    public final LinearLayout A0F;

    public C54735OFm(View view) {
        this.A03 = view;
        this.A0F = (LinearLayout) AbstractC166997dE.A0R(view, R.id.upcoming_event_layout);
        View A0S = AbstractC166997dE.A0S(view, R.id.upcoming_event_action_bar);
        this.A0E = A0S;
        this.A09 = AbstractC167007dF.A0N(A0S, R.id.action_bar_title);
        this.A0D = (ActionButton) AbstractC166997dE.A0R(A0S, R.id.action_bar_button_done);
        this.A05 = AbstractC31176DnK.A0D(A0S, R.id.action_bar_button_cancel);
        this.A04 = (EditText) AbstractC166997dE.A0R(view, R.id.event_name);
        this.A07 = AbstractC31176DnK.A0D(view, R.id.event_name_icon);
        this.A02 = AbstractC166997dE.A0S(view, R.id.start_time_row);
        this.A0C = AbstractC167007dF.A0N(view, R.id.start_time);
        this.A08 = AbstractC31176DnK.A0D(view, R.id.start_time_icon);
        this.A01 = AbstractC166997dE.A0S(view, R.id.end_time_row);
        this.A0A = AbstractC167007dF.A0N(view, R.id.end_time);
        this.A06 = AbstractC31176DnK.A0D(view, R.id.end_time_icon);
        this.A00 = AbstractC166997dE.A0S(view, R.id.delete_upcoming_event);
        this.A0B = AbstractC167007dF.A0N(view, R.id.upcoming_event_footer);
    }
}
