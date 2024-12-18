package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Jr1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44718Jr1 extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C44718Jr1(View view) {
        super(view);
        this.A00 = view;
        this.A03 = AbstractC25231BEo.A0d(view, R.id.prompt_title);
        this.A01 = AbstractC31172DnG.A0Y(view, R.id.empty_state_title);
        this.A02 = AbstractC31172DnG.A0Y(view, R.id.response_timer_text);
    }
}
