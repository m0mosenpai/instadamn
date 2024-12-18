package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class OUL {
    public static final C55942hf A06 = C55942hf.A03(5.0d, 10.0d);
    public final Handler A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final InterfaceC57881Pll A04;
    public final Runnable A05;

    public OUL(View view, View view2, InterfaceC57881Pll interfaceC57881Pll) {
        this.A01 = view;
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.type_indicator_icon);
        this.A03 = A0D;
        this.A00 = AbstractC167007dF.A0J();
        this.A05 = new POR(this);
        Context context = view.getContext();
        AbstractC31177DnL.A0p(context, A0D, AbstractC53242c7.A08(context));
        this.A02 = view2;
        this.A04 = interfaceC57881Pll;
    }
}
