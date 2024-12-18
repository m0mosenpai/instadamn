package X;

import com.facebook.common.locale.LocaleMember;
import java.util.Locale;

/* renamed from: X.Uy5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67780Uy5 extends AbstractC200978ue {
    public final int A00;
    public final Object A01;

    public C67780Uy5(W2G w2g, int i) {
        this.A00 = i;
        this.A01 = w2g;
    }

    @Override // X.AbstractC200978ue
    public final /* bridge */ /* synthetic */ Object A01(Object obj) {
        if (this.A00 != 0) {
            return new LocaleMember((Locale) ((W2G) this.A01).A02.A00.A02(obj));
        }
        return new Locale("", (String) obj);
    }
}
