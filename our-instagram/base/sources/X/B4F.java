package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* loaded from: classes4.dex */
public final class B4F implements InterfaceC19960yQ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1828989k A02;
    public final /* synthetic */ boolean A03;

    public B4F(Context context, UserSession userSession, C1828989k c1828989k, boolean z) {
        this.A03 = z;
        this.A02 = c1828989k;
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C2GS c2gs;
        EnumC1829089l enumC1829089l;
        AbstractC193598he abstractC193598he = (AbstractC193598he) obj;
        int i = abstractC193598he.A00;
        if (i == 3) {
            boolean z = this.A03;
            C1828989k c1828989k = this.A02;
            File file = (File) abstractC193598he.A00();
            if (z) {
                c1828989k.A02(this.A00, this.A01, file);
                return C0eB.A00;
            }
            c1828989k.A01 = file;
            c2gs = c1828989k.A06;
            enumC1829089l = EnumC1829089l.A04;
        } else {
            C1828989k c1828989k2 = this.A02;
            c1828989k2.A01 = null;
            c2gs = c1828989k2.A06;
            if (i != 0) {
                if (i != 1) {
                    enumC1829089l = EnumC1829089l.A03;
                } else {
                    enumC1829089l = EnumC1829089l.A02;
                }
            } else {
                enumC1829089l = EnumC1829089l.A05;
            }
        }
        c2gs.A0B(enumC1829089l);
        return C0eB.A00;
    }
}
