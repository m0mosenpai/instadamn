package X;

/* renamed from: X.7r1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175277r1 {
    public boolean A00;
    public final C175227qw A01;

    public final void A00(String str) {
        A01(AnonymousClass001.A0R("Can only check if prepared on the Optic thread. ", str));
        if (this.A00) {
        } else {
            throw new IllegalStateException(AnonymousClass001.A0u("Not prepared: ", str, " Current thread: ", Thread.currentThread().getName()));
        }
    }

    public final void A01(String str) {
        if (this.A01.A09()) {
        } else {
            throw new RuntimeException(AnonymousClass001.A0g(str, " Current thread: ", Thread.currentThread().getName()));
        }
    }

    public final void A02(boolean z, String str) {
        A01(AnonymousClass001.A0R("Can only set the prepared state on the Optic thread. ", str));
        this.A00 = z;
    }

    public C175277r1(C175227qw c175227qw) {
        this.A01 = c175227qw;
    }
}
