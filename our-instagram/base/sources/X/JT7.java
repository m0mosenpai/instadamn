package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class JT7 implements MSD, InterfaceC62612t0 {
    public static final String __redex_internal_original_name = "SavedCutoutStickerPickerGridController";
    public MediaPlayer A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public SpinnerImageView A04;
    public String A05;
    public boolean A06;
    public final Context A07;
    public final ViewStub A08;
    public final C2GT A09;
    public final InterfaceC11380iw A0A;
    public final C44093JeI A0B;
    public final UserSession A0C;
    public final C55U A0D;
    public final C8NZ A0E;
    public final EnumC46156Kbu A0F;
    public final JT6 A0G;
    public final C75B A0H;
    public final C153146ui A0I;
    public final InterfaceC62602sz A0J;
    public final String A0K;
    public final java.util.Set A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC16610sE A0N;
    public final boolean A0O;
    public final boolean A0P;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (r21 == X.EnumC46156Kbu.A04) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JT7(android.content.Context r15, android.view.View r16, X.InterfaceC11380iw r17, com.instagram.common.session.UserSession r18, X.C55U r19, X.C8NZ r20, X.EnumC46156Kbu r21) {
        /*
            r14 = this;
            r5 = 1
            r4 = 2
            r3 = 3
            r10 = r18
            X.C14360o3.A0B(r10, r4)
            r2 = 0
            r1 = 5
            r9 = r17
            r6 = r21
            X.AbstractC167007dF.A1J(r9, r1, r6)
            r14.<init>()
            r8 = r15
            r14.A07 = r15
            r14.A0C = r10
            r0 = r19
            r14.A0D = r0
            r14.A0A = r9
            r11 = r20
            r14.A0E = r11
            r14.A0F = r6
            boolean r0 = r0 instanceof X.C81V
            r14.A0P = r0
            java.util.LinkedHashSet r0 = X.AbstractC31171DnF.A0l()
            r14.A0L = r0
            X.Kbu r0 = X.EnumC46156Kbu.A03
            if (r6 == r0) goto L38
            X.Kbu r0 = X.EnumC46156Kbu.A04
            r13 = 0
            if (r6 != r0) goto L39
        L38:
            r13 = 1
        L39:
            r14.A0O = r13
            X.JeI r0 = new X.JeI
            r0.<init>(r14, r1)
            r14.A0B = r0
            X.GHo r12 = new X.GHo
            r12.<init>(r14, r2)
            r14.A0J = r12
            X.75B r1 = X.C8KG.A00(r10)
            r14.A0H = r1
            X.Kbu r0 = X.EnumC46156Kbu.A04
            if (r6 != r0) goto L89
            X.0UO r0 = r1.A08
        L55:
            androidx.lifecycle.CoroutineLiveData r0 = X.AbstractC31172DnG.A0E(r0)
            r14.A09 = r0
            r1 = 35
            X.MHQ r0 = new X.MHQ
            r0.<init>(r14, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r14.A0M = r0
            r1 = 42
            X.DfA r0 = new X.DfA
            r0.<init>(r14, r1)
            r14.A0N = r0
            X.JT6 r7 = new X.JT6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.A0G = r7
            int r1 = r6.ordinal()
            if (r1 == r4) goto L8f
            if (r1 == r3) goto L8f
            if (r1 == r2) goto L8c
            if (r1 == r5) goto L8c
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L89:
            X.0UO r0 = r1.A07
            goto L55
        L8c:
            X.6ui r0 = X.C153146ui.A03
            goto L91
        L8f:
            X.6ui r0 = X.C153146ui.A0E
        L91:
            r14.A0I = r0
            java.lang.String r0 = "saved_cutout_sticker_picker_grid"
            r14.A0K = r0
            if (r1 == r4) goto La8
            if (r1 == r3) goto La8
            if (r1 == r2) goto La4
            if (r1 == r5) goto La4
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La4:
            r0 = 2131428174(0x7f0b034e, float:1.8477985E38)
            goto Lab
        La8:
            r0 = 2131440731(0x7f0b345b, float:1.8503454E38)
        Lab:
            r1 = r16
            android.view.ViewStub r0 = X.AbstractC167007dF.A0M(r1, r0)
            r14.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JT7.<init>(android.content.Context, android.view.View, X.0iw, com.instagram.common.session.UserSession, X.55U, X.8NZ, X.Kbu):void");
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    public static final void A00(JT7 jt7, String str) {
        KNG kng;
        EnumC46147Kbl enumC46147Kbl;
        jt7.A05 = str;
        JT6 jt6 = jt7.A0G;
        ArrayList arrayList = jt6.A05;
        ArrayList A0q = AbstractC167017dG.A0q(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C148276lx C0S = ((InterfaceC148316m1) it.next()).C0S();
            if (C0S != null) {
                String str2 = C0S.A0Z;
                if (C14360o3.A0K(str2, str)) {
                    enumC46147Kbl = EnumC46147Kbl.A04;
                } else {
                    C206409Bx c206409Bx = (C206409Bx) C75B.A00(jt7.A0H).get(str2);
                    if (c206409Bx != null && c206409Bx.A01 != null) {
                        enumC46147Kbl = EnumC46147Kbl.A02;
                    } else {
                        enumC46147Kbl = EnumC46147Kbl.A03;
                    }
                }
                kng = new KNG(enumC46147Kbl, C0S, jt7.A0N, jt7.A0O, jt7.A06);
            } else {
                kng = null;
            }
            A0q.add(kng);
        }
        List A0X = AbstractC001800i.A0X(A0q);
        arrayList.clear();
        jt6.A01(A0X);
    }

    public final RecyclerView A01() {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            return recyclerView;
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C1ON A0N;
        C1P1 c1p1;
        JT6 jt6 = this.A0G;
        if (jt6.A01 && !jt6.A02) {
            jt6.A02 = true;
            if (this.A0P) {
                C75B c75b = this.A0H;
                String str = jt6.A00;
                C55U c55u = this.A0D;
                C47289Kv0 c47289Kv0 = new C47289Kv0(this);
                C8KH c8kh = c75b.A01;
                c1p1 = new C45543KEi(2, c47289Kv0, c75b);
                A0N = LFM.A00.A00(c8kh.A00, c55u, str).A0N();
            } else {
                A0N = LFM.A00.A00(this.A0C, this.A0D, jt6.A00).A0N();
                c1p1 = this.A0B;
            }
            A0N.A00 = c1p1;
            C1GJ.A06(A0N, 759527209, 2, true, false);
        }
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A0L;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    @Override // X.MSD
    public final void E2K() {
        View findViewById;
        if (this.A02 == null) {
            View inflate = this.A08.inflate();
            java.util.Set set = this.A0L;
            set.clear();
            C14360o3.A0A(inflate);
            set.add(inflate);
            RecyclerView A0B = AbstractC43592JPx.A0B(inflate, R.id.sticker_picker_grid_recycler_view);
            C14360o3.A0B(A0B, 0);
            this.A03 = A0B;
            JT6 jt6 = this.A0G;
            jt6.setHasStableIds(true);
            A01().setAdapter(jt6);
            AbstractC31174DnI.A15(this.A07, A01());
            this.A02 = inflate;
            View view = null;
            SpinnerImageView spinnerImageView = (SpinnerImageView) inflate.findViewById(R.id.sticker_picker_grid_loading_spinner);
            if (spinnerImageView != null) {
                EnumC46156Kbu enumC46156Kbu = this.A0F;
                if (enumC46156Kbu == EnumC46156Kbu.A04 || enumC46156Kbu == EnumC46156Kbu.A03) {
                    AbstractC13880nE.A0k(spinnerImageView, 0, 0, 0, 0);
                    ViewOnClickListenerC48063LPo.A00(spinnerImageView, 3, this);
                    spinnerImageView.bringToFront();
                }
            } else {
                spinnerImageView = null;
            }
            this.A04 = spinnerImageView;
            View view2 = this.A02;
            if (view2 != null && (findViewById = view2.findViewById(R.id.sticker_grid_back_button)) != null) {
                ViewOnClickListenerC23249ASk.A00(findViewById, 11, this);
            }
            if (this.A0F == EnumC46156Kbu.A03) {
                View view3 = this.A02;
                if (view3 != null) {
                    view = view3.findViewById(R.id.saved_cutout_stickers_section_empty_state);
                }
                this.A01 = view;
            }
        }
        AbstractC37304Gc5.A0y(A01().A0D, A01(), this, this.A0I);
        JT6 jt62 = this.A0G;
        jt62.A01 = true;
        jt62.A02 = false;
        jt62.A00 = null;
        jt62.A05.clear();
        AD4();
        if (this.A0P) {
            this.A09.A09((InterfaceC58362lv) this.A0M.getValue());
        }
    }

    @Override // X.MSD
    public final void close() {
        if (this.A0P) {
            this.A0G.A05.clear();
            this.A09.A08((InterfaceC58362lv) this.A0M.getValue());
            MediaPlayer mediaPlayer = this.A00;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.A00 = null;
            this.A05 = null;
        }
        AbstractC167007dF.A0x(this.A02);
        A01().A0a();
        A01().A0n(0);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0K;
    }

    @Override // X.MSD
    public final boolean isScrolledToBottom() {
        return AbstractC110854yx.A04(A01());
    }

    @Override // X.MSD
    public final boolean isScrolledToTop() {
        return AbstractC110854yx.A05(A01());
    }
}
