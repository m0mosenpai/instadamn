package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.Mm0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51339Mm0 extends C3OO {
    public final Context A00;
    public final IgdsMediaButton A01;
    public final IgdsMediaButton A02;
    public final IgdsMediaButton A03;
    public final IgdsMediaButton A04;
    public final IgdsMediaButton A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51339Mm0(Context context, View view, O3O o3o) {
        super(view);
        AbstractC167017dG.A1R(context, o3o);
        this.A00 = context;
        View findViewById = view.findViewById(R.id.clips_count_display_button);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) findViewById;
        ViewOnClickListenerC55455Ok9.A01(igdsMediaButton, 45, o3o);
        C14360o3.A07(findViewById);
        this.A01 = igdsMediaButton;
        this.A02 = (IgdsMediaButton) AbstractC166987dD.A0c(view, R.id.messages_count_display_button);
        IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) view.findViewById(R.id.stories_count_display_button);
        ViewOnClickListenerC55455Ok9.A01(igdsMediaButton2, 46, o3o);
        this.A04 = igdsMediaButton2;
        this.A03 = (IgdsMediaButton) AbstractC166987dD.A0c(view, R.id.photos_count_display_button);
        this.A05 = (IgdsMediaButton) AbstractC166987dD.A0c(view, R.id.user_count_display_button);
    }
}
