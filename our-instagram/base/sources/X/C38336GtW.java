package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.facebook.R;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.user.model.User;

/* renamed from: X.GtW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38336GtW extends PagingDataAdapter {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final InterfaceC43458JHw A03;
    public final O9V A04;
    public final Integer A05;
    public final Integer A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38336GtW(com.instagram.common.session.UserSession r3, X.InterfaceC43458JHw r4, X.O9V r5, java.lang.Integer r6, java.lang.Integer r7, int r8, int r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            r2 = this;
            r0 = 1
            X.AbstractC167007dF.A1F(r3, r0, r4)
            X.Gtf r1 = X.C38345Gtf.A00
            X.12T r0 = X.C12P.A00
            X.137 r0 = X.AnonymousClass131.A00
            r2.<init>(r1, r0)
            r2.A02 = r3
            r2.A01 = r8
            r2.A00 = r9
            r2.A03 = r4
            r2.A04 = r5
            r2.A07 = r10
            r2.A05 = r6
            r2.A06 = r7
            r2.A08 = r11
            r2.A0A = r12
            r2.A09 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38336GtW.<init>(com.instagram.common.session.UserSession, X.JHw, X.O9V, java.lang.Integer, java.lang.Integer, int, int, boolean, boolean, boolean, boolean):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.clips_template_browser_clips_item_layout, viewGroup, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A02;
        C14360o3.A0A(inflate);
        return new C38514GwZ(inflate, userSession);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C38321qM c38321qM;
        Integer num;
        C38514GwZ c38514GwZ = (C38514GwZ) c3oo;
        C14360o3.A0B(c38514GwZ, 0);
        c38514GwZ.itemView.getLayoutParams().width = this.A01;
        c38514GwZ.itemView.getLayoutParams().height = this.A00;
        Integer num2 = this.A05;
        if (num2 != null && (num = this.A06) != null) {
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            c38514GwZ.A0D.setCornerRadius(intValue);
            c38514GwZ.A05.setBackgroundColor(intValue2);
        }
        View A0c = AbstractC166987dD.A0c(c38514GwZ.itemView, R.id.template_browser_video_image_placeholder);
        C120985dq c120985dq = (C120985dq) A02(i);
        if (c120985dq != null && (c38321qM = c120985dq.A02) != null) {
            boolean z = this.A08;
            boolean z2 = this.A0A;
            boolean z3 = this.A09;
            int i2 = 0;
            c38514GwZ.A00 = c38321qM;
            c38514GwZ.A02 = Integer.valueOf(i);
            if (z) {
                Context context = c38514GwZ.A03;
                C14360o3.A06(context);
                IgTextView igTextView = c38514GwZ.A08;
                C14360o3.A0B(igTextView, 2);
                UserSession userSession = c38514GwZ.A07;
                C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
                if (A0u != null && C37722Gix.A02(context, c38321qM)) {
                    C92584Cs c92584Cs = new C92584Cs(AbstractC76643c9.A00(A0u.BZw()), A0u.AZi(), AbstractC76643c9.A07(A0u), AbstractC76643c9.A06(A0u), R.dimen.abc_text_size_menu_header_material, false, AbstractC76643c9.A0D(A0u), false, false, true, true, AbstractC76643c9.A0H(userSession, c38321qM), AbstractC92574Cr.A03(A0u), false);
                    igTextView.setText(C92604Cu.A03(AbstractC166997dE.A0M(context), C92604Cu.A01(context, c92584Cs), C92604Cu.A00(context, c92584Cs), userSession, c92584Cs, false));
                    igTextView.setVisibility(0);
                    igTextView.setSelected(true);
                } else {
                    igTextView.setVisibility(8);
                    igTextView.setSelected(false);
                }
            }
            Context context2 = c38514GwZ.A03;
            C14360o3.A06(context2);
            SimpleVideoLayout simpleVideoLayout = c38514GwZ.A0C;
            IgImageView igImageView = c38514GwZ.A0B;
            int A06 = AbstractC167007dF.A06(1, simpleVideoLayout, igImageView);
            C19270xB c19270xB = c38514GwZ.A06;
            UserSession userSession2 = c38514GwZ.A07;
            C14360o3.A0B(c19270xB, 3);
            simpleVideoLayout.setVideoSource(c38321qM, c19270xB);
            ExtendedImageUrl A1q = c38321qM.A1q(context2);
            if (A1q == null && (A1q = c38321qM.A1n()) == null) {
                throw AbstractC166997dE.A0g();
            }
            igImageView.setUrl(A1q, c19270xB);
            if (z2) {
                IgTextView igTextView2 = c38514GwZ.A09;
                CircularImageView circularImageView = c38514GwZ.A0A;
                C14360o3.A0B(igTextView2, 1);
                C14360o3.A0B(circularImageView, A06);
                User A2E = c38321qM.A2E(userSession2);
                if (A2E != null) {
                    String Ayl = c120985dq.Ayl(userSession2);
                    if (Ayl != null) {
                        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(Ayl);
                        if (A2E.isVerified()) {
                            C85963sQ.A08(context2, A0H, false);
                        }
                        igTextView2.setText(A0H);
                        AbstractC31173DnH.A1T(c19270xB, circularImageView, A2E);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    i2 = 8;
                }
                igTextView2.setVisibility(i2);
                circularImageView.setVisibility(i2);
            }
            if (z3) {
                if (c38321qM.CcN()) {
                    c38514GwZ.A00();
                } else {
                    c38514GwZ.A01();
                }
            }
            View view = c38514GwZ.itemView;
            view.findViewById(R.id.template_browser_clips_item_shimmer_view).setVisibility(8);
            if (z3) {
                View findViewById = view.findViewById(R.id.save_icon);
                findViewById.setVisibility(0);
                ViewOnClickListenerC42029Ijy.A00(findViewById, c120985dq, A0c, this, 39);
            }
            ViewOnClickListenerC42028Ijx.A00(view, c120985dq, this, i, 8);
            InterfaceC43458JHw interfaceC43458JHw = this.A03;
            String str = this.A04.A00;
            interfaceC43458JHw.D57(c38514GwZ, str);
            if (this.A07) {
                OU4 A00 = AbstractC53871Nrz.A00(this.A02);
                int hashCode = hashCode();
                java.util.Set set = A00.A02;
                Integer valueOf = Integer.valueOf(hashCode);
                if (!set.contains(valueOf)) {
                    set.add(valueOf);
                    Long l = A00.A01;
                    if (l != null) {
                        ((UserFlowLoggerImpl) A00.A04.getValue()).flowMarkPoint(l.longValue(), AnonymousClass001.A0R("SECTION_INIT_", str));
                    }
                }
            }
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        C38514GwZ c38514GwZ = (C38514GwZ) c3oo;
        C14360o3.A0B(c38514GwZ, 0);
        this.A03.D5A(c38514GwZ);
    }
}
