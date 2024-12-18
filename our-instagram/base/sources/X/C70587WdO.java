package X;

import android.app.Activity;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.LinkedHashMap;

/* renamed from: X.WdO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70587WdO implements XA3 {
    public boolean A00;
    public final long A01;
    public final Activity A02;
    public final C0JO A03;
    public final UserSession A04;
    public final Hashtag A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0JO, java.lang.Object, X.1EL] */
    public C70587WdO(Activity activity, UserSession userSession, Hashtag hashtag, String str, String str2) {
        C14360o3.A0B(userSession, 2);
        this.A02 = activity;
        this.A04 = userSession;
        ?? obj = new Object();
        this.A03 = obj;
        this.A05 = hashtag;
        this.A06 = str2;
        this.A07 = str;
        this.A01 = obj.now();
    }

    @Override // X.XA3
    public final void DEr(String str, boolean z) {
        long now = this.A03.now() - this.A01;
        Hashtag hashtag = this.A05;
        if (AbstractC166997dE.A1Z(hashtag.CTY(), true) && !this.A00 && z && now >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT && C1VN.A00 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String name = hashtag.getName();
            if (name != null) {
                linkedHashMap.put("hashtag_name", name);
                String str2 = this.A07;
                if (str2 != null) {
                    linkedHashMap.put(AbstractC43591JPw.A00(1302), str2);
                }
                linkedHashMap.put("entry_trigger", this.A06);
                linkedHashMap.put("time_on_page", String.valueOf(((float) now) / 1000.0f));
                AbstractC31282Dp4.A00().A00(this.A02, this.A04, "480654355907427", linkedHashMap);
                this.A00 = true;
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
