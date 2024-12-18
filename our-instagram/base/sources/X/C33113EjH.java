package X;

import android.widget.CompoundButton;

/* renamed from: X.EjH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33113EjH extends AbstractC32533EUj {
    public final /* synthetic */ CompoundButton A00;
    public final /* synthetic */ C33242Elc A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33113EjH(CompoundButton compoundButton, AbstractC10360h2 abstractC10360h2, C33242Elc c33242Elc, String str, boolean z) {
        super(abstractC10360h2);
        this.A00 = compoundButton;
        this.A03 = z;
        this.A01 = c33242Elc;
        this.A02 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-756514088);
        C33242Elc c33242Elc = this.A01;
        C9GR.A01(c33242Elc.A00, "update_direct_only_notifications_setting_failed", 2131963183, 0);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = c33242Elc.A01;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this.A00, !this.A03);
        } else {
            AbstractC35237FgW.A05(c33242Elc.A02, this.A00, !this.A03);
        }
        c33242Elc.A05.A02(c33242Elc.A06, this.A02, "toggle", false);
        C0f9.A0A(-67615279, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-654237624);
        int A032 = C0f9.A03(-875940252);
        CompoundButton compoundButton = this.A00;
        boolean z = this.A03;
        C33242Elc c33242Elc = this.A01;
        AbstractC35237FgW.A05(c33242Elc.A02, compoundButton, z);
        c33242Elc.A05.A02(c33242Elc.A06, this.A02, "toggle", true);
        C0f9.A0A(1674234385, A032);
        C0f9.A0A(223039341, A03);
    }
}
