package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;

/* renamed from: X.Lbf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48426Lbf implements C6D2 {
    public static final C48426Lbf A00 = new C48426Lbf();

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        C14360o3.A0B(mailbox, 0);
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        return new MailboxFeature(new C137266Jf(mailbox));
    }
}
