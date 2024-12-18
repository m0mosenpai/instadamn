package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class JVU {
    public final Context A00;
    public final InterfaceC09390do A08 = A00(R.drawable.instagram_video_chat_pano_filled_20);
    public final InterfaceC09390do A03 = A00(R.drawable.instagram_video_chat_incoming_pano_filled_20);
    public final InterfaceC09390do A07 = A00(R.drawable.instagram_video_chat_outgoing_pano_filled_20);
    public final InterfaceC09390do A05 = A00(R.drawable.instagram_video_chat_x_pano_filled_20);
    public final InterfaceC09390do A01 = A00(R.drawable.instagram_call_filled_20);
    public final InterfaceC09390do A02 = A00(R.drawable.instagram_call_incoming_pano_filled_20);
    public final InterfaceC09390do A06 = A00(R.drawable.instagram_call_outgoing_pano_filled_20);
    public final InterfaceC09390do A04 = A00(R.drawable.instagram_call_x_pano_filled_20);

    private final InterfaceC09390do A00(int i) {
        return AbstractC09440dt.A00(EnumC09460dv.A02, new C57249PbX(i, 28, this));
    }

    public final Drawable A01(boolean z, boolean z2, boolean z3, boolean z4) {
        InterfaceC09390do interfaceC09390do;
        if (z) {
            if (z4) {
                interfaceC09390do = this.A04;
            } else if (z3) {
                interfaceC09390do = this.A01;
            } else if (z2) {
                interfaceC09390do = this.A06;
            } else {
                interfaceC09390do = this.A02;
            }
        } else if (z4) {
            interfaceC09390do = this.A05;
        } else if (z3) {
            interfaceC09390do = this.A08;
        } else if (z2) {
            interfaceC09390do = this.A07;
        } else {
            interfaceC09390do = this.A03;
        }
        return AbstractC166987dD.A0a(interfaceC09390do);
    }

    public JVU(Context context) {
        this.A00 = context;
    }
}
