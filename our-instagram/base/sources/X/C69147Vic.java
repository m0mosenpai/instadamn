package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Vic, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69147Vic {
    public final ViewGroup A00;
    public final C57012jc A01;
    public final IgImageView[] A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C69147Vic(ViewGroup viewGroup) {
        this.A02 = r2;
        this.A00 = viewGroup;
        IgImageView[] igImageViewArr = {viewGroup.requireViewById(R.id.image1), viewGroup.requireViewById(R.id.image2), viewGroup.requireViewById(R.id.image3)};
        this.A01 = AbstractC31177DnL.A0U(viewGroup, R.id.empty_state_container);
    }
}
