package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.3Pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73203Pv extends C3OO implements InterfaceC73213Pw {
    public int A00;
    public ImageView A01;
    public C3G4 A02;
    public C50N A03;
    public C127315p9 A04;
    public C6b8 A05;
    public boolean A06;
    public final Context A07;
    public final View A08;
    public final View A09;
    public final ViewStub A0A;
    public final IgTextView A0B;
    public final IgImageView A0C;
    public final C57012jc A0D;
    public final InterfaceC56392iX A0E;
    public final C3P1 A0F;
    public final C72983Oz A0G;
    public final NSE A0H;
    public final RecyclerReelAvatarView A0I;
    public final RoundedCornerFrameLayout A0J;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    public final C50N A00() {
        C50N c50n = this.A03;
        if (c50n == null) {
            C50N c50n2 = new C50N(this.A0A.inflate());
            this.A03 = c50n2;
            return c50n2;
        }
        return c50n;
    }

    @Override // X.InterfaceC72963Ox
    /* renamed from: AeS */
    public final RectF Ahl() {
        View Aek;
        C3G4 c3g4 = this.A02;
        if (c3g4 != null && c3g4.A03()) {
            Aek = A00().A02;
        } else {
            Aek = Aek();
        }
        return AbstractC13880nE.A0G(Aek);
    }

    @Override // X.InterfaceC72953Ov
    public final View AeT() {
        return this.A0G.A00();
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A0I.getHolder().A00();
    }

    @Override // X.InterfaceC73213Pw
    public final View B8v() {
        return this.A0J;
    }

    @Override // X.InterfaceC73213Pw
    public final RectF BGZ() {
        return AbstractC13880nE.A0G(this.A0J);
    }

    @Override // X.InterfaceC72953Ov
    public final View BlH() {
        return this.itemView;
    }

    @Override // X.InterfaceC72953Ov
    public final String BlW() {
        return this.A0G.A01;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return ((C3P2) this.A0I.getHolder().A03.getValue()).A0O;
    }

    @Override // X.InterfaceC72953Ov
    public final void CJH(float f) {
        float f2 = 1.0f - f;
        this.A0G.A00().setAlpha(f2);
        this.A08.setAlpha(f2);
        this.A0C.setAlpha(0.0f);
    }

    @Override // X.C3Ow
    public final void CMM() {
        View Aek;
        C3G4 c3g4 = this.A02;
        if (c3g4 != null && c3g4.A03()) {
            Aek = A00().A02;
        } else {
            Aek = Aek();
        }
        Aek.setVisibility(4);
    }

    @Override // X.InterfaceC72953Ov
    public final void EcK(C140626Xq c140626Xq) {
        this.A0G.A00 = c140626Xq;
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        View Aek;
        C3G4 c3g4 = this.A02;
        if (c3g4 != null && c3g4.A03()) {
            Aek = A00().A02;
        } else {
            Aek = Aek();
        }
        Aek.setVisibility(0);
    }

    public C73203Pv(View view, boolean z) {
        super(view);
        this.A06 = false;
        Context context = view.getContext();
        this.A07 = context;
        RecyclerReelAvatarView recyclerReelAvatarView = (RecyclerReelAvatarView) view.requireViewById(R.id.avatar_view);
        this.A0I = recyclerReelAvatarView;
        if (z) {
            NSE nse = new NSE(context, view.getResources(), (ViewStub) view.requireViewById(R.id.story_item_header_stub));
            this.A0H = nse;
            this.A0F = nse;
            recyclerReelAvatarView.setVisibility(8);
        } else {
            this.A0F = new C3P0(view);
        }
        this.A0G = new C72983Oz(view);
        this.A0C = (IgImageView) view.requireViewById(R.id.background_content);
        this.A08 = view.requireViewById(R.id.background_content_bottom_black_gradient);
        this.A09 = view.requireViewById(R.id.background_content_top_black_gradient);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view.requireViewById(R.id.in_feed_item_container);
        this.A0J = roundedCornerFrameLayout;
        C57012jc c57012jc = new C57012jc((ViewStub) view.findViewById(R.id.background_media_gating_view_stub));
        this.A0D = c57012jc;
        c57012jc.A02 = new InterfaceC69513Al() { // from class: X.4Dm
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C73203Pv.this.A01 = (ImageView) view2.findViewById(R.id.dismiss_icon_imageview);
            }
        };
        this.A0A = (ViewStub) view.requireViewById(R.id.livewith_avatar_stub);
        C0fQ.A00(new View.OnClickListener() { // from class: X.4Dn
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
            
                if (r0.CFw() == 1) goto L16;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r20) {
                /*
                    r19 = this;
                    r0 = 2093970619(0x7ccf74bb, float:8.617384E36)
                    int r2 = X.C0f9.A05(r0)
                    r0 = r19
                    X.3Pv r1 = X.C73203Pv.this
                    X.5p9 r0 = r1.A04
                    r0.getClass()
                    X.3Oz r3 = r1.A0G
                    java.lang.String r9 = r3.A01
                    r9.getClass()
                    X.1vS r5 = r0.A05
                    if (r5 == 0) goto Lbf
                    X.3G4 r3 = r0.A06
                    com.instagram.model.reels.Reel r4 = r3.A03
                    com.instagram.common.session.UserSession r3 = r0.A03
                    java.util.List r3 = r4.A0O(r3)
                    int r15 = r3.indexOf(r5)
                L29:
                    X.5sN r3 = r0.A07
                    if (r3 == 0) goto Lbc
                    float r13 = r3.A00
                L2f:
                    com.instagram.common.session.UserSession r5 = r0.A03
                    java.lang.Integer r3 = X.C05F.A00
                    boolean r4 = X.AbstractC43607JQo.A00(r5, r3)
                    if (r4 != 0) goto L80
                    X.3G4 r3 = r0.A06
                    boolean r4 = X.C3P8.A00(r5, r3)
                    X.2vL r5 = r0.A0A
                    int r14 = r0.A00
                    java.util.List r12 = r0.A0D
                    X.3Pv r6 = r0.A09
                    java.lang.String r10 = r0.A0C
                    java.lang.Integer r8 = r0.A0B
                    X.3Pz r7 = r0.A04
                    if (r4 == 0) goto L76
                    X.5jM r0 = r0.A08
                    r3 = 1
                    if (r0 == 0) goto L5b
                    int r0 = r0.CFw()
                    r11 = 1
                    if (r0 != r3) goto L5c
                L5b:
                    r11 = 0
                L5c:
                    r3 = r5
                    r4 = r6
                    r5 = r7
                    r6 = r8
                    r7 = r9
                    r8 = r10
                    r9 = r12
                    r10 = r14
                    r3.De7(r4, r5, r6, r7, r8, r9, r10, r11)
                L67:
                    com.instagram.common.ui.widget.imageview.IgImageView r1 = r1.A0C
                    r0 = 1060320051(0x3f333333, float:0.7)
                    r1.setAlpha(r0)
                    r0 = 2018210049(0x784b7101, float:1.6505129E34)
                    X.C0f9.A0C(r0, r2)
                    return
                L76:
                    r16 = 0
                    X.3G2 r0 = r3.A04
                    java.lang.String r11 = r0.A00
                    r5.De8(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    goto L67
                L80:
                    X.1Ai r7 = X.AbstractC23021Ah.A00(r5)
                    X.0xq r8 = r7.A01
                    r4 = 98
                    java.lang.String r6 = X.AbstractC43591JPw.A00(r4)
                    r4 = 0
                    int r11 = r8.getInt(r6, r4)
                    X.1Qx r4 = X.C26661Qv.A00(r5)
                    X.1R0 r14 = r4.C98()
                    X.OjY r6 = new X.OjY
                    r8 = r0
                    r10 = r13
                    r12 = r15
                    r6.<init>(r7, r8, r9, r10, r11, r12)
                    android.content.Context r12 = r0.A01
                    X.0iw r15 = r0.A02
                    X.3G4 r4 = r0.A06
                    com.instagram.model.reels.Reel r0 = r4.A03
                    com.instagram.common.typedurl.ImageUrl r16 = r0.A07()
                    boolean r0 = r4.A04(r5)
                    java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)
                    r13 = r6
                    r18 = r3
                    X.AbstractC34362FDe.A00(r12, r13, r14, r15, r16, r17, r18)
                    goto L67
                Lbc:
                    r13 = 0
                    goto L2f
                Lbf:
                    r15 = 0
                    goto L29
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC92754Dn.onClick(android.view.View):void");
            }
        }, roundedCornerFrameLayout);
        roundedCornerFrameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.4Do
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C73203Pv c73203Pv = C73203Pv.this;
                C127315p9 c127315p9 = c73203Pv.A04;
                c127315p9.getClass();
                String str = c73203Pv.A0G.A01;
                str.getClass();
                c127315p9.A0A.DeC(c127315p9.A0D, c127315p9.A00, str);
                return true;
            }
        });
        this.A0B = (IgTextView) view.requireViewById(R.id.username);
        this.A0E = AbstractC56372iV.A01(view.requireViewById(R.id.story_item_like_button_stub), false, false);
    }
}
