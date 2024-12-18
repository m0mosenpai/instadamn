package X;

import android.os.Bundle;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;

/* renamed from: X.G1l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36333G1l implements GXQ {
    public final ChannelCreationFlowExtraArgs A00;

    @Override // X.GXQ
    public final void Cq8(Bundle bundle) {
        String str;
        C14360o3.A0B(bundle, 0);
        ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = this.A00;
        bundle.putParcelable("direct_channel_creation_flow_extra_args", channelCreationFlowExtraArgs);
        String str2 = channelCreationFlowExtraArgs.A01;
        if (str2 != null && (str = channelCreationFlowExtraArgs.A02) != null) {
            bundle.putString("school_social_channel_school_fbid", str2);
            bundle.putString("school_social_channel_school_name", str);
        }
    }

    public C36333G1l(ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs) {
        this.A00 = channelCreationFlowExtraArgs;
    }
}
