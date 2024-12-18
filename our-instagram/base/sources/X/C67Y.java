package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.67Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67Y extends C17T implements C67Z {
    @Override // X.C67Z
    public final H3R Ety(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return Etx(new C1DY(c1dv, 6, false));
    }

    @Override // X.C67Z
    public final List B5S() {
        return null;
    }

    @Override // X.C67Z
    public final User BAR() {
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'group' field.");
    }

    @Override // X.C67Z
    public final H3R Etx(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-1284365887, ImmutablePandoUserDict.class);
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
        ImmutablePandoUserDict immutablePandoUserDict2 = (ImmutablePandoUserDict) A04(98629247, ImmutablePandoUserDict.class);
        Parcelable.Creator creator2 = User.CREATOR;
        return new H3R((User) c1dy.A00(AbstractC38851rI.A01(c1dy, immutablePandoUserDict2)), getOptionalIntValueByHashCode(665320141), arrayList);
    }

    @Override // X.C67Z
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC39946Hnb.A00(this), this);
    }

    @Override // X.C67Z
    public final Integer BY5() {
        return getOptionalIntValueByHashCode(665320141);
    }
}
