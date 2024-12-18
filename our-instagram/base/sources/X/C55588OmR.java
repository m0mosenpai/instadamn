package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.OmR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55588OmR implements C7LD {
    public final /* synthetic */ C54716OEt A00;

    @Override // X.C7LD
    public final boolean DMd(MotionEvent motionEvent, RecyclerView recyclerView) {
        View A0I;
        C14360o3.A0B(recyclerView, 0);
        C14360o3.A0B(motionEvent, 1);
        if (motionEvent.getPointerCount() != 1 || (A0I = MSZ.A0I(motionEvent, recyclerView)) == null || !(recyclerView.A0Y(A0I) instanceof C51273Mkw)) {
            return false;
        }
        C54716OEt c54716OEt = this.A00;
        C87H c87h = c54716OEt.A06;
        EnumC189218Zt enumC189218Zt = (EnumC189218Zt) c87h.A0A.A02();
        if (enumC189218Zt != null) {
            int ordinal = enumC189218Zt.ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    c54716OEt.A07.invoke();
                }
            } else {
                c87h.A01();
                return true;
            }
        }
        return true;
    }

    @Override // X.C7LD
    public final void Dfm(boolean z) {
    }

    @Override // X.C7LD
    public final void Du8(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public C55588OmR(C54716OEt c54716OEt) {
        this.A00 = c54716OEt;
    }
}
