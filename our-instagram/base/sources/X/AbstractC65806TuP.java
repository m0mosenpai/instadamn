package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.AbsSeekBar;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.TuP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65806TuP extends C2WC implements InterfaceC50822Vd {
    public C102884kP A00;
    public final long A01;

    public static Integer A01(C6FG c6fg, C102884kP c102884kP, int i) {
        C102884kP A08 = c102884kP.A08(i);
        if (A08 != null) {
            return Integer.valueOf(C6BK.A00(c6fg, A08, 0));
        }
        return null;
    }

    @Override // X.C2WC
    public final InterfaceC50822Vd A0I() {
        return this;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2Wm D8D(int i) {
        return AbstractC79733hO.A00(this, i);
    }

    public AbstractC65806TuP(C6FG c6fg, C102884kP c102884kP) {
        super(C05F.A01);
        this.A01 = c102884kP.A04;
        this.A00 = c102884kP;
        C77843eC[] c77843eCArr = {AbstractC78283eu.A00(new C65805TuO(c6fg, this), this), AbstractC78283eu.A00(new C65826Tuj(c6fg, this), this)};
        int i = 0;
        do {
            A0D(c77843eCArr[i]);
            i++;
        } while (i < 2);
    }

    @Override // X.C2WC
    public final long A0H() {
        return this.A01;
    }

    public View A0J(Context context) {
        if (this instanceof V4U) {
            return AbstractC25226BEj.A0R(AbstractC31172DnG.A09(context), null, R.layout.survey_media_content_view, false);
        }
        if (!(this instanceof V4P) && !(this instanceof V4O) && !(this instanceof V4N) && !(this instanceof V4M) && !(this instanceof V4L) && !(this instanceof V4K) && !(this instanceof V4J) && !(this instanceof V4I) && !(this instanceof V4S) && !(this instanceof V4H) && ((this instanceof C66268U6m) || (!(this instanceof V4G) && !(this instanceof V4F) && !(this instanceof V4E) && !(this instanceof V4D) && !(this instanceof V4C) && !(this instanceof U6V) && !(this instanceof V4B) && !(this instanceof V4A) && !(this instanceof V4T) && !(this instanceof V49) && !(this instanceof V4V) && !(this instanceof V48) && (this instanceof V4R)))) {
            return new View(context);
        }
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0L(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        if (this instanceof V4U) {
            V4U v4u = (V4U) this;
            C14360o3.A0B(view, 0);
            C14360o3.A0B(c6fg, 1);
            C14360o3.A0B(c102884kP, 2);
            AbstractC10360h2 abstractC10360h2 = (AbstractC10360h2) c6fg.A00(R.id.bloks_ig_fragment_manager);
            Fragment A0Q = abstractC10360h2.A0Q(v4u.A04);
            if (A0Q != null) {
                C14240no c14240no = new C14240no(abstractC10360h2);
                c14240no.A03(A0Q);
                c14240no.A00();
                v4u.A01 = null;
                c102884kP.A0Q(31, 0);
                return;
            }
            return;
        }
        if (this instanceof V4K) {
            ((C131565ws) ((ViewGroup) view).getChildAt(0)).setRenderTree(null);
            return;
        }
        if (this instanceof U6V) {
            ((XEP) view).setThumbScale(1.0f);
            return;
        }
        if (this instanceof V4A) {
            AbsSeekBar absSeekBar = (AbsSeekBar) view;
            C69473Vnw c69473Vnw = (C69473Vnw) AnonymousClass634.A06(c6fg, c102884kP);
            if (c69473Vnw != null) {
                absSeekBar.setThumb(c69473Vnw.A08);
                c69473Vnw.A0C = null;
                c69473Vnw.A0D = null;
                c69473Vnw.A07 = 0;
                c69473Vnw.A03 = 0;
                c69473Vnw.A00 = 0;
                c69473Vnw.A02 = 0;
                c69473Vnw.A05 = 0;
                c69473Vnw.A04 = 0;
                c69473Vnw.A06 = 0;
                c69473Vnw.A08 = null;
                c69473Vnw.A09 = null;
                c69473Vnw.A0A = null;
                c69473Vnw.A0B = null;
                return;
            }
            throw new RuntimeException("SliderController is null even though a controller is defined");
        }
        if (this instanceof V49) {
            Ut9 ut9 = (Ut9) view;
            C14360o3.A0B(ut9, 0);
            ut9.A02.setRenderTree(null);
            return;
        }
        if (this instanceof V4R) {
            V4R v4r = (V4R) this;
            C68655VZo c68655VZo = (C68655VZo) AnonymousClass634.A06(c6fg, c102884kP);
            if (c68655VZo != null) {
                v4r.A00.removeCallbacksAndMessages(null);
                PopupWindow popupWindow = c68655VZo.A00;
                View contentView = popupWindow.getContentView();
                AbstractC05810Sj.A00(contentView);
                ((C131565ws) contentView).setRenderTree(null);
                popupWindow.dismiss();
                return;
            }
            throw new RuntimeException("Popup container defines a controller but none was found");
        }
        if (this instanceof V4Q) {
            W3M w3m = ((V4Q) this).A00;
            FrameLayout frameLayout = w3m.A0C;
            if (frameLayout.getWindowToken() != null) {
                Object systemService = w3m.A08.getSystemService("window");
                C14360o3.A0C(systemService, AbstractC58317Pt9.A00(2));
                ((ViewManager) systemService).removeView(frameLayout);
                w3m.A05 = false;
            }
            C131565ws c131565ws = w3m.A04;
            if (c131565ws != null) {
                c131565ws.setRenderTree(null);
            }
            ViewGroup viewGroup = w3m.A02;
            if (viewGroup != null) {
                viewGroup.removeView(w3m.A04);
            }
            w3m.A04 = null;
            w3m.A03 = VCP.A05;
            Activity activity = w3m.A07;
            WE9.A02(activity, w3m.A0F);
            WE9.A01(activity, w3m.A0E);
            return;
        }
        if (!(this instanceof V47)) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        C14360o3.A0B(viewGroup2, 0);
        C14360o3.A0B(c6fg, 1);
        C14360o3.A0B(c102884kP, 2);
        View childAt = viewGroup2.getChildAt(0);
        C14360o3.A0C(childAt, "null cannot be cast to non-null type com.bloks.components.bkavatareditorverticalsplitpane.ResizingBloksRenderTreeHostView");
        V45 v45 = (V45) childAt;
        View childAt2 = viewGroup2.getChildAt(1);
        C14360o3.A0C(childAt2, "null cannot be cast to non-null type com.bloks.components.bkavatareditorverticalsplitpane.ResizingBloksRenderTreeHostView");
        V45 v452 = (V45) childAt2;
        v45.setRenderResult(null, null);
        v452.setRenderResult(null, null);
        v45.A01 = 0;
        v45.A00 = 0;
        V45.A00(v45);
        v452.A01 = 0;
        v452.A00 = 0;
        V45.A00(v452);
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        if (A06 != null) {
            ((C68654VZn) A06).A00 = -1;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        NumberPicker numberPicker;
        int i;
        if (this instanceof V4S) {
            C69339Vll c69339Vll = ((V4S) this).A00;
            C70716Wfh c70716Wfh = c69339Vll.A00;
            if (c70716Wfh != null) {
                AbstractC25651Mw.A00(c69339Vll.A05).A02(c70716Wfh, C70073Cr.class);
            }
            c69339Vll.A00 = null;
            return;
        }
        if (this instanceof V4G) {
            ((C66352UBo) view).A05();
            return;
        }
        if (this instanceof V4U) {
            return;
        }
        if (!(this instanceof V4P) && !(this instanceof V4O)) {
            if ((this instanceof V4N) || (this instanceof V4M)) {
                return;
            }
            if (this instanceof V4L) {
                SeekBar seekBar = (SeekBar) view;
                C14360o3.A0B(seekBar, 0);
                AbstractC167017dG.A1P(c6fg, c102884kP);
                Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
                A06.getClass();
                seekBar.setOnSeekBarChangeListener(null);
                seekBar.setProgress(0);
                seekBar.setMin(0);
                seekBar.setMax(0);
                AbstractC68625VYb.A00.removeMessages(0, A06);
                return;
            }
            if (this instanceof V4K) {
                ((RefreshableNestedScrollingParent) view).A07 = null;
                return;
            }
            if (this instanceof V4J) {
                ((C66352UBo) view).A05();
                C68713Vap c68713Vap = (C68713Vap) AnonymousClass634.A06(c6fg, c102884kP);
                if (c68713Vap == null) {
                    return;
                }
                c68713Vap.A00 = null;
                return;
            }
            if (this instanceof V4I) {
                ImageView imageView = (ImageView) view;
                C14360o3.A0B(imageView, 0);
                imageView.setImageDrawable(null);
                imageView.setTag(null);
                return;
            }
            if ((this instanceof V4H) || (this instanceof C66268U6m) || (this instanceof V4F)) {
                return;
            }
            if (this instanceof V4E) {
                ((HashtagFollowButton) view).A00 = null;
                return;
            }
            if (this instanceof V4D) {
                numberPicker = (NumberPicker) view;
                i = 0;
                C14360o3.A0B(numberPicker, 0);
                numberPicker.setMinValue(0);
                numberPicker.setMaxValue(0);
            } else {
                if (this instanceof V4C) {
                    C66350UBc c66350UBc = (C66350UBc) view;
                    C14360o3.A0B(c66350UBc, 0);
                    c66350UBc.setMaskBounds(new PointF(), new C68916VeG());
                    return;
                }
                if (this instanceof U6V) {
                    ((XEP) view).setOnCheckedChangeListener(null);
                    return;
                }
                if (this instanceof V4B) {
                    C14360o3.A0B(view, 0);
                    view.setBackground(null);
                    return;
                }
                if (this instanceof V4A) {
                    SeekBar seekBar2 = (SeekBar) view;
                    C69473Vnw c69473Vnw = (C69473Vnw) AnonymousClass634.A06(c6fg, c102884kP);
                    if (c69473Vnw != null) {
                        W6z.A00.removeMessages(0, c69473Vnw);
                        seekBar2.setOnSeekBarChangeListener(null);
                        c69473Vnw.A01 = seekBar2.getProgress();
                        seekBar2.setProgress(0);
                        seekBar2.setEnabled(true);
                        GradientDrawable gradientDrawable = c69473Vnw.A09;
                        if (gradientDrawable != null && c69473Vnw.A0A != null && c69473Vnw.A0B != null) {
                            gradientDrawable.clearColorFilter();
                            c69473Vnw.A0A.clearColorFilter();
                            c69473Vnw.A0B.clearColorFilter();
                        }
                        W6z.A01(c69473Vnw, c69473Vnw.A05);
                        seekBar2.setMin(0);
                        seekBar2.setMax(0);
                        return;
                    }
                    throw new RuntimeException("SliderController is null even though a controller is defined");
                }
                if (this instanceof V4T) {
                    SearchEditText searchEditText = (SearchEditText) view;
                    C14360o3.A0B(searchEditText, 0);
                    ((V4T) this).A00 = false;
                    searchEditText.setText("");
                    searchEditText.setOnTouchListener(null);
                    searchEditText.A0C = null;
                    return;
                }
                if (this instanceof V49) {
                    Ut9 ut9 = (Ut9) view;
                    C14360o3.A0B(ut9, 0);
                    WXb wXb = ut9.A01;
                    wXb.A06();
                    wXb.A0G = null;
                    wXb.A0K = null;
                    wXb.A0E = null;
                    wXb.A0B = 0;
                    wXb.A0C = 0;
                    wXb.A0J.A0B(wXb);
                    wXb.A0H.A0B(wXb);
                    wXb.A0I.A0B(wXb);
                    wXb.A08(C05F.A00);
                    wXb.A07 = 4.0f;
                    return;
                }
                if (this instanceof V4V) {
                    numberPicker = (NumberPicker) view;
                    i = 0;
                    C14360o3.A0B(numberPicker, 0);
                } else {
                    if ((this instanceof V48) || (this instanceof V4R) || (this instanceof V4Q)) {
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C14360o3.A0B(viewGroup, 0);
                    if (obj2 == null) {
                        return;
                    }
                    View childAt = viewGroup.getChildAt(1);
                    C14360o3.A0C(childAt, "null cannot be cast to non-null type com.bloks.components.bkavatareditorverticalsplitpane.ResizingBloksRenderTreeHostView");
                    BottomSheetBehavior A01 = BottomSheetBehavior.A01(childAt);
                    C14360o3.A07(A01);
                    A01.A0l.remove(obj2);
                    return;
                }
            }
            numberPicker.setDisplayedValues(null);
            numberPicker.setValue(i);
            return;
        }
        C66346UAn c66346UAn = (C66346UAn) view;
        C14360o3.A0B(c66346UAn, 0);
        c66346UAn.setRenderType(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        c66346UAn.setOnClickListener(null);
    }

    public boolean A0N(C102884kP c102884kP, C102884kP c102884kP2, Object obj, Object obj2) {
        if (this instanceof V4M) {
            AbstractC167017dG.A1O(c102884kP, c102884kP2);
            if (C102884kP.A00(c102884kP, 36) == C102884kP.A00(c102884kP2, 36) && C102884kP.A00(c102884kP, 35) == C102884kP.A00(c102884kP2, 35)) {
                return false;
            }
            return true;
        }
        if (this instanceof V4K) {
            return AbstractC25229BEm.A1a(obj, obj2);
        }
        if (this instanceof V47) {
            return !C14360o3.A0K(obj, obj2);
        }
        return AbstractC25229BEm.A1Z(AbstractC103044kf.A00());
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ boolean AFr() {
        return false;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2V6 BeU() {
        return C77603dk.A00;
    }

    public /* synthetic */ int E4c() {
        return 3;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ Object BeR() {
        return getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0317, code lost:
    
        if (r23.A0S(58, false) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        if (r14.isEmpty() != false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:435:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v5, types: [X.0oO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A0K(android.view.View r21, final X.C6FG r22, final X.C102884kP r23, final java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 4238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC65806TuP.A0K(android.view.View, X.6FG, X.4kP, java.lang.Object):java.lang.Object");
    }
}
