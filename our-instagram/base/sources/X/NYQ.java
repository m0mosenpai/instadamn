package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NYQ extends OL3 {
    public InterfaceC58002Pnm A00;
    public final AbstractC59962oe A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C105824pt A04;
    public final InterfaceC16620sF A05;
    public final boolean A06;

    /* JADX WARN: Type inference failed for: r5v2, types: [X.Pps, java.lang.Object] */
    public static final void A00(NYQ nyq) {
        Context context;
        C55043OZp c55043OZp = ((OL3) nyq).A04;
        int size = c55043OZp.A08.size();
        boolean z = true;
        ViewGroup.LayoutParams layoutParams = ((OL3) nyq).A03.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (size > 1) {
            context = ((OL3) nyq).A02;
            marginLayoutParams.setMargins(context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0, AbstractC166997dE.A04(context, R.dimen.abc_edit_text_inset_top_material), 0);
        } else {
            boolean z2 = false;
            marginLayoutParams.setMargins(0, 0, 0, 0);
            context = ((OL3) nyq).A02;
            C14360o3.A07(context);
            if (AbstractC13880nE.A05(AbstractC13880nE.A0I(context)) == 0.5625f) {
                z2 = true;
            }
            z = !z2;
        }
        int A06 = AbstractC167017dG.A06(context);
        c55043OZp.A01 = new C54820OKy(new Object(), AbstractC166997dE.A04(context, R.dimen.abc_edit_text_inset_top_material), context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), A06, z);
        c55043OZp.A06.A01(new C54483O5l(c55043OZp));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NYQ(ConstraintLayout constraintLayout, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C105824pt c105824pt, InterfaceC58002Pnm interfaceC58002Pnm, InterfaceC16620sF interfaceC16620sF, boolean z) {
        super(constraintLayout);
        AbstractC167017dG.A1R(constraintLayout, userSession);
        this.A01 = abstractC59962oe;
        this.A03 = userSession;
        this.A00 = interfaceC58002Pnm;
        this.A05 = interfaceC16620sF;
        this.A02 = interfaceC11380iw;
        this.A06 = z;
        this.A04 = c105824pt;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
        ((C56302iJ) layoutParams).A0z = "9:16";
        A00(this);
    }
}
