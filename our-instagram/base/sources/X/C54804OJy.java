package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.OJy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54804OJy {
    public Context A00;
    public Fragment A01;
    public InterfaceC11380iw A02;
    public ImageUrl A03;
    public C195918ld A04;
    public InterfaceC57990Pna A05;
    public C55011OVw A06;
    public C54723OFa A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B = C16930sl.A00;
    public final Activity A0C;
    public final C82G A0D;
    public final UserSession A0E;

    public final C54729OFg A00() {
        Activity activity = this.A0C;
        UserSession userSession = this.A0E;
        C82G c82g = this.A0D;
        InterfaceC57990Pna interfaceC57990Pna = this.A05;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C195918ld c195918ld = this.A04;
        String str = this.A08;
        String str2 = this.A0A;
        return new C54729OFg(activity, this.A00, this.A01, c82g, interfaceC11380iw, userSession, this.A03, c195918ld, interfaceC57990Pna, this.A06, this.A07, str, str2, this.A0B);
    }

    public C54804OJy(Activity activity, C82G c82g, UserSession userSession) {
        this.A0C = activity;
        this.A0E = userSession;
        this.A0D = c82g;
    }
}
