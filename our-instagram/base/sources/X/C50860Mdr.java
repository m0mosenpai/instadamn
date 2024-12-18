package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mdr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50860Mdr extends C193578hc {
    public final InterfaceC19390xP A00;
    public final InterfaceC06180Ui A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50860Mdr(Application application) {
        super(application);
        C14360o3.A0B(application, 1);
        AnonymousClass057 A0t = MSY.A0t();
        this.A01 = A0t;
        this.A00 = A0t;
    }

    public final void A0E(int i, boolean z, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new C52418NHo(i, z));
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A1E.add(new C52417NHn(((AbstractC115485Ki) list.get(i2)).BsL(), z));
            if (i2 != AbstractC31172DnG.A03(list, 1)) {
                A1E.add(new C52418NHo(10, z));
            }
        }
        A1E.add(new C52418NHo(i, z));
        C57171PZp.A03(A1E, this, AbstractC141776au.A00(this), 10);
    }
}
