package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;

/* renamed from: X.Lbh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48428Lbh implements C6D2 {
    public static final C48428Lbh A00 = new C48428Lbh();

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        C14360o3.A0B(mailbox, 0);
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        return new MailboxFeature(new C137266Jf(mailbox));
    }
}
