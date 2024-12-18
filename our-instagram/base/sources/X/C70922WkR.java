package X;

import com.instagram.giphy.webp.IgWebPAnim;
import java.io.File;

/* renamed from: X.WkR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70922WkR implements AnonymousClass752 {
    public final IgWebPAnim A00;
    public final Integer A01;

    public C70922WkR(String str, Integer num) {
        C14360o3.A0B(str, 1);
        this.A01 = num;
        AnonymousClass754 anonymousClass754 = IgWebPAnim.Companion;
        this.A00 = new IgWebPAnim(new File(str));
    }

    @Override // X.AnonymousClass752
    public final XEC AM2() {
        try {
            return new C70921WkQ(this.A00.createDecoder(), this.A01);
        } catch (RuntimeException unused) {
            throw new Exception(AbstractC111324zv.A00(3614));
        }
    }
}
