package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentBackgroundModalActivity;

/* loaded from: classes5.dex */
public final class D24 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;

    public D24(Activity activity, Context context, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A02;
        C6XJ A03 = C6XJ.A03(this.A00, new Bundle(0), userSession, TransparentBackgroundModalActivity.class, AbstractC111324zv.A00(3485));
        A03.A08();
        A03.A0C(this.A01);
    }
}
