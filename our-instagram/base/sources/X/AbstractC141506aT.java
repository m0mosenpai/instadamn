package X;

import android.view.View;
import com.facebook.R;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;

/* renamed from: X.6aT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141506aT {
    public static void A00(C41551w4 c41551w4, C144426fO c144426fO, InterfaceC144736ft interfaceC144736ft) {
        View requireViewById;
        View.OnClickListener viewOnClickListenerC41895IhX;
        C13080lu A00 = AbstractC13090lv.A00("ReelSuggestedHighlightFooterViewBinder.bindView");
        try {
            Reel reel = c41551w4.A0H;
            if (reel.A0t()) {
                c144426fO.A00.A02();
            } else if (reel.A0p() && !c41551w4.A0D) {
                C57012jc c57012jc = c144426fO.A00;
                c57012jc.A03(0);
                View A01 = c57012jc.A01();
                ReelType reelType = reel.A0P;
                if (reelType == ReelType.A0J) {
                    requireViewById = A01.requireViewById(R.id.reel_viewer_publish_suggested_highlights_button);
                    viewOnClickListenerC41895IhX = new ViewOnClickListenerC41892IhU(interfaceC144736ft);
                } else if (reelType == ReelType.A0D) {
                    requireViewById = A01.requireViewById(R.id.reel_viewer_birthday_highlight_next_button);
                    viewOnClickListenerC41895IhX = new ViewOnClickListenerC41893IhV(interfaceC144736ft);
                } else {
                    C0fQ.A00(new ViewOnClickListenerC41894IhW(interfaceC144736ft), A01.requireViewById(R.id.reel_viewer_edit_suggested_highlights_button));
                    requireViewById = A01.requireViewById(R.id.reel_viewer_publish_suggested_highlights_button);
                    viewOnClickListenerC41895IhX = new ViewOnClickListenerC41895IhX(interfaceC144736ft);
                }
                C0fQ.A00(viewOnClickListenerC41895IhX, requireViewById);
            } else {
                c144426fO.A00.A03(8);
            }
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }
}
