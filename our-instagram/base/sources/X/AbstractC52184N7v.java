package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.N7v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52184N7v extends AbstractC43842Ja5 implements C51E, C51D {
    public static final String __redex_internal_original_name = "IgLiveQuestionBaseFragment";
    public LinearLayout A00;
    public TextView A01;
    public TextView A02;
    public C147896lL A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.AbstractC43842Ja5
    public Collection getDefinitions() {
        EnumC142806cg enumC142806cg;
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A07);
        if (this instanceof C52837NZu) {
            enumC142806cg = EnumC142806cg.A05;
        } else {
            enumC142806cg = EnumC142806cg.A03;
        }
        return AbstractC16960so.A1Q(new V5S(requireContext, this, A0r, enumC142806cg, this), new C52350NEo(C57729PjI.A00));
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view.requireViewById(R.id.question_sheet_empty_container);
        C14360o3.A0B(linearLayout, 0);
        this.A00 = linearLayout;
        TextView A0T = AbstractC166997dE.A0T(view, R.id.question_sheet_empty_title);
        C14360o3.A0B(A0T, 0);
        this.A02 = A0T;
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.question_sheet_empty_description);
        C14360o3.A0B(A0T2, 0);
        this.A01 = A0T2;
        getRecyclerView().setOverScrollMode(1);
        C147896lL c147896lL = this.A03;
        if (c147896lL != null) {
            AbstractC37301Gc2.A0w(getViewLifecycleOwner(), c147896lL.A02, C57755Pji.A02(this, 31), 33);
        }
        C147896lL c147896lL2 = this.A03;
        if (c147896lL2 != null) {
            String str = this.A04;
            if (str != null) {
                c147896lL2.A05(str, true);
            } else {
                C14360o3.A0F("broadcastId");
                throw C00O.createAndThrow();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.2zP] */
    public final List A0C() {
        Context requireContext;
        int i;
        if (this instanceof C52837NZu) {
            C52837NZu c52837NZu = (C52837NZu) this;
            Context requireContext2 = c52837NZu.requireContext();
            String str = c52837NZu.A04;
            if (str == null) {
                C14360o3.A0F("broadcaster");
                throw C00O.createAndThrow();
            }
            return AbstractC16960so.A1Q(new C56122Ovh("QUESTION_SHEET_DESCRIPTION_TITLE", null, AbstractC167007dF.A0f(requireContext2, str, 2131965474)), new Object());
        }
        String str2 = null;
        if (this.A06) {
            requireContext = requireContext();
            i = 2131965481;
        } else {
            boolean z = this.A05;
            requireContext = requireContext();
            if (z) {
                i = 2131965472;
            } else {
                str2 = requireContext.getString(2131965475);
                requireContext = requireContext();
                i = 2131965473;
            }
        }
        String string = requireContext.getString(i);
        ArrayList A1E = AbstractC166987dD.A1E();
        C56122Ovh.A00("QUESTION_SHEET_DESCRIPTION_TITLE", str2, string, A1E);
        return A1E;
    }

    public void A0D() {
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            A0B(C16930sl.A00);
        } else {
            C14360o3.A0F("emptyStateContainer");
            throw C00O.createAndThrow();
        }
    }

    public final void A0E(long j) {
        C193328hC A0O;
        int i;
        C141796aw A00;
        InterfaceC23621Ds interfaceC23621Ds;
        int i2;
        if (this instanceof C52837NZu) {
            C147896lL c147896lL = this.A03;
            if (c147896lL != null) {
                String str = this.A04;
                if (str != null) {
                    OM6 om6 = (OM6) c147896lL.A08.A08.get(Long.valueOf(j));
                    if (om6 != null && om6.A06 == EnumC223199sy.A06) {
                        boolean z = om6.A09;
                        long j2 = om6.A01;
                        if (z) {
                            C147896lL.A01(c147896lL, -1, j2, false);
                            A00 = AbstractC141776au.A00(c147896lL);
                            interfaceC23621Ds = null;
                            i2 = 35;
                        } else {
                            C147896lL.A01(c147896lL, 1, j2, true);
                            A00 = AbstractC141776au.A00(c147896lL);
                            interfaceC23621Ds = null;
                            i2 = 34;
                        }
                        AbstractC166987dD.A1Z(new PZQ(om6, c147896lL, str, interfaceC23621Ds, i2), A00);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } else {
            if (this.A06) {
                A0O = AbstractC31175DnJ.A0O(this);
                i = 2131965481;
            } else if (this.A05) {
                A0O = AbstractC31175DnJ.A0O(this);
                i = 2131965472;
            } else {
                C147896lL c147896lL2 = this.A03;
                if (c147896lL2 == null) {
                    return;
                }
                String str2 = this.A04;
                if (str2 != null) {
                    C2GS c2gs = c147896lL2.A03;
                    OM6 om62 = (OM6) c2gs.A02();
                    if (om62 != null && om62.A01 == j) {
                        return;
                    }
                    Object obj = c147896lL2.A08.A08.get(Long.valueOf(j));
                    if (obj != null) {
                        c2gs.A0B(obj);
                    } else {
                        C0w9.A03("IgLiveQuestionsViewModel", AnonymousClass001.A0Q("Attempt to update a question that doesn't exist: ", j));
                    }
                    AbstractC166987dD.A1Z(new C50111MAj(c147896lL2, str2, null, 4, j), AbstractC141776au.A00(c147896lL2));
                    return;
                }
            }
            A0O.A09(i);
            AbstractC31176DnK.A1W(A0O);
            return;
        }
        C14360o3.A0F("broadcastId");
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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
    public final int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57755Pji.A02(this, 30));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
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

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r14 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r10.A06 != X.EnumC223199sy.A06) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (X.C14360o3.A0K(X.AbstractC31176DnK.A0g(X.C17060sy.A01, r31.A07), r10.A04) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A00(X.AbstractC52184N7v r31, java.util.List r32, int r33) {
        /*
            java.util.ArrayList r11 = X.AbstractC167017dG.A0q(r32)
            java.util.Iterator r15 = r32.iterator()
        L8:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r10 = r15.next()
            X.OM6 r10 = (X.OM6) r10
            X.Nhu r1 = X.EnumC53318Nhu.A04
            X.Nhu r0 = r10.A05
            r4 = r31
            if (r1 != r0) goto L2d
            X.0cb r1 = X.C17060sy.A01
            X.0do r0 = r4.A07
            com.instagram.user.model.User r1 = X.AbstractC31176DnK.A0g(r1, r0)
            com.instagram.user.model.User r0 = r10.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r14 = 1
            if (r0 != 0) goto L2e
        L2d:
            r14 = 0
        L2e:
            long r1 = r10.A01
            java.lang.String r13 = r10.A08
            com.instagram.common.typedurl.ImageUrl r9 = r10.A03
            com.instagram.user.model.User r8 = r10.A04
            int r7 = r10.A00
            r5 = r33
            if (r33 == 0) goto La1
            X.9sy r3 = r10.A06
            X.9sy r0 = X.EnumC223199sy.A06
            if (r3 != r0) goto La1
            float r6 = (float) r7
            float r0 = (float) r5
            float r6 = r6 / r0
        L45:
            boolean r0 = r4 instanceof X.C52837NZu
            if (r0 == 0) goto L9e
            X.6cg r12 = X.EnumC142806cg.A05
        L4b:
            X.6cg r5 = X.EnumC142806cg.A03
            if (r12 == r5) goto L53
            r26 = 0
            if (r14 == 0) goto L55
        L53:
            r26 = 1
        L55:
            if (r12 == r5) goto L9b
            X.9sy r3 = r10.A06
            X.9sy r0 = X.EnumC223199sy.A06
            if (r3 == r0) goto L61
            boolean r0 = r10.A09
            if (r0 == 0) goto L9b
        L61:
            r27 = 1
        L63:
            boolean r4 = r10.A09
            if (r12 == r5) goto L6f
            X.9sy r3 = r10.A06
            X.9sy r0 = X.EnumC223199sy.A06
            r29 = 1
            if (r3 == r0) goto L71
        L6f:
            r29 = 0
        L71:
            if (r12 == r5) goto L77
            r30 = 0
            if (r14 != 0) goto L79
        L77:
            r30 = 1
        L79:
            X.9sy r3 = r10.A06
            X.MtU r5 = r10.A02
            X.WhA r0 = new X.WhA
            r24 = r1
            r28 = r4
            r21 = r13
            r22 = r6
            r23 = r7
            r18 = r9
            r19 = r8
            r20 = r3
            r16 = r0
            r17 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30)
            r11.add(r0)
            goto L8
        L9b:
            r27 = 0
            goto L63
        L9e:
            X.6cg r12 = X.EnumC142806cg.A03
            goto L4b
        La1:
            r6 = 0
            goto L45
        La3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC52184N7v.A00(X.N7v, java.util.List, int):java.util.List");
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        return !getRecyclerView().canScrollVertically(1);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return !AbstractC43592JPx.A1X(getRecyclerView());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1174673413);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("IgLiveQuestionListFragment.ARGUMENTS_KEY_EXTRA_BROADCAST_ID", "0");
        C14360o3.A0B(string, 0);
        this.A04 = string;
        this.A05 = requireArguments.getBoolean("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_IS_BADGES_ENABLED", false);
        this.A06 = requireArguments.getBoolean("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_IS_DONATIONS_ENABLED", false);
        C0f9.A09(1299322917, A02);
    }
}
