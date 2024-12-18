package X;

import android.content.Context;
import android.view.View;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.MZf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50687MZf extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new SpinnerImageView(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        SpinnerImageView spinnerImageView = (SpinnerImageView) view;
        AbstractC167017dG.A1O(spinnerImageView, c102884kP);
        String str = "loading";
        String A0E = c102884kP.A0E();
        if (A0E != null) {
            str = A0E;
        }
        spinnerImageView.setLoadingStatus(AbstractC50688MZg.A00(str));
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public C50687MZf(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
