package X;

import android.content.Context;
import android.graphics.Point;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.LFs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47942LFs {
    public final HashMap A01 = AbstractC166987dD.A1G();
    public int A00 = -1;

    public final C55333Ogw A01(Context context, MediaComposition mediaComposition, UserSession userSession, C44767Jro c44767Jro) {
        boolean A1b = AbstractC25233BEq.A1b(userSession, context, mediaComposition);
        Point A01 = ALe.A01(context, userSession);
        C14360o3.A07(A01);
        CameraSpec A012 = C75I.A01(userSession, A01.x, A01.y);
        HashMap hashMap = this.A01;
        Object obj = hashMap.get(mediaComposition);
        Object obj2 = obj;
        if (obj == null) {
            C55333Ogw c55333Ogw = new C55333Ogw(context, c44767Jro.A03, userSession, A012);
            IgProgressBar igProgressBar = c44767Jro.A09;
            if (igProgressBar.getVisibility() == 0 && c44767Jro.A00 == 0) {
                C55208OeM c55208OeM = c55333Ogw.A01;
                CameraSpec cameraSpec = c55333Ogw.A03;
                c55208OeM.A0A(mediaComposition, cameraSpec.A03, cameraSpec.A02, -1, -1, 0, A1b);
                c55333Ogw.A00();
            } else {
                C55208OeM c55208OeM2 = c55333Ogw.A01;
                CameraSpec cameraSpec2 = c55333Ogw.A03;
                c55208OeM2.A0A(mediaComposition, cameraSpec2.A03, cameraSpec2.A02, -1, -1, 0, A1b);
            }
            igProgressBar.setVisibility(8);
            hashMap.put(mediaComposition, c55333Ogw);
            obj2 = c55333Ogw;
        }
        return (C55333Ogw) obj2;
    }

    public static final void A00(C47942LFs c47942LFs) {
        HashMap hashMap = c47942LFs.A01;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            C55333Ogw c55333Ogw = (C55333Ogw) AbstractC166997dE.A0l(it);
            c55333Ogw.isPlaying = false;
            c55333Ogw.A01.A07();
        }
        hashMap.clear();
    }
}
