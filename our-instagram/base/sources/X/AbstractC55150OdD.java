package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Locale;

/* renamed from: X.OdD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55150OdD {
    public static final String A00(Context context, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, List list, boolean z) {
        int i;
        String Ai2;
        if (brandedContentProjectMetadataIntf != null && (Ai2 = brandedContentProjectMetadataIntf.Ai2()) != null && brandedContentProjectMetadataIntf.AYK() != BrandedContentProjectAction.A06) {
            return Ai2;
        }
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                return ((BrandedContentTag) list.get(0)).A02;
            }
            i = 2131975824;
        } else if (z) {
            i = 2131968953;
        } else {
            return "";
        }
        return AbstractC166997dE.A0p(context, i);
    }

    public static final void A01(TextView textView) {
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setMarqueeRepeatLimit(-1);
        textView.setHorizontalFadingEdgeEnabled(true);
        textView.setSelected(true);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            textView.setHorizontallyScrolling(true);
        }
    }

    public static final void A02(C25621Ms c25621Ms, BrandedContentGatingInfoIntf brandedContentGatingInfoIntf) {
        if (brandedContentGatingInfoIntf != null) {
            try {
                StringWriter A0O = AbstractC37300Gc1.A0O();
                C17z A0O2 = MSW.A0O(A0O);
                AbstractC41243INj.A00(A0O2, brandedContentGatingInfoIntf.ErN());
                c25621Ms.A9s("media_gating_info", MSY.A0e(A0O2, A0O));
            } catch (IOException e) {
                C0K8.A0F("Branded content gating edit error", "Unable to convert gating info to json", e);
            }
        }
    }

    public static final void A03(C25621Ms c25621Ms, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf) {
        if (brandedContentProjectMetadataIntf != null) {
            try {
                StringWriter A0O = AbstractC37300Gc1.A0O();
                C17z A0O2 = MSW.A0O(A0O);
                ONL.A00(A0O2, brandedContentProjectMetadataIntf.ErO());
                c25621Ms.A9s("branded_content_project_metadata", MSY.A0e(A0O2, A0O));
            } catch (IOException e) {
                C0K8.A0F("Branded Content Edit error", "Unable to convert branded content project metadata to json", e);
            }
        }
    }

    public static final void A04(C25621Ms c25621Ms, UserSession userSession, List list, List list2, boolean z) {
        if (C4A4.A00(userSession)) {
            c25621Ms.A0I("is_paid_partnership", z);
            if (list == null) {
                try {
                    list = C16930sl.A00;
                } catch (IOException e) {
                    C0K8.A0F("Branded Content Edit error", "Unable to convert branded content tags to json", e);
                    return;
                }
            }
            if (list2 == null) {
                list2 = C16930sl.A00;
            }
            c25621Ms.A9s("sponsor_tags", AbstractC172137li.A02(list, list2));
        }
    }
}
