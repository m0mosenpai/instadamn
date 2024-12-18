package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.NEa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52336NEa extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0D = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.layout_iglive_post_live_avatar_title_row, false);
        Object A0Q = AbstractC37303Gc4.A0Q(A0D, new C51311MlY(A0D));
        if (A0Q instanceof C51311MlY) {
            return (C3OO) A0Q;
        }
        return null;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        C56114OvZ c56114OvZ = (C56114OvZ) interfaceC66482zP;
        C51311MlY c51311MlY = (C51311MlY) c3oo;
        AbstractC167017dG.A1N(c56114OvZ, c51311MlY);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        boolean A1U = AbstractC167007dF.A1U(interfaceC11380iw);
        c51311MlY.A02.setUrl(c56114OvZ.A01, interfaceC11380iw);
        Integer num = c56114OvZ.A03;
        if (num != null) {
            i = c51311MlY.A00.getResources().getDimensionPixelSize(num.intValue());
        } else {
            i = 0;
        }
        View view = c51311MlY.A00;
        view.setPadding(i, A1U ? 1 : 0, i, A1U ? 1 : 0);
        TextView textView = c51311MlY.A01;
        Object obj = c56114OvZ.A00;
        if (obj == null) {
            obj = c56114OvZ.A06;
        }
        AbstractC31171DnF.A15(textView, obj);
        String str = c56114OvZ.A04;
        if (str != null) {
            AbstractC010103p.A0B(view, new UEJ(str, c51311MlY, 1));
        }
        Ok4.A00(view, 19, c56114OvZ);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56114OvZ.class;
    }

    public C52336NEa(Context context, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
    }
}
