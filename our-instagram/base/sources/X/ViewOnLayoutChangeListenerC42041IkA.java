package X;

import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.user.model.User;

/* renamed from: X.IkA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnLayoutChangeListenerC42041IkA implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ IgImageView A02;
    public final /* synthetic */ C140536Xh A03;
    public final /* synthetic */ User A04;

    public ViewOnLayoutChangeListenerC42041IkA(View view, IgImageView igImageView, C140536Xh c140536Xh, User user, int i) {
        this.A02 = igImageView;
        this.A03 = c140536Xh;
        this.A00 = i;
        this.A01 = view;
        this.A04 = user;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        IgImageView igImageView = this.A02;
        C140536Xh c140536Xh = this.A03;
        c140536Xh.A00.add(new SuperlativeMentionSticker(AbstractC40783I5l.A00(c140536Xh.A04(), igImageView, this.A00, AbstractC166987dD.A0d(c140536Xh.A02).getTop() + this.A01.getTop()), this.A04, 0.0f, igImageView.getHeight() / igImageView.getDrawable().getIntrinsicHeight(), 16));
    }
}
