package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Mcu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50820Mcu extends ConstraintLayout {
    public final IgTextView A00;
    public final IgTextView A01;

    public C50820Mcu(Context context) {
        super(context, null, 0);
        View.inflate(context, R.layout.lead_gen_view_creatives_bullet_point, this);
        this.A01 = AbstractC31172DnG.A0X(this, R.id.header_text_view);
        this.A00 = AbstractC31172DnG.A0X(this, R.id.description_text_view);
    }

    public final void A0D(String str, String str2) {
        C14360o3.A0B(str2, 1);
        IgTextView igTextView = this.A01;
        int i = 0;
        if (str == null) {
            i = 8;
        }
        igTextView.setVisibility(i);
        igTextView.setText(str);
        this.A00.setText(str2);
    }
}
