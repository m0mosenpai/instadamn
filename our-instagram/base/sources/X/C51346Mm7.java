package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Mm7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51346Mm7 extends C3OO {
    public final View A00;
    public final TextView A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgdsButton A04;
    public final IgdsButton A05;
    public final IgdsButton A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51346Mm7(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166997dE.A0S(view, R.id.branded_content_ad_code_container);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.branded_content_ad_code_label);
        this.A05 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.copy_button);
        View requireViewById = view.requireViewById(R.id.branded_content_ad_code);
        IgdsButton igdsButton = (IgdsButton) requireViewById;
        igdsButton.A02(EnumC99774dy.A03, R.drawable.instagram_copy_pano_outline_16);
        igdsButton.setIconPadding(AbstractC166997dE.A07(view.getResources()));
        C14360o3.A07(requireViewById);
        this.A04 = igdsButton;
        this.A06 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.share_button);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.facepile);
        this.A01 = AbstractC167007dF.A0N(view, R.id.branded_content_ad_code_used);
    }
}
