package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.OQs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54918OQs {
    public static final MediaComposition A00(ImmutableList immutableList, UserSession userSession, AudioOverlayTrack audioOverlayTrack, ArrayList arrayList, float f) {
        DownloadedTrack downloadedTrack;
        ImmutableList immutableList2 = immutableList;
        C14360o3.A0B(userSession, 0);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ArrayList A0q = AbstractC167017dG.A0q(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC115515Kl.A03((AbstractC115485Ki) it.next()));
        }
        builder.addAll(A0q);
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        if (audioOverlayTrack != null && (downloadedTrack = audioOverlayTrack.A06) != null) {
            builder2.add((Object) new C23013ACn(null, null, downloadedTrack.A02, null, 1.0f, 1.0f, downloadedTrack.A00(audioOverlayTrack.A03), -1, 0));
        }
        ImmutableList A0K = AbstractC31172DnG.A0K(builder);
        ImmutableList A0K2 = AbstractC31172DnG.A0K(builder2);
        if (immutableList2 == null) {
            immutableList2 = ImmutableList.of();
            C14360o3.A07(immutableList2);
        }
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 5);
        C57620PhW c57620PhW = C57620PhW.A00;
        C14360o3.A0B(c57620PhW, 2);
        return new MediaComposition(AbstractC23120AKe.A00(null, null, A0K2, A0K, immutableList2, null, c16930sl, c16930sl, c57620PhW, f, 0.5625f, 0, true, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if ((r9 + r7) > r11) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A01(com.instagram.api.schemas.ACRType r37, java.lang.String r38, java.util.ArrayList r39, java.util.ArrayList r40, int r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54918OQs.A01(com.instagram.api.schemas.ACRType, java.lang.String, java.util.ArrayList, java.util.ArrayList, int, boolean):java.util.List");
    }
}
