package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.feed.media.ImmutablePandoMediaDict;

/* loaded from: classes7.dex */
public final class HSJ extends C17T implements JJG {
    @Override // X.JJG
    public final C38748H4o Eye(C1DY c1dy) {
        C37771pE c37771pE;
        InterfaceC37791pH interfaceC37791pH = (InterfaceC37791pH) A05(-681210700, HWN.class);
        C38321qM c38321qM = null;
        if (interfaceC37791pH != null) {
            c37771pE = interfaceC37791pH.F5R(c1dy);
        } else {
            c37771pE = null;
        }
        ProfileGridItemTypeEnum profileGridItemTypeEnum = (ProfileGridItemTypeEnum) A0N(-2141142810, C43260JAf.A00);
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(103772132, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            C38801rC c38801rC = C38321qM.A0h;
            C38321qM A00 = C38801rC.A00(c1dy, immutablePandoMediaDict);
            if (A00 != null) {
                c38321qM = (C38321qM) c1dy.A00(A00);
            }
        }
        return new C38748H4o(profileGridItemTypeEnum, c38321qM, c37771pE);
    }
}
