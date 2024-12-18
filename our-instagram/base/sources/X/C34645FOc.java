package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.FOc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34645FOc {
    public DialogInterface.OnClickListener A00;
    public DialogInterface.OnClickListener A01;
    public String A02;
    public String A03;
    public String A04;
    public final Dialog A05;
    public final Context A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final ViewStub A0A;
    public final Space A0B;
    public final Space A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final TextView A0F;
    public final ViewStub A0G;
    public final LinearLayout A0H;

    public C34645FOc(Context context) {
        this.A06 = context;
        Dialog dialog = new Dialog(context, R.style.IigDialogDeprecated);
        this.A05 = dialog;
        dialog.setContentView(AbstractC31176DnK.A0A(LayoutInflater.from(context), null, R.layout.scrollable_dialog_with_linear_buttons));
        View requireViewById = dialog.requireViewById(R.id.title_header_empty_space);
        C14360o3.A0C(requireViewById, "null cannot be cast to non-null type android.widget.Space");
        this.A0C = (Space) requireViewById;
        View requireViewById2 = dialog.requireViewById(R.id.title_bottom_empty_space);
        C14360o3.A0C(requireViewById2, "null cannot be cast to non-null type android.widget.Space");
        this.A0B = (Space) requireViewById2;
        View requireViewById3 = dialog.requireViewById(R.id.dialog_title);
        String A00 = AbstractC111324zv.A00(13);
        C14360o3.A0C(requireViewById3, A00);
        this.A0A = (ViewStub) requireViewById3;
        View requireViewById4 = dialog.requireViewById(R.id.dialog_body);
        C14360o3.A0C(requireViewById4, "null cannot be cast to non-null type android.widget.TextView");
        this.A0E = (TextView) requireViewById4;
        View requireViewById5 = dialog.requireViewById(R.id.dialog_image_holder);
        C14360o3.A0C(requireViewById5, A00);
        this.A0G = (ViewStub) requireViewById5;
        this.A08 = dialog.requireViewById(R.id.first_button_container);
        this.A09 = dialog.requireViewById(R.id.second_button_container);
        View requireViewById6 = dialog.requireViewById(R.id.first_button);
        C14360o3.A0C(requireViewById6, "null cannot be cast to non-null type android.widget.TextView");
        this.A0D = (TextView) requireViewById6;
        View requireViewById7 = dialog.requireViewById(R.id.second_button);
        C14360o3.A0C(requireViewById7, "null cannot be cast to non-null type android.widget.TextView");
        this.A0F = (TextView) requireViewById7;
        this.A07 = dialog.requireViewById(R.id.button_divider);
        View requireViewById8 = dialog.requireViewById(R.id.button_layout);
        C14360o3.A0C(requireViewById8, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.A0H = (LinearLayout) requireViewById8;
        dialog.setOnShowListener(new AP9(this, 5));
    }
}
