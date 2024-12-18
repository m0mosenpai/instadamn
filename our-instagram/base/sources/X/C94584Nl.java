package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: X.4Nl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94584Nl implements InterfaceC94594Nm {
    public final C206409Bx A00;

    public C94584Nl(C206409Bx c206409Bx) {
        C14360o3.A0B(c206409Bx, 1);
        this.A00 = c206409Bx;
    }

    @Override // X.InterfaceC94594Nm
    public final ImmutableList E6L() {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) this.A00.A00);
        C14360o3.A07(copyOf);
        return copyOf;
    }
}
