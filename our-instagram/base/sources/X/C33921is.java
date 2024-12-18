package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.1is, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33921is implements InterfaceC29301b7 {
    public static final C0KV A05 = C33931it.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new MHR(this, 38));
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new MHR(this, 37));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new MHR(this, 36));

    public final void A00(C1P1 c1p1, C33891ip c33891ip) {
        UserSession userSession = this.A00;
        DirectThreadKey C7Q = c33891ip.C7Q();
        Integer valueOf = Integer.valueOf(c33891ip.A00);
        String A07 = c33891ip.A07();
        String A06 = c33891ip.A06();
        String str = ((C1OW) c33891ip).A05;
        JTa jTa = ((C1OW) c33891ip).A02;
        boolean z = jTa.A09;
        String str2 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z2 = jTa.A0A;
        Integer valueOf2 = Integer.valueOf(c33891ip.A01);
        String str3 = c33891ip.A0A;
        String str4 = c33891ip.A0B;
        UQL uql = c33891ip.A04;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/threads/broadcast/create_prompt/");
        c25621Ms.A9s("prompt_text", A07);
        int intValue = valueOf.intValue();
        c25621Ms.A0D("prompt_type", intValue);
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C7Q.A00);
        c25621Ms.A0D("recurring_roll_call_cadence", valueOf2.intValue());
        c25621Ms.A9s("trending_prompt_id", str4);
        c25621Ms.A0S(EDZ.class, FUR.class);
        if (str3 != null) {
            c25621Ms.A9s("timezone", str3);
        }
        if (uql != null && intValue == 162) {
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                FUQ.A00(uql, A0A);
                A0A.close();
                c25621Ms.A9s("challenge_prompt_data", stringWriter.toString());
                c25621Ms.A0R = true;
            } catch (IOException e) {
                C0w9.A06("DirectMessageApi", "Error while parsing ChallengePromptData", e);
            }
        }
        AbstractC47995LLh.A0D(c25621Ms, l1w, C7Q, A06, str, str2, z, false, z2);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        C1GJ.A03(A0N);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C33891ip c33891ip = (C33891ip) c1ow;
        C14360o3.A0B(c33891ip, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        A00(new C32226EDz(new ET0(this, c33891ip), this.A00, interfaceC37261GbE), c33891ip);
    }

    public C33921is(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
