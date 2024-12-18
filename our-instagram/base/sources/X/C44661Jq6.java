package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.gallery.albumpicker.AlbumThumbnailView;

/* renamed from: X.Jq6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44661Jq6 extends C3OO {
    public final UserSession A00;
    public final AlbumThumbnailView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44661Jq6(View view, UserSession userSession, InterfaceC193828i3 interfaceC193828i3) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A00 = userSession;
        AlbumThumbnailView albumThumbnailView = (AlbumThumbnailView) AbstractC166987dD.A0c(view, R.id.album_thumbnail_view);
        this.A01 = albumThumbnailView;
        albumThumbnailView.A01 = new C48601Led(interfaceC193828i3, this);
    }
}
