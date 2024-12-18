package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;
import java.util.List;

/* renamed from: X.Jnl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44564Jnl extends C2UU {
    public List A00;
    public final Context A01;
    public final InterfaceC09390do A02;
    public final int A03;
    public final UserSession A04;
    public final GiphyClipsBrowserFragment A05;

    public C44564Jnl(Context context, UserSession userSession, GiphyClipsBrowserFragment giphyClipsBrowserFragment, int i) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A01 = context;
        this.A03 = i;
        this.A05 = giphyClipsBrowserFragment;
        this.A00 = AbstractC166987dD.A1E();
        this.A02 = AbstractC09440dt.A01(new B5y(this, 22));
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C44662Jq7) {
            C44662Jq7 c44662Jq7 = (C44662Jq7) c3oo;
            C45056Jwl c45056Jwl = (C45056Jwl) this.A00.get(i);
            int i2 = this.A03 / 2;
            C14360o3.A0B(c45056Jwl, 0);
            ImageView A08 = AbstractC31171DnF.A08(c44662Jq7.itemView, R.id.gif_image);
            View findViewById = c44662Jq7.itemView.findViewById(R.id.black_dim);
            View findViewById2 = c44662Jq7.itemView.findViewById(R.id.shimmer);
            View findViewById3 = c44662Jq7.itemView.findViewById(R.id.loading_spinner);
            TextView A0e = AbstractC166987dD.A0e(c44662Jq7.itemView, R.id.duration_label);
            A0e.setText(AbstractC189358aC.A01(c45056Jwl.A00));
            C47712L4t c47712L4t = c45056Jwl.A02;
            float f = c47712L4t.A01 / c47712L4t.A00;
            if (Float.isNaN(f)) {
                f = 1.0f;
            }
            C74V A00 = C74U.A00(f, i2, 0, -1);
            int intValue = c45056Jwl.A04.intValue();
            if (intValue != 2) {
                if (intValue != 1) {
                    if (intValue == 0) {
                        A08.setVisibility(8);
                        findViewById3.setVisibility(8);
                        A0e.setVisibility(8);
                        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                        int i3 = A00.A02;
                        layoutParams.width = i3;
                        ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                        int i4 = A00.A00;
                        layoutParams2.height = i4;
                        findViewById2.setVisibility(0);
                        AbstractC43592JPx.A1G(findViewById, i3);
                        AbstractC43592JPx.A1F(findViewById, i4);
                        findViewById.setVisibility(8);
                        Context A03 = AbstractC37301Gc2.A03(c44662Jq7);
                        UserSession userSession = c44662Jq7.A00;
                        ImageUrl imageUrl = c47712L4t.A05;
                        C14360o3.A07(imageUrl);
                        A08.setImageDrawable(new C74P(A03, userSession, imageUrl, null, new C23675AeA(1, A0e, findViewById2, A08, c44662Jq7), A00, C05F.A01, c45056Jwl.A05, AbstractC43594JPz.A04(AbstractC37301Gc2.A03(c44662Jq7)), AbstractC37301Gc2.A03(c44662Jq7).getColor(R.color.cds_white_a20), AbstractC37301Gc2.A03(c44662Jq7).getColor(R.color.black_20_transparent), false));
                        A08.setOnTouchListener(new ViewOnTouchListenerC48075LQa(2, new GestureDetector(AbstractC37301Gc2.A03(c44662Jq7), new C44401Jje(A08, c44662Jq7, c45056Jwl, i)), findViewById));
                        return;
                    }
                    throw B4Z.A00();
                }
                A08.setVisibility(8);
                findViewById3.setVisibility(8);
                A0e.setVisibility(8);
                findViewById2.getLayoutParams().width = A00.A02;
                findViewById2.getLayoutParams().height = A00.A00;
                findViewById2.setVisibility(0);
                return;
            }
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(0);
            A08.setVisibility(0);
            A0e.setVisibility(0);
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-77127632);
        int size = this.A00.size();
        C0f9.A0A(-1944406819, A03);
        return size;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean A1Y = AbstractC43592JPx.A1Y(viewGroup);
        return new C44662Jq7(AbstractC25226BEj.A0R(LayoutInflater.from(this.A01), viewGroup, R.layout.giphy_clips_browser_item, A1Y), this.A04, this.A05);
    }
}
