package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* loaded from: classes7.dex */
public final class IM3 {
    public final Context A00;
    public final LinearLayout A01;
    public final ReelDashboardFragment A02;
    public final List A03 = AbstractC166987dD.A1E();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.6RB] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.graphics.drawable.Drawable] */
    public final void A00(InterfaceC41201vU interfaceC41201vU) {
        int i;
        ?? r2;
        Wm1 A01 = AbstractC97594Zu.A01(interfaceC41201vU);
        A01.getClass();
        List list = A01.A02.A0C;
        int A00 = A01.A00();
        if (list != null) {
            int size = list.size();
            Context context = this.A00;
            LayoutInflater from = LayoutInflater.from(context);
            LinearLayout linearLayout = this.A01;
            int childCount = size - linearLayout.getChildCount();
            int i2 = -childCount;
            if (childCount >= 0) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View inflate = from.inflate(R.layout.reel_dashboard_quiz_summary_answer_row, (ViewGroup) linearLayout, false);
                    this.A03.add(new IKB(inflate, this.A02));
                    linearLayout.addView(inflate);
                }
            } else {
                for (int i4 = 0; i4 < i2; i4++) {
                    linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                    List list2 = this.A03;
                    list2.remove(AbstractC25226BEj.A05(list2));
                }
            }
            int i5 = 0;
            while (true) {
                List list3 = this.A03;
                if (i5 < list3.size()) {
                    String str = context.getResources().getStringArray(R.array.quiz_sticker_answer_row_options)[i5];
                    IKB ikb = (IKB) list3.get(i5);
                    InterfaceC43540JLa interfaceC43540JLa = (InterfaceC43540JLa) list.get(i5);
                    boolean A1P = AbstractC167007dF.A1P(i5, A00);
                    if (interfaceC43540JLa.Arz() != null) {
                        i = interfaceC43540JLa.Arz().intValue();
                    } else {
                        i = 0;
                    }
                    C0fQ.A00(new ViewOnClickListenerC35607Fny(ikb, i, interfaceC41201vU, i5, 3), ikb.A01);
                    ikb.A04.setText(interfaceC43540JLa.getText());
                    ikb.A03.setText(AbstractC13670mt.A06("%d", AbstractC25228BEl.A1Y(i)));
                    if (A1P) {
                        Context context2 = ikb.A00;
                        r2 = context2.getDrawable(R.drawable.instagram_circle_check_filled_16);
                        AbstractC25231BEo.A0x(context2, r2.mutate(), R.color.igds_active_badge);
                    } else {
                        r2 = ikb.A05;
                        r2.A0M(str);
                    }
                    ikb.A02.setImageDrawable(r2);
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public IM3(View view, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = view.getContext();
        this.A02 = reelDashboardFragment;
        this.A01 = (LinearLayout) view;
    }
}
