package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.E3f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31977E3f extends C3OO {
    public final View A00;
    public final ViewGroup A01;
    public final C70846WiC A02;
    public final IgdsButton A03;
    public final IgdsButton A04;
    public final IgdsButton A05;
    public final FOZ A06;

    public C31977E3f(View view, C70846WiC c70846WiC) {
        super(view);
        this.A02 = c70846WiC;
        ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.profile_row_container);
        this.A01 = A0F;
        ViewGroup A01 = AbstractC35187Fff.A01(view.getContext(), A0F);
        A01.setMinimumHeight(0);
        this.A00 = A01.requireViewById(R.id.row_user_container_base);
        A01.requireViewById(R.id.row_user_imageview).setMinimumWidth(0);
        A01.getChildAt(0).setMinimumHeight(0);
        A0F.addView(A01);
        AbstractC13880nE.A0l(A01.requireViewById(R.id.row_user_container_base), 0, 0, 0, 0);
        this.A06 = (FOZ) AbstractC31172DnG.A0x(A01);
        this.A04 = AbstractC31173DnH.A0W(view, R.id.delivery_button);
        this.A03 = AbstractC31173DnH.A0W(view, R.id.contact_button);
        this.A05 = AbstractC31173DnH.A0W(view, R.id.see_menu_button);
    }
}
