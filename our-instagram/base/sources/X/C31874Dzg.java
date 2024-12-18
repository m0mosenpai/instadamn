package X;

import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dzg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31874Dzg extends C2UU {
    public List A00 = AbstractC166987dD.A1E();
    public final InterfaceC11380iw A01;
    public final C32244EId A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C51758Mth c51758Mth = (C51758Mth) this.A00.get(i);
        C31980E3i c31980E3i = (C31980E3i) c3oo;
        int i2 = 0;
        C14360o3.A0B(c51758Mth, 0);
        User user = (User) c51758Mth.A00;
        IgTextView igTextView = c31980E3i.A04;
        AbstractC31173DnH.A1F(igTextView, user);
        boolean isVerified = user.isVerified();
        String username = user.getUsername();
        if (isVerified) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(username);
            C85963sQ.A07(AbstractC166997dE.A0L(igTextView), A0H, true);
            igTextView.setText(A0H);
        } else {
            igTextView.setText(username);
        }
        IgTextView igTextView2 = c31980E3i.A05;
        igTextView2.setText(user.B8y());
        CircularImageView circularImageView = c31980E3i.A01;
        ImageUrl Bhu = user.Bhu();
        C31874Dzg c31874Dzg = c31980E3i.A06;
        circularImageView.setUrl(Bhu, c31874Dzg.A01);
        boolean z = c51758Mth.A01;
        ImageView imageView = c31980E3i.A00;
        if (z) {
            imageView.setImageDrawable(AbstractC172497mJ.A03(AbstractC166997dE.A0L(c31980E3i.A03), R.drawable.close_friends_star_small, 2));
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        ViewOnClickListenerC35687FpM.A00(igTextView, 52, user, c31874Dzg);
        ViewOnClickListenerC35687FpM.A00(igTextView2, 53, user, c31874Dzg);
        ViewOnClickListenerC35687FpM.A00(circularImageView, 54, user, c31874Dzg);
        ViewOnClickListenerC35687FpM.A00(c31980E3i.A02, 55, user, c31874Dzg);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31980E3i((ViewGroup) AbstractC31175DnJ.A07(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.birthday_center_user_item, false), this);
    }

    public C31874Dzg(InterfaceC11380iw interfaceC11380iw, C32244EId c32244EId) {
        this.A01 = interfaceC11380iw;
        this.A02 = c32244EId;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(563238730);
        int size = this.A00.size();
        C0f9.A0A(-2142133776, A03);
        return size;
    }
}
