package X;

import android.content.Context;

/* renamed from: X.9Fz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207469Fz extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207469Fz(Object obj, String str, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                if (this.A03) {
                    C08U c08u = (C08U) this.A01;
                    String str = this.A02;
                    C14360o3.A0B(str, 0);
                    c08u.A05.A06(str);
                    break;
                }
                break;
            case 1:
                C7W9 c7w9 = (C7W9) this.A01;
                c7w9.A03.add(this.A02);
                c7w9.A02.markPointWithEditor(c7w9.A00, "agent_message_received").addPointData("is_welcome_message", this.A03).pointEditingCompleted();
                break;
            default:
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A05();
                String str2 = this.A02;
                if (str2 == null) {
                    str2 = ((Context) this.A01).getString(2131953328);
                    C14360o3.A07(str2);
                }
                c146106i8.A0D = str2;
                c146106i8.A0J = true;
                if (this.A03) {
                    c146106i8.A06();
                }
                C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                break;
        }
        return C0eB.A00;
    }
}
