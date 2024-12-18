package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Ael, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23712Ael implements InterfaceC69513Al {
    public final /* synthetic */ C86103sh A00;

    public C23712Ael(C86103sh c86103sh) {
        this.A00 = c86103sh;
    }

    @Override // X.InterfaceC69513Al
    public final /* bridge */ /* synthetic */ void DLu(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        C14360o3.A0B(viewGroup, 0);
        C86103sh c86103sh = this.A00;
        c86103sh.A04 = viewGroup;
        c86103sh.A0A = (IgImageView) viewGroup.findViewById(R.id.feed_preview_thumbnail);
    }
}
