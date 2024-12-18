package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.JrO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44741JrO extends C3OO {
    public C45196Jzc A00;
    public final InterfaceC11380iw A01;
    public final IgTextView A02;
    public final CircularImageView A03;
    public final InterfaceC16660sJ A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44741JrO(View view, InterfaceC11380iw interfaceC11380iw, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(view);
        AbstractC167017dG.A1R(interfaceC16660sJ, interfaceC11380iw);
        this.A04 = interfaceC16660sJ;
        this.A01 = interfaceC11380iw;
        this.A05 = z;
        this.A03 = AbstractC31176DnK.A0U(view, R.id.note_tagging_profile_view);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.note_tagging_name_view);
        C3P9 A0s = AbstractC166987dD.A0s(AbstractC31171DnF.A06(this));
        A0s.A07 = true;
        KKp.A01(A0s, this, 26);
    }
}
