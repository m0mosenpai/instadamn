package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.N6d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52153N6d extends AbstractC59962oe implements InterfaceC60072op, InterfaceC50521MRz {
    public static final String __redex_internal_original_name = "ClipsTemplateBrowserTabbedFragment";
    public ClipsTemplateBrowserV2Type A00 = ClipsTemplateBrowserV2Type.A04;
    public InterfaceC11380iw A01;
    public C46080Kac A02;
    public C52161N6n A03;
    public C52161N6n A04;
    public ArrayList A05;
    public HashMap A06;
    public String A07;
    public ArrayList A08;
    public List A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final C51170MjE A0C;

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ L5P ANJ(Object obj) {
        C14360o3.A0B(obj, 0);
        HashMap hashMap = this.A06;
        if (hashMap == null) {
            C14360o3.A0F("tabModels");
            throw C00O.createAndThrow();
        }
        L5P l5p = (L5P) hashMap.get(obj);
        if (l5p != null) {
            return l5p;
        }
        throw AbstractC37303Gc4.A0M(obj, "Unsupported tab type: ", AbstractC166987dD.A1C());
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0132, code lost:
    
        if (r4 != null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018e  */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.3Fc, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52153N6d.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        C52161N6n c52161N6n;
        String str;
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = (ClipsTemplateBrowserV2Type) obj;
        int A05 = AbstractC25227BEk.A05(clipsTemplateBrowserV2Type, 0);
        if (A05 != 1) {
            if (A05 == 2) {
                c52161N6n = this.A04;
                if (c52161N6n == null) {
                    str = "savedTabFragment";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return c52161N6n;
            }
            throw AbstractC37303Gc4.A0M(clipsTemplateBrowserV2Type, "Unsupported tab type: ", AbstractC166987dD.A1C());
        }
        c52161N6n = this.A03;
        if (c52161N6n == null) {
            str = "browseTabFragment";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return c52161N6n;
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ void Dru(Object obj) {
        C52161N6n c52161N6n;
        String str;
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = (ClipsTemplateBrowserV2Type) obj;
        C14360o3.A0B(clipsTemplateBrowserV2Type, 0);
        this.A00 = clipsTemplateBrowserV2Type;
        C50983Mfq c50983Mfq = (C50983Mfq) this.A0B.getValue();
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type2 = this.A00;
        C14360o3.A0B(clipsTemplateBrowserV2Type2, 0);
        c50983Mfq.A02.Egh(clipsTemplateBrowserV2Type2);
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type3 = this.A00;
        int ordinal = clipsTemplateBrowserV2Type3.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                c52161N6n = this.A04;
                if (c52161N6n == null) {
                    str = "savedTabFragment";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                this.A01 = c52161N6n;
            }
            throw AbstractC43594JPz.A0o(clipsTemplateBrowserV2Type3, "Invalid tab ", AbstractC166987dD.A1C());
        }
        c52161N6n = this.A03;
        if (c52161N6n == null) {
            str = "browseTabFragment";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        this.A01 = c52161N6n;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        InterfaceC11380iw interfaceC11380iw = this.A01;
        if (interfaceC11380iw == null) {
            C14360o3.A0F("currentAnalyticsModule");
            throw C00O.createAndThrow();
        }
        return interfaceC11380iw.getModuleName();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    public C52153N6d() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57515Pfp(new C57515Pfp(this, 19), 20));
        C0YZ A1D = AbstractC25225BEi.A1D(C50983Mfq.class);
        this.A0B = AbstractC25225BEi.A0a(new C57515Pfp(A00, 21), new D8J(31, A00, this), new D8J(30, null, A00), A1D);
        this.A0C = new C51170MjE(null, null, 1);
        this.A0A = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C22P c22p;
        String str;
        int A02 = C0f9.A02(-169770545);
        super.onCreate(bundle);
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = ClipsTemplateBrowserV2Type.A04;
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type2 = ClipsTemplateBrowserV2Type.A05;
        this.A09 = AbstractC16960so.A1Q(clipsTemplateBrowserV2Type, clipsTemplateBrowserV2Type2);
        HashMap A1G = AbstractC166987dD.A1G();
        this.A06 = A1G;
        A1G.put(clipsTemplateBrowserV2Type, new L5P(null, null, null, requireContext().getString(2131975247), null, -1, R.color.template_browser_tab_colors, R.color.black, -1, -1, -1, -1, -1, R.dimen.abc_edit_text_inset_top_material, R.style.igds_emphasized_title_bold, 5));
        HashMap hashMap = this.A06;
        if (hashMap == null) {
            str = "tabModels";
        } else {
            hashMap.put(clipsTemplateBrowserV2Type2, new L5P(null, null, null, requireContext().getString(2131975255), null, -1, R.color.template_browser_tab_colors, R.color.black, -1, -1, -1, -1, -1, R.dimen.abc_edit_text_inset_top_material, R.style.igds_emphasized_title_bold, 3));
            this.A05 = requireArguments().getParcelableArrayList("ClipsConstants.ARGS_PREFILL_MEDIUMS");
            this.A08 = requireArguments().getParcelableArrayList(AbstractC111324zv.A00(602));
            this.A07 = requireArguments().getString("ClipsConstants.ARGS_MWA_AC_TEMPLATE_CATEGORY");
            Object obj = requireArguments().get("ARGS_CAMERA_ENTRY_POINT");
            if (obj instanceof C22P) {
                c22p = (C22P) obj;
            } else {
                c22p = null;
            }
            InterfaceC09390do interfaceC09390do = this.A0A;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            Serializable serializable = requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (serializable == null) {
                serializable = C24H.UNKNOWN;
            }
            ArrayList<? extends Parcelable> arrayList = this.A05;
            String str2 = this.A07;
            Bundle A0E = AbstractC31174DnI.A0E(A0r, 0);
            A0E.putString("IgSessionManager.SESSION_TOKEN_KEY", A0r.token);
            A0E.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, serializable);
            A0E.putBoolean("apply_top_bottom_margin", false);
            A0E.putSerializable("clips_template_browser_v2_type", clipsTemplateBrowserV2Type);
            if (arrayList != null) {
                A0E.putParcelableArrayList("ClipsConstants.ARGS_PREFILL_MEDIUMS", arrayList);
            }
            if (c22p != null) {
                A0E.putSerializable("ARGS_CAMERA_ENTRY_POINT", c22p);
            }
            if (str2 != null) {
                A0E.putString("ClipsConstants.ARGS_MWA_AC_TEMPLATE_CATEGORY", str2);
            }
            C52161N6n c52161N6n = new C52161N6n();
            c52161N6n.setArguments(A0E);
            this.A03 = c52161N6n;
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            Serializable serializable2 = requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (serializable2 == null) {
                serializable2 = C24H.UNKNOWN;
            }
            Bundle A0E2 = AbstractC31174DnI.A0E(A0r2, 0);
            A0E2.putString("IgSessionManager.SESSION_TOKEN_KEY", A0r2.token);
            A0E2.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, serializable2);
            A0E2.putBoolean("apply_top_bottom_margin", false);
            A0E2.putSerializable("clips_template_browser_v2_type", clipsTemplateBrowserV2Type2);
            C52161N6n c52161N6n2 = new C52161N6n();
            c52161N6n2.setArguments(A0E2);
            this.A04 = c52161N6n2;
            C52161N6n c52161N6n3 = this.A03;
            if (c52161N6n3 == null) {
                str = "browseTabFragment";
            } else {
                this.A01 = c52161N6n3;
                C0f9.A09(1609645316, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2032721231);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_template_browser_tabbed_v2_layout, viewGroup, false);
        C0f9.A09(828469128, A02);
        return inflate;
    }
}
