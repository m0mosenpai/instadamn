package X;

import android.content.Context;
import android.view.View;
import android.widget.Space;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.List;

/* renamed from: X.Js1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44780Js1 extends C3OO implements C7QD {
    public final Context A00;
    public final Space A01;
    public final InterfaceC11380iw A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final CircularImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final IgdsButton A09;
    public final RoundedCornerMediaFrameLayout A0A;
    public final List A0B;
    public final IgdsButton A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44780Js1(View view, InterfaceC11380iw interfaceC11380iw) {
        super(view);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A02 = interfaceC11380iw;
        this.A05 = AbstractC25231BEo.A0d(view, R.id.standard_dxma_title);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.standard_dxma_caption);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.standard_dxma_subtitle);
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(view, R.id.standard_dxma_cta_button_primary);
        this.A09 = igdsButton;
        IgdsButton igdsButton2 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.standard_dxma_cta_button_secondary);
        this.A0C = igdsButton2;
        this.A07 = AbstractC167007dF.A0T(view, R.id.standard_dxma_facepile);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A0A = (RoundedCornerMediaFrameLayout) AbstractC166997dE.A0R(view, R.id.standard_dxma_media_container);
        this.A06 = AbstractC31176DnK.A0U(view, R.id.standard_dxma_favicon_circular);
        this.A08 = AbstractC167007dF.A0T(view, R.id.standard_dxma_media);
        this.A01 = (Space) AbstractC166997dE.A0R(view, R.id.standard_dxma_space_below_caption);
        this.A0B = AbstractC16960so.A1Q(igdsButton, igdsButton2);
    }

    @Override // X.C7QD
    public final View BKF() {
        return AbstractC31171DnF.A06(this);
    }
}
