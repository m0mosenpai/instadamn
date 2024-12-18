package X;

import android.widget.PopupWindow;

/* renamed from: X.Ajm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23952Ajm implements InterfaceC199918sv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8Q6 A01;
    public final /* synthetic */ EnumC193878i8 A02;

    public C23952Ajm(C8Q6 c8q6, EnumC193878i8 enumC193878i8, int i) {
        this.A01 = c8q6;
        this.A02 = enumC193878i8;
        this.A00 = i;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        C81W c81w;
        C8Q6 c8q6 = this.A01;
        ((PopupWindow) c8q6.A13.getValue()).dismiss();
        C8DN c8dn = c8q6.A0s;
        EnumC193878i8 enumC193878i8 = this.A02;
        c8dn.A0F(enumC193878i8, C05F.A0N);
        AB4 ab4 = (AB4) c8q6.A15.getValue();
        int i = this.A00;
        C22C A01 = AnonymousClass229.A01(ab4.A00);
        int ordinal = enumC193878i8.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    c81w = C81W.A0H;
                } else {
                    throw B4Z.A00();
                }
            } else {
                c81w = C81W.A0m;
            }
        } else {
            c81w = C81W.A0A;
        }
        A01.A0F.A0S(null, null, c81w, AbstractC166987dD.A1J(EnumC203578zI.POST_CAPTURE_UTILITY_DROPDOWN), i, 0);
    }
}
