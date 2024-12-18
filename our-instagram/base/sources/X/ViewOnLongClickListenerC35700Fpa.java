package X;

import android.view.View;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.Fpa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLongClickListenerC35700Fpa implements View.OnLongClickListener {
    public final /* synthetic */ InstagramMainActivity A00;

    public ViewOnLongClickListenerC35700Fpa(InstagramMainActivity instagramMainActivity) {
        this.A00 = instagramMainActivity;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return InstagramMainActivity.A0T(this.A00);
    }
}
