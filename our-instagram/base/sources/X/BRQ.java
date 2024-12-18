package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BRQ extends AbstractC51572Yf {
    public final C75113Zb A00;
    public final BO4 A01;
    public final InterfaceC31067Dl9 A02;
    public final long A03;
    public final long A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        Float A0m = AbstractC25227BEk.A0m();
        C2XI A00 = AbstractC80383iT.A00(c76223bS, A0m);
        C2XI A002 = AbstractC80383iT.A00(c76223bS, A0m);
        C2XI A003 = AbstractC80383iT.A00(c76223bS, A0m);
        C29893DGh.A00(c76223bS, AbstractC77183d4.A00(c76223bS, new D8P(2, A00, A002, A003), new Object[0]), this, AbstractC25230BEn.A1a(), 39);
        Drawable A0N = AbstractC25228BEl.A0N(c76223bS, R.drawable.instagram_save_filled_44);
        AbstractC25233BEq.A10(A0N, c76223bS, AbstractC53242c7.A0H(c76223bS.A05.A0C, R.attr.igds_color_primary_button_on_media));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, A0N);
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, A0N);
        stateListDrawable.addState(new int[0], AbstractC77623dm.A0E(c76223bS, R.drawable.instagram_save_outline_44));
        C75933ay c75933ay = C51722Yv.A02;
        long j = this.A03;
        Integer num = C05F.A00;
        C51722Yv A004 = C9CU.A00(AbstractC25234BEr.A0L(null, num, 0, j), C05F.A0A, 0, this.A04);
        Integer num2 = C05F.A1F;
        return new BNU(stateListDrawable, ImageView.ScaleType.FIT_CENTER, AbstractC25230BEn.A0e(C9CV.A00(C9CV.A00(C9CV.A00(AbstractC25233BEq.A0W(AbstractC25234BEr.A0H(AbstractC25231BEo.A0X(A003, AbstractC25234BEr.A0A(A002, A004, new C9CV(A00, num2)), num), AbstractC25225BEi.A0o(C05F.A06, Boolean.valueOf(this.A01.A02), 4), num), c76223bS, 2131972699), C05F.A08, "save_button", 4), num2, DRY.A00(this, c76223bS, 14), 4), C05F.A03, DRP.A00(this, 40), 4), C05F.A0Y, DRP.A00(this, 41), null), false);
    }

    public BRQ(C75113Zb c75113Zb, BO4 bo4, InterfaceC31067Dl9 interfaceC31067Dl9, long j, long j2) {
        AbstractC167017dG.A1R(bo4, interfaceC31067Dl9);
        this.A00 = c75113Zb;
        this.A01 = bo4;
        this.A02 = interfaceC31067Dl9;
        this.A03 = j;
        this.A04 = j2;
    }
}
