package X;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4Ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97274Ym {
    public final int A00;
    public final int A01;
    public final C4B6 A02;
    public final C4WV A03;

    public int A00() {
        if (this instanceof C97264Yl) {
            return ((C97264Yl) this).A00;
        }
        return ((C97824aN) this).A07;
    }

    public boolean A01(AbstractC97274Ym abstractC97274Ym) {
        boolean z;
        boolean z2;
        int i;
        String str;
        int i2;
        if (this instanceof C97824aN) {
            C97824aN c97824aN = (C97824aN) this;
            C97824aN c97824aN2 = (C97824aN) abstractC97274Ym;
            if (c97824aN.A09 || Util.A0I(((AbstractC97274Ym) c97824aN).A02.A0W, ((AbstractC97274Ym) c97824aN2).A02.A0W)) {
                if (!c97824aN.A08.A07) {
                    if (c97824aN.A0F == c97824aN2.A0F) {
                        z = c97824aN.A0E;
                        z2 = c97824aN2.A0E;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            C97264Yl c97264Yl = (C97264Yl) this;
            C97264Yl c97264Yl2 = (C97264Yl) abstractC97274Ym;
            C96394Ux c96394Ux = c97264Yl.A01;
            if (c96394Ux.A02 || ((i2 = ((AbstractC97274Ym) c97264Yl).A02.A06) != -1 && i2 == ((AbstractC97274Ym) c97264Yl2).A02.A06)) {
                if (c96394Ux.A04 || ((str = ((AbstractC97274Ym) c97264Yl).A02.A0W) != null && TextUtils.equals(str, ((AbstractC97274Ym) c97264Yl2).A02.A0W))) {
                    if (c96394Ux.A05 || ((i = ((AbstractC97274Ym) c97264Yl).A02.A0G) != -1 && i == ((AbstractC97274Ym) c97264Yl2).A02.A0G)) {
                        if (c96394Ux.A03) {
                            return true;
                        }
                        if (c97264Yl.A04 == c97264Yl2.A04) {
                            z = c97264Yl.A03;
                            z2 = c97264Yl2.A03;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (z == z2) {
            return true;
        }
        return false;
    }

    public AbstractC97274Ym(C4WV c4wv, int i, int i2) {
        this.A00 = i;
        this.A03 = c4wv;
        this.A01 = i2;
        this.A02 = c4wv.A04[i2];
    }
}
