package X;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TyN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66025TyN {
    public View A00;
    public final Map A02 = new HashMap();
    public final ArrayList A01 = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj instanceof C66025TyN) {
            C66025TyN c66025TyN = (C66025TyN) obj;
            if (this.A00 == c66025TyN.A00 && this.A02.equals(c66025TyN.A02)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder A11 = AbstractC166997dE.A11(AnonymousClass001.A0g("TransitionValues@", Integer.toHexString(hashCode()), ":\n"));
        A11.append("    view = ");
        A11.append(this.A00);
        String A0R = AnonymousClass001.A0R(AbstractC166997dE.A0x("\n", A11), "    values:");
        Map map = this.A02;
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            String str = (String) A12.next();
            StringBuilder A112 = AbstractC166997dE.A11(A0R);
            A112.append("    ");
            A112.append(str);
            A112.append(": ");
            A112.append(map.get(str));
            A0R = AbstractC166997dE.A0x("\n", A112);
        }
        return A0R;
    }

    public C66025TyN(View view) {
        this.A00 = view;
    }

    @Deprecated
    public C66025TyN() {
    }
}
