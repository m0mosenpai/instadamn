package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.V5p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67999V5p extends IgLinearLayout {
    public final ImageView A00;
    public final TextView A01;

    public C67999V5p(Context context) {
        super(context, null, 0);
        AbstractC25228BEl.A0P(this).inflate(R.layout.promote_secondary_row_with_chevron, (ViewGroup) this, true);
        this.A01 = (TextView) findViewById(R.id.title_text);
        this.A00 = (ImageView) findViewById(R.id.chevron_icon);
    }
}
