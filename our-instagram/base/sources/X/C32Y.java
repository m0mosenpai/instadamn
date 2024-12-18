package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.32Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32Y implements InterfaceC670130s {
    public H9D A02;
    public C38321qM A03;
    public C75113Zb A04;
    public Integer A05;
    public final InterfaceC670130s A07;
    public int A00 = -1;
    public String A06 = "";
    public long A01 = -1;

    @Override // X.InterfaceC670130s
    public final void CtX(int i) {
    }

    @Override // X.InterfaceC670130s
    public final void D7Y() {
    }

    @Override // X.InterfaceC670130s
    public final C101484hA DnX(Integer num, List list) {
        C14360o3.A0B(num, 1);
        H9D h9d = this.A02;
        String str = "afiResponse";
        if (h9d != null) {
            C38608GyB c38608GyB = h9d.A01;
            if (c38608GyB == null) {
                str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
            } else {
                if (c38608GyB.A02) {
                    InterfaceC670130s interfaceC670130s = this.A07;
                    int i = this.A00;
                    if (i >= 0) {
                        C42710Iv5 c42710Iv5 = new C42710Iv5(c38608GyB);
                        c42710Iv5.A00 = i;
                        c42710Iv5.A05 = this.A06;
                        c42710Iv5.A02 = this.A03;
                        c42710Iv5.A03 = this.A04;
                        Integer num2 = this.A05;
                        str = "afiTriggerSource";
                        if (num2 != null) {
                            c42710Iv5.A04 = num2;
                            if (num2 == C05F.A0C) {
                                c42710Iv5.A01 = this.A01;
                            }
                            C3XG c3xg = new C3XG(c42710Iv5, C1XV.A06, c42710Iv5.getId());
                            EnumC73363Qm enumC73363Qm = EnumC73363Qm.A05;
                            C671831j c671831j = new C671831j(null, null, null, 0, 0, 0, 0, 0, 16383, false, false, false, false);
                            c671831j.A0B(i + 1);
                            String A00 = C1EP.A00();
                            C1EP.A00();
                            interfaceC670130s.DnX(num, AbstractC16960so.A1N(new C82373m0(new C9CB(C1EN.A0N, A00), c3xg, enumC73363Qm, c671831j)));
                        }
                    } else {
                        throw new IllegalArgumentException("AFI seed ad position is negative");
                    }
                }
                C16930sl c16930sl = C16930sl.A00;
                return new C101484hA(c16930sl, c16930sl);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC670130s
    public final Map Bkt() {
        return new LinkedHashMap();
    }

    @Override // X.InterfaceC670130s
    public final /* synthetic */ C101484hA DnY(Integer num, Integer num2, List list) {
        throw new UnsupportedOperationException(AbstractC111324zv.A00(24));
    }

    public C32Y(InterfaceC670130s interfaceC670130s) {
        this.A07 = interfaceC670130s;
    }
}
