package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.FsA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35834FsA implements InterfaceC48192Ji {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C36286Fzd A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ boolean A06;

    public C35834FsA(Context context, C36286Fzd c36286Fzd, String str, String str2, Map map, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A00 = context;
        this.A01 = c36286Fzd;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = map;
        this.A06 = z;
        this.A05 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS optionalTreeField;
        C2JS A0k = AbstractC25225BEi.A0k(anonymousClass436);
        if (A0k != null && (optionalTreeField = A0k.getOptionalTreeField(0, AbstractC58317Pt9.A00(144), C59377Qda.class, -1101492816)) != null) {
            String A00 = AbstractC58317Pt9.A00(76);
            if (optionalTreeField.hasFieldValue(A00)) {
                this.A01.A01 = AbstractC31174DnI.A0o(optionalTreeField, A00, 0);
            }
            this.A05.invoke();
            return;
        }
        AbstractC34775FTy.A00(this.A00, this.A01.A00, this.A02, this.A03, this.A04, this.A06);
    }
}
