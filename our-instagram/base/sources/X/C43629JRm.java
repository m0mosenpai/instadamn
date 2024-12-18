package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.JRm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43629JRm {
    public AbstractC46972Dl A00;
    public C4I3 A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final MSH A04;
    public final C1571273r A05;
    public final C1571273r A06;
    public final C1571273r A07;
    public final C1571273r A08;
    public final C1571273r A09;

    public C43629JRm(Context context, FragmentActivity fragmentActivity, UserSession userSession, MSH msh, InterfaceC1571373s interfaceC1571373s) {
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A04 = msh;
        C1571273r c1571273r = new C1571273r();
        this.A06 = c1571273r;
        C1571273r c1571273r2 = new C1571273r();
        this.A09 = c1571273r2;
        C1571273r c1571273r3 = new C1571273r();
        this.A07 = c1571273r3;
        C1571273r c1571273r4 = new C1571273r();
        this.A08 = c1571273r4;
        C1571273r c1571273r5 = new C1571273r();
        this.A05 = c1571273r5;
        A02(context, C4I1.A00, C4I3.A03);
        A00();
        c1571273r.A06 = interfaceC1571373s;
        int A09 = AbstractC167007dF.A09(fragmentActivity, R.attr.igds_color_primary_background);
        c1571273r.A00 = A09;
        c1571273r.A0L = true;
        c1571273r.A0P = true;
        c1571273r2.A02 = R.drawable.loadmore_icon_refresh_compound;
        c1571273r2.A00 = A09;
        c1571273r3.A00 = c1571273r.A00;
        c1571273r3.A05 = ViewOnClickListenerC48072LPx.A00(this, 47);
        c1571273r4.A00 = c1571273r.A00;
        c1571273r4.A0D = context.getString(2131964475);
        c1571273r4.A07 = context.getString(2131964474);
        c1571273r5.A00 = c1571273r.A00;
        c1571273r5.A0D = context.getString(2131963189);
        c1571273r5.A07 = context.getString(2131963188);
        c1571273r5.A0C = context.getString(2131963190);
        c1571273r5.A06 = new C44110Jea(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r8 == X.C05F.A0C) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r4 = r7.A09;
        r3 = X.EnumC153216up.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if ((r0 instanceof X.C2E6) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        r1 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        if (r1 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004c, code lost:
    
        if (r1 != X.C4I3.A03) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004e, code lost:
    
        r1 = r7.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        if (r1 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0058, code lost:
    
        if (r1.equals(X.C44037JdO.A00) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        r4 = r7.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005d, code lost:
    
        r1 = r7.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
    
        if (r1.isLoading() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
    
        if (r1.CKu() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006b, code lost:
    
        r4 = r7.A07;
        r3 = X.EnumC153216up.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0070, code lost:
    
        r1 = r7.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0072, code lost:
    
        if (r1 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r1 == X.C46962Dk.A00) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007a, code lost:
    
        if (r1 == X.C47062Du.A00) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007e, code lost:
    
        if ((r1 instanceof X.C132705yt) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0082, code lost:
    
        if ((r1 instanceof X.C2E6) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0084, code lost:
    
        r1 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0086, code lost:
    
        if (r1 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008a, code lost:
    
        if (r1 == X.C4I3.A03) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0044, code lost:
    
        if (r10 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C44080Je5 A01(java.lang.Integer r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            r0 = 2
            X.C14360o3.A0B(r8, r0)
            java.lang.Integer r0 = X.C05F.A00
            java.lang.String r6 = "emptyFilter"
            java.lang.String r5 = "emptyMode"
            r2 = 0
            if (r8 == r0) goto L2e
            java.lang.Integer r0 = X.C05F.A01
            if (r8 != r0) goto L8d
            X.73r r4 = r7.A08
        L13:
            X.6up r3 = X.EnumC153216up.A02
        L15:
            X.2Dl r1 = r7.A00
            if (r1 == 0) goto L96
            X.4I3 r0 = r7.A01
            if (r0 == 0) goto L9a
            X.Je5 r2 = new X.Je5
            r2.<init>(r1, r0, r4, r3)
            X.73r r0 = r7.A06
            X.73s r1 = r0.A06
            if (r1 == 0) goto L2d
            X.6up r0 = r2.A03
            r1.DDS(r0)
        L2d:
            return r2
        L2e:
            if (r9 == 0) goto L44
            X.2Dl r1 = r7.A00
            if (r1 == 0) goto L96
            X.5yt r0 = X.C132705yt.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L44
            X.2Dl r0 = r7.A00
            if (r0 == 0) goto L96
            boolean r0 = r0 instanceof X.C2E6
            if (r0 == 0) goto L46
        L44:
            if (r10 == 0) goto L5d
        L46:
            X.4I3 r1 = r7.A01
            if (r1 == 0) goto L9a
            X.4I3 r0 = X.C4I3.A03
            if (r1 != r0) goto L5d
            X.2Dl r1 = r7.A00
            if (r1 == 0) goto L96
            X.JdO r0 = X.C44037JdO.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2d
        L5a:
            X.73r r4 = r7.A06
            goto L13
        L5d:
            X.MSH r1 = r7.A04
            boolean r0 = r1.isLoading()
            if (r0 != 0) goto L91
            boolean r0 = r1.CKu()
            if (r0 == 0) goto L70
            X.73r r4 = r7.A07
            X.6up r3 = X.EnumC153216up.A04
            goto L15
        L70:
            X.2Dl r1 = r7.A00
            if (r1 == 0) goto L96
            X.2Dk r0 = X.C46962Dk.A00
            if (r1 == r0) goto L5a
            X.2Du r0 = X.C47062Du.A00
            if (r1 == r0) goto L5a
            boolean r0 = r1 instanceof X.C132705yt
            if (r0 != 0) goto L5a
            boolean r0 = r1 instanceof X.C2E6
            if (r0 != 0) goto L5a
            X.4I3 r1 = r7.A01
            if (r1 == 0) goto L9a
            X.4I3 r0 = X.C4I3.A03
            if (r1 == r0) goto L2d
            goto L5a
        L8d:
            java.lang.Integer r0 = X.C05F.A0C
            if (r8 != r0) goto L2d
        L91:
            X.73r r4 = r7.A09
            X.6up r3 = X.EnumC153216up.A06
            goto L15
        L96:
            X.C14360o3.A0F(r5)
            goto L9d
        L9a:
            X.C14360o3.A0F(r6)
        L9d:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43629JRm.A01(java.lang.Integer, boolean, boolean):X.Je5");
    }

    private final void A00() {
        C1571273r c1571273r;
        int i;
        C4I3 c4i3 = this.A01;
        String str = "emptyFilter";
        if (c4i3 != null) {
            if (c4i3 == C4I3.A04) {
                c1571273r = this.A06;
                i = R.drawable.instagram_calendar_outline_96;
            } else if (c4i3 == C4I3.A0J) {
                c1571273r = this.A06;
                i = R.drawable.instagram_shopping_cart_outline_96;
            } else if (c4i3 == C4I3.A0K) {
                c1571273r = this.A06;
                i = R.drawable.instagram_receipt_outline_96;
            } else if (c4i3 == C4I3.A0N) {
                c1571273r = this.A06;
                i = R.drawable.instagram_orders_outline_96;
            } else if (c4i3 == C4I3.A0F) {
                c1571273r = this.A06;
                i = R.drawable.instagram_save_outline_96;
            } else if (c4i3 != C4I3.A0E && c4i3 != C4I3.A0B) {
                AbstractC46972Dl abstractC46972Dl = this.A00;
                str = "emptyMode";
                if (abstractC46972Dl != null) {
                    if (abstractC46972Dl == C47062Du.A00) {
                        c1571273r = this.A06;
                        i = R.drawable.instagram_channels_outline_96;
                    } else if (abstractC46972Dl == C44037JdO.A00) {
                        c1571273r = this.A06;
                        i = R.drawable.instagram_lock_outline_96;
                    } else {
                        boolean A00 = AbstractC47372Fk.A00(this.A03);
                        c1571273r = this.A06;
                        i = R.drawable.empty_state_direct;
                        if (A00) {
                            i = R.drawable.instagram_app_messenger_outline_96;
                        }
                    }
                }
            } else {
                c1571273r = this.A06;
                i = R.drawable.instagram_star_outline_96;
            }
            c1571273r.A02 = i;
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(Context context, AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        String A0p;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        String str3;
        String str4 = "";
        switch (c4i3.ordinal()) {
            case 0:
                if (abstractC46972Dl.equals(C46962Dk.A00)) {
                    A0p = context.getString(2131964413);
                    i = 2131964428;
                    str = context.getString(2131964412);
                } else {
                    if (abstractC46972Dl.equals(C47062Du.A00)) {
                        A0p = context.getString(2131964472);
                        i2 = 2131964471;
                    } else if (abstractC46972Dl.equals(C44037JdO.A00)) {
                        A0p = context.getString(2131963955);
                        i2 = 2131963954;
                    } else if (abstractC46972Dl.equals(C132705yt.A00)) {
                        A0p = context.getString(2131960061);
                        i2 = 2131960060;
                    } else if (abstractC46972Dl instanceof C2E6) {
                        A0p = context.getString(2131958949);
                        i = 2131958948;
                        str = context.getString(2131958947);
                    } else {
                        A0p = AbstractC166997dE.A0p(context, 2131959656);
                        i = 2131960428;
                        str = AbstractC166997dE.A0p(context, 2131959655);
                    }
                    str2 = context.getString(i2);
                    C1571273r c1571273r = this.A06;
                    c1571273r.A0D = A0p;
                    c1571273r.A07 = str2;
                    c1571273r.A0C = str4;
                    this.A00 = abstractC46972Dl;
                    this.A01 = c4i3;
                    A00();
                    return;
                }
                str4 = context.getString(i);
                str2 = str;
                C1571273r c1571273r2 = this.A06;
                c1571273r2.A0D = A0p;
                c1571273r2.A07 = str2;
                c1571273r2.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 1:
                A0p = context.getString(2131959631);
                i3 = 2131959612;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r22 = this.A06;
                c1571273r22.A0D = A0p;
                c1571273r22.A07 = str2;
                c1571273r22.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 2:
                A0p = context.getString(2131959620);
                i3 = 2131959601;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r222 = this.A06;
                c1571273r222.A0D = A0p;
                c1571273r222.A07 = str2;
                c1571273r222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 3:
            case 4:
            case 5:
            case 7:
            case 18:
            default:
                throw AbstractC166987dD.A18("Invalid filter");
            case 6:
                A0p = context.getString(2131959617);
                UserSession userSession = this.A03;
                FragmentActivity fragmentActivity = this.A02;
                String A0p2 = AbstractC166997dE.A0p(context, 2131959594);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AnonymousClass001.A0g(AbstractC166997dE.A0p(context, 2131959598), System.getProperty(AbstractC111324zv.A00(230)), A0p2));
                AnonymousClass773.A05(A0H, new C33253Eln(fragmentActivity, userSession, AbstractC31174DnI.A02(context)), A0p2);
                str3 = A0H;
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r2222 = this.A06;
                c1571273r2222.A0D = A0p;
                c1571273r2222.A07 = str2;
                c1571273r2222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 8:
                A0p = context.getString(2131959632);
                i3 = 2131959611;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r22222 = this.A06;
                c1571273r22222.A0D = A0p;
                c1571273r22222.A07 = str2;
                c1571273r22222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 9:
                A0p = context.getString(2131959629);
                i3 = 2131959610;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r222222 = this.A06;
                c1571273r222222.A0D = A0p;
                c1571273r222222.A07 = str2;
                c1571273r222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 10:
                A0p = context.getString(2131959619);
                i3 = 2131959600;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r2222222 = this.A06;
                c1571273r2222222.A0D = A0p;
                c1571273r2222222.A07 = str2;
                c1571273r2222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 11:
                A0p = context.getString(2131959616);
                i3 = 2131959597;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r22222222 = this.A06;
                c1571273r22222222.A0D = A0p;
                c1571273r22222222.A07 = str2;
                c1571273r22222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0p = context.getString(2131959630);
                i3 = 2131959613;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r222222222 = this.A06;
                c1571273r222222222.A0D = A0p;
                c1571273r222222222.A07 = str2;
                c1571273r222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A0p = context.getString(2131959615);
                i3 = 2131959596;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r2222222222 = this.A06;
                c1571273r2222222222.A0D = A0p;
                c1571273r2222222222.A07 = str2;
                c1571273r2222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 14:
                A0p = context.getString(2131959626);
                i3 = 2131959607;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r22222222222 = this.A06;
                c1571273r22222222222.A0D = A0p;
                c1571273r22222222222.A07 = str2;
                c1571273r22222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case Process.SIGTERM /* 15 */:
                A0p = context.getString(2131959627);
                i3 = 2131959608;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r222222222222 = this.A06;
                c1571273r222222222222.A0D = A0p;
                c1571273r222222222222.A07 = str2;
                c1571273r222222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 16:
                A0p = context.getString(2131959628);
                i3 = 2131959609;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r2222222222222 = this.A06;
                c1571273r2222222222222.A0D = A0p;
                c1571273r2222222222222.A07 = str2;
                c1571273r2222222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 17:
                A0p = context.getString(2131959625);
                i3 = 2131959606;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r22222222222222 = this.A06;
                c1571273r22222222222222.A0D = A0p;
                c1571273r22222222222222.A07 = str2;
                c1571273r22222222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case Process.SIGSTOP /* 19 */:
                A0p = context.getString(2131959614);
                i3 = 2131959595;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r222222222222222 = this.A06;
                c1571273r222222222222222.A0D = A0p;
                c1571273r222222222222222.A07 = str2;
                c1571273r222222222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 20:
                A0p = context.getString(2131959624);
                i3 = 2131959605;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r2222222222222222 = this.A06;
                c1571273r2222222222222222.A0D = A0p;
                c1571273r2222222222222222.A07 = str2;
                c1571273r2222222222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 21:
                A0p = context.getString(2131959621);
                i3 = 2131959602;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r22222222222222222 = this.A06;
                c1571273r22222222222222222.A0D = A0p;
                c1571273r22222222222222222.A07 = str2;
                c1571273r22222222222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 22:
                A0p = context.getString(2131959618);
                i3 = 2131959599;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r222222222222222222 = this.A06;
                c1571273r222222222222222222.A0D = A0p;
                c1571273r222222222222222222.A07 = str2;
                c1571273r222222222222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 23:
                A0p = context.getString(2131959622);
                i3 = 2131959603;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r2222222222222222222 = this.A06;
                c1571273r2222222222222222222.A0D = A0p;
                c1571273r2222222222222222222.A07 = str2;
                c1571273r2222222222222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
            case 24:
                A0p = context.getString(2131959623);
                i3 = 2131959604;
                str3 = context.getString(i3);
                str4 = AbstractC166997dE.A0p(context, 2131959593);
                str2 = str3;
                C1571273r c1571273r22222222222222222222 = this.A06;
                c1571273r22222222222222222222.A0D = A0p;
                c1571273r22222222222222222222.A07 = str2;
                c1571273r22222222222222222222.A0C = str4;
                this.A00 = abstractC46972Dl;
                this.A01 = c4i3;
                A00();
                return;
        }
    }
}
