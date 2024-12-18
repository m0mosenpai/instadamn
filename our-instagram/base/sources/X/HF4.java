package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class HF4 extends AbstractC65632xz {
    public final IE7 A00;
    public final AbstractC59962oe A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public HF4(AbstractC59962oe abstractC59962oe, IE7 ie7) {
        this.A00 = ie7;
        this.A01 = abstractC59962oe;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = C0f9.A03(-269835429);
        AbstractC167017dG.A1P(view, obj);
        C38321qM c38321qM = (C38321qM) obj;
        Resources A09 = AbstractC31177DnL.A09(this.A01);
        C14360o3.A0B(c38321qM, 1);
        switch (c38321qM.A1b().ordinal()) {
            case 1:
                i2 = 2131971930;
                break;
            case 2:
                i2 = 2131971924;
                break;
            case 3:
                i2 = 2131953994;
                break;
            case 4:
                i2 = 2131971927;
                break;
            case 5:
                i2 = 2131971926;
                break;
            case 6:
            case 9:
            default:
                i2 = 2131971928;
                break;
            case 7:
                i2 = 2131971925;
                break;
            case 8:
                i2 = 2131971929;
                break;
            case 10:
                i2 = 2131952256;
                break;
        }
        AbstractC166987dD.A0e(view, R.id.row_title).setText(AbstractC166997dE.A0q(A09, i2));
        C0fQ.A00(new ViewOnClickListenerC42027Ijw(11, c38321qM, this), view);
        C0f9.A0A(-1109263818, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1997800467);
        View A0A = AbstractC31176DnK.A0A(AbstractC31177DnL.A0E(viewGroup, 1), viewGroup, R.layout.row_promote);
        C0f9.A0A(-913795371, A03);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
