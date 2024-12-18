package X;

import X.AbstractC110824yu;
import X.AbstractC167007dF;
import X.AbstractC70663Fe;
import X.C110814yt;
import X.C14360o3;
import X.C210989Uv;
import X.C215759gr;
import X.C3F5;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.karaoke.editor.KaraokeStickerEditorController$layoutManager$1;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.AdP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23630AdP implements InterfaceC60072op, InterfaceC25184BCh, InterfaceC195198kL, C85H {
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C194808jg A04;
    public C218239kv A05;
    public InterfaceC25221BDv A06;
    public C6S5 A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public boolean A0B;
    public View A0C;
    public ImageView A0D;
    public TextView A0E;
    public final Context A0F;
    public final View A0G;
    public final View A0H;
    public final UserSession A0I;
    public final C3I9 A0J;
    public final TargetViewSizeProvider A0K;
    public final A5W A0L;
    public final C69528Vqs A0M;
    public final C8NW A0N;
    public final List A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final View.OnClickListener A0R;
    public final ViewStub A0S;
    public final FragmentActivity A0T;
    public final C07X A0U;
    public final C51179MjN A0V;
    public final C8O8 A0W;
    public final C8D9 A0X;
    public final C8C0 A0Y;
    public final KaraokeStickerEditorController$layoutManager$1 A0Z;
    public final InterfaceC1810081c A0a;
    public final C195208kM A0b;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.Vqs] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.instagram.creation.capture.quickcapture.karaoke.editor.KaraokeStickerEditorController$layoutManager$1] */
    public C23630AdP(View view, FragmentActivity fragmentActivity, C07X c07x, UserSession userSession, C3I9 c3i9, C8O8 c8o8, TargetViewSizeProvider targetViewSizeProvider, C8D9 c8d9, C8C0 c8c0, InterfaceC25221BDv interfaceC25221BDv, InterfaceC1810081c interfaceC1810081c, C8NW c8nw) {
        C14360o3.A0B(c8o8, 9);
        C14360o3.A0B(c8c0, 10);
        this.A0U = c07x;
        this.A06 = interfaceC25221BDv;
        this.A0I = userSession;
        this.A0a = interfaceC1810081c;
        this.A0K = targetViewSizeProvider;
        this.A0J = c3i9;
        this.A0N = c8nw;
        this.A0W = c8o8;
        this.A0Y = c8c0;
        this.A0X = c8d9;
        this.A0T = fragmentActivity;
        final Context A0L = AbstractC166997dE.A0L(view);
        this.A0F = A0L;
        this.A0H = AbstractC166987dD.A0c(view, R.id.text_overlay_edit_text_container);
        this.A0G = AbstractC166987dD.A0c(view, R.id.done_button);
        this.A0S = (ViewStub) AbstractC166987dD.A0c(view, R.id.karaoke_sticker_editor_stub);
        this.A0M = new Object();
        this.A0b = new C195208kM(A0L, c3i9, this);
        this.A08 = C05F.A0C;
        this.A0Z = new LinearLayoutManager(A0L) { // from class: com.instagram.creation.capture.quickcapture.karaoke.editor.KaraokeStickerEditorController$layoutManager$1
            @Override // X.AbstractC70663Fe
            public final View A0f(View view2, int i) {
                C14360o3.A0B(view2, 0);
                return view2;
            }

            @Override // X.AbstractC70663Fe
            public final boolean A16(Rect rect, View view2, RecyclerView recyclerView, boolean z, boolean z2) {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
            public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
                C110814yt c110814yt = new C110814yt(this.A0F);
                ((AbstractC110824yu) c110814yt).A00 = i;
                A10(c110814yt);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
            public final boolean A1Y() {
                C210989Uv c210989Uv = ((C215759gr) this.A0P.getValue()).A00;
                if (c210989Uv != null && AbstractC167007dF.A0g(c210989Uv.A01) != null) {
                    AbstractC110824yu abstractC110824yu = ((AbstractC70663Fe) this).A06;
                    if (abstractC110824yu != null && abstractC110824yu.A05) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final int A1h(C3F5 c3f5) {
                return ((NineSixteenLayoutConfigImpl) this.A0K).A04 * 2;
            }
        };
        this.A0L = new A5W(this);
        this.A0P = AbstractC09440dt.A01(new B8R(this, 1));
        this.A0V = new C51179MjN(0);
        this.A0Q = AbstractC09440dt.A01(new B8R(this, 2));
        this.A0R = new ViewOnClickListenerC23249ASk(this, 20);
        Integer num = C05F.A00;
        this.A09 = num;
        this.A0A = num;
        C6S5 c6s5 = C6S5.A05;
        this.A07 = c6s5;
        this.A0O = AbstractC16960so.A1Q(c6s5, C6S5.A04, C6S5.A06);
        EnumC1810181d enumC1810181d = EnumC1810181d.A0j;
        C1810281e c1810281e = ((C1809981b) interfaceC1810081c).A01;
        c1810281e.A01(this, enumC1810181d);
        c1810281e.A01(this, EnumC1810181d.A0K);
        A02(this);
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
    }

    public static final void A00(C23630AdP c23630AdP) {
        C22993ABs BKP;
        Integer num;
        int intValue;
        String A0g;
        InterfaceC25221BDv interfaceC25221BDv = c23630AdP.A06;
        if (interfaceC25221BDv != null && (BKP = interfaceC25221BDv.BKP()) != null && (num = BKP.A05) != null && BKP.A07.size() > (intValue = num.intValue())) {
            String str = ((US9) BKP.A07.get(intValue)).A05;
            C210989Uv c210989Uv = ((C215759gr) c23630AdP.A0P.getValue()).A00;
            if (c210989Uv != null && (A0g = AbstractC167007dF.A0g(c210989Uv.A01)) != null) {
                Iterator it = BKP.A07.iterator();
                while (it.hasNext()) {
                    if (C14360o3.A0K(((US9) it.next()).A05, str)) {
                        InterfaceC25221BDv interfaceC25221BDv2 = c23630AdP.A06;
                        if (interfaceC25221BDv2 != null) {
                            interfaceC25221BDv2.ETa(str, A0g);
                        }
                        A06(c23630AdP);
                        RecyclerView recyclerView = c23630AdP.A03;
                        if (recyclerView == null) {
                            C14360o3.A0F("editRecyclerView");
                            throw C00O.createAndThrow();
                        }
                        AbstractC13880nE.A0O(recyclerView);
                        return;
                    }
                }
                throw new NoSuchElementException(MSV.A00(1));
            }
        }
    }

    public static final void A01(C23630AdP c23630AdP) {
        View inflate = c23630AdP.A0S.inflate();
        c23630AdP.A00 = inflate;
        String str = "captionEditor";
        if (inflate != null) {
            c23630AdP.A0E = AbstractC166997dE.A0T(inflate, R.id.karaoke_sticker_transcribing_hint);
            View view = c23630AdP.A0G;
            Context context = c23630AdP.A0F;
            AbstractC166997dE.A18(context, view, 2131961124);
            AbstractC010103p.A0B(view, new C50825MdI(1));
            View view2 = c23630AdP.A00;
            if (view2 != null) {
                View requireViewById = view2.requireViewById(R.id.karaoke_sticker_preview);
                c23630AdP.A02 = requireViewById;
                if (requireViewById != null) {
                    C0fQ.A00(c23630AdP.A0R, requireViewById);
                    c23630AdP.A05 = new C218239kv(context, c23630AdP.A0K, c23630AdP.A0Y, c23630AdP);
                    View view3 = c23630AdP.A00;
                    if (view3 != null) {
                        c23630AdP.A0D = (ImageView) view3.requireViewById(R.id.karaoke_sticker_color_button);
                        A04(c23630AdP);
                        ImageView imageView = c23630AdP.A0D;
                        String str2 = "colorButton";
                        if (imageView != null) {
                            C3P9 A0s = AbstractC166987dD.A0s(imageView);
                            ImageView imageView2 = c23630AdP.A0D;
                            if (imageView2 != null) {
                                View view4 = c23630AdP.A02;
                                if (view4 != null) {
                                    A0s.A02(imageView2, view4);
                                    C216559iC.A02(A0s, c23630AdP, 13);
                                    View view5 = c23630AdP.A00;
                                    if (view5 != null) {
                                        View requireViewById2 = view5.requireViewById(R.id.karaoke_sticker_emphasis_button);
                                        c23630AdP.A01 = requireViewById2;
                                        str2 = "emphasisButton";
                                        if (requireViewById2 != null) {
                                            C3P9 A0s2 = AbstractC166987dD.A0s(requireViewById2);
                                            View view6 = c23630AdP.A01;
                                            if (view6 != null) {
                                                View view7 = c23630AdP.A02;
                                                if (view7 != null) {
                                                    A0s2.A02(view6, view7);
                                                    C216559iC.A02(A0s2, c23630AdP, 14);
                                                    View view8 = c23630AdP.A00;
                                                    if (view8 != null) {
                                                        c23630AdP.A0C = view8.requireViewById(R.id.karaoke_sticker_edit_hint);
                                                        View view9 = c23630AdP.A00;
                                                        if (view9 != null) {
                                                            RecyclerView recyclerView = (RecyclerView) view9.requireViewById(R.id.karaoke_sticker_edit_word_list);
                                                            c23630AdP.A03 = recyclerView;
                                                            str = "editRecyclerView";
                                                            if (recyclerView != null) {
                                                                recyclerView.setLayoutManager(c23630AdP.A0Z);
                                                                RecyclerView recyclerView2 = c23630AdP.A03;
                                                                if (recyclerView2 != null) {
                                                                    recyclerView2.A10(c23630AdP.A0V);
                                                                    RecyclerView recyclerView3 = c23630AdP.A03;
                                                                    if (recyclerView3 != null) {
                                                                        C70623Ez c70623Ez = new C70623Ez();
                                                                        ((C3F1) c70623Ez).A01 = 500L;
                                                                        recyclerView3.setItemAnimator(c70623Ez);
                                                                        RecyclerView recyclerView4 = c23630AdP.A03;
                                                                        if (recyclerView4 != null) {
                                                                            recyclerView4.A0Z = false;
                                                                            C195208kM c195208kM = c23630AdP.A0b;
                                                                            c195208kM.A02 = recyclerView4;
                                                                            c195208kM.A06 = true;
                                                                            c195208kM.A03 = true;
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                }
                C14360o3.A0F("stickerPreview");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(C23630AdP c23630AdP) {
        C2GT AgF;
        C2GT C9B;
        InterfaceC25221BDv interfaceC25221BDv = c23630AdP.A06;
        if (interfaceC25221BDv != null && (C9B = interfaceC25221BDv.C9B()) != null) {
            C9B.A06(c23630AdP.A0U, new C9LO(52, new B8U(c23630AdP, 22)));
        }
        InterfaceC25221BDv interfaceC25221BDv2 = c23630AdP.A06;
        if (interfaceC25221BDv2 != null && (AgF = interfaceC25221BDv2.AgF()) != null) {
            AgF.A06(c23630AdP.A0U, new C9LO(52, new B8U(c23630AdP, 23)));
        }
    }

    public static final void A03(C23630AdP c23630AdP) {
        if (c23630AdP.A08 == C05F.A0C) {
            c23630AdP.A0X.A02(false);
            C218239kv c218239kv = c23630AdP.A05;
            if (c218239kv != null) {
                ((C8J9) c218239kv).A01.A0A(c218239kv, false);
                return;
            }
        } else {
            C218239kv c218239kv2 = c23630AdP.A05;
            if (c218239kv2 != null) {
                c218239kv2.CMH(false);
                C8D9 c8d9 = c23630AdP.A0X;
                NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) c23630AdP.A0K;
                c8d9.A00.setTranslationY(-(nineSixteenLayoutConfigImpl.A04 - nineSixteenLayoutConfigImpl.A0K.getHeight()));
                c8d9.A03(false, true);
                return;
            }
        }
        C14360o3.A0F("snapPickerController");
        throw C00O.createAndThrow();
    }

    public static final void A04(C23630AdP c23630AdP) {
        ImageView imageView = c23630AdP.A0D;
        if (imageView == null) {
            C14360o3.A0F("colorButton");
            throw C00O.createAndThrow();
        }
        Integer num = c23630AdP.A08;
        Integer num2 = C05F.A0C;
        int i = R.drawable.instagram_text_typeface_outline_44;
        if (num == num2) {
            i = R.drawable.instagram_icons_exceptions_color_picker_filled_44;
        }
        imageView.setImageResource(i);
    }

    public static final void A05(C23630AdP c23630AdP) {
        C22993ABs BKP;
        C194808jg c194808jg = c23630AdP.A04;
        if (c194808jg != null) {
            Iterator it = c194808jg.A06(C5RU.class).iterator();
            while (it.hasNext()) {
                C5RU c5ru = (C5RU) it.next();
                InterfaceC25221BDv interfaceC25221BDv = c23630AdP.A06;
                if (interfaceC25221BDv != null && (BKP = interfaceC25221BDv.BKP()) != null) {
                    C66646URk A05 = c5ru.A05();
                    List A00 = c23630AdP.A0M.A00(BKP.A00());
                    int i = A05.A01;
                    VES ves = A05.A02;
                    int i2 = A05.A00;
                    C6S5 c6s5 = A05.A03;
                    Integer num = A05.A09;
                    String str = A05.A06;
                    boolean z = A05.A08;
                    Integer num2 = A05.A05;
                    Integer num3 = A05.A04;
                    AbstractC167017dG.A1O(A00, ves);
                    C14360o3.A0B(c6s5, 4);
                    c5ru.A08(new C66646URk(ves, c6s5, num, num2, num3, str, A00, i, i2, z));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r7 != r9.intValue()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r2 = r1.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (X.AJp.A01(r2) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r1 = (java.lang.String) X.AbstractC166997dE.A0m(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r6 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r1.length() != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r2 = r2.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r2 >= 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        r2 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        r1 = X.AbstractC002300n.A0c("-", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        X.AbstractC167017dG.A1R(r5, r1);
        r0 = new java.lang.Object();
        r0.A00 = r7;
        r0.A01 = r5;
        r0.A02 = r1;
        r0.A03 = r6;
        r0.A04 = r11;
        r8.add(r0);
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0046, code lost:
    
        if (r9 != null) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.9aC, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C23630AdP r14) {
        /*
            X.BDv r0 = r14.A06
            if (r0 == 0) goto Lb1
            X.ABs r4 = r0.BKP()
            if (r4 == 0) goto Lb1
            X.Vqs r0 = r14.A0M
            java.util.Map r10 = r4.A00()
            java.lang.Integer r9 = r4.A05
            r3 = 0
            X.C14360o3.A0B(r10, r3)
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L8b
            java.util.ArrayList r8 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r13 = r0.iterator()
            r7 = 0
        L23:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r1 = r13.next()
            int r12 = r7 + 1
            if (r7 >= 0) goto L39
            X.AbstractC16960so.A1U()
        L34:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L39:
            X.US9 r1 = (X.US9) r1
            if (r9 == 0) goto L44
            int r0 = r9.intValue()
            r6 = 1
            if (r7 == r0) goto L48
        L44:
            r6 = 0
            r11 = 1
            if (r9 == 0) goto L49
        L48:
            r11 = r6
        L49:
            java.lang.String r2 = r1.A06
            boolean r0 = X.AJp.A01(r2)
            if (r0 == 0) goto L89
            java.lang.String r5 = ""
        L53:
            java.lang.Object r1 = X.AbstractC166997dE.A0m(r10, r7)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L5c
            r1 = r2
        L5c:
            if (r6 != 0) goto L72
            int r0 = r1.length()
            if (r0 != 0) goto L72
            int r2 = r2.length()
            java.lang.String r1 = "-"
            r0 = 4
            if (r2 >= r0) goto L6e
            r2 = 4
        L6e:
            java.lang.String r1 = X.AbstractC002300n.A0c(r1, r2)
        L72:
            X.AbstractC167017dG.A1R(r5, r1)
            X.9aC r0 = new X.9aC
            r0.<init>()
            r0.A00 = r7
            r0.A01 = r5
            r0.A02 = r1
            r0.A03 = r6
            r0.A04 = r11
            r8.add(r0)
            r7 = r12
            goto L23
        L89:
            r5 = r2
            goto L53
        L8b:
            java.lang.String r0 = "tokens"
            X.C14360o3.A0F(r0)
            goto L34
        L91:
            r4.A06 = r8
            java.lang.Integer r0 = r4.A05
            r4.A04 = r0
            X.0do r0 = r14.A0Q
            java.lang.Object r2 = X.AbstractC166987dD.A17(r0)
            X.2zD r2 = (X.C66362zD) r2
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r1.<init>()
            java.util.List r0 = r4.A06
            r1.A01(r0)
            X.LZ0 r0 = new X.LZ0
            r0.<init>(r3, r14, r4)
            r2.A06(r1, r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23630AdP.A06(X.AdP):void");
    }

    public static final void A07(C23630AdP c23630AdP, C6S5 c6s5) {
        C194808jg c194808jg = c23630AdP.A04;
        if (c194808jg != null) {
            Iterator it = c194808jg.A06(C5RU.class).iterator();
            while (it.hasNext()) {
                ((C5RU) it.next()).A09(c6s5);
            }
        }
    }

    public static final void A08(C23630AdP c23630AdP, Integer num) {
        int i;
        Context context = c23630AdP.A0F;
        int intValue = num.intValue();
        if (intValue != 0) {
            i = 2131964710;
            if (intValue != 1) {
                i = 2131964703;
            }
        } else {
            i = 2131964709;
        }
        C9GR.A0F(context, "handle_transcription_failure", i);
        if (c23630AdP.A0B) {
            c23630AdP.A0a.E4u(new Object());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A09(X.C23630AdP r12, java.lang.Integer r13) {
        /*
            r12.A0A = r13
            int r1 = r13.intValue()
            java.lang.String r11 = "snapPickerController"
            java.lang.String r10 = "emphasisButton"
            java.lang.String r9 = "editHintView"
            java.lang.String r8 = "colorButton"
            java.lang.String r7 = "editRecyclerView"
            java.lang.String r6 = "stickerPreview"
            java.lang.String r5 = "loadingView"
            r2 = 1
            r0 = 0
            if (r1 == r0) goto L4c
            android.widget.TextView r3 = r12.A0E
            if (r1 == r2) goto L7d
            if (r3 == 0) goto Lcd
            android.view.View r1 = r12.A02
            if (r1 == 0) goto Lc9
            android.widget.ImageView r0 = r12.A0D
            if (r0 == 0) goto Lc5
            android.view.View[] r0 = new android.view.View[]{r3, r1, r0}
            X.AbstractC125325le.A05(r0, r2)
            android.view.View r0 = r12.A01
            if (r0 == 0) goto Lb9
            X.AbstractC166997dE.A1L(r0, r2)
            androidx.recyclerview.widget.RecyclerView r1 = r12.A03
            if (r1 == 0) goto Lc1
            android.view.View r0 = r12.A0C
            if (r0 == 0) goto Lbd
            android.view.View[] r1 = new android.view.View[]{r1, r0}
        L40:
            r0 = 0
            X.AbstractC125325le.A04(r0, r1, r2)
            X.9kv r0 = r12.A05
            if (r0 == 0) goto Ld1
            r0.CMH(r2)
            return
        L4c:
            android.widget.TextView r1 = r12.A0E
            if (r1 == 0) goto Lcd
            r0 = 2131964712(0x7f133328, float:1.9566213E38)
            r1.setText(r0)
            android.view.View r4 = r12.A02
            if (r4 == 0) goto Lc9
            android.widget.ImageView r3 = r12.A0D
            if (r3 == 0) goto Lc5
            androidx.recyclerview.widget.RecyclerView r1 = r12.A03
            if (r1 == 0) goto Lc1
            android.view.View r0 = r12.A0C
            if (r0 == 0) goto Lbd
            android.view.View[] r0 = new android.view.View[]{r4, r3, r1, r0}
            X.AbstractC125325le.A05(r0, r2)
            android.view.View r0 = r12.A01
            if (r0 == 0) goto Lb9
            X.AbstractC166997dE.A1L(r0, r2)
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto Lcd
            android.view.View[] r1 = new android.view.View[]{r0}
            goto L40
        L7d:
            if (r3 == 0) goto Lcd
            androidx.recyclerview.widget.RecyclerView r1 = r12.A03
            if (r1 == 0) goto Lc1
            android.view.View r0 = r12.A0C
            if (r0 == 0) goto Lbd
            android.view.View[] r0 = new android.view.View[]{r3, r1, r0}
            X.AbstractC125325le.A05(r0, r2)
            android.view.View r1 = r12.A02
            if (r1 == 0) goto Lc9
            android.widget.ImageView r0 = r12.A0D
            if (r0 == 0) goto Lc5
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            r1 = 0
            X.AbstractC125325le.A04(r1, r0, r2)
            android.view.View r0 = r12.A01
            if (r0 == 0) goto Lb9
            android.view.View[] r0 = new android.view.View[]{r0}
            X.AbstractC125325le.A04(r1, r0, r2)
            X.9kv r1 = r12.A05
            if (r1 == 0) goto Ld1
            X.8C0 r0 = r1.A01
            r0.A0A(r1, r2)
            A04(r12)
            A03(r12)
            return
        Lb9:
            X.C14360o3.A0F(r10)
            goto Ld4
        Lbd:
            X.C14360o3.A0F(r9)
            goto Ld4
        Lc1:
            X.C14360o3.A0F(r7)
            goto Ld4
        Lc5:
            X.C14360o3.A0F(r8)
            goto Ld4
        Lc9:
            X.C14360o3.A0F(r6)
            goto Ld4
        Lcd:
            X.C14360o3.A0F(r5)
            goto Ld4
        Ld1:
            X.C14360o3.A0F(r11)
        Ld4:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23630AdP.A09(X.AdP, java.lang.Integer):void");
    }

    public final void A0A() {
        C22993ABs BKP;
        C22993ABs BKP2;
        InterfaceC25221BDv interfaceC25221BDv = this.A06;
        if (interfaceC25221BDv != null) {
            interfaceC25221BDv.reset();
        }
        this.A04 = null;
        InterfaceC25221BDv interfaceC25221BDv2 = this.A06;
        if (interfaceC25221BDv2 != null && (BKP2 = interfaceC25221BDv2.BKP()) != null) {
            BKP2.A01 = 0;
        }
        C6S5 c6s5 = C6S5.A05;
        this.A07 = c6s5;
        if (interfaceC25221BDv2 != null && (BKP = interfaceC25221BDv2.BKP()) != null) {
            C14360o3.A0B(c6s5, 0);
            BKP.A03 = c6s5;
        }
        this.A09 = C05F.A00;
    }

    public final void A0B(int i, boolean z) {
        InterfaceC25221BDv interfaceC25221BDv;
        C22993ABs BKP;
        C194808jg c194808jg = this.A04;
        if (c194808jg != null) {
            Iterator it = c194808jg.A06(C5RU.class).iterator();
            while (it.hasNext()) {
                C5RU c5ru = (C5RU) it.next();
                if (z && (interfaceC25221BDv = this.A06) != null && (BKP = interfaceC25221BDv.BKP()) != null) {
                    BKP.A00 = i;
                }
                c5ru.A07(i);
            }
        }
    }

    @Override // X.C85H
    public final /* bridge */ /* synthetic */ boolean A7D(Object obj, Object obj2) {
        if (this.A0A == C05F.A0C && this.A04 != null) {
            InterfaceC25221BDv interfaceC25221BDv = this.A06;
            if (interfaceC25221BDv != null) {
                C22993ABs BKP = interfaceC25221BDv.BKP();
                if (BKP != null && BKP.A05 != null) {
                    A00(this);
                    return false;
                }
                C22993ABs BKP2 = interfaceC25221BDv.BKP();
                if (BKP2 != null) {
                    BKP2.A05 = null;
                }
            }
            A05(this);
            InterfaceC25221BDv interfaceC25221BDv2 = this.A06;
            if (interfaceC25221BDv2 != null) {
                interfaceC25221BDv2.AIc(this.A0F);
            }
            A09(this, C05F.A01);
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    @Override // X.InterfaceC25184BCh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DDv(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23630AdP.DDv(java.lang.Object):void");
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        C8NW c8nw;
        Object obj;
        C2GT C9B;
        String str;
        C195208kM c195208kM = this.A0b;
        c195208kM.A07.EFx(c195208kM);
        InterfaceC09390do interfaceC09390do = this.A0P;
        if (interfaceC09390do.CWa()) {
            C215759gr c215759gr = (C215759gr) interfaceC09390do.getValue();
            c215759gr.A03.EFx(c215759gr.A02);
        }
        View view = this.A0H;
        View view2 = this.A00;
        if (view2 == null) {
            str = "captionEditor";
        } else {
            View view3 = this.A0G;
            View view4 = this.A02;
            if (view4 == null) {
                str = "stickerPreview";
            } else {
                ImageView imageView = this.A0D;
                if (imageView == null) {
                    str = "colorButton";
                } else {
                    AbstractC125325le.A05(new View[]{view, view2, view3, view4, imageView}, true);
                    View view5 = this.A01;
                    if (view5 == null) {
                        str = "emphasisButton";
                    } else {
                        AbstractC166997dE.A1L(view5, true);
                        C218239kv c218239kv = this.A05;
                        if (c218239kv == null) {
                            str = "snapPickerController";
                        } else {
                            c218239kv.CMH(true);
                            this.A0X.A02(true);
                            C194808jg c194808jg = this.A04;
                            if (c194808jg != null) {
                                C66646URk A00 = AbstractC226589zG.A00(c194808jg);
                                if (A00 != null) {
                                    InterfaceC25221BDv interfaceC25221BDv = this.A06;
                                    if (interfaceC25221BDv != null && (C9B = interfaceC25221BDv.C9B()) != null) {
                                        obj = C9B.A02();
                                    } else {
                                        obj = null;
                                    }
                                    if (C18U.A06(C06090Tz.A06, this.A0I, 36323650818878932L) && (obj instanceof C218409lC)) {
                                        c8nw = this.A0N;
                                        c8nw.Dog(A00, null);
                                    } else {
                                        c8nw = this.A0N;
                                        c8nw.Dog(A00, null);
                                    }
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            } else {
                                c8nw = this.A0N;
                                c8nw.Dof();
                            }
                            this.A0B = false;
                            C8O8 c8o8 = this.A0W;
                            C148276lx c148276lx = C148276lx.A0a;
                            c8o8.Doh("captions_sticker_id");
                            UserSession userSession = this.A0I;
                            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                            if (c8nw.A1X()) {
                                C06090Tz c06090Tz = C06090Tz.A05;
                                if (C18U.A06(c06090Tz, userSession, 36322937854438147L)) {
                                    FragmentActivity fragmentActivity = this.A0T;
                                    AbstractC23031ADn.A01(fragmentActivity, userSession, AnonymousClass229.A01(userSession), A002, C18U.A06(c06090Tz, userSession, 36322937854634758L));
                                    AbstractC23031ADn.A00(fragmentActivity, userSession, AnonymousClass229.A01(userSession), A002);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C22993ABs BKP;
        if (this.A0A == C05F.A0C && this.A04 != null) {
            InterfaceC25221BDv interfaceC25221BDv = this.A06;
            if (interfaceC25221BDv != null && (BKP = interfaceC25221BDv.BKP()) != null) {
                BKP.A05 = null;
            }
            A05(this);
            InterfaceC25221BDv interfaceC25221BDv2 = this.A06;
            if (interfaceC25221BDv2 != null) {
                interfaceC25221BDv2.AIc(this.A0F);
            }
            A09(this, C05F.A01);
            return true;
        }
        return false;
    }
}
