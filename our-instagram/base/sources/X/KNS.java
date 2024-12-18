package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.gallery.albumpicker.AlbumThumbnailView;
import java.util.List;

/* loaded from: classes8.dex */
public final class KNS extends JnX {
    public C44321JiD A00;
    public InterfaceC193828i3 A01;
    public final C51737MtK A02;
    public final UserSession A03;
    public final List A04;

    public KNS(C51737MtK c51737MtK, UserSession userSession, C44321JiD c44321JiD, InterfaceC193828i3 interfaceC193828i3) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = interfaceC193828i3;
        this.A02 = c51737MtK;
        this.A00 = c44321JiD;
        this.A04 = AbstractC166987dD.A1E();
    }

    public final void A01(List list) {
        C14360o3.A0B(list, 0);
        List list2 = this.A04;
        C66582za A00 = AbstractC66552zX.A00(new JnI(this, list2, list));
        list2.clear();
        list2.addAll(list);
        A00.A03(this);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.album_thumbnail_view_layout, viewGroup, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A03;
        C14360o3.A0A(inflate);
        return new C44661Jq6(inflate, userSession, this.A01);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44661Jq6 c44661Jq6 = (C44661Jq6) c3oo;
        C14360o3.A0B(c44661Jq6, 0);
        C51756Mtf c51756Mtf = (C51756Mtf) this.A04.get(i);
        C51737MtK c51737MtK = this.A02;
        C14360o3.A0B(c51756Mtf, 0);
        AlbumThumbnailView albumThumbnailView = c44661Jq6.A01;
        ViewGroup.LayoutParams layoutParams = albumThumbnailView.getLayoutParams();
        layoutParams.width = c51737MtK.A01;
        albumThumbnailView.setLayoutParams(layoutParams);
        albumThumbnailView.A00(c51737MtK, c51756Mtf, c44661Jq6.A00);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1185655666);
        int size = this.A04.size();
        C0f9.A0A(325300488, A03);
        return size;
    }
}
