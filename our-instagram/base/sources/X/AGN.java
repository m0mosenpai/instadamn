package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes4.dex */
public final class AGN {
    public static final C22964AAi A08 = new Object();
    public EnumC223069sl A00;
    public final View A01;
    public final UserSession A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final C159567Dr A05;
    public final IgdsButton A06;
    public final IgdsButton A07;

    public AGN(ViewStub viewStub, UserSession userSession, C159567Dr c159567Dr) {
        AbstractC167017dG.A1Q(viewStub, c159567Dr);
        this.A02 = userSession;
        this.A05 = c159567Dr;
        View inflate = viewStub.inflate();
        this.A01 = inflate;
        this.A04 = (IgTextView) AbstractC166997dE.A0R(inflate, R.id.dmm_composer_block_title);
        this.A03 = (IgTextView) AbstractC166997dE.A0R(inflate, R.id.dmm_composer_block_message);
        this.A06 = (IgdsButton) AbstractC166997dE.A0R(inflate, R.id.dmm_composer_block_first_button);
        this.A07 = (IgdsButton) AbstractC166997dE.A0R(inflate, R.id.dmm_composer_block_second_button);
    }
}
