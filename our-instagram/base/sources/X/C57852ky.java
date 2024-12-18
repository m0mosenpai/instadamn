package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57852ky extends AbstractC57542kT {
    public final C25301Lk A00;
    public final UserSession A01;

    public final void A0L(C54785OJb c54785OJb) {
        C14360o3.A0B(c54785OJb, 0);
        String str = c54785OJb.A04;
        if (str != null) {
            if (c54785OJb.equals(A05(str))) {
                String str2 = c54785OJb.A04;
                if (str2 != null) {
                    A0F(str2);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("mediaId");
        throw C00O.createAndThrow();
    }

    public final boolean A0M(C38321qM c38321qM) {
        EnumC77173d3 A1c;
        if (super.A00 == null) {
            A0B();
        }
        String id = c38321qM.getId();
        if (id != null) {
            if (A0J(id)) {
                String id2 = c38321qM.getId();
                if (id2 != null) {
                    Object A05 = A05(id2);
                    if (A05 != null) {
                        String str = ((C54785OJb) A05).A01;
                        if (str != null) {
                            if (str.equals("send_story_like")) {
                                A1c = EnumC77173d3.A02;
                            } else {
                                A1c = EnumC77173d3.A03;
                            }
                        } else {
                            C14360o3.A0F("action");
                            throw C00O.createAndThrow();
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                A1c = c38321qM.A1c();
            }
            if (A1c != EnumC77173d3.A02) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C57852ky(C25301Lk c25301Lk, UserSession userSession) {
        super(userSession);
        this.A01 = userSession;
        this.A00 = c25301Lk;
    }
}
