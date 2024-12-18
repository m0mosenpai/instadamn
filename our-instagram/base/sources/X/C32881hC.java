package X;

import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.1hC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32881hC extends C32891hD {
    public static final C0KV A01 = new C0KV() { // from class: X.1hE
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1492090659);
            int A032 = C0f9.A03(-1020349778);
            C32881hC c32881hC = new C32881hC(AbstractC11060iN.A00(userSession), userSession);
            C0f9.A0A(2022364873, A032);
            C0f9.A0A(-785950673, A03);
            return c32881hC;
        }
    };
    public final UserSession A00;

    @Override // X.C32891hD, X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHu(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z, boolean z2) {
        long j;
        C32851h9 c32851h9 = (C32851h9) c1ow;
        UserSession userSession = this.A00;
        String str = c32851h9.A00;
        String str2 = c32851h9.A01;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c114675Fx, 1);
        C14360o3.A0B(str, 2);
        C18920wW c18920wW = new C18920wW(C12180kM.A02, userSession);
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_shh_mode_toggle_failed");
        String str3 = c114675Fx.A03;
        C14360o3.A0B(str3, 0);
        Long A0k = AbstractC003100w.A0k(10, str3);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = -1;
        }
        A00.A9K(TraceFieldType.ErrorCode, Long.valueOf(j));
        A00.AAP(TraceFieldType.ErrorDomain, c114675Fx.A01.A01);
        StringBuilder sb = new StringBuilder();
        sb.append(c114675Fx.A04);
        sb.append(" threadId is isEmptyAfterTrimOrNull: ");
        sb.append(AbstractC13670mt.A0B(str));
        sb.append(" hasNonDigitChar: ");
        sb.append(TextUtils.isDigitsOnly(str));
        sb.append(" togglePoint: ");
        sb.append(str2);
        A00.AAP("error_info", sb.toString());
        A00.Cht();
    }

    public C32881hC(InterfaceC11360iu interfaceC11360iu, UserSession userSession) {
        super(interfaceC11360iu, null, "direct_mutation_waterfall");
        this.A00 = userSession;
    }
}
