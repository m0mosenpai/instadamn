package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

/* renamed from: X.9Pr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC209819Pr implements Callable {
    public final Context A00;
    public final Bitmap.CompressFormat A01;
    public final android.net.Uri A02;
    public final android.net.Uri A03;
    public final UserSession A04;
    public final boolean A05;

    public CallableC209819Pr(Context context, android.net.Uri uri, android.net.Uri uri2, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = uri;
        this.A03 = uri2;
        this.A00 = context;
        this.A01 = C44095JeK.A01;
        this.A05 = z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:15|(15:17|(2:19|(5:21|22|23|(3:96|97|(3:101|27|28))|25))(2:116|(1:118))|(1:30)|31|32|33|(2:36|(2:38|(2:40|(1:42))(1:43))(1:44))|45|(1:47)|48|49|(1:51)|52|(2:54|(2:56|(1:58)))(1:93)|(2:65|(6:67|68|69|(4:73|74|75|(5:77|78|60|61|62))|71|72)(2:89|90))(2:91|92))|119|(2:121|122)|31|32|33|(2:36|(0)(0))|45|(0)|48|49|(0)|52|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r6 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016f, code lost:
    
        if (r14 == false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106 A[Catch: Exception -> 0x0122, all -> 0x0209, TryCatch #5 {all -> 0x0209, blocks: (B:7:0x0013, B:10:0x001a, B:12:0x0020, B:13:0x0029, B:15:0x0032, B:17:0x0041, B:19:0x0049, B:28:0x0085, B:33:0x00dc, B:45:0x00fe, B:47:0x0106, B:48:0x0116, B:49:0x0122, B:52:0x0144, B:54:0x0160, B:56:0x0164, B:60:0x01fe, B:65:0x0173, B:67:0x017b, B:69:0x0181, B:75:0x0194, B:78:0x01f9, B:71:0x01ad, B:122:0x00d9, B:85:0x019d, B:86:0x01a0, B:88:0x01a2, B:89:0x01c9, B:91:0x01cf, B:93:0x016b, B:115:0x00cc, B:111:0x0091, B:116:0x0095, B:118:0x009d, B:119:0x00cf, B:121:0x00d5, B:123:0x00a4, B:125:0x00ac, B:127:0x0025, B:128:0x00b1, B:23:0x0051, B:27:0x0082, B:106:0x007e, B:109:0x007b, B:114:0x008a), top: B:5:0x0011, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160 A[Catch: all -> 0x0209, TryCatch #5 {all -> 0x0209, blocks: (B:7:0x0013, B:10:0x001a, B:12:0x0020, B:13:0x0029, B:15:0x0032, B:17:0x0041, B:19:0x0049, B:28:0x0085, B:33:0x00dc, B:45:0x00fe, B:47:0x0106, B:48:0x0116, B:49:0x0122, B:52:0x0144, B:54:0x0160, B:56:0x0164, B:60:0x01fe, B:65:0x0173, B:67:0x017b, B:69:0x0181, B:75:0x0194, B:78:0x01f9, B:71:0x01ad, B:122:0x00d9, B:85:0x019d, B:86:0x01a0, B:88:0x01a2, B:89:0x01c9, B:91:0x01cf, B:93:0x016b, B:115:0x00cc, B:111:0x0091, B:116:0x0095, B:118:0x009d, B:119:0x00cf, B:121:0x00d5, B:123:0x00a4, B:125:0x00ac, B:127:0x0025, B:128:0x00b1, B:23:0x0051, B:27:0x0082, B:106:0x007e, B:109:0x007b, B:114:0x008a), top: B:5:0x0011, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173 A[Catch: all -> 0x0209, TryCatch #5 {all -> 0x0209, blocks: (B:7:0x0013, B:10:0x001a, B:12:0x0020, B:13:0x0029, B:15:0x0032, B:17:0x0041, B:19:0x0049, B:28:0x0085, B:33:0x00dc, B:45:0x00fe, B:47:0x0106, B:48:0x0116, B:49:0x0122, B:52:0x0144, B:54:0x0160, B:56:0x0164, B:60:0x01fe, B:65:0x0173, B:67:0x017b, B:69:0x0181, B:75:0x0194, B:78:0x01f9, B:71:0x01ad, B:122:0x00d9, B:85:0x019d, B:86:0x01a0, B:88:0x01a2, B:89:0x01c9, B:91:0x01cf, B:93:0x016b, B:115:0x00cc, B:111:0x0091, B:116:0x0095, B:118:0x009d, B:119:0x00cf, B:121:0x00d5, B:123:0x00a4, B:125:0x00ac, B:127:0x0025, B:128:0x00b1, B:23:0x0051, B:27:0x0082, B:106:0x007e, B:109:0x007b, B:114:0x008a), top: B:5:0x0011, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cf A[Catch: all -> 0x0209, TryCatch #5 {all -> 0x0209, blocks: (B:7:0x0013, B:10:0x001a, B:12:0x0020, B:13:0x0029, B:15:0x0032, B:17:0x0041, B:19:0x0049, B:28:0x0085, B:33:0x00dc, B:45:0x00fe, B:47:0x0106, B:48:0x0116, B:49:0x0122, B:52:0x0144, B:54:0x0160, B:56:0x0164, B:60:0x01fe, B:65:0x0173, B:67:0x017b, B:69:0x0181, B:75:0x0194, B:78:0x01f9, B:71:0x01ad, B:122:0x00d9, B:85:0x019d, B:86:0x01a0, B:88:0x01a2, B:89:0x01c9, B:91:0x01cf, B:93:0x016b, B:115:0x00cc, B:111:0x0091, B:116:0x0095, B:118:0x009d, B:119:0x00cf, B:121:0x00d5, B:123:0x00a4, B:125:0x00ac, B:127:0x0025, B:128:0x00b1, B:23:0x0051, B:27:0x0082, B:106:0x007e, B:109:0x007b, B:114:0x008a), top: B:5:0x0011, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b A[Catch: all -> 0x0209, TryCatch #5 {all -> 0x0209, blocks: (B:7:0x0013, B:10:0x001a, B:12:0x0020, B:13:0x0029, B:15:0x0032, B:17:0x0041, B:19:0x0049, B:28:0x0085, B:33:0x00dc, B:45:0x00fe, B:47:0x0106, B:48:0x0116, B:49:0x0122, B:52:0x0144, B:54:0x0160, B:56:0x0164, B:60:0x01fe, B:65:0x0173, B:67:0x017b, B:69:0x0181, B:75:0x0194, B:78:0x01f9, B:71:0x01ad, B:122:0x00d9, B:85:0x019d, B:86:0x01a0, B:88:0x01a2, B:89:0x01c9, B:91:0x01cf, B:93:0x016b, B:115:0x00cc, B:111:0x0091, B:116:0x0095, B:118:0x009d, B:119:0x00cf, B:121:0x00d5, B:123:0x00a4, B:125:0x00ac, B:127:0x0025, B:128:0x00b1, B:23:0x0051, B:27:0x0082, B:106:0x007e, B:109:0x007b, B:114:0x008a), top: B:5:0x0011, inners: #0, #3 }] */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C44262Jh8 call() {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC209819Pr.call():X.Jh8");
    }
}
