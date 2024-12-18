package X;

/* renamed from: X.VvL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69784VvL {
    public void A00() {
        if (this instanceof C67903V1r) {
            U79 u79 = ((C67903V1r) this).A00;
            if (!u79.A01) {
                U79.A00(XPI.FETCHING_CANCELLED, u79);
            }
            u79.A08.A00();
        }
    }

    public final void A01() {
        if (this instanceof C67903V1r) {
            U79 u79 = ((C67903V1r) this).A00;
            U79.A00(XPI.FETCHING_START, u79);
            u79.A08.A02();
        }
    }

    public void A02() {
        if (this instanceof C67903V1r) {
            U79 u79 = ((C67903V1r) this).A00;
            U79.A00(XPI.FETCHING_DONE, u79);
            u79.A08.A04(null);
        } else {
            if (!(this instanceof V1s)) {
                return;
            }
            V1s v1s = (V1s) this;
            C124575kL.A00.A03(v1s.A00, v1s.A01, v1s.A02, null, v1s.A03, "genai_transparency_learn_more_impression", v1s.A04);
        }
    }

    public void A03(AbstractC115105If abstractC115105If) {
        AbstractC115105If c115115Ig;
        if (this instanceof C67903V1r) {
            U79 u79 = ((C67903V1r) this).A00;
            Throwable A01 = abstractC115105If.A01();
            if (A01 != null) {
                c115115Ig = new C115095Ie(A01);
            } else {
                InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
                if (interfaceC40821up != null) {
                    c115115Ig = new C115115Ig(new C68858VdE(interfaceC40821up.getErrorMessage()));
                }
                u79.A08.A01();
            }
            U79.A01(c115115Ig, u79);
            u79.A08.A01();
        }
    }
}
