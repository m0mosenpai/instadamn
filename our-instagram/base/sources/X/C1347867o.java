package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.67o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1347867o extends C17T implements InterfaceC1347967p {
    @Override // X.InterfaceC1347967p
    public final List B49() {
        return null;
    }

    @Override // X.InterfaceC1347967p
    public final C1348267y Eyk(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(549161688, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A08, 10));
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
                Parcelable.Creator creator = User.CREATOR;
                C14360o3.A0A(immutablePandoUserDict);
                arrayList2.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
            }
            arrayList = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(c1dy.A00((User) it2.next()));
            }
        } else {
            arrayList = null;
        }
        return new C1348267y(getOptionalBooleanValueByHashCode(2122613350), getOptionalIntValueByHashCode(1567799751), A0h(-798298666), A0h(1634460456), arrayList);
    }

    @Override // X.InterfaceC1347967p
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC40192HsC.A00(this), this);
    }

    @Override // X.InterfaceC1347967p
    public final Integer BXh() {
        return getOptionalIntValueByHashCode(1567799751);
    }

    @Override // X.InterfaceC1347967p
    public final String Big() {
        return A0h(-798298666);
    }

    @Override // X.InterfaceC1347967p
    public final String Bim() {
        return A0h(1634460456);
    }

    @Override // X.InterfaceC1347967p
    public final Boolean Bvl() {
        return getOptionalBooleanValueByHashCode(2122613350);
    }
}
