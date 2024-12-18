package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FBTagType;
import java.util.List;

/* loaded from: classes7.dex */
public final class HOs extends C17T implements InterfaceC43556JLq {
    @Override // X.InterfaceC43556JLq
    public final FBTagType B52() {
        return (FBTagType) A0N(-1357188894, C43231J9c.A00);
    }

    @Override // X.InterfaceC43556JLq
    public final JM7 B56() {
        return (JM7) A05(-1066914450, HR8.class);
    }

    @Override // X.InterfaceC43556JLq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39915Hn3.A00(this));
    }

    @Override // X.InterfaceC43556JLq
    public final Boolean AbJ() {
        return getOptionalBooleanValueByHashCode(-291603958);
    }

    @Override // X.InterfaceC43556JLq
    public final List Bec() {
        List list = (List) C17T.A00(this, new C57249PbX(747804969, 34, this), 747804969);
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    @Override // X.InterfaceC43556JLq
    public final String C4z() {
        return A0h(-881241120);
    }

    @Override // X.InterfaceC43556JLq
    public final H3F EtN() {
        H4F h4f;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-291603958);
        FBTagType B52 = B52();
        JM7 B56 = B56();
        if (B56 != null) {
            h4f = B56.Ewh();
        } else {
            h4f = null;
        }
        return new H3F(B52, h4f, optionalBooleanValueByHashCode, A0h(-881241120), Bec());
    }
}
