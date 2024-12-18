package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.io.File;

/* renamed from: X.4df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99624df implements InterfaceC69913Ca {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC53762dF A02;

    @Override // X.InterfaceC69913Ca
    public final void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final void CKE(Intent intent) {
        C1VN c1vn;
        C19280xC A00 = AbstractC31718DwN.A00(C05F.A0u);
        if (intent.getStringExtra(MSV.A00(146)).equals(MSV.A00(147))) {
            A00.A0C("return_to", "feed");
            UserSession userSession = this.A01;
            AbstractC11060iN.A00(userSession).EHW(A00);
            InterfaceC53762dF interfaceC53762dF = this.A02;
            AbstractC72153Lo.A00 = true;
            interfaceC53762dF.EfJ(C1QO.A0C);
            interfaceC53762dF.FBp(new PositionConfig(null, null, null, MSV.A00(1554), null, null, null, null, null, null, null, null, null, 0.0f, 0, false));
            String stringExtra = intent.getStringExtra(MSV.A00(701));
            if (!TextUtils.isEmpty(stringExtra) && (c1vn = C1VN.A00) != null) {
                c1vn.A02(userSession, this.A00, stringExtra);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException(AbstractC111324zv.A00(3524));
    }

    @Override // X.InterfaceC69913Ca
    public final void Cv3(int i, int i2) {
        if (i == 10004 && i2 == 2) {
            if (!C18U.A06(C06090Tz.A05, this.A01, 36323848387374731L)) {
                this.A00.finish();
            }
        }
    }

    @Override // X.InterfaceC69913Ca
    public final void En7(File file, int i) {
        LJR.A02(this.A00, file, i);
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C12260kU.A08(this.A00, intent, i);
    }

    public C99624df(Activity activity, UserSession userSession, InterfaceC53762dF interfaceC53762dF) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = interfaceC53762dF;
    }
}
