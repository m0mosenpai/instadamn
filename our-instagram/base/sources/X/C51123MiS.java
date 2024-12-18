package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.hashtag.Hashtag;
import java.util.List;

/* renamed from: X.MiS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51123MiS extends C2UU {
    public List A00;
    public final O2P A01;

    public C51123MiS(O2P o2p, List list) {
        C14360o3.A0B(o2p, 2);
        this.A00 = list;
        this.A01 = o2p;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51278Ml1(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.layout_clips_caption_suggestion_content_based_hashtag, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51278Ml1 c51278Ml1 = (C51278Ml1) c3oo;
        C14360o3.A0B(c51278Ml1, 0);
        Hashtag hashtag = (Hashtag) this.A00.get(i);
        String name = hashtag.getName();
        if (name != null) {
            c51278Ml1.A01.setText(name);
            IgTextView igTextView = c51278Ml1.A00;
            C14360o3.A07(igTextView);
            WE3.A02(igTextView, hashtag.B8G());
            Ok6.A00(c51278Ml1.itemView, this, name, 3);
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(2028002971);
        int size = this.A00.size();
        C0f9.A0A(-1920617425, A03);
        return size;
    }
}
