package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.ImageUrlBase;
import java.util.List;

/* renamed from: X.PQp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56999PQp implements Runnable {
    public final /* synthetic */ P4A A00;
    public final /* synthetic */ C51728Mt5 A01;

    public RunnableC56999PQp(P4A p4a, C51728Mt5 c51728Mt5) {
        this.A00 = p4a;
        this.A01 = c51728Mt5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        ImageUrl imageUrl;
        int i;
        P4A p4a = this.A00;
        C54974OTg c54974OTg = p4a.A00;
        if (c54974OTg == null) {
            C14360o3.A0F("viewBinder");
            throw C00O.createAndThrow();
        }
        C51728Mt5 c51728Mt5 = this.A01;
        EnumC61217RhH enumC61217RhH = p4a.A06;
        O82 o82 = p4a.A08;
        C14360o3.A0B(enumC61217RhH, 1);
        C14360o3.A0B(o82, 2);
        int ordinal = enumC61217RhH.ordinal();
        if (ordinal != 5) {
            if (ordinal == 4) {
                Integer num = c51728Mt5.A06;
                if (num != null) {
                    int intValue = num.intValue();
                    ODA oda = c54974OTg.A02;
                    ConstraintLayout constraintLayout = oda.A02;
                    constraintLayout.setVisibility(0);
                    ViewOnClickListenerC55455Ok9.A01(constraintLayout, 48, o82);
                    AbstractC166987dD.A1P(c54974OTg.A00, oda.A04, intValue);
                    oda.A00.setVisibility(0);
                }
                String str = c51728Mt5.A07;
                if (str != null) {
                    C54974OTg.A00(c54974OTg, c51728Mt5.A05, str, AbstractC166997dE.A1Z(c51728Mt5.A03, true));
                }
                imageUrl = c51728Mt5.A00;
                if (imageUrl != null) {
                    view = c54974OTg.A02.A01;
                    i = R.id.left_thumbnail_image;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            Integer num2 = c51728Mt5.A06;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                ODA oda2 = c54974OTg.A02;
                ConstraintLayout constraintLayout2 = oda2.A02;
                constraintLayout2.setVisibility(0);
                ViewOnClickListenerC55455Ok9.A01(constraintLayout2, 48, o82);
                AbstractC166987dD.A1P(c54974OTg.A00, oda2.A04, intValue2);
                oda2.A00.setVisibility(0);
            }
            String str2 = c51728Mt5.A07;
            if (str2 != null) {
                C54974OTg.A00(c54974OTg, c51728Mt5.A05, str2, AbstractC166997dE.A1Z(c51728Mt5.A03, true));
            }
            List list = c51728Mt5.A0A;
            if (list == null) {
                return;
            }
            view = c54974OTg.A02.A01;
            View A0c = AbstractC166987dD.A0c(view, R.id.right_image_pile_container);
            if (list.size() >= 2) {
                A0c.setVisibility(0);
                ImageUrlBase imageUrlBase = (ImageUrlBase) AbstractC001800i.A0O(list, 1);
                if (imageUrlBase != null) {
                    AbstractC31172DnG.A0a(view, R.id.image_pile_second).setUrl(imageUrlBase, c54974OTg.A01);
                }
                imageUrl = (ImageUrlBase) AbstractC001800i.A0O(list, 0);
                if (imageUrl == null) {
                    return;
                } else {
                    i = R.id.image_pile_first;
                }
            } else {
                A0c.setVisibility(8);
                return;
            }
        }
        AbstractC31172DnG.A0a(view, i).setUrl(imageUrl, c54974OTg.A01);
    }
}
