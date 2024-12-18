package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.N8z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52210N8z extends AbstractC65632xz {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C52210N8z(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        CharSequence charSequence;
        int A03 = C0f9.A03(-502974889);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.SearchSectionDescriptionViewBinder.Holder");
        O5P o5p = (O5P) tag;
        C51760Mtj c51760Mtj = (C51760Mtj) obj;
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        AbstractC167017dG.A1N(o5p, c51760Mtj);
        IgTextView igTextView = o5p.A00;
        AbstractC25227BEk.A11(igTextView);
        igTextView.setHighlightColor(R.color.fds_transparent);
        Object obj3 = c51760Mtj.A02;
        String str2 = null;
        if (obj3 != null) {
            str = obj3.toString();
        } else {
            str = null;
        }
        Object obj4 = c51760Mtj.A01;
        if (obj4 != null) {
            str2 = obj4.toString();
        }
        if (str != null && str2 != null && fragmentActivity != null && userSession != null) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H((CharSequence) c51760Mtj.A00);
            AnonymousClass773.A05(A0H, new C52790NXz(fragmentActivity, userSession, str, AbstractC31174DnI.A02(fragmentActivity), 5), str2);
            charSequence = A0H;
        } else {
            charSequence = (CharSequence) c51760Mtj.A00;
        }
        igTextView.setText(charSequence);
        C0f9.A0A(-1253100387, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -707001020);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.search_section_description, false);
        A0C.setTag(new O5P(A0C));
        C0f9.A0A(-561839693, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
