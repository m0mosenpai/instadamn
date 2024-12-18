package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;

/* renamed from: X.Imd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42191Imd implements InterfaceC31149Dmt {
    public final C5Qu A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    @Override // X.InterfaceC31149Dmt
    public final C1ON AfC(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        return AbstractC40549HyV.A00(userSession, this.A01, this.A03, this.A02, str, A00(), false);
    }

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        return AbstractC40549HyV.A00(userSession, this.A01, this.A03, this.A02, null, A00(), this.A04);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        return AbstractC40549HyV.A00(userSession, this.A01, this.A03, this.A02, str, A00(), this.A04);
    }

    @Override // X.C5R5
    public final boolean CUz(boolean z) {
        return z;
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

    private final String A00() {
        C5Qu c5Qu = this.A00;
        try {
            String str = (String) C57782kr.A00(c5Qu.A01).A0M().get(this.A01);
            if (str == null) {
                return "[]";
            }
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A06 = AbstractC37301Gc2.A06(A0O);
            Iterator it = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                A06.A0d();
                A06.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A1B);
                A06.A0a();
            }
            A06.A0Z();
            A06.close();
            return AbstractC166987dD.A19(A0O);
        } catch (IOException unused) {
            return "[]";
        }
    }

    public C42191Imd(C5Qu c5Qu, String str, String str2, String str3, boolean z) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = z;
        this.A00 = c5Qu;
    }
}
