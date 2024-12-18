package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Mlm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51325Mlm extends C3OO {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgImageButton A02;
    public final /* synthetic */ C51139Mii A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51325Mlm(View view, C51139Mii c51139Mii) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A03 = c51139Mii;
        this.A02 = (IgImageButton) AbstractC166987dD.A0c(view, R.id.preview_clip_thumbnail);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.preview_clip_play_count);
        this.A00 = (IgLinearLayout) AbstractC166987dD.A0c(view, R.id.play_count_container);
    }
}
