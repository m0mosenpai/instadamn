package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Oid, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55372Oid implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;

    public ViewOnClickListenerC55372Oid(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1470379300);
        FragmentActivity fragmentActivity = this.A00;
        fragmentActivity.setResult(-1);
        fragmentActivity.onBackPressed();
        C0f9.A0C(-1488182376, A05);
    }
}
