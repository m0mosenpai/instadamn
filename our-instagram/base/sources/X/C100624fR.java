package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.4fR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100624fR {
    public final C75563aN A00;

    public final Drawable A00(Context context, C76853cX c76853cX, String str) {
        C9BV c9bv;
        InterfaceC31132DmF AoZ;
        List Aoa;
        C14360o3.A0B(str, 2);
        InterfaceC76583c3 interfaceC76583c3 = c76853cX.A0D;
        if (!C9BV.A00(interfaceC76583c3, 1) || (c9bv = (C9BV) interfaceC76583c3) == null || (AoZ = c76853cX.A0A.A0C.AoZ()) == null || (Aoa = AoZ.Aoa()) == null || Aoa.isEmpty()) {
            return null;
        }
        return C57332k8.A03(context, context.getDrawable(R.drawable.instagram_reshare_pano_outline_16), Integer.valueOf(context.getColor(R.color.clips_spins_attribution_edit_icon_background_color)), str, (List) ((C51761Mtk) c9bv.A01).A00);
    }

    public C100624fR(C75563aN c75563aN) {
        this.A00 = c75563aN;
    }
}
