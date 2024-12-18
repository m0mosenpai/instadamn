package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Imh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC42195Imh implements C5R4 {
    public static final long A03 = TimeUnit.MINUTES.toSeconds(60);
    public final long A00 = TimeUnit.SECONDS.toMillis(A03);
    public final C37671Gi4 A01;
    public final C5Qu A02;

    public static String A01(AbstractC42195Imh abstractC42195Imh, Object obj) {
        C14360o3.A0B(obj, 0);
        C37671Gi4 c37671Gi4 = abstractC42195Imh.A01;
        if (c37671Gi4 != null) {
            return c37671Gi4.A01();
        }
        return null;
    }

    @Override // X.C5R4
    public final void AHy(UserSession userSession) {
    }

    @Override // X.C5R4
    public final Integer AJT(UserSession userSession, AbstractC154286wd abstractC154286wd, C154796xU c154796xU) {
        C14360o3.A0B(c154796xU, 1);
        return c154796xU.A01(abstractC154286wd, BfW(), A03, A03());
    }

    @Override // X.C5R4
    public final void AQ9(Context context, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        C1ON A00;
        String A01;
        String A02;
        String str3;
        String str4;
        C42133Ilh c42133Ilh = new C42133Ilh(this, 2);
        C1P3 A002 = C1P2.A00(userSession);
        String BfW = BfW();
        C14360o3.A0B(BfW, 0);
        if (this instanceof Hc7) {
            Hc7 hc7 = (Hc7) this;
            A01 = A01(hc7, userSession);
            A02 = hc7.A02();
            str3 = hc7.A00;
            str4 = "clips/translation_voice_dub/";
        } else if (this instanceof C39480Hc6) {
            C39480Hc6 c39480Hc6 = (C39480Hc6) this;
            A01 = A01(c39480Hc6, userSession);
            A02 = c39480Hc6.A02();
            str3 = c39480Hc6.A00;
            str4 = "clips/translation_closed_caption/";
        } else if (this instanceof C39479Hc5) {
            C39479Hc5 c39479Hc5 = (C39479Hc5) this;
            A01 = A01(c39479Hc5, userSession);
            A02 = c39479Hc5.A02();
            str3 = c39479Hc5.A00;
            str4 = "clips/star_search_only/";
        } else if (this instanceof C39478Hc4) {
            C39478Hc4 c39478Hc4 = (C39478Hc4) this;
            A01 = A01(c39478Hc4, userSession);
            A02 = c39478Hc4.A02();
            str3 = c39478Hc4.A00;
            str4 = "clips/mixed_media_only/";
        } else {
            if (this instanceof C39482HcA) {
                C39482HcA c39482HcA = (C39482HcA) this;
                String A012 = A01(c39482HcA, userSession);
                String A022 = c39482HcA.A02();
                String str5 = c39482HcA.A04;
                String str6 = c39482HcA.A03;
                A00 = C41713Idj.A00(userSession, c39482HcA.A00, c39482HcA.A01, "clips/media_notes/", null, A012, A022, str5, c39482HcA.A02, str6);
            } else if (this instanceof Hc9) {
                Hc9 hc9 = (Hc9) this;
                String A013 = A01(hc9, userSession);
                String A023 = hc9.A02();
                String str7 = hc9.A03;
                String str8 = hc9.A02;
                A00 = C41713Idj.A00(userSession, null, hc9.A00, "clips/media_notes/", null, A013, A023, str7, hc9.A01, str8);
            } else if (this instanceof C39477Hc3) {
                C39477Hc3 c39477Hc3 = (C39477Hc3) this;
                A01 = A01(c39477Hc3, userSession);
                A02 = c39477Hc3.A02();
                str3 = c39477Hc3.A00;
                str4 = "clips/discover/location/";
            } else if (this instanceof C39476Hc2) {
                C39476Hc2 c39476Hc2 = (C39476Hc2) this;
                A01 = A01(c39476Hc2, userSession);
                A02 = c39476Hc2.A02();
                str3 = c39476Hc2.A00;
                str4 = "clips/discover/social/";
            } else if (this instanceof C39481Hc8) {
                C39481Hc8 c39481Hc8 = (C39481Hc8) this;
                A01 = A01(c39481Hc8, userSession);
                A02 = c39481Hc8.A02();
                str3 = c39481Hc8.A00;
                str4 = "clips/connected/";
            } else {
                A00 = C39483HcB.A00((C39483HcB) this, null);
            }
            C14360o3.A0B(A00, 0);
            C1P3.A00(A002, c42133Ilh, null, null, A00, null, BfW, A03, A03(), false);
        }
        A00 = C41713Idj.A01(userSession, str4, null, A01, A02, str3);
        C14360o3.A0B(A00, 0);
        C1P3.A00(A002, c42133Ilh, null, null, A00, null, BfW, A03, A03(), false);
    }

    @Override // X.C5R4
    public final boolean ARZ(UserSession userSession) {
        return false;
    }

    @Override // X.C5R4
    public final C38321qM B6c(UserSession userSession) {
        return null;
    }

    @Override // X.C5R4
    public final Integer BfR(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C1P2.A00(userSession).A06(BfW(), A03, A03());
    }

    @Override // X.C5R4
    public final /* synthetic */ void CoG(UserSession userSession, String str) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void ERc(C37682GiJ c37682GiJ) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void ES6(Context context) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void EcO(String str) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void Eee(InterfaceC120815dY interfaceC120815dY) {
    }

    public final String A02() {
        C5Qu c5Qu = this.A02;
        if (c5Qu != null) {
            return c5Qu.A00();
        }
        return null;
    }

    public final boolean A03() {
        if (!(this instanceof Hc9) && !(this instanceof C39482HcA) && !(this instanceof Hc7) && !(this instanceof C39480Hc6) && !(this instanceof C39479Hc5) && !(this instanceof C39478Hc4) && (this instanceof C39477Hc3)) {
            return true;
        }
        return false;
    }

    public AbstractC42195Imh(C5Qu c5Qu, C37671Gi4 c37671Gi4) {
        this.A01 = c37671Gi4;
        this.A02 = c5Qu;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
