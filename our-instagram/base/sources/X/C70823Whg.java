package X;

import android.graphics.ColorFilter;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.video.live.mvvm.view.likes.customviews.MixedReactionsView;
import java.io.IOException;

/* renamed from: X.Whg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70823Whg implements InterfaceC73023Pd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70823Whg(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC73023Pd
    public final void DFp() {
        switch (this.A00) {
            case 1:
                AbstractC43593JPy.A1Q(this.A01);
                ((C36315G0k) this.A02).A04.setVisibility(0);
                return;
            case 2:
                X9J x9j = (X9J) this.A02;
                View view = (View) this.A01;
                x9j.APn(new C67622Ust(new IOException("Failed to load for unknown reasons").getMessage(), null, view.getId(), 1, 0, 0));
                x9j.APn(new C67622Ust(null, null, view.getId(), 3, 0, 0));
                return;
            case 3:
            case 4:
            default:
                return;
            case 5:
                InterfaceC16660sJ interfaceC16660sJ = ((MixedReactionsView) this.A02).A00;
                String str = ((OCT) this.A01).A03;
                if (str == null) {
                    str = "";
                }
                interfaceC16660sJ.invoke(str);
                return;
        }
    }

    @Override // X.InterfaceC73023Pd
    public final void DPX(C73083Pj c73083Pj) {
        String obj;
        int i;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c73083Pj, 0);
                int i2 = c73083Pj.A00;
                if (i2 == 0 || (i = c73083Pj.A01) == 0) {
                    return;
                }
                C193328hC.A01((IgImageView) this.A01, (C193328hC) this.A02, i2, i, R.dimen.ad_not_delivering_thumbnail_height);
                return;
            case 1:
                ((View) this.A01).setVisibility(0);
                ((C36315G0k) this.A02).A04.setVisibility(8);
                return;
            case 2:
                C68007V5z c68007V5z = (C68007V5z) this.A01;
                android.net.Uri uri = c68007V5z.A00;
                if (uri == null) {
                    obj = null;
                } else {
                    obj = uri.toString();
                }
                int i3 = c73083Pj.A01;
                int i4 = c73083Pj.A00;
                X9J x9j = (X9J) this.A02;
                x9j.APn(new C67622Ust(null, obj, c68007V5z.getId(), 2, i3, i4));
                x9j.APn(new C67622Ust(null, null, c68007V5z.getId(), 3, 0, 0));
                return;
            case 3:
                C14360o3.A0B(c73083Pj, 0);
                ((C42333Iov) this.A02).A01.A09.invoke(this.A01, c73083Pj);
                return;
            case 4:
                ColorFilter colorFilter = (ColorFilter) this.A02;
                if (colorFilter == null) {
                    return;
                }
                StackedAvatarView stackedAvatarView = (StackedAvatarView) this.A01;
                if (stackedAvatarView.A05.getDrawable() == null) {
                    return;
                }
                stackedAvatarView.A05.getDrawable().mutate().setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }
}
