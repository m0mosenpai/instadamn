package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.PFy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56730PFy implements InterfaceC25201BCz {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C006802i A02;
    public final /* synthetic */ AbstractC12990ll A03;
    public final /* synthetic */ Runnable A04;

    public C56730PFy(Activity activity, Intent intent, C006802i c006802i, AbstractC12990ll abstractC12990ll, Runnable runnable) {
        this.A04 = runnable;
        this.A03 = abstractC12990ll;
        this.A00 = activity;
        this.A01 = intent;
        this.A02 = c006802i;
    }

    @Override // X.InterfaceC25201BCz
    public final void onFailure(Exception exc) {
        C006802i c006802i = this.A02;
        if (c006802i.isMarkerOn(18951415)) {
            MSY.A1D(c006802i, TraceFieldType.FailureReason, "asset_load_failure", 18951415);
        }
        this.A04.run();
    }

    @Override // X.InterfaceC25201BCz
    public final void onSuccess() {
        this.A04.run();
        AbstractC12990ll abstractC12990ll = this.A03;
        if ((abstractC12990ll instanceof UserSession) && C18U.A06(C06090Tz.A05, abstractC12990ll, 36314412344150568L)) {
            Bundle A0b = AbstractC166987dD.A0b();
            Activity activity = this.A00;
            C6XJ A02 = C6XJ.A02(activity, A0b, abstractC12990ll, TransparentModalActivity.class, AbstractC111324zv.A00(5480));
            A02.A0J = ModalActivity.A08;
            A02.A0C(activity);
            return;
        }
        C14H A00 = C14H.A03.A00();
        Activity activity2 = this.A00;
        Intent A01 = A00.A01(activity2);
        A01.putExtra("StoryHandlerActivity.EXTRA_SHARE_INTENT", this.A01);
        C12260kU.A00.A07().A0G(activity2, A01);
    }
}
