package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.List;

/* renamed from: X.Gu1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38365Gu1 extends C2UU {
    public List A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    public C38365Gu1(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A00 = C16930sl.A00;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        View view;
        int i2;
        InterfaceC130575v2 B8t;
        String url;
        C14360o3.A0B(c3oo, 0);
        if (getItemViewType(i) == 0) {
            TextView textView = ((C38407Gui) c3oo).A00;
            AbstractC166987dD.A1P(textView.getContext(), textView, 2131974637);
            return;
        }
        C38451GvY c38451GvY = (C38451GvY) c3oo;
        int i3 = i - 1;
        if (i3 >= this.A00.size()) {
            return;
        }
        InterfaceC37791pH interfaceC37791pH = (InterfaceC37791pH) this.A00.get(i3);
        InterfaceC38101pu AsP = interfaceC37791pH.AsP();
        if (AsP != null && (B8t = AsP.B8t()) != null && (url = B8t.getUrl()) != null) {
            view = c38451GvY.A00;
            Context context = view.getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.boost_guidance_preview_height);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.clips_editor_timeline_v3_single_segment_drawer_height);
            RoundedCornerImageView roundedCornerImageView = c38451GvY.A02;
            roundedCornerImageView.setUrl(this.A03, new SimpleImageUrl(url, dimensionPixelSize2, dimensionPixelSize), this.A02);
            ViewOnClickListenerC42034Ik3.A00(roundedCornerImageView, 5, interfaceC37791pH, this);
            i2 = 0;
        } else {
            view = c38451GvY.A00;
            i2 = 8;
        }
        view.setVisibility(i2);
        String title = interfaceC37791pH.getTitle();
        TextView textView2 = c38451GvY.A01;
        if (title == null) {
            title = "";
        }
        textView2.setText(title);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0O = AbstractC25231BEo.A0O(viewGroup);
        if (i == 0) {
            return new C38407Gui(AbstractC25226BEj.A0R(A0O, viewGroup, R.layout.story_highlights_to_reels_header, false));
        }
        return new C38451GvY(AbstractC25226BEj.A0R(A0O, viewGroup, R.layout.story_highlights_to_reels_preview_item, false));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1780187901);
        int size = this.A00.size() + 1;
        C0f9.A0A(1511904820, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(218458633);
        int i2 = 1;
        if (i == 0) {
            i2 = 0;
        }
        C0f9.A0A(-1885283208, A03);
        return i2;
    }
}
