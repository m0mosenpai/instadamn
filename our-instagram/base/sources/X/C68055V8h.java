package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V8h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68055V8h extends C17T implements InterfaceC109094vY {
    @Override // X.InterfaceC109094vY
    public final C914346k AfM() {
        return null;
    }

    @Override // X.InterfaceC109094vY
    public final C914346k AgU() {
        return null;
    }

    @Override // X.InterfaceC109094vY
    public final C914346k BaW() {
        return null;
    }

    @Override // X.InterfaceC109094vY
    public final /* synthetic */ C69728VuN AKQ() {
        return new C69728VuN(this);
    }

    @Override // X.InterfaceC109094vY
    public final InterfaceC109864xE AfL() {
        return (InterfaceC109864xE) A05(-1396342996, V8T.class);
    }

    @Override // X.InterfaceC109094vY
    public final List AjH() {
        return A08(241352577, V8T.class);
    }

    @Override // X.InterfaceC109094vY
    public final InterfaceC109884xG BEg() {
        return (InterfaceC109884xG) A05(3226745, C68054V8g.class);
    }

    @Override // X.InterfaceC109094vY
    public final C109084vX EwP() {
        C109854xD c109854xD;
        ArrayList arrayList;
        InterfaceC109864xE AfL = AfL();
        C109874xF c109874xF = null;
        if (AfL != null) {
            c109854xD = AfL.ErT();
        } else {
            c109854xD = null;
        }
        List AjH = AjH();
        if (AjH != null) {
            arrayList = AbstractC167017dG.A0q(AjH);
            Iterator it = AjH.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC109864xE) it.next()).ErT());
            }
        } else {
            arrayList = null;
        }
        String A0T = A0T();
        InterfaceC109884xG BEg = BEg();
        if (BEg != null) {
            c109874xF = BEg.Evd();
        }
        return new C109084vX(c109854xD, c109874xF, null, null, null, getOptionalIntValueByHashCode(-710850876), getOptionalIntValueByHashCode(1841190309), getOptionalIntValueByHashCode(-333432327), A0T, A0i(285947337), A0i(1661853540), A0i(232273949), A0Y(), arrayList);
    }

    @Override // X.InterfaceC109094vY
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC69869Vwu.A01(this), this);
    }

    @Override // X.InterfaceC109094vY
    public final Integer BUD() {
        return getOptionalIntValueByHashCode(-710850876);
    }

    @Override // X.InterfaceC109094vY
    public final Integer BaV() {
        return getOptionalIntValueByHashCode(1841190309);
    }

    @Override // X.InterfaceC109094vY
    public final Integer BaY() {
        return getOptionalIntValueByHashCode(-333432327);
    }

    @Override // X.InterfaceC109094vY
    public final String getDescription() {
        return A0T();
    }

    @Override // X.InterfaceC109094vY
    public final String getOverlayType() {
        return A0i(285947337);
    }

    @Override // X.InterfaceC109094vY
    public final String getSessionId() {
        return A0i(1661853540);
    }

    @Override // X.InterfaceC109094vY
    public final String getSubCategory() {
        return A0i(232273949);
    }

    @Override // X.InterfaceC109094vY
    public final String getTitle() {
        return A0Y();
    }
}
