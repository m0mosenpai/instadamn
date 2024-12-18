package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.GfU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37512GfU {
    public final Context A00;

    public C37512GfU(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    public static final View A00(ViewGroup viewGroup) {
        View A0D = AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_feed_scheduled_content_publish_time, false);
        A0D.setTag(new C38439GvM(A0D));
        return A0D;
    }

    public final void A01(C38439GvM c38439GvM, int i) {
        C14360o3.A0B(c38439GvM, 0);
        long j = i * 1000;
        TextView textView = c38439GvM.A01;
        Context context = this.A00;
        AbstractC31177DnL.A0r(context, textView, new SimpleDateFormat("EEE, LLL d, h:mm a z", Locale.US).format(new Date(j)), 2131956772);
        if (Calendar.getInstance().getTimeInMillis() > j) {
            AbstractC166987dD.A1O(context, textView, AbstractC53242c7.A03(context));
            ImageView imageView = c38439GvM.A00;
            imageView.setImageResource(R.drawable.instagram_error_pano_filled_24);
            AbstractC31173DnH.A11(context, imageView, AbstractC53242c7.A03(context));
        }
    }

    public final void A02(C38439GvM c38439GvM, C38321qM c38321qM) {
        Integer BqX;
        AbstractC167017dG.A1N(c38439GvM, c38321qM);
        JKD Ar6 = c38321qM.A0C.Ar6();
        if (Ar6 != null && (BqX = Ar6.BqX()) != null) {
            A01(c38439GvM, BqX.intValue());
        }
    }
}
