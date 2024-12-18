package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.35n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C682535n extends AnonymousClass346 {
    public final AnonymousClass363 A00;
    public final C683535y A01;
    public final AnonymousClass360 A02;
    public final AnonymousClass366 A03;
    public final AnonymousClass367 A04;
    public final AnonymousClass365 A05;
    public final AnonymousClass362 A06;
    public final AnonymousClass361 A07;
    public final C683135u A08;
    public final C683335w A09;
    public final AnonymousClass364 A0A;
    public final C682635o A0B;
    public final C683635z A0C;
    public final C683235v A0D;
    public final C683435x A0E;
    public final Map A0F;

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Cu2(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c59072n8, 0);
        C14360o3.A0B(c38321qM, 1);
        if (c38321qM.CdW()) {
            c59072n8.A00(this.A0C);
        }
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Cu3(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        InterfaceC43071ya interfaceC43071ya;
        C14360o3.A0B(c59072n8, 1);
        C14360o3.A0B(c38321qM, 2);
        if (c38321qM.CdW()) {
            if (i != EnumC65592xv.A13.ordinal() && i != EnumC65592xv.A0o.ordinal()) {
                if (i == EnumC65592xv.A0U.ordinal()) {
                    interfaceC43071ya = this.A0D;
                } else if (i != EnumC65592xv.A06.ordinal() && i != EnumC65592xv.A0c.ordinal()) {
                    if (i != EnumC65592xv.A1K.ordinal() && i != EnumC65592xv.A0p.ordinal()) {
                        if (i == EnumC65592xv.A09.ordinal()) {
                            interfaceC43071ya = this.A08;
                        } else if (i != EnumC65592xv.A0z.ordinal()) {
                            return;
                        } else {
                            interfaceC43071ya = this.A0A;
                        }
                    } else {
                        interfaceC43071ya = this.A0E;
                    }
                } else {
                    interfaceC43071ya = this.A09;
                }
            } else {
                interfaceC43071ya = this.A0B;
            }
            c59072n8.A00(interfaceC43071ya);
        }
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void DeT(View view, int i, Object obj, Object obj2) {
        AbstractC682735p abstractC682735p;
        int i2;
        Map map;
        int i3;
        int i4;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(obj, 2);
        if (obj instanceof C38321qM) {
            C38321qM c38321qM = (C38321qM) obj;
            if (c38321qM.CdW()) {
                if (i == EnumC65592xv.A0v.ordinal()) {
                    abstractC682735p = this.A01;
                } else if (i != EnumC65592xv.A13.ordinal() && i != EnumC65592xv.A0o.ordinal()) {
                    if (i == EnumC65592xv.A0G.ordinal()) {
                        AnonymousClass362 anonymousClass362 = this.A06;
                        IgProgressImageView A00 = AnonymousClass362.A00(view, R.id.collection_thumbnail_1);
                        IgProgressImageView A002 = AnonymousClass362.A00(view, R.id.collection_thumbnail_2);
                        IgProgressImageView A003 = AnonymousClass362.A00(view, R.id.collection_thumbnail_3);
                        IgProgressImageView A004 = AnonymousClass362.A00(view, R.id.collection_thumbnail_4);
                        IgProgressImageView A005 = AnonymousClass362.A00(view, R.id.collection_thumbnail_5);
                        IgProgressImageView A006 = AnonymousClass362.A00(view, R.id.collection_thumbnail_6);
                        if (AnonymousClass362.A01(A00)) {
                            map = anonymousClass362.A00;
                            i2 = R.id.collection_thumbnail_1;
                        } else {
                            i2 = R.id.collection_thumbnail_7;
                            A00 = AnonymousClass362.A00(view, R.id.collection_thumbnail_7);
                            map = anonymousClass362.A00;
                        }
                        map.put(Integer.valueOf(i2), A00);
                        if (AnonymousClass362.A01(A002)) {
                            i3 = R.id.collection_thumbnail_2;
                        } else {
                            i3 = R.id.collection_thumbnail_8;
                            A002 = AnonymousClass362.A00(view, R.id.collection_thumbnail_8);
                        }
                        map.put(Integer.valueOf(i3), A002);
                        if (AnonymousClass362.A01(A003)) {
                            i4 = R.id.collection_thumbnail_3;
                        } else {
                            i4 = R.id.collection_thumbnail_9;
                            A003 = AnonymousClass362.A00(view, R.id.collection_thumbnail_9);
                        }
                        map.put(Integer.valueOf(i4), A003);
                        if (AnonymousClass362.A01(A004)) {
                            map.put(Integer.valueOf(R.id.collection_thumbnail_4), A004);
                        }
                        if (AnonymousClass362.A01(A005)) {
                            map.put(Integer.valueOf(R.id.collection_thumbnail_5), A005);
                        }
                        if (!AnonymousClass362.A01(A006)) {
                            return;
                        }
                        map.put(Integer.valueOf(R.id.collection_thumbnail_6), A006);
                        return;
                    }
                    if (i == EnumC65592xv.A0x.ordinal()) {
                        A03(view, c38321qM);
                        this.A03.A03(view, c38321qM);
                        abstractC682735p = this.A04;
                    } else if (i != EnumC65592xv.A0n.ordinal() && i != EnumC65592xv.A0w.ordinal() && i != EnumC65592xv.A0B.ordinal()) {
                        if (i != EnumC65592xv.A0z.ordinal()) {
                            return;
                        } else {
                            abstractC682735p = this.A0A;
                        }
                    } else {
                        A03(view, c38321qM);
                        A03(view, c38321qM);
                        this.A07.A03(view, c38321qM);
                        abstractC682735p = this.A00;
                    }
                } else {
                    abstractC682735p = this.A0B;
                }
                abstractC682735p.A03(view, c38321qM);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.35o] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.35u, X.35q] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.35p, X.363] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.35p, X.364] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.365] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.367, X.35p] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.35v, X.35q] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.35w, X.35q] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.35q, X.35x] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.35y] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.35z] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.360] */
    public C682535n(final Context context, final UserSession userSession, final InterfaceC60442pS interfaceC60442pS) {
        final HashMap hashMap = new HashMap();
        this.A0F = hashMap;
        this.A0B = new AbstractC682735p(userSession, hashMap) { // from class: X.35o
            public final boolean A00;
            public final UserSession A01;

            /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
            
                if (r1.getVisibility() != 0) goto L40;
             */
            @Override // X.InterfaceC43071ya
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ATP(X.C59062n7 r8, X.InterfaceC57162jr r9) {
                /*
                    Method dump skipped, instructions count: 261
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C682635o.ATP(X.2n7, X.2jr):void");
            }

            {
                super(hashMap);
                this.A01 = userSession;
                this.A00 = C18U.A06(C06090Tz.A05, userSession, 2342153371403878436L);
            }
        };
        this.A08 = new AbstractC682835q(hashMap);
        this.A0D = new AbstractC682835q(hashMap);
        this.A09 = new AbstractC682835q(hashMap);
        this.A0E = new AbstractC682835q(hashMap);
        this.A01 = new AbstractC682735p(userSession, hashMap) { // from class: X.35y
            public final boolean A00;

            /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
            
                if (r1 != r8.length()) goto L24;
             */
            @Override // X.InterfaceC43071ya
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ATP(X.C59062n7 r12, X.InterfaceC57162jr r13) {
                /*
                    r11 = this;
                    r0 = 0
                    X.C14360o3.A0B(r12, r0)
                    r0 = 1
                    X.C14360o3.A0B(r13, r0)
                    java.lang.Object r2 = r12.A03
                    X.C14360o3.A06(r2)
                    r0 = r2
                    X.1qM r0 = (X.C38321qM) r0
                    X.5Ln r7 = r11.A02(r0)
                    java.lang.Integer r1 = r13.CFq(r12)
                    java.lang.Integer r0 = X.C05F.A0C
                    if (r1 == r0) goto Le5
                    java.lang.Object r0 = r12.A04
                    X.3gU r0 = (X.C79233gU) r0
                    X.3qg r0 = r0.A01
                    java.lang.Integer r1 = r0.A0a
                    java.lang.Integer r0 = X.C05F.A01
                    if (r1 != r0) goto Le5
                    java.util.Map r0 = r11.A00
                    java.lang.Object r1 = r0.get(r2)
                    android.view.View r1 = (android.view.View) r1
                    if (r1 == 0) goto Le5
                    r0 = 2131440227(0x7f0b3263, float:1.8502431E38)
                    android.view.View r1 = r1.findViewById(r0)
                    if (r1 == 0) goto Le5
                    boolean r0 = r1 instanceof com.instagram.ui.widget.textview.IgTextLayoutView
                    if (r0 == 0) goto Le5
                    com.instagram.ui.widget.textview.IgTextLayoutView r1 = (com.instagram.ui.widget.textview.IgTextLayoutView) r1
                    java.lang.CharSequence r9 = r1.getTextForAccessibility()
                    boolean r0 = r9 instanceof android.text.Spanned
                    if (r0 == 0) goto Ldf
                    r8 = r9
                    android.text.Spanned r8 = (android.text.Spanned) r8
                    boolean r0 = r11.A00
                    if (r0 == 0) goto Ldf
                    int r1 = r8.length()
                    java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                    r6 = 0
                    java.lang.Object[] r5 = r8.getSpans(r6, r1, r0)
                    if (r5 == 0) goto Ldf
                    int r4 = r5.length
                    if (r4 == 0) goto Ldf
                    java.util.List r3 = r7.A0D
                    if (r3 == 0) goto L6e
                    int r1 = r3.size()
                    int r0 = r8.length()
                    if (r1 == r0) goto L82
                L6e:
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    r1 = 0
                L74:
                    X.5iw r0 = new X.5iw
                    r0.<init>()
                    r3.add(r0)
                    int r1 = r1 + 1
                    if (r1 < r4) goto L74
                    r7.A0D = r3
                L82:
                    r10 = r5[r6]
                    java.lang.Object r2 = r3.get(r6)
                    X.0Zx r2 = (X.C0Zx) r2
                    r0 = 0
                    X.C14360o3.A0B(r10, r0)
                    boolean r0 = r10 instanceof X.AbstractC85213rC
                    if (r0 == 0) goto Lca
                    r0 = r10
                    X.3rC r0 = (X.AbstractC85213rC) r0
                    int r0 = r0.A00
                L97:
                    java.lang.String r1 = "#"
                    java.lang.String r0 = java.lang.Integer.toHexString(r0)
                    java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
                La1:
                    X.C14360o3.A0A(r1)
                    java.lang.String r0 = "color"
                    r2.A06(r0, r1)
                    int r0 = r8.getSpanStart(r10)
                    long r0 = (long) r0
                    java.lang.Long r1 = java.lang.Long.valueOf(r0)
                    java.lang.String r0 = "start"
                    r2.A05(r0, r1)
                    int r0 = r8.getSpanEnd(r10)
                    long r0 = (long) r0
                    java.lang.Long r1 = java.lang.Long.valueOf(r0)
                    java.lang.String r0 = "end"
                    r2.A05(r0, r1)
                    int r6 = r6 + 1
                    if (r6 >= r4) goto Ldf
                    goto L82
                Lca:
                    boolean r0 = r10 instanceof android.text.style.ForegroundColorSpan
                    if (r0 == 0) goto Ld6
                    r0 = r10
                    android.text.style.ForegroundColorSpan r0 = (android.text.style.ForegroundColorSpan) r0
                    int r0 = r0.getForegroundColor()
                    goto L97
                Ld6:
                    java.lang.Class r0 = r10.getClass()
                    java.lang.String r1 = r0.getName()
                    goto La1
                Ldf:
                    java.lang.String r0 = r9.toString()
                    r7.A06 = r0
                Le5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C683535y.ATP(X.2n7, X.2jr):void");
            }

            {
                super(hashMap);
                this.A00 = C18U.A06(C06090Tz.A05, userSession, 2342153371403878436L);
            }
        };
        this.A0C = new AbstractC682835q(context, userSession, interfaceC60442pS, hashMap) { // from class: X.35z
            public final Context A00;
            public final C18920wW A01;
            public final UserSession A02;
            public final InterfaceC60442pS A03;

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
            
                if (r1 == 0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
            
                if (r1 == 0) goto L27;
             */
            @Override // X.InterfaceC43071ya
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ATP(X.C59062n7 r22, X.InterfaceC57162jr r23) {
                /*
                    Method dump skipped, instructions count: 829
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C683635z.ATP(X.2n7, X.2jr):void");
            }

            {
                super(hashMap);
                this.A00 = context;
                this.A02 = userSession;
                this.A03 = interfaceC60442pS;
                this.A01 = AbstractC12220kQ.A00(interfaceC60442pS, C12180kM.A05, userSession);
            }
        };
        this.A02 = new AbstractC682735p(userSession, hashMap) { // from class: X.360
            public final boolean A00;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                View view;
                int i;
                IgProgressImageView igProgressImageView;
                IgShowreelNativeAnimationIntf Bx7;
                C62672SLk c62672SLk;
                C62672SLk c62672SLk2;
                C73083Pj c73083Pj;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                C38321qM c38321qM = (C38321qM) obj;
                C5Ln A02 = A02(c38321qM);
                if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C && (view = (View) ((AbstractC682735p) this).A00.get(obj)) != null) {
                    if (c38321qM.A5Q()) {
                        i = R.id.collection_main_image;
                    } else if (c38321qM.A0C.Aso() != null) {
                        i = R.id.progress_image_view;
                    } else {
                        i = R.id.row_feed_photo_imageview;
                    }
                    View findViewById = view.findViewById(i);
                    if ((findViewById instanceof IgProgressImageView) && (igProgressImageView = (IgProgressImageView) findViewById) != null) {
                        if (igProgressImageView.getIgImageView().A0N) {
                            ((C5Lo) A02).A02 = igProgressImageView.getHeight();
                            ((C5Lo) A02).A03 = igProgressImageView.getWidth();
                            WeakReference weakReference = ((C75113Zb) c59062n7.A04).A1b;
                            if (weakReference != null) {
                                c73083Pj = (C73083Pj) weakReference.get();
                            } else {
                                c73083Pj = null;
                            }
                            A02.A03 = c73083Pj;
                            if (this.A00 && A02.A07 == null) {
                                StringBuilder sb = new StringBuilder(144);
                                A02.A07 = igProgressImageView.getIgImageView().A08(sb);
                                ((C5Lo) A02).A09 = sb.toString();
                                c38321qM.getId();
                            }
                        }
                        AbstractC115825Lw abstractC115825Lw = (AbstractC115825Lw) igProgressImageView.findViewById(R.id.showreel_native_media_view);
                        if (abstractC115825Lw != null && abstractC115825Lw.CXh()) {
                            C38321qM c38321qM2 = A02.A0K;
                            if (I9Y.A00(c38321qM2)) {
                                ImmutableMap renderingComponentInfos = abstractC115825Lw.getRenderingComponentInfos();
                                if (renderingComponentInfos != null && (c62672SLk2 = (C62672SLk) renderingComponentInfos.get("image")) != null) {
                                    SMV smv = c62672SLk2.A00;
                                    ((C5Lo) A02).A02 = smv.A00;
                                    ((C5Lo) A02).A03 = smv.A01;
                                    ((C5Lo) A02).A07 = smv.A02;
                                }
                                ImmutableMap renderingComponentInfos2 = abstractC115825Lw.getRenderingComponentInfos();
                                if (renderingComponentInfos2 != null && (c62672SLk = (C62672SLk) renderingComponentInfos2.get("text")) != null) {
                                    SMV smv2 = c62672SLk.A00;
                                    ((C5Lo) A02).A04 = smv2.A00;
                                    ((C5Lo) A02).A05 = smv2.A01;
                                }
                                InterfaceC104804nl Aso = c38321qM2.A0C.Aso();
                                if (Aso != null && (Bx7 = Aso.Bx7()) != null) {
                                    ((C5Lo) A02).A0A = Bx7.Anz();
                                    ((C5Lo) A02).A0B = Bx7.C5i();
                                    return;
                                }
                                throw new IllegalStateException(AbstractC111324zv.A00(857));
                            }
                        }
                    }
                }
            }

            {
                super(hashMap);
                this.A00 = C18U.A06(C06090Tz.A05, userSession, 36310362189987873L);
            }
        };
        this.A07 = new AnonymousClass361(userSession, hashMap);
        this.A06 = new AnonymousClass362(hashMap);
        this.A00 = new AbstractC682735p(hashMap);
        this.A0A = new AbstractC682735p(hashMap);
        this.A05 = new AbstractC682735p(interfaceC60442pS, userSession, hashMap) { // from class: X.365
            public final InterfaceC11380iw A00;
            public final UserSession A01;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                View view;
                ArrayList A3O;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                C5Ln A02 = A02((C38321qM) obj);
                if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C && (view = (View) ((AbstractC682735p) this).A00.get(obj)) != null) {
                    View findViewById = view.findViewById(R.id.indicator_text_view);
                    if (findViewById instanceof TextView) {
                        A02.A0A = ((TextView) findViewById).getText().toString();
                        C38321qM c38321qM = A02.A0K;
                        UserSession userSession2 = this.A01;
                        A02.A08 = Long.valueOf(AbstractC76193bO.A01(this.A00, userSession2, c38321qM).ordinal());
                        if (c38321qM.A1g(userSession2).CdW()) {
                            A3O = C5L4.A02(c38321qM);
                        } else {
                            A3O = c38321qM.A3O();
                        }
                        if (A3O != null) {
                            HashMap hashMap2 = new HashMap();
                            int size = A3O.size();
                            for (int i = 0; i < size; i++) {
                                C0Zx c0Zx = new C0Zx();
                                ProductDetailsProductItemDict productDetailsProductItemDict = AbstractC38048Gob.A01(((ProductTag) A3O.get(i)).A02).A01;
                                String str = productDetailsProductItemDict.A0V;
                                if (str == null) {
                                    str = productDetailsProductItemDict.A0T;
                                }
                                c0Zx.A06("current_price", str);
                                c0Zx.A06(DevServerEntity.COLUMN_DESCRIPTION, AbstractC38048Gob.A01(((ProductTag) A3O.get(i)).A02).A0E);
                                c0Zx.A06("full_price", AbstractC38048Gob.A01(((ProductTag) A3O.get(i)).A02).A0G);
                                boolean z = true;
                                if (((ProductTag) A3O.get(i)).A00 != 1) {
                                    z = false;
                                }
                                c0Zx.A03("is_hidden", Boolean.valueOf(z));
                                c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, AbstractC38048Gob.A01(((ProductTag) A3O.get(i)).A02).A0J);
                                c0Zx.A06("product_id", AbstractC38048Gob.A01(((ProductTag) A3O.get(i)).A02).A0H);
                                hashMap2.put(Long.valueOf(i), c0Zx);
                            }
                            A02.A0H = hashMap2;
                        }
                    }
                }
            }

            {
                super(hashMap);
                this.A01 = userSession;
                this.A00 = interfaceC60442pS;
            }
        };
        this.A03 = new AnonymousClass366(userSession, hashMap);
        this.A04 = new AbstractC682735p(hashMap);
    }
}
