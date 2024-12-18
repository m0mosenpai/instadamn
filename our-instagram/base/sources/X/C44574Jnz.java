package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jnz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44574Jnz extends C2UU {
    public static final InterfaceC11380iw A02 = AbstractC31171DnF.A0D("reply_composer_module");
    public final C47404Kwt A00;
    public final List A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C44722Jr5(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.layout_profile_reply_container, false), this);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44722Jr5 c44722Jr5 = (C44722Jr5) c3oo;
        C14360o3.A0B(c44722Jr5, 0);
        C47404Kwt c47404Kwt = this.A00;
        Object obj = this.A01.get(i);
        C14360o3.A0B(obj, 0);
        Map map = c47404Kwt.A00.A08;
        if (map == null) {
            C14360o3.A0F("selectedThreads");
            throw C00O.createAndThrow();
        }
        C31228DoB c31228DoB = (C31228DoB) map.get(obj);
        if (c31228DoB != null) {
            IgTextView igTextView = c44722Jr5.A00;
            String str = c31228DoB.A03.A0I;
            if (str == null) {
                str = "";
            }
            igTextView.setText(str);
            JUM jum = c31228DoB.A02;
            AbstractC46437Kgx abstractC46437Kgx = (AbstractC46437Kgx) jum.A01;
            if (abstractC46437Kgx instanceof JS9) {
                GradientSpinnerAvatarView gradientSpinnerAvatarView = c44722Jr5.A02;
                C14360o3.A0C(abstractC46437Kgx, "null cannot be cast to non-null type com.instagram.direct.inbox.ui.threadavatar.ThreadAvatarViewModel.Avatar.Single");
                ImageUrl imageUrl = ((JS9) abstractC46437Kgx).A00;
                gradientSpinnerAvatarView.A0F((C9BW) jum.A05, A02, imageUrl);
                gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            }
            C0fQ.A00(new LOx(this, i, 2), c44722Jr5.A01);
        }
    }

    public C44574Jnz(C47404Kwt c47404Kwt, List list) {
        this.A01 = list;
        this.A00 = c47404Kwt;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-360758375);
        int size = this.A01.size();
        C0f9.A0A(-1256648025, A03);
        return size;
    }
}
