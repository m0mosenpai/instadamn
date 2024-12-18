package X;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.LruCache;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.Iterator;

/* renamed from: X.7f2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168077f2 implements InterfaceC168087f3 {
    public C167987et A00 = new C167987et(null, null, null, null, 7);
    public final Context A01;
    public final InterfaceC168057f0 A02;
    public final InterfaceC16660sJ A03;
    public final C168067f1 A04;
    public final UserSession A05;
    public final C1M1 A06;
    public final InterfaceC16610sE A07;

    public C168077f2(Context context, C168067f1 c168067f1, InterfaceC168057f0 interfaceC168057f0, UserSession userSession, C1M1 c1m1, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE) {
        this.A02 = interfaceC168057f0;
        this.A01 = context;
        this.A05 = userSession;
        this.A04 = c168067f1;
        this.A06 = c1m1;
        this.A03 = interfaceC16660sJ;
        this.A07 = interfaceC16610sE;
    }

    private final void A00(C9ZB c9zb, ComposerAutoCompleteTextView composerAutoCompleteTextView, String str, String str2, String str3, int i, int i2) {
        int i3;
        composerAutoCompleteTextView.A08 = false;
        Context context = this.A01;
        ImageSpan A00 = AbstractC225879y6.A00(context, true, false);
        Spannable spannable = (Spannable) this.A07.invoke(Integer.valueOf(i), Integer.valueOf(i2), AnonymousClass001.A0R(str3, str));
        if (spannable != null) {
            int length = i + str3.length();
            spannable.setSpan(A00, length, length + 3, 33);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(AbstractC53242c7.A0F(context, R.attr.textColorPrimary));
            if (str != null) {
                i3 = str.length();
            } else {
                i3 = 0;
            }
            spannable.setSpan(foregroundColorSpan, length, i3 + length, 33);
            C167987et c167987et = this.A00;
            C14360o3.A0B(str2, 0);
            c167987et.A00.put(str2, c9zb);
            composerAutoCompleteTextView.dismissDropDown();
            composerAutoCompleteTextView.A08 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (X.C11K.A01(r8.getText().charAt(r12 - 1)) != false) goto L32;
     */
    @Override // X.InterfaceC168087f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AKB(X.C9ZB r15, java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168077f2.AKB(X.9ZB, java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC168087f3
    public final void D6I() {
        this.A00 = new C167987et(null, null, null, null, 7);
    }

    @Override // X.InterfaceC168087f3
    public final void Dt5(C9ZB c9zb) {
        ComposerAutoCompleteTextView AeD = this.A02.AeD();
        if (AeD != null) {
            int i = c9zb.A00 + 1;
            String valueOf = String.valueOf(i);
            String A0I = AnonymousClass001.A0I("@[]\u200a", ' ', i);
            Editable text = AeD.getText();
            int selectionStart = AeD.getSelectionStart();
            if (selectionStart < 0) {
                selectionStart = 0;
            }
            CharSequence subSequence = text.subSequence(0, selectionStart);
            C14360o3.A0B(subSequence, 0);
            int A07 = AbstractC001900j.A07(subSequence, "@", subSequence.length() - 1);
            if (A07 < 0) {
                A07 = 0;
            }
            int selectionEnd = AeD.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            A00(c9zb, AeD, A0I, valueOf, "", A07, selectionEnd);
        }
    }

    @Override // X.InterfaceC168087f3
    public final void E5z(C9ZB c9zb) {
        ComposerAutoCompleteTextView AeD;
        String str;
        LruCache lruCache = this.A00.A00;
        C14360o3.A0B(c9zb, 0);
        int i = c9zb.A00 + 1;
        String valueOf = String.valueOf(i);
        if (lruCache.get(valueOf) == null && (AeD = this.A02.AeD()) != null) {
            AeD.setSelection(AeD.length());
            String A0I = AnonymousClass001.A0I("@[]\u200a", ' ', i);
            int selectionStart = AeD.getSelectionStart();
            if (selectionStart < 0) {
                selectionStart = 0;
            }
            int selectionEnd = AeD.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            if (selectionStart == 0) {
                str = "";
            } else {
                str = " ";
            }
            A00(c9zb, AeD, A0I, valueOf, str, selectionStart, selectionEnd);
        }
    }

    @Override // X.InterfaceC168087f3
    public final String EH3(String str) {
        int i;
        C14360o3.A0B(str, 0);
        StringBuilder sb = new StringBuilder(str);
        Iterator it = AbstractC85433rY.A04(str).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C89393yf c89393yf = (C89393yf) it.next();
            String A0d = AbstractC002300n.A0d(c89393yf.A02, "@[]\u200a", "", false);
            if (A0d.length() > 0 && this.A00.A00.get(A0d) != null) {
                String A0R = AnonymousClass001.A0R("@[]", ((C9ZB) this.A00.A00.get(A0d)).A01);
                int i3 = c89393yf.A01;
                int i4 = c89393yf.A00;
                sb.replace(i3 - i2, i4 - i2, A0R);
                int i5 = i4 - i3;
                if (A0R != null) {
                    i = A0R.length();
                } else {
                    i = 0;
                }
                i2 += i5 - i;
                this.A00.A01(A0d);
            }
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    @Override // X.InterfaceC168087f3
    public final void EkZ(C38321qM c38321qM) {
        Context context = this.A01;
        Spanned A01 = AbstractC07900bA.A01(context.getResources(), new String[0], 2131954833);
        C14360o3.A07(A01);
        Integer valueOf = Integer.valueOf(R.drawable.ig_illustrations_qp_carousel_notes_refresh);
        InterfaceC168057f0 interfaceC168057f0 = this.A02;
        ViewStub Am5 = interfaceC168057f0.Am5();
        if (Am5 != null && Am5.getParent() != null) {
            View inflate = Am5.inflate();
            C14360o3.A0C(inflate, MSV.A00(12));
            IgLinearLayout igLinearLayout = (IgLinearLayout) inflate;
            AbstractC46666Kkj.A00(context, interfaceC168057f0, igLinearLayout, A01, valueOf);
            if (igLinearLayout != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.tooltip_banner_enter);
                C14360o3.A07(loadAnimation);
                igLinearLayout.startAnimation(loadAnimation);
                igLinearLayout.setVisibility(0);
                C168067f1 c168067f1 = this.A04;
                C1M1 c1m1 = this.A06;
                C18920wW c18920wW = c168067f1.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_carousel_tool_tip_impression");
                if (A00.isSampled()) {
                    A00.AAP("module", c168067f1.A00.getModuleName());
                    String A2u = c38321qM.A2u();
                    if (A2u != null) {
                        A00.A9K("ig_media_id", Long.valueOf(Long.parseLong(A2u)));
                        A00.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
                        A00.AAP(AbstractC111324zv.A00(384), null);
                        A00.A9K("m_ix", null);
                        A00.A9K("recs_ix", null);
                        A00.AAP(AbstractC111324zv.A00(411), c38321qM.A0R);
                        A00.AAP(AbstractC111324zv.A00(264), c1m1.getSessionId());
                        A00.Cht();
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(this.A05).A01;
                String A002 = AbstractC111324zv.A00(2035);
                int i = interfaceC19630xq.getInt(A002, 0);
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7D(A002, i + 1);
                ARD.E7G(AbstractC111324zv.A00(2034), System.currentTimeMillis());
                ARD.apply();
            }
        }
    }

    @Override // X.InterfaceC168087f3
    public final C167987et Bxl() {
        return this.A00;
    }

    @Override // X.InterfaceC168087f3
    public final void Dgr(C167987et c167987et) {
        this.A00 = c167987et;
    }
}
