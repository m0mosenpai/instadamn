package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2uI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63352uI implements InterfaceC60152ox, InterfaceC63362uJ {
    public int A00;
    public int A01;
    public Integer A02;
    public String A03;
    public final Fragment A04;
    public final C25671My A05;
    public final InterfaceC60682pr A06;
    public final UserSession A07;
    public final InterfaceC60442pS A08;

    public C63352uI(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC60682pr interfaceC60682pr) {
        C14360o3.A0B(interfaceC60682pr, 2);
        C14360o3.A0B(userSession, 3);
        this.A04 = fragment;
        this.A06 = interfaceC60682pr;
        this.A07 = userSession;
        this.A08 = interfaceC60442pS;
        this.A05 = AbstractC25651Mw.A00(userSession);
        this.A01 = -1;
        A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f7, code lost:
    
        if (r0 > 0) goto L14;
     */
    @Override // X.InterfaceC63362uJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DMD(X.C75113Zb r14, java.lang.String r15) {
        /*
            r13 = this;
            r4 = 0
            X.C14360o3.A0B(r15, r4)
            r12 = 1
            X.C14360o3.A0B(r14, r12)
            androidx.fragment.app.Fragment r2 = r13.A04
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto Lf0
            X.3DO r0 = X.C3DN.A00
            X.3DN r7 = r0.A00(r1)
            if (r7 == 0) goto Lf0
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L1f
            X.AbstractC13880nE.A0O(r0)
        L1f:
            r13.A03 = r15
            java.lang.String r1 = ""
            com.instagram.common.session.UserSession r3 = r13.A07
            X.7es r0 = X.AbstractC167967er.A00(r3)
            java.util.Map r0 = r0.A00
            java.lang.Object r2 = r0.get(r15)
            X.9CG r2 = (X.C9CG) r2
            if (r2 == 0) goto Lf1
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto Lf1
            java.lang.Object r2 = r2.A01
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
        L3b:
            r1 = r2
        L3c:
            X.Haa r0 = new X.Haa
            r0.<init>(r13)
            r7.A0R(r0)
            X.Gm7 r0 = new X.Gm7
            r0.<init>(r12, r12, r4)
            r7.A0P(r0)
            X.1XD r0 = X.AnonymousClass548.A00()
            r0.A00()
            X.2pS r6 = r13.A08
            java.lang.String r5 = "main_feed"
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = r3.token
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putString(r0, r3)
            java.lang.String r3 = r6.getModuleName()
            r0 = 609(0x261, float:8.53E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putString(r0, r3)
            boolean r3 = r6.isOrganicEligible()
            r0 = 606(0x25e, float:8.49E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putBoolean(r0, r3)
            boolean r3 = r6.isSponsoredEligible()
            r0 = 607(0x25f, float:8.5E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putBoolean(r0, r3)
            r0 = 3542(0xdd6, float:4.963E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putString(r0, r15)
            r0 = 605(0x25d, float:8.48E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putString(r0, r5)
            X.C14360o3.A0B(r1, r4)
            r0 = 1552(0x610, float:2.175E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putCharSequence(r0, r1)
            boolean r1 = r14.A2U
            r0 = 1554(0x612, float:2.178E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putBoolean(r0, r1)
            int r1 = r14.getPosition()
            r0 = 1556(0x614, float:2.18E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putInt(r0, r1)
            int r1 = r14.A03
            r0 = 1555(0x613, float:2.179E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putInt(r0, r1)
            int r1 = r14.A0W
            r0 = 1557(0x615, float:2.182E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putInt(r0, r1)
            X.EMb r8 = new X.EMb
            r8.<init>()
            r8.setArguments(r2)
            java.lang.Integer r9 = X.C05F.A00
            r10 = 255(0xff, float:3.57E-43)
            r11 = r10
            r7.A0O(r8, r9, r10, r11, r12)
            X.1My r1 = r13.A05
            X.InQ r0 = new X.InQ
            r0.<init>(r12)
            r1.A05(r0)
        Lf0:
            return
        Lf1:
            java.lang.String r2 = r14.A1I
            int r0 = r2.length()
            if (r0 <= 0) goto L3c
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63352uI.DMD(X.3Zb, java.lang.String):void");
    }

    private final void A00() {
        Context context = this.A04.getContext();
        if (context != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            if (theme != null) {
                theme.resolveAttribute(AbstractC57322k7.A01(this.A07), typedValue, true);
            }
            this.A02 = Integer.valueOf((int) typedValue.getDimension(context.getResources().getDisplayMetrics()));
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        InterfaceC60682pr interfaceC60682pr;
        C3FQ scrollingViewProxy;
        String str;
        int i2;
        this.A00 = i;
        if (this.A08.getModuleName().equals("feed_contextual_chain")) {
            if (C18U.A06(C06090Tz.A05, this.A07, 36317844023023232L)) {
                return;
            }
        }
        if (this.A02 == null) {
            A00();
        }
        String str2 = this.A03;
        if (str2 != null && this.A00 > 0 && (scrollingViewProxy = (interfaceC60682pr = this.A06).getScrollingViewProxy()) != null) {
            int AnZ = scrollingViewProxy.AnZ();
            for (int i3 = 0; i3 < AnZ; i3++) {
                if (C81203jp.A0C(scrollingViewProxy.AnU(i3).getTag()) == EnumC81483kI.A0F) {
                    Object tag = scrollingViewProxy.AnU(i3).getTag();
                    tag.getClass();
                    C3QT c3qt = (C3QT) tag;
                    if (c3qt.A01 == null) {
                        continue;
                    } else {
                        C9C3 c9c3 = c3qt.A01;
                        if (c9c3 != null) {
                            str = c9c3.A01;
                        } else {
                            str = null;
                        }
                        if (str2.equals(str)) {
                            int B6q = i3 + scrollingViewProxy.B6q();
                            if (B6q >= 0) {
                                if (this.A01 < 0) {
                                    Resources resources = this.A04.requireContext().getResources();
                                    C14360o3.A07(resources);
                                    this.A01 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) + (resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right) * 2);
                                }
                                C3FQ scrollingViewProxy2 = interfaceC60682pr.getScrollingViewProxy();
                                int measuredHeight = (scrollingViewProxy2.CFj().getMeasuredHeight() - this.A00) - this.A01;
                                Integer num = this.A02;
                                if (num != null) {
                                    i2 = num.intValue();
                                } else {
                                    i2 = 0;
                                }
                                scrollingViewProxy2.EmE(B6q, measuredHeight + i2);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
}
