package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.OPv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54900OPv {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r7, android.content.Intent r8, X.C55177Odh r9, X.OHO r10, int r11, int r12, int r13, boolean r14) {
        /*
            r3 = 0
            X.AbstractC167017dG.A1P(r10, r9)
            r0 = 101(0x65, float:1.42E-43)
            if (r11 != r0) goto L58
            r0 = -1
            if (r12 != r0) goto L58
            if (r8 == 0) goto L58
            java.lang.String r0 = "screen_capture_share_types"
            java.util.ArrayList r4 = r8.getStringArrayListExtra(r0)
            java.lang.String r0 = "screen_capture_is_success"
            boolean r6 = r8.getBooleanExtra(r0, r3)
            java.lang.String r0 = "screen_capture_is_discarded"
            boolean r1 = r8.getBooleanExtra(r0, r3)
            java.lang.String r0 = "screen_capture_error_message"
            java.lang.String r5 = r8.getStringExtra(r0)
            if (r4 == 0) goto L58
            if (r1 == 0) goto L6d
            X.OI6 r2 = r10.A00
            java.lang.String r0 = r4.toString()
            X.P9d r1 = new X.P9d
            r1.<init>(r0, r5)
        L34:
            r2.A00(r1)
        L37:
            java.lang.String r2 = "story"
            boolean r0 = r4.contains(r2)
            java.lang.String r1 = "direct"
            if (r0 == 0) goto L59
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L59
            r0 = 2131972938(0x7f13534a, float:1.9582898E38)
        L4a:
            java.lang.String r1 = r7.getString(r0)
            if (r1 == 0) goto L58
            X.PDR r0 = new X.PDR
            r0.<init>(r1, r3)
            r9.A05(r0)
        L58:
            return
        L59:
            boolean r0 = r4.contains(r2)
            if (r0 == 0) goto L63
            r0 = 2131972939(0x7f13534b, float:1.95829E38)
            goto L4a
        L63:
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L58
            r0 = 2131972937(0x7f135349, float:1.9582896E38)
            goto L4a
        L6d:
            if (r14 == 0) goto L92
            X.0x9 r2 = new X.0x9
            r2.<init>()
            java.util.Iterator r1 = r4.iterator()
        L78:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L86
            java.lang.String r0 = X.AbstractC166987dD.A1B(r1)
            r2.A04(r0)
            goto L78
        L86:
            X.OI6 r2 = r10.A00
            java.lang.String r0 = r4.toString()
            X.PA4 r1 = new X.PA4
            r1.<init>(r0, r5, r13, r6)
            goto L34
        L92:
            r10.A00(r5, r4, r6)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54900OPv.A01(android.content.Context, android.content.Intent, X.Odh, X.OHO, int, int, int, boolean):void");
    }

    public static final void A00(Activity activity, UserSession userSession, DirectCameraViewModel directCameraViewModel, String str, boolean z) {
        boolean A1a = AbstractC31175DnJ.A1a(str);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("screen_capture_share_arguments_key_entry_point", C22P.A5Y);
        A0b.putBoolean("screen_capture_is_photobooth", A1a);
        A0b.putString("screen_capture_share_arguments_key_file_path", str);
        if (z) {
            A0b.putString("media_type", MediaStreamTrack.VIDEO_TRACK_KIND);
        }
        if (directCameraViewModel != null) {
            A0b.putParcelable("screen_capture_share_arguments_camera_view_model", directCameraViewModel);
        }
        C6XJ.A02(activity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(3301)).A0A(activity, 101);
    }
}
