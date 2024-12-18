package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class C5I extends C5J {
    public View A00;
    public IgLinearLayout A01;
    public IgLinearLayout A02;
    public IgTextView A03;
    public C59952od A04;
    public IgdsMediaButton A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C27821COk A08;
    public final MVF A09;
    public final boolean A0A;
    public final C37546Gg2 A0B;

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        Resources resources;
        Context context;
        Resources resources2;
        C14360o3.A0B(view, 0);
        View A0U = AbstractC167017dG.A0U(view, R.id.clips_notes_composer_stub);
        if (A0U != null) {
            this.A03 = (IgTextView) A0U.requireViewById(R.id.comment_composer_text_view);
            this.A05 = (IgdsMediaButton) A0U.requireViewById(R.id.add_note_button);
            this.A01 = (IgLinearLayout) A0U.requireViewById(R.id.quick_emoji_reply_container);
            this.A02 = (IgLinearLayout) A0U.requireViewById(R.id.message_bar_container);
        } else {
            A0U = null;
        }
        this.A00 = A0U;
        IgTextView igTextView = this.A03;
        if (igTextView != null) {
            C0fQ.A00(new ViewOnClickListenerC28604Cjt(this, 1), igTextView);
            AbstractC56952jT.A01(igTextView);
        }
        IgdsMediaButton igdsMediaButton = this.A05;
        if (igdsMediaButton != null) {
            C0fQ.A00(new ViewOnClickListenerC28604Cjt(this, 2), igdsMediaButton);
            AbstractC56952jT.A01(igdsMediaButton);
        }
        IgLinearLayout igLinearLayout = this.A01;
        if (igLinearLayout != null) {
            UserSession userSession = this.A07;
            Context context2 = igLinearLayout.getContext();
            if (context2 != null && (resources = context2.getResources()) != null) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
                InterfaceC11380iw interfaceC11380iw = this.A06;
                IgLinearLayout igLinearLayout2 = this.A01;
                if (igLinearLayout2 != null && (context = igLinearLayout2.getContext()) != null && (resources2 = context.getResources()) != null) {
                    AbstractC47991LKc.A03(igLinearLayout, interfaceC11380iw, userSession, new C25344BJn(this, 46), dimensionPixelSize, resources2.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A07, 36328164830297370L) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        X.AbstractC167007dF.A0x(r4.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A07, 36328164830690591L) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(boolean r5, boolean r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L37
            boolean r0 = r4.A0A
            if (r0 == 0) goto L37
        L6:
            r2 = 0
            android.view.View r0 = r4.A00
            if (r5 == 0) goto L2b
            if (r0 == 0) goto L2a
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L2a
            r0 = 2131956175(0x7f1311cf, float:1.9548898E38)
        L16:
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L2a
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r4.A05
            if (r0 == 0) goto L23
            r0.setVisibility(r2)
        L23:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r4.A05
            if (r0 == 0) goto L2a
            r0.setLabel(r1)
        L2a:
            return
        L2b:
            if (r0 == 0) goto L2a
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L2a
            r0 = 2131956168(0x7f1311c8, float:1.9548884E38)
            goto L16
        L37:
            if (r5 != 0) goto L4e
            com.instagram.common.session.UserSession r3 = r4.A07
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328164830297370(0x811046000d3d1a, double:3.0374159482338804E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4e
        L48:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r4.A05
            X.AbstractC167007dF.A0x(r0)
            return
        L4e:
            com.instagram.common.session.UserSession r3 = r4.A07
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328164830690591(0x81104600133d1f, double:3.037415948482555E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L6
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5I.A04(boolean, boolean):void");
    }

    @Override // X.AbstractC37623GhI
    public final void A0A() {
        C37556GgC c37556GgC = super.A02;
        if (c37556GgC != null) {
            c37556GgC.A0G(this);
        }
        A03();
    }

    public C5I(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C27821COk c27821COk, C37546Gg2 c37546Gg2, MVF mvf, boolean z) {
        this.A0B = c37546Gg2;
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
        this.A08 = c27821COk;
        this.A09 = mvf;
        this.A0A = z;
    }

    public static final C120985dq A00(C5I c5i) {
        int intValue;
        Integer A0l = AbstractC25233BEq.A0l(c5i);
        if (A0l == null || (intValue = A0l.intValue()) < 0) {
            return null;
        }
        AbstractC37552Gg8 abstractC37552Gg8 = c5i.A0B.A0A;
        if (intValue >= abstractC37552Gg8.A0B()) {
            return null;
        }
        return abstractC37552Gg8.A0F(intValue);
    }

    public static final Integer A01(C5I c5i) {
        String str;
        List A02 = A02(c5i);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A02) {
            UserSession userSession = c5i.A07;
            User CDj = ((InterfaceC103524lS) obj).CDj();
            if (CDj != null) {
                str = AbstractC76433bn.A00(CDj);
            } else {
                str = null;
            }
            AbstractC25228BEl.A1Q(obj, A1E, C2TN.A05(userSession, str) ? 1 : 0);
        }
        if (A1E.size() > 1) {
            if (C18U.A06(C06090Tz.A05, c5i.A07, 36328164829969685L)) {
                return C05F.A0C;
            }
        }
        List A022 = A02(c5i);
        if (!(A022 instanceof Collection) || !A022.isEmpty()) {
            Iterator it = A022.iterator();
            while (it.hasNext()) {
                if (C2TN.A05(c5i.A07, AbstractC76433bn.A00(((InterfaceC103524lS) it.next()).CDj()))) {
                    return C05F.A01;
                }
            }
        }
        return C05F.A00;
    }

    public static final List A02(C5I c5i) {
        C38321qM c38321qM;
        List A3j;
        C120985dq A00 = A00(c5i);
        if (A00 == null || (c38321qM = A00.A02) == null || (A3j = c38321qM.A3j()) == null) {
            return C16930sl.A00;
        }
        return A3j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r2 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5I.A03():void");
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        A03();
    }
}
