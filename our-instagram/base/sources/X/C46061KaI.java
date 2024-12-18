package X;

import android.view.View;

/* renamed from: X.KaI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46061KaI extends AnonymousClass772 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46061KaI(InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(Integer.valueOf(i));
        this.A00 = 4;
        this.A01 = interfaceC16820sZ;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        switch (this.A00) {
            case 2:
                C47530Kyx c47530Kyx = (C47530Kyx) this.A01;
                c47530Kyx.A01.A00(c47530Kyx.A00);
                return;
            case 3:
                KBZ kbz = (KBZ) this.A01;
                A0y = AbstractC25228BEl.A0y(kbz.requireContext(), AbstractC166987dD.A0r(kbz.A0M), C2Fb.A1W, "https://m.facebook.com/policies/other-policies/ais-terms");
                A0y.A0A();
                return;
            case 4:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 5:
                C54692ODs c54692ODs = (C54692ODs) this.A01;
                AbstractC92944En.A05(c54692ODs.A00, c54692ODs.A02);
                return;
            default:
                V0L v0l = (V0L) this.A01;
                A0y = AbstractC25228BEl.A0y(v0l.requireActivity(), AbstractC166987dD.A0r(v0l.A05), C2Fb.A35, "https://www.facebook.com/policies/ads");
                A0y.A0S = "promote_simple_error";
                A0y.A0A();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46061KaI(V0L v0l, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = v0l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46061KaI(KBZ kbz, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A01 = kbz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46061KaI(C54692ODs c54692ODs, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = c54692ODs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46061KaI(C47530Kyx c47530Kyx, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = c47530Kyx;
    }
}
