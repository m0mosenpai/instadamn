package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;

/* renamed from: X.Fpk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC35710Fpk implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public ViewOnTouchListenerC35710Fpk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
            case 1:
                return ((GestureDetector) this.A01).onTouchEvent(motionEvent);
            case 2:
                if (view.getId() == R.id.additional_details_edittext) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    if ((motionEvent.getAction() & 255) == 2) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                return false;
            case 3:
            case 4:
            default:
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A01;
                C14360o3.A0A(view);
                C14360o3.A0A(motionEvent);
                interfaceC16620sF.invoke(view, motionEvent);
                return false;
            case 5:
                if (motionEvent.getAction() == 1) {
                    C31782Dy1 c31782Dy1 = (C31782Dy1) this.A01;
                    if (c31782Dy1.A01) {
                        GYV gyv = c31782Dy1.A00;
                        if (gyv == null) {
                            return true;
                        }
                        C14360o3.A0A(view);
                        gyv.D9k(view);
                        return true;
                    }
                    c31782Dy1.A01 = true;
                    if (c31782Dy1.A02) {
                        c31782Dy1.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.token_delete, 0);
                    }
                    GYV gyv2 = c31782Dy1.A00;
                    if (gyv2 != null) {
                        C14360o3.A0A(view);
                        C36473G6x c36473G6x = ((GI4) gyv2).A00;
                        if (c36473G6x.A0A) {
                            SearchWithDeleteEditText searchWithDeleteEditText = c36473G6x.A07;
                            searchWithDeleteEditText.requestFocus();
                            AbstractC13880nE.A0R(searchWithDeleteEditText);
                        }
                    }
                }
                return false;
        }
    }
}
