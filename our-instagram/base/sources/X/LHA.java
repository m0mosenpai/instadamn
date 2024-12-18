package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.GifUrlImpl;

/* loaded from: classes8.dex */
public abstract class LHA {
    /* JADX WARN: Code restructure failed: missing block: B:146:0x021d, code lost:
    
        if (r0.A00 == null) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.SpannableString A00(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C7QR r10, java.lang.String r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LHA.A00(android.content.Context, com.instagram.common.session.UserSession, X.7QR, java.lang.String, boolean, boolean, boolean, boolean):android.text.SpannableString");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1 == X.C7O9.AVATAR_REACTION) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(X.C7QR r3) {
        /*
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.7O9 r1 = r3.A01
            r1.getClass()
            X.7O9 r0 = X.C7O9.EMOJI_REACTION
            r2 = 0
            if (r1 == r0) goto L17
            X.7O9 r1 = r3.A01
            r1.getClass()
            X.7O9 r0 = X.C7O9.AVATAR_REACTION
            if (r1 != r0) goto L26
        L17:
            X.1qM r0 = r3.A02
            X.C14360o3.A07(r0)
            boolean r0 = r0.A5V()
            if (r0 == 0) goto L27
            boolean r0 = r3.A0F
            if (r0 != 0) goto L27
        L26:
            return r2
        L27:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LHA.A02(X.7QR):boolean");
    }

    public static final DirectAnimatedMedia A01(C1120954b c1120954b) {
        C9BH c9bh = c1120954b.A00;
        if (c9bh != null) {
            String str = c1120954b.A04;
            return new DirectAnimatedMedia(c1120954b.A01, (GifUrlImpl) c9bh.A00, c1120954b.A03, AbstractC166997dE.A0a(), str, c1120954b.A05);
        }
        throw AbstractC166997dE.A0g();
    }
}
