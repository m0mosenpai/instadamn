package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;

/* loaded from: classes6.dex */
public final class EKB extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC1119153d {
    public static final String __redex_internal_original_name = "ChannelsEducationBottomSheetFragment";
    public int A00;
    public InterfaceC83733oI A01;
    public RecyclerView A02;
    public C66362zD A03;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final String A04 = "channels_education_bottom_sheet";
    public final InterfaceC09390do A06 = C1XM.A00(new C37017GSy(this, 25));
    public final InterfaceC09390do A05 = C1XM.A00(new C37017GSy(this, 22));

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void Czx() {
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        List A00;
        int i3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("channel_education_audience_type", 0);
        } else {
            i = 0;
        }
        this.A00 = i;
        Bundle bundle3 = this.mArguments;
        InterfaceC83733oI interfaceC83733oI = null;
        if (bundle3 != null) {
            interfaceC83733oI = AbstractC35077Fco.A00(bundle3, "channel_education_thread_id");
        }
        this.A01 = interfaceC83733oI;
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.A02 = A0F;
        if (A0F != null) {
            AbstractC31177DnL.A0s(requireContext, A0F);
            RecyclerView recyclerView = this.A02;
            if (recyclerView != null) {
                AbstractC31172DnG.A1B(requireContext(), recyclerView, AbstractC53242c7.A02(requireContext));
                C66392zG A002 = C66362zD.A00(requireContext);
                InterfaceC09390do interfaceC09390do = this.A07;
                A002.A01(new C32626EYa(AbstractC166987dD.A0r(interfaceC09390do), requireContext));
                A002.A01(new EYM(requireContext));
                A002.A01(new C32627EYb(AbstractC166987dD.A0r(interfaceC09390do), requireContext));
                A002.A03 = new C36167Fxh(this);
                C66362zD A003 = A002.A00();
                Object value = this.A05.getValue();
                ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                if (value == EnumC33344Eod.A02) {
                    i2 = 2131955070;
                    A00 = A00();
                    i3 = 23;
                } else {
                    i2 = 2131955077;
                    A00 = A00();
                    i3 = 24;
                }
                A0E.A00(new C36199FyD(i2, A00, new C37017GSy(this, i3)));
                A003.A05(A0E);
                this.A03 = A003;
                RecyclerView recyclerView2 = this.A02;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(A003);
                    return;
                }
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public static final List A00() {
        return AbstractC16960so.A1Q(new C32073E6z((Integer) 2131955071, R.drawable.instagram_calendar_pano_outline_24, 2131955072), new C32073E6z((Integer) 2131955073, R.drawable.instagram_media_pano_outline_24, 2131955074), new C32073E6z((Integer) 2131955075, R.drawable.instagram_trophy_pano_outline_24, 2131955076));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-185805359);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.channel_education_container, viewGroup, false);
        C0f9.A09(-324754305, A02);
        return inflate;
    }
}
