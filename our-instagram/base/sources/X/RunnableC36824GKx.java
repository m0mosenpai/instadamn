package X;

import com.facebook.R;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.GKx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36824GKx implements Runnable {
    public final /* synthetic */ V11 A00;

    public RunnableC36824GKx(V11 v11) {
        this.A00 = v11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2OG A01 = C2OG.A01();
        V11 v11 = this.A00;
        C34648FOf A00 = C35129FeW.A00(AbstractC31173DnH.A0t(v11.A0N));
        A00.A0G = "promote_special_requirement_audience_update_notification";
        A00.A0H = v11.getString(2131970944);
        A00.A0I = true;
        A00.A03 = PushChannelType.A09;
        A00.A01 = AbstractC56412ia.A00(AbstractC166997dE.A0N(v11), R.drawable.instagram_business_images_users_circle_filled);
        C35129FeW.A01(A00, A01);
    }
}
