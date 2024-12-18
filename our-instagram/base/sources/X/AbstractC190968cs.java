package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import java.util.ArrayList;

/* renamed from: X.8cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC190968cs {
    public C6S0 A00(Context context, Layout layout, Integer num, float f, int i, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z2;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        WnM wnM;
        if (this instanceof C194928jt) {
            C14360o3.A0B(context, 0);
            f2 = f / 4.0f;
            f3 = 0.3f;
            f4 = f * 0.3f;
            f5 = 0.0f;
        } else {
            if (this instanceof C194988jz) {
                return new C71066WnO(C71066WnO.A07.A01(layout, num, f, 0, layout.getText().length()), f * 0.1f);
            }
            if (this instanceof C195008k1) {
                C14360o3.A0B(context, 0);
                wnM = new WnM(context, new Rect(), 0.6f, 0.6f, 0.8f);
            } else {
                if (this instanceof C1808680o) {
                    z2 = false;
                    C14360o3.A0B(context, 0);
                    f15 = f / 4.0f;
                    f16 = 0.3f;
                    f17 = f * 0.3f;
                    f18 = 0.15f;
                    f19 = f * 0.15f;
                    f20 = 0.2f;
                    f21 = f * 0.2f;
                    f22 = 0.85f;
                } else {
                    if (this instanceof C194958jw) {
                        return new C71063WnK(AbstractC68595VWw.A00(layout, f, i, i2));
                    }
                    if (this instanceof C1808780p) {
                        C14360o3.A0B(context, 0);
                        f12 = 0.7f;
                        f13 = 0.55f;
                        f14 = 0.9f;
                    } else if (this instanceof C1808880q) {
                        z2 = false;
                        C14360o3.A0B(context, 0);
                        f15 = f / 4.0f;
                        f16 = 0.4f;
                        f17 = f * 0.4f;
                        f18 = 0.2f;
                        f19 = f * 0.2f;
                        f20 = 0.3f;
                        f21 = f * 0.3f;
                        f22 = 1.0f;
                    } else {
                        if (this instanceof C1808980r) {
                            z = false;
                            C14360o3.A0B(context, 0);
                            f6 = f / 4.0f;
                            f7 = 0.3f;
                            f8 = f * 0.3f;
                            f9 = 0.0f;
                            f10 = f * 0.0f;
                            f11 = 0.6f;
                        } else {
                            if (this instanceof C194898jq) {
                                C14360o3.A0B(context, 0);
                                return new C66336U9o(context, C66336U9o.A07.A00(layout, f));
                            }
                            if (this instanceof C8k4) {
                                C14360o3.A0B(context, 0);
                                f12 = 0.6f;
                                f13 = 0.45f;
                                f14 = 0.7f;
                            } else if (this instanceof C195018k2) {
                                z = false;
                                C14360o3.A0B(context, 0);
                                f6 = f / 3.0f;
                                f7 = 0.8f;
                                f8 = f * 0.8f;
                                f9 = 0.4f;
                                f10 = f * 0.4f;
                                f11 = 0.85f;
                            } else {
                                if (this instanceof C194978jy) {
                                    C69510Vpn c69510Vpn = C66335U9n.A07;
                                    return new C66335U9n(c69510Vpn.A00(layout, f, i, i2, true), c69510Vpn.A00(layout, f, i, i2, false));
                                }
                                if (this instanceof C194938ju) {
                                    z = false;
                                    C14360o3.A0B(context, 0);
                                    f6 = f / 4.0f;
                                    f7 = 0.3f;
                                    f8 = f * 0.3f;
                                    f9 = 0.2f;
                                    f10 = f * 0.2f;
                                    f11 = 1.0f;
                                } else {
                                    if (this instanceof C194968jx) {
                                        C14360o3.A0B(context, 0);
                                        float f23 = f * 0.05f;
                                        int lineCount = layout.getLineCount();
                                        float[][] fArr = new float[lineCount];
                                        for (int i3 = 0; i3 < lineCount; i3++) {
                                            float[] fArr2 = new float[2];
                                            fArr2[0] = layout.getLineLeft(i3);
                                            fArr2[1] = layout.getLineBaseline(i3);
                                            fArr[i3] = fArr2;
                                        }
                                        return new C66334U9m(context, fArr, f23);
                                    }
                                    if (this instanceof C194948jv) {
                                        C14360o3.A0B(context, 0);
                                        return new C9T9(context);
                                    }
                                    if (this instanceof C221479qC) {
                                        C14360o3.A0B(context, 0);
                                        f2 = f / 4.0f;
                                        f3 = 0.3f;
                                        f4 = f * 0.3f;
                                        f5 = 0.2f;
                                    } else {
                                        if (this instanceof C194998k0) {
                                            return new C71064WnL(AbstractC68597VWy.A00(layout, f));
                                        }
                                        C14360o3.A0B(context, 0);
                                        ArrayList A02 = AbstractC139126Rt.A02(layout, f * 0.2f, f * (-0.1f), f * (-0.05f), 0.0f, 0.8f);
                                        C14360o3.A0C(A02, AbstractC111324zv.A00(245));
                                        return new C71065WnN(context, A02, 0.0f, -0.1f, -0.05f, 0.2f, 0.8f, false);
                                    }
                                }
                            }
                        }
                        ArrayList A022 = AbstractC139126Rt.A02(layout, f8, f10, f10, f6, f11);
                        C14360o3.A0C(A022, AbstractC111324zv.A00(245));
                        return new C71065WnN(context, A022, f6, f9, f9, f7, f11, z);
                    }
                    wnM = new WnM(context, new Rect(), f12, f13, f14);
                }
                ArrayList A023 = AbstractC139126Rt.A02(layout, f17, f19, f21, f15, f22);
                C14360o3.A0C(A023, AbstractC111324zv.A00(245));
                return new C71065WnN(context, A023, f15, f18, f20, f16, f22, z2);
            }
            wnM.A00(layout, f);
            return wnM;
        }
        ArrayList A024 = AbstractC139126Rt.A02(layout, f4, f * f5, f * (-0.01f), f2, 1.0f);
        C14360o3.A0C(A024, AbstractC111324zv.A00(245));
        return new C71065WnN(context, A024, f2, f5, -0.01f, f3, 1.0f, true);
    }

    public Class A01() {
        if (this instanceof C194948jv) {
            return C9T9.class;
        }
        if (!(this instanceof C8k4)) {
            if (!(this instanceof C194938ju) && !(this instanceof C1808680o) && !(this instanceof C194928jt)) {
                if (this instanceof C194988jz) {
                    return C71066WnO.class;
                }
                if (!(this instanceof C195008k1)) {
                    if (this instanceof C194958jw) {
                        return C71063WnK.class;
                    }
                    if (!(this instanceof C1808780p)) {
                        if (!(this instanceof C1808880q) && !(this instanceof C1808980r)) {
                            if (this instanceof C194898jq) {
                                return C66336U9o.class;
                            }
                            if (!(this instanceof C195028k3) && !(this instanceof C195018k2)) {
                                if (this instanceof C194978jy) {
                                    return C66335U9n.class;
                                }
                                if (this instanceof C194968jx) {
                                    return C66334U9m.class;
                                }
                                if (!(this instanceof C221479qC)) {
                                    return C71064WnL.class;
                                }
                                return C71065WnN.class;
                            }
                            return C71065WnN.class;
                        }
                        return C71065WnN.class;
                    }
                    return WnM.class;
                }
                return WnM.class;
            }
            return C71065WnN.class;
        }
        return WnM.class;
    }

    public boolean A02() {
        if (this instanceof C194948jv) {
            return false;
        }
        return true;
    }

    public boolean A03() {
        if (this instanceof C194958jw) {
            return true;
        }
        return false;
    }
}
