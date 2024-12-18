package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.cryptocontextfactory.gen.CryptoContextFactory;

/* renamed from: X.60G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60G {
    public static final C60G $redex_init_class = null;
    public final CryptoContextHolder A00;

    static {
        C09170dP.A0C("cryptocontextholder");
    }

    public C60G(Mailbox mailbox, long j) {
        CryptoContextHolder createContextHolder = CryptoContextFactory.CProxy.createContextHolder(j, mailbox);
        C14360o3.A07(createContextHolder);
        this.A00 = createContextHolder;
    }
}
