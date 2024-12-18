package X;

import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8MQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MQ {
    public C44815Jsm A00;
    public C44816Jsn A01;
    public boolean A02;
    public final UserSession A03;

    public C8MQ(UserSession userSession) {
        C8EC c8ec;
        C8EF c23289AUa;
        this.A03 = userSession;
        IgVoltronModelLoader A00 = IgVoltronModelLoader.Companion.A00(userSession);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36324526992208095L);
        this.A02 = A06;
        if (A06) {
            A00.fetchExecuTorchVoltronModule(C8E9.A00);
            A00.fetchSentencePieceVoltronModule(C8EA.A00);
            List singletonList = Collections.singletonList(C8E4.A08.A00());
            C14360o3.A07(singletonList);
            C44815Jsm c44815Jsm = new C44815Jsm(new C8ED(userSession, singletonList));
            ((AbstractC72053XLu) c44815Jsm).A00 = new C23293AUe(this);
            this.A00 = c44815Jsm;
            if (c44815Jsm.A02 != null && c44815Jsm.A01 != null && c44815Jsm.A08()) {
                return;
            }
            c8ec = c44815Jsm.A04;
            c23289AUa = new AUZ(c44815Jsm);
        } else {
            A00.fetchPytorchVoltronModule(C8E8.A00);
            A00.fetchSentencePieceVoltronModule(C8EA.A00);
            List singletonList2 = Collections.singletonList(C8E4.A07.A00());
            C14360o3.A07(singletonList2);
            C44816Jsn c44816Jsn = new C44816Jsn(new C8ED(userSession, singletonList2));
            ((AbstractC72053XLu) c44816Jsn).A00 = new C23294AUf(this);
            this.A01 = c44816Jsn;
            if (c44816Jsn.A02 != null && c44816Jsn.A01 != null && c44816Jsn.A08()) {
                return;
            }
            c8ec = c44816Jsn.A04;
            c23289AUa = new C23289AUa(c44816Jsn);
        }
        c8ec.AV9(c23289AUa, true);
    }
}
