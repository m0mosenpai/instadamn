package X;

import android.util.LruCache;
import java.util.Map;

/* renamed from: X.WVd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70425WVd implements C6Bb {
    public final LruCache A00;
    public final C68359VNt A01;
    public final XDz A02;
    public final C68867VdN A03;

    public final String A02(C59392ni c59392ni) {
        Object obj;
        if (c59392ni == null) {
            return null;
        }
        Map map = c59392ni.A09;
        if (map == null && (map = c59392ni.A0A) == null && (map = c59392ni.A0B) == null) {
            obj = null;
        } else {
            obj = map.get("custom_uri_key");
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (X.AbstractC002300n.A0h(r2, "/v/t", false) == true) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        if (r3 != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C59392ni r6, X.C69536Vr0 r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70425WVd.A03(X.2ni, X.Vr0, java.lang.String):void");
    }

    public AbstractC70425WVd(LruCache lruCache, AbstractC71176WpF abstractC71176WpF) {
        this.A00 = lruCache;
        this.A02 = abstractC71176WpF;
        this.A03 = abstractC71176WpF.BjL();
        this.A01 = ((C68115VBy) abstractC71176WpF).A01;
    }
}
