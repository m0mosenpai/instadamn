package X;

import android.view.View;

/* renamed from: X.D1u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29593D1u implements Runnable {
    public final /* synthetic */ C76223bS A00;
    public final /* synthetic */ C25429BMu A01;

    public RunnableC29593D1u(C76223bS c76223bS, C25429BMu c25429BMu) {
        this.A00 = c76223bS;
        this.A01 = c25429BMu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        C2XE c2xe = this.A00.A05;
        View A03 = c2xe.A03("clips_media_info_parent_component");
        Integer num2 = null;
        if (A03 != null) {
            num = Integer.valueOf(A03.getHeight());
        } else {
            num = null;
        }
        View A032 = c2xe.A03("clips_lithoview_parent_component");
        if (A032 != null) {
            num2 = Integer.valueOf(A032.getHeight());
        }
        if (num != null && num2 != null && num.intValue() >= num2.intValue() / 2) {
            C25429BMu c25429BMu = this.A01;
            EnumC76913cd enumC76913cd = C25429BMu.A09;
            c25429BMu.A01.A0f(false);
        }
    }
}
