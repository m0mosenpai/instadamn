package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;

/* renamed from: X.8bH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189988bH implements InterfaceC189998bI, InterfaceC189808az, InterfaceC190008bJ {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public ViewGroup A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ImageView A0D;
    public ProgressBar A0E;
    public TextView A0F;
    public EnumC46263Kdv A0G;
    public EnumC203578zI A0H;
    public IgTextView A0I;
    public NHT A0J;
    public BottomSheetViewController A0K;
    public EnumC185288Jt A0L;
    public EnumC185288Jt A0M;
    public C23104AGq A0N;
    public C38059Gom A0O;
    public MusicAssetModel A0P;
    public TrackSnippet A0Q;
    public C41059IGc A0R;
    public C38064Gos A0S;
    public AlI A0T;
    public C23107AGt A0U;
    public AAU A0V;
    public C29361Cwu A0W;
    public AK9 A0X;
    public C24026AlJ A0Y;
    public AMp A0Z;
    public C23477Aaq A0a;
    public AnonymousClass879 A0b;
    public SpinnerImageView A0c;
    public Integer A0d;
    public Integer A0e;
    public String A0f;
    public String A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public C185278Js A0m;
    public EnumC138556Pl A0n;
    public Integer A0o;
    public boolean A0p;
    public final int A0q;
    public final Handler A0r;
    public final ViewStub A0s;
    public final C9B8 A0t;
    public final AbstractC59962oe A0u;
    public final UserSession A0v;
    public final TargetViewSizeProvider A0w;
    public final InterfaceC190038bM A0x;
    public final InterfaceC189958bE A0y;
    public final C8BO A0z;
    public final C190018bK A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final ClipsCreationViewModel A17;

    public C189988bH(ViewStub viewStub, C9B8 c9b8, AbstractC59962oe abstractC59962oe, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, InterfaceC189958bE interfaceC189958bE, C8BO c8bo, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        ClipsCreationViewModel clipsCreationViewModel;
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(viewStub, 3);
        C14360o3.A0B(interfaceC189958bE, 5);
        this.A0u = abstractC59962oe;
        this.A0v = userSession;
        this.A0s = viewStub;
        this.A0t = c9b8;
        this.A0y = interfaceC189958bE;
        this.A0w = targetViewSizeProvider;
        this.A14 = z;
        this.A0z = c8bo;
        this.A12 = z2;
        this.A11 = z3;
        this.A0q = i;
        this.A16 = z4;
        this.A13 = z5;
        this.A15 = z6;
        this.A10 = new C190018bK(this);
        this.A0x = new InterfaceC190038bM() { // from class: X.8bL
            @Override // X.InterfaceC190038bM
            public final void Cxz(double d) {
                C189988bH c189988bH = C189988bH.this;
                c189988bH.A0r.post(new RunnableC24698Awe(c189988bH, d));
            }
        };
        this.A0r = new Handler(Looper.getMainLooper());
        FragmentActivity activity = abstractC59962oe.getActivity();
        if (activity != null) {
            clipsCreationViewModel = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, activity), activity).A00(ClipsCreationViewModel.class);
        } else {
            clipsCreationViewModel = null;
        }
        this.A17 = clipsCreationViewModel;
        this.A0e = C05F.A00;
    }

    public final void A0K(MusicAssetModel musicAssetModel, int i, boolean z) {
        A03(musicAssetModel, this, null, Integer.valueOf(i), null, false, z, false, false);
    }

    public final void A0L(MusicAssetModel musicAssetModel, boolean z) {
        if (this.A0u.mView != null) {
            A03(musicAssetModel, this, null, null, null, true, z, false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    @Override // X.InterfaceC190008bJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQw(java.lang.Integer r7) {
        /*
            r6 = this;
            r5 = 0
            X.C14360o3.A0B(r7, r5)
            r6.A0k = r5
            int r0 = r7.intValue()
            r4 = 2
            r3 = 1
            if (r0 == r3) goto L18
            if (r0 == r4) goto L1c
            if (r0 == r5) goto L2b
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L18:
            r2 = 2131967981(0x7f133fed, float:1.9572844E38)
            goto L1f
        L1c:
            r2 = 2131967979(0x7f133feb, float:1.957284E38)
        L1f:
            android.view.ViewGroup r0 = r6.A08
            if (r0 == 0) goto L2b
            android.content.Context r1 = r0.getContext()
            r0 = 0
            X.C9GR.A01(r1, r0, r2, r5)
        L2b:
            X.879 r0 = r6.A0b
            if (r0 == 0) goto L40
            java.lang.Integer r0 = r0.CAH()
            int r0 = r0.intValue()
            if (r0 != r4) goto L3d
            r6.A01()
            return
        L3d:
            r6.A0p = r3
            return
        L40:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189988bH.DQw(java.lang.Integer):void");
    }

    @Override // X.InterfaceC190008bJ
    public final void DQx(C38059Gom c38059Gom) {
        this.A0O = c38059Gom;
        this.A0k = false;
        AnonymousClass879 anonymousClass879 = this.A0b;
        if (anonymousClass879 != null) {
            if (anonymousClass879.CAH().intValue() == 2) {
                A01();
                return;
            } else {
                this.A0p = true;
                return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C185278Js A00(C189988bH c189988bH) {
        C185278Js c185278Js = c189988bH.A0m;
        if (c185278Js == null) {
            AbstractC59962oe abstractC59962oe = c189988bH.A0u;
            if (abstractC59962oe.isAdded()) {
                C185278Js c185278Js2 = (C185278Js) new C52942bb(new C185268Jr(c189988bH.A0v, abstractC59962oe.requireActivity()), abstractC59962oe).A00(C185278Js.class);
                c189988bH.A0m = c185278Js2;
                return c185278Js2;
            }
            return c185278Js;
        }
        return c185278Js;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0260, code lost:
    
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189988bH.A01():void");
    }

    private final void A02() {
        C189478aR c189478aR;
        View[] viewArr = {this.A09};
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le.A03(viewArr[0], null, 4, false);
        AAU aau = this.A0V;
        if (aau != null && (c189478aR = aau.A01) != null) {
            c189478aR.A0L(null);
        }
    }

    public static final void A04(TrackSnippet trackSnippet, C189988bH c189988bH) {
        AnonymousClass879 anonymousClass879 = c189988bH.A0b;
        if (anonymousClass879 != null) {
            anonymousClass879.EZP(trackSnippet.A01);
        }
        if (!c189988bH.A16 && AbstractC185298Jv.A0A(c189988bH.A0v)) {
            c189988bH.A0y.Cxy(c189988bH.A0L, c189988bH.A0D(), true);
        } else {
            AnonymousClass879 anonymousClass8792 = c189988bH.A0b;
            if (anonymousClass8792 != null) {
                anonymousClass8792.E4S();
            }
        }
        A05(c189988bH);
    }

    public static final void A05(C189988bH c189988bH) {
        String str;
        ImageView imageView = c189988bH.A0C;
        if (imageView != null) {
            InterfaceC189958bE interfaceC189958bE = c189988bH.A0y;
            int i = 4;
            if (interfaceC189958bE.CaV()) {
                i = 0;
            }
            imageView.setVisibility(i);
            if (interfaceC189958bE.CaV()) {
                AnonymousClass879 anonymousClass879 = c189988bH.A0b;
                if ((anonymousClass879 != null && anonymousClass879.isPlaying()) || c189988bH.A0l) {
                    imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.music_editor_stop));
                    str = c189988bH.A0g;
                } else {
                    imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.music_editor_play));
                    str = c189988bH.A0f;
                }
                imageView.setContentDescription(str);
            }
        }
    }

    public static final void A06(C189988bH c189988bH) {
        View view = c189988bH.A05;
        if (view != null) {
            view.setVisibility(8);
        }
        C23107AGt c23107AGt = c189988bH.A0U;
        if (c23107AGt != null) {
            InterfaceC56392iX interfaceC56392iX = c23107AGt.A02;
            if (interfaceC56392iX.CGb() != 8) {
                interfaceC56392iX.getView().setVisibility(0);
            }
        }
        AlI alI = c189988bH.A0T;
        if (alI != null) {
            alI.A03.setEnabled(true);
        }
        C29361Cwu c29361Cwu = c189988bH.A0W;
        if (c29361Cwu != null) {
            RecyclerView recyclerView = c29361Cwu.A0E;
            recyclerView.setNestedScrollingEnabled(true);
            recyclerView.setOnTouchListener(c29361Cwu.A0B);
        }
        C24026AlJ c24026AlJ = c189988bH.A0Y;
        if (c24026AlJ != null) {
            c24026AlJ.A05.setEnabled(true);
        }
        View view2 = c189988bH.A04;
        if (view2 != null) {
            view2.setEnabled(true);
        }
        View view3 = c189988bH.A04;
        if (view3 != null) {
            view3.setAlpha(1.0f);
        }
        AnonymousClass879 anonymousClass879 = c189988bH.A0b;
        if (anonymousClass879 != null) {
            anonymousClass879.E4S();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5.A0v, 36322306494048386L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.C189988bH r5) {
        /*
            X.8bE r0 = r5.A0y
            boolean r0 = r0.CSV()
            r4 = 0
            if (r0 != 0) goto L19
            com.instagram.common.session.UserSession r3 = r5.A0v
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322306494048386(0x810af200002882, double:3.0337111128003963E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L1a
        L19:
            r1 = 0
        L1a:
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L26
            if (r1 != 0) goto L22
            r4 = 8
        L22:
            r0.setVisibility(r4)
            return
        L26:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189988bH.A07(X.8bH):void");
    }

    public static final void A09(C189988bH c189988bH, Integer num) {
        c189988bH.A0e = num;
        c189988bH.A0y.DTj(num);
        int intValue = c189988bH.A0e.intValue();
        String str = null;
        if (intValue != 0) {
            if (intValue == 1) {
                IgTextView igTextView = c189988bH.A0I;
                if (igTextView != null) {
                    Resources resources = igTextView.getResources();
                    if (resources != null) {
                        int i = 2131965823;
                        if (C18U.A06(C06090Tz.A05, c189988bH.A0v, 36328048865459259L)) {
                            i = 2131965824;
                        }
                        str = resources.getString(i);
                    }
                    igTextView.setText(str);
                }
                C24026AlJ c24026AlJ = c189988bH.A0Y;
                if (c24026AlJ != null) {
                    View view = c24026AlJ.A05;
                    view.setEnabled(true);
                    view.setVisibility(0);
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
        IgTextView igTextView2 = c189988bH.A0I;
        if (igTextView2 != null) {
            Resources resources2 = igTextView2.getResources();
            if (resources2 != null) {
                str = resources2.getString(2131965822);
            }
            igTextView2.setText(str);
        }
        C24026AlJ c24026AlJ2 = c189988bH.A0Y;
        if (c24026AlJ2 == null) {
            return;
        }
        View view2 = c24026AlJ2.A05;
        view2.setEnabled(false);
        view2.setVisibility(8);
    }

    public static final void A0A(C189988bH c189988bH, String str, boolean z) {
        C16930sl c16930sl;
        String str2;
        String str3;
        UserSession userSession = c189988bH.A0v;
        C22C A01 = AnonymousClass229.A01(userSession);
        EnumC185288Jt enumC185288Jt = c189988bH.A0L;
        boolean z2 = c189988bH.A13;
        String str4 = null;
        if (c189988bH.A17 != null) {
            c16930sl = C16930sl.A00;
        } else {
            c16930sl = null;
        }
        A01.A1L(null, enumC185288Jt, str, c16930sl, z2);
        if (z) {
            C447024a c447024a = AnonymousClass229.A01(userSession).A02;
            MusicAssetModel musicAssetModel = c189988bH.A0P;
            if (musicAssetModel != null) {
                str2 = musicAssetModel.A0E;
                str3 = musicAssetModel.A0B;
                str4 = musicAssetModel.A0I;
            } else {
                str2 = null;
                str3 = null;
            }
            C24P c24p = c447024a.A00;
            String.valueOf(c24p.A00.A0J());
            String.valueOf(c24p.A00());
            C447024a.A01(c447024a, "user_clicked_done_on_music_browser", str2, str3, str4, null, null, null, null, null);
            AnonymousClass229.A01(userSession).A03.A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r15 >= r14.intValue()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r9 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r7 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0B(java.lang.Integer r14, int r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189988bH.A0B(java.lang.Integer, int, boolean):void");
    }

    private final boolean A0C() {
        MusicAssetModel musicAssetModel = this.A0P;
        if (musicAssetModel != null) {
            if (this.A0y.Cbt() && musicAssetModel.A0O && C36A.A06(this.A0v)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.music.common.model.TrackSnippet, java.lang.Object] */
    public final TrackSnippet A0D() {
        TrackSnippet trackSnippet = this.A0Q;
        if (trackSnippet != null) {
            int i = trackSnippet.A01;
            int i2 = trackSnippet.A00;
            ?? obj = new Object();
            if (i >= 0) {
                if (i2 > 0) {
                    obj.A01 = i;
                    obj.A00 = i2;
                    return obj;
                }
                throw new IllegalStateException("duration must be positive");
            }
            throw new IllegalStateException("start time must be 0 or positive");
        }
        throw new IllegalStateException("should not be null if controller is showing");
    }

    public final C8GD A0E() {
        AMp aMp = this.A0Z;
        if (aMp != null) {
            InterfaceC189958bE interfaceC189958bE = this.A0y;
            Al0 al0 = null;
            if (interfaceC189958bE.Cdk()) {
                C194808jg c194808jg = aMp.A06;
                if (c194808jg == null) {
                    return null;
                }
                Drawable A04 = c194808jg.A04();
                C14360o3.A07(A04);
                EnumC138556Pl BVp = AMp.A01(A04).BVp();
                if (BVp != null) {
                    MusicOverlayStickerModel BVf = interfaceC189958bE.BVf();
                    if (BVf != null) {
                        C194808jg c194808jg2 = aMp.A06;
                        if (c194808jg2 != null) {
                            Drawable A042 = c194808jg2.A04();
                            C14360o3.A07(A042);
                            int ApI = AMp.A01(A042).ApI();
                            C38059Gom c38059Gom = this.A0O;
                            if (aMp.A0B) {
                                C148276lx c148276lx = aMp.A07;
                                C194808jg c194808jg3 = aMp.A05;
                                int i = aMp.A00;
                                if (c148276lx != null && c194808jg3 != null) {
                                    Drawable A043 = c194808jg3.A04();
                                    C14360o3.A07(A043);
                                    al0 = new Al0(A043, c148276lx, i);
                                }
                            }
                            return AbstractC101614hW.A07(c38059Gom, BVf, al0, BVp, ApI);
                        }
                        throw new IllegalStateException(C25070B7r.A00.toString());
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException(C25071B7s.A00.toString());
            }
            EnumC138556Pl enumC138556Pl = EnumC138556Pl.A0F;
            MusicOverlayStickerModel BVf2 = interfaceC189958bE.BVf();
            if (BVf2 != null) {
                if (aMp.A0B) {
                    C148276lx c148276lx2 = aMp.A07;
                    C194808jg c194808jg4 = aMp.A05;
                    int i2 = aMp.A00;
                    if (c148276lx2 != null && c194808jg4 != null) {
                        Drawable A044 = c194808jg4.A04();
                        C14360o3.A07(A044);
                        al0 = new Al0(A044, c148276lx2, i2);
                    }
                }
                C24024AlG c24024AlG = new C24024AlG(BVf2, al0, enumC138556Pl, -1);
                c24024AlG.A04 = true;
                return c24024AlG;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0F() {
        ValueAnimator valueAnimator;
        if (this.A08 != null) {
            AnonymousClass879 anonymousClass879 = this.A0b;
            if (anonymousClass879 != null) {
                anonymousClass879.EFo(this);
            }
            AnonymousClass879 anonymousClass8792 = this.A0b;
            if (anonymousClass8792 != null) {
                anonymousClass8792.AHv();
            }
            C23104AGq c23104AGq = this.A0N;
            if (c23104AGq != null) {
                c23104AGq.A01 = null;
                c23104AGq.A00 = null;
            }
            A02();
            C150956qv.A08(new View[]{this.A08}, false);
            this.A0y.DUK();
            C29361Cwu c29361Cwu = this.A0W;
            if (c29361Cwu != null) {
                c29361Cwu.A0E.A0a();
            }
            AMp aMp = this.A0Z;
            if (aMp != null) {
                AMp.A03(aMp);
                aMp.A0G.setVisibility(8);
                aMp.A0F.setBackground(null);
                aMp.A0K.A00 = 0;
                aMp.A0A = false;
                aMp.A0C = false;
                aMp.A06 = null;
                aMp.A05 = null;
                ((View) aMp.A0R.getValue()).setBackground(null);
                ValueAnimator valueAnimator2 = aMp.A02;
                if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = aMp.A02) != null) {
                    valueAnimator.cancel();
                }
                aMp.A02 = null;
                aMp.A04 = null;
                aMp.A0D = false;
            }
            C24026AlJ c24026AlJ = this.A0Y;
            if (c24026AlJ != null) {
                W9A w9a = c24026AlJ.A02;
                if (w9a != null) {
                    w9a.A00 = null;
                    View view = w9a.A05;
                    view.setBackground(null);
                    view.setOnTouchListener(null);
                }
                c24026AlJ.A02 = null;
                c24026AlJ.A01 = null;
                c24026AlJ.A03 = false;
                c24026AlJ.A00 = -1;
            }
            C185278Js A00 = A00(this);
            if (A00 != null) {
                A00.A0I("cancel_back_button");
            }
            this.A0P = null;
            this.A0n = null;
            this.A0o = null;
            this.A0O = null;
            this.A0Q = null;
            this.A0l = false;
            this.A0k = false;
            this.A0p = false;
        }
    }

    public final void A0G() {
        AnonymousClass879 anonymousClass879 = this.A0b;
        if (anonymousClass879 != null && anonymousClass879.isPlaying()) {
            this.A0l = true;
            AnonymousClass879 anonymousClass8792 = this.A0b;
            if (anonymousClass8792 != null) {
                anonymousClass8792.pause();
            }
        }
    }

    public final void A0H() {
        if (this.A0l) {
            UserSession userSession = this.A0v;
            C24U c24u = AnonymousClass229.A01(userSession).A03;
            C24Q c24q = c24u.A0E;
            long A04 = c24q.A04(null, null, 17645025, c24u.A0D);
            c24u.A04 = A04;
            c24q.A0B(A04, "use_case", "music_editor_scrub_finished", false);
            this.A0l = false;
            TrackSnippet trackSnippet = this.A0Q;
            AnonymousClass879 anonymousClass879 = this.A0b;
            if (anonymousClass879 != null && anonymousClass879.CLN() && trackSnippet != null) {
                A04(trackSnippet, this);
            } else {
                C24U c24u2 = AnonymousClass229.A01(userSession).A03;
                c24u2.A04 = c24u2.A0E.A07("No music to play", "", 17645025, c24u2.A04);
            }
        }
    }

    public final void A0I() {
        AnonymousClass879 anonymousClass879 = this.A0b;
        if (anonymousClass879 != null && anonymousClass879.isPlaying()) {
            AnonymousClass879 anonymousClass8792 = this.A0b;
            if (anonymousClass8792 != null) {
                anonymousClass8792.pause();
            }
            A05(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(X.EnumC185288Jt r5, java.io.File r6, boolean r7) {
        /*
            r4 = this;
            X.8Jt r0 = r4.A0L
            if (r0 == r5) goto L6
            r4.A0L = r5
        L6:
            r3 = 1
            if (r7 == 0) goto Le
            r4.A0h = r3
            A06(r4)
        Le:
            X.8bE r1 = r4.A0y
            com.instagram.music.common.model.TrackSnippet r0 = r4.A0D()
            r1.Cxy(r5, r0, r7)
            com.instagram.music.common.model.MusicAssetModel r0 = r4.A0P
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L81
            com.instagram.music.common.model.MusicDataSource r1 = r0.A05
            if (r1 == 0) goto L46
            if (r6 == 0) goto L6d
            android.net.Uri r0 = android.net.Uri.fromFile(r6)
        L27:
            r1.A00 = r0
            X.879 r0 = r4.A0b
            if (r0 == 0) goto L30
            r0.EZL(r1, r3)
        L30:
            if (r6 != 0) goto L4e
            X.879 r1 = r4.A0b
            if (r1 == 0) goto L3f
            com.instagram.music.common.model.TrackSnippet r0 = r4.A0Q
            if (r0 == 0) goto L6f
            int r0 = r0.A01
        L3c:
            r1.EZP(r0)
        L3f:
            X.879 r0 = r4.A0b
            if (r0 == 0) goto L46
            r0.E4S()
        L46:
            X.879 r0 = r4.A0b
            if (r0 == 0) goto L4d
            r0.E4S()
        L4d:
            return
        L4e:
            if (r7 == 0) goto L67
            com.instagram.music.common.model.TrackSnippet r0 = r4.A0Q
            if (r5 == 0) goto L62
            if (r0 == 0) goto L75
            int r0 = r0.A01
            float r1 = (float) r0
            float r0 = r5.A01
            float r1 = r1 / r0
            int r0 = (int) r1
        L5d:
            X.879 r1 = r4.A0b
            if (r1 == 0) goto L3f
            goto L3c
        L62:
            if (r0 == 0) goto L7b
            int r0 = r0.A01
            goto L5d
        L67:
            X.879 r1 = r4.A0b
            if (r1 == 0) goto L3f
            r0 = 0
            goto L3c
        L6d:
            r0 = 0
            goto L27
        L6f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L7b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189988bH.A0J(X.8Jt, java.io.File, boolean):void");
    }

    public final boolean A0M() {
        C189478aR c189478aR;
        AAU aau = this.A0V;
        if (aau != null && aau.A02 && (c189478aR = aau.A01) != null) {
            c189478aR.A0L(null);
            return true;
        }
        ViewGroup viewGroup = this.A08;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return false;
        }
        A0G();
        return this.A0y.Cyv();
    }

    @Override // X.InterfaceC189808az
    public final void DUg() {
    }

    @Override // X.InterfaceC189808az
    public final void DUi() {
    }

    @Override // X.InterfaceC189808az
    public final void DUk() {
        C24U c24u = AnonymousClass229.A01(this.A0v).A03;
        long j = c24u.A04;
        if (j != 17645025) {
            c24u.A04 = c24u.A0E.A02(17645025, j);
        }
    }

    @Override // X.InterfaceC189808az
    public final void DUl() {
        TrackSnippet trackSnippet = this.A0Q;
        if (trackSnippet != null) {
            C190018bK c190018bK = this.A10;
            int i = trackSnippet.A01;
            Iterator it = c190018bK.A02.iterator();
            while (it.hasNext()) {
                ((BE3) it.next()).DUm(i);
            }
        }
    }

    @Override // X.InterfaceC189808az
    public final void DUm(int i) {
        Iterator it = this.A10.A02.iterator();
        while (it.hasNext()) {
            ((BE3) it.next()).DUm(i);
        }
        AMp aMp = this.A0Z;
        if (aMp != null) {
            aMp.A01 = i;
            AMp.A08(aMp);
        }
        C23107AGt c23107AGt = this.A0U;
        if (c23107AGt != null) {
            c23107AGt.A01(i, false);
        }
    }

    @Override // X.InterfaceC189998bI
    public final void Dj5(BE3 be3) {
        AAU aau = this.A0V;
        if (aau != null && !aau.A02) {
            A0H();
        }
        C23477Aaq c23477Aaq = this.A0a;
        if (c23477Aaq != null) {
            Handler handler = c23477Aaq.A01;
            Runnable runnable = c23477Aaq.A03;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 250L);
        }
        AMp aMp = this.A0Z;
        if (aMp != null) {
            AMp.A05(aMp);
        }
        C23107AGt c23107AGt = this.A0U;
        if (c23107AGt != null) {
            C23107AGt.A00(c23107AGt, true);
        }
        EnumC185288Jt enumC185288Jt = this.A0L;
        if (enumC185288Jt != null) {
            this.A0y.Cxy(enumC185288Jt, A0D(), true);
        }
    }

    @Override // X.InterfaceC189998bI
    public final void Dj7(BE3 be3, int i) {
        boolean z;
        TrackSnippet trackSnippet = this.A0Q;
        if (trackSnippet != null) {
            trackSnippet.A01 = i;
        }
        this.A0y.DxA(i);
        C23107AGt c23107AGt = this.A0U;
        if (c23107AGt != null) {
            C29361Cwu c29361Cwu = this.A0W;
            if (c29361Cwu != null) {
                z = c29361Cwu.A04();
            } else {
                z = false;
            }
            c23107AGt.A01(i, z);
        }
    }

    public static final void A08(C189988bH c189988bH) {
        C185278Js A00 = A00(c189988bH);
        if (A00 != null) {
            A00.A0I("cancel_done");
        }
        A0A(c189988bH, "AUDIO_EDITOR_PAGE_REPLACE_CONFIRM_TAP", true);
        c189988bH.A0y.DBK(c189988bH.A0L, c189988bH.A0D(), C05F.A01);
    }

    @Override // X.InterfaceC189808az
    public final void DUh(int i, int i2) {
        A0B(Integer.valueOf(i2), i, true);
    }

    @Override // X.InterfaceC189998bI
    public final void Dj6(BE3 be3) {
        Integer num;
        A0G();
        C23477Aaq c23477Aaq = this.A0a;
        if (c23477Aaq != null) {
            c23477Aaq.A01.removeCallbacks(c23477Aaq.A03);
            C55982hj c55982hj = c23477Aaq.A02;
            c55982hj.A08(c23477Aaq.A00, true);
            c55982hj.A06(1.0d);
        }
        C22C A01 = AnonymousClass229.A01(this.A0v);
        TrackSnippet trackSnippet = this.A0Q;
        if (trackSnippet != null) {
            num = Integer.valueOf(trackSnippet.A01);
        } else {
            num = null;
        }
        String valueOf = String.valueOf(num);
        if (valueOf == null) {
            valueOf = "";
        }
        EnumC203578zI enumC203578zI = this.A0H;
        EnumC46263Kdv enumC46263Kdv = this.A0G;
        C448124l c448124l = A01.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        EnumC114925Hg A0J = c448124l.A0J();
        if (((AbstractC02600Aj) A08).A00.isSampled() && A0J != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("AUDIO_LM_SCRUB");
            C448124l.A00(A08, c448124l);
            A08.A0a(A0J);
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0W(2);
            A08.A0M(EnumC50631MWs.A0I, "surface");
            A08.A0M(enumC203578zI, MSV.A00(1646));
            A08.A0m(C22F.A08.getModuleName());
            A08.A0c(c22m.A0A);
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0R("time_scrubber_timestamp", valueOf);
            A08.A0M(enumC46263Kdv, MSV.A00(389));
            A08.Cht();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016a  */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.instagram.music.common.model.TrackSnippet, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(com.instagram.music.common.model.MusicAssetModel r27, final X.C189988bH r28, X.EnumC138556Pl r29, java.lang.Integer r30, java.lang.Integer r31, boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189988bH.A03(com.instagram.music.common.model.MusicAssetModel, X.8bH, X.6Pl, java.lang.Integer, java.lang.Integer, boolean, boolean, boolean, boolean):void");
    }
}
