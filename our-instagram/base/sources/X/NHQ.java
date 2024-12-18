package X;

import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NHQ extends AbstractC51119MiO {
    public final InterfaceC16660sJ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NHQ(InterfaceC16660sJ interfaceC16660sJ) {
        super(interfaceC16660sJ);
        C14360o3.A0B(interfaceC16660sJ, 1);
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new NHV(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.layout_bottom_sheet_audio_filter_item, false), this);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        AbstractC51229MkE abstractC51229MkE = (AbstractC51229MkE) c3oo;
        C14360o3.A0B(abstractC51229MkE, 0);
        abstractC51229MkE.A00((InterfaceC185318Jx) super.A00.get(i), this.A00);
    }
}
