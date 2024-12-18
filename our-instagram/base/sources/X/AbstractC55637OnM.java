package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;

/* renamed from: X.OnM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55637OnM implements InterfaceGestureDetectorOnGestureListenerC149756oS {
    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        String str;
        if (this instanceof NI4) {
            NI4 ni4 = (NI4) this;
            C14360o3.A0B(motionEvent, 0);
            ClipsStackedTimelineFragment clipsStackedTimelineFragment = ni4.A01;
            clipsStackedTimelineFragment.A0p = false;
            ni4.A00 = false;
            C50868Mdz c50868Mdz = clipsStackedTimelineFragment.A0h;
            if (c50868Mdz == null) {
                str = "stackedTimelineViewModel";
            } else {
                EnumC53170NfR enumC53170NfR = EnumC53170NfR.A03;
                C14360o3.A0B(enumC53170NfR, 0);
                c50868Mdz.A0K.A01();
                C57171PZp.A03(enumC53170NfR, c50868Mdz, AbstractC141776au.A00(c50868Mdz), 14);
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
                if (clipsStackedTimelineViewController == null) {
                    str = "viewController";
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (!clipsStackedTimelineViewController.A0J) {
                        Rect A0U = AbstractC166987dD.A0U();
                        clipsStackedTimelineViewController.A0O().getHitRect(A0U);
                        return A0U.contains((int) x, (int) y);
                    }
                    return false;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (this instanceof NI2) {
            NI2 ni2 = (NI2) this;
            C50868Mdz c50868Mdz2 = ni2.A01;
            EnumC53170NfR A0B = ni2.A00.A0B();
            C14360o3.A0B(A0B, 0);
            c50868Mdz2.A0K.A01();
            C57171PZp.A03(A0B, c50868Mdz2, AbstractC141776au.A00(c50868Mdz2), 14);
            return false;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this instanceof NI4) {
            NI4 ni4 = (NI4) this;
            ClipsStackedTimelineFragment clipsStackedTimelineFragment = ni4.A01;
            if (!clipsStackedTimelineFragment.A0p) {
                ni4.A00 = false;
                C50868Mdz c50868Mdz = clipsStackedTimelineFragment.A0h;
                if (c50868Mdz == null) {
                    C14360o3.A0F("stackedTimelineViewModel");
                    throw C00O.createAndThrow();
                }
                c50868Mdz.A0K.A01();
                C141796aw A00 = AbstractC141776au.A00(c50868Mdz);
                AbstractC166987dD.A1Z(new PZ4(EnumC53170NfR.A03, c50868Mdz, null, -((int) f), -1, 1), A00);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this instanceof NI4) {
            NI4 ni4 = (NI4) this;
            ClipsStackedTimelineFragment clipsStackedTimelineFragment = ni4.A01;
            if (!clipsStackedTimelineFragment.A0p) {
                if (Math.abs(f) >= Math.abs(f2) || ni4.A00) {
                    ni4.A00 = true;
                    C50868Mdz c50868Mdz = clipsStackedTimelineFragment.A0h;
                    if (c50868Mdz == null) {
                        C14360o3.A0F("stackedTimelineViewModel");
                        throw C00O.createAndThrow();
                    }
                    c50868Mdz.A0R(EnumC53170NfR.A03, (int) f, -1);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
