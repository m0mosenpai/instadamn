package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;

/* loaded from: classes6.dex */
public final class FRW {
    public ActionButton A00;
    public final InterfaceC56362iU A01;
    public final C35026Fbz A02;
    public final Context A03;

    public FRW(Context context, InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(context, 1);
        this.A03 = context;
        this.A01 = interfaceC56362iU;
        this.A02 = new C35026Fbz(C05F.A00);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Ffp, java.lang.Object] */
    public final void A00(View.OnClickListener onClickListener, Integer num) {
        ActionButton A00 = C31722DwR.A00(onClickListener, this.A01, new Object());
        this.A00 = A00;
        A00.setButtonResource(AbstractC65916TwN.A01(num));
        A01(false);
        ActionButton actionButton = this.A00;
        if (actionButton == null) {
            C14360o3.A0F("actionButton");
            throw C00O.createAndThrow();
        }
        Context context = this.A03;
        actionButton.setColorFilter(AbstractC31174DnI.A09(context, AbstractC53242c7.A09(context)));
    }

    public final void A01(boolean z) {
        ActionButton actionButton = this.A00;
        if (actionButton != null) {
            actionButton.setEnabled(z);
            ActionButton actionButton2 = this.A00;
            if (actionButton2 != null) {
                Context context = this.A03;
                int i = R.attr.igds_color_secondary_text;
                if (z) {
                    i = R.attr.igds_color_primary_text;
                }
                actionButton2.setColorFilter(C3DY.A00(AbstractC167007dF.A09(context, i)));
                return;
            }
        }
        C14360o3.A0F("actionButton");
        throw C00O.createAndThrow();
    }

    public final void A02(boolean z) {
        C35026Fbz c35026Fbz = this.A02;
        Context context = this.A03;
        int i = R.attr.igds_color_secondary_text;
        if (z) {
            i = R.attr.igds_color_primary_text;
        }
        c35026Fbz.A07 = C3DY.A00(AbstractC167007dF.A09(context, i));
        C35026Fbz.A00(this.A01, c35026Fbz);
    }
}
