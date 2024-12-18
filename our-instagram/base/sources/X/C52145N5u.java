package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N5u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52145N5u extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ClipsProfileTextEditingFragment";
    public IgSimpleImageView A00;
    public C81Y A01;
    public InteractiveDrawableContainer A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_profile_text_editing_fragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IgSimpleImageView igSimpleImageView;
        IgSimpleImageView igSimpleImageView2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = MSX.A0I(view, R.id.creation_image_container);
        InterfaceC09390do interfaceC09390do = this.A04;
        Bitmap bitmap = (Bitmap) C51012MgJ.A00(interfaceC09390do).A00;
        if (bitmap != null && (igSimpleImageView2 = this.A00) != null) {
            igSimpleImageView2.setImageBitmap(bitmap);
        } else {
            String str = C51012MgJ.A00(interfaceC09390do).A03;
            if (str != null && (igSimpleImageView = this.A00) != null) {
                igSimpleImageView.setImageURI(AbstractC08820cl.A03(str));
            }
        }
        C05A c05a = ((C51012MgJ) interfaceC09390do.getValue()).A00;
        MWT mwt = (MWT) c05a.getValue();
        List list = (List) mwt.A02;
        Bitmap bitmap2 = (Bitmap) mwt.A01;
        String str2 = mwt.A03;
        List list2 = (List) mwt.A05;
        AbstractC167007dF.A1F(list, 0, list2);
        c05a.Egh(new MWT(bitmap2, (Bitmap) null, str2, list, list2));
        View requireViewById = view.requireViewById(R.id.text_edit_add_button);
        C0fQ.A00(ViewOnClickListenerC55465OkK.A00(requireViewById, this, 7), requireViewById);
        C14360o3.A07(requireViewById);
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.add_text_layout_icon);
        Context context = A0I.getContext();
        AbstractC31173DnH.A11(context, A0I, AbstractC53242c7.A05(context));
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            MSY.A0y(view, R.id.text_edit_tools_stub);
            View A0U = AbstractC167017dG.A0U(requireView(), R.id.interactive_drawable_container_stub);
            C14360o3.A0C(A0U, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.InteractiveDrawableContainer");
            InteractiveDrawableContainer interactiveDrawableContainer = (InteractiveDrawableContainer) A0U;
            interactiveDrawableContainer.setMarginAlignmentGuideEnabled(false);
            this.A02 = interactiveDrawableContainer;
            C57982lB.A0B.A05(requireActivity(), new Az5(rootActivity, view, requireViewById, this));
            InteractiveDrawableContainer interactiveDrawableContainer2 = this.A02;
            if (interactiveDrawableContainer2 != null) {
                interactiveDrawableContainer2.setVisibility(0);
                interactiveDrawableContainer2.A0O = true;
                interactiveDrawableContainer2.setLongPressEnabled(false);
                interactiveDrawableContainer2.A0v(new C24147AnW(requireViewById, 1));
                List list3 = (List) C51012MgJ.A00(interfaceC09390do).A02;
                if (AbstractC166987dD.A1b(list3)) {
                    AnonymousClass848 anonymousClass848 = interactiveDrawableContainer2.A0D;
                    Iterator it = list3.iterator();
                    if (anonymousClass848 != null) {
                        while (it.hasNext()) {
                            Object next = it.next();
                            C14360o3.A0B(next, 0);
                            C1817884n c1817884n = ((ClipsCreationViewModel) anonymousClass848).A0N;
                            List list4 = c1817884n.A00;
                            list4.add(next);
                            c1817884n.A0A.Egh(list4);
                            c1817884n.A03.F8m(next);
                        }
                    } else {
                        while (it.hasNext()) {
                            interactiveDrawableContainer2.A0r.add(it.next());
                        }
                    }
                    InteractiveDrawableContainer.A07(interactiveDrawableContainer2);
                }
            }
            AbstractC50522MSa.A1S(this.A01);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C52145N5u() {
        C0YZ A1D = AbstractC25225BEi.A1D(C51012MgJ.class);
        this.A04 = AbstractC25225BEi.A0a(C57525Pfz.A00(this, 32), C57525Pfz.A00(this, 33), MSW.A1G(this, null, 31), A1D);
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        A00.A02 = "";
        AbstractC56952jT.A01(C31722DwR.A00(ViewOnClickListenerC55466OkL.A01(this, 8), interfaceC56362iU, A00));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(816367336);
        super.onCreate(bundle);
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(48);
        }
        C0f9.A09(162378587, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1313584568);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.clips_profile_text_edit_fragment, false);
        C0f9.A09(786896083, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-252868093);
        super.onDestroyView();
        C81Y c81y = this.A01;
        if (c81y != null) {
            C81Z c81z = c81y.A00;
            c81z.A0u.A09.removeView(c81z.A0T);
        }
        this.A02 = null;
        C0f9.A09(1205443807, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(2113699769);
        super.onResume();
        C81Y c81y = this.A01;
        if (c81y != null) {
            c81y.A01();
        }
        C0f9.A09(1717223233, A02);
    }
}
