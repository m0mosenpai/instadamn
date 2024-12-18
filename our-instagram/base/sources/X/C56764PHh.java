package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.PHh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56764PHh implements InterfaceC1119153d {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC57943Pmn A03;
    public final /* synthetic */ C131965xW A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C56764PHh(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC57943Pmn interfaceC57943Pmn, C131965xW c131965xW, String str) {
        this.A02 = userSession;
        this.A04 = c131965xW;
        this.A05 = str;
        this.A03 = interfaceC57943Pmn;
        this.A01 = fragmentActivity;
        this.A00 = context;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        String str;
        String str2;
        boolean z;
        C130135uJ A04;
        EnumC130115uH enumC130115uH;
        UserSession userSession = this.A02;
        C131965xW c131965xW = this.A04;
        C130135uJ A042 = c131965xW.A04();
        EnumC130125uI enumC130125uI = null;
        if (A042 != null && A042.A02 != null) {
            C130135uJ A043 = c131965xW.A04();
            if (A043 != null) {
                enumC130115uH = A043.A02;
            } else {
                enumC130115uH = null;
            }
            str = String.valueOf(enumC130115uH);
        } else {
            str = "";
        }
        C130135uJ A044 = c131965xW.A04();
        if (A044 != null) {
            str2 = A044.A04;
        } else {
            str2 = null;
        }
        String str3 = this.A05;
        boolean A00 = C196218mC.A00(userSession);
        C130135uJ A045 = c131965xW.A04();
        if (A045 != null) {
            z = A045.A05;
        } else {
            z = false;
        }
        C130135uJ A046 = c131965xW.A04();
        if (A046 != null) {
            enumC130125uI = A046.A01;
        }
        AbstractC130145uK.A02(userSession, "default_privacy_consent_bottomsheet_dismiss_click", str, str2, str3, String.valueOf(enumC130125uI), false, A00, z);
        C130135uJ A047 = c131965xW.A04();
        if (A047 != null) {
            if (!A047.A00 && C131975xX.A02(A047) && (A04 = c131965xW.A04()) != null) {
                A04.A00 = true;
            }
            c131965xW.A07(this.A00, str3);
        }
    }
}
