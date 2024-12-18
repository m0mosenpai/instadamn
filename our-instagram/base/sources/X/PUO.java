package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUO implements Callable {
    public final /* synthetic */ IgdsListCell A00;
    public final /* synthetic */ C51285Ml8 A01;
    public final /* synthetic */ C56479P5t A02;
    public final /* synthetic */ Integer A03;

    public PUO(IgdsListCell igdsListCell, C51285Ml8 c51285Ml8, C56479P5t c56479P5t, Integer num) {
        this.A00 = igdsListCell;
        this.A03 = num;
        this.A01 = c51285Ml8;
        this.A02 = c56479P5t;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00.getContext();
        AbstractC31171DnF.A1O(context);
        C5SU A0U = AbstractC167007dF.A0U((Activity) context, this.A03.intValue());
        A0U.A0F = true;
        C51285Ml8 c51285Ml8 = this.A01;
        A0U.A03(AbstractC166997dE.A0S(c51285Ml8.itemView, R.id.igds_textcell_title));
        A0U.A02();
        A0U.A0A = false;
        NMC.A00(A0U, this.A02, 6).A07(c51285Ml8.A00);
        return true;
    }
}
