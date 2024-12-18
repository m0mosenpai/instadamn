package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import java.util.List;

/* renamed from: X.2mB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnTouchListenerC58522mB implements View.OnTouchListener {
    public final GestureDetector A00;

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        this.A00.onTouchEvent(motionEvent);
        return false;
    }

    public void A00() {
        C3x9 c3x9;
        CreativeConfigIntf Asm;
        List B0S;
        EffectPreviewIntf effectPreviewIntf;
        String effectId;
        boolean A03;
        if (this instanceof C58512mA) {
            C58512mA c58512mA = (C58512mA) this;
            C58572mG c58572mG = c58512mA.A01;
            if (c58572mG != null && c58512mA.A02.A01) {
                C1P3 A00 = C1P2.A00(c58572mG.A01);
                long j = c58572mG.A00;
                String A002 = AbstractC111324zv.A00(2334);
                synchronized (A00) {
                    if (!A00.A09(A002)) {
                        A03 = A00.A03(A002, j, true);
                    } else {
                        A03 = true;
                    }
                }
                if (!A03) {
                    c58572mG.A00(c58512mA.A00);
                    return;
                }
                return;
            }
            return;
        }
        if (this instanceof C59582o1) {
            C59582o1 c59582o1 = (C59582o1) this;
            C59572o0 c59572o0 = c59582o1.A03;
            UserSession userSession = c59572o0.A00;
            if (c59572o0.A01) {
                AbstractC2044993i.A00(userSession).A09(c59582o1.A01, C17060sy.A01.A01(userSession).getId(), true, false);
                return;
            }
            return;
        }
        C105174oX c105174oX = (C105174oX) this;
        int intValue = c105174oX.A02.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                C38321qM c38321qM = c105174oX.A01;
                if (c38321qM != null && (Asm = c38321qM.A0C.Asm()) != null && (B0S = Asm.B0S()) != null && (effectPreviewIntf = (EffectPreviewIntf) AbstractC001800i.A0O(B0S, 0)) != null && (effectId = effectPreviewIntf.getEffectId()) != null) {
                    UserSession userSession2 = c105174oX.A00;
                    BME.A00(userSession2).A00(userSession2, "on_touch_down", effectId, c105174oX.A03);
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
        MusicPageTabType musicPageTabType = MusicPageTabType.A04;
        C38321qM c38321qM2 = c105174oX.A01;
        if (c38321qM2 != null) {
            c3x9 = c38321qM2.A0C.getClipsMetadata();
        } else {
            c3x9 = null;
        }
        UserSession userSession3 = c105174oX.A00;
        String str = c105174oX.A03;
        C14360o3.A0B(userSession3, 2);
        C14360o3.A0B(str, 3);
        AbstractC37802GkH.A00(musicPageTabType, userSession3).A01(c3x9, userSession3, "on_touch_down", str);
    }

    public AbstractViewOnTouchListenerC58522mB(Context context) {
        final C58532mC c58532mC = new C58532mC(this);
        this.A00 = new GestureDetector(context, new GestureDetectorOnGestureListenerC58552mE(new GestureDetector.SimpleOnGestureListener(c58532mC) { // from class: X.2mD
            public final InterfaceC16820sZ A00;
            public final boolean A01 = true;

            {
                this.A00 = c58532mC;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                if (this.A01) {
                    this.A00.invoke();
                    return false;
                }
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (!this.A01) {
                    this.A00.invoke();
                    return false;
                }
                return false;
            }
        }));
    }
}
