package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.GwD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38492GwD extends C3OO {
    public CircularImageView A00;
    public final View A01;
    public final ViewStub A02;
    public final TextView A03;
    public final TextView A04;
    public final IgdsButton A05;

    public C38492GwD(View view) {
        super(view);
        this.A04 = AbstractC166997dE.A0T(view, R.id.sa_title);
        this.A03 = AbstractC166997dE.A0T(view, R.id.sa_subtitle);
        this.A05 = (IgdsButton) view.requireViewById(R.id.sa_button);
        this.A02 = AbstractC31173DnH.A0G(view, R.id.sa_icon_viewstub);
        this.A01 = view.requireViewById(R.id.sa_dismiss_button);
    }
}
