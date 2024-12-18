package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;

/* renamed from: X.Gtn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38351Gtn extends C2UU {
    public C41197ILl A00;
    public final UserSession A01;
    public final List A02 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC25231BEo.A0O(viewGroup).inflate(R.layout.row_feed_collection_thumbnail_media_rounded_border, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC43591JPw.A00(1212));
        return new C38438GvL((MediaFrameLayout) inflate);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C38438GvL c38438GvL = (C38438GvL) c3oo;
        C14360o3.A0B(c38438GvL, 0);
        C41197ILl c41197ILl = this.A00;
        if (c41197ILl != null) {
            MediaFrameLayout mediaFrameLayout = c38438GvL.A01;
            c41197ILl.A00((C38612GyF) this.A02.get(i), c38438GvL.A00, mediaFrameLayout, i, false);
        }
    }

    public C38351Gtn(UserSession userSession) {
        this.A01 = userSession;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-960292130);
        int size = this.A02.size();
        C0f9.A0A(-1163498329, A03);
        return size;
    }
}
