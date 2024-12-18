package X;

import android.content.Context;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.74O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C74O extends C74P {
    public final int A00;
    public final int A01;
    public final C006802i A02;
    public final boolean A03;
    public final C74M A04;

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0144, code lost:
    
        if (r5 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
    
        if (r5 != null) goto L15;
     */
    @Override // X.C74P, X.C74M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQ3(X.XEC r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74O.DQ3(X.XEC, java.lang.String, java.lang.String):void");
    }

    public C74O(Context context, UserSession userSession, C74V c74v, C74M c74m, Integer num, String str, String str2, String str3, String str4, String str5, float f, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(context, null, userSession, null, EnumC150226pU.A0A, null, c74v, c74m, num, C05F.A01, str, str2, str3, str4, str5, f, i, i2, false, z2, false);
        this.A02 = C006802i.A0p;
        this.A01 = 129900646;
        this.A00 = hashCode();
        this.A03 = z;
        this.A04 = c74m;
        if (!z3) {
            A00(this, str);
        }
        this.A0H = new C9EM(this, 15);
    }

    public static final void A00(C74O c74o, String str) {
        String str2;
        C006802i c006802i = c74o.A02;
        if (c006802i != null) {
            int i = c74o.A01;
            int i2 = c74o.A00;
            c006802i.markerStart(i, i2);
            C7UR c7ur = C7UR.A0A;
            if (C7US.A00(c74o.A0W).A07(c74o.A0l)) {
                str2 = "cache";
            } else {
                str2 = "network";
            }
            c006802i.markerAnnotate(i, i2, CacheBehaviorLogger.SOURCE, str2);
        }
        if (c006802i != null) {
            c006802i.markerPoint(c74o.A01, c74o.A00, "sticker_download_start");
        }
        c74o.A0C(str);
    }
}
