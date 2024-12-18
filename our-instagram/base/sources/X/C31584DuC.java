package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.DuC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31584DuC {
    public static final InterfaceC11380iw A02 = AbstractC31171DnF.A0D("dialog_builder_module");
    public final Dialog A00;
    public final ListView A01;

    public final void A01() {
        C0fJ.A00(this.A00);
    }

    private final void A00(Context context, DialogInterface.OnClickListener onClickListener, View view, Integer num, String str, int i, boolean z, boolean z2) {
        TextView A0N = AbstractC167007dF.A0N(view, i);
        if (z2) {
            AbstractC31173DnH.A0z(context, A0N, R.drawable.bg_elevated_simple_row_bottom_panorama);
        }
        Integer num2 = C05F.A01;
        AbstractC56952jT.A04(A0N, num2);
        A0N.setVisibility(0);
        A0N.setText(str);
        Context context2 = view.getContext();
        int i2 = R.attr.igds_color_primary_text;
        if (num == num2) {
            i2 = R.attr.igds_color_error_or_destructive;
        }
        AbstractC31177DnL.A0q(context2, A0N, i2);
        if (z) {
            A0N.setTypeface(A0N.getTypeface(), 1);
        }
        ViewOnClickListenerC31591DuJ.A00(A0N, 42, onClickListener, this);
    }

    public C31584DuC(Context context, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnClickListener onClickListener4, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, CharSequence charSequence, Integer num, String str, String str2, String str3, String str4, CharSequence[] charSequenceArr, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.igds_alert_dialog_layout, (ViewGroup) null, false);
        Dialog dialog = new Dialog(context, 0);
        this.A00 = dialog;
        dialog.setContentView(inflate);
        dialog.setCanceledOnTouchOutside(z);
        dialog.setOnDismissListener(onDismissListener);
        dialog.setOnCancelListener(onCancelListener);
        if (onShowListener != null) {
            dialog.setOnShowListener(new AP9(onShowListener, 4));
        }
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.igds_alert_dialog_headline);
        A0N.setText(str);
        boolean z2 = true;
        A0N.setTypeface(A0N.getTypeface(), 1);
        if (charSequence != null && charSequence.length() != 0) {
            TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.igds_alert_dialog_subtext);
            A0N2.setVisibility(0);
            AbstractC31176DnK.A1G(A0N2, charSequence);
        }
        LinearLayout linearLayout = (LinearLayout) AbstractC166997dE.A0R(inflate, R.id.dialog_linear_layout);
        linearLayout.setDividerDrawable(context.getDrawable(R.drawable.igds_dialog_divider));
        linearLayout.setShowDividers(2);
        if (str2.length() > 0) {
            A00(context, onClickListener, inflate, num, str2, R.id.igds_alert_dialog_primary_button, true, (str4 == null || str4.length() == 0) && (str3 == null || str3.length() == 0));
        }
        if (str3 != null) {
            if (str4 != null && str4.length() != 0) {
                z2 = false;
            }
            A00(context, onClickListener2, inflate, null, str3, R.id.igds_alert_dialog_secondary_button, false, z2);
        }
        if (str4 != null) {
            A00(context, onClickListener3, inflate, null, str4, R.id.igds_alert_dialog_cancel_button, false, true);
        }
        ListView listView = (ListView) inflate.requireViewById(android.R.id.list);
        this.A01 = listView;
        listView.setVisibility(8);
        if (charSequenceArr != null) {
            EPV epv = new EPV(context, null, A02);
            epv.shouldCenterText = true;
            ArrayList A1E = AbstractC166987dD.A1E();
            int length = charSequenceArr.length;
            for (int i = 0; i < length; i++) {
                CharSequence charSequence2 = charSequenceArr[i];
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                A1E.add(new GHY(context, new ViewOnClickListenerC35688FpN(i, 9, onClickListener4, this), charSequence2));
            }
            epv.addDialogMenuItems(A1E);
            epv.roundDialogBottomCorners = true;
            this.A01.setAdapter((ListAdapter) epv);
            this.A01.setBackground(null);
            this.A01.setLayoutDirection(3);
            this.A01.setVisibility(0);
        }
    }
}
