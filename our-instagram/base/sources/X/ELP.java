package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes6.dex */
public final class ELP extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC50422MOc {
    public static final InterfaceC08100bW A0H = AbstractC31175DnJ.A0B();
    public static final String __redex_internal_original_name = "DirectThreadSharedPostsFragment";
    public RecyclerView A00;
    public InterfaceC37169GZg A01;
    public C44573Jny A02;
    public E70 A03;
    public C32887EdU A04;
    public IgdsEmptyState A05;
    public InterfaceC83733oI A06;
    public boolean A07;
    public boolean A08;
    public GridLayoutManager A09;
    public Capabilities A0A;
    public boolean A0B;
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);
    public final C41761wQ A0C = AbstractC31173DnH.A0S();
    public final C1I4 A0E = new E0L(this, 13);
    public final C31728DwZ A0F = C31728DwZ.A00(this, 7);
    public final String A0G = AbstractC111324zv.A00(4309);

    @Override // X.InterfaceC50422MOc
    public final void DRN(View view, List list, int i) {
        String str;
        C32057E6j c32057E6j;
        String str2;
        String str3;
        boolean A1R = AbstractC167007dF.A1R(0, list, view);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0D;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity = requireActivity();
        InterfaceC08100bW interfaceC08100bW = A0H;
        InterfaceC83733oI interfaceC83733oI = this.A06;
        if (interfaceC83733oI == null) {
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
        E70 e70 = this.A03;
        if (e70 != null) {
            str = e70.A0Q;
        } else {
            str = null;
        }
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        E70 e702 = this.A03;
        C14360o3.A0B(A0r2, 0);
        if (e702 != null && e702.A09 == 29) {
            e702.A0E(A0r2.userId);
        }
        AbstractC167007dF.A1E(A0r, A1R ? 1 : 0, interfaceC08100bW);
        C35169FfL c35169FfL = (C35169FfL) list.get(i);
        C38321qM A02 = c35169FfL.A02();
        if (A02 != null) {
            if (C18U.A06(C06090Tz.A05, A0r, 36326202029586165L)) {
                String id = A02.getId();
                if (id != null) {
                    AbstractC31178DnM.A0t(null, AbstractC40587Hz7.A00(requireContext, A0r, A02.BRp(), null, id, C38801rC.A04(id), str), requireActivity, A0r);
                }
            } else {
                String id2 = A02.getId();
                if (id2 != null) {
                    C35028Fc1 A00 = C35028Fc1.A00(id2);
                    if (A02.A1y() == C3YU.A04) {
                        A00.A0L = A1R;
                    }
                    C140966Yy A0P = AbstractC31173DnH.A0P(requireActivity, A0r);
                    A0P.A0B(null, A00.A02());
                    A0P.A04();
                }
            }
            C18920wW A01 = AbstractC12220kQ.A01(this, A0r);
            String A07 = AbstractC1345466e.A07(interfaceC83733oI);
            String id3 = A02.getId();
            EnumC40111tc BRp = A02.BRp();
            int ordinal = BRp.ordinal();
            if (ordinal != 0) {
                if (ordinal != A1R) {
                    if (ordinal != 4) {
                        C0w9.A03("DirectThreadSharedPostsUtil", AbstractC167017dG.A0n(BRp, "Unsupported media type clicked here ", AbstractC166987dD.A1C()));
                        str3 = BRp.toString();
                    } else {
                        str3 = "carousel";
                    }
                } else {
                    str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
                }
            } else {
                str3 = "photo";
            }
            Boolean A0U = AbstractC31179DnN.A0U(interfaceC83733oI);
            C14360o3.A0B(A07, A1R ? 1 : 0);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "direct_thread_details_reshared_media_tap");
            if (A0f.isSampled()) {
                AbstractC31171DnF.A1F(A0f, A07);
                A0f.AAP("media_id", id3);
                A0f.AAP("media_type", str3);
                AbstractC31171DnF.A1G(A0f, null);
                A0f.A7v("is_e2ee", A0U);
                A0f.A7v("media_sent_pre_cutover", null);
                A0f.Cht();
                return;
            }
            return;
        }
        if (c35169FfL.A06() == null) {
            return;
        }
        Object obj = c35169FfL.A00;
        if (obj instanceof C32057E6j) {
            c32057E6j = (C32057E6j) obj;
        } else {
            c32057E6j = null;
        }
        boolean z = false;
        if (c32057E6j != null && c32057E6j.A0D == A1R) {
            z = true;
        }
        if (z && c32057E6j != null && (str2 = c32057E6j.A0C) != null) {
            C7ZX c7zx = (C7ZX) A0r.A00(C7ZX.class);
            if (c7zx == null) {
                return;
            }
            c7zx.Cs7(null, null, null, new MessageIdentifier(c32057E6j.A08, null), null, null, null, str2, c32057E6j.A0B, null, null, null, null, null, null, null, null, null, null, null, A1R ? 1 : 0, false);
            return;
        }
        String A06 = c35169FfL.A06();
        if (A06 != null) {
            android.net.Uri A012 = AbstractC08820cl.A01(interfaceC08100bW, A06);
            if (A012 == null) {
                return;
            }
            Intent flags = new Intent("android.intent.action.VIEW", A012).putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", A1R).putExtra(AbstractC111324zv.A00(646), A1R).setFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
            C14360o3.A07(flags);
            flags.setPackage("com.instagram.android");
            C12260kU.A0B(requireContext, flags);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(2131959144));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A0D);
        InterfaceC83733oI interfaceC83733oI = this.A06;
        if (interfaceC83733oI == null) {
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
        this.A02 = new C44573Jny(requireContext, this, A0r, this, interfaceC83733oI);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        this.A09 = gridLayoutManager;
        C44573Jny c44573Jny = this.A02;
        if (c44573Jny != null) {
            gridLayoutManager.A01 = new C31854DzM(c44573Jny);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                Activity rootActivity = getRootActivity();
                if (rootActivity != null) {
                    int width = rootActivity.getWindowManager().getDefaultDisplay().getWidth();
                    C44573Jny c44573Jny2 = this.A02;
                    if (c44573Jny2 != null) {
                        c44573Jny2.A00 = (width - (c44573Jny2.A03.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top) * 2)) / 3;
                    }
                    recyclerView.setAdapter(this.A02);
                    recyclerView.setLayoutManager(this.A09);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31172DnG.A0G(view, R.id.shared_media_list);
        this.A09 = new GridLayoutManager(requireContext(), 3);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A0D);
        InterfaceC83733oI interfaceC83733oI = this.A06;
        if (interfaceC83733oI == null) {
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
        C44573Jny c44573Jny = new C44573Jny(requireContext, this, A0r, this, interfaceC83733oI);
        this.A02 = c44573Jny;
        GridLayoutManager gridLayoutManager = this.A09;
        if (gridLayoutManager != null) {
            gridLayoutManager.A01 = new C31854DzM(c44573Jny);
        }
        if (this.A00 == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "DirectThreadSharedPostsFragment - recycler view is null", 20134884);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.A09);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.A02);
        }
        this.A05 = (IgdsEmptyState) view.requireViewById(R.id.empty_state_headline);
    }

    public static final void A00(ELP elp) {
        GridLayoutManager gridLayoutManager = elp.A09;
        C44573Jny c44573Jny = elp.A02;
        if (!elp.A08 && c44573Jny != null && gridLayoutManager != null) {
            if ((c44573Jny.getItemCount() - 1) - gridLayoutManager.A1b() <= 15) {
                elp.A08 = true;
                c44573Jny.A04.A01(AbstractC001800i.A0T(G3N.A00, c44573Jny.A02), null);
                AbstractC167007dF.A0x(elp.A05);
                C32887EdU c32887EdU = elp.A04;
                if (c32887EdU != null) {
                    InterfaceC83733oI interfaceC83733oI = elp.A06;
                    if (interfaceC83733oI == null) {
                        C14360o3.A0F("threadId");
                        throw C00O.createAndThrow();
                    }
                    c32887EdU.A0A(AbstractC1345466e.A05(interfaceC83733oI), null);
                }
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0G;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        C32887EdU c32887EdU;
        String str;
        int A02 = C0f9.A02(679074652);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A00 != null) {
            this.A06 = A00;
            C34201F6z c34201F6z = C32887EdU.A00;
            InterfaceC09390do interfaceC09390do = this.A0D;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            synchronized (c34201F6z) {
                C14360o3.A0B(A0o, 0);
                c32887EdU = (C32887EdU) A0o.A01(C32887EdU.class, new C37054GUk(A0o, 18));
            }
            this.A04 = c32887EdU;
            Parcelable parcelable = requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
            if (parcelable != null) {
                this.A0A = (Capabilities) parcelable;
                Context requireContext = requireContext();
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                InterfaceC83733oI interfaceC83733oI = this.A06;
                if (interfaceC83733oI == null) {
                    str = "threadId";
                } else {
                    Capabilities capabilities = this.A0A;
                    if (capabilities == null) {
                        str = "threadCapabilities";
                    } else {
                        this.A01 = C7KH.A01(requireContext, A0r, capabilities, interfaceC83733oI);
                        this.A07 = true;
                        this.A0B = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36315859748130448L);
                        C0f9.A09(399400208, A02);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1348131387;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1508548465;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-542387310);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_thread_detail_shared_photos_and_videos, viewGroup, false);
        C0f9.A09(739179415, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1294116334);
        this.A0C.A00.dispose();
        this.A04 = null;
        super.onDestroy();
        C0f9.A09(-1886246498, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2000101370);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.A02 = null;
        this.A00 = null;
        this.A09 = null;
        this.A0C.A01();
        this.A05 = null;
        super.onDestroyView();
        C0f9.A09(-1220713886, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(160790390);
        super.onPause();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A15(this.A0E);
        }
        AbstractC31176DnK.A0Q(this.A0D).A02(this.A0F, C2Io.class);
        this.A0C.A01();
        InterfaceC37169GZg interfaceC37169GZg = this.A01;
        if (interfaceC37169GZg == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        interfaceC37169GZg.BOE().stop();
        C0f9.A09(-354371972, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-55286156);
        super.onResume();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A14(this.A0E);
        }
        AbstractC31176DnK.A0Q(this.A0D).A01(this.A0F, C2Io.class);
        InterfaceC37169GZg interfaceC37169GZg = this.A01;
        String str = "clientInfra";
        if (interfaceC37169GZg != null) {
            InterfaceC37279GbW.A01(interfaceC37169GZg);
            if (this.A0B) {
                C41761wQ c41761wQ = this.A0C;
                InterfaceC37169GZg interfaceC37169GZg2 = this.A01;
                if (interfaceC37169GZg2 != null) {
                    GKK.A00(interfaceC37169GZg2.BOE().APK(), c41761wQ, this, 19);
                    InterfaceC37169GZg interfaceC37169GZg3 = this.A01;
                    if (interfaceC37169GZg3 != null) {
                        InterfaceC37279GbW.A00(interfaceC37169GZg3);
                    }
                }
            }
            InterfaceC83733oI interfaceC83733oI = this.A06;
            if (interfaceC83733oI == null) {
                str = "threadId";
            } else {
                C3o9 A05 = AbstractC1345466e.A05(interfaceC83733oI);
                C32887EdU c32887EdU = this.A04;
                if (c32887EdU != null) {
                    GKK.A00(c32887EdU.A09(A05, null), this.A0C, this, 18);
                }
                C0f9.A09(-960184410, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
