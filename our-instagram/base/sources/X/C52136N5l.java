package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.util.List;

/* renamed from: X.N5l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52136N5l extends AbstractC59962oe implements InterfaceC60072op, CallerContextable {
    public static final CallerContext A0E = CallerContext.A00(C52136N5l.class);
    public static final String __redex_internal_original_name = "FeedAdvancedSettingsFragment";
    public C52781NXp A00;
    public NJQ A01;
    public Ef3 A02;
    public C196208mB A03;
    public C36731GHa A04;
    public C35246Fgf A05;
    public boolean A06;
    public boolean A07;
    public NJK A08;
    public final List A0B = AbstractC166987dD.A1E();
    public final List A0A = AbstractC166987dD.A1E();
    public final PublishScreenCategoryType A0D = PublishScreenCategoryType.A07;
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);
    public final String A09 = "advanced_post_settings";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbsListView absListView = (AbsListView) AbstractC166997dE.A0R(view, R.id.list_view);
        C52781NXp c52781NXp = this.A00;
        if (c52781NXp == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        absListView.setAdapter((ListAdapter) c52781NXp);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 8), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A01(C52136N5l c52136N5l, boolean z) {
        C36731GHa c36731GHa = c52136N5l.A04;
        if (c36731GHa != null) {
            c36731GHa.A0D = z;
            C196208mB c196208mB = c52136N5l.A03;
            if (c196208mB == null) {
                c196208mB = OQ9.A00(AbstractC166987dD.A0r(c52136N5l.A0C));
                c52136N5l.A03 = c196208mB;
            }
            C14360o3.A0A(c196208mB);
            InterfaceC09390do interfaceC09390do = c52136N5l.A0C;
            c196208mB.A01(AbstractC166987dD.A0r(interfaceC09390do), "feed_composer", z);
            C52781NXp c52781NXp = c52136N5l.A00;
            if (c52781NXp == null) {
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            }
            c52781NXp.notifyDataSetChanged();
            AbstractC31176DnK.A0Q(interfaceC09390do).A05(new C55999OtW(z));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A02(Object obj) {
        this.A0B.add(obj);
        this.A0A.add(obj);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A09;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        NJK njk = this.A08;
        if (njk == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        ((P0H) njk.A0N.getValue()).ClQ();
        return false;
    }

    private final SpannableStringBuilder A00() {
        Context requireContext = requireContext();
        return C50701MZw.A01(MSZ.A0H(requireContext.getResources(), requireContext.getString(2131973763), 2131973734), getActivity(), AbstractC166987dD.A0r(this.A0C), AbstractC166997dE.A0p(requireContext, 2131973763), this.A09, "https://help.instagram.com/1188715848969926/");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ff, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0o(r4), 36324037365935955L) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0203, code lost:
    
        if (X.C196218mC.A00(X.AbstractC166987dD.A0r(r4)) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02f2, code lost:
    
        if (r11 != false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Type inference failed for: r4v11, types: [X.NJV] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52136N5l.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(689211523);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_share_advanced_settings, viewGroup, false);
        C0f9.A09(449694045, A02);
        return inflate;
    }
}
