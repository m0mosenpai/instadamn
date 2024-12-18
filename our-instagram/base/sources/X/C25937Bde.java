package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bde, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25937Bde extends C3OO {
    public ImageUrl A00;
    public final ImageView A01;
    public final TextView A02;
    public final String A03;
    public final InterfaceC16820sZ A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25937Bde(View view, String str, InterfaceC16820sZ interfaceC16820sZ) {
        super(view);
        C14360o3.A0B(interfaceC16820sZ, 3);
        this.A03 = str;
        this.A04 = interfaceC16820sZ;
        ViewOnClickListenerC28667ClF.A01(view, 64, this);
        this.A01 = (ImageView) view.requireViewById(R.id.direct_share_facepile_view);
        this.A02 = AbstractC166997dE.A0T(view, R.id.direct_share_facepile_overflow_text);
    }
}
