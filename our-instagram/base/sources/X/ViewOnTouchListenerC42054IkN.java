package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.IkN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42054IkN implements View.OnTouchListener {
    public final C41154IJt A00;
    public final /* synthetic */ C81473kH A01;
    public final /* synthetic */ A8L A02;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        if (C18U.A06(C06090Tz.A06, this.A02.A02, 36321026594382920L)) {
            MediaFrameLayout mediaFrameLayout = this.A01.A09;
            if (mediaFrameLayout.getTouchDelegate() != null && mediaFrameLayout.getTouchDelegate().onTouchEvent(motionEvent)) {
                return true;
            }
        }
        C41154IJt c41154IJt = this.A00;
        c41154IJt.A06.A01(motionEvent);
        c41154IJt.A01.onTouchEvent(motionEvent);
        return true;
    }

    public ViewOnTouchListenerC42054IkN(C206289Bl c206289Bl, InterfaceC904641g interfaceC904641g, C81473kH c81473kH, A8L a8l) {
        this.A01 = c81473kH;
        this.A02 = a8l;
        this.A00 = (C41154IJt) ((InterfaceC16620sF) ((C26082BgB) c206289Bl.A01).A00).invoke(c81473kH, interfaceC904641g);
    }
}
