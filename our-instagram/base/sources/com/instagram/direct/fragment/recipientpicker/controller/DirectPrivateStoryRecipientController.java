package com.instagram.direct.fragment.recipientpicker.controller;

import X.A2L;
import X.AH4;
import X.AbstractC125325le;
import X.AbstractC13670mt;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC201108us;
import X.AbstractC23021Ah;
import X.AbstractC25226BEj;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31231DoE;
import X.AbstractC34895FZh;
import X.AbstractC43592JPx;
import X.AbstractC53242c7;
import X.AbstractC53955NtS;
import X.AbstractC53956NtT;
import X.AbstractC56402iY;
import X.AbstractC59962oe;
import X.C05F;
import X.C0f9;
import X.C0w9;
import X.C14120nc;
import X.C14360o3;
import X.C150956qv;
import X.C16V;
import X.C189478aR;
import X.C190098bS;
import X.C195918ld;
import X.C196008lp;
import X.C1I4;
import X.C211689Zc;
import X.C211849aB;
import X.C23031Ai;
import X.C31675Dvg;
import X.C35168FfK;
import X.C36736GHf;
import X.C38321qM;
import X.C3HB;
import X.C41181vS;
import X.C41761wQ;
import X.C49313Lr7;
import X.C49314Lr8;
import X.C4GR;
import X.C51690MsL;
import X.C52192N8h;
import X.C52199N8o;
import X.C54404O2k;
import X.C54405O2l;
import X.C54406O2m;
import X.C54409O2p;
import X.C54410O2q;
import X.C54411O2r;
import X.C54530O7h;
import X.C55088Oal;
import X.C55942hf;
import X.C55U;
import X.C56034Ou6;
import X.C56383P1s;
import X.C56387P1y;
import X.C56388P1z;
import X.C57112jm;
import X.C57982lB;
import X.C61372qz;
import X.C684436h;
import X.C71665WyH;
import X.C82G;
import X.C82H;
import X.C82I;
import X.CallableC43825JZn;
import X.EnumC201098ur;
import X.EnumC33491ErQ;
import X.EnumC40111tc;
import X.FFU;
import X.FRO;
import X.G05;
import X.G1L;
import X.InterfaceC169507hQ;
import X.InterfaceC169517hR;
import X.InterfaceC37151GYo;
import X.InterfaceC37209GaK;
import X.InterfaceC37292Gbt;
import X.InterfaceC41501vz;
import X.InterfaceC58010Pnu;
import X.InterfaceC58308Pt0;
import X.InterfaceC71990XEd;
import X.LH2;
import X.MR8;
import X.MSW;
import X.MSX;
import X.NLV;
import X.NLW;
import X.NVk;
import X.OTT;
import X.P24;
import X.P26;
import X.P27;
import X.P28;
import X.PG1;
import X.PHM;
import X.PIP;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.ui.widget.search.SearchController;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public class DirectPrivateStoryRecipientController extends C1I4 implements InterfaceC169507hQ, InterfaceC71990XEd, InterfaceC41501vz {
    public int A02;
    public int A03;
    public View A04;
    public EditText A05;
    public RecyclerView A06;
    public ArchivePendingUpload A08;
    public C684436h A09;
    public MediaUploadMetadata A0A;
    public UserSession A0B;
    public C55U A0C;
    public IngestSessionShim A0D;
    public IngestSessionShim A0E;
    public C35168FfK A0F;
    public C31675Dvg A0G;
    public C52199N8o A0H;
    public C52192N8h A0I;
    public C54530O7h A0J;
    public IgdsButton A0K;
    public DirectShareTarget A0L;
    public EnumC40111tc A0M;
    public C211689Zc A0N;
    public InterfaceC169517hR A0O;
    public C195918ld A0P;
    public InterfaceC58010Pnu A0Q;
    public String A0S;
    public String A0T;
    public String A0U;
    public ArrayList A0V;
    public ArrayList A0W;
    public ArrayList A0X;
    public List A0Y;
    public Map A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0o;
    public boolean A0p;
    public boolean A0u;
    public final AbstractC59962oe A0w;
    public final C57112jm A10;
    public final G05 A1E;
    public final boolean A1L;
    public FrameLayout mListContainer;
    public SearchController mSearchController;
    public final C71665WyH A0v = new C71665WyH();
    public final C61372qz A1M = new C61372qz();
    public final Set A1K = AbstractC166987dD.A1H();

    @Deprecated
    public final List A1J = AbstractC166987dD.A1E();
    public int A01 = -1;
    public float A00 = -1.0f;
    public boolean A0r = true;
    public Integer A0R = C05F.A00;
    public boolean A0t = false;
    public boolean A0q = false;
    public boolean A0s = false;
    public boolean A0n = false;
    public final C41761wQ A0z = new C41761wQ(null);
    public final PG1 A15 = new PG1(this);
    public final P26 A1C = new NLV(this);
    public final C54409O2p A16 = new C54409O2p(this);
    public final P26 A1D = new NLW(this);
    public final C54410O2q A17 = new C54410O2q(this);
    public final P27 A18 = new P27(this);
    public final P28 A19 = new P28(this);
    public final FFU A1A = new FFU(this);
    public final C54411O2r A1B = new C54411O2r(this);
    public final InterfaceC37151GYo A11 = new G1L(this);
    public final C54404O2k A12 = new C54404O2k(this);
    public final InterfaceC58308Pt0 A1G = new C56387P1y(this);
    public final MR8 A1I = new C36736GHf(this);
    public final InterfaceC58308Pt0 A1F = new C56388P1z(this);
    public final InterfaceC37209GaK A1H = new P24(this);
    public final C54405O2l A13 = new C54405O2l(this);
    public final C54406O2m A14 = new C54406O2m(this);
    public final InterfaceC41501vz A0x = C56034Ou6.A00(this, 2);
    public final InterfaceC41501vz A0y = C56034Ou6.A00(this, 3);
    public final boolean A1N = true;
    public EnumC33491ErQ A07 = EnumC33491ErQ.LANDING_STATE;

    public DirectPrivateStoryRecipientController(AbstractC59962oe abstractC59962oe, MediaUploadMetadata mediaUploadMetadata, C57112jm c57112jm, G05 g05, boolean z) {
        this.A0w = abstractC59962oe;
        this.A10 = c57112jm;
        this.A1E = g05;
        this.A1L = z;
        this.A0A = mediaUploadMetadata;
    }

    @Override // X.InterfaceC71990XEd
    public final float Aby(SearchController searchController, Integer num) {
        return 0.0f;
    }

    @Override // X.InterfaceC71990XEd
    public final void Cwf(SearchController searchController, Integer num, float f, float f2) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DTR() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DTT() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjP(String str, boolean z) {
    }

    public static void A03(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        boolean z;
        ImageView imageView;
        directPrivateStoryRecipientController.A0F.A05();
        if (directPrivateStoryRecipientController.A0o) {
            AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
            Fragment fragment = abstractC59962oe.mParentFragment;
            if (fragment instanceof BottomSheetFragment) {
                C189478aR c189478aR = ((BottomSheetFragment) fragment).A02;
                if (c189478aR != null) {
                    c189478aR.A0L(null);
                } else {
                    return;
                }
            } else {
                FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                requireActivity.setResult(-1, directPrivateStoryRecipientController.A0E());
                requireActivity.onBackPressed();
            }
            AbstractC25651Mw.A00(directPrivateStoryRecipientController.A0B).E4s(new C190098bS(directPrivateStoryRecipientController.A0E(), directPrivateStoryRecipientController.A0F.A09()));
            return;
        }
        if (directPrivateStoryRecipientController.A0k) {
            AbstractC25226BEj.A1Q(directPrivateStoryRecipientController.A0w);
            return;
        }
        if (directPrivateStoryRecipientController.A0g) {
            AH4 ah4 = (AH4) AH4.A02.getValue();
            Bitmap bitmap = null;
            try {
                View view = directPrivateStoryRecipientController.A0w.mView;
                if (view != null) {
                    View rootView = view.getRootView();
                    bitmap = Bitmap.createBitmap(rootView.getWidth() / 2, MSW.A03(rootView), Bitmap.Config.RGB_565);
                    Canvas A06 = AbstractC43592JPx.A06(bitmap);
                    A06.scale(0.5f, 0.5f);
                    rootView.draw(A06);
                }
            } catch (OutOfMemoryError e) {
                C0w9.A06("DirectPrivateStoryRecipientController", "Failed to create screenshot", e);
            }
            ah4.A00 = bitmap;
            WeakReference weakReference = ah4.A01;
            if (weakReference != null && (imageView = (ImageView) weakReference.get()) != null) {
                imageView.setImageBitmap(bitmap);
                imageView.setVisibility(0);
            }
            z = true;
        } else {
            z = false;
        }
        A08(directPrivateStoryRecipientController, -1, z);
    }

    public static void A04(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        Context context = directPrivateStoryRecipientController.A0w.getContext();
        IngestSessionShim ingestSessionShim = directPrivateStoryRecipientController.A0D;
        if (ingestSessionShim != null && context != null) {
            C35168FfK AXK = directPrivateStoryRecipientController.A0Q.AXK();
            C51690MsL c51690MsL = C51690MsL.A08;
            UserSession userSession = directPrivateStoryRecipientController.A0B;
            UserStoryTarget userStoryTarget = UserStoryTarget.A04;
            AXK.A06(new C56383P1s(context, userSession, ingestSessionShim, userStoryTarget, null, "ig_story_composer", false), c51690MsL);
            directPrivateStoryRecipientController.A18.DlS(userStoryTarget);
        }
    }

    public static void A05(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        Integer num;
        if (directPrivateStoryRecipientController.A04 != null) {
            if ((directPrivateStoryRecipientController.A0F.A09() || directPrivateStoryRecipientController.A0p) && (num = directPrivateStoryRecipientController.mSearchController.A03) != C05F.A0C && num != C05F.A01 && !directPrivateStoryRecipientController.A0a) {
                if (!directPrivateStoryRecipientController.A0k) {
                    A07(directPrivateStoryRecipientController, 0.0f);
                    return;
                } else {
                    C57982lB.A00(directPrivateStoryRecipientController.A0w.getActivity(), new PIP(directPrivateStoryRecipientController, 0), false);
                    return;
                }
            }
            View view = directPrivateStoryRecipientController.A04;
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            directPrivateStoryRecipientController.A04.requireViewById(R.id.send_button).setClickable(false);
            View view2 = directPrivateStoryRecipientController.A04;
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0A = AbstractC43592JPx.A0o(view2, 0).A0A();
            A0A.A0K(C3HB.A00(directPrivateStoryRecipientController.A0w.getContext()));
            A0A.A03 = 8;
            A0A.A0H();
        }
    }

    public static void A06(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        directPrivateStoryRecipientController.A0H.A06();
        A05(directPrivateStoryRecipientController);
    }

    public static void A07(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, float f) {
        directPrivateStoryRecipientController.A04.getClass();
        View view = directPrivateStoryRecipientController.A04;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A0A = AbstractC43592JPx.A0o(view, 0).A0A();
        A0A.A0K(f);
        A0A.A04 = 0;
        PHM.A00(A0A, directPrivateStoryRecipientController, 3);
    }

    public static void A08(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, int i, boolean z) {
        FragmentActivity requireActivity = directPrivateStoryRecipientController.A0w.requireActivity();
        requireActivity.setResult(i, directPrivateStoryRecipientController.A00(z));
        requireActivity.finish();
        if (i == -1) {
            requireActivity.overridePendingTransition(0, 0);
        }
    }

    public static void A09(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        EnumC33491ErQ enumC33491ErQ;
        G05 g05 = directPrivateStoryRecipientController.A1E;
        if (g05 != null) {
            UserSession userSession = directPrivateStoryRecipientController.A0B;
            long j = i3;
            long j2 = i2;
            C71665WyH c71665WyH = directPrivateStoryRecipientController.A0v;
            String str = (String) c71665WyH.get(directShareTarget);
            String moduleName = directPrivateStoryRecipientController.A0w.getModuleName();
            String str2 = directPrivateStoryRecipientController.A0U;
            if (c71665WyH.containsKey(directShareTarget)) {
                enumC33491ErQ = EnumC33491ErQ.CREATE_GROUP_NULL_STATE;
            } else {
                enumC33491ErQ = directPrivateStoryRecipientController.A07;
            }
            g05.A0B(enumC33491ErQ, userSession, directShareTarget, directPrivateStoryRecipientController.A0M, str, moduleName, str2, null, i, j, j2, false);
        }
    }

    public static void A0A(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, C211849aB c211849aB) {
        Integer num = c211849aB.A00;
        Integer num2 = C05F.A00;
        if (num == num2) {
            directPrivateStoryRecipientController.A0P.A05(true, "ig_story_composer");
            directPrivateStoryRecipientController.A0P.A04(false);
            A04(directPrivateStoryRecipientController);
            num2 = C05F.A0C;
        } else if (num == C05F.A01) {
            A04(directPrivateStoryRecipientController);
            num2 = C05F.A0j;
        } else if (num != C05F.A0C) {
            return;
        }
        AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
        int A00 = C3HB.A00(abstractC59962oe.requireContext());
        Context requireContext = abstractC59962oe.requireContext();
        CallerContext callerContext = NVk.A02;
        C55088Oal.A01(requireContext, num2, A00);
    }

    private void A0D(InterfaceC169517hR interfaceC169517hR) {
        ArrayList arrayList;
        int i;
        UserSession userSession = this.A0B;
        List<DirectShareTarget> list = (List) interfaceC169517hR.Bov();
        if (this.A0E != null || this.A0D != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (DirectShareTarget directShareTarget : list) {
                if (directShareTarget.A01 != 29) {
                    A1E.add(directShareTarget);
                }
            }
            list = A1E;
        }
        FRO A00 = AbstractC34895FZh.A00(userSession, "story_share_sheet", list);
        this.A0U = interfaceC169517hR.Bo9();
        if (this.A0b) {
            UserSession userSession2 = this.A0B;
            LinkedHashSet linkedHashSet = OTT.A02;
            C14360o3.A0B(userSession2, 0);
            LinkedHashSet linkedHashSet2 = OTT.A02;
            try {
                C23031Ai A002 = AbstractC23021Ah.A00(userSession2);
                String A0j = MSX.A0j(A002, A002.A6u, C23031Ai.A8c, 237);
                if (A0j != null) {
                    OTT parseFromJson = AbstractC53956NtT.parseFromJson(C16V.A00(A0j));
                    Set set = parseFromJson.A00;
                    if (set != null && set.size() >= 2) {
                        linkedHashSet2 = AbstractC53955NtS.A00(new LinkedHashSet(parseFromJson.A00), linkedHashSet2);
                    } else {
                        throw MSW.A0y("Not enough targets parsed");
                    }
                }
            } catch (IOException e) {
                C23031Ai A003 = AbstractC23021Ah.A00(userSession2);
                AbstractC31171DnF.A1S(A003, null, A003.A6u, C23031Ai.A8c, 237);
                C0w9.A07("BlastListCandidatesManager_error_deserializing_last_send", e);
            }
            arrayList = AbstractC166987dD.A1F(linkedHashSet2);
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = A00.A0D;
        ArrayList arrayList3 = A00.A02;
        ArrayList arrayList4 = A00.A03;
        A0B(this, arrayList2);
        A0C(this, arrayList2);
        C52199N8o c52199N8o = this.A0H;
        LinkedHashSet linkedHashSet3 = c52199N8o.A0X;
        linkedHashSet3.clear();
        LinkedHashSet linkedHashSet4 = c52199N8o.A0Y;
        linkedHashSet4.clear();
        C52199N8o.A01(c52199N8o);
        int min = Math.min(arrayList2.size(), c52199N8o.A09);
        if (c52199N8o.A0h && (i = c52199N8o.A08) < 10) {
            min = Math.min(min, i);
        }
        linkedHashSet3.addAll(arrayList2.subList(0, min));
        linkedHashSet4.addAll(arrayList2.subList(min, arrayList2.size()));
        C52199N8o c52199N8o2 = this.A0H;
        LinkedHashSet linkedHashSet5 = c52199N8o2.A0V;
        linkedHashSet5.clear();
        C52199N8o.A01(c52199N8o2);
        linkedHashSet5.addAll(arrayList3.subList(0, Math.min(arrayList3.size(), c52199N8o2.A07)));
        C52199N8o c52199N8o3 = this.A0H;
        LinkedHashSet linkedHashSet6 = c52199N8o3.A0W;
        linkedHashSet6.clear();
        C52199N8o.A01(c52199N8o3);
        linkedHashSet6.addAll(arrayList4);
        if (arrayList != null) {
            Set set2 = this.A0H.A0d;
            set2.clear();
            set2.addAll(arrayList);
        }
        this.A0H.A06();
    }

    public final Intent A0E() {
        boolean z;
        if (this.A0g || (this.A0k && this.A0F.A09())) {
            z = true;
        } else {
            z = false;
        }
        return A00(z);
    }

    public final void A0F(EnumC201098ur enumC201098ur, C41181vS c41181vS) {
        C38321qM c38321qM;
        C82H A00 = A2L.A00(C196008lp.A00(this.A0B), this.A0P.A06());
        C82I A0H = MSW.A0H();
        if (c41181vS != null && (c38321qM = c41181vS.A0b) != null) {
            A0H.A06("ig_media_id", c38321qM.getId());
        }
        AbstractC201108us.A00(C82G.A0u, enumC201098ur, A00, A0H, this.A0B);
    }

    @Override // X.InterfaceC71990XEd
    public final void DEw() {
        G05 g05 = this.A1E;
        if (g05 != null) {
            this.A07 = EnumC33491ErQ.LANDING_STATE;
            g05.A09();
        }
    }

    @Override // X.InterfaceC71990XEd
    public final void DjB(SearchController searchController, boolean z) {
        if (this.A1N) {
            AbstractC59962oe abstractC59962oe = this.A0w;
            AbstractC31176DnK.A0J(abstractC59962oe).EkF(!z);
            AbstractC56402iY.A02(abstractC59962oe.getActivity(), AbstractC53242c7.A0F(abstractC59962oe.getContext(), R.attr.statusBarBackgroundColor));
        }
    }

    @Override // X.InterfaceC71990XEd
    public final void DjS(String str, String str2) {
        EnumC33491ErQ enumC33491ErQ;
        String BjQ = this.A0O.BjQ();
        String A01 = AbstractC13670mt.A01(str);
        this.A0O.Eby(A01);
        if (this.A1E != null) {
            boolean isEmpty = TextUtils.isEmpty(BjQ);
            boolean isEmpty2 = TextUtils.isEmpty(A01);
            if (isEmpty) {
                if (!isEmpty2) {
                    enumC33491ErQ = EnumC33491ErQ.SEARCH_QUERY_STATE;
                } else {
                    return;
                }
            } else if (!isEmpty2) {
                return;
            } else {
                enumC33491ErQ = EnumC33491ErQ.SEARCH_NULL_STATE;
            }
            this.A07 = enumC33491ErQ;
        }
    }

    @Override // X.InterfaceC71990XEd
    public final void DoO(SearchController searchController, Integer num, Integer num2) {
        this.A0R = num;
        A05(this);
        if (num2 == C05F.A00 && num == C05F.A01) {
            this.A0i = true;
        }
    }

    private Intent A00(boolean z) {
        ArrayList<? extends Parcelable> A1F;
        Intent A04 = AbstractC31171DnF.A04();
        ArrayList A042 = this.A0F.A04(InterfaceC37292Gbt.class);
        A04.putExtra("bundle_extra_user_tapped_done_button", z);
        A04.putExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHARE_SHEET_LOGGING_REWRITE_IS_ENABLED", AbstractC167007dF.A1W(this.A1E));
        A04.putExtra("bundle_extra_one_tap_send_taps", this.A02).putExtra("bundle_extra_one_tap_undo_taps", this.A03).putExtra("bundle_extra_ingest_session", this.A0D).putParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets", A042).putExtra("bundle_extra_user_story_targets", AbstractC166987dD.A1F(this.A1K));
        if (this.A0d) {
            A04.putExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", this.A0P.A06());
        }
        A04.putParcelableArrayListExtra("bundle_extra_direct_share_targets", this.A0F.A04(C49314Lr8.class));
        if (this.A0b) {
            ArrayList A03 = this.A0F.A03(C35168FfK.A03, C49313Lr7.class);
            if (A03.isEmpty()) {
                A1F = null;
            } else {
                A1F = AbstractC166987dD.A1F(((C49313Lr7) A03.get(0)).A04);
            }
            A04.putParcelableArrayListExtra("bundle_extra_blast_list_direct_share_targets", A1F);
        }
        if (this.A0L != null) {
            A04.putExtra("DirectPrivateStoryRecipientController.DIRECT_FORGOT_TO_SEND_TO_ORIGINAL_RECIPIENT", this.A0j);
            A04.putExtra("DirectPrivateStoryRecipientController.DIRECT_SEND_TO_ORIGINAL_RECIPIENT_WITH_DIALOG", this.A0f);
        }
        return A04;
    }

    public static ArrayList A01(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, ArrayList arrayList) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A1E.add(LH2.A00(C14120nc.A00(), new CallableC43825JZn(4, directPrivateStoryRecipientController, it.next()), 204));
        }
        return A1E;
    }

    public static ArrayList A02(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, ArrayList arrayList) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A1E.add(LH2.A00(C14120nc.A00(), new CallableC43825JZn(3, directPrivateStoryRecipientController, it.next()), 117));
        }
        return A1E;
    }

    public static void A0B(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            if (AbstractC31231DoE.A02(directPrivateStoryRecipientController.A0B, directShareTarget) || AbstractC31231DoE.A01(directPrivateStoryRecipientController.A0B, directShareTarget)) {
                it.remove();
            }
        }
    }

    public static void A0C(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            if (directShareTarget.A04(directPrivateStoryRecipientController.A0B.userId, false) == C05F.A0B || C4GR.A07(Integer.valueOf(directShareTarget.A01))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r1 != false) goto L10;
     */
    @Override // X.InterfaceC169507hQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DcI(X.InterfaceC169517hR r14) {
        /*
            r13 = this;
            java.lang.String r0 = r14.BjQ()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            r13.A0D(r14)
            return
        Le:
            X.N8h r3 = r13.A0I
            r3.A00 = r14
            r3.A06()
            X.7hR r2 = r3.A00
            java.lang.String r0 = r2.BjQ()
            r8 = 1
            r10 = 0
            if (r0 == 0) goto L26
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L27
        L26:
            r0 = 1
        L27:
            java.lang.Object r7 = r2.Bov()
            java.util.List r7 = (java.util.List) r7
            if (r0 != 0) goto L8e
            boolean r0 = r2.isLoading()
            if (r0 != 0) goto L42
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L42
            java.lang.String r1 = r3.A09
            X.DtV r0 = r3.A05
            r3.A08(r0, r1)
        L42:
            com.instagram.common.session.UserSession r5 = r3.A03
            java.lang.String r6 = "story_share_sheet"
            X.Fbm r4 = X.AbstractC34895FZh.A00
            X.AbstractC167007dF.A1G(r5, r10, r7)
            r9 = r8
            r11 = r10
            r12 = r8
            X.FRO r2 = r4.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36317496131458324(0x810692000c1514, double:3.030669020128666E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto L96
            X.7hR r0 = r3.A00
            boolean r0 = r0.CXh()
            if (r0 != 0) goto L96
            java.util.ArrayList r0 = r2.A0D
            java.util.Iterator r1 = r0.iterator()
        L6d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r1.next()
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L6d
            r1.remove()
            goto L6d
        L83:
            java.util.ArrayList r0 = r2.A03
            r0.clear()
            java.util.ArrayList r0 = r2.A04
            r0.clear()
            goto L96
        L8e:
            com.instagram.common.session.UserSession r1 = r3.A03
            java.lang.String r0 = "story_share_sheet"
            X.FRO r2 = X.AbstractC34895FZh.A00(r1, r0, r7)
        L96:
            java.util.ArrayList r1 = r2.A0D
            r0 = 6
            int r4 = X.C52192N8h.A00(r3, r1, r0, r10, r10)
            java.util.ArrayList r2 = r2.A06
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb3
            X.O5o r1 = r3.A04
            X.N91 r0 = r3.A01
            r3.A08(r0, r1)
            r1 = 12
            boolean r0 = r3.A0B
            X.C52192N8h.A00(r3, r2, r1, r4, r0)
        Lb3:
            X.7hR r0 = r3.A00
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto Lce
            X.Dw4 r2 = r3.A07
            java.lang.String r1 = r3.A0A
            int r0 = r3.A02
            r2.A01 = r1
            r2.A00 = r0
            X.FQs r1 = r3.A08
            r1.A00 = r8
            X.ERQ r0 = r3.A06
            r3.A09(r0, r2, r1)
        Lce:
            r3.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.DcI(X.7hR):void");
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1716334795);
        int A032 = C0f9.A03(-1134982440);
        if (TextUtils.isEmpty(this.A0O.BjQ())) {
            A0D(this.A0O);
        }
        C0f9.A0A(243720563, A032);
        C0f9.A0A(733977332, A03);
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = C0f9.A03(-256712941);
        super.onScrollStateChanged(recyclerView, i);
        this.A1M.onScrollStateChanged(recyclerView, i);
        C0f9.A0A(2141352935, A03);
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(711849054);
        super.onScrolled(recyclerView, i, i2);
        this.A1M.onScrolled(recyclerView, i, i2);
        C0f9.A0A(632236414, A03);
    }
}
