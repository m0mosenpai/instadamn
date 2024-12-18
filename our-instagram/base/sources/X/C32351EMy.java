package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.direct.prompts.DirectEditAddYoursParams;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;
import java.util.TimeZone;

/* renamed from: X.EMy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32351EMy extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "DirectAddYoursCreationFragment";
    public int A01;
    public Context A02;
    public IgEditText A03;
    public IgTextView A04;
    public C7FQ A05;
    public FRk A06;
    public C31826Dyk A07;
    public DirectEditAddYoursParams A08;
    public DirectPromptTypes A09;
    public DirectThreadKey A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public int A0F;
    public final EnumC33420Epr A0H = EnumC33420Epr.A05;
    public int A00 = 0;
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "prompts_fragment";
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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (r28.A08 != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f7  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32351EMy.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final String A00(C32351EMy c32351EMy) {
        String str;
        String str2;
        IgEditText igEditText = c32351EMy.A03;
        if (igEditText == null) {
            str = "textField";
        } else {
            String A1A = AbstractC25228BEl.A1A(AbstractC167007dF.A0g(igEditText));
            C31826Dyk c31826Dyk = c32351EMy.A07;
            str = "promptNamingSuggestionsViewModel";
            if (c31826Dyk != null) {
                FIX fix = c31826Dyk.A01;
                if (fix != null) {
                    str2 = fix.A01;
                } else {
                    str2 = null;
                }
                if (!AbstractC002300n.A0g(A1A, str2, true) || fix == null) {
                    return null;
                }
                return fix.A00;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(C32351EMy c32351EMy) {
        EnumC33506Erf enumC33506Erf;
        String str;
        FRk fRk = c32351EMy.A06;
        if (fRk == null) {
            str = "directPromptsPrivateAndSocialGroupsLogger";
        } else {
            EnumC33511Erk enumC33511Erk = EnumC33511Erk.SEND;
            if (c32351EMy.A08 == null) {
                enumC33506Erf = EnumC33506Erf.PROMPT;
            } else {
                enumC33506Erf = EnumC33506Erf.EDIT_FLOW;
            }
            String A00 = A00(c32351EMy);
            DirectThreadKey directThreadKey = c32351EMy.A0A;
            str = "threadKey";
            if (directThreadKey != null) {
                fRk.A00(enumC33511Erk, enumC33506Erf, A00, directThreadKey.A00, null);
                C7TG A002 = AbstractC165967bO.A00(AbstractC166987dD.A0r(c32351EMy.A0G));
                DirectThreadKey directThreadKey2 = c32351EMy.A0A;
                if (directThreadKey2 != null) {
                    IgEditText igEditText = c32351EMy.A03;
                    if (igEditText == null) {
                        str = "textField";
                    } else {
                        String A0g = AbstractC167007dF.A0g(igEditText);
                        Context context = c32351EMy.A02;
                        if (context == null) {
                            str = "viewContext";
                        } else {
                            A002.A0E(null, directThreadKey2, null, A0g, AbstractC166997dE.A0p(context, c32351EMy.A0H.A00), null, null, TimeZone.getDefault().getID(), A00(c32351EMy), 154, c32351EMy.A00);
                            C7FQ c7fq = c32351EMy.A05;
                            if (c7fq == null) {
                                str = "logger";
                            } else {
                                DirectThreadKey directThreadKey3 = c32351EMy.A0A;
                                if (directThreadKey3 != null) {
                                    String str2 = directThreadKey3.A00;
                                    String str3 = directThreadKey3.A01;
                                    int i = c32351EMy.A01;
                                    int i2 = c32351EMy.A0F;
                                    String str4 = c32351EMy.A0B;
                                    if (str4 == null) {
                                        str = "currentTabAsString";
                                    } else {
                                        c7fq.A09(C7D2.A01(str4), str2, str3, i, i2, c32351EMy.A0E);
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X.0pQ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        IllegalStateException A14;
        int i;
        Integer A0X;
        Integer A0X2;
        DirectPromptTypes directPromptTypes;
        DirectEditAddYoursParams directEditAddYoursParams;
        String str;
        int A02 = C0f9.A02(1674451746);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            parcelable = bundle2.getParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY);
        } else {
            parcelable = null;
        }
        if (parcelable != null) {
            this.A0A = (DirectThreadKey) parcelable;
            InterfaceC09390do interfaceC09390do = this.A0G;
            this.A05 = C7FP.A00(this, AbstractC166987dD.A0r(interfaceC09390do));
            this.A06 = new FRk(this, AbstractC166987dD.A0r(interfaceC09390do));
            this.A0B = AbstractC167007dF.A0h(this.A0H.toString());
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && (A0X = AbstractC31179DnN.A0X(bundle3, "direct_thread_sub_type")) != null) {
                this.A01 = A0X.intValue();
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null && (A0X2 = AbstractC31179DnN.A0X(bundle4, "direct_thread_audience_type")) != null) {
                    this.A0F = A0X2.intValue();
                    Bundle bundle5 = this.mArguments;
                    if (bundle5 != null) {
                        directPromptTypes = (DirectPromptTypes) bundle5.getParcelable("direct_recurring_prompt_type");
                    } else {
                        directPromptTypes = null;
                    }
                    this.A09 = directPromptTypes;
                    Bundle bundle6 = this.mArguments;
                    if (bundle6 != null) {
                        directEditAddYoursParams = (DirectEditAddYoursParams) bundle6.getParcelable("direct_edit_add_yours_params");
                    } else {
                        directEditAddYoursParams = null;
                    }
                    this.A08 = directEditAddYoursParams;
                    if (directEditAddYoursParams != null) {
                        str2 = directEditAddYoursParams.A01;
                    }
                    this.A0C = str2;
                    C7FQ c7fq = this.A05;
                    if (c7fq == null) {
                        str = "logger";
                    } else {
                        DirectThreadKey directThreadKey = this.A0A;
                        str = "threadKey";
                        if (directThreadKey != null) {
                            String str3 = directThreadKey.A00;
                            String str4 = directThreadKey.A01;
                            int i2 = this.A01;
                            int i3 = this.A0F;
                            String str5 = this.A0B;
                            if (str5 == null) {
                                str = "currentTabAsString";
                            } else {
                                c7fq.A01(C7D2.A01(str5), str3, str4, i2, i3);
                                super.onCreate(bundle);
                                Context requireContext = requireContext();
                                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                                EnumC33420Epr enumC33420Epr = EnumC33420Epr.A05;
                                C31826Dyk c31826Dyk = new C31826Dyk(requireContext, A0r, enumC33420Epr, AbstractC167007dF.A1W(this.A08));
                                this.A07 = c31826Dyk;
                                UserSession A0M = AbstractC31180DnO.A0M(interfaceC09390do);
                                if (c31826Dyk.A04 == enumC33420Epr) {
                                    ?? obj = new Object();
                                    int A07 = AbstractC25225BEi.A07(C06090Tz.A05, A0M, 36605546702509351L);
                                    obj.A00 = A07;
                                    if (A07 < 1) {
                                        obj.A00 = 60;
                                        A07 = 60;
                                    }
                                    C31456Ds0 c31456Ds0 = new C31456Ds0(16, obj, c31826Dyk);
                                    C1ON A00 = AbstractC54133NwV.A00(null, A0M, EnumC33442EqE.A06, EnumC33440EqC.A04, null, null, A07);
                                    A00.A00 = c31456Ds0;
                                    C1GJ.A03(A00);
                                }
                                C0f9.A09(1097466565, A02);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = 436053834;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1012548623;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 231058814;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1520143322);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_add_yours_sheet, viewGroup, false);
        C0f9.A09(-1689734509, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1951722225);
        super.onPause();
        IgEditText igEditText = this.A03;
        if (igEditText == null) {
            C14360o3.A0F("textField");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0O(igEditText);
        C0f9.A09(1577224192, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1959454135);
        super.onResume();
        IgEditText igEditText = this.A03;
        if (igEditText == null) {
            C14360o3.A0F("textField");
            throw C00O.createAndThrow();
        }
        igEditText.requestFocus();
        C0f9.A09(523179707, A02);
    }
}
