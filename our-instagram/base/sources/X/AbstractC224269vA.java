package X;

import java.util.Arrays;

/* renamed from: X.9vA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224269vA {
    public final int A00() {
        if (this instanceof C25154BAy) {
            return ((C25154BAy) this).A00;
        }
        if (this instanceof C25153BAx) {
            return ((C25153BAx) this).A00;
        }
        if (this instanceof C25152BAw) {
            return ((C25152BAw) this).A00;
        }
        if (this instanceof C25151BAv) {
            return ((C25151BAv) this).A00;
        }
        if (this instanceof C25150BAu) {
            return ((C25150BAu) this).A00;
        }
        if (this instanceof C25149BAt) {
            return ((C25149BAt) this).A00;
        }
        if (this instanceof C25148BAs) {
            return ((C25148BAs) this).A00;
        }
        if (this instanceof C25147BAr) {
            return ((C25147BAr) this).A00;
        }
        if (this instanceof C25146BAq) {
            return ((C25146BAq) this).A00;
        }
        if (this instanceof C25145BAp) {
            return ((C25145BAp) this).A00;
        }
        if (this instanceof C25144BAo) {
            return ((C25144BAo) this).A00;
        }
        return ((C25143BAn) this).A00;
    }

    public final Object A01() {
        Object copyOf;
        if (this instanceof C25154BAy) {
            C25154BAy c25154BAy = (C25154BAy) this;
            short[] copyOf2 = Arrays.copyOf(c25154BAy.A01, c25154BAy.A00);
            C14360o3.A07(copyOf2);
            return new C192518ft(copyOf2);
        }
        if (this instanceof C25153BAx) {
            C25153BAx c25153BAx = (C25153BAx) this;
            long[] copyOf3 = Arrays.copyOf(c25153BAx.A01, c25153BAx.A00);
            C14360o3.A07(copyOf3);
            return new C192378ff(copyOf3);
        }
        if (this instanceof C25152BAw) {
            C25152BAw c25152BAw = (C25152BAw) this;
            int[] copyOf4 = Arrays.copyOf(c25152BAw.A01, c25152BAw.A00);
            C14360o3.A07(copyOf4);
            return new C192448fm(copyOf4);
        }
        if (this instanceof C25151BAv) {
            C25151BAv c25151BAv = (C25151BAv) this;
            byte[] copyOf5 = Arrays.copyOf(c25151BAv.A01, c25151BAv.A00);
            C14360o3.A07(copyOf5);
            return new C192588g0(copyOf5);
        }
        if (this instanceof C25150BAu) {
            C25150BAu c25150BAu = (C25150BAu) this;
            copyOf = Arrays.copyOf(c25150BAu.A01, c25150BAu.A00);
        } else if (this instanceof C25149BAt) {
            C25149BAt c25149BAt = (C25149BAt) this;
            copyOf = Arrays.copyOf(c25149BAt.A01, c25149BAt.A00);
        } else if (this instanceof C25148BAs) {
            C25148BAs c25148BAs = (C25148BAs) this;
            copyOf = Arrays.copyOf(c25148BAs.A01, c25148BAs.A00);
        } else if (this instanceof C25147BAr) {
            C25147BAr c25147BAr = (C25147BAr) this;
            copyOf = Arrays.copyOf(c25147BAr.A01, c25147BAr.A00);
        } else if (this instanceof C25146BAq) {
            C25146BAq c25146BAq = (C25146BAq) this;
            copyOf = Arrays.copyOf(c25146BAq.A01, c25146BAq.A00);
        } else if (this instanceof C25145BAp) {
            C25145BAp c25145BAp = (C25145BAp) this;
            copyOf = Arrays.copyOf(c25145BAp.A01, c25145BAp.A00);
        } else if (this instanceof C25144BAo) {
            C25144BAo c25144BAo = (C25144BAo) this;
            copyOf = Arrays.copyOf(c25144BAo.A01, c25144BAo.A00);
        } else {
            C25143BAn c25143BAn = (C25143BAn) this;
            copyOf = Arrays.copyOf(c25143BAn.A01, c25143BAn.A00);
        }
        C14360o3.A07(copyOf);
        return copyOf;
    }
}
