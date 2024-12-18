package X;

import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HNS extends C17T implements InterfaceC87893vx {
    @Override // X.InterfaceC87893vx
    public final List Bx2() {
        return A08(-1077736281, ImmutablePandoAndroidLink.class);
    }

    @Override // X.InterfaceC87893vx
    public final Integer Azi() {
        return getOptionalIntValueByHashCode(55068821);
    }

    @Override // X.InterfaceC87893vx
    public final String BHV() {
        return A0i(-798083199);
    }

    @Override // X.InterfaceC87893vx
    public final Boolean Bv0() {
        return getOptionalBooleanValueByHashCode(-531159741);
    }

    @Override // X.InterfaceC87893vx
    public final String C87() {
        return A0i(1635238684);
    }

    @Override // X.InterfaceC87893vx
    public final Integer C8D() {
        return getOptionalIntValueByHashCode(2087420083);
    }

    @Override // X.InterfaceC87893vx
    public final C87883vw Erf() {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(55068821);
        String A0i = A0i(-798083199);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-531159741);
        List Bx2 = Bx2();
        if (Bx2 != null) {
            arrayList = AbstractC167017dG.A0q(Bx2);
            Iterator it = Bx2.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1V(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        return new C87883vw(optionalBooleanValueByHashCode, optionalIntValueByHashCode, getOptionalIntValueByHashCode(2087420083), A0i, A0i(1635238684), arrayList);
    }
}
