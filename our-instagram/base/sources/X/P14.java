package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes9.dex */
public final class P14 implements InterfaceC58169PqZ {
    public IgTextView A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final Integer A03;
    public final boolean A04;

    public P14(AbstractC59962oe abstractC59962oe, Integer num, boolean z) {
        C14360o3.A0B(abstractC59962oe, 1);
        this.A02 = abstractC59962oe;
        this.A03 = num;
        this.A04 = z;
        this.A01 = C81X.A2i;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    public final void A00(Integer num) {
        if (num != null) {
            IgTextView igTextView = this.A00;
            if (igTextView == null) {
                C14360o3.A0F("titleView");
                throw C00O.createAndThrow();
            }
            igTextView.setText(num.intValue());
        }
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        View A0C = AbstractC25227BEk.A0C(AbstractC31175DnJ.A06(this.A02), R.layout.layout_share_sheet_row_item_title);
        C14360o3.A0C(A0C, AbstractC43591JPw.A00(3));
        this.A00 = (IgTextView) A0C;
        A00(this.A03);
        if (this.A04) {
            IgTextView igTextView = this.A00;
            if (igTextView != null) {
                igTextView.setTextAppearance(R.style.igds_emphasized_body_1);
            }
            C14360o3.A0F("titleView");
            throw C00O.createAndThrow();
        }
        IgTextView igTextView2 = this.A00;
        if (igTextView2 != null) {
            return igTextView2;
        }
        C14360o3.A0F("titleView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }
}
