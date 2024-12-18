package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.Bsq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26828Bsq extends AbstractC59962oe implements InterfaceC60152ox {
    public static final String __redex_internal_original_name = "AiThemesFragment";
    public C28457Ch7 A00;
    public boolean A01;
    public int A02;
    public C3o9 A03;
    public boolean A04;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05 = C1XM.A00(new C57242PbQ(this, 5));
    public final InterfaceC09390do A08 = AbstractC25225BEi.A0a(new C57242PbQ(this, 8), new C57242PbQ(this, 9), new DH0(42, null, this), AbstractC25225BEi.A1D(C25870BcR.class));
    public final InterfaceC09390do A06 = C1XM.A00(new C57242PbQ(this, 6));
    public final C3I9 A09 = C3I7.A01(this, false, true);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "aithemes_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (C3o9) AbstractC153636vY.A00(requireArguments(), Object.class, AbstractC43591JPw.A00(16));
        this.A02 = requireArguments().getInt(AbstractC43591JPw.A00(62));
        this.A04 = requireArguments().getBoolean(AbstractC43591JPw.A00(108));
        this.A01 = requireArguments().getBoolean("is_ai_theme_set");
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 48), C07Y.A00(viewLifecycleOwner));
    }

    public static final String A00(C26828Bsq c26828Bsq) {
        boolean A00 = C28162Cb9.A00((C28162Cb9) c26828Bsq.A05.getValue());
        C25870BcR c25870BcR = (C25870BcR) c26828Bsq.A08.getValue();
        if (A00) {
            C0UO c0uo = c25870BcR.A0J;
            Integer num = ((C26071Bg0) c0uo.getValue()).A02;
            if (num != null) {
                return C26071Bg0.A00(num, c0uo).A06;
            }
            return null;
        }
        return c25870BcR.A01();
    }

    public static final String A01(C26828Bsq c26828Bsq) {
        boolean A00 = C28162Cb9.A00((C28162Cb9) c26828Bsq.A05.getValue());
        C25870BcR c25870BcR = (C25870BcR) c26828Bsq.A08.getValue();
        if (A00) {
            C0UO c0uo = c25870BcR.A0J;
            Integer num = ((C26071Bg0) c0uo.getValue()).A02;
            if (num != null) {
                return C26071Bg0.A00(num, c0uo).A07;
            }
            return null;
        }
        return c25870BcR.A01();
    }

    public static final void A02(C26828Bsq c26828Bsq) {
        String str;
        String A01 = ((C25870BcR) c26828Bsq.A08.getValue()).A01();
        if (A01 != null) {
            C28457Ch7 c28457Ch7 = c26828Bsq.A00;
            if (c28457Ch7 == null) {
                str = "aiThemesLogger";
            } else {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c28457Ch7.A01, AbstractC43591JPw.A00(932));
                if (A0f.isSampled()) {
                    A0f.AAP(AbstractC43591JPw.A00(1188), A01);
                    C28457Ch7.A01(C28457Ch7.A00(c28457Ch7.A03), A0f, c28457Ch7, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A0f.A8R(C8e.AI_THEME_LOADING, "minor_entry_point");
                    C28457Ch7.A02(A0f, c28457Ch7);
                }
                UserSession A0r = AbstractC166987dD.A0r(c26828Bsq.A07);
                C3o9 c3o9 = c26828Bsq.A03;
                if (c3o9 == null) {
                    str = "threadKey";
                } else {
                    AbstractC31278Dp0.A0E(A0r, c3o9, A01, c26828Bsq.A04);
                    c26828Bsq.requireActivity().setResult(-1);
                    AbstractC25227BEk.A1B(c26828Bsq);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        Object value;
        C26071Bg0 c26071Bg0;
        C25870BcR c25870BcR = (C25870BcR) this.A08.getValue();
        float A01 = AbstractC13880nE.A01(requireContext(), i);
        C05A c05a = c25870BcR.A0I;
        do {
            value = c05a.getValue();
            c26071Bg0 = (C26071Bg0) value;
        } while (!c05a.AIi(value, C26071Bg0.A01(c26071Bg0.A01, c26071Bg0.A02, c26071Bg0.A03, A01, c26071Bg0.A04)));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public static final void A03(C26828Bsq c26828Bsq, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC43591JPw.A00(526), directThreadThemeInfo.A0o);
        C3o9 c3o9 = c26828Bsq.A03;
        if (c3o9 == null) {
            C14360o3.A0F("threadKey");
            throw C00O.createAndThrow();
        }
        A0b.putParcelable(AbstractC43591JPw.A00(16), (Parcelable) c3o9);
        A0b.putParcelable(AbstractC43591JPw.A00(524), directThreadThemeInfo);
        A0b.putInt(AbstractC43591JPw.A00(62), c26828Bsq.A02);
        A0b.putSerializable(AbstractC43591JPw.A00(525), C05F.A0C);
        C45481KBt c45481KBt = new C45481KBt();
        c45481KBt.setArguments(A0b);
        C14360o3.A0C(c45481KBt, AbstractC43591JPw.A00(1208));
        c45481KBt.A0D = new C29267CvO(c26828Bsq, directThreadThemeInfo, z);
        C140966Yy c140966Yy = (C140966Yy) c26828Bsq.A06.getValue();
        c140966Yy.A0D(c45481KBt);
        c140966Yy.A0A = AbstractC43591JPw.A00(244);
        c140966Yy.A04();
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnCreate(Bundle bundle) {
        FragmentActivity activity;
        Window window;
        super.afterOnCreate(bundle);
        if (Build.VERSION.SDK_INT >= 30 && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.addFlags(512);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-953282398);
        String string = requireArguments().getString(AbstractC43591JPw.A00(110), AbstractC111324zv.A00(3266));
        boolean A0K = C14360o3.A0K(string, "ugc");
        C23031Ai A0l = AbstractC25230BEn.A0l(this.A07);
        AbstractC167007dF.A1L(A0l, A0l.A08, C23031Ai.A8c, 431, true);
        C18920wW A01 = AbstractC12220kQ.A01(this, getSession());
        String string2 = requireArguments().getString("theme_type", "UNDEFINED");
        C14360o3.A07(string2);
        C14360o3.A0A(string);
        String string3 = requireArguments().getString(AbstractC43591JPw.A00(1221));
        C3o9 c3o9 = (C3o9) AbstractC153636vY.A00(requireArguments(), Object.class, AbstractC43591JPw.A00(16));
        AbstractC167007dF.A1F(c3o9, 2, string);
        this.A00 = new C28457Ch7(A01, c3o9, string2, string3, string);
        ComposeView A012 = AbstractC25319BIo.A01(this, C5UA.A04(new DS9(13, this, A0K), 1830296582, true));
        C0f9.A09(465072701, A02);
        return A012;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-555589651);
        super.onResume();
        C3I9 c3i9 = this.A09;
        c3i9.Dnr(requireActivity());
        c3i9.A9e(this);
        C0f9.A09(-1856399898, A02);
    }
}
