package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38998HFa extends AbstractC65632xz {
    public final Context A00;
    public final UserSession A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C101394gx A00 = AbstractC140306Wi.A00((C41181vS) obj);
        A00.getClass();
        return AbstractC37865GlK.A00(A00).hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AbstractC140306Wi.A02(this.A01, (C41181vS) obj).hashCode();
    }

    public C38998HFa(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public static SpannableString A00(Resources resources, InterfaceC101384gv interfaceC101384gv, int i) {
        String trim = AbstractC41657Ibp.A02(interfaceC101384gv).toLowerCase(C1Q2.A02()).replace('\n', ' ').trim();
        String quantityString = resources.getQuantityString(R.plurals.reel_dashboard_poll_result_option_tally_label, i, trim);
        int indexOf = quantityString.indexOf(trim);
        SpannableString spannableString = new SpannableString(quantityString);
        spannableString.setSpan(new C138566Pm(), indexOf, trim.length() + indexOf, 33);
        return spannableString;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-338256354);
        C41181vS c41181vS = (C41181vS) obj;
        IM2 im2 = (IM2) view.getTag();
        if (im2 != null) {
            im2.A00(this.A01, c41181vS);
        }
        C0f9.A0A(351098411, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-2095432532);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_poll_result);
        A0A.setTag(new IM2(A0A));
        C0f9.A0A(-1957931206, A03);
        return A0A;
    }
}
