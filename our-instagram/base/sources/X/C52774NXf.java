package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.NXf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52774NXf extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "SevereBugDescriptionBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "severe_bug_description_bottom_sheet";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        boolean z = requireArguments().getBoolean("SevereBugDescriptionBottomSheetFragment.ARGUMENT_INCLUDE_BUTTONS");
        ArrayList A1E = AbstractC166987dD.A1E();
        C35246Fgf c35246Fgf = new C35246Fgf(2131973626);
        c35246Fgf.A06 = true;
        c35246Fgf.A01 = R.style.igds_emphasized_title;
        c35246Fgf.A02 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        A1E.add(c35246Fgf);
        C35246Fgf c35246Fgf2 = new C35246Fgf(2131973625);
        c35246Fgf2.A06 = true;
        A1E.add(c35246Fgf2);
        if (z) {
            String A0p = AbstractC166997dE.A0p(requireContext(), 2131973628);
            String string = requireContext().getString(2131973628);
            int A0C = AbstractC53242c7.A0C(getContext());
            View.OnClickListener onClickListener = this.A01;
            if (onClickListener == null) {
                str = "neverMindListener";
            } else {
                A1E.add(new FMT(new ViewOnClickListenerC55467OkM(onClickListener, 61), A0p, string, A0C));
                C35246Fgf c35246Fgf3 = new C35246Fgf(2131973627);
                c35246Fgf3.A01 = R.style.rageshake_report_anyway;
                c35246Fgf3.A02 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
                View.OnClickListener onClickListener2 = this.A00;
                if (onClickListener2 == null) {
                    str = "iUnderstandListener";
                } else {
                    c35246Fgf3.A04 = onClickListener2;
                    c35246Fgf3.A06 = true;
                    A1E.add(c35246Fgf3);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        setBottomSheetMenuItems(A1E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }
}
