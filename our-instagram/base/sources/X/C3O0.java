package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;
import com.instagram.igds.components.snackbar.IgdsDualButtonSnackBar;
import com.instagram.igds.components.snackbar.IgdsSnackBar;
import com.instagram.igds.components.snackbar.IgdsUploadSnackBar;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3O0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3O0 implements InterfaceC55932he, InterfaceC60152ox {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public IKG A05;
    public C54971OTd A06;
    public IgdsDualButtonSnackBar A07;
    public IgdsSnackBar A08;
    public C31349DqE A09;
    public IgdsUploadSnackBar A0A;
    public Integer A0B;
    public boolean A0C;
    public boolean A0D;
    public Integer A0E;
    public Integer A0F;
    public final View A0G;
    public final Runnable A0H;
    public final WeakReference A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC12850lX A0O;
    public final InterfaceC56392iX A0P;
    public final boolean A0Q;

    public C3O0(ViewStub viewStub, boolean z) {
        Activity activity;
        C14360o3.A0B(viewStub, 1);
        this.A0Q = z;
        AbstractC18730w0 abstractC18730w0 = new AbstractC18730w0() { // from class: X.3O1
            @Override // X.AbstractC18730w0, X.InterfaceC12850lX
            public final void Cuy(Activity activity2) {
                C14360o3.A0B(activity2, 0);
                C3O0 c3o0 = C3O0.this;
                if (c3o0.A0I.get() == activity2) {
                    c3o0.A0C = true;
                    if (c3o0.A0B != C05F.A00) {
                        C3O0.A03(c3o0, false);
                    }
                    AbstractC12860lY.A08(this);
                }
            }

            @Override // X.AbstractC18730w0, X.InterfaceC12850lX
            public final void Cv0(Activity activity2) {
                C14360o3.A0B(activity2, 0);
                C3O0 c3o0 = C3O0.this;
                if (c3o0.A0I.get() == activity2) {
                    c3o0.A0C = true;
                    if (c3o0.A0B != C05F.A00) {
                        C3O0.A03(c3o0, false);
                    }
                }
            }

            @Override // X.AbstractC18730w0, X.InterfaceC12850lX
            public final void Cv5(Activity activity2) {
                C14360o3.A0B(activity2, 0);
                C3O0 c3o0 = C3O0.this;
                if (c3o0.A0I.get() == activity2) {
                    c3o0.A0C = false;
                    C3O0.A01(c3o0);
                }
            }
        };
        this.A0O = abstractC18730w0;
        this.A0H = new Runnable() { // from class: X.3O2
            @Override // java.lang.Runnable
            public final void run() {
                C3O0.A03(C3O0.this, true);
            }
        };
        viewStub.setLayoutResource(R.layout.igds_snackbar_layout);
        View view = null;
        this.A0P = AbstractC56372iV.A01(viewStub, false, false);
        AbstractC12860lY.A07(abstractC18730w0);
        Context context = viewStub.getContext();
        this.A0I = new WeakReference(context);
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            view = activity.findViewById(R.id.tab_bar);
        }
        this.A0G = view;
        this.A0B = C05F.A00;
        this.A0K = Collections.synchronizedList(new LinkedList());
        this.A0L = Collections.synchronizedList(new LinkedList());
        this.A0J = Collections.synchronizedList(new LinkedList());
        this.A0M = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EM(this, 29));
        this.A0N = AbstractC09440dt.A01(new C9EM(this, 31));
    }

    public final void A07(IKG ikg) {
        C14360o3.A0B(ikg, 0);
        List list = this.A0J;
        C14360o3.A06(list);
        list.add(0, ikg);
        if (this.A0B == C05F.A00) {
            A01(this);
        }
    }

    public final void A08(C54971OTd c54971OTd) {
        List list = this.A0L;
        C14360o3.A06(list);
        list.add(0, c54971OTd);
        if (this.A0B == C05F.A00) {
            A01(this);
        }
    }

    public final void A0A(C31349DqE c31349DqE) {
        C14360o3.A0B(c31349DqE, 0);
        List list = this.A0K;
        C14360o3.A06(list);
        list.add(0, c31349DqE);
        int intValue = this.A0B.intValue();
        if (intValue != 0) {
            if (intValue != 2 && intValue != 3) {
                if (intValue != 1) {
                    throw new RuntimeException();
                }
                return;
            } else {
                A03(this, true);
                return;
            }
        }
        A01(this);
    }

    public final synchronized void A0B(InterfaceC58191Pqx interfaceC58191Pqx) {
        View view = this.A04;
        if (view != null) {
            view.post(new RunnableC56991PQh(this, interfaceC58191Pqx));
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj.A01 == 1.0d) {
            View view = this.A04;
            if (view != null) {
                view.setVisibility(4);
            }
            int intValue = this.A0B.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 1) {
                            IgdsSnackBar igdsSnackBar = this.A08;
                            if (igdsSnackBar != null) {
                                igdsSnackBar.setVisibility(0);
                            }
                            IgdsSnackBar igdsSnackBar2 = this.A08;
                            if (igdsSnackBar2 != null) {
                                igdsSnackBar2.setTranslationY(this.A02);
                            }
                            IgdsUploadSnackBar igdsUploadSnackBar = this.A0A;
                            if (igdsUploadSnackBar != null) {
                                igdsUploadSnackBar.setVisibility(8);
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        IgdsSnackBar igdsSnackBar3 = this.A08;
                        if (igdsSnackBar3 != null) {
                            igdsSnackBar3.setVisibility(8);
                        }
                        IgdsUploadSnackBar igdsUploadSnackBar2 = this.A0A;
                        if (igdsUploadSnackBar2 != null) {
                            igdsUploadSnackBar2.setVisibility(8);
                        }
                        IgdsDualButtonSnackBar igdsDualButtonSnackBar = this.A07;
                        if (igdsDualButtonSnackBar != null) {
                            igdsDualButtonSnackBar.setVisibility(0);
                        }
                        IgdsDualButtonSnackBar igdsDualButtonSnackBar2 = this.A07;
                        if (igdsDualButtonSnackBar2 != null) {
                            igdsDualButtonSnackBar2.setTranslationY(this.A01);
                        }
                    }
                } else {
                    IgdsSnackBar igdsSnackBar4 = this.A08;
                    if (igdsSnackBar4 != null) {
                        igdsSnackBar4.setVisibility(8);
                    }
                    IgdsUploadSnackBar igdsUploadSnackBar3 = this.A0A;
                    if (igdsUploadSnackBar3 != null) {
                        igdsUploadSnackBar3.setVisibility(0);
                    }
                    IgdsUploadSnackBar igdsUploadSnackBar4 = this.A0A;
                    if (igdsUploadSnackBar4 != null) {
                        igdsUploadSnackBar4.setTranslationY(this.A03);
                    }
                }
                IgdsDualButtonSnackBar igdsDualButtonSnackBar3 = this.A07;
                if (igdsDualButtonSnackBar3 != null) {
                    igdsDualButtonSnackBar3.setVisibility(8);
                }
            }
            View view2 = this.A04;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.A04;
            if (view3 != null) {
                view3.bringToFront();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC55932he
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dnk(X.C55982hj r16) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3O0.Dnk(X.2hj):void");
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f;
        View view;
        C14360o3.A0B(c55982hj, 0);
        float f2 = (float) c55982hj.A09.A00;
        int intValue = this.A0B.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue == 1) {
                        f = (1.0f - f2) * this.A02;
                        view = this.A08;
                        if (view != null) {
                            C31349DqE c31349DqE = this.A09;
                            if (c31349DqE != null && c31349DqE.A0F.intValue() == 0 && A04()) {
                                f = -f;
                            }
                            view.setTranslationY(f);
                        }
                        return;
                    }
                    throw new RuntimeException();
                }
                f = (1.0f - f2) * this.A01;
                view = this.A07;
            } else {
                f = (1.0f - f2) * this.A03;
                view = this.A0A;
            }
            if (view == null) {
                return;
            }
            view.setTranslationY(f);
        }
    }

    private final void A00() {
        InterfaceC56392iX interfaceC56392iX = this.A0P;
        if (!interfaceC56392iX.CWW()) {
            View view = interfaceC56392iX.getView();
            this.A04 = view;
            view.setLayoutDirection(AbstractC13620mo.A02(view.getContext()) ? 1 : 0);
            this.A08 = (IgdsSnackBar) view.requireViewById(R.id.igds_snackbar);
            this.A0A = (IgdsUploadSnackBar) view.findViewById(R.id.igds_upload_snackbar);
            this.A07 = (IgdsDualButtonSnackBar) view.findViewById(R.id.igds_dual_button_snackbar);
            C3OD c3od = C3OD.A00;
            final C9EM c9em = new C9EM(this, 30);
            final WeakReference weakReference = new WeakReference(view);
            C57112jm A01 = AbstractC58982mw.A01(AbstractC58952mt.A00(view));
            if (A01 != null) {
                String valueOf = String.valueOf(c3od.hashCode());
                C59062n7 c59062n7 = C59062n7.A07;
                C59072n8 c59072n8 = new C59072n8(null, null, valueOf);
                c59072n8.A00(new InterfaceC43071ya() { // from class: X.3OE
                    @Override // X.InterfaceC43071ya
                    public final void ATP(C59062n7 c59062n72, InterfaceC57162jr interfaceC57162jr) {
                        String str;
                        Object obj = weakReference.get();
                        if (obj != null) {
                            Integer CFq = interfaceC57162jr.CFq(c59062n72);
                            C14360o3.A07(CFq);
                            if (CFq == C05F.A00 && (str = (String) c9em.invoke()) != null) {
                                C1KM.A09.A0L(String.valueOf(obj.hashCode()), str, ((C1KP) C1KM.A00()).A01);
                            }
                        }
                    }
                });
                A01.A05(view, c59072n8.A01());
            }
            Integer num = this.A0F;
            if (num != null) {
                A05(num.intValue());
            }
            Integer num2 = this.A0E;
            if (num2 != null) {
                A06(num2.intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0365  */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1vw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C3O0 r22) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3O0.A01(X.3O0):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0020. Please report as an issue. */
    public static final void A02(C3O0 c3o0) {
        int i;
        String str;
        int i2;
        String str2;
        long A01;
        Long l;
        String str3;
        Integer num;
        IgdsUploadSnackBar igdsUploadSnackBar;
        View.OnClickListener viewOnClickListenerC55362OiT;
        View view;
        C54971OTd c54971OTd = c3o0.A06;
        if (c54971OTd != null) {
            C47981LJa C0N = c54971OTd.A02.C0N();
            if (c3o0.A0A != null) {
                InterfaceC58191Pqx interfaceC58191Pqx = c54971OTd.A02;
                int i3 = 0;
                View.OnClickListener onClickListener = null;
                String str4 = "";
                switch (interfaceC58191Pqx.C0L().intValue()) {
                    case 0:
                        IgdsUploadSnackBar igdsUploadSnackBar2 = c3o0.A0A;
                        if (igdsUploadSnackBar2 != null) {
                            igdsUploadSnackBar2.setProgressBarVisibility(0);
                            igdsUploadSnackBar2.A00(interfaceC58191Pqx.BiJ());
                            igdsUploadSnackBar2.setExplanationText("");
                            if (C0N != null) {
                                String str5 = C0N.A08;
                                if (str5 != null) {
                                    str4 = str5;
                                }
                                onClickListener = C0N.A03;
                            }
                            igdsUploadSnackBar2.setButtonTextAndOnClickListener(str4, onClickListener);
                        }
                        if (C0N != null && (str = C0N.A09) != null) {
                            IgdsUploadSnackBar igdsUploadSnackBar3 = c3o0.A0A;
                            if (igdsUploadSnackBar3 == null) {
                                return;
                            }
                            igdsUploadSnackBar3.setStatusText(str);
                            return;
                        }
                        IgdsUploadSnackBar igdsUploadSnackBar4 = c3o0.A0A;
                        if (igdsUploadSnackBar4 == null) {
                            return;
                        }
                        if (C0N != null) {
                            i = C0N.A01;
                        } else {
                            i = 2131969851;
                        }
                        igdsUploadSnackBar4.setStatusText(i);
                        return;
                    case 1:
                        IgdsUploadSnackBar igdsUploadSnackBar5 = c3o0.A0A;
                        if (igdsUploadSnackBar5 != null) {
                            if (C0N != null && (num = C0N.A04) != null) {
                                i3 = num.intValue();
                            }
                            igdsUploadSnackBar5.setProgressBarVisibility(i3);
                            igdsUploadSnackBar5.A00(interfaceC58191Pqx.BiJ());
                            igdsUploadSnackBar5.setExplanationText("");
                            if (C0N != null && (str3 = C0N.A06) != null) {
                                str4 = str3;
                            }
                            igdsUploadSnackBar5.setButtonTextAndOnClickListener(str4, new ViewOnClickListenerC48046LOs(c3o0, C0N));
                            View view2 = c3o0.A04;
                            if (view2 != null) {
                                Runnable runnable = c3o0.A0H;
                                if (C0N != null && (l = C0N.A05) != null) {
                                    A01 = l.longValue();
                                } else {
                                    A01 = AbstractC31372Dqc.A01();
                                }
                                view2.postDelayed(runnable, A01);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        if (C0N != null && (str2 = C0N.A07) != null) {
                            IgdsUploadSnackBar igdsUploadSnackBar6 = c3o0.A0A;
                            if (igdsUploadSnackBar6 != null) {
                                igdsUploadSnackBar6.setStatusText(str2);
                            }
                        } else {
                            IgdsUploadSnackBar igdsUploadSnackBar7 = c3o0.A0A;
                            if (igdsUploadSnackBar7 != null) {
                                if (C0N != null) {
                                    i2 = C0N.A00;
                                } else {
                                    i2 = 2131969848;
                                }
                                igdsUploadSnackBar7.setStatusText(i2);
                            }
                        }
                        C49490Lu3 c49490Lu3 = c54971OTd.A01;
                        if (c49490Lu3 == null) {
                            return;
                        }
                        ((CreatorAIAgentCreationRepository) c49490Lu3.A01).A03.A03(C8p.A0W);
                        return;
                    case 2:
                        IgdsUploadSnackBar igdsUploadSnackBar8 = c3o0.A0A;
                        if (igdsUploadSnackBar8 == null) {
                            return;
                        }
                        igdsUploadSnackBar8.setProgressBarVisibility(0);
                        igdsUploadSnackBar8.A00(100);
                        igdsUploadSnackBar8.setExplanationText("");
                        igdsUploadSnackBar8.setButtonTextAndOnClickListener("", null);
                        return;
                    case 3:
                        igdsUploadSnackBar = c3o0.A0A;
                        if (igdsUploadSnackBar == null) {
                            return;
                        }
                        igdsUploadSnackBar.setStatusText(2131968692);
                        igdsUploadSnackBar.setProgressBarVisibility(8);
                        igdsUploadSnackBar.setExplanationText(2131977113);
                        viewOnClickListenerC55362OiT = new ViewOnClickListenerC55362OiT(c3o0);
                        TextView textView = igdsUploadSnackBar.A01;
                        textView.setText(2131972569);
                        textView.setOnClickListener(viewOnClickListenerC55362OiT);
                        textView.setVisibility(0);
                        return;
                    case 4:
                        igdsUploadSnackBar = c3o0.A0A;
                        if (igdsUploadSnackBar == null) {
                            return;
                        }
                        igdsUploadSnackBar.setStatusText(2131968692);
                        igdsUploadSnackBar.setProgressBarVisibility(8);
                        igdsUploadSnackBar.setExplanationText(2131977113);
                        viewOnClickListenerC55362OiT = new ViewOnClickListenerC55363OiU(c3o0);
                        TextView textView2 = igdsUploadSnackBar.A01;
                        textView2.setText(2131972569);
                        textView2.setOnClickListener(viewOnClickListenerC55362OiT);
                        textView2.setVisibility(0);
                        return;
                    case 5:
                        IgdsUploadSnackBar igdsUploadSnackBar9 = c3o0.A0A;
                        if (igdsUploadSnackBar9 == null) {
                            return;
                        }
                        igdsUploadSnackBar9.setStatusText(2131952627);
                        igdsUploadSnackBar9.setProgressBarVisibility(8);
                        Context context = igdsUploadSnackBar9.getContext();
                        Drawable drawable = context.getDrawable(R.drawable.instagram_error_pano_outline_24);
                        if (drawable != null) {
                            drawable.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A05(context))));
                            igdsUploadSnackBar9.setMediaThumbnailDrawable(drawable);
                        }
                        igdsUploadSnackBar9.setExplanationText("");
                        igdsUploadSnackBar9.setButtonTextAndOnClickListener("", null);
                        view = c3o0.A04;
                        if (view == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        view.postDelayed(c3o0.A0H, AbstractC31372Dqc.A00());
                        return;
                    case 6:
                        IgdsUploadSnackBar igdsUploadSnackBar10 = c3o0.A0A;
                        if (igdsUploadSnackBar10 == null) {
                            return;
                        }
                        igdsUploadSnackBar10.setStatusText(2131952628);
                        igdsUploadSnackBar10.setProgressBarVisibility(8);
                        Context context2 = igdsUploadSnackBar10.getContext();
                        Drawable drawable2 = context2.getDrawable(R.drawable.instagram_error_pano_outline_24);
                        if (drawable2 != null) {
                            drawable2.setColorFilter(C3DY.A00(context2.getColor(AbstractC53242c7.A05(context2))));
                            igdsUploadSnackBar10.setMediaThumbnailDrawable(drawable2);
                        }
                        igdsUploadSnackBar10.setExplanationText("");
                        igdsUploadSnackBar10.setButtonTextAndOnClickListener("", null);
                        view = c3o0.A04;
                        if (view == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        view.postDelayed(c3o0.A0H, AbstractC31372Dqc.A00());
                        return;
                    default:
                        return;
                }
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(C3O0 c3o0, boolean z) {
        View view = c3o0.A04;
        if (view != null) {
            view.removeCallbacks(c3o0.A0H);
            InterfaceC09390do interfaceC09390do = c3o0.A0M;
            if (interfaceC09390do.CWa()) {
                C3I9 c3i9 = (C3I9) interfaceC09390do.getValue();
                c3i9.EFx(c3o0);
                c3i9.onStop();
            }
            if (z) {
                IgdsSnackBar igdsSnackBar = c3o0.A08;
                if (igdsSnackBar != null) {
                    igdsSnackBar.setSwipeListener(null);
                }
                ((C55982hj) c3o0.A0N.getValue()).A06(-1.0d);
                return;
            }
            InterfaceC09390do interfaceC09390do2 = c3o0.A0N;
            C55982hj c55982hj = (C55982hj) interfaceC09390do2.getValue();
            c55982hj.A08(-1.0d, true);
            c55982hj.A01();
            if (!c3o0.A0C) {
                return;
            }
            c3o0.Dnk((C55982hj) interfaceC09390do2.getValue());
        }
    }

    private final boolean A04() {
        EnumC141996bI enumC141996bI;
        C31349DqE c31349DqE = this.A09;
        EnumC141996bI enumC141996bI2 = null;
        if (c31349DqE != null) {
            enumC141996bI = c31349DqE.A0C;
        } else {
            enumC141996bI = null;
        }
        if (enumC141996bI != EnumC141996bI.A02) {
            if (c31349DqE != null) {
                enumC141996bI2 = c31349DqE.A0C;
            }
            if (enumC141996bI2 != EnumC141996bI.A03) {
                return false;
            }
        }
        return true;
    }

    public final void A05(int i) {
        if (this.A0Q) {
            if (this.A04 == null) {
                this.A0F = Integer.valueOf(i);
                return;
            }
        } else {
            A00();
        }
        View view = this.A04;
        if (view != null) {
            AbstractC13880nE.A0U(view, i);
            return;
        }
        throw new IllegalStateException("Expected snackbar container to have been initialized");
    }

    public final void A06(int i) {
        if (this.A0Q) {
            if (this.A08 == null) {
                this.A0E = Integer.valueOf(i);
                return;
            }
        } else {
            A00();
        }
        IgdsSnackBar igdsSnackBar = this.A08;
        if (igdsSnackBar != null) {
            AbstractC13880nE.A0X(igdsSnackBar, i);
            return;
        }
        throw new IllegalStateException("Expected snackbar container to have been initialized");
    }

    public final void A09(C31349DqE c31349DqE) {
        if (C14360o3.A0K(this.A09, c31349DqE)) {
            A03(this, true);
            int i = c31349DqE.A00;
            if (i == 0) {
                i = AbstractC31372Dqc.A01();
            }
            if (i != -1) {
                return;
            }
        }
        this.A0K.remove(c31349DqE);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        View view;
        if (!A04() && (view = this.A04) != null) {
            AbstractC13880nE.A0Y(view, i);
        }
    }
}
