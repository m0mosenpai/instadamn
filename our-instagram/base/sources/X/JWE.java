package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class JWE extends IgFrameLayout {
    public final IgTextView A00;

    public JWE(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.igds_pill, (ViewGroup) this, true);
        this.A00 = AbstractC31172DnG.A0Y(this, R.id.igds_pill_label);
    }

    public final void setLabel(String str) {
        C14360o3.A0B(str, 0);
        this.A00.setText(str);
    }
}
