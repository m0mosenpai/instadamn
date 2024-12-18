package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class ES6 extends AbstractC65632xz {
    public final Context A00;
    public final UserSession A01;

    public ES6(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return obj.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return ((FMX) obj).A00;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String A00;
        int A03 = C0f9.A03(-1736687916);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        if (tag != null) {
            C34535FJv c34535FJv = (C34535FJv) tag;
            FMX fmx = (FMX) obj;
            Resources resources = this.A00.getResources();
            int i2 = fmx.A00;
            boolean z = fmx.A01;
            boolean z2 = fmx.A03;
            boolean z3 = fmx.A02;
            C14360o3.A0B(c34535FJv, 0);
            if (!z && !z3) {
                TextView textView = c34535FJv.A00;
                if (z2) {
                    if (resources != null) {
                        A00 = AbstractC25231BEo.A0r(resources, NumberFormat.getInstance(Locale.getDefault()).format(i2), R.plurals.number_of_reactions, i2);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else if (resources != null) {
                    A00 = AbstractC74053Tw.A00(resources, i2);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                textView.setText(A00);
            }
            c34535FJv.A01.setIsCapitalized(!z3);
            C0f9.A0A(870441372, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(111381400, A03);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -875738045);
        Context context = this.A00;
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 2);
        boolean A01 = FYF.A01(userSession);
        int i2 = R.layout.likers_title_row;
        if (A01) {
            i2 = R.layout.consolidation_likers_title_row;
        }
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, i2);
        C14360o3.A0A(A0A);
        A0A.setTag(new C34535FJv(A0A));
        C0f9.A0A(-218239607, A0G);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
