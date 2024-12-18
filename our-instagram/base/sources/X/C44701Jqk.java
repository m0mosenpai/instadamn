package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Jqk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44701Jqk extends C3OO {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44701Jqk(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC31172DnG.A0Y(view, R.id.title);
        this.A02 = AbstractC31172DnG.A0Y(view, R.id.url);
        this.A00 = (IgLinearLayout) view.findViewById(R.id.meta_ai_hcm_sources_list_item);
    }
}
