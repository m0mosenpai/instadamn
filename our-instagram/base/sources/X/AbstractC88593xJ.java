package X;

import android.content.res.Resources;
import com.instagram.model.mediasize.VideoUrlImpl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3xJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88593xJ {
    public static final int A00 = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.model.mediasize.VideoUrlImpl A01(java.lang.String r7, java.util.List r8) {
        /*
            r6 = 0
            if (r8 != 0) goto L4
            return r6
        L4:
            java.util.Iterator r5 = r8.iterator()
            r2 = r6
            r4 = r6
        La:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r3 = r5.next()
            com.instagram.model.mediasize.VideoUrlImpl r3 = (com.instagram.model.mediasize.VideoUrlImpl) r3
            int r1 = r3.A01
            r0 = -2
            if (r1 == r0) goto L23
            switch(r1) {
                case 100: goto L23;
                case 101: goto L1f;
                case 102: goto L21;
                default: goto L1e;
            }
        L1e:
            goto La
        L1f:
            r4 = r3
            goto La
        L21:
            r2 = r3
            goto La
        L23:
            return r3
        L24:
            if (r2 != 0) goto L4f
            if (r4 != 0) goto L4d
            java.lang.Object r2 = X.AbstractC001800i.A0J(r8)
            com.instagram.model.mediasize.VideoUrlImpl r2 = (com.instagram.model.mediasize.VideoUrlImpl) r2
            if (r2 == 0) goto L36
            int r0 = r2.A01
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L36:
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r6}
            java.lang.String r0 = "media id: %s invalid type: %d"
            java.lang.String r1 = X.AbstractC13670mt.A06(r0, r1)
            java.lang.String r0 = "no_valid_video_url"
            X.C0w9.A03(r0, r1)
        L45:
            r4 = r2
        L46:
            int r1 = X.AbstractC88593xJ.A00
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 > r0) goto L52
            return r2
        L4d:
            r2 = r4
            goto L46
        L4f:
            if (r4 != 0) goto L46
            goto L45
        L52:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC88593xJ.A01(java.lang.String, java.util.List):com.instagram.model.mediasize.VideoUrlImpl");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final VideoUrlImpl A00(C75363a3 c75363a3) {
        List list = c75363a3.A0M;
        VideoUrlImpl videoUrlImpl = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((VideoUrlImpl) next).A01 == 100) {
                    videoUrlImpl = next;
                    break;
                }
            }
            videoUrlImpl = videoUrlImpl;
        }
        Object obj = null;
        if (videoUrlImpl == null) {
            if (list == null) {
                return null;
            }
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int i = ((VideoUrlImpl) obj).A02;
                    do {
                        Object next2 = it2.next();
                        int i2 = ((VideoUrlImpl) next2).A02;
                        if (i < i2) {
                            obj = next2;
                            i = i2;
                        }
                    } while (it2.hasNext());
                }
            }
            return (VideoUrlImpl) obj;
        }
        return videoUrlImpl;
    }
}
