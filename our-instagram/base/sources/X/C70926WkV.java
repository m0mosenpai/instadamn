package X;

import android.content.Context;
import android.widget.ImageView;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WkV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70926WkV implements InterfaceC63862v7 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C70110W4h A01;

    public C70926WkV(Context context, C70110W4h c70110W4h) {
        this.A00 = context;
        this.A01 = c70110W4h;
    }

    @Override // X.InterfaceC63862v7
    public final void DK9(AbstractC115105If abstractC115105If, Hashtag hashtag) {
        C70110W4h.A00(this.A01, false);
        C9GR.A01(this.A00, "follow_hashtag_error", 2131962702, 0);
    }

    @Override // X.InterfaceC63862v7
    public final void DKA(InterfaceC40821up interfaceC40821up, Hashtag hashtag) {
        C9GR.A07(this.A00, 2131962755);
        C70110W4h c70110W4h = this.A01;
        C69730VuP c69730VuP = new C69730VuP(c70110W4h.A03);
        c69730VuP.A09 = 1;
        c70110W4h.A03 = c69730VuP.A00();
    }

    @Override // X.InterfaceC63862v7
    public final void DKC(AbstractC115105If abstractC115105If, Hashtag hashtag) {
        C70110W4h.A00(this.A01, true);
        C9GR.A0F(this.A00, "unfollow_hashtag_error", 2131976075);
    }

    @Override // X.InterfaceC63862v7
    public final void DKD(InterfaceC40821up interfaceC40821up, Hashtag hashtag) {
        C70110W4h c70110W4h = this.A01;
        if (!AbstractC31177DnL.A1b(c70110W4h.A03.AbF())) {
            ImageView imageView = c70110W4h.A00;
            if (imageView == null) {
                C14360o3.A0F("followButton");
                throw C00O.createAndThrow();
            }
            imageView.setVisibility(8);
        }
        C9GR.A07(this.A00, 2131975702);
        C69730VuP c69730VuP = new C69730VuP(c70110W4h.A03);
        c69730VuP.A09 = 0;
        c70110W4h.A03 = c69730VuP.A00();
    }
}
