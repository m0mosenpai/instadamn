package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.share.handler.DirectExternalMediaShareActivity;
import com.instagram.direct.share.handler.DirectMultipleExternalMediaShareActivity;
import com.instagram.direct.share.handler.DirectShareHandlerActivity;

/* renamed from: X.2Fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47332Fc implements InterfaceC13000lm {
    public static final String A03;
    public final Context A00;
    public final InterfaceC41501vz A01 = new InterfaceC41501vz() { // from class: X.2Fj
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A032 = C0f9.A03(1342115);
            int A033 = C0f9.A03(91346764);
            C47332Fc.this.A00();
            C0f9.A0A(-635648323, A033);
            C0f9.A0A(416556398, A032);
        }
    };
    public final UserSession A02;

    static {
        String canonicalName = DirectExternalMediaShareActivity.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        A03 = canonicalName;
    }

    public final void A00() {
        UserSession userSession = this.A02;
        boolean A00 = AbstractC47372Fk.A00(userSession);
        Context context = this.A00;
        String canonicalName = DirectShareHandlerActivity.class.getCanonicalName();
        String str = "";
        if (canonicalName == null) {
            canonicalName = "";
        }
        boolean z = !A00;
        AbstractC14490oL.A08(context, canonicalName, z);
        String canonicalName2 = DirectShareHandlerActivity.class.getCanonicalName();
        if (canonicalName2 == null) {
            canonicalName2 = "";
        }
        AbstractC14490oL.A08(context, AnonymousClass001.A0R(canonicalName2, "Interop"), A00);
        String str2 = A03;
        AbstractC14490oL.A08(context, AnonymousClass001.A0R(str2, "Photo"), z);
        AbstractC14490oL.A08(context, AnonymousClass001.A0R(str2, "PhotoInterop"), A00);
        AbstractC14490oL.A08(context, AnonymousClass001.A0R(str2, "Video"), z);
        AbstractC14490oL.A08(context, AnonymousClass001.A0R(str2, "VideoInterop"), A00);
        String canonicalName3 = DirectMultipleExternalMediaShareActivity.class.getCanonicalName();
        if (canonicalName3 == null) {
            canonicalName3 = "";
        }
        AbstractC14490oL.A08(context, canonicalName3, false);
        String canonicalName4 = DirectMultipleExternalMediaShareActivity.class.getCanonicalName();
        if (canonicalName4 != null) {
            str = canonicalName4;
        }
        AbstractC14490oL.A08(context, AnonymousClass001.A0R(str, "Interop"), false);
        AbstractC25651Mw.A00(userSession).A01(this.A01, C2IP.class);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC25651Mw.A00(this.A02).A02(this.A01, C2IP.class);
    }

    public C47332Fc(Context context, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
    }
}
