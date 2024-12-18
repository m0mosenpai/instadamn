package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio.StackedAdjustHorizontalScrollView;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.MTk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC50553MTk implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public ViewOnTouchListenerC50553MTk(View view, C138376Ot c138376Ot, boolean z) {
        this.A00 = 15;
        this.A01 = new GestureDetector(view.getContext(), new C51470MoH(c138376Ot, z));
    }

    public static void A00(View view, int i, Object obj) {
        view.setOnTouchListener(new ViewOnTouchListenerC50553MTk(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.PlO, java.lang.Object] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        String str;
        ViewPropertyAnimator animate;
        float f;
        String str2;
        List BQh;
        C38321qM A0x;
        switch (this.A00) {
            case 0:
                AbstractC43593JPy.A1Q(this.A01);
                return false;
            case 1:
                gestureDetector = ((ClipsStackedTimelineViewController) this.A01).A08.A00;
                return gestureDetector.onTouchEvent(motionEvent);
            case 2:
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = (ClipsStackedTimelineViewController) this.A01;
                if (clipsStackedTimelineViewController.A03 && !clipsStackedTimelineViewController.A08.A00.onTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            case 3:
                if (motionEvent.getAction() == 1) {
                    StackedAdjustHorizontalScrollView stackedAdjustHorizontalScrollView = (StackedAdjustHorizontalScrollView) this.A01;
                    if (stackedAdjustHorizontalScrollView.A03) {
                        stackedAdjustHorizontalScrollView.A00 = stackedAdjustHorizontalScrollView.getScrollX();
                        stackedAdjustHorizontalScrollView.postDelayed(stackedAdjustHorizontalScrollView.A02, stackedAdjustHorizontalScrollView.A06);
                    }
                    stackedAdjustHorizontalScrollView.A04 = false;
                }
                if (motionEvent.getAction() == 0) {
                    StackedAdjustHorizontalScrollView stackedAdjustHorizontalScrollView2 = (StackedAdjustHorizontalScrollView) this.A01;
                    stackedAdjustHorizontalScrollView2.A04 = true;
                    stackedAdjustHorizontalScrollView2.A03 = false;
                }
                return false;
            case 4:
                C6WI.A01().A0H = true;
                ((View) this.A01).setOnTouchListener(null);
                return false;
            case 5:
                N6J n6j = (N6J) this.A01;
                OFX ofx = n6j.A06;
                str2 = "viewHolder";
                if (ofx != null) {
                    ofx.A0A.clearFocus();
                    OFX ofx2 = n6j.A06;
                    if (ofx2 != null) {
                        AbstractC13880nE.A0O(ofx2.A0A);
                        return true;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 6:
                C14360o3.A0B(motionEvent, 1);
                if (motionEvent.getAction() == 0) {
                    MSX.A0K((N6J) this.A01).A1C(EnumC53380NjV.A0P, C81X.A3A);
                }
                return false;
            case 7:
                FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                CallerContext callerContext = FollowersShareFragment.A0z;
                AbstractC13880nE.A0O(followersShareFragment.mView);
                OUI.A00(followersShareFragment).clearFocus();
                return true;
            case 8:
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            C52165N6r c52165N6r = (C52165N6r) this.A01;
                            VideoPreviewView videoPreviewView = c52165N6r.A08;
                            if (videoPreviewView == null) {
                                str = "videoPreviewView";
                            } else {
                                float y = motionEvent.getY() - c52165N6r.A00;
                                float top = videoPreviewView.getTop() + videoPreviewView.getTranslationY() + y;
                                float bottom = videoPreviewView.getBottom() + videoPreviewView.getTranslationY() + y;
                                RectF rectF = c52165N6r.A02;
                                str = "punchHoleRectF";
                                if (rectF != null) {
                                    float f2 = rectF.top;
                                    if (top > f2 || bottom < rectF.bottom) {
                                        if (top > f2) {
                                            y -= top - f2;
                                        } else {
                                            float f3 = rectF.bottom;
                                            if (bottom < f3) {
                                                y += f3 - bottom;
                                            } else {
                                                return true;
                                            }
                                        }
                                    }
                                    videoPreviewView.setTranslationY(videoPreviewView.getTranslationY() + y);
                                    return true;
                                }
                            }
                            C14360o3.A0F(str);
                        } else {
                            return true;
                        }
                    } else {
                        C52165N6r c52165N6r2 = (C52165N6r) this.A01;
                        PunchedOverlayView punchedOverlayView = c52165N6r2.A07;
                        if (punchedOverlayView != null) {
                            punchedOverlayView.animate().alpha(1.0f).setDuration(300L);
                            IgTextView igTextView = c52165N6r2.A06;
                            if (igTextView != null) {
                                MSX.A0A(igTextView, 1.0f).setDuration(300L);
                                GridLinesView gridLinesView = c52165N6r2.A09;
                                if (gridLinesView != null) {
                                    AbstractC43594JPz.A0G(gridLinesView).setDuration(300L);
                                    return true;
                                }
                                C14360o3.A0F("gridLinesView");
                            }
                            C14360o3.A0F("explainerTextView");
                        }
                        C14360o3.A0F("punchedOverlayView");
                    }
                } else {
                    C52165N6r c52165N6r3 = (C52165N6r) this.A01;
                    c52165N6r3.A0A = true;
                    PunchedOverlayView punchedOverlayView2 = c52165N6r3.A07;
                    if (punchedOverlayView2 != null) {
                        punchedOverlayView2.animate().alpha(0.8f).setDuration(300L);
                        IgTextView igTextView2 = c52165N6r3.A06;
                        if (igTextView2 != null) {
                            AbstractC43594JPz.A0G(igTextView2).setDuration(300L);
                            GridLinesView gridLinesView2 = c52165N6r3.A09;
                            if (gridLinesView2 != null) {
                                AbstractC43594JPz.A0H(gridLinesView2).setDuration(300L);
                                c52165N6r3.A00 = motionEvent.getY();
                                return true;
                            }
                            C14360o3.A0F("gridLinesView");
                        }
                        C14360o3.A0F("explainerTextView");
                    }
                    C14360o3.A0F("punchedOverlayView");
                }
                throw C00O.createAndThrow();
            case 9:
                AbstractC52139N5o abstractC52139N5o = (AbstractC52139N5o) this.A01;
                TouchImageView touchImageView = abstractC52139N5o.A02;
                if (touchImageView == null) {
                    str = "touchImageView";
                } else {
                    touchImageView.getParent().requestDisallowInterceptTouchEvent(true);
                    str = "punchedOverlayView";
                    if (motionEvent.getAction() == 0) {
                        abstractC52139N5o.A03 = true;
                        PunchedOverlayView punchedOverlayView3 = abstractC52139N5o.A01;
                        if (punchedOverlayView3 != null) {
                            animate = punchedOverlayView3.animate();
                            f = 0.8f;
                            animate.alpha(f).setDuration(300L);
                            return false;
                        }
                    } else {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            PunchedOverlayView punchedOverlayView4 = abstractC52139N5o.A01;
                            if (punchedOverlayView4 != null) {
                                animate = punchedOverlayView4.animate();
                                f = 1.0f;
                                animate.alpha(f).setDuration(300L);
                            }
                        }
                        return false;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 10:
                if (motionEvent.getActionMasked() == 0) {
                    C51304MlR c51304MlR = (C51304MlR) this.A01;
                    int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    c51304MlR.A01.A07(c51304MlR);
                }
                return false;
            case 11:
                C14360o3.A0B(motionEvent, 1);
                if (motionEvent.getAction() == 0) {
                    MZM mzm = (MZM) this.A01;
                    C2045093j A00 = AbstractC2044993i.A00(mzm.A01);
                    Context context = mzm.A00;
                    String str3 = mzm.A02;
                    if (C18U.A06(C06090Tz.A05, A00.A00, 36328117585853633L)) {
                        A00.A09(context, str3, true, false);
                    }
                }
                return false;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C55087Oak c55087Oak = (C55087Oak) this.A01;
                C8HC c8hc = (C8HC) c55087Oak.A08.A0F.getValue();
                boolean z = c8hc.A02;
                if (!z) {
                    return z;
                }
                C8HC.A03(new C56503P7b(false), c8hc);
                AbstractC167007dF.A0L(c55087Oak.A0L).performClick();
                return z;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(motionEvent, 1);
                if (motionEvent.getActionMasked() == 0) {
                    AbstractC166987dD.A0d(((C148446mE) this.A01).A0H).getParent().requestDisallowInterceptTouchEvent(true);
                }
                return false;
            case 14:
                if (motionEvent.getAction() == 1) {
                    N25 n25 = (N25) this.A01;
                    Integer num = n25.A06;
                    if (num != null) {
                        int intValue = num.intValue();
                        C41181vS c41181vS = n25.A04;
                        if (c41181vS != null) {
                            C105794pq c105794pq = c41181vS.A0D;
                            C18C.A07(c105794pq, AbstractC111324zv.A00(43));
                            if (c105794pq != null && (BQh = c105794pq.A00.BQh()) != null && (A0x = AbstractC25225BEi.A0x(BQh, intValue)) != null) {
                                DialogInterface.OnDismissListener onDismissListener = n25.A00;
                                if (onDismissListener == null) {
                                    str2 = "listener";
                                } else {
                                    InterfaceC58312Pt4 interfaceC58312Pt4 = n25.A05;
                                    if (interfaceC58312Pt4 == null) {
                                        str2 = "hideListener";
                                    } else {
                                        C19270xB A0D = AbstractC31171DnF.A0D("ig_threads_in_stories_unit");
                                        UserSession userSession = n25.A03;
                                        if (userSession == null) {
                                            str2 = "userSession";
                                        } else {
                                            DialogInterface dialogInterface = n25.A01;
                                            if (dialogInterface == null) {
                                                str2 = "emptyDialogInterface";
                                            } else {
                                                String id = A0x.getId();
                                                if (id != null) {
                                                    C39456Hbi c39456Hbi = new C39456Hbi(1, onDismissListener, dialogInterface, interfaceC58312Pt4);
                                                    long A06 = AbstractC31177DnL.A06();
                                                    WEz A01 = AbstractC69993VzD.A01(n25.getActivity(), A0D, userSession, EnumC65855TvH.A0A, VG2.A0d, id);
                                                    C41181vS c41181vS2 = n25.A04;
                                                    if (c41181vS2 != null) {
                                                        A01.A01 = c41181vS2.A0i;
                                                        A01.A08(c39456Hbi);
                                                        A01.A09("reporting_timestamp", String.valueOf(A06));
                                                        WEz.A00(null, A01);
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
                        str2 = "reelItem";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    n25.A07();
                    return true;
                }
                return true;
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(motionEvent, 1);
            case 16:
                gestureDetector = (GestureDetector) this.A01;
                return gestureDetector.onTouchEvent(motionEvent);
            case 17:
                if (motionEvent.getAction() == 0) {
                    PCG pcg = (PCG) this.A01;
                    if (pcg.A01) {
                        pcg.A00().A00.A04.A06(new Object(), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    }
                }
                return false;
            case 18:
                ViewOnTouchListenerC51475MoM viewOnTouchListenerC51475MoM = (ViewOnTouchListenerC51475MoM) ((PCG) this.A01).A08.getValue();
                C14360o3.A0A(view);
                C14360o3.A0A(motionEvent);
                viewOnTouchListenerC51475MoM.onTouch(view, motionEvent);
                return false;
            case Process.SIGSTOP /* 19 */:
                if (motionEvent != null && (motionEvent.getAction() == 0 || motionEvent.getAction() == 2)) {
                    C51384Mmk.A00((C51384Mmk) this.A01);
                }
                return false;
            case 20:
                if (motionEvent.getY() < 0.0f) {
                    PJ4 pj4 = (PJ4) this.A01;
                    if (!pj4.A01) {
                        return true;
                    }
                    pj4.A00 = true;
                    pj4.A03.dismiss();
                    return true;
                }
                return false;
            default:
                if (motionEvent.getAction() == 0) {
                    O7C o7c = ((ODV) this.A01).A02;
                    AbstractC167007dF.A1C(view);
                    C71L c71l = o7c.A01.A00;
                    if (c71l != null) {
                        c71l.A03(view);
                    }
                }
                return false;
        }
    }

    public ViewOnTouchListenerC50553MTk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
