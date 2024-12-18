package X;

import android.widget.CompoundButton;

/* renamed from: X.EjI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33114EjI extends AbstractC32533EUj {
    public CompoundButton A00;
    public String A01;
    public boolean A02;
    public final /* synthetic */ C33243Eld A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33114EjI(CompoundButton compoundButton, AbstractC10360h2 abstractC10360h2, C33243Eld c33243Eld, String str, boolean z) {
        super(abstractC10360h2);
        this.A03 = c33243Eld;
        this.A00 = compoundButton;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-573231392);
        C33243Eld c33243Eld = this.A03;
        C9GR.A0C(c33243Eld.A00, "reset_mute_failed");
        AbstractC35237FgW.A05(c33243Eld.A01, this.A00, this.A02);
        c33243Eld.A04.A02(c33243Eld.A05, this.A01, "toggle", false);
        C0f9.A0A(-1209624589, A03);
    }

    @Override // X.C1P1
    public final void onSuccess(Object obj) {
        int A03 = C0f9.A03(1519889353);
        CompoundButton compoundButton = this.A00;
        boolean z = !this.A02;
        C33243Eld c33243Eld = this.A03;
        AbstractC35237FgW.A05(c33243Eld.A01, compoundButton, z);
        c33243Eld.A04.A02(c33243Eld.A05, this.A01, "toggle", true);
        C0f9.A0A(-697694803, A03);
    }
}
