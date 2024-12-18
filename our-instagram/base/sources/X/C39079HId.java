package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.HId, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39079HId extends AbstractC66412zI {
    public final InterfaceC11380iw A01;
    public final JPT A02;
    public final C38093GpM A03;
    public final InterfaceC153826vr A04;
    public final int A00 = 8388661;
    public final Queue A05 = new LinkedList();

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        HKb hKb = (HKb) interfaceC66482zP;
        HKN hkn = (HKN) c3oo;
        AbstractC167007dF.A1K(hKb, hkn);
        this.A03.A00(this.A02, hKb, ((C127995qS) hKb).A01, ((C38160GqR) hkn).A00, false);
        AbstractC40615HzZ.A00(hkn, hKb, this.A04, this.A05, this.A00);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0B(interfaceC11380iw, 0);
        User user = hKb.A02;
        if (user != null) {
            CircularImageView circularImageView = hkn.A01;
            AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView, user);
            circularImageView.setVisibility(0);
            return;
        }
        hkn.A01.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.selectable_grid_item, viewGroup, false);
        inflate.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        return new HKN(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKb.class;
    }

    public C39079HId(InterfaceC11380iw interfaceC11380iw, JPT jpt, C38093GpM c38093GpM, InterfaceC153826vr interfaceC153826vr) {
        this.A01 = interfaceC11380iw;
        this.A03 = c38093GpM;
        this.A04 = interfaceC153826vr;
        this.A02 = jpt;
    }
}
