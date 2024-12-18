package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.E2m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31958E2m extends C3OO {
    public final View.OnClickListener A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final CircularImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31958E2m(View view, InterfaceC37290Gbr interfaceC37290Gbr) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = ViewOnClickListenerC35679FpE.A00(interfaceC37290Gbr, 70);
        this.A03 = AbstractC31176DnK.A0U(view, R.id.discover_people_image_view);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.discover_people_row_title);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.discover_people_row_subtitle);
    }
}
