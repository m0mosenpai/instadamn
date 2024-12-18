package X;

import android.os.Bundle;
import com.instagram.user.model.UpcomingEvent;
import java.io.File;

/* loaded from: classes11.dex */
public final class VC7 extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelUpcomingEventStickerFragment";
    public C22P A00;
    public UpcomingEvent A01;
    public File A02;
    public final InterfaceC25214BDm A03 = new C23765Afc(this, 11);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_upcoming_event_sticker_fragment";
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(721556874);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = AbstractC167027dH.A0C(bundle2, "ReelUpcomingEventConstants.ARG_KEY_CAMERA_ENTRY_POINT");
            Object obj = bundle2.get("ReelUpcomingEventConstants.ARG_KEY_UPCOMING_EVENT");
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.UpcomingEvent");
            this.A01 = (UpcomingEvent) obj;
            String string = bundle2.getString("ReelUpcomingEventConstants.ARG_KEY_FILE_PATH");
            if (string != null) {
                this.A02 = new File(string);
            }
            C0f9.A09(-777926782, A02);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AbstractC111324zv.A00(321));
        C0f9.A09(-1402966276, A02);
        throw illegalArgumentException;
    }
}
