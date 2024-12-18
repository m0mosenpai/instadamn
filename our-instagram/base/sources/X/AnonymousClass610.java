package X;

import com.facebook.instagram.msys.InstagramDasmConfigCreator;
import com.facebook.msys.util.Provider;

/* renamed from: X.610, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass610 implements Provider {
    public boolean A00;
    public Object A01;

    @Override // com.facebook.msys.util.Provider
    public final synchronized Object get() {
        if (!this.A00) {
            this.A01 = A00();
            this.A00 = true;
        }
        return this.A01;
    }

    public Object A00() {
        if (this instanceof C1335460z) {
            return ((C1335460z) this).A00;
        }
        if (this instanceof C6CS) {
            return new Object();
        }
        if (this instanceof C135766Ce) {
            return ((C135766Ce) this).A00.A1D.get();
        }
        if (this instanceof C6CL) {
            return InstagramDasmConfigCreator.getInstance();
        }
        if (this instanceof C135756Cd) {
            return true;
        }
        if (this instanceof C6CY) {
            return "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf";
        }
        if (this instanceof C6CM) {
            return ((C6CM) this).A00.toString();
        }
        if (this instanceof C6CZ) {
            return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C6CZ) this).A00, 36320150421250152L));
        }
        if (this instanceof C6CW) {
            C47142Eg c47142Eg = ((C6CW) this).A00;
            boolean z = true;
            if ((!c47142Eg.A02() || !((Boolean) c47142Eg.A01.get()).booleanValue()) && !((Boolean) c47142Eg.A0B.get()).booleanValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (this instanceof C6CP) {
            return ((C6CP) this).A00.A0I.get();
        }
        if (this instanceof C135726Ca) {
            return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C135726Ca) this).A00, 36328517017353815L));
        }
        return Integer.valueOf(((C6CX) this).A00);
    }
}
