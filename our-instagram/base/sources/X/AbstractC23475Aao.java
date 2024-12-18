package X;

import android.content.Context;
import android.graphics.Rect;

/* renamed from: X.Aao, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23475Aao implements InterfaceC55932he {
    public final Context A00;
    public final C38321qM A01;
    public final C55U A02;

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
    }

    public final C22924A8u A00(Rect rect, AbstractC172157lk abstractC172157lk, C202278x7 c202278x7, C202278x7 c202278x72, int i, int i2) {
        float f;
        AGC agc;
        AGC agc2;
        AGC agc3;
        if (abstractC172157lk instanceof C171737l3) {
            if (this instanceof C219809nS) {
                float f2 = ((C171737l3) abstractC172157lk).A00;
                if (c202278x7 != null && c202278x72 != null) {
                    agc3 = new AGC(rect.exactCenterX(), rect.exactCenterY(), f2, AbstractC23037ADt.A00(c202278x72.A05, c202278x7.A05));
                } else {
                    agc3 = new AGC(0.0f, 0.0f, 1.0f, 0.0f);
                }
                return new C22924A8u(new AGJ(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 207, true, true), agc3, AbstractC166987dD.A0C(this.A00, 12), 0);
            }
            if (c202278x7 != null && c202278x72 != null) {
                return new C22924A8u(new AGJ(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 207, true, true), new AGC(c202278x7.A01 + rect.exactCenterX(), c202278x7.A02 + rect.exactCenterY(), c202278x7.A06, AbstractC23037ADt.A00(c202278x72.A05, c202278x7.A05)), AbstractC166987dD.A0C(this.A00, 12), 0);
            }
            return null;
        }
        if (abstractC172157lk instanceof C172147lj) {
            int ordinal = ((C172147lj) abstractC172157lk).A00.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C38321qM c38321qM = this.A01;
                    if (c202278x72 == null) {
                        agc2 = new AGC(0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        agc2 = new AGC(c202278x72.A03, c202278x72.A04, 1.0f, AbstractC23037ADt.A00(c202278x72.A05, 0.0f));
                    }
                    return new C22924A8u(A0C.A00(c38321qM, i2), agc2, 0, 0);
                }
                throw B4Z.A00();
            }
            C55U c55u = this.A02;
            if (c202278x72 == null) {
                agc = new AGC(0.0f, 0.0f, 1.0f, 0.0f);
            } else {
                agc = new AGC(c202278x72.A03, c202278x72.A04, 1.0f, AbstractC23037ADt.A00(c202278x72.A05, 0.0f));
            }
            AGJ agj = new AGJ(i / 4.0f, 0.0f, 0.5f, 0.5f, 0.0f, 242, false, false);
            int i3 = 255;
            if (c55u instanceof C81V) {
                i3 = 0;
            }
            return new C22924A8u(agj, agc, 0, i3);
        }
        if (abstractC172157lk instanceof C171757l5) {
            EnumC171747l4 enumC171747l4 = ((C171757l5) abstractC172157lk).A00;
            AGC agc4 = new AGC(0.0f, 0.0f, 0.0f, 0.0f);
            if (enumC171747l4.ordinal() == 0) {
                return new C22924A8u(new AGJ(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 207, true, true), agc4, 0, 0);
            }
            throw B4Z.A00();
        }
        if (abstractC172157lk instanceof C197448oF) {
            Context context = this.A00;
            C197448oF c197448oF = (C197448oF) abstractC172157lk;
            if (c202278x72 != null) {
                float f3 = i2;
                float f4 = (c197448oF.A00 * f3) / c202278x72.A07;
                float f5 = c202278x72.A0A;
                float f6 = f4 * f5;
                float f7 = i;
                if (c197448oF.A02) {
                    f = c197448oF.A01;
                } else {
                    f = 1.0f;
                }
                if (f6 > f * f7) {
                    f4 = (c197448oF.A01 * f7) / f5;
                }
                return new C22924A8u(new AGJ(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255, false, false), new AGC(f7 / 2.0f, f3 / 2.0f, f4, AbstractC23037ADt.A00(c202278x72.A05, 0.0f)), AbstractC166987dD.A0C(context, 12), 255);
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        if (this instanceof C219809nS) {
            ((C219809nS) this).A05 = true;
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        if (this instanceof C219809nS) {
            ((C219809nS) this).A05 = false;
        }
    }

    public AbstractC23475Aao(Context context, C55U c55u, C38321qM c38321qM) {
        this.A00 = context;
        this.A01 = c38321qM;
        this.A02 = c55u;
    }
}
