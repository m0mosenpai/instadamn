package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.Ndw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53083Ndw extends H8E {
    public final IgdsMediaButton A00;
    public final IgdsMediaButton A01;
    public final IgdsMediaButton A02;
    public final IgdsMediaButton A03;
    public final IgdsMediaButton A04;

    public C53083Ndw(View view) {
        super(view);
        this.A00 = (IgdsMediaButton) AbstractC166987dD.A0c(view, R.id.clips_count_display_button);
        this.A01 = (IgdsMediaButton) AbstractC166987dD.A0c(view, R.id.messages_count_display_button);
        this.A03 = (IgdsMediaButton) AbstractC166987dD.A0c(view, R.id.stories_count_display_button);
        this.A02 = (IgdsMediaButton) AbstractC166987dD.A0c(view, R.id.photos_count_display_button);
        this.A04 = (IgdsMediaButton) AbstractC166987dD.A0c(view, R.id.user_count_display_button);
    }
}
