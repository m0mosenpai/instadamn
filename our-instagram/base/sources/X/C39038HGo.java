package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.HGo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39038HGo extends AbstractC65806TuP {
    public static final void A00(View view, C6FG c6fg, C102884kP c102884kP) {
        boolean A1R = AbstractC167007dF.A1R(0, view, c6fg);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.commerce.cpdp.MiniComponentProductTileNameRenderUnit.Holder");
        Context context = c6fg.A00;
        CharSequence A0I = c102884kP.A0I();
        int A03 = c102884kP.A03(36, A1R ? 1 : 0);
        InterfaceC09390do interfaceC09390do = ((C38434GvH) tag).A01;
        AbstractC37302Gc3.A06(interfaceC09390do).setMaxLines(A03);
        boolean A0S = c102884kP.A0S(35, false);
        TextView A06 = AbstractC37302Gc3.A06(interfaceC09390do);
        if (A0S) {
            A0I = TextUtils.concat(A0I, AbstractC41758IeZ.A00(context));
        }
        A06.setText(A0I);
    }

    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(context), null, R.layout.mini_components_product_tile_name, false);
        A0D.setTag(new C38434GvH(A0D));
        return A0D;
    }

    @Override // X.AbstractC65806TuP
    public final void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }

    @Override // X.AbstractC65806TuP
    public final Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        AbstractC167027dH.A12(view, c6fg, c102884kP);
        A00(view, c6fg, c102884kP);
        return null;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }
}
