package X;

import android.os.Parcelable;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ehg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33034Ehg extends C17T implements InterfaceC37277GbU {
    public List A00;

    @Override // X.InterfaceC37277GbU
    public final List B45() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'facepile' field.");
    }

    @Override // X.InterfaceC37277GbU
    public final InterfaceC37277GbU E9r(C1DY c1dy) {
        List<ImmutablePandoUserDict> A0o = A0o(497541391, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        for (ImmutablePandoUserDict immutablePandoUserDict : A0o) {
            Parcelable.Creator creator = User.CREATOR;
            A0q.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.InterfaceC37277GbU
    public final String BAS() {
        return A0h(98629247);
    }

    @Override // X.InterfaceC37277GbU
    public final Boolean BwQ() {
        return getOptionalBooleanValueByHashCode(-1401042162);
    }

    @Override // X.InterfaceC37277GbU
    public final String C3e() {
        return A0i(-353121165);
    }

    @Override // X.InterfaceC37277GbU
    public final Integer CDo() {
        return getOptionalIntValueByHashCode(1919900571);
    }

    @Override // X.InterfaceC37277GbU
    public final String CIp() {
        return A0h(951530927);
    }

    @Override // X.InterfaceC37277GbU
    public final String getCategory() {
        return A0i(50511102);
    }

    @Override // X.InterfaceC37277GbU
    public final String getSubtitle() {
        return A0U();
    }

    @Override // X.InterfaceC37277GbU
    public final String getTitle() {
        return A0S();
    }
}
