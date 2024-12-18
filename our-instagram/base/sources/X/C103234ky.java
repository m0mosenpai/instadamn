package X;

import android.os.Parcelable;
import com.instagram.user.model.User;

/* renamed from: X.4ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103234ky {
    /* JADX WARN: Type inference failed for: r3v3, types: [X.FEm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, X.Var] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.55N, java.lang.Object] */
    public final Object A00(InterfaceC102764kD interfaceC102764kD, String str, boolean z) {
        C14360o3.A0B(str, 0);
        Object obj = null;
        obj = null;
        obj = null;
        obj = null;
        obj = null;
        if (!z) {
            int hashCode = str.hashCode();
            if (hashCode != -2035803845) {
                if (hashCode != -412315647) {
                    if (hashCode == 1306783860 && str.equals("ig.elements.alien_object.media")) {
                        ?? obj2 = new Object();
                        interfaceC102764kD.Awa();
                        C38801rC c38801rC = C38321qM.A0h;
                        C16L c16l = (C16L) interfaceC102764kD.Awa();
                        if (c16l != null) {
                            obj2.A00 = c38801rC.A0C(c16l, true, false);
                            obj = obj2;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else if (str.equals("ig.elements.alien_object.explore.hashtag")) {
                    Object Awa = interfaceC102764kD.Awa();
                    ?? obj3 = new Object();
                    obj3.A00 = AbstractC109614wn.parseFromJson((C16L) Awa);
                    return obj3;
                }
            } else if (str.equals("ig.elements.alien_object.user")) {
                Object Awa2 = interfaceC102764kD.Awa();
                Parcelable.Creator creator = User.CREATOR;
                C16L c16l2 = (C16L) Awa2;
                C14360o3.A0B(c16l2, 0);
                User A00 = AbstractC38851rI.A00(c16l2, false);
                if (A00 != null) {
                    ?? obj4 = new Object();
                    obj4.A00 = A00;
                    return obj4;
                }
                AbstractC25241Le.A02("IgBloksUserAlienObject", "DelegateParser in tokenizer for User was null.");
                return new Object();
            }
        }
        return obj;
    }
}
