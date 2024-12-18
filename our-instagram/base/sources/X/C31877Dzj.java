package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Dzj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31877Dzj extends C2UU {
    public List A00;
    public List A01;
    public final Context A02;
    public final UserSession A03;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C31963E2r) {
            Drawable drawable = this.A02.getDrawable(R.drawable.profile_anonymous_user);
            if (drawable != null) {
                ((C31963E2r) c3oo).A03.setAvatarViewDrawable(drawable);
            }
            C31963E2r c31963E2r = (C31963E2r) c3oo;
            IgTextView igTextView = c31963E2r.A01;
            C26055Bfi c26055Bfi = (C26055Bfi) AbstractC001800i.A0O(this.A00, i);
            String str2 = null;
            if (c26055Bfi != null) {
                str = c26055Bfi.A03;
            } else {
                str = null;
            }
            igTextView.setText(str);
            IgTextView igTextView2 = c31963E2r.A00;
            C26055Bfi c26055Bfi2 = (C26055Bfi) AbstractC001800i.A0O(this.A00, i);
            if (c26055Bfi2 != null) {
                str2 = c26055Bfi2.A04;
            }
            igTextView2.setText(str2);
            ViewOnClickListenerC35668Fp3.A00(c31963E2r.A02, this, i, 1);
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31963E2r(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.directshare_row_user, false));
    }

    public C31877Dzj(Context context, UserSession userSession, List list) {
        AbstractC167017dG.A1Q(userSession, list);
        this.A03 = userSession;
        this.A02 = context;
        this.A01 = list;
        this.A00 = list;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(621207621);
        int size = this.A00.size();
        C0f9.A0A(-1115573073, A03);
        return size;
    }
}
