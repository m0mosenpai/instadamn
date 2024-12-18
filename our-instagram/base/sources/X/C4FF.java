package X;

import android.os.SystemClock;
import android.webkit.URLUtil;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;

/* renamed from: X.4FF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FF implements C4FG {
    public final UserSession A00;
    public final HashMap A01;

    public C4FF(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new HashMap();
    }

    @Override // X.C4FG
    public final ImageUrl E8d(C4GS c4gs) {
        JW0 jw0;
        C14360o3.A0B(c4gs, 0);
        if (C18U.A06(C06090Tz.A05, this.A00, 36330368147669836L)) {
            String str = c4gs.A01;
            HashMap hashMap = this.A01;
            JW0 jw02 = (JW0) hashMap.get(str);
            if (jw02 != null) {
                if (SystemClock.elapsedRealtime() > jw02.A00) {
                    SystemClock.elapsedRealtime();
                } else {
                    ImageUrl imageUrl = jw02.A01;
                    String url = imageUrl.getUrl();
                    ImageUrl imageUrl2 = c4gs.A00;
                    String url2 = imageUrl2.getUrl();
                    if (!C14360o3.A0K(url, url2)) {
                        String guessFileName = URLUtil.guessFileName(url2, null, null);
                        Object value = jw02.A02.getValue();
                        C14360o3.A07(value);
                        if (value.equals(guessFileName)) {
                            return imageUrl;
                        }
                        jw0 = new JW0(imageUrl2, guessFileName);
                        hashMap.put(str, jw0);
                    }
                }
            }
            jw0 = new JW0(c4gs.A00, null);
            hashMap.put(str, jw0);
        }
        return c4gs.A00;
    }
}
