package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Jqy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44715Jqy extends C3OO {
    public final IgSimpleImageView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C44715Jqy(View view) {
        super(view);
        this.A03 = AbstractC31172DnG.A0Y(view, R.id.title);
        this.A02 = AbstractC31172DnG.A0Y(view, R.id.subtitle);
        this.A00 = (IgSimpleImageView) view.findViewById(R.id.subtitle_icon);
        this.A01 = AbstractC31172DnG.A0Y(view, R.id.response_timer_text);
    }
}
