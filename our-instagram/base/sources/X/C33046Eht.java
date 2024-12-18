package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Eht, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33046Eht extends C17T implements InterfaceC101404gy {
    public InterfaceC87503vI A00;

    @Override // X.InterfaceC101404gy
    public final C101394gx F6v(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return F6u(new C1DY(c1dv, 6, false));
    }

    @Override // X.InterfaceC101404gy
    public final StoryPollColorType ApJ() {
        return (StoryPollColorType) A0N(94842723, C37085GVu.A00);
    }

    @Override // X.InterfaceC101404gy
    public final PollType BeO() {
        return (PollType) A0N(-143609926, C37086GVv.A00);
    }

    @Override // X.InterfaceC101404gy
    public final List Bic() {
        return A08(-1446979730, C68069V8z.class);
    }

    @Override // X.InterfaceC101404gy
    public final InterfaceC87503vI ByI() {
        InterfaceC87503vI interfaceC87503vI = this.A00;
        if (interfaceC87503vI == null) {
            return (InterfaceC87503vI) A05(-823445795, BU7.class);
        }
        return interfaceC87503vI;
    }

    @Override // X.InterfaceC101404gy
    public final List C5D() {
        return A08(-1543665910, C68069V8z.class);
    }

    @Override // X.InterfaceC101404gy
    public final C101394gx F6u(C1DY c1dy) {
        ArrayList arrayList;
        C87493vH c87493vH;
        StoryPollColorType ApJ = ApJ();
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-833811170);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-673660814);
        String A0e = A0e();
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1587105938);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(-1463231774);
        String A0j = A0j(-397914725);
        PollType BeO = BeO();
        List Bic = Bic();
        ArrayList arrayList2 = null;
        if (Bic != null) {
            arrayList = AbstractC167007dF.A0i(Bic);
            Iterator it = Bic.iterator();
            while (it.hasNext()) {
                AbstractC31180DnO.A1V(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        String A0i = A0i(-1165870106);
        InterfaceC87503vI ByI = ByI();
        if (ByI != null) {
            c87493vH = ByI.Ezd(c1dy);
        } else {
            c87493vH = null;
        }
        List C5D = C5D();
        if (C5D != null) {
            arrayList2 = AbstractC167007dF.A0i(C5D);
            Iterator it2 = C5D.iterator();
            while (it2.hasNext()) {
                AbstractC31180DnO.A1V(arrayList2, it2);
            }
        }
        return new C101394gx(BeO, c87493vH, ApJ, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, getOptionalBooleanValueByHashCode(1093411206), getOptionalBooleanValueByHashCode(1340903147), optionalIntValueByHashCode, getOptionalIntValueByHashCode(-390216178), getOptionalIntValueByHashCode(1124422903), A0e, A0j, A0i, arrayList, arrayList2);
    }

    @Override // X.InterfaceC101404gy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC27697CJq.A00(this));
    }

    @Override // X.InterfaceC101404gy
    public final Integer B3B() {
        return getOptionalIntValueByHashCode(-833811170);
    }

    @Override // X.InterfaceC101404gy
    public final Boolean B6X() {
        return getOptionalBooleanValueByHashCode(-673660814);
    }

    @Override // X.InterfaceC101404gy
    public final Integer CA0() {
        return getOptionalIntValueByHashCode(-390216178);
    }

    @Override // X.InterfaceC101404gy
    public final Boolean CG3() {
        return getOptionalBooleanValueByHashCode(1093411206);
    }

    @Override // X.InterfaceC101404gy
    public final Boolean CGC() {
        return getOptionalBooleanValueByHashCode(1340903147);
    }

    @Override // X.InterfaceC101404gy
    public final Integer CGO() {
        return getOptionalIntValueByHashCode(1124422903);
    }

    @Override // X.InterfaceC101404gy
    public final Boolean CYz() {
        return getOptionalBooleanValueByHashCode(-1587105938);
    }

    @Override // X.InterfaceC101404gy
    public final Boolean Ccy() {
        return getOptionalBooleanValueByHashCode(-1463231774);
    }

    @Override // X.InterfaceC101404gy
    public final InterfaceC101404gy EC4(C1DY c1dy) {
        InterfaceC87503vI ByI = ByI();
        if (ByI != null) {
            ByI.E9t(c1dy);
        } else {
            ByI = null;
        }
        this.A00 = ByI;
        return this;
    }

    @Override // X.InterfaceC101404gy
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC101404gy
    public final String getPollId() {
        return A0j(-397914725);
    }

    @Override // X.InterfaceC101404gy
    public final String getQuestion() {
        return A0i(-1165870106);
    }
}
