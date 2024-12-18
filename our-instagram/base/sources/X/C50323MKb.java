package X;

import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.MKb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50323MKb extends C0YY implements InterfaceC16660sJ {
    public static final C50323MKb A00 = new C50323MKb();

    public C50323MKb() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC1351869s abstractC1351869s;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        boolean z = false;
        if (mailboxNullable != null && (abstractC1351869s = (AbstractC1351869s) mailboxNullable.value) != null && AbstractC43592JPx.A02(abstractC1351869s) > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
