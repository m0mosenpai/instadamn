package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.C0e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27243C0e extends C17T implements InterfaceC84443pn {
    @Override // X.InterfaceC84443pn
    public final /* synthetic */ CUQ AKL() {
        return new CUQ(this);
    }

    @Override // X.InterfaceC84443pn
    public final ConfirmationStyle AqJ() {
        return (ConfirmationStyle) A0N(861360423, C29988DKa.A00);
    }

    @Override // X.InterfaceC84443pn
    public final ConfirmationTitleStyle AqL() {
        return (ConfirmationTitleStyle) A0N(-688405504, C29989DKb.A00);
    }

    @Override // X.InterfaceC84443pn
    public final List B7a() {
        return A08(285639531, HP3.class);
    }

    @Override // X.InterfaceC84443pn
    public final InterfaceC88383wt B7b() {
        return (InterfaceC88383wt) A05(1511899534, C27244C0f.class);
    }

    @Override // X.InterfaceC84443pn
    public final MediaOptionStyle C92() {
        return (MediaOptionStyle) A0N(859734282, C29990DKc.A00);
    }

    @Override // X.InterfaceC84443pn
    public final UndoStyle CCV() {
        return (UndoStyle) A0N(-2023154026, C29991DKd.A00);
    }

    @Override // X.InterfaceC84443pn
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, BFG.A00(this));
    }

    @Override // X.InterfaceC84443pn
    public final String AqH() {
        return A0i(1274199916);
    }

    @Override // X.InterfaceC84443pn
    public final String AqI() {
        return A0i(1274397251);
    }

    @Override // X.InterfaceC84443pn
    public final String AqK() {
        return A0i(861951438);
    }

    @Override // X.InterfaceC84443pn
    public final Boolean B1m() {
        return getOptionalBooleanValueByHashCode(95971477);
    }

    @Override // X.InterfaceC84443pn
    public final C84433pm EtX() {
        ArrayList arrayList;
        String A0i = A0i(1274199916);
        String A0i2 = A0i(1274397251);
        ConfirmationStyle AqJ = AqJ();
        String A0i3 = A0i(861951438);
        ConfirmationTitleStyle AqL = AqL();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(95971477);
        List B7a = B7a();
        C88373ws c88373ws = null;
        if (B7a != null) {
            arrayList = AbstractC167017dG.A0q(B7a);
            Iterator it = B7a.iterator();
            while (it.hasNext()) {
                AbstractC25236BEt.A0v(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        InterfaceC88383wt B7b = B7b();
        if (B7b != null) {
            c88373ws = B7b.Etg();
        }
        return new C84433pm(AqJ, AqL, c88373ws, C92(), CCV(), optionalBooleanValueByHashCode, A0i, A0i2, A0i3, A0Y(), arrayList);
    }

    @Override // X.InterfaceC84443pn
    public final String getTitle() {
        return A0Y();
    }
}
