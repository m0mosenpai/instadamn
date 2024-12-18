package X;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.R;

/* renamed from: X.Mc9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50792Mc9 extends ViewOutlineProvider {
    public final /* synthetic */ Context A00;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC167007dF.A1K(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00.getResources().getDimension(R.dimen.account_discovery_bottom_gap));
    }

    public C50792Mc9(Context context) {
        this.A00 = context;
    }
}
