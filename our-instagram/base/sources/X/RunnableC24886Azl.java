package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.Azl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24886Azl implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ C6UI A04;
    public final /* synthetic */ C15080pO A05;

    public RunnableC24886Azl(Context context, C6UI c6ui, C15080pO c15080pO, float f, float f2, float f3) {
        this.A01 = f;
        this.A04 = c6ui;
        this.A03 = context;
        this.A00 = f2;
        this.A02 = f3;
        this.A05 = c15080pO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f = this.A01;
        InterfaceC56392iX interfaceC56392iX = this.A04.A02.A02;
        float A07 = f - (AbstractC166987dD.A07(interfaceC56392iX.getView()) * 0.5f);
        Context context = this.A03;
        C138436Oz.A02(interfaceC56392iX.getView(), A07, (this.A02 + this.A05.A00) - ((context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material) + AbstractC167017dG.A0F(context)) * this.A00), false);
    }
}
