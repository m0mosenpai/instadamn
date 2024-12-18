package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.BsZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26811BsZ extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiCreationTopicPickerFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06 = AbstractC25225BEi.A0a(C29909DGx.A01(this, 21), C29909DGx.A01(this, 22), new C29898DGm(27, null, this), AbstractC25235BEs.A0y());

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ai_creation_topic_picker_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A03);
        Object value = this.A01.getValue();
        InterfaceC09390do interfaceC09390do = this.A06;
        String A02 = C25879Bce.A02(interfaceC09390do);
        UtmMetadata A01 = C25879Bce.A01(interfaceC09390do);
        C25531Mh A012 = C28484Chc.A01(A0q, value, 0);
        if (AbstractC25226BEj.A1Z(A012)) {
            A012.A0k("creation_inspiration_screen_shown");
            C09530e4 A1L = AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, value);
            String str4 = null;
            if (A01 != null) {
                str = A01.A03;
            } else {
                str = null;
            }
            C09530e4 A1L2 = AbstractC166987dD.A1L("utm_source", str);
            if (A01 != null) {
                str2 = A01.A02;
            } else {
                str2 = null;
            }
            C09530e4 A1L3 = AbstractC166987dD.A1L("utm_medium", str2);
            if (A01 != null) {
                str3 = A01.A00;
            } else {
                str3 = null;
            }
            C09530e4 A1L4 = AbstractC166987dD.A1L("utm_campaign", str3);
            if (A01 != null) {
                str4 = A01.A01;
            }
            AbstractC25230BEn.A1F(A012, A02, AbstractC25236BEt.A0c(str4, A1L, A1L2, A1L3, A1L4));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A00;
        AbstractC25226BEj.A0r(interfaceC09390do).A0B("template_dismissed");
        C7F6 A0r = AbstractC25226BEj.A0r(interfaceC09390do);
        A0r.A06.markerEnd(673065299, AbstractC25594BTh.A00(C05F.A0C));
        return false;
    }

    public C26811BsZ() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new D5j(this));
        this.A01 = DH6.A01(this, "AiStudioArgumentKeys.creation_entry_point", enumC09460dv, 4);
        this.A05 = C1XM.A00(new C29644D5k(this));
        this.A03 = C29909DGx.A00(this, 20);
        this.A04 = AbstractC60492pY.A02(this);
        this.A00 = C1XM.A00(C29909DGx.A01(this, 19));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        int i = 2131952757;
        if (((C51748MtX) AbstractC25226BEj.A0n(this.A06).A0L.getValue()).A04) {
            i = 2131952717;
        }
        interfaceC56362iU.Efu(i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-7810762);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A00;
        AbstractC25226BEj.A0r(interfaceC09390do).A06.markerStart(673065299);
        AbstractC25226BEj.A0r(interfaceC09390do).A0B("template_request_sent");
        if (!AbstractC166997dE.A1Z(this.A02.getValue(), true)) {
            C25879Bce A0n = AbstractC25226BEj.A0n(this.A06);
            boolean A06 = C18U.A06(C06090Tz.A05, A0n.A01, 36324011599540032L);
            C27271C1v c27271C1v = A0n.A00;
            if (A06) {
                CXE.A00(c27271C1v.A03, ((C4A7) c27271C1v).A01);
            } else {
                CXE.A01(c27271C1v.A03, ((C4A7) c27271C1v).A01);
            }
        }
        InterfaceC09390do interfaceC09390do2 = this.A06;
        C25879Bce A0n2 = AbstractC25226BEj.A0n(interfaceC09390do2);
        Object value = this.A01.getValue();
        C14360o3.A0B(value, 0);
        A0n2.A09.Egh(value);
        Object value2 = this.A05.getValue();
        if (value2 != null) {
            AbstractC25226BEj.A0n(interfaceC09390do2).A0C.Egh(value2);
        }
        C0f9.A09(-1548427637, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1449518204);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 39), -2090239648);
        C0f9.A09(1338715059, A02);
        return A00;
    }
}
