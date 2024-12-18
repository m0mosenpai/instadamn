package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* loaded from: classes4.dex */
public final class AKF {
    public static final AKF A00 = new Object();

    public final Dialog A01(Context context, Bitmap bitmap, UserSession userSession, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C5JK c5jk, PendingRecipient pendingRecipient, InterfaceC16820sZ interfaceC16820sZ) {
        Context context2;
        AbstractC167017dG.A1Q(userSession, clipsCreationDraftViewModel);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323483315088680L)) {
            context2 = AbstractC53172bz.A01(context);
        } else {
            context2 = context;
        }
        C193328hC c193328hC = new C193328hC(context2);
        c193328hC.A0A(2131955388);
        c193328hC.A0s(false);
        c193328hC.A09(2131955389);
        c193328hC.A0K(new AOD(interfaceC16820sZ, 9), 2131955385);
        c193328hC.A0P(new DialogInterfaceOnClickListenerC23161AOa(0, clipsCreationDraftViewModel, c5jk, userSession, pendingRecipient), EnumC193348hE.A04, 2131955387);
        if (C18U.A06(c06090Tz, userSession, 36324535582077155L)) {
            c193328hC.A0j(A00(context, bitmap));
        }
        return c193328hC.A02();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.8FY, X.8FX] */
    public static final C8FX A00(Context context, Bitmap bitmap) {
        int i;
        int width;
        if (bitmap != null) {
            int width2 = bitmap.getWidth();
            int height = bitmap.getHeight();
            float dimension = context.getResources().getDimension(R.dimen.appreciation_reels_grid_item_width);
            if (width2 > height) {
                width = (int) dimension;
                i = (bitmap.getHeight() * width) / bitmap.getWidth();
            } else {
                i = (int) dimension;
                width = (bitmap.getWidth() * i) / bitmap.getHeight();
            }
            ?? c8fy = new C8FY(context.getResources(), C0fK.A00(bitmap, width, i, true));
            c8fy.A02(context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material));
            return c8fy;
        }
        return null;
    }
}
