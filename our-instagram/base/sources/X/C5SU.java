package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Deprecated;

/* renamed from: X.5SU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SU {
    public int A00;
    public int A01;
    public ViewGroup A02;
    public InterfaceC116795Qi A03;
    public C33I A04;
    public EnumC58132lV A05;
    public InterfaceC58042lK A06;
    public C5SV A07;
    public C5SV A08;
    public C5ST A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Context A0H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5SU(android.app.Activity r3, X.C5ST r4) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L19
            android.view.View r1 = r0.getDecorView()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.C14360o3.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2.<init>(r3, r1, r4)
            return
        L19:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5SU.<init>(android.app.Activity, X.5ST):void");
    }

    public final void A03(View view) {
        C14360o3.A0B(view, 0);
        this.A03 = new C116785Qh(view);
    }

    public final void A04(View view, int i, int i2, boolean z) {
        C14360o3.A0B(view, 3);
        this.A03 = new C207559Gj(view, i, i2, z);
    }

    public final void A05(C207559Gj c207559Gj) {
        C14360o3.A0B(c207559Gj, 0);
        this.A03 = c207559Gj;
    }

    public final void A06(EnumC58132lV enumC58132lV) {
        C14360o3.A0B(enumC58132lV, 0);
        this.A05 = enumC58132lV;
    }

    @Deprecated(message = "No longer supported by IGDS. Theme should always be default: TooltipTheme.Light")
    public final void A07(C5SV c5sv) {
        C14360o3.A0B(c5sv, 0);
        this.A08 = c5sv;
    }

    @Deprecated(message = "No longer supported by IGDS. Theme should always be default: TooltipTheme.Dark")
    public final void A08(C5SV c5sv) {
        C14360o3.A0B(c5sv, 0);
        if (!c5sv.equals(C5SV.A07)) {
            this.A07 = c5sv;
            return;
        }
        throw new IllegalStateException("Please do not set a light tooltip theme for Night Mode");
    }

    public final C5SW A00() {
        if (this.A0G && !this.A0A) {
            throw new IllegalStateException("shouldDisableInteractionsOnTapOutsideToHide requires allowTapOutsideToHide to be true");
        }
        InterfaceC116795Qi interfaceC116795Qi = this.A03;
        if (interfaceC116795Qi != null) {
            interfaceC116795Qi.EaY(this.A02);
            return new C5SW(this);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01() {
        A06(EnumC58132lV.A03);
    }

    public final void A02() {
        A06(EnumC58132lV.A02);
    }

    public C5SU(Context context, ViewGroup viewGroup, C5ST c5st) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(viewGroup, 2);
        C14360o3.A0B(c5st, 3);
        this.A05 = EnumC58132lV.A04;
        this.A08 = C5SV.A07;
        this.A07 = C5SV.A06;
        this.A0B = true;
        this.A0F = true;
        this.A0A = true;
        this.A0C = true;
        this.A00 = 5000;
        this.A0H = context;
        this.A02 = viewGroup;
        this.A09 = c5st;
    }
}
