package X;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* loaded from: classes10.dex */
public final class TYX extends ThreadLocal {
    public final /* synthetic */ T96 A00;

    public TYX(final T96 this$0) {
        this.A00 = this$0;
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            C62890SVv c62890SVv = C62890SVv.A05;
            T96 t96 = this.A00;
            EnumC61068Rei enumC61068Rei = T96.A04;
            Mac mac = (Mac) InterfaceC65621ToC.A00(c62890SVv, t96.A00);
            mac.init(t96.A01);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
