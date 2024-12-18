package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GpY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38105GpY extends AbstractC66412zI {
    public final JPT A00 = new C38106GpZ(this);
    public final C38093GpM A01;
    public final AbstractC42425IqS A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C128045qY c128045qY = (C128045qY) interfaceC66482zP;
        C38435GvI c38435GvI = (C38435GvI) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c128045qY, c38435GvI);
        C132825z5 c132825z5 = c128045qY.A01;
        C38321qM A00 = I0C.A00(c132825z5.A00);
        if (A00 != null) {
            this.A01.A00(this.A00, c128045qY, A00, c38435GvI.A01, A1R);
        } else {
            C38093GpM c38093GpM = this.A01;
            IgImageButton igImageButton = c38435GvI.A01;
            JPT jpt = this.A00;
            AbstractC167007dF.A1D(igImageButton, A1R ? 1 : 0, jpt);
            C5qT BAM = c38093GpM.A00.BAM(c128045qY);
            c38093GpM.A01.EE0(igImageButton, BAM, c128045qY.A02, c128045qY, false);
            igImageButton.setPlaceHolderColor(-16777216);
            igImageButton.A0B();
            ViewOnClickListenerC42029Ijy.A00(igImageButton, jpt, BAM, c128045qY, 8);
        }
        c38435GvI.A00.setText(c132825z5.A08);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C38435GvI(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_grid_item_guides, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C128045qY.class;
    }

    public C38105GpY(C38093GpM c38093GpM, AbstractC42425IqS abstractC42425IqS) {
        this.A01 = c38093GpM;
        this.A02 = abstractC42425IqS;
    }
}
