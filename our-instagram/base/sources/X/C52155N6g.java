package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.AbstractMap;

/* renamed from: X.N6g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52155N6g extends AbstractC59962oe implements InterfaceC60152ox {
    public static final String __redex_internal_original_name = "AltTextInputFragment";
    public IgAutoCompleteTextView A00;
    public ScrollView A01;
    public C3I9 A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "alt_text_input";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("media_path_key");
        float f = requireArguments.getFloat("media_aspect_ratio_key");
        String string2 = requireArguments.getString("media_key");
        Object serializable = requireArguments.getSerializable("media_to_caption_key");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type java.util.LinkedHashMap<kotlin.String, kotlin.String>");
        AbstractMap abstractMap = (AbstractMap) serializable;
        double A03 = MSX.A03(this) * 0.8d;
        Bitmap bitmap = null;
        if (string != null) {
            bitmap = C1NC.A0E(string, (int) A03, (int) (A03 / f));
        }
        ImageView A08 = AbstractC31171DnF.A08(view, R.id.alt_image_view);
        A08.setContentDescription(getString(2131969597));
        A08.setImageBitmap(bitmap);
        this.A01 = (ScrollView) view.findViewById(R.id.alt_text_scrollview);
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A02 = A01;
        A01.A9e(this);
        IgAutoCompleteTextView igAutoCompleteTextView = (IgAutoCompleteTextView) view.findViewById(R.id.updated_alt_text_view);
        this.A00 = igAutoCompleteTextView;
        if (string2 != null) {
            if (igAutoCompleteTextView != null) {
                AbstractC31171DnF.A15(igAutoCompleteTextView, abstractMap.get(string2));
            }
            C14360o3.A0F("textView");
            throw C00O.createAndThrow();
        }
        IgAutoCompleteTextView igAutoCompleteTextView2 = this.A00;
        if (igAutoCompleteTextView2 != null) {
            igAutoCompleteTextView2.requestFocus();
            FragmentActivity requireActivity = requireActivity();
            ViewOnClickListenerC48069LPu viewOnClickListenerC48069LPu = new ViewOnClickListenerC48069LPu(abstractMap, this, string2, 4);
            Integer num = C05F.A01;
            View requireViewById = requireActivity.requireViewById(R.id.next_button_textview);
            C14360o3.A0A(requireViewById);
            AbstractC43841Ja4.A02(viewOnClickListenerC48069LPu, (TextView) requireViewById, num, true);
            IgAutoCompleteTextView igAutoCompleteTextView3 = this.A00;
            if (igAutoCompleteTextView3 != null) {
                AbstractC13880nE.A0S(igAutoCompleteTextView3);
                return;
            }
        }
        C14360o3.A0F("textView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        String str = "scrollView";
        if (AbstractC167007dF.A1O(i)) {
            int A09 = AbstractC13880nE.A09(requireContext()) - i;
            IgAutoCompleteTextView igAutoCompleteTextView = this.A00;
            if (igAutoCompleteTextView == null) {
                str = "textView";
            } else {
                int height = (((A09 - igAutoCompleteTextView.getHeight()) - AbstractC53242c7.A0G(requireContext(), R.attr.actionBarHeight)) - C30D.A00) - AbstractC166987dD.A0C(requireContext(), 32);
                ScrollView scrollView = this.A01;
                if (scrollView != null) {
                    AbstractC13880nE.A0W(scrollView, height);
                    return;
                }
            }
        } else {
            ScrollView scrollView2 = this.A01;
            if (scrollView2 != null) {
                scrollView2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(558136899);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_alt_text_photo_input, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(2));
        C0f9.A09(1810849310, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        int A02 = C0f9.A02(-569950831);
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        C3I9 c3i9 = this.A02;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        C0f9.A09(-2074759379, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1650299104);
        super.onResume();
        C3I9 c3i9 = this.A02;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        MSX.A16(this, c3i9);
        C0f9.A09(-1076752400, A02);
    }
}
