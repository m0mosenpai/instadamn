package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.VBh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68103VBh extends AbstractC224299vE {
    public static final String A05;
    public int A00;
    public Bitmap A01;
    public XEC A02;
    public final Context A03;
    public final UserSession A04;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.lang.Integer.valueOf(r1) != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        if (java.lang.Integer.valueOf(r4) != null) goto L35;
     */
    @Override // X.AbstractC224299vE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9RO A01(X.C5NJ r13, long r14, long r16) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68103VBh.A01(X.5NJ, long, long):X.9RO");
    }

    static {
        Map map = C0YZ.A03;
        A05 = AbstractC13230m9.A01(C68103VBh.class);
    }

    @Override // X.AbstractC224299vE
    public final void A02() {
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public C68103VBh(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = userSession;
    }
}
