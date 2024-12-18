package X;

import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;

/* renamed from: X.0z3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20290z3 extends C0VQ {
    public boolean A00;

    public C20290z3() {
        super(null);
    }

    @Override // X.C0VQ
    public final int getSupportedProviders() {
        return ExternalProviders.A07.A01;
    }

    @Override // X.C0VQ
    public final int getTracingProviders() {
        if (this.A00) {
            return ExternalProviders.A07.A01;
        }
        return 0;
    }

    @Override // X.C0VQ
    public final void disable() {
        int A03 = C0f9.A03(-327011069);
        Systrace.A00 = 0L;
        this.A00 = false;
        C0f9.A0A(334625755, A03);
    }

    @Override // X.C0VQ
    public final void enable() {
        int A03 = C0f9.A03(-1921993945);
        Systrace.A00 = 4855650081448481L;
        this.A00 = true;
        C0f9.A0A(1149872055, A03);
    }
}
