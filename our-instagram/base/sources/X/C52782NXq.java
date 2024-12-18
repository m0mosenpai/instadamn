package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.NXq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52782NXq extends AnonymousClass772 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ OUX A01;
    public final /* synthetic */ InterfaceC58161PqQ A02;
    public final /* synthetic */ C51228MkD A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52782NXq(Context context, OUX oux, InterfaceC58161PqQ interfaceC58161PqQ, C51228MkD c51228MkD, int i) {
        super(Integer.valueOf(i));
        this.A01 = oux;
        this.A00 = context;
        this.A03 = c51228MkD;
        this.A02 = interfaceC58161PqQ;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        OUX oux = this.A01;
        oux.A09 = false;
        Context context = this.A00;
        C51228MkD c51228MkD = this.A03;
        ImageView imageView = c51228MkD.A00;
        AbstractC166997dE.A19(context, imageView, R.drawable.instagram_error_pano_outline_24);
        AbstractC31177DnL.A0p(context, imageView, AbstractC53242c7.A08(context));
        c51228MkD.A01.setVisibility(0);
        c51228MkD.A02.setVisibility(8);
        this.A02.D6y(oux);
    }
}
