package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.Ka9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46054Ka9 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EncryptedBackupsSettingsFragment";
    public InterfaceC16820sZ A00 = C50255MHk.A02(this, 0);
    public InterfaceC16820sZ A01;
    public final C31335Dq0 A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        r1 = X.AbstractC166997dE.A11(r1);
        r0 = " (cutover)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        r1 = X.AbstractC166997dE.A0x(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        X.C35124FeR.A00(r2, r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (r8 == r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00aa, code lost:
    
        r3.add(new X.C34960Fak(new X.LRJ(2, r13, r5), java.lang.String.valueOf(r11.A06()), r5));
        r5 = new X.LF2(X.AbstractC166987dD.A0r(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d7, code lost:
    
        if (X.C6CB.A02(X.AbstractC43593JPy.A0P(r13.A04), 36315928476651325L) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d9, code lost:
    
        if (r14 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        if (r14.intValue() < r5.A00) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        r1 = new X.C35246Fgf("Override Days After Block");
        r1.A01 = com.facebook.R.style.igds_emphasized_body_1;
        r1.A03 = com.facebook.R.dimen.action_bar_item_spacing_right;
        r3.add(r1);
        r0 = new X.LF2(X.AbstractC166987dD.A0r(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0100, code lost:
    
        if (r16 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0102, code lost:
    
        r6 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0104, code lost:
    
        r5 = X.AbstractC166987dD.A1E();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010c, code lost:
    
        if (0 > r6) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010e, code lost:
    
        r9 = java.lang.String.valueOf(r0);
        r8 = X.AnonymousClass001.A0A(r0, " days");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011a, code lost:
    
        if (r0 != r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011c, code lost:
    
        r8 = X.AnonymousClass001.A0R(r8, " (release block UI)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0122, code lost:
    
        X.C35124FeR.A00(r9, r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0127, code lost:
    
        if (r0 == r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0129, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0130, code lost:
    
        r3.add(new X.C34960Fak(new X.LRJ(1, r13, r5), java.lang.String.valueOf(X.JQ0.A0e(new X.C44100JeP(X.AbstractC166987dD.A0r(r10)).A00.getInt("EB_BlOCK_FIRST_SHOWN_TIMESTAMP_OVERRIDE_MS", 99999), 99999)), r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012d, code lost:
    
        r6 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        r0 = r9.A03;
        r12 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r0.contains(r12) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        r1 = X.AbstractC166997dE.A11(r1);
        r0 = " (introduce)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (r9.A07.contains(r12) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        r1 = X.AbstractC166997dE.A11(r1);
        r0 = " (sell)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        if (r9.A08.contains(r12) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        r1 = X.AbstractC166997dE.A11(r1);
        r0 = " (warn)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        if (r8 != r9.A00) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        r1 = X.AbstractC166997dE.A11(r1);
        r0 = " (block)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004a, code lost:
    
        if (r1 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004e, code lost:
    
        if (0 <= r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
    
        r2 = java.lang.String.valueOf(r8);
        r1 = X.AnonymousClass001.A03(r8, " days");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (r8 != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A04(X.C46054Ka9 r13, java.lang.Integer r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46054Ka9.A04(X.Ka9, java.lang.Integer, boolean, boolean):java.util.ArrayList");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131973613);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0B;
        Jn4.A01(AbstractC43592JPx.A0c(interfaceC09390do));
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC43592JPx.A0c(interfaceC09390do).A00, new MM0(this, 48), 33);
        JQ0.A11(this, new GST(this, null, 11), AbstractC43592JPx.A0c(interfaceC09390do).A0H);
        JQ0.A11(this, new GST(this, null, 12), AbstractC43592JPx.A0c(interfaceC09390do).A0G);
    }

    public static final C36731GHa A01(C46054Ka9 c46054Ka9) {
        C36731GHa c36731GHa = new C36731GHa((CompoundButton.OnCheckedChangeListener) null, 2131966665, AbstractC31172DnG.A1a(((C3LC) C50255MHk.A00(c46054Ka9, 12).getValue()).A00, "MEX_EB_LOW_STORAGE_MODE_TOGGLE_SHOWN"));
        c36731GHa.A08 = new LRF(2, c46054Ka9, c36731GHa);
        return c36731GHa;
    }

    private final String A02(AbstractC46428Kgo abstractC46428Kgo) {
        int i;
        if (C14360o3.A0K(abstractC46428Kgo, C45797KPc.A00)) {
            i = 2131961845;
        } else {
            if (abstractC46428Kgo instanceof C45796KPb) {
                return MX0.A00(requireContext(), ((C45796KPb) abstractC46428Kgo).A00);
            }
            if (C14360o3.A0K(abstractC46428Kgo, C45798KPd.A00)) {
                i = 2131961846;
            } else {
                if (C14360o3.A0K(abstractC46428Kgo, C45799KPe.A00)) {
                    return "";
                }
                throw B4Z.A00();
            }
        }
        return AbstractC25227BEk.A0v(this, i);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    public C46054Ka9() {
        MHT mht = new MHT(this, 49);
        C50255MHk A02 = C50255MHk.A02(this, 19);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A01 = C50255MHk.A01(A02, enumC09460dv, 20);
        this.A03 = AbstractC25225BEi.A0a(C50255MHk.A02(A01, 21), mht, new C50172MDz(21, null, A01), AbstractC25225BEi.A1D(C25804BbL.class));
        this.A01 = C50255MHk.A02(this, 26);
        C50255MHk A022 = C50255MHk.A02(this, 25);
        InterfaceC09390do A012 = C50255MHk.A01(C50255MHk.A02(this, 22), enumC09460dv, 23);
        this.A0B = AbstractC25225BEi.A0a(C50255MHk.A02(A012, 24), A022, new C50172MDz(22, null, A012), AbstractC25225BEi.A1D(Jn4.class));
        this.A09 = C50255MHk.A00(this, 16);
        this.A04 = C50255MHk.A00(this, 1);
        this.A08 = C50255MHk.A00(this, 9);
        this.A0A = AbstractC60492pY.A02(this);
        this.A02 = new C31335Dq0("[FB-Only]");
        this.A06 = C50255MHk.A00(this, 7);
        this.A07 = C50255MHk.A00(this, 8);
        this.A05 = C50255MHk.A00(this, 6);
    }

    public static final SpannableStringBuilder A00(C46054Ka9 c46054Ka9, InterfaceC16820sZ interfaceC16820sZ, int i) {
        String A0p = AbstractC166997dE.A0p(c46054Ka9.requireContext(), 2131961776);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(c46054Ka9.requireContext(), A0p, i));
        AnonymousClass773.A03(A0H, new C44383JjM(interfaceC16820sZ, 2), A0p);
        return A0H;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.Faq] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.Faq] */
    public static final ArrayList A03(C51761Mtk c51761Mtk, C46054Ka9 c46054Ka9) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (C6CB.A02(AbstractC43593JPy.A0P(c46054Ka9.A04), 2342158937681563350L)) {
            C35246Fgf c35246Fgf = new C35246Fgf(2131961775);
            c35246Fgf.A01 = R.style.igds_emphasized_body_1;
            c35246Fgf.A03 = R.dimen.action_bar_item_spacing_right;
            A1E.add(c35246Fgf);
            AbstractC46428Kgo abstractC46428Kgo = (AbstractC46428Kgo) c51761Mtk.A02;
            String string = c46054Ka9.getString(2131961844);
            ?? obj = new Object();
            obj.A04 = string;
            obj.A07 = false;
            obj.A03 = c46054Ka9.A02(abstractC46428Kgo);
            A1E.add(obj);
            AbstractC46428Kgo abstractC46428Kgo2 = (AbstractC46428Kgo) c51761Mtk.A00;
            String string2 = c46054Ka9.getString(2131961843);
            ?? obj2 = new Object();
            obj2.A04 = string2;
            obj2.A07 = false;
            obj2.A03 = c46054Ka9.A02(abstractC46428Kgo2);
            A1E.add(obj2);
            if ((abstractC46428Kgo instanceof C45796KPb) && (abstractC46428Kgo2 instanceof C45796KPb)) {
                Jn4.A00(c46054Ka9.A0B).A05("EB_DETAILS_IMPRESSION");
            }
        }
        return A1E;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnPause() {
        super.afterOnPause();
        KPK A00 = Jn4.A00(this.A0B);
        if (A00.A0A()) {
            A00.A07("ACTION", "NAVIGATE_AWAY");
            A00.A02();
        }
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        super.afterOnResume();
        KPK A00 = Jn4.A00(this.A0B);
        A00.A03();
        A00.A05("SETTING_PAGE_IMPRESSION");
    }
}
