package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.common.session.UserSession;

/* renamed from: X.6yS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C155396yS implements InterfaceC65952yX {
    public final UserSession A00;

    public C155396yS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65952yX
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public boolean EjD(IM8 im8) {
        C38321qM c38321qM;
        C14360o3.A0B(im8, 0);
        if (im8.A01 != ProfileGridItemTypeEnum.A05 || (c38321qM = im8.A02) == null || (c38321qM.A00 == 0 && !C3YS.A00(this.A00).A05(c38321qM))) {
            return true;
        }
        return false;
    }
}
