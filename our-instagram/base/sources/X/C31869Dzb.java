package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Dzb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31869Dzb extends C2UU {
    public final C65422xe A00;
    public final JnK A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new E26(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.story_party_participant, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        E26 e26 = (E26) c3oo;
        C14360o3.A0B(e26, 0);
        Object obj = this.A00.A02.get(i);
        C14360o3.A07(obj);
        C32062E6o c32062E6o = (C32062E6o) obj;
        C14360o3.A0B(c32062E6o, 1);
        IgTextView igTextView = e26.A00;
        igTextView.setText(c32062E6o.A03);
        C85963sQ.A0B(igTextView, c32062E6o.A05);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = e26.A01;
        gradientSpinnerAvatarView.A0F(null, new C35963FuN(), (ImageUrl) c32062E6o.A02);
        gradientSpinnerAvatarView.setGradientSpinnerActivated(c32062E6o.A04);
        C0fQ.A00((View.OnClickListener) c32062E6o.A01, gradientSpinnerAvatarView);
    }

    public C31869Dzb() {
        JnK jnK = new JnK(2);
        this.A01 = jnK;
        this.A00 = new C65422xe(jnK, this);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1425407077);
        int size = this.A00.A02.size();
        C0f9.A0A(1717258918, A03);
        return size;
    }
}
