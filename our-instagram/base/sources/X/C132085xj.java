package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;

/* renamed from: X.5xj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132085xj implements C6D2 {
    public static final C132085xj A00 = new C132085xj();

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        C14360o3.A0B(mailbox, 0);
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        return new MailboxFeature(new C137266Jf(mailbox));
    }
}
