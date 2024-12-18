package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;
import java.io.IOException;

/* renamed from: X.WvM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71517WvM implements Runnable {
    public final /* synthetic */ C70857WiN A00;
    public final /* synthetic */ File A01;

    public RunnableC71517WvM(C70857WiN c70857WiN, File file) {
        this.A00 = c70857WiN;
        this.A01 = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Bundle bundle = new Bundle();
            C70857WiN c70857WiN = this.A00;
            bundle.putString("ReelShoutOutConstants.ARG_SHOUTOUT_USERNAME", c70857WiN.A04);
            bundle.putString("ReelShoutOutConstants.ARG_SHOUTOUT_HEADER_TITLE", c70857WiN.A03);
            bundle.putString("ReelShoutOutConstants.ARG_SHOUTOUT_BACKGROUND_FILE", this.A01.getCanonicalPath());
            bundle.putBoolean("ReelShoutOutConstants.ARG_SHOW_TOOL_TIP", c70857WiN.A05);
            bundle.putSerializable("ReelShoutOutConstants.ARG_ENTRY_POINT", c70857WiN.A01);
            UserSession userSession = c70857WiN.A02;
            String A00 = AbstractC111324zv.A00(5191);
            FragmentActivity fragmentActivity = c70857WiN.A00;
            C6XJ.A02(fragmentActivity, bundle, userSession, TransparentModalActivity.class, A00).A0C(fragmentActivity);
        } catch (IOException unused) {
            C0w9.A03(AbstractC111324zv.A00(786), AbstractC111324zv.A00(638));
        }
    }
}
