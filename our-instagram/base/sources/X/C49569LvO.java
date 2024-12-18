package X;

import android.app.Activity;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.LvO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49569LvO implements MPD {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC143576dw A01;
    public final /* synthetic */ C145126gX A02;
    public final /* synthetic */ String A03;

    public C49569LvO(Activity activity, InterfaceC143576dw interfaceC143576dw, C145126gX c145126gX, String str) {
        this.A02 = c145126gX;
        this.A01 = interfaceC143576dw;
        this.A00 = activity;
        this.A03 = str;
    }

    @Override // X.MPD
    public final void DWM() {
        C145126gX c145126gX = this.A02;
        c145126gX.A0U.EJJ();
        View C29 = this.A01.C29();
        if (C29 != null) {
            Activity activity = this.A00;
            String str = this.A03;
            C148376m7 c148376m7 = c145126gX.A08;
            if (c148376m7 != null) {
                DisplayMetrics displayMetrics = C29.getResources().getDisplayMetrics();
                RectF rectF = AbstractC13880nE.A01;
                c148376m7.A02(activity, new C207559Gj(C29, 0, (int) TypedValue.applyDimension(1, -26.0f, displayMetrics), true), str, true);
            }
        }
    }
}
