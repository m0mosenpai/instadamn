package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.CqE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28963CqE implements InterfaceC51522Ya {
    public final /* synthetic */ C26621BpI A00;

    public C28963CqE(C26621BpI c26621BpI) {
        this.A00 = c26621BpI;
    }

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        View inflate = AbstractC25231BEo.A0N(context).inflate(R.layout.row_feed_carousel_media_image, (ViewGroup) null);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(483));
        inflate.setTag(C41T.A00(inflate, this.A00.A00, null, null));
        return inflate;
    }
}
