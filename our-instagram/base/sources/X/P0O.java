package X;

import android.view.View;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

/* loaded from: classes9.dex */
public abstract class P0O implements InterfaceC58169PqZ {
    public PublishScreenCategoryType A00;
    public C50821Mcw A01;
    public final AbstractC59962oe A02;
    public final InterfaceC58310Pt2 A03;
    public final C81X A04 = C81X.A2i;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    public final C50821Mcw A04() {
        C50821Mcw c50821Mcw = this.A01;
        if (c50821Mcw != null) {
            return c50821Mcw;
        }
        C14360o3.A0F("row");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        this.A01 = OOy.A00(this.A02.requireContext(), ViewOnClickListenerC55466OkL.A01(this, 24), Integer.valueOf(OOu.A00(this.A00)), OOu.A01(this.A00));
        return A04();
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        if (this instanceof NJT) {
            return ((NJT) this).A00;
        }
        return this.A04;
    }

    public P0O(AbstractC59962oe abstractC59962oe, InterfaceC58310Pt2 interfaceC58310Pt2, PublishScreenCategoryType publishScreenCategoryType) {
        this.A02 = abstractC59962oe;
        this.A00 = publishScreenCategoryType;
        this.A03 = interfaceC58310Pt2;
    }
}
