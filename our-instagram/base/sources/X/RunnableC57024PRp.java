package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;

/* renamed from: X.PRp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57024PRp implements Runnable {
    public final /* synthetic */ C53404Njt A00;
    public final /* synthetic */ C53020Ncs A01;

    public RunnableC57024PRp(C53404Njt c53404Njt, C53020Ncs c53020Ncs) {
        this.A01 = c53020Ncs;
        this.A00 = c53404Njt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgLiveWithGuestFragment igLiveWithGuestFragment = this.A01.A0L;
        C53404Njt c53404Njt = this.A00;
        String str = null;
        C11T.A06(AbstractC111324zv.A00(1817));
        C56804PIv c56804PIv = igLiveWithGuestFragment.A05;
        if (c56804PIv == null) {
            C14360o3.A0F("liveWithGuestWaterfall");
            throw C00O.createAndThrow();
        }
        String str2 = c53404Njt.A01;
        String name = c53404Njt.A00.name();
        String message = c53404Njt.getMessage();
        if (message == null) {
            message = "null_message";
        }
        c56804PIv.A0B(str2, name, message, true);
        Bundle A0b = AbstractC166987dD.A0b();
        Context context = igLiveWithGuestFragment.getContext();
        if (context != null) {
            str = context.getString(2131965366);
        }
        A0b.putString("IgLive.error_message", str);
        Intent A04 = AbstractC31171DnF.A04();
        A04.putExtras(A0b);
        igLiveWithGuestFragment.A0B = true;
        FragmentActivity activity = igLiveWithGuestFragment.getActivity();
        if (activity != null) {
            activity.setResult(0, A04);
            activity.onBackPressed();
        }
    }
}
