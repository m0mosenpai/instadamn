package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.587, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass587 implements AnonymousClass588 {
    public GraphicsLayer A00;
    public final C58A A01 = new C58A() { // from class: X.589
        @Override // X.C58A
        public final void AI7(int i, float f, float f2, float f3, float f4) {
            ((AnonymousClass587) AnonymousClass588.this).A02.A02.A01.AI7(i, f, f2, f3, f4);
        }

        @Override // X.C58A
        public final long Amh() {
            return C5YB.A01(((AnonymousClass587) AnonymousClass588.this).A02.A02.A00);
        }

        @Override // X.C58A
        public final void COj(float f, float f2, float f3, float f4) {
            AnonymousClass588 anonymousClass588 = AnonymousClass588.this;
            AnonymousClass586 anonymousClass586 = ((AnonymousClass587) anonymousClass588).A02.A02;
            AnonymousClass585 anonymousClass585 = anonymousClass586.A01;
            long j = anonymousClass586.A00;
            long A00 = C5YB.A00(C5YC.A02(j) - (f3 + f), C5YC.A00(j) - (f4 + f2));
            if (C5YC.A02(A00) >= 0.0f && C5YC.A00(A00) >= 0.0f) {
                anonymousClass588.EeS(A00);
                anonymousClass585.F8X(f, f2);
                return;
            }
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }

        @Override // X.C58A
        public final void EL7(long j, float f) {
            AnonymousClass585 anonymousClass585 = ((AnonymousClass587) AnonymousClass588.this).A02.A02.A01;
            float A01 = C119365at.A01(j);
            float A02 = C119365at.A02(j);
            anonymousClass585.F8X(A01, A02);
            anonymousClass585.EL6(f);
            anonymousClass585.F8X(-A01, -A02);
        }

        @Override // X.C58A
        public final void ELz(long j, float f, float f2) {
            AnonymousClass585 anonymousClass585 = ((AnonymousClass587) AnonymousClass588.this).A02.A02.A01;
            float A01 = C119365at.A01(j);
            float A02 = C119365at.A02(j);
            anonymousClass585.F8X(A01, A02);
            anonymousClass585.ELy(f, f2);
            anonymousClass585.F8X(-A01, -A02);
        }

        @Override // X.C58A
        public final void F8X(float f, float f2) {
            ((AnonymousClass587) AnonymousClass588.this).A02.A02.A01.F8X(f, f2);
        }
    };
    public final /* synthetic */ AnonymousClass580 A02;

    public AnonymousClass587(AnonymousClass580 anonymousClass580) {
        this.A02 = anonymousClass580;
    }

    @Override // X.AnonymousClass588
    public final void ERA(AnonymousClass585 anonymousClass585) {
        this.A02.A02.A01 = anonymousClass585;
    }

    @Override // X.AnonymousClass588
    public final void ETE(InterfaceC1128957x interfaceC1128957x) {
        this.A02.A02.A02 = interfaceC1128957x;
    }

    @Override // X.AnonymousClass588
    public final void EY4(AnonymousClass583 anonymousClass583) {
        this.A02.A02.A03 = anonymousClass583;
    }

    @Override // X.AnonymousClass588
    public final void EeS(long j) {
        this.A02.A02.A00 = j;
    }
}
