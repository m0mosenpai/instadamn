package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.2IR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2IR {
    public C4JH A00;
    public String A01;
    public final Handler A02;
    public final C2IW A03;
    public final C2IU A04;
    public final Runnable A05;
    public final InterfaceC09390do A06;
    public final InterfaceC16820sZ A07;
    public final UserSession A08;
    public final AbstractRunnableC14200nk A09;

    public C2IR(UserSession userSession, C2IW c2iw, C2IU c2iu, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c2iw, 4);
        this.A08 = userSession;
        this.A07 = interfaceC16820sZ;
        this.A04 = c2iu;
        this.A03 = c2iw;
        this.A06 = AbstractC09440dt.A01(new C9EW(this, 16));
        this.A02 = new Handler(Looper.getMainLooper());
        this.A09 = new AbstractRunnableC14200nk() { // from class: X.2Ic
            {
                super(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2IR c2ir = C2IR.this;
                c2ir.A00 = new C4JH(c2ir.A04.E8Z(), c2ir.A01);
                c2ir.A02.post(c2ir.A05);
            }
        };
        this.A01 = "unknown";
        this.A05 = new Runnable() { // from class: X.2Id
            @Override // java.lang.Runnable
            public final void run() {
                C2IR c2ir = C2IR.this;
                C4JH c4jh = c2ir.A00;
                if (c4jh == null) {
                    C0w9.A03("badge-update-null", "Badge count update should not be null at this point.");
                } else {
                    c2ir.A03.Ct1(c4jh);
                }
            }
        };
        if (!C18U.A06(C06090Tz.A05, userSession, 36318475383216284L)) {
            this.A06.getValue();
        }
    }

    public final synchronized void A00(String str) {
        if (str.equals("fetch_inbox_from_disk")) {
            if (!C18U.A06(C06090Tz.A05, this.A08, 36321490450327051L)) {
                C14270nr.A00().A01(new KLP(this), 0L);
            }
        }
        this.A01 = str;
        C14270nr A00 = C14270nr.A00();
        AbstractRunnableC14200nk abstractRunnableC14200nk = this.A09;
        A00.A02(abstractRunnableC14200nk);
        C14270nr.A00().A01(abstractRunnableC14200nk, 150L);
    }
}
