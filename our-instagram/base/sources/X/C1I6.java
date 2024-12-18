package X;

import android.view.View;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.1I6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1I6 extends C1I7 implements InterfaceC12870lZ, InterfaceC13000lm {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public final UserSession A04;

    public C1I6(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        C218914p.A03(EnumC220415e.A03, this);
    }

    public static final void A00(C1I6 c1i6, Integer num) {
        String str;
        String str2;
        if (c1i6.A02 != null && c1i6.A01 != null) {
            UserSession userSession = c1i6.A04;
            C14360o3.A0B(userSession, 0);
            C18920wW A00 = new C12210kP(userSession).A00();
            InterfaceC02590Ai A002 = A00.A00(A00.A00, "instagram_feed_pagination_scroll_outcome");
            if (A002.isSampled()) {
                String str3 = c1i6.A02;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                A002.AAP(TraceFieldType.RequestID, str3);
                String str5 = c1i6.A01;
                if (str5 != null) {
                    str4 = str5;
                }
                A002.AAP("ranking_session_id", str4);
                switch (num.intValue()) {
                    case 0:
                        str = "spinner";
                        break;
                    case 1:
                        str = "no_spinner";
                        break;
                    case 2:
                        str = "surface_exit";
                        break;
                    default:
                        str = "app_background";
                        break;
                }
                A002.AAP("outcome", str);
                Integer num2 = c1i6.A00;
                if (num2 != null) {
                    if (1 - num2.intValue() != 0) {
                        str2 = "second_chunk";
                    } else {
                        str2 = "tail_load";
                    }
                    A002.AAP("loading_type", str2);
                }
                A002.Cht();
            }
            c1i6.A02 = null;
            c1i6.A01 = null;
            c1i6.A00 = null;
            c1i6.A03 = null;
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(2066888646);
        A00(this, C05F.A0N);
        C0f9.A0A(-429255334, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-2097038242, C0f9.A03(391153323));
    }

    @Override // X.C1I7, X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        Object tag;
        int A03 = C0f9.A03(1465836580);
        C14360o3.A0B(c3fq, 0);
        if (this.A02 != null && this.A01 != null) {
            int B6q = c3fq.B6q();
            int BM3 = c3fq.BM3();
            if (B6q <= BM3) {
                while (true) {
                    View AnW = c3fq.AnW(B6q);
                    if (AnW != null && (tag = AnW.getTag()) != null && (tag instanceof C73223Px)) {
                        A00(this, C05F.A00);
                        i6 = -831093275;
                        break;
                    } else if (B6q == BM3) {
                        break;
                    } else {
                        B6q++;
                    }
                }
            }
            i6 = -2073213713;
        } else {
            i6 = -1705488233;
        }
        C0f9.A0A(i6, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        this.A03 = null;
    }
}
