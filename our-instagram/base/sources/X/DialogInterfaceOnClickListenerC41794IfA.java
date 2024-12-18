package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.IfA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41794IfA implements DialogInterface.OnClickListener {
    public final /* synthetic */ C41155IJu A00;
    public final /* synthetic */ C3K0 A01;

    public DialogInterfaceOnClickListenerC41794IfA(C41155IJu c41155IJu, C3K0 c3k0) {
        this.A01 = c3k0;
        this.A00 = c41155IJu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.Gt0, android.widget.RelativeLayout, android.view.View, android.view.ViewGroup] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C3K0 c3k0 = this.A01;
        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        DialogC31731Dwc A00 = new C35166FfG(c3k0.A09, R.layout.results_dialog, R.style.SurveyResultsDialog).A00();
        C14360o3.A07(A00);
        C41155IJu c41155IJu = this.A00;
        ViewGroup viewGroup = (ViewGroup) A00.findViewById(R.id.resultsList);
        View findViewById = A00.findViewById(R.id.action_bar_textview_title);
        C14360o3.A0C(findViewById, AbstractC111324zv.A00(3));
        ((TextView) findViewById).setText(A00.getContext().getText(2131975024));
        ViewOnClickListenerC42032Ik1.A01(A00.findViewById(R.id.action_bar_button_back), 26, A00);
        for (C41128IIt c41128IIt : c41155IJu.A04) {
            View inflate = LayoutInflater.from(A00.getContext()).inflate(R.layout.result_row, (ViewGroup) null);
            AbstractC166987dD.A0e(inflate, R.id.question_header).setText(c41128IIt.A03);
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.answer_list);
            for (C41101IHs c41101IHs : c41128IIt.A04) {
                Context context = A00.getContext();
                C14360o3.A07(context);
                ?? relativeLayout = new RelativeLayout(context, null);
                View.inflate(context, R.layout.result_row_view, relativeLayout);
                Resources resources = context.getResources();
                Paint paint = new Paint();
                paint.setColor(context.getColor(R.color.grey_1));
                paint.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
                relativeLayout.A00 = paint;
                Paint paint2 = new Paint();
                paint2.setColor(context.getColor(R.color.result_bar_active_color));
                paint2.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
                relativeLayout.A01 = paint2;
                relativeLayout.A03 = AbstractC166997dE.A0T(relativeLayout, R.id.response);
                relativeLayout.A02 = AbstractC166997dE.A0T(relativeLayout, R.id.percent);
                relativeLayout.setAnswer(c41101IHs);
                relativeLayout.setTotalQuestionResponders(c41128IIt.A00);
                viewGroup2.addView(relativeLayout);
            }
            TextView A0e = AbstractC166987dD.A0e(inflate, R.id.question_footer);
            String A0k = AbstractC167017dG.A0k(A00.getContext().getResources(), c41128IIt.A00, R.plurals.x_survey_question_responders);
            C14360o3.A07(A0k);
            A0e.setText(A0k);
            viewGroup.addView(inflate);
        }
        C0fJ.A00(A00);
    }
}
