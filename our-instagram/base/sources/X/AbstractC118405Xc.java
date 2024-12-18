package X;

/* renamed from: X.5Xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC118405Xc {
    public final float A00(int i) {
        if (this instanceof C118415Xd) {
            C118415Xd c118415Xd = (C118415Xd) this;
            if (i != 0) {
                if (i == 1) {
                    return c118415Xd.A01;
                }
                return 0.0f;
            }
            return c118415Xd.A00;
        }
        if (this instanceof C118395Xb) {
            C118395Xb c118395Xb = (C118395Xb) this;
            if (i == 0) {
                return c118395Xb.A00;
            }
            return 0.0f;
        }
        if (this instanceof C118435Xf) {
            C118435Xf c118435Xf = (C118435Xf) this;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return c118435Xf.A03;
                        }
                        return 0.0f;
                    }
                    return c118435Xf.A02;
                }
                return c118435Xf.A01;
            }
            return c118435Xf.A00;
        }
        C118425Xe c118425Xe = (C118425Xe) this;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return c118425Xe.A02;
                }
                return 0.0f;
            }
            return c118425Xe.A01;
        }
        return c118425Xe.A00;
    }

    public final int A01() {
        if (this instanceof C118395Xb) {
            return 1;
        }
        if (this instanceof C118415Xd) {
            return 2;
        }
        if (this instanceof C118435Xf) {
            return 4;
        }
        return 3;
    }

    public final void A02() {
        if (this instanceof C118395Xb) {
            ((C118395Xb) this).A00 = 0.0f;
            return;
        }
        if (this instanceof C118415Xd) {
            C118415Xd c118415Xd = (C118415Xd) this;
            c118415Xd.A00 = 0.0f;
            c118415Xd.A01 = 0.0f;
        } else {
            if (this instanceof C118435Xf) {
                C118435Xf c118435Xf = (C118435Xf) this;
                c118435Xf.A00 = 0.0f;
                c118435Xf.A01 = 0.0f;
                c118435Xf.A02 = 0.0f;
                c118435Xf.A03 = 0.0f;
                return;
            }
            C118425Xe c118425Xe = (C118425Xe) this;
            c118425Xe.A00 = 0.0f;
            c118425Xe.A01 = 0.0f;
            c118425Xe.A02 = 0.0f;
        }
    }

    public final void A03(int i, float f) {
        if (this instanceof C118415Xd) {
            C118415Xd c118415Xd = (C118415Xd) this;
            if (i != 0) {
                if (i == 1) {
                    c118415Xd.A01 = f;
                    return;
                }
                return;
            }
            c118415Xd.A00 = f;
            return;
        }
        if (this instanceof C118395Xb) {
            C118395Xb c118395Xb = (C118395Xb) this;
            if (i != 0) {
                return;
            }
            c118395Xb.A00 = f;
            return;
        }
        if (this instanceof C118435Xf) {
            C118435Xf c118435Xf = (C118435Xf) this;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        c118435Xf.A03 = f;
                        return;
                    }
                    c118435Xf.A02 = f;
                    return;
                }
                c118435Xf.A01 = f;
                return;
            }
            c118435Xf.A00 = f;
            return;
        }
        C118425Xe c118425Xe = (C118425Xe) this;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                c118425Xe.A02 = f;
                return;
            }
            c118425Xe.A01 = f;
            return;
        }
        c118425Xe.A00 = f;
    }
}
