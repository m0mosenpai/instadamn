package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class EZJ extends IgLinearLayout {
    public final ViewGroup A00;
    public final UserSession A01;
    public final IgTextView A02;
    public final IgImageView A03;

    public EZJ(UserSession userSession, Context context) {
        super(context, null, 0, 0);
        this.A01 = userSession;
        View.inflate(context, R.layout.conversation_starter_pill, this);
        this.A00 = AbstractC31173DnH.A0F(this, R.id.pill);
        this.A03 = AbstractC31172DnG.A0Z(this, R.id.icon);
        this.A02 = AbstractC31172DnG.A0X(this, R.id.label);
    }
}
