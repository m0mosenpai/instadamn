package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;

/* renamed from: X.5Sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117325Sr extends AbstractC17040sw implements Collection, InterfaceC15590qF {
    public final /* synthetic */ C117315Sq A00;

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    public C117325Sr(C117315Sq c117315Sq) {
        this.A00 = c117315Sq;
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.A01.groupCount() + 1;
    }

    public final C117335Ss A09(int i) {
        Matcher matcher = this.A00.A01;
        C17u A0C = C17s.A0C(matcher.start(i), matcher.end(i));
        if (A0C.A00 >= 0) {
            String group = matcher.group(i);
            C14360o3.A07(group);
            return new C117335Ss(group, A0C);
        }
        return null;
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null && !(obj instanceof C117335Ss)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C225417q(AbstractC224517h.A09(new DHH(this, 5), AbstractC001800i.A0o(AbstractC16960so.A1S(this))));
    }
}
