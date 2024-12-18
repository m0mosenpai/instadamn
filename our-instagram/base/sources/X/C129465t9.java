package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.5t9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129465t9 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiAgentsSeeAllFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final String A08 = "home_see_all_fragment";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.setTitle((String) this.A04.getValue());
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A05.getValue();
    }

    public C129465t9() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new DH6(this, "home_see_all_section_id", "home_see_all_section_id", 10));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new DH6(this, "home_see_all_section_name", "home_see_all_section_name", 11));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new DH6(this, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, 12));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C29645D5n(this));
        this.A00 = C1XM.A00(new DGX(this, 36));
        this.A01 = C1XM.A00(new DGX(this, 37));
        DGX dgx = new DGX(this, 42);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new DGX(new DGX(this, 39), 40));
        this.A07 = new C60842q8(new DGX(A00, 41), dgx, new C29897DGl(15, null, A00), new C0YZ(C44531Jmb.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object value;
        boolean z;
        List list;
        boolean z2;
        int A02 = C0f9.A02(1784283123);
        super.onCreate(bundle);
        C7F6 c7f6 = (C7F6) this.A01.getValue();
        InterfaceC09390do interfaceC09390do = this.A04;
        String str = (String) interfaceC09390do.getValue();
        C14360o3.A0B(str, 0);
        C006802i c006802i = c7f6.A06;
        c006802i.markerStart(895692010);
        c006802i.markerAnnotate(895692010, "page_name", str);
        C44531Jmb c44531Jmb = (C44531Jmb) this.A07.getValue();
        String str2 = (String) this.A03.getValue();
        String str3 = (String) interfaceC09390do.getValue();
        C14360o3.A0B(str2, 0);
        C14360o3.A0B(str3, 1);
        C05A c05a = c44531Jmb.A03;
        do {
            value = c05a.getValue();
            C51748MtX c51748MtX = (C51748MtX) value;
            z = c51748MtX.A03;
            list = (List) c51748MtX.A01;
            z2 = c51748MtX.A02;
            C14360o3.A0B(list, 2);
        } while (!c05a.AIi(value, new C51748MtX(list, 1, z, true, z2)));
        C141796aw A00 = AbstractC141776au.A00(c44531Jmb);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBX(c44531Jmb, str2, str3, (InterfaceC23621Ds) null, 1), A00);
        C0f9.A09(250675787, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1578590691);
        ComposeView A01 = AbstractC25319BIo.A01(this, C5UA.A03(new C30480DbP(this, 9), 1920766069));
        C0f9.A09(831055932, A02);
        return A01;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1173636210);
        C7F6 c7f6 = (C7F6) this.A01.getValue();
        c7f6.A06.markerEnd(895692010, AbstractC25594BTh.A00(C05F.A0C));
        super.onDestroy();
        C0f9.A09(-141352644, A02);
    }
}
