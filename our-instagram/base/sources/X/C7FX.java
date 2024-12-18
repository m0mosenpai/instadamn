package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.7FX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FX {
    public final /* synthetic */ C7W4 A00;
    public final /* synthetic */ AnonymousClass983 A01;

    public C7FX(C7W4 c7w4, AnonymousClass983 anonymousClass983) {
        this.A01 = anonymousClass983;
        this.A00 = c7w4;
    }

    public final void A00(int i, int i2, int i3, boolean z) {
        View view;
        AnonymousClass983 anonymousClass983 = this.A01;
        if (anonymousClass983.A0F != null) {
            C7W4 c7w4 = this.A00;
            if (c7w4.A0U.isAdded()) {
                AGM agm = anonymousClass983.A0Z;
                if (AnonymousClass983.A01(anonymousClass983).A00 != i && anonymousClass983.A0I == C7DI.A0F && agm != null && (view = agm.A00) != null) {
                    AbstractC13880nE.A0Y(view, i - view.getContext().getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
                }
                c7w4.A0S(i, i2, i3, z);
                return;
            }
        }
        anonymousClass983.A0c = Integer.valueOf(i);
    }
}
