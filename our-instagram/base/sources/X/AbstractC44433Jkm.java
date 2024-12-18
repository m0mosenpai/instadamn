package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Jkm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44433Jkm extends LinearLayout {
    public AbstractC44433Jkm(Context context) {
        super(context, null, 0, 0);
        setOrientation(1);
        setBackground(AbstractC46570Kj9.A00(AbstractC31173DnH.A00(context, R.dimen.abc_edit_text_inset_top_material), AbstractC31173DnH.A00(context, R.dimen.abc_edit_text_inset_top_material), 0.0f, 0.0f, AbstractC47994LKy.A01(context, R.attr.sc_popover_background)));
        setOnClickListener(LPY.A00);
    }

    public final void setSubtitleText(String str) {
        C14360o3.A0B(str, 0);
        AbstractC47961LGz.A02(this, R.id.sc_cancel_action_sheet_subtitle).setText(str);
    }

    public final void setTitleText(String str) {
        C14360o3.A0B(str, 0);
        AbstractC47961LGz.A02(this, R.id.sc_cancel_action_sheet_title).setText(str);
    }

    public final void A00(Context context) {
        View A00 = AbstractC47961LGz.A00(this, R.id.sc_action_sheet_view_pin);
        int A01 = AbstractC47994LKy.A01(context, R.attr.sc_popover_handle);
        float A02 = AbstractC43594JPz.A02(context) / 2.0f;
        A00.setBackground(AbstractC46570Kj9.A00(A02, A02, A02, A02, A01));
    }

    public final void setupCancelButton(String str, View.OnClickListener onClickListener) {
        AbstractC167017dG.A1N(str, onClickListener);
        TextView A02 = AbstractC47961LGz.A02(this, R.id.sc_action_sheet_cancel_button);
        A02.setText(str);
        A02.setOnClickListener(onClickListener);
    }

    public final void setupDestructiveButton(String str, View.OnClickListener onClickListener) {
        AbstractC167017dG.A1N(str, onClickListener);
        TextView A02 = AbstractC47961LGz.A02(this, R.id.sc_action_sheet_destructive_button);
        A02.setText(str);
        A02.setOnClickListener(onClickListener);
    }
}
