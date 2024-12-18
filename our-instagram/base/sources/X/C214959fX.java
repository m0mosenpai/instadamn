package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.creation.capture.quickcapture.recipientpicker.GroupProfileStoryRecipient;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9fX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214959fX extends AbstractC59962oe implements InterfaceC1119153d, InterfaceC37173GZk, InterfaceC37149GYk, InterfaceC25176BBy {
    public C183688Ct A00;
    public InterfaceC58031PoH A01;
    public IngestSessionShim A02;
    public C215239fz A03;
    public C24042Ale A04;
    public C195918ld A05;
    public String A06;
    public boolean A07;
    public C684436h A08;
    public OWN A09;
    public IgdsButton A0A;
    public PendingRecipient A0B;
    public C8DP A0C;
    public C200018t5 A0D;
    public C8YE A0E;
    public ArrayList A0F;
    public boolean A0G;
    public boolean A0H;
    public static final String __redex_internal_original_name = "PrivateStoryShareSheetFragment";
    public static final CallerContext A0M = CallerContext.A01(__redex_internal_original_name);
    public final C19L A0K = AbstractC167017dG.A0w(C12L.A00, 763);
    public final InterfaceC41501vz A0L = new C9HR(this, 2);
    public final InterfaceC41501vz A0I = new C56035Ou7(this, 22);
    public final InterfaceC09390do A0J = AbstractC60492pY.A02(this);

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0246, code lost:
    
        if (r1.intValue() <= 1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r1.A06() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r26, X.C214959fX r27, X.C51690MsL r28, com.instagram.pendingmedia.model.UserStoryTarget r29, java.lang.String r30, java.lang.String r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214959fX.A02(android.content.Context, X.9fX, X.MsL, com.instagram.pendingmedia.model.UserStoryTarget, java.lang.String, java.lang.String, boolean):void");
    }

    public final void A08(EnumC222989sd enumC222989sd) {
        C14360o3.A0B(enumC222989sd, 0);
        C215239fz c215239fz = this.A03;
        if (c215239fz == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        c215239fz.A00 = enumC222989sd;
        A05(this);
        A01();
    }

    @Override // X.InterfaceC37149GYk
    public final void Cxg(List list, boolean z) {
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.InterfaceC37173GZk
    public final void D89() {
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        this.A0G = true;
        C24042Ale c24042Ale = this.A04;
        if (c24042Ale == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        Fragment fragment = c24042Ale.A05.mParentFragment;
        if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null && (c189478aR = bottomSheetFragment.A02) != null) {
            c189478aR.A0L(null);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37173GZk
    public final void DJu(boolean z, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC37173GZk
    public final void Dlj(String str, boolean z) {
        String str2;
        A08(EnumC222989sd.A07);
        this.A07 = true;
        OWN own = this.A09;
        if (own == null) {
            str2 = "shareHelper";
        } else {
            Context A0O = AbstractC166987dD.A0O(requireContext());
            InterfaceC09390do interfaceC09390do = this.A0J;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            IngestSessionShim ingestSessionShim = this.A02;
            if (ingestSessionShim == null) {
                str2 = "ingestSession";
            } else {
                C14360o3.A0B(A0r, 1);
                C47Z A03 = C25A.A00(A0r).A03((String) ingestSessionShim.A00.get(0));
                if (A03 != null) {
                    EnumC76383bi enumC76383bi = EnumC76383bi.A0A;
                    C14360o3.A0B(enumC76383bi, 0);
                    A03.A1F = enumC76383bi;
                    A03.A31 = str;
                    A03.A56 = z;
                }
                own.A00(A0O, A0r, ingestSessionShim, C51690MsL.A0A, UserStoryTarget.A06, null, null, null, null, false);
                AbstractC25651Mw.A00(AbstractC166987dD.A0o(interfaceC09390do)).E4s(new Object());
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37149GYk
    public final void Ei1(List list) {
        EnumC222989sd enumC222989sd;
        String str;
        C14360o3.A0B(list, 0);
        if (list.size() == 1 && ((AudienceListViewModel) list.get(0)).A05) {
            enumC222989sd = EnumC222989sd.A04;
        } else {
            enumC222989sd = EnumC222989sd.A03;
        }
        A08(enumC222989sd);
        this.A07 = true;
        OWN own = this.A09;
        if (own == null) {
            str = "shareHelper";
        } else {
            Context A0O = AbstractC166987dD.A0O(requireContext());
            UserSession A0W = AbstractC166997dE.A0W(this);
            IngestSessionShim ingestSessionShim = this.A02;
            if (ingestSessionShim == null) {
                str = "ingestSession";
            } else {
                own.A01(A0O, A0W, ingestSessionShim, list);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "private_stories_share_sheet";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.8YD, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.share_story_button);
        this.A0A = igdsButton;
        if (igdsButton == null) {
            str = "shareButton";
        } else {
            C0fQ.A00(new ViewOnClickListenerC55457OkB(this, 22), igdsButton);
            RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.recycler_view);
            recyclerView.setBackgroundColor(requireContext().getColor(R.color.fds_transparent));
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            C215239fz c215239fz = this.A03;
            str = "adapter";
            if (c215239fz != null) {
                recyclerView.setAdapter(c215239fz);
                C215239fz c215239fz2 = this.A03;
                if (c215239fz2 != null) {
                    if (c215239fz2.A00 == EnumC222989sd.A04) {
                        OQA.A01(AbstractC166997dE.A0W(this), "close_friend_sharesheet_impression", "share_sheet", null);
                    }
                    A05(this);
                    A01();
                    C1YB A00 = C8YB.A00();
                    UserSession A0W = AbstractC166997dE.A0W(this);
                    C8YB.A00();
                    this.A0E = A00.A00((ViewStub) view.requireViewById(R.id.warning_nudge), this, A0W, new Object(), new C56814PJk(this, 0));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A01() {
        String str;
        IgdsButton igdsButton;
        int i;
        C215239fz c215239fz = this.A03;
        if (c215239fz == null) {
            str = "adapter";
        } else {
            str = "shareButton";
            if (c215239fz.A00 == EnumC222989sd.A04) {
                C684436h c684436h = this.A08;
                if (c684436h == null) {
                    str = "closeFriendsController";
                } else if (AbstractC34041F0u.A00(c684436h.A01) <= 0) {
                    igdsButton = this.A0A;
                    if (igdsButton != null) {
                        i = 2131969959;
                        igdsButton.setText(i);
                        A06(this, this.A0H);
                        return;
                    }
                }
            }
            igdsButton = this.A0A;
            if (igdsButton != null) {
                i = 2131973639;
                igdsButton.setText(i);
                A06(this, this.A0H);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A03(C214959fX c214959fX) {
        String str;
        C183688Ct c183688Ct;
        C188538Ws A01;
        IngestSessionShim ingestSessionShim = c214959fX.A02;
        if (ingestSessionShim == null) {
            str = "ingestSession";
        } else {
            List list = ingestSessionShim.A00;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C47Z A03 = C25A.A00(AbstractC166997dE.A0W(c214959fX)).A03(AbstractC166987dD.A1B(it));
                if (A03 != null) {
                    A1E.add(A03);
                }
            }
            Iterator it2 = A1E.iterator();
            while (true) {
                str = "adapter";
                if (it2.hasNext()) {
                    C47Z c47z = (C47Z) it2.next();
                    if (c47z != null && AbstractC166987dD.A1b(c47z.A4b)) {
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        for (C84823qW c84823qW : c47z.A4b) {
                            EnumC75383a5 enumC75383a5 = c84823qW.A12;
                            if (enumC75383a5 != EnumC75383a5.A0n) {
                                if (enumC75383a5 == EnumC75383a5.A0c) {
                                    C217859kI A0C = c84823qW.A0C();
                                    if (A0C != null) {
                                        Iterator it3 = A0C.A05.iterator();
                                        while (it3.hasNext()) {
                                            AbstractC167017dG.A1V(A1E2, it3);
                                        }
                                    }
                                } else if (enumC75383a5 == EnumC75383a5.A0o) {
                                }
                            }
                            User user = c84823qW.A1C;
                            if (user != null) {
                                A1E2.add(user.getId());
                            }
                        }
                        if (!A1E2.isEmpty()) {
                            AbstractC186788Pv.A00(AbstractC166997dE.A0W(c214959fX)).A01(c47z.A3t, A1E2);
                        }
                    }
                    C215239fz c215239fz = c214959fX.A03;
                    if (c215239fz == null) {
                        break;
                    }
                    EnumC222989sd enumC222989sd = c215239fz.A00;
                    if (enumC222989sd == EnumC222989sd.A09) {
                        A01 = AbstractC35082Fct.A01(AnonymousClass001.A0R("myWeek:", C17060sy.A01.A01(AbstractC166997dE.A0W(c214959fX)).getId()), null, EnumC53243Ngg.A06.A00, true);
                    } else if (enumC222989sd == EnumC222989sd.A08) {
                        A01 = AbstractC188518Wq.A00(AbstractC166997dE.A0W(c214959fX)).A00;
                    }
                    c47z.A1Y = A01;
                } else {
                    C215239fz c215239fz2 = c214959fX.A03;
                    if (c215239fz2 != null) {
                        EnumC222989sd enumC222989sd2 = c215239fz2.A00;
                        EnumC222989sd enumC222989sd3 = EnumC222989sd.A04;
                        if (enumC222989sd2 == enumC222989sd3) {
                            C684436h c684436h = c214959fX.A08;
                            if (c684436h == null) {
                                str = "closeFriendsController";
                            } else if (AbstractC34041F0u.A00(c684436h.A01) <= 0) {
                                C24042Ale c24042Ale = c214959fX.A04;
                                if (c24042Ale == null) {
                                    str = "delegate";
                                } else {
                                    C183688Ct c183688Ct2 = c214959fX.A00;
                                    c24042Ale.A03(c183688Ct2 != null ? !C183688Ct.A0M(c183688Ct2) : false);
                                    return;
                                }
                            }
                        }
                        C215239fz c215239fz3 = c214959fX.A03;
                        if (c215239fz3 != null) {
                            if (c215239fz3.A00 == EnumC222989sd.A05 && (!(A1E instanceof Collection) || !A1E.isEmpty())) {
                                Iterator it4 = A1E.iterator();
                                while (it4.hasNext()) {
                                    if (AbstractC101614hW.A0E(((C47Z) it4.next()).A4b)) {
                                        AbstractC35234FgS.A04(AbstractC166997dE.A0W(c214959fX), c214959fX.requireContext());
                                        return;
                                    }
                                }
                            }
                            C215239fz c215239fz4 = c214959fX.A03;
                            if (c215239fz4 != null) {
                                if (c215239fz4.A00 == EnumC222989sd.A0C && c214959fX.A0E != null && AbstractC166987dD.A1b(A1E)) {
                                    ArrayList A1E3 = AbstractC166987dD.A1E();
                                    Iterator it5 = A1E.iterator();
                                    while (it5.hasNext()) {
                                        List list2 = ((C47Z) it5.next()).A4h;
                                        ArrayList A1E4 = AbstractC166987dD.A1E();
                                        Iterator it6 = list2.iterator();
                                        while (it6.hasNext()) {
                                            String str2 = ((C55m) it6.next()).A09;
                                            if (str2 != null) {
                                                A1E4.add(str2);
                                            }
                                        }
                                        AnonymousClass016.A16(A1E4, A1E3);
                                    }
                                    C8YE c8ye = c214959fX.A0E;
                                    str = "offensiveContentWarningController";
                                    if (c8ye != null) {
                                        if (A1E3.isEmpty()) {
                                            A1E3 = AbstractC16960so.A1M("");
                                        }
                                        c8ye.A07(A1E3);
                                        C8YE c8ye2 = c214959fX.A0E;
                                        if (c8ye2 != null) {
                                            c8ye2.A04();
                                            return;
                                        }
                                    }
                                } else {
                                    C215239fz c215239fz5 = c214959fX.A03;
                                    if (c215239fz5 != null) {
                                        if (c215239fz5.A00 == enumC222989sd3 && (c183688Ct = c214959fX.A00) != null && (!C183688Ct.A0M(c183688Ct))) {
                                            C195918ld c195918ld = c214959fX.A05;
                                            if (c195918ld == null) {
                                                str = "shareToFBController";
                                            } else {
                                                if (c195918ld.A06()) {
                                                    OQA.A01(AbstractC166997dE.A0W(c214959fX), MSV.A00(546), "share_sheet", null);
                                                }
                                                OQA.A01(AbstractC166997dE.A0W(c214959fX), "primary_click_cf", "share_sheet", null);
                                            }
                                        }
                                        c214959fX.A07 = true;
                                        A04(c214959fX);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
    public static final void A04(C214959fX c214959fX) {
        Context applicationContext;
        String str;
        boolean z;
        String str2;
        C51690MsL c51690MsL;
        ?? obj = new Object();
        C51690MsL c51690MsL2 = C51690MsL.A03;
        obj.A00 = c51690MsL2;
        C47Z A00 = A00(c214959fX);
        Context context = c214959fX.getContext();
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            String str3 = null;
            if (A00 != null) {
                str = A00.A0H();
                str3 = C70343Ds.A01(A00);
                C215239fz c215239fz = c214959fX.A03;
                if (c215239fz == null) {
                    str2 = "adapter";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                int ordinal = c215239fz.A00.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 8) {
                            EnumC76383bi enumC76383bi = EnumC76383bi.A0C;
                            C14360o3.A0B(enumC76383bi, 0);
                            A00.A1F = enumC76383bi;
                            c51690MsL = C51690MsL.A0B;
                        }
                    } else {
                        EnumC76383bi enumC76383bi2 = EnumC76383bi.A07;
                        C14360o3.A0B(enumC76383bi2, 0);
                        A00.A1F = enumC76383bi2;
                        c51690MsL = C51690MsL.A07;
                    }
                } else {
                    EnumC76383bi enumC76383bi3 = EnumC76383bi.A04;
                    C14360o3.A0B(enumC76383bi3, 0);
                    A00.A1F = enumC76383bi3;
                    c51690MsL = C51690MsL.A05;
                }
                obj.A00 = c51690MsL;
            } else {
                str = null;
            }
            UserStoryTarget A07 = c214959fX.A07();
            Object obj2 = obj.A00;
            boolean A0K = C14360o3.A0K(c51690MsL2.toString(), obj.A00.toString());
            C183688Ct c183688Ct = c214959fX.A00;
            if (c183688Ct != null) {
                z = !C183688Ct.A0M(c183688Ct);
            } else {
                z = false;
            }
            C57575Pgn c57575Pgn = new C57575Pgn(obj2, A07, applicationContext, c214959fX, str3, str, 3, z);
            A06(c214959fX, true);
            if (z && A0K) {
                C200018t5 c200018t5 = c214959fX.A0D;
                if (c200018t5 == null) {
                    str2 = "clNoticeManager";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                C54804OJy A002 = AbstractC54221Nxz.A00(c214959fX.requireActivity(), C82G.A0t, AbstractC166997dE.A0W(c214959fX));
                A002.A0A = str;
                A002.A00 = c214959fX.requireContext();
                A002.A05 = new B42(c57575Pgn);
                A002.A01 = c214959fX;
                c200018t5.A01(null, A002, new C24056Als(applicationContext, c214959fX, A07, str, str3, obj, z));
                return;
            }
            A02(applicationContext, c214959fX, (C51690MsL) obj.A00, A07, str, str3, z);
        }
    }

    public static final void A06(C214959fX c214959fX, boolean z) {
        c214959fX.A0H = z;
        IgdsButton igdsButton = c214959fX.A0A;
        if (igdsButton != null) {
            igdsButton.setLoading(z);
            IgdsButton igdsButton2 = c214959fX.A0A;
            if (igdsButton2 != null) {
                igdsButton2.setEnabled(!z);
                return;
            }
        }
        C14360o3.A0F("shareButton");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.instagram.pendingmedia.model.GroupProfileUserStoryTarget, java.lang.Object, com.instagram.pendingmedia.model.UserStoryTarget] */
    public final UserStoryTarget A07() {
        C215239fz c215239fz = this.A03;
        if (c215239fz == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        switch (c215239fz.A00.ordinal()) {
            case 0:
                break;
            case 1:
                return UserStoryTarget.A02;
            case 2:
                return UserStoryTarget.A03;
            case 3:
            case 4:
                PendingRecipient pendingRecipient = this.A0B;
                if (pendingRecipient != null) {
                    ?? obj = new Object();
                    obj.A01 = "GROUP_PROFILE";
                    obj.A00 = pendingRecipient;
                    return obj;
                }
                break;
            case 5:
            case 9:
                return UserStoryTarget.A07;
            case 6:
                return UserStoryTarget.A09;
            case 7:
            case 10:
                return UserStoryTarget.A06;
            case 8:
                return UserStoryTarget.A08;
            default:
                throw B4Z.A00();
        }
        return UserStoryTarget.A01;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str;
        C215239fz c215239fz = this.A03;
        Integer num = null;
        if (c215239fz == null) {
            str = "adapter";
        } else {
            EnumC222989sd enumC222989sd = c215239fz.A00;
            if (enumC222989sd == EnumC222989sd.A0C || enumC222989sd == EnumC222989sd.A04) {
                C23031Ai A00 = AbstractC23021Ah.A00(AbstractC166997dE.A0W(this));
                int i = enumC222989sd.A00;
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
                A0w.E7D("private_story_share_sheet_story_target", i);
                A0w.apply();
            }
            if (this.A01 != null) {
                Intent intent = new Intent();
                intent.putExtra("DirectPrivateStoryRecipientFragment.DIRECT_PRIVATE_STORY_SHARE_SHEET_TARGET", enumC222989sd.A00);
                C195918ld c195918ld = this.A05;
                if (c195918ld == null) {
                    str = "shareToFBController";
                } else {
                    intent.putExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", c195918ld.A06());
                    ArrayList A1E = AbstractC166987dD.A1E();
                    A1E.add(A07());
                    C47Z A002 = A00(this);
                    Intent putExtra = intent.putExtra("bundle_extra_user_tapped_done_button", this.A07);
                    IngestSessionShim ingestSessionShim = this.A02;
                    if (ingestSessionShim == null) {
                        str = "ingestSession";
                    } else {
                        Intent putStringArrayListExtra = putExtra.putExtra("bundle_extra_ingest_session", ingestSessionShim).putExtra("arguments_open_hall_pass_creation_flow", this.A0G).putStringArrayListExtra(AbstractC111324zv.A00(336), this.A0F);
                        OWN own = this.A09;
                        if (own == null) {
                            str = "shareHelper";
                        } else {
                            Intent putExtra2 = putStringArrayListExtra.putParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets", own.A00.A04(InterfaceC37292Gbt.class)).putExtra("bundle_extra_user_story_targets", A1E);
                            if (A002 != null) {
                                l = Long.valueOf(A002.A0H);
                            } else {
                                l = null;
                            }
                            Intent putExtra3 = putExtra2.putExtra(MSV.A00(540), l);
                            if (A002 != null) {
                                l2 = Long.valueOf(A002.A0G);
                            } else {
                                l2 = null;
                            }
                            Intent putExtra4 = putExtra3.putExtra(MSV.A00(539), l2);
                            if (A002 != null) {
                                l3 = Long.valueOf(A002.A0S);
                            } else {
                                l3 = null;
                            }
                            Intent putExtra5 = putExtra4.putExtra("upload_media_width", l3);
                            if (A002 != null) {
                                l4 = Long.valueOf(A002.A0R);
                            } else {
                                l4 = null;
                            }
                            Intent putExtra6 = putExtra5.putExtra("upload_media_height", l4);
                            if (A002 != null) {
                                num = Integer.valueOf(A002.A08);
                            }
                            putExtra6.putExtra("exif_orientation", num);
                            InterfaceC58031PoH interfaceC58031PoH = this.A01;
                            if (interfaceC58031PoH != null) {
                                interfaceC58031PoH.Dlo(intent, this.A07);
                                return;
                            }
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0J);
    }

    public static final C47Z A00(C214959fX c214959fX) {
        PendingMediaStore A00 = C25A.A00(AbstractC166997dE.A0W(c214959fX));
        IngestSessionShim ingestSessionShim = c214959fX.A02;
        if (ingestSessionShim == null) {
            C14360o3.A0F("ingestSession");
            throw C00O.createAndThrow();
        }
        return A00.A03((String) AbstractC166987dD.A16(ingestSessionShim.A00));
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [X.6zr, java.lang.Object] */
    public static final void A05(C214959fX c214959fX) {
        boolean z;
        InterfaceC65642y0 interfaceC65642y0;
        C47Z A00 = A00(c214959fX);
        boolean z2 = false;
        if (A00 != null) {
            List list = A00.A4b;
            C14360o3.A0B(list, 0);
            z = AbstractC167007dF.A1W(C48r.A00(EnumC75383a5.A0g, list));
        } else {
            z = false;
        }
        C215239fz c215239fz = c214959fX.A03;
        Integer num = null;
        if (c215239fz == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        boolean z3 = !z;
        C183688Ct c183688Ct = c214959fX.A00;
        if (c183688Ct != null) {
            z2 = !C183688Ct.A0M(c183688Ct);
        }
        C183688Ct c183688Ct2 = c214959fX.A00;
        if (c183688Ct2 != null) {
            num = c183688Ct2.A0S;
        }
        c215239fz.clear();
        UserSession userSession = c215239fz.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36319871247654617L);
        boolean A062 = C18U.A06(C06090Tz.A06, userSession, 36321627889411731L);
        if (A062) {
            c215239fz.addModel(new C31335Dq0(2131973639), new Object(), c215239fz.A0C);
        }
        c215239fz.addModel(new C56099OvJ(num, AbstractC167007dF.A1X(c215239fz.A00, EnumC222989sd.A0C), z2), c215239fz.A0B);
        if (z3 && (!A06 || C18U.A06(c06090Tz, userSession, 36319871248834277L))) {
            c215239fz.addModel(new LZR(AbstractC167007dF.A1X(c215239fz.A00, EnumC222989sd.A04), z2), c215239fz.A04);
        }
        boolean z4 = true;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(c06090Tz, userSession, 36322233480063045L) && C18U.A06(c06090Tz, userSession, 36322233480194119L)) {
            boolean A1X = AbstractC167007dF.A1X(c215239fz.A00, EnumC222989sd.A09);
            if (!AbstractC156236zs.A00(new Object(), userSession).A01().A02 && !A1X) {
                z4 = false;
            }
            c215239fz.addModel(new Ov9(A1X, z4), c215239fz.A0A);
        }
        if (A06 && !C18U.A06(c06090Tz, userSession, 36319871248834277L)) {
            c215239fz.addModel(new C36193Fy7(AbstractC167007dF.A1X(c215239fz.A00, EnumC222989sd.A03), AbstractC186998Qs.A00(userSession).A00), c215239fz.A02);
        }
        if (AbstractC151756sL.A01() && AbstractC151756sL.A00().A05(userSession)) {
            c215239fz.addModel(new Ov8(AbstractC167007dF.A1X(c215239fz.A00, EnumC222989sd.A0A), userSession), c215239fz.A08);
        }
        C36182Fxw c36182Fxw = null;
        if (C3DL.A01(userSession, true) && !C18U.A06(c06090Tz, userSession, 36320279270334711L)) {
            if (C18U.A06(c06090Tz, userSession, 36320279270269174L)) {
                interfaceC65642y0 = c215239fz.A03;
            } else {
                c36182Fxw = new C36182Fxw(AbstractC166987dD.A0x(userSession).getInt(AbstractC111324zv.A00(2432), 0));
                interfaceC65642y0 = c215239fz.A06;
            }
            c215239fz.addModel(c36182Fxw, interfaceC65642y0);
        }
        if (C18U.A06(c06090Tz, userSession, 36318389483870329L)) {
            c215239fz.addModel(Boolean.valueOf(AbstractC167007dF.A1X(c215239fz.A00, EnumC222989sd.A08)), c215239fz.A09);
        }
        boolean A002 = AbstractC63292u7.A00(userSession);
        if (A062) {
            if (A002) {
                c215239fz.addModel(Boolean.valueOf(AbstractC167007dF.A1X(c215239fz.A00, EnumC222989sd.A05)), c215239fz.A05);
            }
            c215239fz.addModel(new C31335Dq0(2131969960), new Object(), c215239fz.A0C);
        } else if (A002) {
            c215239fz.addModel(Boolean.valueOf(AbstractC167007dF.A1X(c215239fz.A00, EnumC222989sd.A05)), c215239fz.A05);
        }
        c215239fz.addModel(null, c215239fz.A07);
        c215239fz.notifyDataSetChangedSmart();
    }

    @Override // X.InterfaceC25176BBy
    public final void EYH(InterfaceC58031PoH interfaceC58031PoH) {
        this.A01 = interfaceC58031PoH;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayList;
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        ArrayList<String> stringArrayListExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 529959155 && i2 == -1) {
            if (intent != null && (stringArrayListExtra = intent.getStringArrayListExtra(AbstractC111324zv.A00(336))) != null) {
                arrayList = AbstractC166987dD.A1F(stringArrayListExtra);
            } else {
                arrayList = null;
            }
            this.A0F = arrayList;
            this.A07 = true;
            C24042Ale c24042Ale = this.A04;
            if (c24042Ale == null) {
                C14360o3.A0F("delegate");
                throw C00O.createAndThrow();
            }
            Fragment fragment = c24042Ale.A05.mParentFragment;
            if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null && (c189478aR = bottomSheetFragment.A02) != null) {
                c189478aR.A0L(null);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        A05(this);
        A01();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC222989sd enumC222989sd;
        IllegalStateException A14;
        int i;
        int i2;
        int A02 = C0f9.A02(288245288);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A0J;
        GroupProfileStoryRecipient groupProfileStoryRecipient = null;
        this.A05 = OQ9.A01(AbstractC166987dD.A0r(interfaceC09390do), null);
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r, 0);
        this.A0C = new C8DP(A0r);
        C195918ld c195918ld = this.A05;
        if (c195918ld != null) {
            boolean z = false;
            c195918ld.A04(requireArguments.getBoolean("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", false));
            C195918ld c195918ld2 = this.A05;
            if (c195918ld2 != null) {
                c195918ld2.A00 = new C56731PFz(this, 0);
                this.A08 = new C684436h(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
                this.A02 = (IngestSessionShim) AbstractC153636vY.A00(requireArguments, IngestSessionShim.class, "DirectPrivateStoryRecipientFragment.INGEST_SESSION");
                IngestSessionShim ingestSessionShim = (IngestSessionShim) requireArguments.getParcelable("DirectPrivateStoryRecipientFragment.INGEST_SESSION_FOR_DIRECT");
                ArchivePendingUpload archivePendingUpload = (ArchivePendingUpload) AbstractC153636vY.A00(requireArguments, ArchivePendingUpload.class, "bundle_extra_archive_pending_upload");
                requireArguments.getBoolean("DirectPrivateStoryRecipientFragment.SHARE_TO_FRIENDS_STORY_TARGET_ENABLED", true);
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                FragmentActivity requireActivity = requireActivity();
                IngestSessionShim ingestSessionShim2 = this.A02;
                String str = "ingestSession";
                if (ingestSessionShim2 != null) {
                    C195918ld c195918ld3 = this.A05;
                    if (c195918ld3 != null) {
                        C8DP c8dp = this.A0C;
                        if (c8dp != null) {
                            C684436h c684436h = this.A08;
                            if (c684436h == null) {
                                str = "closeFriendsController";
                            } else {
                                this.A04 = new C24042Ale(requireActivity, archivePendingUpload, c684436h, A0r2, ingestSessionShim2, ingestSessionShim, this, A00(this), c8dp, c195918ld3, new B8S(this, 46), requireArguments.getBoolean("DirectPrivateStoryRecipientFragment.DIRECT_IS_MULTI_CAPTURE"));
                                PendingRecipient pendingRecipient = (PendingRecipient) requireArguments.getParcelable("target_group_profile_recipient");
                                this.A0B = pendingRecipient;
                                if (pendingRecipient != null) {
                                    if (pendingRecipient.A0Y) {
                                        enumC222989sd = EnumC222989sd.A0A;
                                    } else {
                                        enumC222989sd = EnumC222989sd.A0B;
                                        C18A A00 = AnonymousClass189.A00(AbstractC166987dD.A0r(interfaceC09390do));
                                        PendingRecipient pendingRecipient2 = this.A0B;
                                        if (pendingRecipient2 != null) {
                                            User A022 = A00.A02(pendingRecipient2.getId());
                                            PendingRecipient pendingRecipient3 = this.A0B;
                                            if (pendingRecipient3 != null) {
                                                if (A022 != null) {
                                                    z = AbstractC166997dE.A1Z(A022.A0J(), true);
                                                    Integer B7S = A022.A03.B7S();
                                                    if (B7S != null) {
                                                        i2 = B7S.intValue();
                                                        groupProfileStoryRecipient = new GroupProfileStoryRecipient(pendingRecipient3, i2, z);
                                                    }
                                                }
                                                i2 = 0;
                                                groupProfileStoryRecipient = new GroupProfileStoryRecipient(pendingRecipient3, i2, z);
                                            } else {
                                                A14 = AbstractC166987dD.A14("Required value was null.");
                                                i = 622606539;
                                            }
                                        } else {
                                            A14 = AbstractC166987dD.A14("Required value was null.");
                                            i = 843397700;
                                        }
                                        C0f9.A09(i, A02);
                                        throw A14;
                                    }
                                } else {
                                    if (!C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36319871247654617L) && !C3DL.A01(AbstractC166987dD.A0r(interfaceC09390do), true)) {
                                        int i3 = 0;
                                        int i4 = AbstractC166987dD.A0x(AbstractC166987dD.A0r(interfaceC09390do)).getInt("private_story_share_sheet_story_target", 0);
                                        EnumC222989sd[] values = EnumC222989sd.values();
                                        int length = values.length;
                                        while (true) {
                                            if (i3 < length) {
                                                enumC222989sd = values[i3];
                                                if (enumC222989sd.A00 == i4) {
                                                    break;
                                                } else {
                                                    i3++;
                                                }
                                            } else {
                                                enumC222989sd = EnumC222989sd.A0C;
                                                break;
                                            }
                                        }
                                    } else {
                                        enumC222989sd = EnumC222989sd.A0C;
                                    }
                                }
                                Context requireContext = requireContext();
                                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                                C195918ld c195918ld4 = this.A05;
                                if (c195918ld4 != null) {
                                    C8DP c8dp2 = this.A0C;
                                    if (c8dp2 != null) {
                                        C24042Ale c24042Ale = this.A04;
                                        if (c24042Ale == null) {
                                            str = "delegate";
                                        } else {
                                            this.A03 = new C215239fz(requireContext, this, A0r3, groupProfileStoryRecipient, c24042Ale, enumC222989sd, c8dp2, c195918ld4);
                                            this.A09 = new OWN(new B8S(this, 47));
                                            setModuleNameV2("private_stories_share_sheet");
                                            this.A0D = new C200018t5(AbstractC166987dD.A0r(interfaceC09390do));
                                            AbstractC25651Mw.A00(AbstractC166987dD.A0o(interfaceC09390do)).A01(this.A0L, C23609Ad4.class);
                                            OWN own = this.A09;
                                            if (own == null) {
                                                str = "shareHelper";
                                            } else {
                                                UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do);
                                                IngestSessionShim ingestSessionShim3 = this.A02;
                                                if (ingestSessionShim3 != null) {
                                                    C14360o3.A0B(A0r4, 0);
                                                    if (C18U.A06(C06090Tz.A05, A0r4, 36320841910657974L)) {
                                                        Iterator it = ingestSessionShim3.A00.iterator();
                                                        while (it.hasNext()) {
                                                            C47Z A03 = C25A.A00(A0r4).A03(AbstractC166987dD.A1B(it));
                                                            if (A03 != null) {
                                                                if (A03.A1G == EnumC40111tc.A0Q) {
                                                                    A03.A19 = new A8E(A0r4, own, A03);
                                                                } else {
                                                                    C40121td.A0G.A01(A0r4.deviceSession.A06(), A0r4).A0G(A03, false, false);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    C0f9.A09(-176333397, A02);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        C14360o3.A0F("shareToFBCloseFriendsController");
                        throw C00O.createAndThrow();
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F("shareToFBController");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-132984195);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_private_story_share_sheet, viewGroup, false);
        C0f9.A09(607526598, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2043612751);
        super.onDestroyView();
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0o(this.A0J));
        A00.A02(this.A0L, C23609Ad4.class);
        A00.A02(this.A0I, C211849aB.class);
        C0f9.A09(1126475757, A02);
    }
}
