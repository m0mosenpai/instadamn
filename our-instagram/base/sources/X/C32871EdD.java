package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.EdD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32871EdD extends C7S1 {
    public String A00;
    public String A01;
    public String A02;
    public final C7E7 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32871EdD(C57012jc c57012jc, C7E7 c7e7) {
        super(c57012jc);
        C14360o3.A0B(c7e7, 2);
        this.A03 = c7e7;
    }

    @Override // X.C7S1
    public final void A05(C2EY c2ey, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
    }

    @Override // X.C7S1
    public final void A01() {
        this.A03.DDK(this.A00, this.A02, this.A01);
    }

    @Override // X.C7S1
    public final /* bridge */ /* synthetic */ boolean A06(C7AS c7as) {
        String str;
        String str2;
        C32869EdB c32869EdB = (C32869EdB) c7as;
        C14360o3.A0B(c32869EdB, 0);
        String str3 = this.A00;
        boolean z = true;
        if (str3 == null || (str2 = this.A01) == null || !str3.equals(c32869EdB.A00) || !str2.equals(c32869EdB.A01)) {
            z = false;
        }
        this.A00 = c32869EdB.A00;
        this.A01 = c32869EdB.A01;
        MessageIdentifier messageIdentifier = c32869EdB.A0A;
        if (messageIdentifier != null) {
            str = messageIdentifier.A01;
        } else {
            str = null;
        }
        this.A02 = str;
        return z;
    }
}
