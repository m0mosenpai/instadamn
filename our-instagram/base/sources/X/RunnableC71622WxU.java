package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.user.model.UpcomingEvent;
import java.io.File;
import java.io.IOException;

/* renamed from: X.WxU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71622WxU implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C22P A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ UpcomingEvent A04;
    public final /* synthetic */ File A05;

    public RunnableC71622WxU(Activity activity, Fragment fragment, C22P c22p, UserSession userSession, UpcomingEvent upcomingEvent, File file) {
        this.A05 = file;
        this.A02 = c22p;
        this.A04 = upcomingEvent;
        this.A03 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("ReelUpcomingEventConstants.ARG_KEY_FILE_PATH", this.A05.getCanonicalPath());
            bundle.putSerializable("ReelUpcomingEventConstants.ARG_KEY_CAMERA_ENTRY_POINT", this.A02);
            bundle.putParcelable("ReelUpcomingEventConstants.ARG_KEY_UPCOMING_EVENT", this.A04);
            C6XJ.A02(this.A00, bundle, this.A03, TransparentModalActivity.class, AbstractC111324zv.A00(5195)).A0D(this.A01, 101);
        } catch (IOException unused) {
            C0w9.A03(AbstractC111324zv.A00(786), AbstractC111324zv.A00(638));
        }
    }
}
