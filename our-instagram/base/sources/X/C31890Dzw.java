package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dzw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31890Dzw extends C2UU {
    public final C65422xe A00;
    public final O44 A01;
    public final JnK A02;

    public C31890Dzw(O44 o44) {
        C14360o3.A0B(o44, 1);
        this.A01 = o44;
        JnK jnK = new JnK(1);
        this.A02 = jnK;
        this.A00 = new C65422xe(jnK, this);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new E25(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.internal_sticker_participant, false));
    }

    public final List A00() {
        Object obj;
        List<C32062E6o> list = this.A00.A02;
        ArrayList A10 = AbstractC31174DnI.A10(list);
        for (C32062E6o c32062E6o : list) {
            if (c32062E6o != null && (obj = c32062E6o.A02) != null) {
                A10.add(obj);
            }
        }
        return A10;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        E25 e25 = (E25) c3oo;
        C14360o3.A0B(e25, 0);
        O44 o44 = this.A01;
        Object obj = this.A00.A02.get(i);
        C14360o3.A07(obj);
        C32062E6o c32062E6o = (C32062E6o) obj;
        C14360o3.A0B(c32062E6o, 2);
        IgTextView igTextView = e25.A00;
        igTextView.setText(c32062E6o.A03);
        C85963sQ.A0B(igTextView, c32062E6o.A05);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = e25.A01;
        gradientSpinnerAvatarView.A0F(null, new C35962FuM(), (ImageUrl) c32062E6o.A01);
        gradientSpinnerAvatarView.setGradientSpinnerActivated(c32062E6o.A04);
        ViewOnClickListenerC35684FpJ.A00(gradientSpinnerAvatarView, o44, c32062E6o, e25, 48);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(951919146);
        int size = this.A00.A02.size();
        C0f9.A0A(-1835978454, A03);
        return size;
    }
}
