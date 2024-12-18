package X;

import android.os.Bundle;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* loaded from: classes6.dex */
public final class G1j implements GXQ {
    public final ChannelCreationSource A00;

    @Override // X.GXQ
    public final void Cq8(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        bundle.putParcelable("social_channel_creation_source", this.A00);
    }

    public G1j(ChannelCreationSource channelCreationSource) {
        this.A00 = channelCreationSource;
    }
}
