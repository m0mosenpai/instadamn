package X;

import android.view.View;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public final class ASV implements View.OnClickListener {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ C221049pS A02;
    public final /* synthetic */ C144386fK A03;
    public final /* synthetic */ InterfaceC145626hL A04;

    public ASV(ImageView imageView, C84823qW c84823qW, C221049pS c221049pS, C144386fK c144386fK, InterfaceC145626hL interfaceC145626hL) {
        this.A03 = c144386fK;
        this.A00 = imageView;
        this.A02 = c221049pS;
        this.A04 = interfaceC145626hL;
        this.A01 = c84823qW;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-890390810);
        C14360o3.A07(this.A03.A01);
        float A01 = AbstractC13890nF.A01(r0) * 0.5f;
        float translationY = this.A00.getTranslationY() + (this.A02.A00.A04 * 0.5f);
        InterfaceC145626hL interfaceC145626hL = this.A04;
        if (interfaceC145626hL != null) {
            interfaceC145626hL.Ddl(this.A01, (int) A01, (int) translationY);
        }
        C0f9.A0C(368505769, A05);
    }
}
