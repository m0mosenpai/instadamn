package X;

import android.os.Handler;
import android.view.View;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class PCN implements InterfaceC57985PnV {
    public O5I A00;
    public final Handler A01;
    public final View A02;
    public final View A03;
    public final Runnable A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public static final void A00(PCN pcn) {
        View view = pcn.A02;
        if (view.getVisibility() == 0) {
            float measuredHeight = view.getMeasuredHeight();
            view.setTranslationY(0.0f);
            MSX.A14(MSY.A0F(view.animate().translationY(-measuredHeight)), new PO3(pcn));
        }
        pcn.A06.getValue();
        view.setOnTouchListener(null);
    }

    public PCN(View view) {
        this.A03 = view;
        View A0F = AbstractC43594JPz.A0F(view, R.id.in_call_notif);
        A0F.requestApplyInsets();
        this.A02 = A0F;
        this.A07 = C57553PgR.A01(this, 20);
        this.A08 = C57553PgR.A01(this, 21);
        this.A05 = C57553PgR.A01(this, 18);
        this.A06 = C57553PgR.A01(this, 19);
        this.A01 = AbstractC167007dF.A0J();
        this.A04 = new PO4(this);
    }

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        AbstractC50523MSb.A0g();
        throw C00O.createAndThrow();
    }
}
