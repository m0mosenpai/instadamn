package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class N5V extends AbstractC59962oe implements InterfaceC60122ou, InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitReOrderFragment";
    public RecyclerView A00;
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(new C57247PbV(this, 6), new C57247PbV(this, 5), C57535Pg9.A00(null, this, 38), AbstractC25225BEi.A1D(C51053Mh7.class));
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C57247PbV(this, 4));
    public final ArrayList A05 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57247PbV(this, 2));
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C57247PbV(this, 3));

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31176DnK.A0F(view);
        C8SB c8sb = (C8SB) this.A02.getValue();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            c8sb.A0A(recyclerView);
            InterfaceC09390do interfaceC09390do = this.A01;
            C51127MiW c51127MiW = (C51127MiW) interfaceC09390do.getValue();
            ArrayList arrayList = this.A05;
            C14360o3.A0B(arrayList, 0);
            ArrayList arrayList2 = c51127MiW.A01;
            int size = arrayList2.size();
            arrayList2.addAll(arrayList);
            c51127MiW.notifyItemRangeInserted(size, arrayList.size());
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                AbstractC37304Gc5.A10(recyclerView2, interfaceC09390do);
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return (C54780OIu) this.A06.getValue();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Ehk(AbstractC31176DnK.A05(this, interfaceC56362iU).getResources().getString(2131966801));
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = getString(2131961124);
        AbstractC31176DnK.A1B(new ViewOnClickListenerC55456OkA(this, 14), A0B, interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1376489043);
        super.onCreate(bundle);
        this.A05.addAll(MSW.A0l(this.A03).A07.A02.A04);
        C0f9.A09(189721713, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-820018382);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_simple_recycler_fragment, viewGroup, false);
        C0f9.A09(-114799839, A02);
        return inflate;
    }
}
