package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class KDK extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "PromptNoteConsumptionSheetFragment";
    public View A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public C66362zD A04;
    public IgLinearLayout A05;
    public IgLinearLayout A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public NotesRepository A0B;
    public C4F8 A0C;
    public C4F7 A0D;
    public C47956LGs A0E;
    public LLB A0F;
    public SpinnerImageView A0G;
    public String A0H;
    public boolean A0I;
    public RecyclerView A0J;
    public IgTextView A0K;
    public C57112jm A0L;
    public final C49622LwF A0M;
    public final String A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (AbstractC167007dF.A1Z(this.A0O)) {
            C07S c07s = C07S.RESUMED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
            MCI mci = new MCI(viewLifecycleOwner, c07s, this, null, 42);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, mci, A00);
            AbstractC23641Du.A05(anonymousClass191, new MCI(A0K, c07s, this, null, 43), C07Y.A00(A0K));
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0N;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0Q);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A0J;
        if (recyclerView != null && AbstractC43592JPx.A1X(recyclerView)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public KDK() {
        MHM mhm = new MHM(this, 20);
        MHM mhm2 = new MHM(this, 14);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = MHM.A00(mhm2, enumC09460dv, 15);
        this.A0S = AbstractC25225BEi.A0a(new MHM(A00, 16), mhm, new C50170MDx(39, null, A00), AbstractC25225BEi.A1D(Jn0.class));
        MHM mhm3 = new MHM(this, 13);
        InterfaceC09390do A002 = MHM.A00(new MHM(this, 17), enumC09460dv, 18);
        this.A0P = AbstractC25225BEi.A0a(new MHM(A002, 19), mhm3, new C50170MDx(40, null, A002), AbstractC25225BEi.A1D(Jn3.class));
        this.A0R = AbstractC60492pY.A02(this);
        this.A0O = AbstractC09440dt.A01(new MHM(this, 12));
        this.A0Q = AbstractC60492pY.A02(this);
        this.A0N = "prompt_note_consumption_sheet";
        this.A0M = new C49622LwF(this);
    }

    public static final void A00(View view, KDK kdk, String str, int i, boolean z) {
        C146106i8 A0j = AbstractC25229BEm.A0j();
        A0j.A0H = str;
        AbstractC31172DnG.A1H(AbstractC166997dE.A0N(kdk), A0j, i);
        view.postDelayed(new M5Z(kdk, A0j.A00(), z), 1000L);
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(25948151);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("arg_prompt_id")) == null) {
            str = "";
        }
        this.A0H = str;
        C49622LwF c49622LwF = this.A0M;
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A0Q;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str2 = this.A0H;
        String str3 = "promptId";
        if (str2 != null) {
            C14360o3.A0B(A0r, 1);
            c49622LwF.A01 = str2;
            c49622LwF.A00 = A0r;
            c49622LwF.A02 = AbstractC25225BEi.A16(requireActivity);
            this.A0B = C4A5.A00(AbstractC166987dD.A0r(interfaceC09390do));
            this.A0D = new C48759LhR(this, 2);
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            C4F7 c4f7 = this.A0D;
            if (c4f7 == null) {
                str3 = "notesViewModelListener";
            } else {
                String str4 = this.A0H;
                if (str4 != null) {
                    C14360o3.A0B(A0r2, 0);
                    this.A0C = new C4F8(this, this, A0r2, c4f7, str4, false);
                    this.A0L = C57112jm.A00();
                    C0f9.A09(310753578, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0191  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r35, android.view.ViewGroup r36, android.os.Bundle r37) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KDK.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C47956LGs c47956LGs;
        InterfaceC678133v interfaceC678133v;
        int A02 = C0f9.A02(-420576539);
        super.onDestroyView();
        this.A00 = null;
        C47956LGs c47956LGs2 = this.A0E;
        if (c47956LGs2 != null && (interfaceC678133v = c47956LGs2.A00) != null) {
            interfaceC678133v.release();
        }
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A0R), 36330638731199440L) && (c47956LGs = this.A0E) != null) {
            c47956LGs.A00 = null;
        }
        this.A0E = null;
        this.A02 = null;
        InterfaceC09390do interfaceC09390do = this.A0Q;
        C135976Dc A0V = AbstractC43594JPz.A0V(interfaceC09390do);
        String str = A0V.A07.A00;
        if (str != null || A0V.A04) {
            Iterator it = A0V.A0D.iterator();
            while (it.hasNext()) {
                C135976Dc.A06(A0V, (C4F5) AbstractC43592JPx.A17(it).A00, str, AbstractC166987dD.A0N(r0.A01));
            }
        }
        AbstractC43594JPz.A0V(interfaceC09390do).A0D.clear();
        C0f9.A09(1246250962, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC678133v interfaceC678133v;
        C47956LGs c47956LGs;
        InterfaceC678133v interfaceC678133v2;
        int A02 = C0f9.A02(1905330405);
        super.onPause();
        C47956LGs c47956LGs2 = this.A0E;
        if (c47956LGs2 != null && (interfaceC678133v = c47956LGs2.A00) != null && interfaceC678133v.isPlaying() && (c47956LGs = this.A0E) != null && (interfaceC678133v2 = c47956LGs.A00) != null) {
            interfaceC678133v2.pause();
        }
        AbstractC43593JPy.A0X(this).A04();
        C0f9.A09(124711108, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1376683604);
        super.onResume();
        Jn0 A0X = AbstractC43593JPy.A0X(this);
        java.util.Set keySet = A0X.A04.keySet();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : keySet) {
            AbstractC43593JPy.A1R(A0X.A04.get(obj), true, obj, A1E);
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), A0q);
        }
        if (AbstractC166987dD.A1b(A0q)) {
            A0X.A00 = AbstractC43593JPy.A06();
        }
        C49622LwF c49622LwF = this.A0M;
        c49622LwF.A02 = AbstractC25225BEi.A16(c49622LwF.A04.requireActivity());
        c49622LwF.A03 = false;
        C0f9.A09(1196085031, A02);
    }
}
