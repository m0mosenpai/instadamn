package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.List;

/* renamed from: X.FZa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34888FZa {
    public static final List A00 = AbstractC16960so.A1Q(ChannelCreationSource.A0A, ChannelCreationSource.A0B, ChannelCreationSource.A03, ChannelCreationSource.A09, ChannelCreationSource.A0E, ChannelCreationSource.A05, ChannelCreationSource.A0C);

    public static final void A00(Bundle bundle, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        List list = A00;
        Parcelable parcelable = bundle.getParcelable("social_channel_creation_source");
        Parcelable parcelable2 = null;
        if (parcelable instanceof ChannelCreationSource) {
            parcelable2 = parcelable;
        }
        if (AbstractC001800i.A0u(list, parcelable2)) {
            AbstractC31177DnL.A0o(fragmentActivity, bundle, userSession, str);
            return;
        }
        C140966Yy A0O = AbstractC31173DnH.A0O(bundle, abstractC59962oe, fragmentActivity, userSession);
        A0O.A0F = true;
        AbstractC31174DnI.A1L(A0O);
    }
}
