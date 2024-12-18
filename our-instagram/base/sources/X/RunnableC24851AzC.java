package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.AzC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24851AzC implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ IgdsButton A02;
    public final /* synthetic */ C8F9 A03;

    public RunnableC24851AzC(Context context, View view, IgdsButton igdsButton, C8F9 c8f9) {
        this.A02 = igdsButton;
        this.A01 = view;
        this.A00 = context;
        this.A03 = c8f9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgdsButton igdsButton = this.A02;
        float x = igdsButton.getX() + (igdsButton.getWidth() / 2);
        View view = this.A01;
        float A07 = x / AbstractC166987dD.A07(view);
        float y = (igdsButton.getY() + (igdsButton.getHeight() / 2)) / AbstractC166987dD.A08(view);
        this.A03.A02 = new URK(null, Float.valueOf((AbstractC166987dD.A08(igdsButton) + (this.A00.getResources().getDimension(R.dimen.account_discovery_bottom_gap) * 2.0f)) / AbstractC166987dD.A08(view)), Float.valueOf(A07), Float.valueOf(y), Float.valueOf(AbstractC166987dD.A08(igdsButton) / AbstractC166987dD.A08(view)), Float.valueOf(AbstractC166987dD.A07(igdsButton) / AbstractC166987dD.A07(view)), null, null, null);
    }
}
