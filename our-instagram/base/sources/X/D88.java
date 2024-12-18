package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes5.dex */
public final class D88 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D88(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C05A c05a;
        EnumC27388C6r enumC27388C6r;
        java.util.Set set;
        java.util.Set set2;
        String str;
        boolean A0K;
        AbstractC12990ll A0o;
        C06090Tz A0U;
        long j;
        switch (this.A00) {
            case 0:
                c05a = ((C27911CRw) this.A01).A01;
                enumC27388C6r = EnumC27388C6r.A04;
                c05a.F8m(enumC27388C6r);
                return C0eB.A00;
            case 1:
                c05a = ((C27911CRw) this.A01).A01;
                enumC27388C6r = EnumC27388C6r.A03;
                c05a.F8m(enumC27388C6r);
                return C0eB.A00;
            case 2:
            case 11:
            case 22:
            case 25:
            case 37:
            case 47:
                return this.A01;
            case 3:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 23:
            case 26:
            case 38:
            case 48:
                return AbstractC25226BEj.A1C(this.A01);
            case 4:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 24:
            case 27:
            case 39:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 5:
                C26740BrL c26740BrL = (C26740BrL) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c26740BrL.A04);
                String A15 = AbstractC25225BEi.A15(c26740BrL.A03);
                String A152 = AbstractC25225BEi.A15(c26740BrL.A00);
                Object[] objArr = (Object[]) c26740BrL.A02.getValue();
                if (objArr != null) {
                    set = AbstractC009903n.A0K(objArr);
                } else {
                    set = C16910sj.A00;
                }
                Object[] objArr2 = (Object[]) c26740BrL.A01.getValue();
                if (objArr2 != null) {
                    set2 = AbstractC009903n.A0K(objArr2);
                } else {
                    set2 = C16910sj.A00;
                }
                return new C27046BwQ(A0r, A15, A152, set, set2);
            case 6:
                Context context = ((Fragment) this.A01).getContext();
                if (context != null) {
                    str = context.getPackageName();
                } else {
                    str = null;
                }
                A0K = C14360o3.A0K(str, AbstractC111324zv.A00(4138));
                return Boolean.valueOf(A0K);
            case 7:
                return new PKQ((C52159N6l) this.A01);
            case 8:
                C52159N6l c52159N6l = (C52159N6l) this.A01;
                return new NCO(AbstractC166987dD.A0r(c52159N6l.A0M), c52159N6l.requireActivity());
            case 9:
                Fragment fragment = (Fragment) this.A01;
                return Integer.valueOf((int) (((AbstractC13890nF.A01(fragment.requireContext()) - (AbstractC167017dG.A03(fragment.requireContext()) * 2)) - AbstractC167017dG.A06(fragment.requireContext())) / 1.6f));
            case 10:
                return new Bw3(AbstractC166987dD.A0r(((C52159N6l) this.A01).A0M));
            case 14:
                Fragment fragment2 = ((Fragment) this.A01).mParentFragment;
                if (fragment2 == null) {
                    return null;
                }
                InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new D88(new D88(fragment2, 11), 12));
                return AbstractC25225BEi.A0a(new D88(A00, 13), new D8K(36, A00, fragment2), new D8K(35, null, A00), AbstractC25225BEi.A1D(C25863BcI.class)).getValue();
            case Process.SIGTERM /* 15 */:
                A0o = AbstractC166987dD.A0o(((C52159N6l) this.A01).A0M);
                A0U = AbstractC166997dE.A0U(A0o);
                j = 36323908517310139L;
                A0K = C18U.A06(A0U, A0o, j);
                return Boolean.valueOf(A0K);
            case 16:
                A0o = AbstractC166987dD.A0o(((C52159N6l) this.A01).A0M);
                A0U = AbstractC166997dE.A0U(A0o);
                j = 36323908517244602L;
                A0K = C18U.A06(A0U, A0o, j);
                return Boolean.valueOf(A0K);
            case 17:
                ((PagingDataAdapter) this.A01).A05();
                return C0eB.A00;
            case 18:
                C52159N6l c52159N6l2 = (C52159N6l) this.A01;
                C35156Fey.A00(c52159N6l2.requireActivity(), C22P.A2B, c52159N6l2, AbstractC166987dD.A0r(c52159N6l2.A0M));
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                ((C25852Bc7) ((C52159N6l) this.A01).A0F.getValue()).A00();
                return C0eB.A00;
            case 20:
                return new PKS((C52159N6l) this.A01);
            case 21:
                return new C25908BdB(this.A01, 2);
            case 28:
                return new C25908BdB(this.A01, 3);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C25943Bdk c25943Bdk = (C25943Bdk) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new LinearLayoutManager(c25943Bdk.A00.getContext(), 0, false);
            case 30:
                A0o = ((C25852Bc7) this.A01).A02;
                A0U = AbstractC166997dE.A0U(A0o);
                j = 36323908517244602L;
                A0K = C18U.A06(A0U, A0o, j);
                return Boolean.valueOf(A0K);
            case 31:
                A0o = AbstractC166987dD.A0o(((C2Z) this.A01).A04);
                A0U = C06090Tz.A05;
                j = 36328916448722789L;
                A0K = C18U.A06(A0U, A0o, j);
                return Boolean.valueOf(A0K);
            case 32:
                C26764Brl c26764Brl = (C26764Brl) this.A01;
                return new C1810881k(c26764Brl.requireActivity(), AbstractC166987dD.A0r(c26764Brl.A05), false, false);
            case 33:
                return AnonymousClass229.A01(AbstractC166987dD.A0r(((C26764Brl) this.A01).A05));
            case 34:
                return AbstractC183338Bg.A00(AbstractC166987dD.A0r(((C26764Brl) this.A01).A05));
            case 35:
                return AbstractC226999zv.A00(AbstractC166987dD.A0r(((C26764Brl) this.A01).A05));
            case 36:
                return AbstractC25235BEs.A0U(this.A01);
            case 40:
                C26764Brl c26764Brl2 = (C26764Brl) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(c26764Brl2.A05);
                String str2 = c26764Brl2.A00;
                AbstractC167017dG.A1N(A0r2, str2);
                return new C27024Bw4(A0r2, str2);
            case Seq.NULL_REFNUM /* 41 */:
                HC4 hc4 = (HC4) this.A01;
                return new NCO(AbstractC166987dD.A0r(hc4.A0E), hc4.requireActivity());
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return Integer.valueOf((int) (AbstractC167027dH.A01(((HC4) this.A01).A0A) * 1.7777778f));
            case 43:
                Fragment fragment3 = (Fragment) this.A01;
                return Integer.valueOf((int) (((AbstractC13890nF.A01(fragment3.requireContext()) - (AbstractC167017dG.A03(fragment3.requireContext()) * 2)) - AbstractC167017dG.A06(fragment3.requireContext())) / 1.1f));
            case 44:
                return new C44286Jhc(this.A01, 12);
            case 45:
                return new C38385GuM(this.A01, 12);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new CreatorInspirationSignalsPlaygroundRecommendationsViewModel.Factory(AbstractC166987dD.A0r(((HC4) this.A01).A0E));
        }
    }
}
