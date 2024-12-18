package X;

/* loaded from: classes9.dex */
public final class OMx {
    public C0U0 A00;
    public final AbstractC225918h A01;
    public final InterfaceC10260gi A02;
    public final InterfaceC10260gi A03;

    public final boolean A09(long j) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            return c0u0.boolOverrideForParam(j, false);
        }
        return false;
    }

    public final double A00(long j) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            return c0u0.doubleOverrideForParam(j, 0.0d);
        }
        return 0.0d;
    }

    public final long A01(long j) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            return c0u0.intOverrideForParam(j, 0L);
        }
        return 0L;
    }

    public final String A02(long j) {
        C0U0 c0u0 = this.A00;
        return c0u0 != null ? c0u0.stringOverrideForParam(j, "") : "";
    }

    public final void A03() {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            c0u0.removeAllOverrides();
        }
    }

    public final void A04(long j) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            c0u0.removeOverrideForParam(j);
        }
    }

    public final void A05(long j, double d) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            c0u0.updateOverrideForParam(j, d);
        }
    }

    public final void A06(long j, long j2) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            c0u0.updateOverrideForParam(j, j2);
        }
    }

    public final void A07(long j, String str) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            c0u0.updateOverrideForParam(j, str);
        }
    }

    public final void A08(long j, boolean z) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            c0u0.updateOverrideForParam(j, z);
        }
    }

    public final boolean A0A(long j) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            return c0u0.hasBoolOverrideForParam(j);
        }
        return false;
    }

    public final boolean A0B(long j) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            return c0u0.hasDoubleOverrideForParam(j);
        }
        return false;
    }

    public final boolean A0C(long j) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            return c0u0.hasIntOverrideForParam(j);
        }
        return false;
    }

    public final boolean A0D(long j) {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            return c0u0.hasStringOverrideForParam(j);
        }
        return false;
    }

    public OMx(AbstractC225918h abstractC225918h, InterfaceC10260gi interfaceC10260gi, InterfaceC10260gi interfaceC10260gi2) {
        this.A01 = abstractC225918h;
        this.A02 = interfaceC10260gi;
        this.A03 = interfaceC10260gi2;
        this.A00 = abstractC225918h.getOrCreateOverridesTable();
    }
}
