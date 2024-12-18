package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EhS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33024EhS extends C17T implements InterfaceC115885Me {
    public User A00;
    public List A01;

    private final List A01(C1DY c1dy) {
        ImmutableList A08 = A08(106855379, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) it.next();
                C38801rC c38801rC = C38321qM.A0h;
                C14360o3.A0A(immutablePandoMediaDict);
                A0q.add(C38801rC.A00(c1dy, immutablePandoMediaDict));
            }
            return A0q;
        }
        return null;
    }

    @Override // X.InterfaceC115885Me
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33719Ev7.A00(this));
    }

    @Override // X.InterfaceC115885Me
    public final List BfB() {
        return this.A01;
    }

    @Override // X.InterfaceC115885Me
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC115885Me
    public final InterfaceC115885Me E9T(C1DY c1dy) {
        this.A01 = A01(c1dy);
        this.A00 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // X.InterfaceC115885Me
    public final C115875Md ExT(C1DY c1dy) {
        ArrayList arrayList;
        List A01 = A01(c1dy);
        User user = null;
        if (A01 != null) {
            arrayList = AbstractC167017dG.A0q(A01);
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                arrayList.add(c1dy.A00(AbstractC31172DnG.A0i(it)));
            }
        } else {
            arrayList = null;
        }
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A07(ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A012 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
            if (A012 != null) {
                user = (User) c1dy.A00(A012);
            }
        }
        return new C115875Md(user, arrayList);
    }
}
