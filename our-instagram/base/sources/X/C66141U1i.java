package X;

import com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum;
import java.util.List;

/* renamed from: X.U1i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66141U1i implements InterfaceC43071ya {
    public final C65954Twz A00;
    public final C66137U1e A01;
    public final C66138U1f A02;
    public final String A03;

    public C66141U1i(C66137U1e c66137U1e, C66138U1f c66138U1f, String str) {
        this.A01 = c66137U1e;
        this.A02 = c66138U1f;
        this.A03 = str;
        C65954Twz c65954Twz = new C65954Twz();
        c65954Twz.A09 = "server";
        c65954Twz.A05 = "server_results";
        this.A00 = c65954Twz;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum;
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
            C66138U1f c66138U1f = this.A02;
            C69727VuM c69727VuM = (C69727VuM) c59062n7.A03;
            InterfaceC09390do interfaceC09390do = c69727VuM.A0A;
            if (c66138U1f.AHA((String) interfaceC09390do.getValue())) {
                if (c69727VuM.A01() == C05F.A0u) {
                    List list = c69727VuM.A08;
                    if (list != null) {
                        this.A00.A02 = list.size();
                    }
                    C99534dT c99534dT = c69727VuM.A00().A03;
                    if (c99534dT != null && (threadsInFeedUnitTypeEnum = c99534dT.A06) != null) {
                        C65954Twz c65954Twz = this.A00;
                        String obj = threadsInFeedUnitTypeEnum.toString();
                        C14360o3.A0B(obj, 0);
                        c65954Twz.A0A = obj;
                    }
                    this.A00.A07 = this.A03;
                }
                this.A01.A00(new Tx0(this.A00), null, null, (String) c69727VuM.A0B.getValue(), (String) interfaceC09390do.getValue(), (String) interfaceC09390do.getValue(), "", null);
            }
        }
    }
}
