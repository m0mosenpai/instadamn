package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.E1v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31941E1v extends C3OO {
    public final RecyclerView A00;
    public final C66362zD A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31941E1v(View view, GZF gzf) {
        super(view);
        AbstractC167017dG.A1P(view, gzf);
        this.A00 = (RecyclerView) AbstractC166987dD.A0c(view, R.id.meta_ai_hcm_prompt_pills);
        this.A01 = AbstractC31173DnH.A0R(C66362zD.A00(view.getContext()), new EYT(gzf));
    }
}
