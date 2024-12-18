package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* loaded from: classes8.dex */
public final class KWO extends KDO {
    public static final String __redex_internal_original_name = "DirectEmojiReactionsListFragment";
    public View A00;
    public C66362zD A01;
    public Capabilities A02;
    public AbstractC44512JmI A03;
    public boolean A04;
    public boolean A05;
    public RecyclerView A06;
    public final AnonymousClass987 A07 = new AnonymousClass987();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (r1.A00(X.EnumC2054697t.A0u) != false) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KWO.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A06;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        return AbstractC110854yx.A05(recyclerView);
    }

    @Override // X.KDO, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        String A07;
        int A02 = C0f9.A02(1363558298);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable(AbstractC111324zv.A00(1572));
        if (parcelable != null) {
            Capabilities capabilities = (Capabilities) parcelable;
            C14360o3.A0B(capabilities, 0);
            this.A02 = capabilities;
            UserSession A0r = AbstractC166987dD.A0r(this.A0A);
            C3o9 c3o9 = super.A05;
            if (c3o9 != null && (A07 = JRE.A07(c3o9)) != null) {
                String str = super.A07;
                if (str != null) {
                    this.A03 = (AbstractC44512JmI) new C52942bb(new C45586KGa(A0r, A07, str, super.A06), this).A00(C45972KWa.class);
                    C0f9.A09(1311296058, A02);
                    return;
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = 952327024;
                }
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = 1070846680;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 204007889;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2972550);
        C14360o3.A0B(layoutInflater, 0);
        Bundle requireArguments = requireArguments();
        String A00 = AbstractC111324zv.A00(18);
        if (requireArguments.getInt(A00) != 0) {
            layoutInflater = AbstractC43593JPy.A0C(getContext(), layoutInflater, requireArguments().getInt(A00));
        }
        this.A07.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_emoji_reactions_list, viewGroup, false);
        C0f9.A09(358063830, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(121147524);
        this.A07.A01();
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(1873739066, A02);
    }
}
