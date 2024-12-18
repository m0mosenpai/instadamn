package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class DMU extends C0YY implements InterfaceC16660sJ {
    public static final DMU A00 = new DMU();

    public DMU() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C14360o3.A0B(context, 0);
        return LayoutInflater.from(context).inflate(R.layout.carousel_comment_tooltip_banner, (ViewGroup) null, false);
    }
}
