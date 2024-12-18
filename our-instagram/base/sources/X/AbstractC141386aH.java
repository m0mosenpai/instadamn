package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6aH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141386aH {
    public static final ArrayList A00(Context context, UserSession userSession, C105154oV c105154oV, C143786eM c143786eM, List list, boolean z) {
        C14360o3.A0B(c143786eM, 3);
        ArrayList arrayList = new ArrayList();
        String string = context.getString(2131953241);
        C14360o3.A07(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC13880nE.A0H(string));
        if (z) {
            AbstractC86593tX.A0M(context, spannableStringBuilder, userSession);
        }
        c143786eM.A00();
        TextView textView = c143786eM.A02;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
            ImageView imageView = c143786eM.A01;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.instagram_reels_filled_12);
                ViewGroup viewGroup = c143786eM.A00;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    ViewGroup viewGroup2 = c143786eM.A00;
                    if (viewGroup2 != null) {
                        arrayList.add(viewGroup2);
                        MusicOverlayStickerModel A06 = AbstractC101614hW.A06(list);
                        if (A06 != null) {
                            C92594Ct.A04(userSession, A06, c105154oV);
                            ViewGroup viewGroup3 = c105154oV.A01;
                            if (viewGroup3 != null) {
                                arrayList.add(viewGroup3);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        return arrayList;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A01(CreativeConfigIntf creativeConfigIntf) {
        if (creativeConfigIntf != null) {
            return AbstractC121575f6.A0B(creativeConfigIntf, EnumC138476Pd.A05);
        }
        return false;
    }
}
