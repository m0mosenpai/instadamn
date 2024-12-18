package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;

/* renamed from: X.Brs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26771Brs extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AvoidedTopicDetailFragment";
    public InterfaceC56362iU A00;
    public final String A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        this.A00 = interfaceC56362iU;
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131952416);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public C26771Brs() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A03 = DH6.A01(this, "creator_ai_creator_fbid", enumC09460dv, 35);
        this.A04 = DH6.A01(this, "creator_ai_entry_point_extra", enumC09460dv, 36);
        this.A01 = "avoided_topic_detail_fragment";
        this.A07 = AbstractC60492pY.A02(this);
        this.A02 = C29908DGw.A00(this, 2);
        C29908DGw c29908DGw = new C29908DGw(this, 9);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C29908DGw(new C29908DGw(this, 6), 7));
        this.A08 = AbstractC25225BEi.A0a(new C29908DGw(A00, 8), c29908DGw, new C29894DGi(35, A00, null), AbstractC25225BEi.A1D(C25867BcM.class));
        this.A05 = C29908DGw.A00(this, 3);
        this.A06 = C29908DGw.A00(this, 4);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-385125130);
        super.onCreate(bundle);
        ((C3I9) AbstractC166987dD.A17(this.A05)).A9e((InterfaceC60152ox) this.A06.getValue());
        C0f9.A09(878233537, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List list;
        Object value;
        C26080Bg9 c26080Bg9;
        int A02 = C0f9.A02(524754749);
        C14360o3.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        String str7 = null;
        if (bundle2 != null) {
            str = bundle2.getString(MSV.A00(1090));
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString(MSV.A00(1091));
        } else {
            str2 = null;
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str3 = bundle4.getString(MSV.A00(1092));
        } else {
            str3 = null;
        }
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str4 = bundle5.getString(AbstractC111324zv.A00(199));
        } else {
            str4 = null;
        }
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            str5 = bundle6.getString(AbstractC111324zv.A00(382));
        } else {
            str5 = null;
        }
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            str6 = bundle7.getString(AbstractC111324zv.A00(381));
        } else {
            str6 = null;
        }
        Bundle bundle8 = this.mArguments;
        if (bundle8 != null) {
            str7 = bundle8.getString(AbstractC111324zv.A00(198));
        }
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, AbstractC166987dD.A0o(this.A07), 36604404241208389L);
        C25867BcM c25867BcM = (C25867BcM) this.A08.getValue();
        String str8 = "";
        if (str5 != null && str7 != null) {
            if (str6 == null) {
                str6 = "";
            }
            c25867BcM.A00 = new C45116Jxl(str7, str6, str5, 8);
        }
        if (str4 != null) {
            list = AbstractC166987dD.A1J(str4);
        } else {
            list = null;
        }
        c25867BcM.A03 = list;
        if (str != null || (str4 != null && str4.length() != 0)) {
            if (str2 == null) {
                if (str4 != null) {
                    str8 = str4;
                }
            } else {
                str8 = str2;
            }
            if (str3 == null) {
                str3 = "REDIRECT";
            }
            c25867BcM.A05 = AbstractC001900j.A0T(str8);
            c25867BcM.A01 = AbstractC25228BEl.A1A(str8);
            C05A c05a = c25867BcM.A09;
            do {
                value = c05a.getValue();
                c26080Bg9 = (C26080Bg9) value;
            } while (!c05a.AIi(value, C26080Bg9.A00(null, null, c26080Bg9, new C51740MtP(str3, ((C51740MtP) c26080Bg9.A04).A01, 7), null, null, 55)));
            c25867BcM.A02 = str;
            C25867BcM.A00(c25867BcM);
            c25867BcM.A01();
        }
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A04(new C30227DTg(this, str2, str4, str, A07, 1), 1513389523, true), false, false);
        C0f9.A09(989438118, A02);
        return A022;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1776336884);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = this.A05;
        ((C3I9) AbstractC166987dD.A17(interfaceC09390do)).EFx((InterfaceC60152ox) this.A06.getValue());
        ((C3I9) AbstractC166987dD.A17(interfaceC09390do)).onDestroy();
        C0f9.A09(163390451, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1033332867);
        super.onStart();
        ((C3I9) AbstractC166987dD.A17(this.A05)).Dnr(getActivity());
        C0f9.A09(232239225, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(366914195);
        super.onStop();
        ((C3I9) AbstractC166987dD.A17(this.A05)).onStop();
        C0f9.A09(1010543054, A02);
    }
}
