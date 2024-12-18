package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49452Pc {
    public static final AudioOverlayTrack A00(String str) {
        AudioOverlayTrack audioOverlayTrack = null;
        if (str != null) {
            try {
                audioOverlayTrack = AbstractC37894Glp.parseFromJson(C16V.A00(str));
                return audioOverlayTrack;
            } catch (IOException e) {
                AbstractC12120kG.A06("AudioOverlayTrackConverter", "Failed to deserialize AudioOverlayTrack from ClipsDraft", e);
            }
        }
        return audioOverlayTrack;
    }

    public final List A01(String str) {
        if (str != null && !str.equals("")) {
            List A0R = AbstractC001900j.A0R(str, new String[]{"␞"}, 0);
            ArrayList arrayList = new ArrayList();
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                AudioOverlayTrack A00 = A00((String) it.next());
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }
}
