package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HSz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39260HSz extends C17T implements InterfaceC38651qw {
    public List A00;

    @Override // X.InterfaceC38651qw
    public final List C0w() {
        return this.A00;
    }

    @Override // X.InterfaceC38651qw
    public final InterfaceC38651qw E9s(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-1884266413, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.InterfaceC38651qw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40251HtH.A00(this));
    }

    @Override // X.InterfaceC38651qw
    public final Integer BXo() {
        return getOptionalIntValueByHashCode(-1307793340);
    }

    @Override // X.InterfaceC38651qw
    public final Long By8() {
        return A0L(1197591881);
    }

    @Override // X.InterfaceC38651qw
    public final String By9() {
        return A0i(904444871);
    }

    @Override // X.InterfaceC38651qw
    public final String ByA() {
        return A0i(2080666358);
    }

    @Override // X.InterfaceC38651qw
    public final String ByB() {
        return A0i(-168585866);
    }

    @Override // X.InterfaceC38651qw
    public final Integer C9i() {
        return getOptionalIntValueByHashCode(-1115199084);
    }

    @Override // X.InterfaceC38651qw
    public final Integer C9s() {
        return getOptionalIntValueByHashCode(12722959);
    }

    @Override // X.InterfaceC38651qw
    public final Integer C9t() {
        return getOptionalIntValueByHashCode(1771893180);
    }

    @Override // X.InterfaceC38651qw
    public final C38641qv Ezb(C1DY c1dy) {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1307793340);
        Long A0L = A0L(1197591881);
        String A0i = A0i(904444871);
        String A0i2 = A0i(2080666358);
        String A0i3 = A0i(-168585866);
        ImmutableList A08 = A08(-1884266413, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, A0q, it);
            }
            if (A0q != null) {
                arrayList = AbstractC167017dG.A0q(A0q);
                Iterator it2 = A0q.iterator();
                while (it2.hasNext()) {
                    AbstractC37304Gc5.A1H(c1dy, arrayList, it2);
                }
                return new C38641qv(optionalIntValueByHashCode, getOptionalIntValueByHashCode(-1115199084), getOptionalIntValueByHashCode(12722959), getOptionalIntValueByHashCode(1771893180), A0L, A0i, A0i2, A0i3, arrayList);
            }
        }
        arrayList = null;
        return new C38641qv(optionalIntValueByHashCode, getOptionalIntValueByHashCode(-1115199084), getOptionalIntValueByHashCode(12722959), getOptionalIntValueByHashCode(1771893180), A0L, A0i, A0i2, A0i3, arrayList);
    }
}
